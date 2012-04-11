// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, AxisAlignedBB, World, 
//            Entity

public class BlockFarmland extends Block
{

    protected BlockFarmland(int p_i165_1_)
    {
        super(p_i165_1_, Material.field_1336_b);
        field_378_bb = 87;
        func_253_b(true);
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
        func_256_d(255);
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_)
    {
        return AxisAlignedBB.func_1161_b(p_221_2_ + 0, p_221_3_ + 0, p_221_4_ + 0, p_221_2_ + 1, p_221_3_ + 1, p_221_4_ + 1);
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        if(p_232_1_ == 1 && p_232_2_ > 0)
        {
            return field_378_bb - 1;
        }
        if(p_232_1_ == 1)
        {
            return field_378_bb;
        } else
        {
            return 2;
        }
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        if(func_274_i(p_208_1_, p_208_2_, p_208_3_, p_208_4_) || p_208_1_.func_27167_r(p_208_2_, p_208_3_ + 1, p_208_4_))
        {
            p_208_1_.func_691_b(p_208_2_, p_208_3_, p_208_4_, 7);
        } else
        {
            int i = p_208_1_.func_602_e(p_208_2_, p_208_3_, p_208_4_);
            if(i > 0)
            {
                p_208_1_.func_691_b(p_208_2_, p_208_3_, p_208_4_, i - 1);
            } else
            if(!func_275_h(p_208_1_, p_208_2_, p_208_3_, p_208_4_))
            {
                p_208_1_.func_690_d(p_208_2_, p_208_3_, p_208_4_, Block.field_336_w.field_376_bc);
            }
        }
    }

    public void func_43001_a(World p_43001_1_, int p_43001_2_, int p_43001_3_, int p_43001_4_, Entity p_43001_5_, float p_43001_6_)
    {
        if(p_43001_1_.field_1037_n.nextFloat() < p_43001_6_ - 0.5F)
        {
            p_43001_1_.func_690_d(p_43001_2_, p_43001_3_, p_43001_4_, Block.field_336_w.field_376_bc);
        }
    }

    private boolean func_275_h(World p_275_1_, int p_275_2_, int p_275_3_, int p_275_4_)
    {
        int i = 0;
        for(int j = p_275_2_ - i; j <= p_275_2_ + i; j++)
        {
            for(int k = p_275_4_ - i; k <= p_275_4_ + i; k++)
            {
                int l = p_275_1_.func_600_a(j, p_275_3_ + 1, k);
                if(l == Block.field_447_aA.field_376_bc || l == Block.field_35283_bu.field_376_bc || l == Block.field_35284_bt.field_376_bc)
                {
                    return true;
                }
            }

        }

        return false;
    }

    private boolean func_274_i(World p_274_1_, int p_274_2_, int p_274_3_, int p_274_4_)
    {
        for(int i = p_274_2_ - 4; i <= p_274_2_ + 4; i++)
        {
            for(int j = p_274_3_; j <= p_274_3_ + 1; j++)
            {
                for(int k = p_274_4_ - 4; k <= p_274_4_ + 4; k++)
                {
                    if(p_274_1_.func_599_f(i, j, k) == Material.field_1332_f)
                    {
                        return true;
                    }
                }

            }

        }

        return false;
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        super.func_226_a(p_226_1_, p_226_2_, p_226_3_, p_226_4_, p_226_5_);
        Material material = p_226_1_.func_599_f(p_226_2_, p_226_3_ + 1, p_226_4_);
        if(material.func_878_a())
        {
            p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, Block.field_336_w.field_376_bc);
        }
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Block.field_336_w.func_240_a(0, p_240_2_, p_240_3_);
    }
}
