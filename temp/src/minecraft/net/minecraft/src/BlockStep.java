// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, IBlockAccess, World, 
//            Facing, ItemStack, AxisAlignedBB

public class BlockStep extends Block
{

    public static final String field_22037_a[] = {
        "stone", "sand", "wood", "cobble", "brick", "smoothStoneBrick"
    };
    private boolean field_20922_a;

    public BlockStep(int p_i219_1_, boolean p_i219_2_)
    {
        super(p_i219_1_, 6, Material.field_1334_d);
        field_20922_a = p_i219_2_;
        if(!p_i219_2_)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
        } else
        {
            field_343_p[p_i219_1_] = true;
        }
        func_256_d(255);
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        if(field_20922_a)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        } else
        {
            boolean flag = (p_238_1_.func_602_e(p_238_2_, p_238_3_, p_238_4_) & 8) != 0;
            if(flag)
            {
                func_213_a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            } else
            {
                func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            }
        }
    }

    public void func_237_e()
    {
        if(field_20922_a)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        } else
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
        }
    }

    public void func_230_a(World p_230_1_, int p_230_2_, int p_230_3_, int p_230_4_, AxisAlignedBB p_230_5_, ArrayList p_230_6_)
    {
        func_238_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_);
        super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        int i = p_232_2_ & 7;
        if(i == 0)
        {
            return p_232_1_ > 1 ? 5 : 6;
        }
        if(i == 1)
        {
            if(p_232_1_ == 0)
            {
                return 208;
            }
            return p_232_1_ != 1 ? 192 : 176;
        }
        if(i == 2)
        {
            return 4;
        }
        if(i == 3)
        {
            return 16;
        }
        if(i == 4)
        {
            return Block.field_409_am.field_378_bb;
        }
        if(i == 5)
        {
            return Block.field_35285_bn.field_378_bb;
        } else
        {
            return 6;
        }
    }

    public int func_218_a(int p_218_1_)
    {
        return func_232_a(p_218_1_, 0);
    }

    public boolean func_217_b()
    {
        return field_20922_a;
    }

    public void func_258_d(World p_258_1_, int p_258_2_, int p_258_3_, int p_258_4_, int p_258_5_)
    {
        if(p_258_5_ == 0 && !field_20922_a)
        {
            int i = p_258_1_.func_602_e(p_258_2_, p_258_3_, p_258_4_) & 7;
            p_258_1_.func_691_b(p_258_2_, p_258_3_, p_258_4_, i | 8);
        }
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Block.field_410_al.field_376_bc;
    }

    public int func_229_a(Random p_229_1_)
    {
        return !field_20922_a ? 1 : 2;
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return p_21025_1_ & 7;
    }

    public boolean func_242_c()
    {
        return field_20922_a;
    }

    public boolean func_260_c(IBlockAccess p_260_1_, int p_260_2_, int p_260_3_, int p_260_4_, int p_260_5_)
    {
        if(field_20922_a)
        {
            super.func_260_c(p_260_1_, p_260_2_, p_260_3_, p_260_4_, p_260_5_);
        }
        if(p_260_5_ != 1 && p_260_5_ != 0 && !super.func_260_c(p_260_1_, p_260_2_, p_260_3_, p_260_4_, p_260_5_))
        {
            return false;
        }
        int i = p_260_2_;
        int j = p_260_3_;
        int k = p_260_4_;
        i += Facing.field_31056_b[Facing.field_31057_a[p_260_5_]];
        j += Facing.field_31059_c[Facing.field_31057_a[p_260_5_]];
        k += Facing.field_31058_d[Facing.field_31057_a[p_260_5_]];
        boolean flag = (p_260_1_.func_602_e(i, j, k) & 8) != 0;
        if(!flag)
        {
            if(p_260_5_ == 1)
            {
                return true;
            }
            if(p_260_5_ == 0 && super.func_260_c(p_260_1_, p_260_2_, p_260_3_, p_260_4_, p_260_5_))
            {
                return true;
            } else
            {
                return p_260_1_.func_600_a(p_260_2_, p_260_3_, p_260_4_) != field_376_bc || (p_260_1_.func_602_e(p_260_2_, p_260_3_, p_260_4_) & 8) != 0;
            }
        }
        if(p_260_5_ == 0)
        {
            return true;
        }
        if(p_260_5_ == 1 && super.func_260_c(p_260_1_, p_260_2_, p_260_3_, p_260_4_, p_260_5_))
        {
            return true;
        } else
        {
            return p_260_1_.func_600_a(p_260_2_, p_260_3_, p_260_4_) != field_376_bc || (p_260_1_.func_602_e(p_260_2_, p_260_3_, p_260_4_) & 8) == 0;
        }
    }

    protected ItemStack func_41049_c_(int p_41049_1_)
    {
        return new ItemStack(Block.field_410_al.field_376_bc, 1, p_41049_1_ & 7);
    }

}
