// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            RenderLiving, ModelBlaze, EntityBlaze, EntityLiving, 
//            Entity

public class RenderBlaze extends RenderLiving
{

    private int field_40278_c;

    public RenderBlaze()
    {
        super(new ModelBlaze(), 0.5F);
        field_40278_c = ((ModelBlaze)field_20920_e).func_40321_a();
    }

    public void func_40277_a(EntityBlaze p_40277_1_, double p_40277_2_, double p_40277_4_, double p_40277_6_, 
            float p_40277_8_, float p_40277_9_)
    {
        int i = ((ModelBlaze)field_20920_e).func_40321_a();
        if(i != field_40278_c)
        {
            field_40278_c = i;
            field_20920_e = new ModelBlaze();
        }
        super.func_171_a(p_40277_1_, p_40277_2_, p_40277_4_, p_40277_6_, p_40277_8_, p_40277_9_);
    }

    public void func_171_a(EntityLiving p_171_1_, double p_171_2_, double p_171_4_, double p_171_6_, 
            float p_171_8_, float p_171_9_)
    {
        func_40277_a((EntityBlaze)p_171_1_, p_171_2_, p_171_4_, p_171_6_, p_171_8_, p_171_9_);
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_40277_a((EntityBlaze)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
