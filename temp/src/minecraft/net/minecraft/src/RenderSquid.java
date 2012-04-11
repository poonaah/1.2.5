// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, EntitySquid, ModelBase, EntityLiving, 
//            Entity

public class RenderSquid extends RenderLiving
{

    public RenderSquid(ModelBase p_i668_1_, float p_i668_2_)
    {
        super(p_i668_1_, p_i668_2_);
    }

    public void func_21008_a(EntitySquid p_21008_1_, double p_21008_2_, double p_21008_4_, double p_21008_6_, 
            float p_21008_8_, float p_21008_9_)
    {
        super.func_171_a(p_21008_1_, p_21008_2_, p_21008_4_, p_21008_6_, p_21008_8_, p_21008_9_);
    }

    protected void func_21007_a(EntitySquid p_21007_1_, float p_21007_2_, float p_21007_3_, float p_21007_4_)
    {
        float f = p_21007_1_.field_21088_b + (p_21007_1_.field_21089_a - p_21007_1_.field_21088_b) * p_21007_4_;
        float f1 = p_21007_1_.field_21086_f + (p_21007_1_.field_21087_c - p_21007_1_.field_21086_f) * p_21007_4_;
        GL11.glTranslatef(0.0F, 0.5F, 0.0F);
        GL11.glRotatef(180F - p_21007_3_, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(f, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(f1, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(0.0F, -1.2F, 0.0F);
    }

    protected void func_21005_a(EntitySquid entitysquid, float f)
    {
    }

    protected float func_21006_b(EntitySquid p_21006_1_, float p_21006_2_)
    {
        float f = p_21006_1_.field_21082_j + (p_21006_1_.field_21083_i - p_21006_1_.field_21082_j) * p_21006_2_;
        return f;
    }

    protected void func_6330_a(EntityLiving p_6330_1_, float p_6330_2_)
    {
        func_21005_a((EntitySquid)p_6330_1_, p_6330_2_);
    }

    protected float func_170_d(EntityLiving p_170_1_, float p_170_2_)
    {
        return func_21006_b((EntitySquid)p_170_1_, p_170_2_);
    }

    protected void func_21004_a(EntityLiving p_21004_1_, float p_21004_2_, float p_21004_3_, float p_21004_4_)
    {
        func_21007_a((EntitySquid)p_21004_1_, p_21004_2_, p_21004_3_, p_21004_4_);
    }

    public void func_171_a(EntityLiving p_171_1_, double p_171_2_, double p_171_4_, double p_171_6_, 
            float p_171_8_, float p_171_9_)
    {
        func_21008_a((EntitySquid)p_171_1_, p_171_2_, p_171_4_, p_171_6_, p_171_8_, p_171_9_);
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_21008_a((EntitySquid)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
