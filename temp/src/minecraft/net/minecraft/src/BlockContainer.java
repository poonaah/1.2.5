// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, World, TileEntity, Material

public abstract class BlockContainer extends Block
{

    protected BlockContainer(int p_i115_1_, Material p_i115_2_)
    {
        super(p_i115_1_, p_i115_2_);
        field_48207_bU = true;
    }

    protected BlockContainer(int p_i116_1_, int p_i116_2_, Material p_i116_3_)
    {
        super(p_i116_1_, p_i116_2_, p_i116_3_);
        field_48207_bU = true;
    }

    public void func_235_e(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_)
    {
        super.func_235_e(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
        p_235_1_.func_654_a(p_235_2_, p_235_3_, p_235_4_, func_283_a_());
    }

    public void func_214_b(World p_214_1_, int p_214_2_, int p_214_3_, int p_214_4_)
    {
        super.func_214_b(p_214_1_, p_214_2_, p_214_3_, p_214_4_);
        p_214_1_.func_692_l(p_214_2_, p_214_3_, p_214_4_);
    }

    public abstract TileEntity func_283_a_();

    public void func_21024_a(World p_21024_1_, int p_21024_2_, int p_21024_3_, int p_21024_4_, int p_21024_5_, int p_21024_6_)
    {
        super.func_21024_a(p_21024_1_, p_21024_2_, p_21024_3_, p_21024_4_, p_21024_5_, p_21024_6_);
        TileEntity tileentity = p_21024_1_.func_603_b(p_21024_2_, p_21024_3_, p_21024_4_);
        if(tileentity != null)
        {
            tileentity.func_35143_b(p_21024_5_, p_21024_6_);
        }
    }
}
