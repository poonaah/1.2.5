// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material, AxisAlignedBB, Entity, 
//            World

public class BlockSoulSand extends Block
{

    public BlockSoulSand(int p_i60_1_, int p_i60_2_)
    {
        super(p_i60_1_, p_i60_2_, Material.field_1325_m);
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_)
    {
        float f = 0.125F;
        return AxisAlignedBB.func_1161_b(p_221_2_, p_221_3_, p_221_4_, p_221_2_ + 1, (float)(p_221_3_ + 1) - f, p_221_4_ + 1);
    }

    public void func_236_b(World p_236_1_, int p_236_2_, int p_236_3_, int p_236_4_, Entity p_236_5_)
    {
        p_236_5_.field_608_an *= 0.40000000000000002D;
        p_236_5_.field_606_ap *= 0.40000000000000002D;
    }
}
