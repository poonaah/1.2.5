// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            RenderLiving, EntityChicken, MathHelper, ModelBase, 
//            EntityLiving, Entity

public class RenderChicken extends RenderLiving
{

    public RenderChicken(ModelBase p_i345_1_, float p_i345_2_)
    {
        super(p_i345_1_, p_i345_2_);
    }

    public void func_181_a(EntityChicken p_181_1_, double p_181_2_, double p_181_4_, double p_181_6_, 
            float p_181_8_, float p_181_9_)
    {
        super.func_171_a(p_181_1_, p_181_2_, p_181_4_, p_181_6_, p_181_8_, p_181_9_);
    }

    protected float func_182_a(EntityChicken p_182_1_, float p_182_2_)
    {
        float f = p_182_1_.field_756_e + (p_182_1_.field_752_b - p_182_1_.field_756_e) * p_182_2_;
        float f1 = p_182_1_.field_757_d + (p_182_1_.field_758_c - p_182_1_.field_757_d) * p_182_2_;
        return (MathHelper.func_1106_a(f) + 1.0F) * f1;
    }

    protected float func_170_d(EntityLiving p_170_1_, float p_170_2_)
    {
        return func_182_a((EntityChicken)p_170_1_, p_170_2_);
    }

    public void func_171_a(EntityLiving p_171_1_, double p_171_2_, double p_171_4_, double p_171_6_, 
            float p_171_8_, float p_171_9_)
    {
        func_181_a((EntityChicken)p_171_1_, p_171_2_, p_171_4_, p_171_6_, p_171_8_, p_171_9_);
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_181_a((EntityChicken)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
