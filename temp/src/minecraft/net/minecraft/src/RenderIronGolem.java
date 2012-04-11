// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, ModelIronGolem, EntityIronGolem, ModelRenderer, 
//            OpenGlHelper, Block, RenderBlocks, EntityLiving, 
//            Entity

public class RenderIronGolem extends RenderLiving
{

    private ModelIronGolem field_48422_c;

    public RenderIronGolem()
    {
        super(new ModelIronGolem(), 0.5F);
        field_48422_c = (ModelIronGolem)field_20920_e;
    }

    public void func_48421_a(EntityIronGolem p_48421_1_, double p_48421_2_, double p_48421_4_, double p_48421_6_, 
            float p_48421_8_, float p_48421_9_)
    {
        super.func_171_a(p_48421_1_, p_48421_2_, p_48421_4_, p_48421_6_, p_48421_8_, p_48421_9_);
    }

    protected void func_48420_a(EntityIronGolem p_48420_1_, float p_48420_2_, float p_48420_3_, float p_48420_4_)
    {
        super.func_21004_a(p_48420_1_, p_48420_2_, p_48420_3_, p_48420_4_);
        if((double)p_48420_1_.field_704_R < 0.01D)
        {
            return;
        } else
        {
            float f = 13F;
            float f1 = (p_48420_1_.field_703_S - p_48420_1_.field_704_R * (1.0F - p_48420_4_)) + 6F;
            float f2 = (Math.abs(f1 % f - f * 0.5F) - f * 0.25F) / (f * 0.25F);
            GL11.glRotatef(6.5F * f2, 0.0F, 0.0F, 1.0F);
            return;
        }
    }

    protected void func_48419_a(EntityIronGolem p_48419_1_, float p_48419_2_)
    {
        super.func_6331_b(p_48419_1_, p_48419_2_);
        if(p_48419_1_.func_48117_D_() == 0)
        {
            return;
        } else
        {
            GL11.glEnable(32826);
            GL11.glPushMatrix();
            GL11.glRotatef(5F + (180F * field_48422_c.field_48233_c.field_1407_d) / 3.141593F, 1.0F, 0.0F, 0.0F);
            GL11.glTranslatef(-0.6875F, 1.25F, -0.9375F);
            GL11.glRotatef(90F, 1.0F, 0.0F, 0.0F);
            float f = 0.8F;
            GL11.glScalef(f, -f, f);
            int i = p_48419_1_.func_35115_a(p_48419_2_);
            int j = i % 0x10000;
            int k = i / 0x10000;
            OpenGlHelper.func_40454_a(OpenGlHelper.field_40455_b, (float)j / 1.0F, (float)k / 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            func_151_a("/terrain.png");
            field_203_d.func_1227_a(Block.field_416_af, 0, 1.0F);
            GL11.glPopMatrix();
            GL11.glDisable(32826);
            return;
        }
    }

    protected void func_6331_b(EntityLiving p_6331_1_, float p_6331_2_)
    {
        func_48419_a((EntityIronGolem)p_6331_1_, p_6331_2_);
    }

    protected void func_21004_a(EntityLiving p_21004_1_, float p_21004_2_, float p_21004_3_, float p_21004_4_)
    {
        func_48420_a((EntityIronGolem)p_21004_1_, p_21004_2_, p_21004_3_, p_21004_4_);
    }

    public void func_171_a(EntityLiving p_171_1_, double p_171_2_, double p_171_4_, double p_171_6_, 
            float p_171_8_, float p_171_9_)
    {
        func_48421_a((EntityIronGolem)p_171_1_, p_171_2_, p_171_4_, p_171_6_, p_171_8_, p_171_9_);
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_48421_a((EntityIronGolem)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
