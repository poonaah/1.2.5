// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            IChunkProvider, NoiseGeneratorOctaves, Block, World, 
//            WorldChunkManager, Chunk, BiomeGenBase, MathHelper, 
//            BlockSand, IProgressUpdate, EnumCreatureType, ChunkPosition

public class ChunkProviderEnd
    implements IChunkProvider
{

    private Random field_40396_i;
    private NoiseGeneratorOctaves field_40393_j;
    private NoiseGeneratorOctaves field_40394_k;
    private NoiseGeneratorOctaves field_40391_l;
    public NoiseGeneratorOctaves field_40388_a;
    public NoiseGeneratorOctaves field_40386_b;
    private World field_40392_m;
    private double field_40389_n[];
    private BiomeGenBase field_40390_o[];
    double field_40387_c[];
    double field_40384_d[];
    double field_40385_e[];
    double field_40382_f[];
    double field_40383_g[];
    int field_40395_h[][];

    public ChunkProviderEnd(World p_i684_1_, long p_i684_2_)
    {
        field_40395_h = new int[32][32];
        field_40392_m = p_i684_1_;
        field_40396_i = new Random(p_i684_2_);
        field_40393_j = new NoiseGeneratorOctaves(field_40396_i, 16);
        field_40394_k = new NoiseGeneratorOctaves(field_40396_i, 16);
        field_40391_l = new NoiseGeneratorOctaves(field_40396_i, 8);
        field_40388_a = new NoiseGeneratorOctaves(field_40396_i, 10);
        field_40386_b = new NoiseGeneratorOctaves(field_40396_i, 16);
    }

    public void func_40380_a(int p_40380_1_, int p_40380_2_, byte p_40380_3_[], BiomeGenBase p_40380_4_[])
    {
        byte byte0 = 2;
        int i = byte0 + 1;
        byte byte1 = 33;
        int j = byte0 + 1;
        field_40389_n = func_40379_a(field_40389_n, p_40380_1_ * byte0, 0, p_40380_2_ * byte0, i, byte1, j);
        for(int k = 0; k < byte0; k++)
        {
            for(int l = 0; l < byte0; l++)
            {
                for(int i1 = 0; i1 < 32; i1++)
                {
                    double d = 0.25D;
                    double d1 = field_40389_n[((k + 0) * j + (l + 0)) * byte1 + (i1 + 0)];
                    double d2 = field_40389_n[((k + 0) * j + (l + 1)) * byte1 + (i1 + 0)];
                    double d3 = field_40389_n[((k + 1) * j + (l + 0)) * byte1 + (i1 + 0)];
                    double d4 = field_40389_n[((k + 1) * j + (l + 1)) * byte1 + (i1 + 0)];
                    double d5 = (field_40389_n[((k + 0) * j + (l + 0)) * byte1 + (i1 + 1)] - d1) * d;
                    double d6 = (field_40389_n[((k + 0) * j + (l + 1)) * byte1 + (i1 + 1)] - d2) * d;
                    double d7 = (field_40389_n[((k + 1) * j + (l + 0)) * byte1 + (i1 + 1)] - d3) * d;
                    double d8 = (field_40389_n[((k + 1) * j + (l + 1)) * byte1 + (i1 + 1)] - d4) * d;
                    for(int j1 = 0; j1 < 4; j1++)
                    {
                        double d9 = 0.125D;
                        double d10 = d1;
                        double d11 = d2;
                        double d12 = (d3 - d1) * d9;
                        double d13 = (d4 - d2) * d9;
                        for(int k1 = 0; k1 < 8; k1++)
                        {
                            int l1 = k1 + k * 8 << 11 | 0 + l * 8 << 7 | i1 * 4 + j1;
                            char c = '\200';
                            double d14 = 0.125D;
                            double d15 = d10;
                            double d16 = (d11 - d10) * d14;
                            for(int i2 = 0; i2 < 8; i2++)
                            {
                                int j2 = 0;
                                if(d15 > 0.0D)
                                {
                                    j2 = Block.field_40203_bK.field_376_bc;
                                }
                                p_40380_3_[l1] = (byte)j2;
                                l1 += c;
                                d15 += d16;
                            }

                            d10 += d12;
                            d11 += d13;
                        }

                        d1 += d5;
                        d2 += d6;
                        d3 += d7;
                        d4 += d8;
                    }

                }

            }

        }

    }

    public void func_40381_b(int p_40381_1_, int p_40381_2_, byte p_40381_3_[], BiomeGenBase p_40381_4_[])
    {
        for(int i = 0; i < 16; i++)
        {
            for(int j = 0; j < 16; j++)
            {
                int k = 1;
                int l = -1;
                byte byte0 = (byte)Block.field_40203_bK.field_376_bc;
                byte byte1 = (byte)Block.field_40203_bK.field_376_bc;
                for(int i1 = 127; i1 >= 0; i1--)
                {
                    int j1 = (j * 16 + i) * 128 + i1;
                    byte byte2 = p_40381_3_[j1];
                    if(byte2 == 0)
                    {
                        l = -1;
                        continue;
                    }
                    if(byte2 != Block.field_338_u.field_376_bc)
                    {
                        continue;
                    }
                    if(l == -1)
                    {
                        if(k <= 0)
                        {
                            byte0 = 0;
                            byte1 = (byte)Block.field_40203_bK.field_376_bc;
                        }
                        l = k;
                        if(i1 >= 0)
                        {
                            p_40381_3_[j1] = byte0;
                        } else
                        {
                            p_40381_3_[j1] = byte1;
                        }
                        continue;
                    }
                    if(l > 0)
                    {
                        l--;
                        p_40381_3_[j1] = byte1;
                    }
                }

            }

        }

    }

    public Chunk func_538_d(int p_538_1_, int p_538_2_)
    {
        return func_533_b(p_538_1_, p_538_2_);
    }

    public Chunk func_533_b(int p_533_1_, int p_533_2_)
    {
        field_40396_i.setSeed((long)p_533_1_ * 0x4f9939f508L + (long)p_533_2_ * 0x1ef1565bd5L);
        byte abyte0[] = new byte[32768];
        field_40390_o = field_40392_m.func_4075_a().func_4070_a(field_40390_o, p_533_1_ * 16, p_533_2_ * 16, 16, 16);
        func_40380_a(p_533_1_, p_533_2_, abyte0, field_40390_o);
        func_40381_b(p_533_1_, p_533_2_, abyte0, field_40390_o);
        Chunk chunk = new Chunk(field_40392_m, abyte0, p_533_1_, p_533_2_);
        byte abyte1[] = chunk.func_48493_m();
        for(int i = 0; i < abyte1.length; i++)
        {
            abyte1[i] = (byte)field_40390_o[i].field_35494_y;
        }

        chunk.func_1024_c();
        return chunk;
    }

    private double[] func_40379_a(double p_40379_1_[], int p_40379_2_, int p_40379_3_, int p_40379_4_, int p_40379_5_, int p_40379_6_, int p_40379_7_)
    {
        if(p_40379_1_ == null)
        {
            p_40379_1_ = new double[p_40379_5_ * p_40379_6_ * p_40379_7_];
        }
        double d = 684.41200000000003D;
        double d1 = 684.41200000000003D;
        field_40382_f = field_40388_a.func_4109_a(field_40382_f, p_40379_2_, p_40379_4_, p_40379_5_, p_40379_7_, 1.121D, 1.121D, 0.5D);
        field_40383_g = field_40386_b.func_4109_a(field_40383_g, p_40379_2_, p_40379_4_, p_40379_5_, p_40379_7_, 200D, 200D, 0.5D);
        d *= 2D;
        field_40387_c = field_40391_l.func_807_a(field_40387_c, p_40379_2_, p_40379_3_, p_40379_4_, p_40379_5_, p_40379_6_, p_40379_7_, d / 80D, d1 / 160D, d / 80D);
        field_40384_d = field_40393_j.func_807_a(field_40384_d, p_40379_2_, p_40379_3_, p_40379_4_, p_40379_5_, p_40379_6_, p_40379_7_, d, d1, d);
        field_40385_e = field_40394_k.func_807_a(field_40385_e, p_40379_2_, p_40379_3_, p_40379_4_, p_40379_5_, p_40379_6_, p_40379_7_, d, d1, d);
        int i = 0;
        int j = 0;
        for(int k = 0; k < p_40379_5_; k++)
        {
            for(int l = 0; l < p_40379_7_; l++)
            {
                double d2 = (field_40382_f[j] + 256D) / 512D;
                if(d2 > 1.0D)
                {
                    d2 = 1.0D;
                }
                double d3 = field_40383_g[j] / 8000D;
                if(d3 < 0.0D)
                {
                    d3 = -d3 * 0.29999999999999999D;
                }
                d3 = d3 * 3D - 2D;
                float f = (float)((k + p_40379_2_) - 0) / 1.0F;
                float f1 = (float)((l + p_40379_4_) - 0) / 1.0F;
                float f2 = 100F - MathHelper.func_1113_c(f * f + f1 * f1) * 8F;
                if(f2 > 80F)
                {
                    f2 = 80F;
                }
                if(f2 < -100F)
                {
                    f2 = -100F;
                }
                if(d3 > 1.0D)
                {
                    d3 = 1.0D;
                }
                d3 /= 8D;
                d3 = 0.0D;
                if(d2 < 0.0D)
                {
                    d2 = 0.0D;
                }
                d2 += 0.5D;
                d3 = (d3 * (double)p_40379_6_) / 16D;
                j++;
                double d4 = (double)p_40379_6_ / 2D;
                for(int i1 = 0; i1 < p_40379_6_; i1++)
                {
                    double d5 = 0.0D;
                    double d6 = (((double)i1 - d4) * 8D) / d2;
                    if(d6 < 0.0D)
                    {
                        d6 *= -1D;
                    }
                    double d7 = field_40384_d[i] / 512D;
                    double d8 = field_40385_e[i] / 512D;
                    double d9 = (field_40387_c[i] / 10D + 1.0D) / 2D;
                    if(d9 < 0.0D)
                    {
                        d5 = d7;
                    } else
                    if(d9 > 1.0D)
                    {
                        d5 = d8;
                    } else
                    {
                        d5 = d7 + (d8 - d7) * d9;
                    }
                    d5 -= 8D;
                    d5 += f2;
                    int j1 = 2;
                    if(i1 > p_40379_6_ / 2 - j1)
                    {
                        double d10 = (float)(i1 - (p_40379_6_ / 2 - j1)) / 64F;
                        if(d10 < 0.0D)
                        {
                            d10 = 0.0D;
                        }
                        if(d10 > 1.0D)
                        {
                            d10 = 1.0D;
                        }
                        d5 = d5 * (1.0D - d10) + -3000D * d10;
                    }
                    j1 = 8;
                    if(i1 < j1)
                    {
                        double d11 = (float)(j1 - i1) / ((float)j1 - 1.0F);
                        d5 = d5 * (1.0D - d11) + -30D * d11;
                    }
                    p_40379_1_[i] = d5;
                    i++;
                }

            }

        }

        return p_40379_1_;
    }

    public boolean func_537_a(int p_537_1_, int p_537_2_)
    {
        return true;
    }

    public void func_534_a(IChunkProvider p_534_1_, int p_534_2_, int p_534_3_)
    {
        BlockSand.field_466_a = true;
        int i = p_534_2_ * 16;
        int j = p_534_3_ * 16;
        BiomeGenBase biomegenbase = field_40392_m.func_48454_a(i + 16, j + 16);
        biomegenbase.func_35477_a(field_40392_m, field_40392_m.field_1037_n, i, j);
        BlockSand.field_466_a = false;
    }

    public boolean func_535_a(boolean p_535_1_, IProgressUpdate p_535_2_)
    {
        return true;
    }

    public boolean func_532_a()
    {
        return false;
    }

    public boolean func_536_b()
    {
        return true;
    }

    public String func_21109_c()
    {
        return "RandomLevelSource";
    }

    public List func_40377_a(EnumCreatureType p_40377_1_, int p_40377_2_, int p_40377_3_, int p_40377_4_)
    {
        BiomeGenBase biomegenbase = field_40392_m.func_48454_a(p_40377_2_, p_40377_4_);
        if(biomegenbase == null)
        {
            return null;
        } else
        {
            return biomegenbase.func_25063_a(p_40377_1_);
        }
    }

    public ChunkPosition func_40376_a(World p_40376_1_, String p_40376_2_, int p_40376_3_, int i, int j)
    {
        return null;
    }
}
