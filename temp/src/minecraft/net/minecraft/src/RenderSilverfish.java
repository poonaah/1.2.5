// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            RenderLiving, ModelSilverfish, EntitySilverfish, EntityLiving, 
//            Entity

public class RenderSilverfish extends RenderLiving
{

    public RenderSilverfish()
    {
        super(new ModelSilverfish(), 0.3F);
    }

    protected float func_35447_a(EntitySilverfish p_35447_1_)
    {
        return 180F;
    }

    public void func_35448_a(EntitySilverfish p_35448_1_, double p_35448_2_, double p_35448_4_, double p_35448_6_, 
            float p_35448_8_, float p_35448_9_)
    {
        super.func_171_a(p_35448_1_, p_35448_2_, p_35448_4_, p_35448_6_, p_35448_8_, p_35448_9_);
    }

    protected int func_35449_a(EntitySilverfish p_35449_1_, int p_35449_2_, float p_35449_3_)
    {
        return -1;
    }

    protected float func_172_a(EntityLiving p_172_1_)
    {
        return func_35447_a((EntitySilverfish)p_172_1_);
    }

    protected int func_166_a(EntityLiving p_166_1_, int p_166_2_, float p_166_3_)
    {
        return func_35449_a((EntitySilverfish)p_166_1_, p_166_2_, p_166_3_);
    }

    public void func_171_a(EntityLiving p_171_1_, double p_171_2_, double p_171_4_, double p_171_6_, 
            float p_171_8_, float p_171_9_)
    {
        func_35448_a((EntitySilverfish)p_171_1_, p_171_2_, p_171_4_, p_171_6_, p_171_8_, p_171_9_);
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_35448_a((EntitySilverfish)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
