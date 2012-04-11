// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, ModelCreeper, EntityCreeper, MathHelper, 
//            ModelBase, EntityLiving

public class RenderCreeper extends RenderLiving
{

    private ModelBase field_27008_a;

    public RenderCreeper()
    {
        super(new ModelCreeper(), 0.5F);
        field_27008_a = new ModelCreeper(2.0F);
    }

    protected void func_184_a(EntityCreeper p_184_1_, float p_184_2_)
    {
        EntityCreeper entitycreeper = p_184_1_;
        float f = entitycreeper.func_440_b(p_184_2_);
        float f1 = 1.0F + MathHelper.func_1106_a(f * 100F) * f * 0.01F;
        if(f < 0.0F)
        {
            f = 0.0F;
        }
        if(f > 1.0F)
        {
            f = 1.0F;
        }
        f *= f;
        f *= f;
        float f2 = (1.0F + f * 0.4F) * f1;
        float f3 = (1.0F + f * 0.1F) / f1;
        GL11.glScalef(f2, f3, f2);
    }

    protected int func_183_a(EntityCreeper p_183_1_, float p_183_2_, float p_183_3_)
    {
        EntityCreeper entitycreeper = p_183_1_;
        float f = entitycreeper.func_440_b(p_183_3_);
        if((int)(f * 10F) % 2 == 0)
        {
            return 0;
        }
        int i = (int)(f * 0.2F * 255F);
        if(i < 0)
        {
            i = 0;
        }
        if(i > 255)
        {
            i = 255;
        }
        char c = '\377';
        char c1 = '\377';
        char c2 = '\377';
        return i << 24 | c << 16 | c1 << 8 | c2;
    }

    protected int func_27006_a(EntityCreeper p_27006_1_, int p_27006_2_, float p_27006_3_)
    {
        if(p_27006_1_.func_27022_s())
        {
            if(p_27006_2_ == 1)
            {
                float f = (float)p_27006_1_.field_9311_be + p_27006_3_;
                func_151_a("/armor/power.png");
                GL11.glMatrixMode(5890);
                GL11.glLoadIdentity();
                float f1 = f * 0.01F;
                float f2 = f * 0.01F;
                GL11.glTranslatef(f1, f2, 0.0F);
                func_4013_a(field_27008_a);
                GL11.glMatrixMode(5888);
                GL11.glEnable(3042);
                float f3 = 0.5F;
                GL11.glColor4f(f3, f3, f3, 1.0F);
                GL11.glDisable(2896);
                GL11.glBlendFunc(1, 1);
                return 1;
            }
            if(p_27006_2_ == 2)
            {
                GL11.glMatrixMode(5890);
                GL11.glLoadIdentity();
                GL11.glMatrixMode(5888);
                GL11.glEnable(2896);
                GL11.glDisable(3042);
            }
        }
        return -1;
    }

    protected int func_27007_b(EntityCreeper p_27007_1_, int p_27007_2_, float p_27007_3_)
    {
        return -1;
    }

    protected void func_6330_a(EntityLiving p_6330_1_, float p_6330_2_)
    {
        func_184_a((EntityCreeper)p_6330_1_, p_6330_2_);
    }

    protected int func_173_a(EntityLiving p_173_1_, float p_173_2_, float p_173_3_)
    {
        return func_183_a((EntityCreeper)p_173_1_, p_173_2_, p_173_3_);
    }

    protected int func_166_a(EntityLiving p_166_1_, int p_166_2_, float p_166_3_)
    {
        return func_27006_a((EntityCreeper)p_166_1_, p_166_2_, p_166_3_);
    }

    protected int func_27005_b(EntityLiving p_27005_1_, int p_27005_2_, float p_27005_3_)
    {
        return func_27007_b((EntityCreeper)p_27005_1_, p_27005_2_, p_27005_3_);
    }
}
