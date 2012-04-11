// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache

public class GenLayerVoronoiZoom extends GenLayer
{

    public GenLayerVoronoiZoom(long p_i770_1_, GenLayer p_i770_3_)
    {
        super(p_i770_1_);
        super.field_35504_a = p_i770_3_;
    }

    public int[] func_35500_a(int p_35500_1_, int p_35500_2_, int p_35500_3_, int p_35500_4_)
    {
        p_35500_1_ -= 2;
        p_35500_2_ -= 2;
        byte byte0 = 2;
        int i = 1 << byte0;
        int j = p_35500_1_ >> byte0;
        int k = p_35500_2_ >> byte0;
        int l = (p_35500_3_ >> byte0) + 3;
        int i1 = (p_35500_4_ >> byte0) + 3;
        int ai[] = field_35504_a.func_35500_a(j, k, l, i1);
        int j1 = l << byte0;
        int k1 = i1 << byte0;
        int ai1[] = IntCache.func_35267_a(j1 * k1);
        for(int l1 = 0; l1 < i1 - 1; l1++)
        {
            int i2 = ai[0 + (l1 + 0) * l];
            int k2 = ai[0 + (l1 + 1) * l];
            for(int l2 = 0; l2 < l - 1; l2++)
            {
                double d = (double)i * 0.90000000000000002D;
                func_35499_a(l2 + j << byte0, l1 + k << byte0);
                double d1 = ((double)func_35498_a(1024) / 1024D - 0.5D) * d;
                double d2 = ((double)func_35498_a(1024) / 1024D - 0.5D) * d;
                func_35499_a(l2 + j + 1 << byte0, l1 + k << byte0);
                double d3 = ((double)func_35498_a(1024) / 1024D - 0.5D) * d + (double)i;
                double d4 = ((double)func_35498_a(1024) / 1024D - 0.5D) * d;
                func_35499_a(l2 + j << byte0, l1 + k + 1 << byte0);
                double d5 = ((double)func_35498_a(1024) / 1024D - 0.5D) * d;
                double d6 = ((double)func_35498_a(1024) / 1024D - 0.5D) * d + (double)i;
                func_35499_a(l2 + j + 1 << byte0, l1 + k + 1 << byte0);
                double d7 = ((double)func_35498_a(1024) / 1024D - 0.5D) * d + (double)i;
                double d8 = ((double)func_35498_a(1024) / 1024D - 0.5D) * d + (double)i;
                int i3 = ai[l2 + 1 + (l1 + 0) * l];
                int j3 = ai[l2 + 1 + (l1 + 1) * l];
                for(int k3 = 0; k3 < i; k3++)
                {
                    int l3 = ((l1 << byte0) + k3) * j1 + (l2 << byte0);
                    for(int i4 = 0; i4 < i; i4++)
                    {
                        double d9 = ((double)k3 - d2) * ((double)k3 - d2) + ((double)i4 - d1) * ((double)i4 - d1);
                        double d10 = ((double)k3 - d4) * ((double)k3 - d4) + ((double)i4 - d3) * ((double)i4 - d3);
                        double d11 = ((double)k3 - d6) * ((double)k3 - d6) + ((double)i4 - d5) * ((double)i4 - d5);
                        double d12 = ((double)k3 - d8) * ((double)k3 - d8) + ((double)i4 - d7) * ((double)i4 - d7);
                        if(d9 < d10 && d9 < d11 && d9 < d12)
                        {
                            ai1[l3++] = i2;
                            continue;
                        }
                        if(d10 < d9 && d10 < d11 && d10 < d12)
                        {
                            ai1[l3++] = i3;
                            continue;
                        }
                        if(d11 < d9 && d11 < d10 && d11 < d12)
                        {
                            ai1[l3++] = k2;
                        } else
                        {
                            ai1[l3++] = j3;
                        }
                    }

                }

                i2 = i3;
                k2 = j3;
            }

        }

        int ai2[] = IntCache.func_35267_a(p_35500_3_ * p_35500_4_);
        for(int j2 = 0; j2 < p_35500_4_; j2++)
        {
            System.arraycopy(ai1, (j2 + (p_35500_2_ & i - 1)) * (l << byte0) + (p_35500_1_ & i - 1), ai2, j2 * p_35500_3_, p_35500_3_);
        }

        return ai2;
    }
}
