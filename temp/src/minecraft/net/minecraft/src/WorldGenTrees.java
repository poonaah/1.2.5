// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockLeaves, 
//            BlockGrass

public class WorldGenTrees extends WorldGenerator
{

    private final int field_48202_a;
    private final boolean field_48200_b;
    private final int field_48201_c;
    private final int field_48199_d;

    public WorldGenTrees(boolean p_i586_1_)
    {
        this(p_i586_1_, 4, 0, 0, false);
    }

    public WorldGenTrees(boolean p_i1064_1_, int p_i1064_2_, int p_i1064_3_, int p_i1064_4_, boolean p_i1064_5_)
    {
        super(p_i1064_1_);
        field_48202_a = p_i1064_2_;
        field_48201_c = p_i1064_3_;
        field_48199_d = p_i1064_4_;
        field_48200_b = p_i1064_5_;
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        int i = p_516_2_.nextInt(3) + field_48202_a;
        boolean flag = true;
        if(p_516_4_ < 1 || p_516_4_ + i + 1 > 256)
        {
            return false;
        }
        for(int j = p_516_4_; j <= p_516_4_ + 1 + i; j++)
        {
            byte byte0 = 1;
            if(j == p_516_4_)
            {
                byte0 = 0;
            }
            if(j >= (p_516_4_ + 1 + i) - 2)
            {
                byte0 = 2;
            }
            for(int l = p_516_3_ - byte0; l <= p_516_3_ + byte0 && flag; l++)
            {
                for(int j1 = p_516_5_ - byte0; j1 <= p_516_5_ + byte0 && flag; j1++)
                {
                    if(j >= 0 && j < 256)
                    {
                        int j2 = p_516_1_.func_600_a(l, j, j1);
                        if(j2 != 0 && j2 != Block.field_384_L.field_376_bc && j2 != Block.field_337_v.field_376_bc && j2 != Block.field_336_w.field_376_bc && j2 != Block.field_385_K.field_376_bc)
                        {
                            flag = false;
                        }
                    } else
                    {
                        flag = false;
                    }
                }

            }

        }

        if(!flag)
        {
            return false;
        }
        int k = p_516_1_.func_600_a(p_516_3_, p_516_4_ - 1, p_516_5_);
        if(k != Block.field_337_v.field_376_bc && k != Block.field_336_w.field_376_bc || p_516_4_ >= 256 - i - 1)
        {
            return false;
        }
        func_50073_a(p_516_1_, p_516_3_, p_516_4_ - 1, p_516_5_, Block.field_336_w.field_376_bc);
        byte byte1 = 3;
        int i1 = 0;
        for(int k1 = (p_516_4_ - byte1) + i; k1 <= p_516_4_ + i; k1++)
        {
            int k2 = k1 - (p_516_4_ + i);
            int j3 = (i1 + 1) - k2 / 2;
            for(int l3 = p_516_3_ - j3; l3 <= p_516_3_ + j3; l3++)
            {
                int j4 = l3 - p_516_3_;
                for(int l4 = p_516_5_ - j3; l4 <= p_516_5_ + j3; l4++)
                {
                    int i5 = l4 - p_516_5_;
                    if((Math.abs(j4) != j3 || Math.abs(i5) != j3 || p_516_2_.nextInt(2) != 0 && k2 != 0) && !Block.field_343_p[p_516_1_.func_600_a(l3, k1, l4)])
                    {
                        func_41060_a(p_516_1_, l3, k1, l4, Block.field_384_L.field_376_bc, field_48199_d);
                    }
                }

            }

        }

        for(int l1 = 0; l1 < i; l1++)
        {
            int l2 = p_516_1_.func_600_a(p_516_3_, p_516_4_ + l1, p_516_5_);
            if(l2 != 0 && l2 != Block.field_384_L.field_376_bc)
            {
                continue;
            }
            func_41060_a(p_516_1_, p_516_3_, p_516_4_ + l1, p_516_5_, Block.field_385_K.field_376_bc, field_48201_c);
            if(!field_48200_b || l1 <= 0)
            {
                continue;
            }
            if(p_516_2_.nextInt(3) > 0 && p_516_1_.func_20084_d(p_516_3_ - 1, p_516_4_ + l1, p_516_5_))
            {
                func_41060_a(p_516_1_, p_516_3_ - 1, p_516_4_ + l1, p_516_5_, Block.field_35278_bv.field_376_bc, 8);
            }
            if(p_516_2_.nextInt(3) > 0 && p_516_1_.func_20084_d(p_516_3_ + 1, p_516_4_ + l1, p_516_5_))
            {
                func_41060_a(p_516_1_, p_516_3_ + 1, p_516_4_ + l1, p_516_5_, Block.field_35278_bv.field_376_bc, 2);
            }
            if(p_516_2_.nextInt(3) > 0 && p_516_1_.func_20084_d(p_516_3_, p_516_4_ + l1, p_516_5_ - 1))
            {
                func_41060_a(p_516_1_, p_516_3_, p_516_4_ + l1, p_516_5_ - 1, Block.field_35278_bv.field_376_bc, 1);
            }
            if(p_516_2_.nextInt(3) > 0 && p_516_1_.func_20084_d(p_516_3_, p_516_4_ + l1, p_516_5_ + 1))
            {
                func_41060_a(p_516_1_, p_516_3_, p_516_4_ + l1, p_516_5_ + 1, Block.field_35278_bv.field_376_bc, 4);
            }
        }

        if(field_48200_b)
        {
            for(int i2 = (p_516_4_ - 3) + i; i2 <= p_516_4_ + i; i2++)
            {
                int i3 = i2 - (p_516_4_ + i);
                int k3 = 2 - i3 / 2;
                for(int i4 = p_516_3_ - k3; i4 <= p_516_3_ + k3; i4++)
                {
                    for(int k4 = p_516_5_ - k3; k4 <= p_516_5_ + k3; k4++)
                    {
                        if(p_516_1_.func_600_a(i4, i2, k4) != Block.field_384_L.field_376_bc)
                        {
                            continue;
                        }
                        if(p_516_2_.nextInt(4) == 0 && p_516_1_.func_600_a(i4 - 1, i2, k4) == 0)
                        {
                            func_48198_a(p_516_1_, i4 - 1, i2, k4, 8);
                        }
                        if(p_516_2_.nextInt(4) == 0 && p_516_1_.func_600_a(i4 + 1, i2, k4) == 0)
                        {
                            func_48198_a(p_516_1_, i4 + 1, i2, k4, 2);
                        }
                        if(p_516_2_.nextInt(4) == 0 && p_516_1_.func_600_a(i4, i2, k4 - 1) == 0)
                        {
                            func_48198_a(p_516_1_, i4, i2, k4 - 1, 1);
                        }
                        if(p_516_2_.nextInt(4) == 0 && p_516_1_.func_600_a(i4, i2, k4 + 1) == 0)
                        {
                            func_48198_a(p_516_1_, i4, i2, k4 + 1, 4);
                        }
                    }

                }

            }

        }
        return true;
    }

    private void func_48198_a(World p_48198_1_, int p_48198_2_, int p_48198_3_, int p_48198_4_, int p_48198_5_)
    {
        func_41060_a(p_48198_1_, p_48198_2_, p_48198_3_, p_48198_4_, Block.field_35278_bv.field_376_bc, p_48198_5_);
        for(int i = 4; p_48198_1_.func_600_a(p_48198_2_, --p_48198_3_, p_48198_4_) == 0 && i > 0; i--)
        {
            func_41060_a(p_48198_1_, p_48198_2_, p_48198_3_, p_48198_4_, Block.field_35278_bv.field_376_bc, p_48198_5_);
        }

    }
}
