// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, Facing, 
//            BlockPistonBase, IBlockAccess, AxisAlignedBB

public class BlockPistonExtension extends Block
{

    private int field_31053_a;

    public BlockPistonExtension(int p_i598_1_, int p_i598_2_)
    {
        super(p_i598_1_, p_i598_2_, Material.field_31067_B);
        field_31053_a = -1;
        func_4024_a(field_9251_h);
        func_222_c(0.5F);
    }

    public void func_31052_a_(int p_31052_1_)
    {
        field_31053_a = p_31052_1_;
    }

    public void func_31051_a()
    {
        field_31053_a = -1;
    }

    public void func_214_b(World p_214_1_, int p_214_2_, int p_214_3_, int p_214_4_)
    {
        super.func_214_b(p_214_1_, p_214_2_, p_214_3_, p_214_4_);
        int i = p_214_1_.func_602_e(p_214_2_, p_214_3_, p_214_4_);
        int k = Facing.field_31057_a[func_31050_c(i)];
        p_214_2_ += Facing.field_31056_b[k];
        p_214_3_ += Facing.field_31059_c[k];
        p_214_4_ += Facing.field_31058_d[k];
        int l = p_214_1_.func_600_a(p_214_2_, p_214_3_, p_214_4_);
        if(l == Block.field_9255_Z.field_376_bc || l == Block.field_9259_V.field_376_bc)
        {
            int j = p_214_1_.func_602_e(p_214_2_, p_214_3_, p_214_4_);
            if(BlockPistonBase.func_31046_e(j))
            {
                Block.field_345_n[l].func_259_b_(p_214_1_, p_214_2_, p_214_3_, p_214_4_, j, 0);
                p_214_1_.func_690_d(p_214_2_, p_214_3_, p_214_4_, 0);
            }
        }
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        int i = func_31050_c(p_232_2_);
        if(p_232_1_ == i)
        {
            if(field_31053_a >= 0)
            {
                return field_31053_a;
            }
            if((p_232_2_ & 8) != 0)
            {
                return field_378_bb - 1;
            } else
            {
                return field_378_bb;
            }
        }
        return p_232_1_ != Facing.field_31057_a[i] ? 108 : 107;
    }

    public int func_210_f()
    {
        return 17;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int i)
    {
        return false;
    }

    public boolean func_28030_e(World p_28030_1_, int p_28030_2_, int p_28030_3_, int i, int j)
    {
        return false;
    }

    public int func_229_a(Random p_229_1_)
    {
        return 0;
    }

    public void func_230_a(World p_230_1_, int p_230_2_, int p_230_3_, int p_230_4_, AxisAlignedBB p_230_5_, ArrayList p_230_6_)
    {
        int i = p_230_1_.func_602_e(p_230_2_, p_230_3_, p_230_4_);
        switch(func_31050_c(i))
        {
        case 0: // '\0'
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
            func_213_a(0.375F, 0.25F, 0.375F, 0.625F, 1.0F, 0.625F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
            break;

        case 1: // '\001'
            func_213_a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
            func_213_a(0.375F, 0.0F, 0.375F, 0.625F, 0.75F, 0.625F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
            break;

        case 2: // '\002'
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
            func_213_a(0.25F, 0.375F, 0.25F, 0.75F, 0.625F, 1.0F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
            break;

        case 3: // '\003'
            func_213_a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
            func_213_a(0.25F, 0.375F, 0.0F, 0.75F, 0.625F, 0.75F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
            break;

        case 4: // '\004'
            func_213_a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
            func_213_a(0.375F, 0.25F, 0.25F, 0.625F, 0.75F, 1.0F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
            break;

        case 5: // '\005'
            func_213_a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
            func_213_a(0.0F, 0.375F, 0.25F, 0.75F, 0.625F, 0.75F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
            break;
        }
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        int i = p_238_1_.func_602_e(p_238_2_, p_238_3_, p_238_4_);
        switch(func_31050_c(i))
        {
        case 0: // '\0'
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
            break;

        case 1: // '\001'
            func_213_a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;

        case 2: // '\002'
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
            break;

        case 3: // '\003'
            func_213_a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
            break;

        case 4: // '\004'
            func_213_a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
            break;

        case 5: // '\005'
            func_213_a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            break;
        }
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        int i = func_31050_c(p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_));
        int j = p_226_1_.func_600_a(p_226_2_ - Facing.field_31056_b[i], p_226_3_ - Facing.field_31059_c[i], p_226_4_ - Facing.field_31058_d[i]);
        if(j != Block.field_9255_Z.field_376_bc && j != Block.field_9259_V.field_376_bc)
        {
            p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
        } else
        {
            Block.field_345_n[j].func_226_a(p_226_1_, p_226_2_ - Facing.field_31056_b[i], p_226_3_ - Facing.field_31059_c[i], p_226_4_ - Facing.field_31058_d[i], p_226_5_);
        }
    }

    public static int func_31050_c(int p_31050_0_)
    {
        return p_31050_0_ & 7;
    }
}
