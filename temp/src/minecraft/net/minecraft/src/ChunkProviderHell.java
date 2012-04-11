// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            IChunkProvider, MapGenNetherBridge, MapGenCavesHell, NoiseGeneratorOctaves, 
//            Block, MapGenBase, Chunk, World, 
//            WorldChunkManager, BiomeGenBase, BlockSand, WorldGenHellLava, 
//            WorldGenFire, WorldGenGlowStone1, WorldGenGlowStone2, WorldGenFlowers, 
//            BlockFlower, EnumCreatureType, IProgressUpdate, ChunkPosition

public class ChunkProviderHell
    implements IChunkProvider
{

    private Random field_4170_h;
    private NoiseGeneratorOctaves field_4169_i;
    private NoiseGeneratorOctaves field_4168_j;
    private NoiseGeneratorOctaves field_4167_k;
    private NoiseGeneratorOctaves field_4166_l;
    private NoiseGeneratorOctaves field_4165_m;
    public NoiseGeneratorOctaves field_4177_a;
    public NoiseGeneratorOctaves field_4176_b;
    private World field_4164_n;
    private double field_4163_o[];
    public MapGenNetherBridge field_40378_c;
    private double field_4162_p[];
    private double field_4161_q[];
    private double field_4160_r[];
    private MapGenBase field_4159_s;
    double field_4175_c[];
    double field_4174_d[];
    double field_4173_e[];
    double field_4172_f[];
    double field_4171_g[];

    public ChunkProviderHell(World p_i98_1_, long p_i98_2_)
    {
        field_40378_c = new MapGenNetherBridge();
        field_4162_p = new double[256];
        field_4161_q = new double[256];
        field_4160_r = new double[256];
        field_4159_s = new MapGenCavesHell();
        field_4164_n = p_i98_1_;
        field_4170_h = new Random(p_i98_2_);
        field_4169_i = new NoiseGeneratorOctaves(field_4170_h, 16);
        field_4168_j = new NoiseGeneratorOctaves(field_4170_h, 16);
        field_4167_k = new NoiseGeneratorOctaves(field_4170_h, 8);
        field_4166_l = new NoiseGeneratorOctaves(field_4170_h, 4);
        field_4165_m = new NoiseGeneratorOctaves(field_4170_h, 4);
        field_4177_a = new NoiseGeneratorOctaves(field_4170_h, 10);
        field_4176_b = new NoiseGeneratorOctaves(field_4170_h, 16);
    }

    public void func_4059_a(int p_4059_1_, int p_4059_2_, byte p_4059_3_[])
    {
        byte byte0 = 4;
        byte byte1 = 32;
        int i = byte0 + 1;
        byte byte2 = 17;
        int j = byte0 + 1;
        field_4163_o = func_4057_a(field_4163_o, p_4059_1_ * byte0, 0, p_4059_2_ * byte0, i, byte2, j);
        for(int k = 0; k < byte0; k++)
        {
            for(int l = 0; l < byte0; l++)
            {
                for(int i1 = 0; i1 < 16; i1++)
                {
                    double d = 0.125D;
                    double d1 = field_4163_o[((k + 0) * j + (l + 0)) * byte2 + (i1 + 0)];
                    double d2 = field_4163_o[((k + 0) * j + (l + 1)) * byte2 + (i1 + 0)];
                    double d3 = field_4163_o[((k + 1) * j + (l + 0)) * byte2 + (i1 + 0)];
                    double d4 = field_4163_o[((k + 1) * j + (l + 1)) * byte2 + (i1 + 0)];
                    double d5 = (field_4163_o[((k + 0) * j + (l + 0)) * byte2 + (i1 + 1)] - d1) * d;
                    double d6 = (field_4163_o[((k + 0) * j + (l + 1)) * byte2 + (i1 + 1)] - d2) * d;
                    double d7 = (field_4163_o[((k + 1) * j + (l + 0)) * byte2 + (i1 + 1)] - d3) * d;
                    double d8 = (field_4163_o[((k + 1) * j + (l + 1)) * byte2 + (i1 + 1)] - d4) * d;
                    for(int j1 = 0; j1 < 8; j1++)
                    {
                        double d9 = 0.25D;
                        double d10 = d1;
                        double d11 = d2;
                        double d12 = (d3 - d1) * d9;
                        double d13 = (d4 - d2) * d9;
                        for(int k1 = 0; k1 < 4; k1++)
                        {
                            int l1 = k1 + k * 4 << 11 | 0 + l * 4 << 7 | i1 * 8 + j1;
                            char c = '\200';
                            double d14 = 0.25D;
                            double d15 = d10;
                            double d16 = (d11 - d10) * d14;
                            for(int i2 = 0; i2 < 4; i2++)
                            {
                                int j2 = 0;
                                if(i1 * 8 + j1 < byte1)
                                {
                                    j2 = Block.field_395_E.field_376_bc;
                                }
                                if(d15 > 0.0D)
                                {
                                    j2 = Block.field_4053_bc.field_376_bc;
                                }
                                p_4059_3_[l1] = (byte)j2;
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

    public void func_4058_b(int p_4058_1_, int p_4058_2_, byte p_4058_3_[])
    {
        byte byte0 = 64;
        double d = 0.03125D;
        field_4162_p = field_4166_l.func_807_a(field_4162_p, p_4058_1_ * 16, p_4058_2_ * 16, 0, 16, 16, 1, d, d, 1.0D);
        field_4161_q = field_4166_l.func_807_a(field_4161_q, p_4058_1_ * 16, 109, p_4058_2_ * 16, 16, 1, 16, d, 1.0D, d);
        field_4160_r = field_4165_m.func_807_a(field_4160_r, p_4058_1_ * 16, p_4058_2_ * 16, 0, 16, 16, 1, d * 2D, d * 2D, d * 2D);
        for(int i = 0; i < 16; i++)
        {
            for(int j = 0; j < 16; j++)
            {
                boolean flag = field_4162_p[i + j * 16] + field_4170_h.nextDouble() * 0.20000000000000001D > 0.0D;
                boolean flag1 = field_4161_q[i + j * 16] + field_4170_h.nextDouble() * 0.20000000000000001D > 0.0D;
                int k = (int)(field_4160_r[i + j * 16] / 3D + 3D + field_4170_h.nextDouble() * 0.25D);
                int l = -1;
                byte byte1 = (byte)Block.field_4053_bc.field_376_bc;
                byte byte2 = (byte)Block.field_4053_bc.field_376_bc;
                for(int i1 = 127; i1 >= 0; i1--)
                {
                    int j1 = (j * 16 + i) * 128 + i1;
                    if(i1 >= 127 - field_4170_h.nextInt(5))
                    {
                        p_4058_3_[j1] = (byte)Block.field_403_A.field_376_bc;
                        continue;
                    }
                    if(i1 <= 0 + field_4170_h.nextInt(5))
                    {
                        p_4058_3_[j1] = (byte)Block.field_403_A.field_376_bc;
                        continue;
                    }
                    byte byte3 = p_4058_3_[j1];
                    if(byte3 == 0)
                    {
                        l = -1;
                        continue;
                    }
                    if(byte3 != Block.field_4053_bc.field_376_bc)
                    {
                        continue;
                    }
                    if(l == -1)
                    {
                        if(k <= 0)
                        {
                            byte1 = 0;
                            byte2 = (byte)Block.field_4053_bc.field_376_bc;
                        } else
                        if(i1 >= byte0 - 4 && i1 <= byte0 + 1)
                        {
                            byte1 = (byte)Block.field_4053_bc.field_376_bc;
                            byte2 = (byte)Block.field_4053_bc.field_376_bc;
                            if(flag1)
                            {
                                byte1 = (byte)Block.field_392_G.field_376_bc;
                            }
                            if(flag1)
                            {
                                byte2 = (byte)Block.field_4053_bc.field_376_bc;
                            }
                            if(flag)
                            {
                                byte1 = (byte)Block.field_4051_bd.field_376_bc;
                            }
                            if(flag)
                            {
                                byte2 = (byte)Block.field_4051_bd.field_376_bc;
                            }
                        }
                        if(i1 < byte0 && byte1 == 0)
                        {
                            byte1 = (byte)Block.field_395_E.field_376_bc;
                        }
                        l = k;
                        if(i1 >= byte0 - 1)
                        {
                            p_4058_3_[j1] = byte1;
                        } else
                        {
                            p_4058_3_[j1] = byte2;
                        }
                        continue;
                    }
                    if(l > 0)
                    {
                        l--;
                        p_4058_3_[j1] = byte2;
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
        field_4170_h.setSeed((long)p_533_1_ * 0x4f9939f508L + (long)p_533_2_ * 0x1ef1565bd5L);
        byte abyte0[] = new byte[32768];
        func_4059_a(p_533_1_, p_533_2_, abyte0);
        func_4058_b(p_533_1_, p_533_2_, abyte0);
        field_4159_s.func_867_a(this, field_4164_n, p_533_1_, p_533_2_, abyte0);
        field_40378_c.func_867_a(this, field_4164_n, p_533_1_, p_533_2_, abyte0);
        Chunk chunk = new Chunk(field_4164_n, abyte0, p_533_1_, p_533_2_);
        BiomeGenBase abiomegenbase[] = field_4164_n.func_4075_a().func_4070_a(null, p_533_1_ * 16, p_533_2_ * 16, 16, 16);
        byte abyte1[] = chunk.func_48493_m();
        for(int i = 0; i < abyte1.length; i++)
        {
            abyte1[i] = (byte)abiomegenbase[i].field_35494_y;
        }

        chunk.func_48496_n();
        return chunk;
    }

    private double[] func_4057_a(double p_4057_1_[], int p_4057_2_, int p_4057_3_, int p_4057_4_, int p_4057_5_, int p_4057_6_, int p_4057_7_)
    {
        if(p_4057_1_ == null)
        {
            p_4057_1_ = new double[p_4057_5_ * p_4057_6_ * p_4057_7_];
        }
        double d = 684.41200000000003D;
        double d1 = 2053.2359999999999D;
        field_4172_f = field_4177_a.func_807_a(field_4172_f, p_4057_2_, p_4057_3_, p_4057_4_, p_4057_5_, 1, p_4057_7_, 1.0D, 0.0D, 1.0D);
        field_4171_g = field_4176_b.func_807_a(field_4171_g, p_4057_2_, p_4057_3_, p_4057_4_, p_4057_5_, 1, p_4057_7_, 100D, 0.0D, 100D);
        field_4175_c = field_4167_k.func_807_a(field_4175_c, p_4057_2_, p_4057_3_, p_4057_4_, p_4057_5_, p_4057_6_, p_4057_7_, d / 80D, d1 / 60D, d / 80D);
        field_4174_d = field_4169_i.func_807_a(field_4174_d, p_4057_2_, p_4057_3_, p_4057_4_, p_4057_5_, p_4057_6_, p_4057_7_, d, d1, d);
        field_4173_e = field_4168_j.func_807_a(field_4173_e, p_4057_2_, p_4057_3_, p_4057_4_, p_4057_5_, p_4057_6_, p_4057_7_, d, d1, d);
        int i = 0;
        int j = 0;
        double ad[] = new double[p_4057_6_];
        for(int k = 0; k < p_4057_6_; k++)
        {
            ad[k] = Math.cos(((double)k * 3.1415926535897931D * 6D) / (double)p_4057_6_) * 2D;
            double d2 = k;
            if(k > p_4057_6_ / 2)
            {
                d2 = p_4057_6_ - 1 - k;
            }
            if(d2 < 4D)
            {
                d2 = 4D - d2;
                ad[k] -= d2 * d2 * d2 * 10D;
            }
        }

        for(int l = 0; l < p_4057_5_; l++)
        {
            for(int i1 = 0; i1 < p_4057_7_; i1++)
            {
                double d3 = (field_4172_f[j] + 256D) / 512D;
                if(d3 > 1.0D)
                {
                    d3 = 1.0D;
                }
                double d4 = 0.0D;
                double d5 = field_4171_g[j] / 8000D;
                if(d5 < 0.0D)
                {
                    d5 = -d5;
                }
                d5 = d5 * 3D - 3D;
                if(d5 < 0.0D)
                {
                    d5 /= 2D;
                    if(d5 < -1D)
                    {
                        d5 = -1D;
                    }
                    d5 /= 1.3999999999999999D;
                    d5 /= 2D;
                    d3 = 0.0D;
                } else
                {
                    if(d5 > 1.0D)
                    {
                        d5 = 1.0D;
                    }
                    d5 /= 6D;
                }
                d3 += 0.5D;
                d5 = (d5 * (double)p_4057_6_) / 16D;
                j++;
                for(int j1 = 0; j1 < p_4057_6_; j1++)
                {
                    double d6 = 0.0D;
                    double d7 = ad[j1];
                    double d8 = field_4174_d[i] / 512D;
                    double d9 = field_4173_e[i] / 512D;
                    double d10 = (field_4175_c[i] / 10D + 1.0D) / 2D;
                    if(d10 < 0.0D)
                    {
                        d6 = d8;
                    } else
                    if(d10 > 1.0D)
                    {
                        d6 = d9;
                    } else
                    {
                        d6 = d8 + (d9 - d8) * d10;
                    }
                    d6 -= d7;
                    if(j1 > p_4057_6_ - 4)
                    {
                        double d11 = (float)(j1 - (p_4057_6_ - 4)) / 3F;
                        d6 = d6 * (1.0D - d11) + -10D * d11;
                    }
                    if((double)j1 < d4)
                    {
                        double d12 = (d4 - (double)j1) / 4D;
                        if(d12 < 0.0D)
                        {
                            d12 = 0.0D;
                        }
                        if(d12 > 1.0D)
                        {
                            d12 = 1.0D;
                        }
                        d6 = d6 * (1.0D - d12) + -10D * d12;
                    }
                    p_4057_1_[i] = d6;
                    i++;
                }

            }

        }

        return p_4057_1_;
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
        field_40378_c.func_35629_a(field_4164_n, field_4170_h, p_534_2_, p_534_3_);
        for(int k = 0; k < 8; k++)
        {
            int i1 = i + field_4170_h.nextInt(16) + 8;
            int k2 = field_4170_h.nextInt(120) + 4;
            int i4 = j + field_4170_h.nextInt(16) + 8;
            (new WorldGenHellLava(Block.field_397_D.field_376_bc)).func_516_a(field_4164_n, field_4170_h, i1, k2, i4);
        }

        int l = field_4170_h.nextInt(field_4170_h.nextInt(10) + 1) + 1;
        for(int j1 = 0; j1 < l; j1++)
        {
            int l2 = i + field_4170_h.nextInt(16) + 8;
            int j4 = field_4170_h.nextInt(120) + 4;
            int k5 = j + field_4170_h.nextInt(16) + 8;
            (new WorldGenFire()).func_516_a(field_4164_n, field_4170_h, l2, j4, k5);
        }

        l = field_4170_h.nextInt(field_4170_h.nextInt(10) + 1);
        for(int k1 = 0; k1 < l; k1++)
        {
            int i3 = i + field_4170_h.nextInt(16) + 8;
            int k4 = field_4170_h.nextInt(120) + 4;
            int l5 = j + field_4170_h.nextInt(16) + 8;
            (new WorldGenGlowStone1()).func_516_a(field_4164_n, field_4170_h, i3, k4, l5);
        }

        for(int l1 = 0; l1 < 10; l1++)
        {
            int j3 = i + field_4170_h.nextInt(16) + 8;
            int l4 = field_4170_h.nextInt(128);
            int i6 = j + field_4170_h.nextInt(16) + 8;
            (new WorldGenGlowStone2()).func_516_a(field_4164_n, field_4170_h, j3, l4, i6);
        }

        if(field_4170_h.nextInt(1) == 0)
        {
            int i2 = i + field_4170_h.nextInt(16) + 8;
            int k3 = field_4170_h.nextInt(128);
            int i5 = j + field_4170_h.nextInt(16) + 8;
            (new WorldGenFlowers(Block.field_415_ag.field_376_bc)).func_516_a(field_4164_n, field_4170_h, i2, k3, i5);
        }
        if(field_4170_h.nextInt(1) == 0)
        {
            int j2 = i + field_4170_h.nextInt(16) + 8;
            int l3 = field_4170_h.nextInt(128);
            int j5 = j + field_4170_h.nextInt(16) + 8;
            (new WorldGenFlowers(Block.field_414_ah.field_376_bc)).func_516_a(field_4164_n, field_4170_h, j2, l3, j5);
        }
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
        return "HellRandomLevelSource";
    }

    public List func_40377_a(EnumCreatureType p_40377_1_, int p_40377_2_, int p_40377_3_, int p_40377_4_)
    {
        if(p_40377_1_ == EnumCreatureType.monster && field_40378_c.func_40483_a(p_40377_2_, p_40377_3_, p_40377_4_))
        {
            return field_40378_c.func_40485_b();
        }
        BiomeGenBase biomegenbase = field_4164_n.func_48454_a(p_40377_2_, p_40377_4_);
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
