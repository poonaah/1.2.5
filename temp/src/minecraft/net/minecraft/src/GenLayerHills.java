// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache, BiomeGenBase

public class GenLayerHills extends GenLayer
{

    public GenLayerHills(long p_i229_1_, GenLayer p_i229_3_)
    {
        super(p_i229_1_);
        field_35504_a = p_i229_3_;
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
                if(func_35498_a(3) == 0)
                {
                    int l = k;
                    if(k == BiomeGenBase.field_4249_h.field_35494_y)
                    {
                        l = BiomeGenBase.field_46049_s.field_35494_y;
                    } else
                    if(k == BiomeGenBase.field_4253_d.field_35494_y)
                    {
                        l = BiomeGenBase.field_46048_t.field_35494_y;
                    } else
                    if(k == BiomeGenBase.field_4250_g.field_35494_y)
                    {
                        l = BiomeGenBase.field_46047_u.field_35494_y;
                    } else
                    if(k == BiomeGenBase.field_35485_c.field_35494_y)
                    {
                        l = BiomeGenBase.field_4253_d.field_35494_y;
                    } else
                    if(k == BiomeGenBase.field_40257_n.field_35494_y)
                    {
                        l = BiomeGenBase.field_40258_o.field_35494_y;
                    } else
                    if(k == BiomeGenBase.field_48416_w.field_35494_y)
                    {
                        l = BiomeGenBase.field_48417_x.field_35494_y;
                    }
                    if(l != k)
                    {
                        int i1 = ai[j + 1 + ((i + 1) - 1) * (p_35500_3_ + 2)];
                        int j1 = ai[j + 1 + 1 + (i + 1) * (p_35500_3_ + 2)];
                        int k1 = ai[((j + 1) - 1) + (i + 1) * (p_35500_3_ + 2)];
                        int l1 = ai[j + 1 + (i + 1 + 1) * (p_35500_3_ + 2)];
                        if(i1 == k && j1 == k && k1 == k && l1 == k)
                        {
                            ai1[j + i * p_35500_3_] = l;
                        } else
                        {
                            ai1[j + i * p_35500_3_] = k;
                        }
                    } else
                    {
                        ai1[j + i * p_35500_3_] = k;
                    }
                } else
                {
                    ai1[j + i * p_35500_3_] = k;
                }
            }

        }

        return ai1;
    }
}
