// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache, BiomeGenBase

public class GenLayerAddMushroomIsland extends GenLayer
{

    public GenLayerAddMushroomIsland(long p_i355_1_, GenLayer p_i355_3_)
    {
        super(p_i355_1_);
        field_35504_a = p_i355_3_;
    }

    public int[] func_35500_a(int p_35500_1_, int p_35500_2_, int p_35500_3_, int p_35500_4_)
    {
        int i = p_35500_1_ - 1;
        int j = p_35500_2_ - 1;
        int k = p_35500_3_ + 2;
        int l = p_35500_4_ + 2;
        int ai[] = field_35504_a.func_35500_a(i, j, k, l);
        int ai1[] = IntCache.func_35267_a(p_35500_3_ * p_35500_4_);
        for(int i1 = 0; i1 < p_35500_4_; i1++)
        {
            for(int j1 = 0; j1 < p_35500_3_; j1++)
            {
                int k1 = ai[j1 + 0 + (i1 + 0) * k];
                int l1 = ai[j1 + 2 + (i1 + 0) * k];
                int i2 = ai[j1 + 0 + (i1 + 2) * k];
                int j2 = ai[j1 + 2 + (i1 + 2) * k];
                int k2 = ai[j1 + 1 + (i1 + 1) * k];
                func_35499_a(j1 + p_35500_1_, i1 + p_35500_2_);
                if(k2 == 0 && k1 == 0 && l1 == 0 && i2 == 0 && j2 == 0 && func_35498_a(100) == 0)
                {
                    ai1[j1 + i1 * p_35500_3_] = BiomeGenBase.field_40262_p.field_35494_y;
                } else
                {
                    ai1[j1 + i1 * p_35500_3_] = k2;
                }
            }

        }

        return ai1;
    }
}
