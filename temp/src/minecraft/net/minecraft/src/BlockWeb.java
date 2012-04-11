// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, Entity, Item, 
//            World, AxisAlignedBB

public class BlockWeb extends Block
{

    public BlockWeb(int p_i468_1_, int p_i468_2_)
    {
        super(p_i468_1_, p_i468_2_, Material.field_31068_A);
    }

    public void func_236_b(World p_236_1_, int p_236_2_, int p_236_3_, int p_236_4_, Entity p_236_5_)
    {
        p_236_5_.func_35112_o();
    }

    public boolean func_217_b()
    {
        return false;
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int i)
    {
        return null;
    }

    public int func_210_f()
    {
        return 1;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Item.field_253_I.field_291_aS;
    }
}
