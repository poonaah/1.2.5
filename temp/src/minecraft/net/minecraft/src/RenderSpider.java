// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, ModelSpider, OpenGlHelper, EntitySpider, 
//            EntityLiving

public class RenderSpider extends RenderLiving
{

    public RenderSpider()
    {
        super(new ModelSpider(), 1.0F);
        func_4013_a(new ModelSpider());
    }

    protected float func_191_a(EntitySpider p_191_1_)
    {
        return 180F;
    }

    protected int func_190_a(EntitySpider p_190_1_, int p_190_2_, float p_190_3_)
    {
        if(p_190_2_ != 0)
        {
            return -1;
        } else
        {
            func_151_a("/mob/spider_eyes.png");
            float f = 1.0F;
            GL11.glEnable(3042);
            GL11.glDisable(3008);
            GL11.glBlendFunc(1, 1);
            int i = 61680;
            int j = i % 0x10000;
            int k = i / 0x10000;
            OpenGlHelper.func_40454_a(OpenGlHelper.field_40455_b, (float)j / 1.0F, (float)k / 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, f);
            return 1;
        }
    }

    protected void func_35446_a(EntitySpider p_35446_1_, float p_35446_2_)
    {
        float f = p_35446_1_.func_35188_k_();
        GL11.glScalef(f, f, f);
    }

    protected void func_6330_a(EntityLiving p_6330_1_, float p_6330_2_)
    {
        func_35446_a((EntitySpider)p_6330_1_, p_6330_2_);
    }

    protected float func_172_a(EntityLiving p_172_1_)
    {
        return func_191_a((EntitySpider)p_172_1_);
    }

    protected int func_166_a(EntityLiving p_166_1_, int p_166_2_, float p_166_3_)
    {
        return func_190_a((EntitySpider)p_166_1_, p_166_2_, p_166_3_);
    }
}
