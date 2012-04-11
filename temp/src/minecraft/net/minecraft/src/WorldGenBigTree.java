// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, MathHelper, World

public class WorldGenBigTree extends WorldGenerator
{

    static final byte field_882_a[] = {
        2, 0, 0, 1, 2, 1
    };
    Random field_881_b;
    World field_880_c;
    int field_879_d[] = {
        0, 0, 0
    };
    int field_878_e;
    int field_877_f;
    double field_876_g;
    double field_875_h;
    double field_874_i;
    double field_873_j;
    double field_872_k;
    int field_871_l;
    int field_870_m;
    int field_869_n;
    int field_868_o[][];

    public WorldGenBigTree(boolean p_i731_1_)
    {
        super(p_i731_1_);
        field_881_b = new Random();
        field_878_e = 0;
        field_876_g = 0.61799999999999999D;
        field_875_h = 1.0D;
        field_874_i = 0.38100000000000001D;
        field_873_j = 1.0D;
        field_872_k = 1.0D;
        field_871_l = 1;
        field_870_m = 12;
        field_869_n = 4;
    }

    void func_521_a()
    {
        field_877_f = (int)((double)field_878_e * field_876_g);
        if(field_877_f >= field_878_e)
        {
            field_877_f = field_878_e - 1;
        }
        int i = (int)(1.3819999999999999D + Math.pow((field_872_k * (double)field_878_e) / 13D, 2D));
        if(i < 1)
        {
            i = 1;
        }
        int ai[][] = new int[i * field_878_e][4];
        int j = (field_879_d[1] + field_878_e) - field_869_n;
        int k = 1;
        int l = field_879_d[1] + field_877_f;
        int i1 = j - field_879_d[1];
        ai[0][0] = field_879_d[0];
        ai[0][1] = j;
        ai[0][2] = field_879_d[2];
        ai[0][3] = l;
        j--;
        while(i1 >= 0) 
        {
            int j1 = 0;
            float f = func_528_a(i1);
            if(f < 0.0F)
            {
                j--;
                i1--;
            } else
            {
                double d = 0.5D;
                for(; j1 < i; j1++)
                {
                    double d1 = field_873_j * ((double)f * ((double)field_881_b.nextFloat() + 0.32800000000000001D));
                    double d2 = (double)field_881_b.nextFloat() * 2D * 3.1415899999999999D;
                    int k1 = MathHelper.func_1108_b(d1 * Math.sin(d2) + (double)field_879_d[0] + d);
                    int l1 = MathHelper.func_1108_b(d1 * Math.cos(d2) + (double)field_879_d[2] + d);
                    int ai1[] = {
                        k1, j, l1
                    };
                    int ai2[] = {
                        k1, j + field_869_n, l1
                    };
                    if(func_524_a(ai1, ai2) != -1)
                    {
                        continue;
                    }
                    int ai3[] = {
                        field_879_d[0], field_879_d[1], field_879_d[2]
                    };
                    double d3 = Math.sqrt(Math.pow(Math.abs(field_879_d[0] - ai1[0]), 2D) + Math.pow(Math.abs(field_879_d[2] - ai1[2]), 2D));
                    double d4 = d3 * field_874_i;
                    if((double)ai1[1] - d4 > (double)l)
                    {
                        ai3[1] = l;
                    } else
                    {
                        ai3[1] = (int)((double)ai1[1] - d4);
                    }
                    if(func_524_a(ai3, ai1) == -1)
                    {
                        ai[k][0] = k1;
                        ai[k][1] = j;
                        ai[k][2] = l1;
                        ai[k][3] = ai3[1];
                        k++;
                    }
                }

                j--;
                i1--;
            }
        }
        field_868_o = new int[k][4];
        System.arraycopy(ai, 0, field_868_o, 0, k);
    }

    void func_523_a(int p_523_1_, int p_523_2_, int p_523_3_, float p_523_4_, byte p_523_5_, int p_523_6_)
    {
        int i = (int)((double)p_523_4_ + 0.61799999999999999D);
        byte byte0 = field_882_a[p_523_5_];
        byte byte1 = field_882_a[p_523_5_ + 3];
        int ai[] = {
            p_523_1_, p_523_2_, p_523_3_
        };
        int ai1[] = {
            0, 0, 0
        };
        int j = -i;
        int k = -i;
        ai1[p_523_5_] = ai[p_523_5_];
        for(; j <= i; j++)
        {
            ai1[byte0] = ai[byte0] + j;
            for(int l = -i; l <= i;)
            {
                double d = Math.sqrt(Math.pow((double)Math.abs(j) + 0.5D, 2D) + Math.pow((double)Math.abs(l) + 0.5D, 2D));
                if(d > (double)p_523_4_)
                {
                    l++;
                } else
                {
                    ai1[byte1] = ai[byte1] + l;
                    int i1 = field_880_c.func_600_a(ai1[0], ai1[1], ai1[2]);
                    if(i1 != 0 && i1 != 18)
                    {
                        l++;
                    } else
                    {
                        func_41060_a(field_880_c, ai1[0], ai1[1], ai1[2], p_523_6_, 0);
                        l++;
                    }
                }
            }

        }

    }

    float func_528_a(int p_528_1_)
    {
        if((double)p_528_1_ < (double)(float)field_878_e * 0.29999999999999999D)
        {
            return -1.618F;
        }
        float f = (float)field_878_e / 2.0F;
        float f1 = (float)field_878_e / 2.0F - (float)p_528_1_;
        float f2;
        if(f1 == 0.0F)
        {
            f2 = f;
        } else
        if(Math.abs(f1) >= f)
        {
            f2 = 0.0F;
        } else
        {
            f2 = (float)Math.sqrt(Math.pow(Math.abs(f), 2D) - Math.pow(Math.abs(f1), 2D));
        }
        f2 *= 0.5F;
        return f2;
    }

    float func_526_b(int p_526_1_)
    {
        if(p_526_1_ < 0 || p_526_1_ >= field_869_n)
        {
            return -1F;
        }
        return p_526_1_ != 0 && p_526_1_ != field_869_n - 1 ? 3F : 2.0F;
    }

    void func_520_a(int p_520_1_, int p_520_2_, int p_520_3_)
    {
        int i = p_520_2_;
        for(int j = p_520_2_ + field_869_n; i < j; i++)
        {
            float f = func_526_b(i - p_520_2_);
            func_523_a(p_520_1_, i, p_520_3_, f, (byte)1, 18);
        }

    }

    void func_522_a(int p_522_1_[], int p_522_2_[], int p_522_3_)
    {
        int ai[] = {
            0, 0, 0
        };
        byte byte0 = 0;
        int i = 0;
        for(; byte0 < 3; byte0++)
        {
            ai[byte0] = p_522_2_[byte0] - p_522_1_[byte0];
            if(Math.abs(ai[byte0]) > Math.abs(ai[i]))
            {
                i = byte0;
            }
        }

        if(ai[i] == 0)
        {
            return;
        }
        byte byte1 = field_882_a[i];
        byte byte2 = field_882_a[i + 3];
        byte byte3;
        if(ai[i] > 0)
        {
            byte3 = 1;
        } else
        {
            byte3 = -1;
        }
        double d = (double)ai[byte1] / (double)ai[i];
        double d1 = (double)ai[byte2] / (double)ai[i];
        int ai1[] = {
            0, 0, 0
        };
        int j = 0;
        for(int k = ai[i] + byte3; j != k; j += byte3)
        {
            ai1[i] = MathHelper.func_1108_b((double)(p_522_1_[i] + j) + 0.5D);
            ai1[byte1] = MathHelper.func_1108_b((double)p_522_1_[byte1] + (double)j * d + 0.5D);
            ai1[byte2] = MathHelper.func_1108_b((double)p_522_1_[byte2] + (double)j * d1 + 0.5D);
            func_41060_a(field_880_c, ai1[0], ai1[1], ai1[2], p_522_3_, 0);
        }

    }

    void func_518_b()
    {
        int i = 0;
        for(int j = field_868_o.length; i < j; i++)
        {
            int k = field_868_o[i][0];
            int l = field_868_o[i][1];
            int i1 = field_868_o[i][2];
            func_520_a(k, l, i1);
        }

    }

    boolean func_527_c(int p_527_1_)
    {
        return (double)p_527_1_ >= (double)field_878_e * 0.20000000000000001D;
    }

    void func_529_c()
    {
        int i = field_879_d[0];
        int j = field_879_d[1];
        int k = field_879_d[1] + field_877_f;
        int l = field_879_d[2];
        int ai[] = {
            i, j, l
        };
        int ai1[] = {
            i, k, l
        };
        func_522_a(ai, ai1, 17);
        if(field_871_l == 2)
        {
            ai[0]++;
            ai1[0]++;
            func_522_a(ai, ai1, 17);
            ai[2]++;
            ai1[2]++;
            func_522_a(ai, ai1, 17);
            ai[0]--;
            ai1[0]--;
            func_522_a(ai, ai1, 17);
        }
    }

    void func_525_d()
    {
        int i = 0;
        int j = field_868_o.length;
        int ai[] = {
            field_879_d[0], field_879_d[1], field_879_d[2]
        };
        for(; i < j; i++)
        {
            int ai1[] = field_868_o[i];
            int ai2[] = {
                ai1[0], ai1[1], ai1[2]
            };
            ai[1] = ai1[3];
            int k = ai[1] - field_879_d[1];
            if(func_527_c(k))
            {
                func_522_a(ai, ai2, 17);
            }
        }

    }

    int func_524_a(int p_524_1_[], int p_524_2_[])
    {
        int ai[] = {
            0, 0, 0
        };
        byte byte0 = 0;
        int i = 0;
        for(; byte0 < 3; byte0++)
        {
            ai[byte0] = p_524_2_[byte0] - p_524_1_[byte0];
            if(Math.abs(ai[byte0]) > Math.abs(ai[i]))
            {
                i = byte0;
            }
        }

        if(ai[i] == 0)
        {
            return -1;
        }
        byte byte1 = field_882_a[i];
        byte byte2 = field_882_a[i + 3];
        byte byte3;
        if(ai[i] > 0)
        {
            byte3 = 1;
        } else
        {
            byte3 = -1;
        }
        double d = (double)ai[byte1] / (double)ai[i];
        double d1 = (double)ai[byte2] / (double)ai[i];
        int ai1[] = {
            0, 0, 0
        };
        int j = 0;
        int k = ai[i] + byte3;
        do
        {
            if(j == k)
            {
                break;
            }
            ai1[i] = p_524_1_[i] + j;
            ai1[byte1] = MathHelper.func_1108_b((double)p_524_1_[byte1] + (double)j * d);
            ai1[byte2] = MathHelper.func_1108_b((double)p_524_1_[byte2] + (double)j * d1);
            int l = field_880_c.func_600_a(ai1[0], ai1[1], ai1[2]);
            if(l != 0 && l != 18)
            {
                break;
            }
            j += byte3;
        } while(true);
        if(j == k)
        {
            return -1;
        } else
        {
            return Math.abs(j);
        }
    }

    boolean func_519_e()
    {
        int ai[] = {
            field_879_d[0], field_879_d[1], field_879_d[2]
        };
        int ai1[] = {
            field_879_d[0], (field_879_d[1] + field_878_e) - 1, field_879_d[2]
        };
        int i = field_880_c.func_600_a(field_879_d[0], field_879_d[1] - 1, field_879_d[2]);
        if(i != 2 && i != 3)
        {
            return false;
        }
        int j = func_524_a(ai, ai1);
        if(j == -1)
        {
            return true;
        }
        if(j < 6)
        {
            return false;
        } else
        {
            field_878_e = j;
            return true;
        }
    }

    public void func_517_a(double p_517_1_, double p_517_3_, double p_517_5_)
    {
        field_870_m = (int)(p_517_1_ * 12D);
        if(p_517_1_ > 0.5D)
        {
            field_869_n = 5;
        }
        field_873_j = p_517_3_;
        field_872_k = p_517_5_;
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        field_880_c = p_516_1_;
        long l = p_516_2_.nextLong();
        field_881_b.setSeed(l);
        field_879_d[0] = p_516_3_;
        field_879_d[1] = p_516_4_;
        field_879_d[2] = p_516_5_;
        if(field_878_e == 0)
        {
            field_878_e = 5 + field_881_b.nextInt(field_870_m);
        }
        if(!func_519_e())
        {
            return false;
        } else
        {
            func_521_a();
            func_518_b();
            func_529_c();
            func_525_d();
            return true;
        }
    }

}
