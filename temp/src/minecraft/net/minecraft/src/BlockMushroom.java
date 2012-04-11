// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockFlower, World, Block, BlockMycelium, 
//            WorldGenBigMushroom, WorldGenerator

public class BlockMushroom extends BlockFlower
{

    protected BlockMushroom(int p_i134_1_, int p_i134_2_)
    {
        super(p_i134_1_, p_i134_2_);
        float f = 0.2F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        func_253_b(true);
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        if(p_208_5_.nextInt(25) == 0)
        {
            byte byte0 = 4;
            int i = 5;
            for(int j = p_208_2_ - byte0; j <= p_208_2_ + byte0; j++)
            {
                for(int l = p_208_4_ - byte0; l <= p_208_4_ + byte0; l++)
                {
                    for(int j1 = p_208_3_ - 1; j1 <= p_208_3_ + 1; j1++)
                    {
                        if(p_208_1_.func_600_a(j, j1, l) == field_376_bc && --i <= 0)
                        {
                            return;
                        }
                    }

                }

            }

            int k = (p_208_2_ + p_208_5_.nextInt(3)) - 1;
            int i1 = (p_208_3_ + p_208_5_.nextInt(2)) - p_208_5_.nextInt(2);
            int k1 = (p_208_4_ + p_208_5_.nextInt(3)) - 1;
            for(int l1 = 0; l1 < 4; l1++)
            {
                if(p_208_1_.func_20084_d(k, i1, k1) && func_223_g(p_208_1_, k, i1, k1))
                {
                    p_208_2_ = k;
                    p_208_3_ = i1;
                    p_208_4_ = k1;
                }
                k = (p_208_2_ + p_208_5_.nextInt(3)) - 1;
                i1 = (p_208_3_ + p_208_5_.nextInt(2)) - p_208_5_.nextInt(2);
                k1 = (p_208_4_ + p_208_5_.nextInt(3)) - 1;
            }

            if(p_208_1_.func_20084_d(k, i1, k1) && func_223_g(p_208_1_, k, i1, k1))
            {
                p_208_1_.func_690_d(k, i1, k1, field_376_bc);
            }
        }
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        return super.func_243_a(p_243_1_, p_243_2_, p_243_3_, p_243_4_) && func_223_g(p_243_1_, p_243_2_, p_243_3_, p_243_4_);
    }

    protected boolean func_269_b(int p_269_1_)
    {
        return Block.field_343_p[p_269_1_];
    }

    public boolean func_223_g(World p_223_1_, int p_223_2_, int p_223_3_, int p_223_4_)
    {
        if(p_223_3_ < 0 || p_223_3_ >= 256)
        {
            return false;
        } else
        {
            int i = p_223_1_.func_600_a(p_223_2_, p_223_3_ - 1, p_223_4_);
            return i == Block.field_40199_bz.field_376_bc || p_223_1_.func_28104_m(p_223_2_, p_223_3_, p_223_4_) < 13 && func_269_b(i);
        }
    }

    public boolean func_35293_c(World p_35293_1_, int p_35293_2_, int p_35293_3_, int p_35293_4_, Random p_35293_5_)
    {
        int i = p_35293_1_.func_602_e(p_35293_2_, p_35293_3_, p_35293_4_);
        p_35293_1_.func_634_a(p_35293_2_, p_35293_3_, p_35293_4_, 0);
        WorldGenBigMushroom worldgenbigmushroom = null;
        if(field_376_bc == Block.field_415_ag.field_376_bc)
        {
            worldgenbigmushroom = new WorldGenBigMushroom(0);
        } else
        if(field_376_bc == Block.field_414_ah.field_376_bc)
        {
            worldgenbigmushroom = new WorldGenBigMushroom(1);
        }
        if(worldgenbigmushroom == null || !worldgenbigmushroom.func_516_a(p_35293_1_, p_35293_5_, p_35293_2_, p_35293_3_, p_35293_4_))
        {
            p_35293_1_.func_643_a(p_35293_2_, p_35293_3_, p_35293_4_, field_376_bc, i);
            return false;
        } else
        {
            return true;
        }
    }
}
