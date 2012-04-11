// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayer, BiomeGenBase, WorldType, IntCache

public class GenLayerBiome extends GenLayer
{

    public static BiomeGenBase biomeArray[];
    private BiomeGenBase field_35509_b[];

    public GenLayerBiome(long p_i1011_1_, GenLayer p_i1011_3_, WorldType p_i1011_4_)
    {
        super(p_i1011_1_);
        field_35509_b = biomeArray;
        field_35504_a = p_i1011_3_;
        if(p_i1011_4_ == WorldType.field_48634_d)
        {
            field_35509_b = (new BiomeGenBase[] {
                BiomeGenBase.field_4249_h, BiomeGenBase.field_4253_d, BiomeGenBase.field_35483_e, BiomeGenBase.field_4255_b, BiomeGenBase.field_35485_c, BiomeGenBase.field_4250_g
            });
        }
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
                int k = ai[j + i * p_35500_3_];
                if(k == 0)
                {
                    ai1[j + i * p_35500_3_] = 0;
                } else
                if(k == BiomeGenBase.field_40262_p.field_35494_y)
                {
                    ai1[j + i * p_35500_3_] = k;
                } else
                if(k == 1)
                {
                    ai1[j + i * p_35500_3_] = field_35509_b[func_35498_a(field_35509_b.length)].field_35494_y;
                } else
                {
                    ai1[j + i * p_35500_3_] = BiomeGenBase.field_40257_n.field_35494_y;
                }
            }

        }

        return ai1;
    }

    static 
    {
        biomeArray = (new BiomeGenBase[] {
            BiomeGenBase.field_4249_h, BiomeGenBase.field_4253_d, BiomeGenBase.field_35483_e, BiomeGenBase.field_4255_b, BiomeGenBase.field_35485_c, BiomeGenBase.field_4250_g, BiomeGenBase.field_48416_w
        });
    }
}
