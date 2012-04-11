// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, IBlockAccess, TileEntity, 
//            Item, World, AxisAlignedBB

public class BlockSign extends BlockContainer
{

    private Class field_455_a;
    private boolean field_454_b;

    protected BlockSign(int p_i501_1_, Class p_i501_2_, boolean p_i501_3_)
    {
        super(p_i501_1_, Material.field_1335_c);
        field_454_b = p_i501_3_;
        field_378_bb = 4;
        field_455_a = p_i501_2_;
        float f = 0.25F;
        float f1 = 1.0F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int i)
    {
        return null;
    }

    public AxisAlignedBB func_246_f(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_)
    {
        func_238_a(p_246_1_, p_246_2_, p_246_3_, p_246_4_);
        return super.func_246_f(p_246_1_, p_246_2_, p_246_3_, p_246_4_);
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        if(field_454_b)
        {
            return;
        }
        int i = p_238_1_.func_602_e(p_238_2_, p_238_3_, p_238_4_);
        float f = 0.28125F;
        float f1 = 0.78125F;
        float f2 = 0.0F;
        float f3 = 1.0F;
        float f4 = 0.125F;
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        if(i == 2)
        {
            func_213_a(f2, f, 1.0F - f4, f3, f1, 1.0F);
        }
        if(i == 3)
        {
            func_213_a(f2, f, 0.0F, f3, f1, f4);
        }
        if(i == 4)
        {
            func_213_a(1.0F - f4, f, f2, 1.0F, f1, f3);
        }
        if(i == 5)
        {
            func_213_a(0.0F, f, f2, f4, f1, f3);
        }
    }

    public int func_210_f()
    {
        return -1;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public boolean func_48204_b(IBlockAccess p_48204_1_, int p_48204_2_, int p_48204_3_, int i)
    {
        return true;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public TileEntity func_283_a_()
    {
        try
        {
            return (TileEntity)field_455_a.newInstance();
        }
        catch(Exception exception)
        {
            throw new RuntimeException(exception);
        }
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Item.field_267_as.field_291_aS;
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        boolean flag = false;
        if(field_454_b)
        {
            if(!p_226_1_.func_599_f(p_226_2_, p_226_3_ - 1, p_226_4_).func_878_a())
            {
                flag = true;
            }
        } else
        {
            int i = p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_);
            flag = true;
            if(i == 2 && p_226_1_.func_599_f(p_226_2_, p_226_3_, p_226_4_ + 1).func_878_a())
            {
                flag = false;
            }
            if(i == 3 && p_226_1_.func_599_f(p_226_2_, p_226_3_, p_226_4_ - 1).func_878_a())
            {
                flag = false;
            }
            if(i == 4 && p_226_1_.func_599_f(p_226_2_ + 1, p_226_3_, p_226_4_).func_878_a())
            {
                flag = false;
            }
            if(i == 5 && p_226_1_.func_599_f(p_226_2_ - 1, p_226_3_, p_226_4_).func_878_a())
            {
                flag = false;
            }
        }
        if(flag)
        {
            func_259_b_(p_226_1_, p_226_2_, p_226_3_, p_226_4_, p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_), 0);
            p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
        }
        super.func_226_a(p_226_1_, p_226_2_, p_226_3_, p_226_4_, p_226_5_);
    }
}
