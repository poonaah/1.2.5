// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, World, TileEntityPiston, 
//            Block, Facing, AxisAlignedBB, IBlockAccess, 
//            TileEntity, EntityPlayer

public class BlockPistonMoving extends BlockContainer
{

    public BlockPistonMoving(int p_i508_1_)
    {
        super(p_i508_1_, Material.field_31067_B);
        func_222_c(-1F);
    }

    public TileEntity func_283_a_()
    {
        return null;
    }

    public void func_235_e(World world, int i, int j, int k)
    {
    }

    public void func_214_b(World p_214_1_, int p_214_2_, int p_214_3_, int p_214_4_)
    {
        TileEntity tileentity = p_214_1_.func_603_b(p_214_2_, p_214_3_, p_214_4_);
        if(tileentity != null && (tileentity instanceof TileEntityPiston))
        {
            ((TileEntityPiston)tileentity).func_31011_l();
        } else
        {
            super.func_214_b(p_214_1_, p_214_2_, p_214_3_, p_214_4_);
        }
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int i)
    {
        return false;
    }

    public boolean func_28030_e(World p_28030_1_, int p_28030_2_, int p_28030_3_, int i, int j)
    {
        return false;
    }

    public int func_210_f()
    {
        return -1;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public boolean func_250_a(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_, EntityPlayer p_250_5_)
    {
        if(!p_250_1_.field_1026_y && p_250_1_.func_603_b(p_250_2_, p_250_3_, p_250_4_) == null)
        {
            p_250_1_.func_690_d(p_250_2_, p_250_3_, p_250_4_, 0);
            return true;
        } else
        {
            return false;
        }
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return 0;
    }

    public void func_216_a(World p_216_1_, int p_216_2_, int p_216_3_, int p_216_4_, int p_216_5_, float p_216_6_, int p_216_7_)
    {
        if(p_216_1_.field_1026_y)
        {
            return;
        }
        TileEntityPiston tileentitypiston = func_31034_c(p_216_1_, p_216_2_, p_216_3_, p_216_4_);
        if(tileentitypiston == null)
        {
            return;
        } else
        {
            Block.field_345_n[tileentitypiston.func_31016_a()].func_259_b_(p_216_1_, p_216_2_, p_216_3_, p_216_4_, tileentitypiston.func_479_f(), 0);
            return;
        }
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        if(!p_226_1_.field_1026_y)
        {
            if(p_226_1_.func_603_b(p_226_2_, p_226_3_, p_226_4_) != null);
        }
    }

    public static TileEntity func_31036_a(int p_31036_0_, int p_31036_1_, int p_31036_2_, boolean p_31036_3_, boolean p_31036_4_)
    {
        return new TileEntityPiston(p_31036_0_, p_31036_1_, p_31036_2_, p_31036_3_, p_31036_4_);
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_)
    {
        TileEntityPiston tileentitypiston = func_31034_c(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
        if(tileentitypiston == null)
        {
            return null;
        }
        float f = tileentitypiston.func_31008_a(0.0F);
        if(tileentitypiston.func_31015_b())
        {
            f = 1.0F - f;
        }
        return func_31035_a(p_221_1_, p_221_2_, p_221_3_, p_221_4_, tileentitypiston.func_31016_a(), f, tileentitypiston.func_31009_d());
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        TileEntityPiston tileentitypiston = func_31034_c(p_238_1_, p_238_2_, p_238_3_, p_238_4_);
        if(tileentitypiston != null)
        {
            Block block = Block.field_345_n[tileentitypiston.func_31016_a()];
            if(block == null || block == this)
            {
                return;
            }
            block.func_238_a(p_238_1_, p_238_2_, p_238_3_, p_238_4_);
            float f = tileentitypiston.func_31008_a(0.0F);
            if(tileentitypiston.func_31015_b())
            {
                f = 1.0F - f;
            }
            int i = tileentitypiston.func_31009_d();
            field_370_bf = block.field_370_bf - (double)((float)Facing.field_31056_b[i] * f);
            field_368_bg = block.field_368_bg - (double)((float)Facing.field_31059_c[i] * f);
            field_366_bh = block.field_366_bh - (double)((float)Facing.field_31058_d[i] * f);
            field_364_bi = block.field_364_bi - (double)((float)Facing.field_31056_b[i] * f);
            field_362_bj = block.field_362_bj - (double)((float)Facing.field_31059_c[i] * f);
            field_360_bk = block.field_360_bk - (double)((float)Facing.field_31058_d[i] * f);
        }
    }

    public AxisAlignedBB func_31035_a(World p_31035_1_, int p_31035_2_, int p_31035_3_, int p_31035_4_, int p_31035_5_, float p_31035_6_, int p_31035_7_)
    {
        if(p_31035_5_ == 0 || p_31035_5_ == field_376_bc)
        {
            return null;
        }
        AxisAlignedBB axisalignedbb = Block.field_345_n[p_31035_5_].func_221_d(p_31035_1_, p_31035_2_, p_31035_3_, p_31035_4_);
        if(axisalignedbb == null)
        {
            return null;
        }
        if(Facing.field_31056_b[p_31035_7_] < 0)
        {
            axisalignedbb.field_1698_a -= (float)Facing.field_31056_b[p_31035_7_] * p_31035_6_;
        } else
        {
            axisalignedbb.field_1703_d -= (float)Facing.field_31056_b[p_31035_7_] * p_31035_6_;
        }
        if(Facing.field_31059_c[p_31035_7_] < 0)
        {
            axisalignedbb.field_1697_b -= (float)Facing.field_31059_c[p_31035_7_] * p_31035_6_;
        } else
        {
            axisalignedbb.field_1702_e -= (float)Facing.field_31059_c[p_31035_7_] * p_31035_6_;
        }
        if(Facing.field_31058_d[p_31035_7_] < 0)
        {
            axisalignedbb.field_1704_c -= (float)Facing.field_31058_d[p_31035_7_] * p_31035_6_;
        } else
        {
            axisalignedbb.field_1701_f -= (float)Facing.field_31058_d[p_31035_7_] * p_31035_6_;
        }
        return axisalignedbb;
    }

    private TileEntityPiston func_31034_c(IBlockAccess p_31034_1_, int p_31034_2_, int p_31034_3_, int p_31034_4_)
    {
        TileEntity tileentity = p_31034_1_.func_603_b(p_31034_2_, p_31034_3_, p_31034_4_);
        if(tileentity != null && (tileentity instanceof TileEntityPiston))
        {
            return (TileEntityPiston)tileentity;
        } else
        {
            return null;
        }
    }
}
