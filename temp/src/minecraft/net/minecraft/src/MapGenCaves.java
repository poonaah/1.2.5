// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            MapGenBase, MathHelper, Block, BlockGrass, 
//            World, BiomeGenBase

public class MapGenCaves extends MapGenBase
{

    public MapGenCaves()
    {
    }

    protected void func_870_a(long p_870_1_, int p_870_3_, int p_870_4_, byte p_870_5_[], double p_870_6_, 
            double p_870_8_, double p_870_10_)
    {
        func_869_a(p_870_1_, p_870_3_, p_870_4_, p_870_5_, p_870_6_, p_870_8_, p_870_10_, 1.0F + field_1305_b.nextFloat() * 6F, 0.0F, 0.0F, -1, -1, 0.5D);
    }

    protected void func_869_a(long p_869_1_, int p_869_3_, int p_869_4_, byte p_869_5_[], double p_869_6_, 
            double p_869_8_, double p_869_10_, float p_869_12_, float p_869_13_, float p_869_14_, 
            int p_869_15_, int p_869_16_, double p_869_17_)
    {
        double d = p_869_3_ * 16 + 8;
        double d1 = p_869_4_ * 16 + 8;
        float f = 0.0F;
        float f1 = 0.0F;
        Random random = new Random(p_869_1_);
        if(p_869_16_ <= 0)
        {
            int i = field_1306_a * 16 - 16;
            p_869_16_ = i - random.nextInt(i / 4);
        }
        boolean flag = false;
        if(p_869_15_ == -1)
        {
            p_869_15_ = p_869_16_ / 2;
            flag = true;
        }
        int j = random.nextInt(p_869_16_ / 2) + p_869_16_ / 4;
        boolean flag1 = random.nextInt(6) == 0;
        for(; p_869_15_ < p_869_16_; p_869_15_++)
        {
            double d2 = 1.5D + (double)(MathHelper.func_1106_a(((float)p_869_15_ * 3.141593F) / (float)p_869_16_) * p_869_12_ * 1.0F);
            double d3 = d2 * p_869_17_;
            float f2 = MathHelper.func_1114_b(p_869_14_);
            float f3 = MathHelper.func_1106_a(p_869_14_);
            p_869_6_ += MathHelper.func_1114_b(p_869_13_) * f2;
            p_869_8_ += f3;
            p_869_10_ += MathHelper.func_1106_a(p_869_13_) * f2;
            if(flag1)
            {
                p_869_14_ *= 0.92F;
            } else
            {
                p_869_14_ *= 0.7F;
            }
            p_869_14_ += f1 * 0.1F;
            p_869_13_ += f * 0.1F;
            f1 *= 0.9F;
            f *= 0.75F;
            f1 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0F;
            f += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4F;
            if(!flag && p_869_15_ == j && p_869_12_ > 1.0F && p_869_16_ > 0)
            {
                func_869_a(random.nextLong(), p_869_3_, p_869_4_, p_869_5_, p_869_6_, p_869_8_, p_869_10_, random.nextFloat() * 0.5F + 0.5F, p_869_13_ - 1.570796F, p_869_14_ / 3F, p_869_15_, p_869_16_, 1.0D);
                func_869_a(random.nextLong(), p_869_3_, p_869_4_, p_869_5_, p_869_6_, p_869_8_, p_869_10_, random.nextFloat() * 0.5F + 0.5F, p_869_13_ + 1.570796F, p_869_14_ / 3F, p_869_15_, p_869_16_, 1.0D);
                return;
            }
            if(!flag && random.nextInt(4) == 0)
            {
                continue;
            }
            double d4 = p_869_6_ - d;
            double d5 = p_869_10_ - d1;
            double d6 = p_869_16_ - p_869_15_;
            double d7 = p_869_12_ + 2.0F + 16F;
            if((d4 * d4 + d5 * d5) - d6 * d6 > d7 * d7)
            {
                return;
            }
            if(p_869_6_ < d - 16D - d2 * 2D || p_869_10_ < d1 - 16D - d2 * 2D || p_869_6_ > d + 16D + d2 * 2D || p_869_10_ > d1 + 16D + d2 * 2D)
            {
                continue;
            }
            d4 = MathHelper.func_1108_b(p_869_6_ - d2) - p_869_3_ * 16 - 1;
            int k = (MathHelper.func_1108_b(p_869_6_ + d2) - p_869_3_ * 16) + 1;
            d5 = MathHelper.func_1108_b(p_869_8_ - d3) - 1;
            int l = MathHelper.func_1108_b(p_869_8_ + d3) + 1;
            d6 = MathHelper.func_1108_b(p_869_10_ - d2) - p_869_4_ * 16 - 1;
            int i1 = (MathHelper.func_1108_b(p_869_10_ + d2) - p_869_4_ * 16) + 1;
            if(d4 < 0)
            {
                d4 = 0;
            }
            if(k > 16)
            {
                k = 16;
            }
            if(d5 < 1)
            {
                d5 = 1;
            }
            if(l > 120)
            {
                l = 120;
            }
            if(d6 < 0)
            {
                d6 = 0;
            }
            if(i1 > 16)
            {
                i1 = 16;
            }
            boolean flag2 = false;
            for(int j1 = d4; !flag2 && j1 < k; j1++)
            {
                for(int l1 = d6; !flag2 && l1 < i1; l1++)
                {
                    for(int i2 = l + 1; !flag2 && i2 >= d5 - 1; i2--)
                    {
                        int j2 = (j1 * 16 + l1) * 128 + i2;
                        if(i2 < 0 || i2 >= 128)
                        {
                            continue;
                        }
                        if(p_869_5_[j2] == Block.field_401_B.field_376_bc || p_869_5_[j2] == Block.field_399_C.field_376_bc)
                        {
                            flag2 = true;
                        }
                        if(i2 != d5 - 1 && j1 != d4 && j1 != k - 1 && l1 != d6 && l1 != i1 - 1)
                        {
                            i2 = d5;
                        }
                    }

                }

            }

            if(flag2)
            {
                continue;
            }
            for(int k1 = d4; k1 < k; k1++)
            {
                double d8 = (((double)(k1 + p_869_3_ * 16) + 0.5D) - p_869_6_) / d2;
label0:
                for(int k2 = d6; k2 < i1; k2++)
                {
                    double d9 = (((double)(k2 + p_869_4_ * 16) + 0.5D) - p_869_10_) / d2;
                    int l2 = (k1 * 16 + k2) * 128 + l;
                    boolean flag3 = false;
                    if(d8 * d8 + d9 * d9 >= 1.0D)
                    {
                        continue;
                    }
                    int i3 = l - 1;
                    do
                    {
                        if(i3 < d5)
                        {
                            continue label0;
                        }
                        double d10 = (((double)i3 + 0.5D) - p_869_8_) / d3;
                        if(d10 > -0.69999999999999996D && d8 * d8 + d10 * d10 + d9 * d9 < 1.0D)
                        {
                            byte byte0 = p_869_5_[l2];
                            if(byte0 == Block.field_337_v.field_376_bc)
                            {
                                flag3 = true;
                            }
                            if(byte0 == Block.field_338_u.field_376_bc || byte0 == Block.field_336_w.field_376_bc || byte0 == Block.field_337_v.field_376_bc)
                            {
                                if(i3 < 10)
                                {
                                    p_869_5_[l2] = (byte)Block.field_397_D.field_376_bc;
                                } else
                                {
                                    p_869_5_[l2] = 0;
                                    if(flag3 && p_869_5_[l2 - 1] == Block.field_336_w.field_376_bc)
                                    {
                                        p_869_5_[l2 - 1] = field_35625_d.func_48454_a(k1 + p_869_3_ * 16, k2 + p_869_4_ * 16).field_4242_o;
                                    }
                                }
                            }
                        }
                        l2--;
                        i3--;
                    } while(true);
                }

            }

            if(flag)
            {
                break;
            }
        }

    }

    protected void func_868_a(World p_868_1_, int p_868_2_, int p_868_3_, int p_868_4_, int p_868_5_, byte p_868_6_[])
    {
        int i = field_1305_b.nextInt(field_1305_b.nextInt(field_1305_b.nextInt(40) + 1) + 1);
        if(field_1305_b.nextInt(15) != 0)
        {
            i = 0;
        }
        for(int j = 0; j < i; j++)
        {
            double d = p_868_2_ * 16 + field_1305_b.nextInt(16);
            double d1 = field_1305_b.nextInt(field_1305_b.nextInt(120) + 8);
            double d2 = p_868_3_ * 16 + field_1305_b.nextInt(16);
            int k = 1;
            if(field_1305_b.nextInt(4) == 0)
            {
                func_870_a(field_1305_b.nextLong(), p_868_4_, p_868_5_, p_868_6_, d, d1, d2);
                k += field_1305_b.nextInt(4);
            }
            for(int l = 0; l < k; l++)
            {
                float f = field_1305_b.nextFloat() * 3.141593F * 2.0F;
                float f1 = ((field_1305_b.nextFloat() - 0.5F) * 2.0F) / 8F;
                float f2 = field_1305_b.nextFloat() * 2.0F + field_1305_b.nextFloat();
                if(field_1305_b.nextInt(10) == 0)
                {
                    f2 *= field_1305_b.nextFloat() * field_1305_b.nextFloat() * 3F + 1.0F;
                }
                func_869_a(field_1305_b.nextLong(), p_868_4_, p_868_5_, p_868_6_, d, d1, d2, f2, f, f1, 0, 0, 1.0D);
            }

        }

    }
}
