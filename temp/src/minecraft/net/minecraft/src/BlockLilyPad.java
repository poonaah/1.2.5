// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            BlockFlower, AxisAlignedBB, Block, World, 
//            Material, IBlockAccess

public class BlockLilyPad extends BlockFlower
{

    protected BlockLilyPad(int p_i694_1_, int p_i694_2_)
    {
        super(p_i694_1_, p_i694_2_);
        float f = 0.5F;
        float f1 = 0.015625F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
    }

    public int func_210_f()
    {
        return 23;
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_)
    {
        return AxisAlignedBB.func_1161_b((double)p_221_2_ + field_370_bf, (double)p_221_3_ + field_368_bg, (double)p_221_4_ + field_366_bh, (double)p_221_2_ + field_364_bi, (double)p_221_3_ + field_362_bj, (double)p_221_4_ + field_360_bk);
    }

    public int func_35274_i()
    {
        return 0x208030;
    }

    public int func_31030_b(int p_31030_1_)
    {
        return 0x208030;
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        return super.func_243_a(p_243_1_, p_243_2_, p_243_3_, p_243_4_);
    }

    public int func_207_d(IBlockAccess p_207_1_, int p_207_2_, int p_207_3_, int p_207_4_)
    {
        return 0x208030;
    }

    protected boolean func_269_b(int p_269_1_)
    {
        return p_269_1_ == Block.field_399_C.field_376_bc;
    }

    public boolean func_223_g(World p_223_1_, int p_223_2_, int p_223_3_, int p_223_4_)
    {
        if(p_223_3_ < 0 || p_223_3_ >= 256)
        {
            return false;
        } else
        {
            return p_223_1_.func_599_f(p_223_2_, p_223_3_ - 1, p_223_4_) == Material.field_1332_f && p_223_1_.func_602_e(p_223_2_, p_223_3_ - 1, p_223_4_) == 0;
        }
    }
}
