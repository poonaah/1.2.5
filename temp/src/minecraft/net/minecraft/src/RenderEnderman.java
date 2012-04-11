// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, ModelEnderman, EntityEnderman, OpenGlHelper, 
//            Block, RenderBlocks, EntityLiving, Entity

public class RenderEnderman extends RenderLiving
{

    private ModelEnderman field_35444_c;
    private Random field_35445_h;

    public RenderEnderman()
    {
        super(new ModelEnderman(), 0.5F);
        field_35445_h = new Random();
        field_35444_c = (ModelEnderman)super.field_20920_e;
        func_4013_a(field_35444_c);
    }

    public void func_35442_a(EntityEnderman p_35442_1_, double p_35442_2_, double p_35442_4_, double p_35442_6_, 
            float p_35442_8_, float p_35442_9_)
    {
        field_35444_c.field_35407_a = p_35442_1_.func_35176_r() > 0;
        field_35444_c.field_35406_b = p_35442_1_.field_35187_a;
        if(p_35442_1_.field_35187_a)
        {
            double d = 0.02D;
            p_35442_2_ += field_35445_h.nextGaussian() * d;
            p_35442_6_ += field_35445_h.nextGaussian() * d;
        }
        super.func_171_a(p_35442_1_, p_35442_2_, p_35442_4_, p_35442_6_, p_35442_8_, p_35442_9_);
    }

    protected void func_35443_a(EntityEnderman p_35443_1_, float p_35443_2_)
    {
        super.func_6331_b(p_35443_1_, p_35443_2_);
        if(p_35443_1_.func_35176_r() > 0)
        {
            GL11.glEnable(32826);
            GL11.glPushMatrix();
            float f = 0.5F;
            GL11.glTranslatef(0.0F, 0.6875F, -0.75F);
            f *= 1.0F;
            GL11.glRotatef(20F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(f, -f, f);
            int i = p_35443_1_.func_35115_a(p_35443_2_);
            int j = i % 0x10000;
            int k = i / 0x10000;
            OpenGlHelper.func_40454_a(OpenGlHelper.field_40455_b, (float)j / 1.0F, (float)k / 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            func_151_a("/terrain.png");
            field_203_d.func_1227_a(Block.field_345_n[p_35443_1_.func_35176_r()], p_35443_1_.func_35180_s(), 1.0F);
            GL11.glPopMatrix();
            GL11.glDisable(32826);
        }
    }

    protected int func_35441_a(EntityEnderman p_35441_1_, int p_35441_2_, float p_35441_3_)
    {
        if(p_35441_2_ != 0)
        {
            return -1;
        } else
        {
            func_151_a("/mob/enderman_eyes.png");
            float f = 1.0F;
            GL11.glEnable(3042);
            GL11.glDisable(3008);
            GL11.glBlendFunc(1, 1);
            GL11.glDisable(2896);
            int i = 61680;
            int j = i % 0x10000;
            int k = i / 0x10000;
            OpenGlHelper.func_40454_a(OpenGlHelper.field_40455_b, (float)j / 1.0F, (float)k / 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glEnable(2896);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, f);
            return 1;
        }
    }

    protected int func_166_a(EntityLiving p_166_1_, int p_166_2_, float p_166_3_)
    {
        return func_35441_a((EntityEnderman)p_166_1_, p_166_2_, p_166_3_);
    }

    protected void func_6331_b(EntityLiving p_6331_1_, float p_6331_2_)
    {
        func_35443_a((EntityEnderman)p_6331_1_, p_6331_2_);
    }

    public void func_171_a(EntityLiving p_171_1_, double p_171_2_, double p_171_4_, double p_171_6_, 
            float p_171_8_, float p_171_9_)
    {
        func_35442_a((EntityEnderman)p_171_1_, p_171_2_, p_171_4_, p_171_6_, p_171_8_, p_171_9_);
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_35442_a((EntityEnderman)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
