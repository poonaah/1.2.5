// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, ModelVillager, EntityVillager, EntityLiving, 
//            Entity

public class RenderVillager extends RenderLiving
{

    protected ModelVillager field_40295_c;

    public RenderVillager()
    {
        super(new ModelVillager(0.0F), 0.5F);
        field_40295_c = (ModelVillager)field_20920_e;
    }

    protected int func_40293_a(EntityVillager p_40293_1_, int p_40293_2_, float p_40293_3_)
    {
        return -1;
    }

    public void func_40294_a(EntityVillager p_40294_1_, double p_40294_2_, double p_40294_4_, double p_40294_6_, 
            float p_40294_8_, float p_40294_9_)
    {
        super.func_171_a(p_40294_1_, p_40294_2_, p_40294_4_, p_40294_6_, p_40294_8_, p_40294_9_);
    }

    protected void func_40290_a(EntityVillager entityvillager, double d, double d1, double d2)
    {
    }

    protected void func_40291_a(EntityVillager p_40291_1_, float p_40291_2_)
    {
        super.func_6331_b(p_40291_1_, p_40291_2_);
    }

    protected void func_40292_b(EntityVillager p_40292_1_, float p_40292_2_)
    {
        float f = 0.9375F;
        if(p_40292_1_.func_48123_at() < 0)
        {
            f = (float)((double)f * 0.5D);
            field_9246_c = 0.25F;
        } else
        {
            field_9246_c = 0.5F;
        }
        GL11.glScalef(f, f, f);
    }

    protected void func_22014_a(EntityLiving p_22014_1_, double p_22014_2_, double p_22014_4_, double p_22014_6_)
    {
        func_40290_a((EntityVillager)p_22014_1_, p_22014_2_, p_22014_4_, p_22014_6_);
    }

    protected void func_6330_a(EntityLiving p_6330_1_, float p_6330_2_)
    {
        func_40292_b((EntityVillager)p_6330_1_, p_6330_2_);
    }

    protected int func_166_a(EntityLiving p_166_1_, int p_166_2_, float p_166_3_)
    {
        return func_40293_a((EntityVillager)p_166_1_, p_166_2_, p_166_3_);
    }

    protected void func_6331_b(EntityLiving p_6331_1_, float p_6331_2_)
    {
        func_40291_a((EntityVillager)p_6331_1_, p_6331_2_);
    }

    public void func_171_a(EntityLiving p_171_1_, double p_171_2_, double p_171_4_, double p_171_6_, 
            float p_171_8_, float p_171_9_)
    {
        func_40294_a((EntityVillager)p_171_1_, p_171_2_, p_171_4_, p_171_6_, p_171_8_, p_171_9_);
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_40294_a((EntityVillager)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
