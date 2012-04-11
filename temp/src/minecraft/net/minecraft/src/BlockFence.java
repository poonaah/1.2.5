// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material, AxisAlignedBB, IBlockAccess, 
//            World

public class BlockFence extends Block
{

    public BlockFence(int p_i765_1_, int p_i765_2_)
    {
        super(p_i765_1_, p_i765_2_, Material.field_1335_c);
    }

    public BlockFence(int p_i766_1_, int p_i766_2_, Material p_i766_3_)
    {
        super(p_i766_1_, p_i766_2_, p_i766_3_);
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        return super.func_243_a(p_243_1_, p_243_2_, p_243_3_, p_243_4_);
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_)
    {
        boolean flag = func_35303_f(p_221_1_, p_221_2_, p_221_3_, p_221_4_ - 1);
        boolean flag1 = func_35303_f(p_221_1_, p_221_2_, p_221_3_, p_221_4_ + 1);
        boolean flag2 = func_35303_f(p_221_1_, p_221_2_ - 1, p_221_3_, p_221_4_);
        boolean flag3 = func_35303_f(p_221_1_, p_221_2_ + 1, p_221_3_, p_221_4_);
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.375F;
        float f3 = 0.625F;
        if(flag)
        {
            f2 = 0.0F;
        }
        if(flag1)
        {
            f3 = 1.0F;
        }
        if(flag2)
        {
            f = 0.0F;
        }
        if(flag3)
        {
            f1 = 1.0F;
        }
        return AxisAlignedBB.func_1161_b((float)p_221_2_ + f, p_221_3_, (float)p_221_4_ + f2, (float)p_221_2_ + f1, (float)p_221_3_ + 1.5F, (float)p_221_4_ + f3);
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        boolean flag = func_35303_f(p_238_1_, p_238_2_, p_238_3_, p_238_4_ - 1);
        boolean flag1 = func_35303_f(p_238_1_, p_238_2_, p_238_3_, p_238_4_ + 1);
        boolean flag2 = func_35303_f(p_238_1_, p_238_2_ - 1, p_238_3_, p_238_4_);
        boolean flag3 = func_35303_f(p_238_1_, p_238_2_ + 1, p_238_3_, p_238_4_);
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.375F;
        float f3 = 0.625F;
        if(flag)
        {
            f2 = 0.0F;
        }
        if(flag1)
        {
            f3 = 1.0F;
        }
        if(flag2)
        {
            f = 0.0F;
        }
        if(flag3)
        {
            f1 = 1.0F;
        }
        func_213_a(f, 0.0F, f2, f1, 1.0F, f3);
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public boolean func_48204_b(IBlockAccess p_48204_1_, int p_48204_2_, int p_48204_3_, int i)
    {
        return false;
    }

    public int func_210_f()
    {
        return 11;
    }

    public boolean func_35303_f(IBlockAccess p_35303_1_, int p_35303_2_, int p_35303_3_, int p_35303_4_)
    {
        int i = p_35303_1_.func_600_a(p_35303_2_, p_35303_3_, p_35303_4_);
        if(i == field_376_bc || i == Block.field_35277_bw.field_376_bc)
        {
            return true;
        }
        Block block = Block.field_345_n[i];
        if(block != null && block.field_356_bn.func_28126_h() && block.func_242_c())
        {
            return block.field_356_bn != Material.field_4261_w;
        } else
        {
            return false;
        }
    }
}
