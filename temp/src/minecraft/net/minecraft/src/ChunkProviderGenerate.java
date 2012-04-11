// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            IChunkProvider, MapGenCaves, MapGenStronghold, MapGenVillage, 
//            MapGenMineshaft, MapGenRavine, NoiseGeneratorOctaves, World, 
//            WorldChunkManager, Block, BiomeGenBase, MapGenBase, 
//            Chunk, MathHelper, BlockSand, WorldGenLakes, 
//            WorldGenDungeons, SpawnerAnimals, IProgressUpdate, EnumCreatureType, 
//            ChunkPosition

public class ChunkProviderGenerate
    implements IChunkProvider
{

    private Random field_913_j;
    private NoiseGeneratorOctaves field_912_k;
    private NoiseGeneratorOctaves field_911_l;
    private NoiseGeneratorOctaves field_910_m;
    private NoiseGeneratorOctaves field_908_o;
    public NoiseGeneratorOctaves field_922_a;
    public NoiseGeneratorOctaves field_921_b;
    public NoiseGeneratorOctaves field_920_c;
    private World field_907_p;
    private final boolean field_35389_t;
    private double field_4180_q[];
    private double field_903_t[];
    private MapGenBase field_902_u;
    private MapGenStronghold field_35386_d;
    private MapGenVillage field_35387_e;
    private MapGenMineshaft field_35385_f;
    private MapGenBase field_35390_x;
    private BiomeGenBase field_4179_v[];
    double field_4185_d[];
    double field_4184_e[];
    double field_4183_f[];
    double field_4182_g[];
    double field_4181_h[];
    float field_35388_l[];
    int field_914_i[][];

    public ChunkProviderGenerate(World p_i211_1_, long p_i211_2_, boolean p_i211_4_)
    {
        field_903_t = new double[256];
        field_902_u = new MapGenCaves();
        field_35386_d = new MapGenStronghold();
        field_35387_e = new MapGenVillage(0);
        field_35385_f = new MapGenMineshaft();
        field_35390_x = new MapGenRavine();
        field_914_i = new int[32][32];
        field_907_p = p_i211_1_;
        field_35389_t = p_i211_4_;
        field_913_j = new Random(p_i211_2_);
        field_912_k = new NoiseGeneratorOctaves(field_913_j, 16);
        field_911_l = new NoiseGeneratorOctaves(field_913_j, 16);
        field_910_m = new NoiseGeneratorOctaves(field_913_j, 8);
        field_908_o = new NoiseGeneratorOctaves(field_913_j, 4);
        field_922_a = new NoiseGeneratorOctaves(field_913_j, 10);
        field_921_b = new NoiseGeneratorOctaves(field_913_j, 16);
        field_920_c = new NoiseGeneratorOctaves(field_913_j, 8);
    }

    public void func_4060_a(int p_4060_1_, int p_4060_2_, byte p_4060_3_[])
    {
        byte byte0 = 4;
        byte byte1 = 16;
        byte byte2 = 63;
        int i = byte0 + 1;
        byte byte3 = 17;
        int j = byte0 + 1;
        field_4179_v = field_907_p.func_4075_a().func_35557_b(field_4179_v, p_4060_1_ * 4 - 2, p_4060_2_ * 4 - 2, i + 5, j + 5);
        field_4180_q = func_4061_a(field_4180_q, p_4060_1_ * byte0, 0, p_4060_2_ * byte0, i, byte3, j);
        for(int k = 0; k < byte0; k++)
        {
            for(int l = 0; l < byte0; l++)
            {
                for(int i1 = 0; i1 < byte1; i1++)
                {
                    double d = 0.125D;
                    double d1 = field_4180_q[((k + 0) * j + (l + 0)) * byte3 + (i1 + 0)];
                    double d2 = field_4180_q[((k + 0) * j + (l + 1)) * byte3 + (i1 + 0)];
                    double d3 = field_4180_q[((k + 1) * j + (l + 0)) * byte3 + (i1 + 0)];
                    double d4 = field_4180_q[((k + 1) * j + (l + 1)) * byte3 + (i1 + 0)];
                    double d5 = (field_4180_q[((k + 0) * j + (l + 0)) * byte3 + (i1 + 1)] - d1) * d;
                    double d6 = (field_4180_q[((k + 0) * j + (l + 1)) * byte3 + (i1 + 1)] - d2) * d;
                    double d7 = (field_4180_q[((k + 1) * j + (l + 0)) * byte3 + (i1 + 1)] - d3) * d;
                    double d8 = (field_4180_q[((k + 1) * j + (l + 1)) * byte3 + (i1 + 1)] - d4) * d;
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
                            l1 -= c;
                            double d14 = 0.25D;
                            double d15 = d10;
                            double d16 = (d11 - d10) * d14;
                            d15 -= d16;
                            for(int i2 = 0; i2 < 4; i2++)
                            {
                                if((d15 += d16) > 0.0D)
                                {
                                    p_4060_3_[l1 += c] = (byte)Block.field_338_u.field_376_bc;
                                    continue;
                                }
                                if(i1 * 8 + j1 < byte2)
                                {
                                    p_4060_3_[l1 += c] = (byte)Block.field_399_C.field_376_bc;
                                } else
                                {
                                    p_4060_3_[l1 += c] = 0;
                                }
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

    public void func_4062_a(int p_4062_1_, int p_4062_2_, byte p_4062_3_[], BiomeGenBase p_4062_4_[])
    {
        byte byte0 = 63;
        double d = 0.03125D;
        field_903_t = field_908_o.func_807_a(field_903_t, p_4062_1_ * 16, p_4062_2_ * 16, 0, 16, 16, 1, d * 2D, d * 2D, d * 2D);
        for(int i = 0; i < 16; i++)
        {
            for(int j = 0; j < 16; j++)
            {
                BiomeGenBase biomegenbase = p_4062_4_[j + i * 16];
                float f = biomegenbase.func_48411_i();
                int k = (int)(field_903_t[i + j * 16] / 3D + 3D + field_913_j.nextDouble() * 0.25D);
                int l = -1;
                byte byte1 = biomegenbase.field_4242_o;
                byte byte2 = biomegenbase.field_4241_p;
                for(int i1 = 127; i1 >= 0; i1--)
                {
                    int j1 = (j * 16 + i) * 128 + i1;
                    if(i1 <= 0 + field_913_j.nextInt(5))
                    {
                        p_4062_3_[j1] = (byte)Block.field_403_A.field_376_bc;
                        continue;
                    }
                    byte byte3 = p_4062_3_[j1];
                    if(byte3 == 0)
                    {
                        l = -1;
                        continue;
                    }
                    if(byte3 != Block.field_338_u.field_376_bc)
                    {
                        continue;
                    }
                    if(l == -1)
                    {
                        if(k <= 0)
                        {
                            byte1 = 0;
                            byte2 = (byte)Block.field_338_u.field_376_bc;
                        } else
                        if(i1 >= byte0 - 4 && i1 <= byte0 + 1)
                        {
                            byte1 = biomegenbase.field_4242_o;
                            byte2 = biomegenbase.field_4241_p;
                        }
                        if(i1 < byte0 && byte1 == 0)
                        {
                            if(f < 0.15F)
                            {
                                byte1 = (byte)Block.field_4063_aU.field_376_bc;
                            } else
                            {
                                byte1 = (byte)Block.field_399_C.field_376_bc;
                            }
                        }
                        l = k;
                        if(i1 >= byte0 - 1)
                        {
                            p_4062_3_[j1] = byte1;
                        } else
                        {
                            p_4062_3_[j1] = byte2;
                        }
                        continue;
                    }
                    if(l <= 0)
                    {
                        continue;
                    }
                    l--;
                    p_4062_3_[j1] = byte2;
                    if(l == 0 && byte2 == Block.field_393_F.field_376_bc)
                    {
                        l = field_913_j.nextInt(4);
                        byte2 = (byte)Block.field_9264_Q.field_376_bc;
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
        field_913_j.setSeed((long)p_533_1_ * 0x4f9939f508L + (long)p_533_2_ * 0x1ef1565bd5L);
        byte abyte0[] = new byte[32768];
        func_4060_a(p_533_1_, p_533_2_, abyte0);
        field_4179_v = field_907_p.func_4075_a().func_4070_a(field_4179_v, p_533_1_ * 16, p_533_2_ * 16, 16, 16);
        func_4062_a(p_533_1_, p_533_2_, abyte0, field_4179_v);
        field_902_u.func_867_a(this, field_907_p, p_533_1_, p_533_2_, abyte0);
        field_35390_x.func_867_a(this, field_907_p, p_533_1_, p_533_2_, abyte0);
        if(field_35389_t)
        {
            field_35385_f.func_867_a(this, field_907_p, p_533_1_, p_533_2_, abyte0);
            field_35387_e.func_867_a(this, field_907_p, p_533_1_, p_533_2_, abyte0);
            field_35386_d.func_867_a(this, field_907_p, p_533_1_, p_533_2_, abyte0);
        }
        Chunk chunk = new Chunk(field_907_p, abyte0, p_533_1_, p_533_2_);
        byte abyte1[] = chunk.func_48493_m();
        for(int i = 0; i < abyte1.length; i++)
        {
            abyte1[i] = (byte)field_4179_v[i].field_35494_y;
        }

        chunk.func_1024_c();
        return chunk;
    }

    private double[] func_4061_a(double p_4061_1_[], int p_4061_2_, int p_4061_3_, int p_4061_4_, int p_4061_5_, int p_4061_6_, int p_4061_7_)
    {
        if(p_4061_1_ == null)
        {
            p_4061_1_ = new double[p_4061_5_ * p_4061_6_ * p_4061_7_];
        }
        if(field_35388_l == null)
        {
            field_35388_l = new float[25];
            for(int i = -2; i <= 2; i++)
            {
                for(int j = -2; j <= 2; j++)
                {
                    float f = 10F / MathHelper.func_1113_c((float)(i * i + j * j) + 0.2F);
                    field_35388_l[i + 2 + (j + 2) * 5] = f;
                }

            }

        }
        double d = 684.41200000000003D;
        double d1 = 684.41200000000003D;
        field_4182_g = field_922_a.func_4109_a(field_4182_g, p_4061_2_, p_4061_4_, p_4061_5_, p_4061_7_, 1.121D, 1.121D, 0.5D);
        field_4181_h = field_921_b.func_4109_a(field_4181_h, p_4061_2_, p_4061_4_, p_4061_5_, p_4061_7_, 200D, 200D, 0.5D);
        field_4185_d = field_910_m.func_807_a(field_4185_d, p_4061_2_, p_4061_3_, p_4061_4_, p_4061_5_, p_4061_6_, p_4061_7_, d / 80D, d1 / 160D, d / 80D);
        field_4184_e = field_912_k.func_807_a(field_4184_e, p_4061_2_, p_4061_3_, p_4061_4_, p_4061_5_, p_4061_6_, p_4061_7_, d, d1, d);
        field_4183_f = field_911_l.func_807_a(field_4183_f, p_4061_2_, p_4061_3_, p_4061_4_, p_4061_5_, p_4061_6_, p_4061_7_, d, d1, d);
        p_4061_2_ = p_4061_4_ = 0;
        int k = 0;
        int l = 0;
        for(int i1 = 0; i1 < p_4061_5_; i1++)
        {
            for(int j1 = 0; j1 < p_4061_7_; j1++)
            {
                float f1 = 0.0F;
                float f2 = 0.0F;
                float f3 = 0.0F;
                byte byte0 = 2;
                BiomeGenBase biomegenbase = field_4179_v[i1 + 2 + (j1 + 2) * (p_4061_5_ + 5)];
                for(int k1 = -byte0; k1 <= byte0; k1++)
                {
                    for(int l1 = -byte0; l1 <= byte0; l1++)
                    {
                        BiomeGenBase biomegenbase1 = field_4179_v[i1 + k1 + 2 + (j1 + l1 + 2) * (p_4061_5_ + 5)];
                        float f4 = field_35388_l[k1 + 2 + (l1 + 2) * 5] / (biomegenbase1.field_35492_q + 2.0F);
                        if(biomegenbase1.field_35492_q > biomegenbase.field_35492_q)
                        {
                            f4 /= 2.0F;
                        }
                        f1 += biomegenbase1.field_35491_r * f4;
                        f2 += biomegenbase1.field_35492_q * f4;
                        f3 += f4;
                    }

                }

                f1 /= f3;
                f2 /= f3;
                f1 = f1 * 0.9F + 0.1F;
                f2 = (f2 * 4F - 1.0F) / 8F;
                double d2 = field_4181_h[l] / 8000D;
                if(d2 < 0.0D)
                {
                    d2 = -d2 * 0.29999999999999999D;
                }
                d2 = d2 * 3D - 2D;
                if(d2 < 0.0D)
                {
                    d2 /= 2D;
                    if(d2 < -1D)
                    {
                        d2 = -1D;
                    }
                    d2 /= 1.3999999999999999D;
                    d2 /= 2D;
                } else
                {
                    if(d2 > 1.0D)
                    {
                        d2 = 1.0D;
                    }
                    d2 /= 8D;
                }
                l++;
                for(int i2 = 0; i2 < p_4061_6_; i2++)
                {
                    double d3 = f2;
                    double d4 = f1;
                    d3 += d2 * 0.20000000000000001D;
                    d3 = (d3 * (double)p_4061_6_) / 16D;
                    double d5 = (double)p_4061_6_ / 2D + d3 * 4D;
                    double d6 = 0.0D;
                    double d7 = (((double)i2 - d5) * 12D * 128D) / 128D / d4;
                    if(d7 < 0.0D)
                    {
                        d7 *= 4D;
                    }
                    double d8 = field_4184_e[k] / 512D;
                    double d9 = field_4183_f[k] / 512D;
                    double d10 = (field_4185_d[k] / 10D + 1.0D) / 2D;
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
                    if(i2 > p_4061_6_ - 4)
                    {
                        double d11 = (float)(i2 - (p_4061_6_ - 4)) / 3F;
                        d6 = d6 * (1.0D - d11) + -10D * d11;
                    }
                    p_4061_1_[k] = d6;
                    k++;
                }

            }

        }

        return p_4061_1_;
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
        BiomeGenBase biomegenbase = field_907_p.func_48454_a(i + 16, j + 16);
        field_913_j.setSeed(field_907_p.func_22138_q());
        long l = (field_913_j.nextLong() / 2L) * 2L + 1L;
        long l1 = (field_913_j.nextLong() / 2L) * 2L + 1L;
        field_913_j.setSeed((long)p_534_2_ * l + (long)p_534_3_ * l1 ^ field_907_p.func_22138_q());
        boolean flag = false;
        if(field_35389_t)
        {
            field_35385_f.func_35629_a(field_907_p, field_913_j, p_534_2_, p_534_3_);
            flag = field_35387_e.func_35629_a(field_907_p, field_913_j, p_534_2_, p_534_3_);
            field_35386_d.func_35629_a(field_907_p, field_913_j, p_534_2_, p_534_3_);
        }
        if(!flag && field_913_j.nextInt(4) == 0)
        {
            int k = i + field_913_j.nextInt(16) + 8;
            int i2 = field_913_j.nextInt(128);
            int i3 = j + field_913_j.nextInt(16) + 8;
            (new WorldGenLakes(Block.field_399_C.field_376_bc)).func_516_a(field_907_p, field_913_j, k, i2, i3);
        }
        if(!flag && field_913_j.nextInt(8) == 0)
        {
            int i1 = i + field_913_j.nextInt(16) + 8;
            int j2 = field_913_j.nextInt(field_913_j.nextInt(120) + 8);
            int j3 = j + field_913_j.nextInt(16) + 8;
            if(j2 < 63 || field_913_j.nextInt(10) == 0)
            {
                (new WorldGenLakes(Block.field_395_E.field_376_bc)).func_516_a(field_907_p, field_913_j, i1, j2, j3);
            }
        }
        for(int j1 = 0; j1 < 8; j1++)
        {
            int k2 = i + field_913_j.nextInt(16) + 8;
            int k3 = field_913_j.nextInt(128);
            int i4 = j + field_913_j.nextInt(16) + 8;
            if(!(new WorldGenDungeons()).func_516_a(field_907_p, field_913_j, k2, k3, i4));
        }

        biomegenbase.func_35477_a(field_907_p, field_913_j, i, j);
        SpawnerAnimals.func_35957_a(field_907_p, biomegenbase, i + 8, j + 8, 16, 16, field_913_j);
        i += 8;
        j += 8;
        for(int k1 = 0; k1 < 16; k1++)
        {
            for(int l2 = 0; l2 < 16; l2++)
            {
                int l3 = field_907_p.func_35461_e(i + k1, j + l2);
                if(field_907_p.func_40471_p(k1 + i, l3 - 1, l2 + j))
                {
                    field_907_p.func_690_d(k1 + i, l3 - 1, l2 + j, Block.field_4063_aU.field_376_bc);
                }
                if(field_907_p.func_40478_r(k1 + i, l3, l2 + j))
                {
                    field_907_p.func_690_d(k1 + i, l3, l2 + j, Block.field_428_aT.field_376_bc);
                }
            }

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
        return "RandomLevelSource";
    }

    public List func_40377_a(EnumCreatureType p_40377_1_, int p_40377_2_, int p_40377_3_, int p_40377_4_)
    {
        BiomeGenBase biomegenbase = field_907_p.func_48454_a(p_40377_2_, p_40377_4_);
        if(biomegenbase == null)
        {
            return null;
        } else
        {
            return biomegenbase.func_25063_a(p_40377_1_);
        }
    }

    public ChunkPosition func_40376_a(World p_40376_1_, String p_40376_2_, int p_40376_3_, int p_40376_4_, int p_40376_5_)
    {
        if("Stronghold".equals(p_40376_2_) && field_35386_d != null)
        {
            return field_35386_d.func_40484_a(p_40376_1_, p_40376_3_, p_40376_4_, p_40376_5_);
        } else
        {
            return null;
        }
    }
}
