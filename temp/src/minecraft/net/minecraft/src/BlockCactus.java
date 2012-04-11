// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, AxisAlignedBB, 
//            DamageSource, Entity

public class BlockCactus extends Block
{

    protected BlockCactus(int p_i69_1_, int p_i69_2_)
    {
        super(p_i69_1_, p_i69_2_, Material.field_1317_u);
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

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_)
    {
        float f = 0.0625F;
        return AxisAlignedBB.func_1161_b((float)p_221_2_ + f, p_221_3_, (float)p_221_4_ + f, (float)(p_221_2_ + 1) - f, (float)(p_221_3_ + 1) - f, (float)(p_221_4_ + 1) - f);
    }

    public AxisAlignedBB func_246_f(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_)
    {
        float f = 0.0625F;
        return AxisAlignedBB.func_1161_b((float)p_246_2_ + f, p_246_3_, (float)p_246_4_ + f, (float)(p_246_2_ + 1) - f, p_246_3_ + 1, (float)(p_246_4_ + 1) - f);
    }

    public int func_218_a(int p_218_1_)
    {
        if(p_218_1_ == 1)
        {
            return field_378_bb - 1;
        }
        if(p_218_1_ == 0)
        {
            return field_378_bb + 1;
        } else
        {
            return field_378_bb;
        }
    }

    public boolean func_242_c()
    {
        return false;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public int func_210_f()
    {
        return 13;
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        if(!super.func_243_a(p_243_1_, p_243_2_, p_243_3_, p_243_4_))
        {
            return false;
        } else
        {
            return func_223_g(p_243_1_, p_243_2_, p_243_3_, p_243_4_);
        }
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        if(!func_223_g(p_226_1_, p_226_2_, p_226_3_, p_226_4_))
        {
            func_259_b_(p_226_1_, p_226_2_, p_226_3_, p_226_4_, p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_), 0);
            p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
        }
    }

    public boolean func_223_g(World p_223_1_, int p_223_2_, int p_223_3_, int p_223_4_)
    {
        if(p_223_1_.func_599_f(p_223_2_ - 1, p_223_3_, p_223_4_).func_878_a())
        {
            return false;
        }
        if(p_223_1_.func_599_f(p_223_2_ + 1, p_223_3_, p_223_4_).func_878_a())
        {
            return false;
        }
        if(p_223_1_.func_599_f(p_223_2_, p_223_3_, p_223_4_ - 1).func_878_a())
        {
            return false;
        }
        if(p_223_1_.func_599_f(p_223_2_, p_223_3_, p_223_4_ + 1).func_878_a())
        {
            return false;
        } else
        {
            int i = p_223_1_.func_600_a(p_223_2_, p_223_3_ - 1, p_223_4_);
            return i == Block.field_425_aW.field_376_bc || i == Block.field_393_F.field_376_bc;
        }
    }

    public void func_236_b(World p_236_1_, int p_236_2_, int p_236_3_, int p_236_4_, Entity p_236_5_)
    {
        p_236_5_.func_396_a(DamageSource.field_35537_g, 1);
    }
}
