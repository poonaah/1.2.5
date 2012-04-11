// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, AxisAlignedBB

public class BlockLadder extends Block
{

    protected BlockLadder(int p_i276_1_, int p_i276_2_)
    {
        super(p_i276_1_, p_i276_2_, Material.field_1324_n);
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_)
    {
        int i = p_221_1_.func_602_e(p_221_2_, p_221_3_, p_221_4_);
        float f = 0.125F;
        if(i == 2)
        {
            func_213_a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
        }
        if(i == 3)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
        }
        if(i == 4)
        {
            func_213_a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
        if(i == 5)
        {
            func_213_a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
        }
        return super.func_221_d(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
    }

    public AxisAlignedBB func_246_f(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_)
    {
        int i = p_246_1_.func_602_e(p_246_2_, p_246_3_, p_246_4_);
        float f = 0.125F;
        if(i == 2)
        {
            func_213_a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
        }
        if(i == 3)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
        }
        if(i == 4)
        {
            func_213_a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
        if(i == 5)
        {
            func_213_a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
        }
        return super.func_246_f(p_246_1_, p_246_2_, p_246_3_, p_246_4_);
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
        return 8;
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        if(p_243_1_.func_28100_h(p_243_2_ - 1, p_243_3_, p_243_4_))
        {
            return true;
        }
        if(p_243_1_.func_28100_h(p_243_2_ + 1, p_243_3_, p_243_4_))
        {
            return true;
        }
        if(p_243_1_.func_28100_h(p_243_2_, p_243_3_, p_243_4_ - 1))
        {
            return true;
        }
        return p_243_1_.func_28100_h(p_243_2_, p_243_3_, p_243_4_ + 1);
    }

    public void func_258_d(World p_258_1_, int p_258_2_, int p_258_3_, int p_258_4_, int p_258_5_)
    {
        int i = p_258_1_.func_602_e(p_258_2_, p_258_3_, p_258_4_);
        if((i == 0 || p_258_5_ == 2) && p_258_1_.func_28100_h(p_258_2_, p_258_3_, p_258_4_ + 1))
        {
            i = 2;
        }
        if((i == 0 || p_258_5_ == 3) && p_258_1_.func_28100_h(p_258_2_, p_258_3_, p_258_4_ - 1))
        {
            i = 3;
        }
        if((i == 0 || p_258_5_ == 4) && p_258_1_.func_28100_h(p_258_2_ + 1, p_258_3_, p_258_4_))
        {
            i = 4;
        }
        if((i == 0 || p_258_5_ == 5) && p_258_1_.func_28100_h(p_258_2_ - 1, p_258_3_, p_258_4_))
        {
            i = 5;
        }
        p_258_1_.func_691_b(p_258_2_, p_258_3_, p_258_4_, i);
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        int i = p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_);
        boolean flag = false;
        if(i == 2 && p_226_1_.func_28100_h(p_226_2_, p_226_3_, p_226_4_ + 1))
        {
            flag = true;
        }
        if(i == 3 && p_226_1_.func_28100_h(p_226_2_, p_226_3_, p_226_4_ - 1))
        {
            flag = true;
        }
        if(i == 4 && p_226_1_.func_28100_h(p_226_2_ + 1, p_226_3_, p_226_4_))
        {
            flag = true;
        }
        if(i == 5 && p_226_1_.func_28100_h(p_226_2_ - 1, p_226_3_, p_226_4_))
        {
            flag = true;
        }
        if(!flag)
        {
            func_259_b_(p_226_1_, p_226_2_, p_226_3_, p_226_4_, i, 0);
            p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
        }
        super.func_226_a(p_226_1_, p_226_2_, p_226_3_, p_226_4_, p_226_5_);
    }

    public int func_229_a(Random p_229_1_)
    {
        return 1;
    }
}
