// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            RenderLiving, EntityPig, ModelBase, EntityLiving, 
//            Entity

public class RenderPig extends RenderLiving
{

    public RenderPig(ModelBase p_i381_1_, ModelBase p_i381_2_, float p_i381_3_)
    {
        super(p_i381_1_, p_i381_3_);
        func_4013_a(p_i381_2_);
    }

    protected int func_180_a(EntityPig p_180_1_, int p_180_2_, float p_180_3_)
    {
        func_151_a("/mob/saddle.png");
        return p_180_2_ != 0 || !p_180_1_.func_21068_q() ? -1 : 1;
    }

    public void func_40286_a(EntityPig p_40286_1_, double p_40286_2_, double p_40286_4_, double p_40286_6_, 
            float p_40286_8_, float p_40286_9_)
    {
        super.func_171_a(p_40286_1_, p_40286_2_, p_40286_4_, p_40286_6_, p_40286_8_, p_40286_9_);
    }

    protected int func_166_a(EntityLiving p_166_1_, int p_166_2_, float p_166_3_)
    {
        return func_180_a((EntityPig)p_166_1_, p_166_2_, p_166_3_);
    }

    public void func_171_a(EntityLiving p_171_1_, double p_171_2_, double p_171_4_, double p_171_6_, 
            float p_171_8_, float p_171_9_)
    {
        func_40286_a((EntityPig)p_171_1_, p_171_2_, p_171_4_, p_171_6_, p_171_8_, p_171_9_);
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_40286_a((EntityPig)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
