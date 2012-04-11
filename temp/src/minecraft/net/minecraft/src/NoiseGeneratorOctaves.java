// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            NoiseGenerator, NoiseGeneratorPerlin, MathHelper

public class NoiseGeneratorOctaves extends NoiseGenerator
{

    private NoiseGeneratorPerlin field_1192_a[];
    private int field_1191_b;

    public NoiseGeneratorOctaves(Random p_i498_1_, int p_i498_2_)
    {
        field_1191_b = p_i498_2_;
        field_1192_a = new NoiseGeneratorPerlin[p_i498_2_];
        for(int i = 0; i < p_i498_2_; i++)
        {
            field_1192_a[i] = new NoiseGeneratorPerlin(p_i498_1_);
        }

    }

    public double[] func_807_a(double p_807_1_[], int p_807_2_, int p_807_3_, int p_807_4_, int p_807_5_, int p_807_6_, int p_807_7_, 
            double p_807_8_, double p_807_10_, double p_807_12_)
    {
        if(p_807_1_ == null)
        {
            p_807_1_ = new double[p_807_5_ * p_807_6_ * p_807_7_];
        } else
        {
            for(int i = 0; i < p_807_1_.length; i++)
            {
                p_807_1_[i] = 0.0D;
            }

        }
        double d = 1.0D;
        for(int j = 0; j < field_1191_b; j++)
        {
            double d1 = (double)p_807_2_ * d * p_807_8_;
            double d2 = (double)p_807_3_ * d * p_807_10_;
            double d3 = (double)p_807_4_ * d * p_807_12_;
            long l = MathHelper.func_35599_c(d1);
            long l1 = MathHelper.func_35599_c(d3);
            d1 -= l;
            d3 -= l1;
            l %= 0x1000000L;
            l1 %= 0x1000000L;
            d1 += l;
            d3 += l1;
            field_1192_a[j].func_805_a(p_807_1_, d1, d2, d3, p_807_5_, p_807_6_, p_807_7_, p_807_8_ * d, p_807_10_ * d, p_807_12_ * d, d);
            d /= 2D;
        }

        return p_807_1_;
    }

    public double[] func_4109_a(double p_4109_1_[], int p_4109_2_, int p_4109_3_, int p_4109_4_, int p_4109_5_, double p_4109_6_, 
            double p_4109_8_, double p_4109_10_)
    {
        return func_807_a(p_4109_1_, p_4109_2_, 10, p_4109_3_, p_4109_4_, 1, p_4109_5_, p_4109_6_, 1.0D, p_4109_8_);
    }
}
