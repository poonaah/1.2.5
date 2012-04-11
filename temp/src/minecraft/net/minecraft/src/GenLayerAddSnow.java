// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache, BiomeGenBase

public class GenLayerAddSnow extends GenLayer
{

    public GenLayerAddSnow(long p_i614_1_, GenLayer p_i614_3_)
    {
        super(p_i614_1_);
        field_35504_a = p_i614_3_;
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
                int k1 = ai[j1 + 1 + (i1 + 1) * k];
                func_35499_a(j1 + p_35500_1_, i1 + p_35500_2_);
                if(k1 == 0)
                {
                    ai1[j1 + i1 * p_35500_3_] = 0;
                    continue;
                }
                int l1 = func_35498_a(5);
                if(l1 == 0)
                {
                    l1 = BiomeGenBase.field_40257_n.field_35494_y;
                } else
                {
                    l1 = 1;
                }
                ai1[j1 + i1 * p_35500_3_] = l1;
            }

        }

        return ai1;
    }
}
