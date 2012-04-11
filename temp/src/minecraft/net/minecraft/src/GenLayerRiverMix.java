// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, IntCache, BiomeGenBase

public class GenLayerRiverMix extends GenLayer
{

    private GenLayer field_35512_b;
    private GenLayer field_35513_c;

    public GenLayerRiverMix(long p_i181_1_, GenLayer p_i181_3_, GenLayer p_i181_4_)
    {
        super(p_i181_1_);
        field_35512_b = p_i181_3_;
        field_35513_c = p_i181_4_;
    }

    public void func_35496_b(long p_35496_1_)
    {
        field_35512_b.func_35496_b(p_35496_1_);
        field_35513_c.func_35496_b(p_35496_1_);
        super.func_35496_b(p_35496_1_);
    }

    public int[] func_35500_a(int p_35500_1_, int p_35500_2_, int p_35500_3_, int p_35500_4_)
    {
        int ai[] = field_35512_b.func_35500_a(p_35500_1_, p_35500_2_, p_35500_3_, p_35500_4_);
        int ai1[] = field_35513_c.func_35500_a(p_35500_1_, p_35500_2_, p_35500_3_, p_35500_4_);
        int ai2[] = IntCache.func_35267_a(p_35500_3_ * p_35500_4_);
        for(int i = 0; i < p_35500_3_ * p_35500_4_; i++)
        {
            if(ai[i] == BiomeGenBase.field_35484_b.field_35494_y)
            {
                ai2[i] = ai[i];
                continue;
            }
            if(ai1[i] >= 0)
            {
                if(ai[i] == BiomeGenBase.field_40257_n.field_35494_y)
                {
                    ai2[i] = BiomeGenBase.field_40260_m.field_35494_y;
                    continue;
                }
                if(ai[i] == BiomeGenBase.field_40262_p.field_35494_y || ai[i] == BiomeGenBase.field_40261_q.field_35494_y)
                {
                    ai2[i] = BiomeGenBase.field_40261_q.field_35494_y;
                } else
                {
                    ai2[i] = ai1[i];
                }
            } else
            {
                ai2[i] = ai[i];
            }
        }

        return ai2;
    }
}
