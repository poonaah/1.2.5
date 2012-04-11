// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            RenderLiving, EntityWolf, ModelBase, EntityLiving, 
//            Entity

public class RenderWolf extends RenderLiving
{

    public RenderWolf(ModelBase p_i179_1_, float p_i179_2_)
    {
        super(p_i179_1_, p_i179_2_);
    }

    public void func_25005_a(EntityWolf p_25005_1_, double p_25005_2_, double p_25005_4_, double p_25005_6_, 
            float p_25005_8_, float p_25005_9_)
    {
        super.func_171_a(p_25005_1_, p_25005_2_, p_25005_4_, p_25005_6_, p_25005_8_, p_25005_9_);
    }

    protected float func_25004_a(EntityWolf p_25004_1_, float p_25004_2_)
    {
        return p_25004_1_.func_25037_z();
    }

    protected void func_25006_b(EntityWolf entitywolf, float f)
    {
    }

    protected void func_6330_a(EntityLiving p_6330_1_, float p_6330_2_)
    {
        func_25006_b((EntityWolf)p_6330_1_, p_6330_2_);
    }

    protected float func_170_d(EntityLiving p_170_1_, float p_170_2_)
    {
        return func_25004_a((EntityWolf)p_170_1_, p_170_2_);
    }

    public void func_171_a(EntityLiving p_171_1_, double p_171_2_, double p_171_4_, double p_171_6_, 
            float p_171_8_, float p_171_9_)
    {
        func_25005_a((EntityWolf)p_171_1_, p_171_2_, p_171_4_, p_171_6_, p_171_8_, p_171_9_);
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_25005_a((EntityWolf)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
