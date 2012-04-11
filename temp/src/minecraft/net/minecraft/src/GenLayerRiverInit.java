// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache

public class GenLayerRiverInit extends GenLayer
{

    public GenLayerRiverInit(long p_i401_1_, GenLayer p_i401_3_)
    {
        super(p_i401_1_);
        field_35504_a = p_i401_3_;
    }

    public int[] func_35500_a(int p_35500_1_, int p_35500_2_, int p_35500_3_, int p_35500_4_)
    {
        int ai[] = field_35504_a.func_35500_a(p_35500_1_, p_35500_2_, p_35500_3_, p_35500_4_);
        int ai1[] = IntCache.func_35267_a(p_35500_3_ * p_35500_4_);
        for(int i = 0; i < p_35500_4_; i++)
        {
            for(int j = 0; j < p_35500_3_; j++)
            {
                func_35499_a(j + p_35500_1_, i + p_35500_2_);
                ai1[j + i * p_35500_3_] = ai[j + i * p_35500_3_] <= 0 ? 0 : func_35498_a(2) + 2;
            }

        }

        return ai1;
    }
}
