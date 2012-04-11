// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockLeaves, 
//            BlockGrass, MathHelper

public class WorldGenHugeTrees extends WorldGenerator
{

    private final int field_48195_a;
    private final int field_48193_b;
    private final int field_48194_c;

    public WorldGenHugeTrees(boolean p_i1015_1_, int p_i1015_2_, int p_i1015_3_, int p_i1015_4_)
    {
        super(p_i1015_1_);
        field_48195_a = p_i1015_2_;
        field_48193_b = p_i1015_3_;
        field_48194_c = p_i1015_4_;
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        int i = p_516_2_.nextInt(3) + field_48195_a;
        boolean flag = true;
        if(p_516_4_ < 1 || p_516_4_ + i + 1 > 256)
        {
            return false;
        }
        for(int j = p_516_4_; j <= p_516_4_ + 1 + i; j++)
        {
            byte byte0 = 2;
            if(j == p_516_4_)
            {
                byte0 = 1;
            }
            if(j >= (p_516_4_ + 1 + i) - 2)
            {
                byte0 = 2;
            }
            for(int i1 = p_516_3_ - byte0; i1 <= p_516_3_ + byte0 && flag; i1++)
            {
                for(int k1 = p_516_5_ - byte0; k1 <= p_516_5_ + byte0 && flag; k1++)
                {
                    if(j >= 0 && j < 256)
                    {
                        int k2 = p_516_1_.func_600_a(i1, j, k1);
                        if(k2 != 0 && k2 != Block.field_384_L.field_376_bc && k2 != Block.field_337_v.field_376_bc && k2 != Block.field_336_w.field_376_bc && k2 != Block.field_385_K.field_376_bc && k2 != Block.field_333_z.field_376_bc)
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
        p_516_1_.func_634_a(p_516_3_, p_516_4_ - 1, p_516_5_, Block.field_336_w.field_376_bc);
        p_516_1_.func_634_a(p_516_3_ + 1, p_516_4_ - 1, p_516_5_, Block.field_336_w.field_376_bc);
        p_516_1_.func_634_a(p_516_3_, p_516_4_ - 1, p_516_5_ + 1, Block.field_336_w.field_376_bc);
        p_516_1_.func_634_a(p_516_3_ + 1, p_516_4_ - 1, p_516_5_ + 1, Block.field_336_w.field_376_bc);
        func_48192_a(p_516_1_, p_516_3_, p_516_5_, p_516_4_ + i, 2, p_516_2_);
        for(int l = (p_516_4_ + i) - 2 - p_516_2_.nextInt(4); l > p_516_4_ + i / 2; l -= 2 + p_516_2_.nextInt(4))
        {
            float f = p_516_2_.nextFloat() * 3.141593F * 2.0F;
            int l1 = p_516_3_ + (int)(0.5F + MathHelper.func_1114_b(f) * 4F);
            int l2 = p_516_5_ + (int)(0.5F + MathHelper.func_1106_a(f) * 4F);
            func_48192_a(p_516_1_, l1, l2, l, 0, p_516_2_);
            for(int j3 = 0; j3 < 5; j3++)
            {
                int i2 = p_516_3_ + (int)(1.5F + MathHelper.func_1114_b(f) * (float)j3);
                int i3 = p_516_5_ + (int)(1.5F + MathHelper.func_1106_a(f) * (float)j3);
                func_41060_a(p_516_1_, i2, (l - 3) + j3 / 2, i3, Block.field_385_K.field_376_bc, field_48193_b);
            }

        }

        for(int j1 = 0; j1 < i; j1++)
        {
            int j2 = p_516_1_.func_600_a(p_516_3_, p_516_4_ + j1, p_516_5_);
            if(j2 == 0 || j2 == Block.field_384_L.field_376_bc)
            {
                func_41060_a(p_516_1_, p_516_3_, p_516_4_ + j1, p_516_5_, Block.field_385_K.field_376_bc, field_48193_b);
                if(j1 > 0)
                {
                    if(p_516_2_.nextInt(3) > 0 && p_516_1_.func_20084_d(p_516_3_ - 1, p_516_4_ + j1, p_516_5_))
                    {
                        func_41060_a(p_516_1_, p_516_3_ - 1, p_516_4_ + j1, p_516_5_, Block.field_35278_bv.field_376_bc, 8);
                    }
                    if(p_516_2_.nextInt(3) > 0 && p_516_1_.func_20084_d(p_516_3_, p_516_4_ + j1, p_516_5_ - 1))
                    {
                        func_41060_a(p_516_1_, p_516_3_, p_516_4_ + j1, p_516_5_ - 1, Block.field_35278_bv.field_376_bc, 1);
                    }
                }
            }
            if(j1 >= i - 1)
            {
                continue;
            }
            j2 = p_516_1_.func_600_a(p_516_3_ + 1, p_516_4_ + j1, p_516_5_);
            if(j2 == 0 || j2 == Block.field_384_L.field_376_bc)
            {
                func_41060_a(p_516_1_, p_516_3_ + 1, p_516_4_ + j1, p_516_5_, Block.field_385_K.field_376_bc, field_48193_b);
                if(j1 > 0)
                {
                    if(p_516_2_.nextInt(3) > 0 && p_516_1_.func_20084_d(p_516_3_ + 2, p_516_4_ + j1, p_516_5_))
                    {
                        func_41060_a(p_516_1_, p_516_3_ + 2, p_516_4_ + j1, p_516_5_, Block.field_35278_bv.field_376_bc, 2);
                    }
                    if(p_516_2_.nextInt(3) > 0 && p_516_1_.func_20084_d(p_516_3_ + 1, p_516_4_ + j1, p_516_5_ - 1))
                    {
                        func_41060_a(p_516_1_, p_516_3_ + 1, p_516_4_ + j1, p_516_5_ - 1, Block.field_35278_bv.field_376_bc, 1);
                    }
                }
            }
            j2 = p_516_1_.func_600_a(p_516_3_ + 1, p_516_4_ + j1, p_516_5_ + 1);
            if(j2 == 0 || j2 == Block.field_384_L.field_376_bc)
            {
                func_41060_a(p_516_1_, p_516_3_ + 1, p_516_4_ + j1, p_516_5_ + 1, Block.field_385_K.field_376_bc, field_48193_b);
                if(j1 > 0)
                {
                    if(p_516_2_.nextInt(3) > 0 && p_516_1_.func_20084_d(p_516_3_ + 2, p_516_4_ + j1, p_516_5_ + 1))
                    {
                        func_41060_a(p_516_1_, p_516_3_ + 2, p_516_4_ + j1, p_516_5_ + 1, Block.field_35278_bv.field_376_bc, 2);
                    }
                    if(p_516_2_.nextInt(3) > 0 && p_516_1_.func_20084_d(p_516_3_ + 1, p_516_4_ + j1, p_516_5_ + 2))
                    {
                        func_41060_a(p_516_1_, p_516_3_ + 1, p_516_4_ + j1, p_516_5_ + 2, Block.field_35278_bv.field_376_bc, 4);
                    }
                }
            }
            j2 = p_516_1_.func_600_a(p_516_3_, p_516_4_ + j1, p_516_5_ + 1);
            if(j2 != 0 && j2 != Block.field_384_L.field_376_bc)
            {
                continue;
            }
            func_41060_a(p_516_1_, p_516_3_, p_516_4_ + j1, p_516_5_ + 1, Block.field_385_K.field_376_bc, field_48193_b);
            if(j1 <= 0)
            {
                continue;
            }
            if(p_516_2_.nextInt(3) > 0 && p_516_1_.func_20084_d(p_516_3_ - 1, p_516_4_ + j1, p_516_5_ + 1))
            {
                func_41060_a(p_516_1_, p_516_3_ - 1, p_516_4_ + j1, p_516_5_ + 1, Block.field_35278_bv.field_376_bc, 8);
            }
            if(p_516_2_.nextInt(3) > 0 && p_516_1_.func_20084_d(p_516_3_, p_516_4_ + j1, p_516_5_ + 2))
            {
                func_41060_a(p_516_1_, p_516_3_, p_516_4_ + j1, p_516_5_ + 2, Block.field_35278_bv.field_376_bc, 4);
            }
        }

        return true;
    }

    private void func_48192_a(World p_48192_1_, int p_48192_2_, int p_48192_3_, int p_48192_4_, int p_48192_5_, Random p_48192_6_)
    {
        byte byte0 = 2;
        for(int i = p_48192_4_ - byte0; i <= p_48192_4_; i++)
        {
            int j = i - p_48192_4_;
            int k = (p_48192_5_ + 1) - j;
            for(int l = p_48192_2_ - k; l <= p_48192_2_ + k + 1; l++)
            {
                int i1 = l - p_48192_2_;
                for(int j1 = p_48192_3_ - k; j1 <= p_48192_3_ + k + 1; j1++)
                {
                    int k1 = j1 - p_48192_3_;
                    if((i1 >= 0 || k1 >= 0 || i1 * i1 + k1 * k1 <= k * k) && (i1 <= 0 && k1 <= 0 || i1 * i1 + k1 * k1 <= (k + 1) * (k + 1)) && (p_48192_6_.nextInt(4) != 0 || i1 * i1 + k1 * k1 <= (k - 1) * (k - 1)) && !Block.field_343_p[p_48192_1_.func_600_a(l, i, j1)])
                    {
                        func_41060_a(p_48192_1_, l, i, j1, Block.field_384_L.field_376_bc, field_48194_c);
                    }
                }

            }

        }

    }
}
