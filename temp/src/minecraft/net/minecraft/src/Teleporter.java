// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            World, WorldProvider, Entity, MathHelper, 
//            Block, BlockPortal, Material

public class Teleporter
{

    private Random field_4232_a;

    public Teleporter()
    {
        field_4232_a = new Random();
    }

    public void func_4107_a(World p_4107_1_, Entity p_4107_2_)
    {
        if(p_4107_1_.field_4209_q.field_4218_e == 1)
        {
            int i = MathHelper.func_1108_b(p_4107_2_.field_611_ak);
            int j = MathHelper.func_1108_b(p_4107_2_.field_610_al) - 1;
            int k = MathHelper.func_1108_b(p_4107_2_.field_609_am);
            int l = 1;
            int i1 = 0;
            for(int j1 = -2; j1 <= 2; j1++)
            {
                for(int k1 = -2; k1 <= 2; k1++)
                {
                    for(int l1 = -1; l1 < 3; l1++)
                    {
                        int i2 = i + k1 * l + j1 * i1;
                        int j2 = j + l1;
                        int k2 = (k + k1 * i1) - j1 * l;
                        boolean flag = l1 < 0;
                        p_4107_1_.func_690_d(i2, j2, k2, flag ? Block.field_405_aq.field_376_bc : 0);
                    }

                }

            }

            p_4107_2_.func_365_c(i, j, k, p_4107_2_.field_605_aq, 0.0F);
            p_4107_2_.field_608_an = p_4107_2_.field_607_ao = p_4107_2_.field_606_ap = 0.0D;
            return;
        }
        if(func_4106_b(p_4107_1_, p_4107_2_))
        {
            return;
        } else
        {
            func_4108_c(p_4107_1_, p_4107_2_);
            func_4106_b(p_4107_1_, p_4107_2_);
            return;
        }
    }

    public boolean func_4106_b(World p_4106_1_, Entity p_4106_2_)
    {
        char c = '\200';
        double d = -1D;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = MathHelper.func_1108_b(p_4106_2_.field_611_ak);
        int i1 = MathHelper.func_1108_b(p_4106_2_.field_609_am);
        for(int j1 = l - c; j1 <= l + c; j1++)
        {
            double d1 = ((double)j1 + 0.5D) - p_4106_2_.field_611_ak;
            for(int j2 = i1 - c; j2 <= i1 + c; j2++)
            {
                double d3 = ((double)j2 + 0.5D) - p_4106_2_.field_609_am;
                for(int k2 = 127; k2 >= 0; k2--)
                {
                    if(p_4106_1_.func_600_a(j1, k2, j2) != Block.field_4047_bf.field_376_bc)
                    {
                        continue;
                    }
                    for(; p_4106_1_.func_600_a(j1, k2 - 1, j2) == Block.field_4047_bf.field_376_bc; k2--) { }
                    double d5 = ((double)k2 + 0.5D) - p_4106_2_.field_610_al;
                    double d7 = d1 * d1 + d5 * d5 + d3 * d3;
                    if(d < 0.0D || d7 < d)
                    {
                        d = d7;
                        i = j1;
                        j = k2;
                        k = j2;
                    }
                }

            }

        }

        if(d >= 0.0D)
        {
            int k1 = i;
            int l1 = j;
            int i2 = k;
            double d2 = (double)k1 + 0.5D;
            double d4 = (double)l1 + 0.5D;
            double d6 = (double)i2 + 0.5D;
            if(p_4106_1_.func_600_a(k1 - 1, l1, i2) == Block.field_4047_bf.field_376_bc)
            {
                d2 -= 0.5D;
            }
            if(p_4106_1_.func_600_a(k1 + 1, l1, i2) == Block.field_4047_bf.field_376_bc)
            {
                d2 += 0.5D;
            }
            if(p_4106_1_.func_600_a(k1, l1, i2 - 1) == Block.field_4047_bf.field_376_bc)
            {
                d6 -= 0.5D;
            }
            if(p_4106_1_.func_600_a(k1, l1, i2 + 1) == Block.field_4047_bf.field_376_bc)
            {
                d6 += 0.5D;
            }
            p_4106_2_.func_365_c(d2, d4, d6, p_4106_2_.field_605_aq, 0.0F);
            p_4106_2_.field_608_an = p_4106_2_.field_607_ao = p_4106_2_.field_606_ap = 0.0D;
            return true;
        } else
        {
            return false;
        }
    }

    public boolean func_4108_c(World p_4108_1_, Entity p_4108_2_)
    {
        byte byte0 = 16;
        double d = -1D;
        int i = MathHelper.func_1108_b(p_4108_2_.field_611_ak);
        int j = MathHelper.func_1108_b(p_4108_2_.field_610_al);
        int k = MathHelper.func_1108_b(p_4108_2_.field_609_am);
        int l = i;
        int i1 = j;
        int j1 = k;
        int k1 = 0;
        int l1 = field_4232_a.nextInt(4);
        for(int i2 = i - byte0; i2 <= i + byte0; i2++)
        {
            double d1 = ((double)i2 + 0.5D) - p_4108_2_.field_611_ak;
            for(int j3 = k - byte0; j3 <= k + byte0; j3++)
            {
                double d3 = ((double)j3 + 0.5D) - p_4108_2_.field_609_am;
                for(int k4 = 127; k4 >= 0; k4--)
                {
                    if(!p_4108_1_.func_20084_d(i2, k4, j3))
                    {
                        continue;
                    }
                    for(; k4 > 0 && p_4108_1_.func_20084_d(i2, k4 - 1, j3); k4--) { }
label0:
                    for(int k5 = l1; k5 < l1 + 4; k5++)
                    {
                        int l6 = k5 % 2;
                        int i8 = 1 - l6;
                        if(k5 % 4 >= 2)
                        {
                            l6 = -l6;
                            i8 = -i8;
                        }
                        for(int j9 = 0; j9 < 3; j9++)
                        {
                            for(int k10 = 0; k10 < 4; k10++)
                            {
                                for(int l11 = -1; l11 < 4; l11++)
                                {
                                    int j12 = i2 + (k10 - 1) * l6 + j9 * i8;
                                    int l12 = k4 + l11;
                                    int j13 = (j3 + (k10 - 1) * i8) - j9 * l6;
                                    if(l11 < 0 && !p_4108_1_.func_599_f(j12, l12, j13).func_878_a() || l11 >= 0 && !p_4108_1_.func_20084_d(j12, l12, j13))
                                    {
                                        break label0;
                                    }
                                }

                            }

                        }

                        double d5 = ((double)k4 + 0.5D) - p_4108_2_.field_610_al;
                        double d7 = d1 * d1 + d5 * d5 + d3 * d3;
                        if(d < 0.0D || d7 < d)
                        {
                            d = d7;
                            l = i2;
                            i1 = k4;
                            j1 = j3;
                            k1 = k5 % 4;
                        }
                    }

                }

            }

        }

        if(d < 0.0D)
        {
            for(int j2 = i - byte0; j2 <= i + byte0; j2++)
            {
                double d2 = ((double)j2 + 0.5D) - p_4108_2_.field_611_ak;
                for(int k3 = k - byte0; k3 <= k + byte0; k3++)
                {
                    double d4 = ((double)k3 + 0.5D) - p_4108_2_.field_609_am;
                    for(int l4 = 127; l4 >= 0; l4--)
                    {
                        if(!p_4108_1_.func_20084_d(j2, l4, k3))
                        {
                            continue;
                        }
                        for(; l4 > 0 && p_4108_1_.func_20084_d(j2, l4 - 1, k3); l4--) { }
label1:
                        for(int l5 = l1; l5 < l1 + 2; l5++)
                        {
                            int i7 = l5 % 2;
                            int j8 = 1 - i7;
                            for(int k9 = 0; k9 < 4; k9++)
                            {
                                for(int l10 = -1; l10 < 4; l10++)
                                {
                                    int i12 = j2 + (k9 - 1) * i7;
                                    int k12 = l4 + l10;
                                    int i13 = k3 + (k9 - 1) * j8;
                                    if(l10 < 0 && !p_4108_1_.func_599_f(i12, k12, i13).func_878_a() || l10 >= 0 && !p_4108_1_.func_20084_d(i12, k12, i13))
                                    {
                                        break label1;
                                    }
                                }

                            }

                            double d6 = ((double)l4 + 0.5D) - p_4108_2_.field_610_al;
                            double d8 = d2 * d2 + d6 * d6 + d4 * d4;
                            if(d < 0.0D || d8 < d)
                            {
                                d = d8;
                                l = j2;
                                i1 = l4;
                                j1 = k3;
                                k1 = l5 % 2;
                            }
                        }

                    }

                }

            }

        }
        int k2 = k1;
        int l2 = l;
        int i3 = i1;
        int l3 = j1;
        int i4 = k2 % 2;
        int j4 = 1 - i4;
        if(k2 % 4 >= 2)
        {
            i4 = -i4;
            j4 = -j4;
        }
        if(d < 0.0D)
        {
            if(i1 < 70)
            {
                i1 = 70;
            }
            if(i1 > 118)
            {
                i1 = 118;
            }
            i3 = i1;
            for(int i5 = -1; i5 <= 1; i5++)
            {
                for(int i6 = 1; i6 < 3; i6++)
                {
                    for(int j7 = -1; j7 < 3; j7++)
                    {
                        int k8 = l2 + (i6 - 1) * i4 + i5 * j4;
                        int l9 = i3 + j7;
                        int i11 = (l3 + (i6 - 1) * j4) - i5 * i4;
                        boolean flag = j7 < 0;
                        p_4108_1_.func_690_d(k8, l9, i11, flag ? Block.field_405_aq.field_376_bc : 0);
                    }

                }

            }

        }
        for(int j5 = 0; j5 < 4; j5++)
        {
            p_4108_1_.field_1043_h = true;
            for(int j6 = 0; j6 < 4; j6++)
            {
                for(int k7 = -1; k7 < 4; k7++)
                {
                    int l8 = l2 + (j6 - 1) * i4;
                    int i10 = i3 + k7;
                    int j11 = l3 + (j6 - 1) * j4;
                    boolean flag1 = j6 == 0 || j6 == 3 || k7 == -1 || k7 == 3;
                    p_4108_1_.func_690_d(l8, i10, j11, flag1 ? Block.field_405_aq.field_376_bc : Block.field_4047_bf.field_376_bc);
                }

            }

            p_4108_1_.field_1043_h = false;
            for(int k6 = 0; k6 < 4; k6++)
            {
                for(int l7 = -1; l7 < 4; l7++)
                {
                    int i9 = l2 + (k6 - 1) * i4;
                    int j10 = i3 + l7;
                    int k11 = l3 + (k6 - 1) * j4;
                    p_4108_1_.func_611_g(i9, j10, k11, p_4108_1_.func_600_a(i9, j10, k11));
                }

            }

        }

        return true;
    }
}
