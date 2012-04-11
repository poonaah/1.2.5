// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Potion

public class PotionHealth extends Potion
{

    public PotionHealth(int p_i153_1_, boolean p_i153_2_, int p_i153_3_)
    {
        super(p_i153_1_, p_i153_2_, p_i153_3_);
    }

    public boolean func_40622_b()
    {
        return true;
    }

    public boolean func_35660_a(int p_35660_1_, int p_35660_2_)
    {
        return p_35660_1_ >= 1;
    }
}
