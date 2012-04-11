// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, BlockGrass, 
//            Item, AxisAlignedBB

public class BlockReed extends Block
{

    protected BlockReed(int p_i108_1_, int p_i108_2_)
    {
        super(p_i108_1_, Material.field_1329_i);
        field_378_bb = p_i108_2_;
        float f = 0.375F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
        func_253_b(true);
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        if(p_208_1_.func_20084_d(p_208_2_, p_208_3_ + 1, p_208_4_))
        {
            int i;
            for(i = 1; p_208_1_.func_600_a(p_208_2_, p_208_3_ - i, p_208_4_) == field_376_bc; i++) { }
            if(i < 3)
            {
                int j = p_208_1_.func_602_e(p_208_2_, p_208_3_, p_208_4_);
                if(j == 15)
                {
                    p_208_1_.func_690_d(p_208_2_, p_208_3_ + 1, p_208_4_, field_376_bc);
                    p_208_1_.func_691_b(p_208_2_, p_208_3_, p_208_4_, 0);
                } else
                {
                    p_208_1_.func_691_b(p_208_2_, p_208_3_, p_208_4_, j + 1);
                }
            }
        }
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        int i = p_243_1_.func_600_a(p_243_2_, p_243_3_ - 1, p_243_4_);
        if(i == field_376_bc)
        {
            return true;
        }
        if(i != Block.field_337_v.field_376_bc && i != Block.field_336_w.field_376_bc && i != Block.field_393_F.field_376_bc)
        {
            return false;
        }
        if(p_243_1_.func_599_f(p_243_2_ - 1, p_243_3_ - 1, p_243_4_) == Material.field_1332_f)
        {
            return true;
        }
        if(p_243_1_.func_599_f(p_243_2_ + 1, p_243_3_ - 1, p_243_4_) == Material.field_1332_f)
        {
            return true;
        }
        if(p_243_1_.func_599_f(p_243_2_, p_243_3_ - 1, p_243_4_ - 1) == Material.field_1332_f)
        {
            return true;
        }
        return p_243_1_.func_599_f(p_243_2_, p_243_3_ - 1, p_243_4_ + 1) == Material.field_1332_f;
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        func_303_h(p_226_1_, p_226_2_, p_226_3_, p_226_4_);
    }

    protected final void func_303_h(World p_303_1_, int p_303_2_, int p_303_3_, int p_303_4_)
    {
        if(!func_223_g(p_303_1_, p_303_2_, p_303_3_, p_303_4_))
        {
            func_259_b_(p_303_1_, p_303_2_, p_303_3_, p_303_4_, p_303_1_.func_602_e(p_303_2_, p_303_3_, p_303_4_), 0);
            p_303_1_.func_690_d(p_303_2_, p_303_3_, p_303_4_, 0);
        }
    }

    public boolean func_223_g(World p_223_1_, int p_223_2_, int p_223_3_, int p_223_4_)
    {
        return func_243_a(p_223_1_, p_223_2_, p_223_3_, p_223_4_);
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int i)
    {
        return null;
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Item.field_302_aH.field_291_aS;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_210_f()
    {
        return 1;
    }
}
