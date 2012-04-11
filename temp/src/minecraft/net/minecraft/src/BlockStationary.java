// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockFluid, Material, World, Block, 
//            BlockFire, IBlockAccess

public class BlockStationary extends BlockFluid
{

    protected BlockStationary(int p_i53_1_, Material p_i53_2_)
    {
        super(p_i53_1_, p_i53_2_);
        func_253_b(false);
        if(p_i53_2_ == Material.field_1331_g)
        {
            func_253_b(true);
        }
    }

    public boolean func_48204_b(IBlockAccess p_48204_1_, int p_48204_2_, int p_48204_3_, int p_48204_4_)
    {
        return field_356_bn != Material.field_1331_g;
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        super.func_226_a(p_226_1_, p_226_2_, p_226_3_, p_226_4_, p_226_5_);
        if(p_226_1_.func_600_a(p_226_2_, p_226_3_, p_226_4_) == field_376_bc)
        {
            func_30004_j(p_226_1_, p_226_2_, p_226_3_, p_226_4_);
        }
    }

    private void func_30004_j(World p_30004_1_, int p_30004_2_, int p_30004_3_, int p_30004_4_)
    {
        int i = p_30004_1_.func_602_e(p_30004_2_, p_30004_3_, p_30004_4_);
        p_30004_1_.field_1043_h = true;
        p_30004_1_.func_643_a(p_30004_2_, p_30004_3_, p_30004_4_, field_376_bc - 1, i);
        p_30004_1_.func_701_b(p_30004_2_, p_30004_3_, p_30004_4_, p_30004_2_, p_30004_3_, p_30004_4_);
        p_30004_1_.func_22136_c(p_30004_2_, p_30004_3_, p_30004_4_, field_376_bc - 1, func_4025_d());
        p_30004_1_.field_1043_h = false;
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        if(field_356_bn == Material.field_1331_g)
        {
            int i = p_208_5_.nextInt(3);
            for(int j = 0; j < i; j++)
            {
                p_208_2_ += p_208_5_.nextInt(3) - 1;
                p_208_3_++;
                p_208_4_ += p_208_5_.nextInt(3) - 1;
                int l = p_208_1_.func_600_a(p_208_2_, p_208_3_, p_208_4_);
                if(l == 0)
                {
                    if(func_301_k(p_208_1_, p_208_2_ - 1, p_208_3_, p_208_4_) || func_301_k(p_208_1_, p_208_2_ + 1, p_208_3_, p_208_4_) || func_301_k(p_208_1_, p_208_2_, p_208_3_, p_208_4_ - 1) || func_301_k(p_208_1_, p_208_2_, p_208_3_, p_208_4_ + 1) || func_301_k(p_208_1_, p_208_2_, p_208_3_ - 1, p_208_4_) || func_301_k(p_208_1_, p_208_2_, p_208_3_ + 1, p_208_4_))
                    {
                        p_208_1_.func_690_d(p_208_2_, p_208_3_, p_208_4_, Block.field_402_as.field_376_bc);
                        return;
                    }
                    continue;
                }
                if(Block.field_345_n[l].field_356_bn.func_880_c())
                {
                    return;
                }
            }

            if(i == 0)
            {
                int k = p_208_2_;
                int i1 = p_208_4_;
                for(int j1 = 0; j1 < 3; j1++)
                {
                    p_208_2_ = (k + p_208_5_.nextInt(3)) - 1;
                    p_208_4_ = (i1 + p_208_5_.nextInt(3)) - 1;
                    if(p_208_1_.func_20084_d(p_208_2_, p_208_3_ + 1, p_208_4_) && func_301_k(p_208_1_, p_208_2_, p_208_3_, p_208_4_))
                    {
                        p_208_1_.func_690_d(p_208_2_, p_208_3_ + 1, p_208_4_, Block.field_402_as.field_376_bc);
                    }
                }

            }
        }
    }

    private boolean func_301_k(World p_301_1_, int p_301_2_, int p_301_3_, int p_301_4_)
    {
        return p_301_1_.func_599_f(p_301_2_, p_301_3_, p_301_4_).func_876_e();
    }
}
