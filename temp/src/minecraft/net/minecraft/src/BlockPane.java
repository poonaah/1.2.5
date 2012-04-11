// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, IBlockAccess, World, Material, 
//            AxisAlignedBB

public class BlockPane extends Block
{

    private int field_35300_a;
    private final boolean field_40213_b;

    protected BlockPane(int p_i185_1_, int p_i185_2_, int p_i185_3_, Material p_i185_4_, boolean p_i185_5_)
    {
        super(p_i185_1_, p_i185_2_, p_i185_4_);
        field_35300_a = p_i185_3_;
        field_40213_b = p_i185_5_;
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        if(!field_40213_b)
        {
            return 0;
        } else
        {
            return super.func_240_a(p_240_1_, p_240_2_, p_240_3_);
        }
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
        return 18;
    }

    public boolean func_260_c(IBlockAccess p_260_1_, int p_260_2_, int p_260_3_, int p_260_4_, int p_260_5_)
    {
        int i = p_260_1_.func_600_a(p_260_2_, p_260_3_, p_260_4_);
        if(i == field_376_bc)
        {
            return false;
        } else
        {
            return super.func_260_c(p_260_1_, p_260_2_, p_260_3_, p_260_4_, p_260_5_);
        }
    }

    public void func_230_a(World p_230_1_, int p_230_2_, int p_230_3_, int p_230_4_, AxisAlignedBB p_230_5_, ArrayList p_230_6_)
    {
        boolean flag = func_35298_d(p_230_1_.func_600_a(p_230_2_, p_230_3_, p_230_4_ - 1));
        boolean flag1 = func_35298_d(p_230_1_.func_600_a(p_230_2_, p_230_3_, p_230_4_ + 1));
        boolean flag2 = func_35298_d(p_230_1_.func_600_a(p_230_2_ - 1, p_230_3_, p_230_4_));
        boolean flag3 = func_35298_d(p_230_1_.func_600_a(p_230_2_ + 1, p_230_3_, p_230_4_));
        if(flag2 && flag3 || !flag2 && !flag3 && !flag && !flag1)
        {
            func_213_a(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
        } else
        if(flag2 && !flag3)
        {
            func_213_a(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
        } else
        if(!flag2 && flag3)
        {
            func_213_a(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
        }
        if(flag && flag1 || !flag2 && !flag3 && !flag && !flag1)
        {
            func_213_a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
        } else
        if(flag && !flag1)
        {
            func_213_a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
        } else
        if(!flag && flag1)
        {
            func_213_a(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
        }
    }

    public void func_237_e()
    {
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        float f = 0.4375F;
        float f1 = 0.5625F;
        float f2 = 0.4375F;
        float f3 = 0.5625F;
        boolean flag = func_35298_d(p_238_1_.func_600_a(p_238_2_, p_238_3_, p_238_4_ - 1));
        boolean flag1 = func_35298_d(p_238_1_.func_600_a(p_238_2_, p_238_3_, p_238_4_ + 1));
        boolean flag2 = func_35298_d(p_238_1_.func_600_a(p_238_2_ - 1, p_238_3_, p_238_4_));
        boolean flag3 = func_35298_d(p_238_1_.func_600_a(p_238_2_ + 1, p_238_3_, p_238_4_));
        if(flag2 && flag3 || !flag2 && !flag3 && !flag && !flag1)
        {
            f = 0.0F;
            f1 = 1.0F;
        } else
        if(flag2 && !flag3)
        {
            f = 0.0F;
        } else
        if(!flag2 && flag3)
        {
            f1 = 1.0F;
        }
        if(flag && flag1 || !flag2 && !flag3 && !flag && !flag1)
        {
            f2 = 0.0F;
            f3 = 1.0F;
        } else
        if(flag && !flag1)
        {
            f2 = 0.0F;
        } else
        if(!flag && flag1)
        {
            f3 = 1.0F;
        }
        func_213_a(f, 0.0F, f2, f1, 1.0F, f3);
    }

    public int func_35299_s()
    {
        return field_35300_a;
    }

    public final boolean func_35298_d(int p_35298_1_)
    {
        return Block.field_343_p[p_35298_1_] || p_35298_1_ == field_376_bc || p_35298_1_ == Block.field_382_N.field_376_bc;
    }
}
