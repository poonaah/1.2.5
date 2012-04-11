// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache, BiomeGenBase

public class GenLayerSwampRivers extends GenLayer
{

    public GenLayerSwampRivers(long p_i162_1_, GenLayer p_i162_3_)
    {
        super(p_i162_1_);
        field_35504_a = p_i162_3_;
    }

    public int[] func_35500_a(int p_35500_1_, int p_35500_2_, int p_35500_3_, int p_35500_4_)
    {
        int ai[] = field_35504_a.func_35500_a(p_35500_1_ - 1, p_35500_2_ - 1, p_35500_3_ + 2, p_35500_4_ + 2);
        int ai1[] = IntCache.func_35267_a(p_35500_3_ * p_35500_4_);
        for(int i = 0; i < p_35500_4_; i++)
        {
            for(int j = 0; j < p_35500_3_; j++)
            {
                func_35499_a(j + p_35500_1_, i + p_35500_2_);
                int k = ai[j + 1 + (i + 1) * (p_35500_3_ + 2)];
                if(k == BiomeGenBase.field_4255_b.field_35494_y && func_35498_a(6) == 0)
                {
                    ai1[j + i * p_35500_3_] = BiomeGenBase.field_35487_i.field_35494_y;
                    continue;
                }
                if((k == BiomeGenBase.field_48416_w.field_35494_y || k == BiomeGenBase.field_48417_x.field_35494_y) && func_35498_a(8) == 0)
                {
                    ai1[j + i * p_35500_3_] = BiomeGenBase.field_35487_i.field_35494_y;
                } else
                {
                    ai1[j + i * p_35500_3_] = k;
                }
            }

        }

        return ai1;
    }
}
