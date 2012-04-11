// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache

public class GenLayerIsland extends GenLayer
{

    public GenLayerIsland(long p_i77_1_)
    {
        super(p_i77_1_);
    }

    public int[] func_35500_a(int p_35500_1_, int p_35500_2_, int p_35500_3_, int p_35500_4_)
    {
        int ai[] = IntCache.func_35267_a(p_35500_3_ * p_35500_4_);
        for(int i = 0; i < p_35500_4_; i++)
        {
            for(int j = 0; j < p_35500_3_; j++)
            {
                func_35499_a(p_35500_1_ + j, p_35500_2_ + i);
                ai[j + i * p_35500_3_] = func_35498_a(10) != 0 ? 0 : 1;
            }

        }

        if(p_35500_1_ > -p_35500_3_ && p_35500_1_ <= 0 && p_35500_2_ > -p_35500_4_ && p_35500_2_ <= 0)
        {
            ai[-p_35500_1_ + -p_35500_2_ * p_35500_3_] = 1;
        }
        return ai;
    }
}
