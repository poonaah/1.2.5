// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, BlockFlower, Material

public class BlockMushroomCap extends Block
{

    private int field_35292_a;

    public BlockMushroomCap(int p_i529_1_, Material p_i529_2_, int p_i529_3_, int p_i529_4_)
    {
        super(p_i529_1_, p_i529_3_, p_i529_2_);
        field_35292_a = p_i529_4_;
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        if(p_232_2_ == 10 && p_232_1_ > 1)
        {
            return field_378_bb - 1;
        }
        if(p_232_2_ >= 1 && p_232_2_ <= 9 && p_232_1_ == 1)
        {
            return field_378_bb - 16 - field_35292_a;
        }
        if(p_232_2_ >= 1 && p_232_2_ <= 3 && p_232_1_ == 2)
        {
            return field_378_bb - 16 - field_35292_a;
        }
        if(p_232_2_ >= 7 && p_232_2_ <= 9 && p_232_1_ == 3)
        {
            return field_378_bb - 16 - field_35292_a;
        }
        if((p_232_2_ == 1 || p_232_2_ == 4 || p_232_2_ == 7) && p_232_1_ == 4)
        {
            return field_378_bb - 16 - field_35292_a;
        }
        if((p_232_2_ == 3 || p_232_2_ == 6 || p_232_2_ == 9) && p_232_1_ == 5)
        {
            return field_378_bb - 16 - field_35292_a;
        }
        if(p_232_2_ == 14)
        {
            return field_378_bb - 16 - field_35292_a;
        }
        if(p_232_2_ == 15)
        {
            return field_378_bb - 1;
        } else
        {
            return field_378_bb;
        }
    }

    public int func_229_a(Random p_229_1_)
    {
        int i = p_229_1_.nextInt(10) - 7;
        if(i < 0)
        {
            i = 0;
        }
        return i;
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Block.field_415_ag.field_376_bc + field_35292_a;
    }
}
