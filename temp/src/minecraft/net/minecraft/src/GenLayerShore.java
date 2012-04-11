// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache, BiomeGenBase

public class GenLayerShore extends GenLayer
{

    public GenLayerShore(long p_i735_1_, GenLayer p_i735_3_)
    {
        super(p_i735_1_);
        field_35504_a = p_i735_3_;
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
                if(k == BiomeGenBase.field_40262_p.field_35494_y)
                {
                    int l = ai[j + 1 + ((i + 1) - 1) * (p_35500_3_ + 2)];
                    int k1 = ai[j + 1 + 1 + (i + 1) * (p_35500_3_ + 2)];
                    int j2 = ai[((j + 1) - 1) + (i + 1) * (p_35500_3_ + 2)];
                    int i3 = ai[j + 1 + (i + 1 + 1) * (p_35500_3_ + 2)];
                    if(l == BiomeGenBase.field_35484_b.field_35494_y || k1 == BiomeGenBase.field_35484_b.field_35494_y || j2 == BiomeGenBase.field_35484_b.field_35494_y || i3 == BiomeGenBase.field_35484_b.field_35494_y)
                    {
                        ai1[j + i * p_35500_3_] = BiomeGenBase.field_40261_q.field_35494_y;
                    } else
                    {
                        ai1[j + i * p_35500_3_] = k;
                    }
                    continue;
                }
                if(k != BiomeGenBase.field_35484_b.field_35494_y && k != BiomeGenBase.field_35487_i.field_35494_y && k != BiomeGenBase.field_4255_b.field_35494_y && k != BiomeGenBase.field_35483_e.field_35494_y)
                {
                    int i1 = ai[j + 1 + ((i + 1) - 1) * (p_35500_3_ + 2)];
                    int l1 = ai[j + 1 + 1 + (i + 1) * (p_35500_3_ + 2)];
                    int k2 = ai[((j + 1) - 1) + (i + 1) * (p_35500_3_ + 2)];
                    int j3 = ai[j + 1 + (i + 1 + 1) * (p_35500_3_ + 2)];
                    if(i1 == BiomeGenBase.field_35484_b.field_35494_y || l1 == BiomeGenBase.field_35484_b.field_35494_y || k2 == BiomeGenBase.field_35484_b.field_35494_y || j3 == BiomeGenBase.field_35484_b.field_35494_y)
                    {
                        ai1[j + i * p_35500_3_] = BiomeGenBase.field_46050_r.field_35494_y;
                    } else
                    {
                        ai1[j + i * p_35500_3_] = k;
                    }
                    continue;
                }
                if(k == BiomeGenBase.field_35483_e.field_35494_y)
                {
                    int j1 = ai[j + 1 + ((i + 1) - 1) * (p_35500_3_ + 2)];
                    int i2 = ai[j + 1 + 1 + (i + 1) * (p_35500_3_ + 2)];
                    int l2 = ai[((j + 1) - 1) + (i + 1) * (p_35500_3_ + 2)];
                    int k3 = ai[j + 1 + (i + 1 + 1) * (p_35500_3_ + 2)];
                    if(j1 != BiomeGenBase.field_35483_e.field_35494_y || i2 != BiomeGenBase.field_35483_e.field_35494_y || l2 != BiomeGenBase.field_35483_e.field_35494_y || k3 != BiomeGenBase.field_35483_e.field_35494_y)
                    {
                        ai1[j + i * p_35500_3_] = BiomeGenBase.field_46046_v.field_35494_y;
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
