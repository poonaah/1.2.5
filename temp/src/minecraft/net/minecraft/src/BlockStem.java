// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockFlower, Block, World, BlockGrass, 
//            IBlockAccess, Item, EntityItem, ItemStack

public class BlockStem extends BlockFlower
{

    private Block field_35297_a;

    protected BlockStem(int p_i63_1_, Block p_i63_2_)
    {
        super(p_i63_1_, 111);
        field_35297_a = p_i63_2_;
        func_253_b(true);
        float f = 0.125F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
    }

    protected boolean func_269_b(int p_269_1_)
    {
        return p_269_1_ == Block.field_446_aB.field_376_bc;
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        super.func_208_a(p_208_1_, p_208_2_, p_208_3_, p_208_4_, p_208_5_);
        if(p_208_1_.func_618_j(p_208_2_, p_208_3_ + 1, p_208_4_) >= 9)
        {
            float f = func_35295_j(p_208_1_, p_208_2_, p_208_3_, p_208_4_);
            if(p_208_5_.nextInt((int)(25F / f) + 1) == 0)
            {
                int i = p_208_1_.func_602_e(p_208_2_, p_208_3_, p_208_4_);
                if(i < 7)
                {
                    i++;
                    p_208_1_.func_691_b(p_208_2_, p_208_3_, p_208_4_, i);
                } else
                {
                    if(p_208_1_.func_600_a(p_208_2_ - 1, p_208_3_, p_208_4_) == field_35297_a.field_376_bc)
                    {
                        return;
                    }
                    if(p_208_1_.func_600_a(p_208_2_ + 1, p_208_3_, p_208_4_) == field_35297_a.field_376_bc)
                    {
                        return;
                    }
                    if(p_208_1_.func_600_a(p_208_2_, p_208_3_, p_208_4_ - 1) == field_35297_a.field_376_bc)
                    {
                        return;
                    }
                    if(p_208_1_.func_600_a(p_208_2_, p_208_3_, p_208_4_ + 1) == field_35297_a.field_376_bc)
                    {
                        return;
                    }
                    int j = p_208_5_.nextInt(4);
                    int k = p_208_2_;
                    int l = p_208_4_;
                    if(j == 0)
                    {
                        k--;
                    }
                    if(j == 1)
                    {
                        k++;
                    }
                    if(j == 2)
                    {
                        l--;
                    }
                    if(j == 3)
                    {
                        l++;
                    }
                    int i1 = p_208_1_.func_600_a(k, p_208_3_ - 1, l);
                    if(p_208_1_.func_600_a(k, p_208_3_, l) == 0 && (i1 == Block.field_446_aB.field_376_bc || i1 == Block.field_336_w.field_376_bc || i1 == Block.field_337_v.field_376_bc))
                    {
                        p_208_1_.func_690_d(k, p_208_3_, l, field_35297_a.field_376_bc);
                    }
                }
            }
        }
    }

    public void func_35294_i(World p_35294_1_, int p_35294_2_, int p_35294_3_, int p_35294_4_)
    {
        p_35294_1_.func_691_b(p_35294_2_, p_35294_3_, p_35294_4_, 7);
    }

    private float func_35295_j(World p_35295_1_, int p_35295_2_, int p_35295_3_, int p_35295_4_)
    {
        float f = 1.0F;
        int i = p_35295_1_.func_600_a(p_35295_2_, p_35295_3_, p_35295_4_ - 1);
        int j = p_35295_1_.func_600_a(p_35295_2_, p_35295_3_, p_35295_4_ + 1);
        int k = p_35295_1_.func_600_a(p_35295_2_ - 1, p_35295_3_, p_35295_4_);
        int l = p_35295_1_.func_600_a(p_35295_2_ + 1, p_35295_3_, p_35295_4_);
        int i1 = p_35295_1_.func_600_a(p_35295_2_ - 1, p_35295_3_, p_35295_4_ - 1);
        int j1 = p_35295_1_.func_600_a(p_35295_2_ + 1, p_35295_3_, p_35295_4_ - 1);
        int k1 = p_35295_1_.func_600_a(p_35295_2_ + 1, p_35295_3_, p_35295_4_ + 1);
        int l1 = p_35295_1_.func_600_a(p_35295_2_ - 1, p_35295_3_, p_35295_4_ + 1);
        boolean flag = k == field_376_bc || l == field_376_bc;
        boolean flag1 = i == field_376_bc || j == field_376_bc;
        boolean flag2 = i1 == field_376_bc || j1 == field_376_bc || k1 == field_376_bc || l1 == field_376_bc;
        for(int i2 = p_35295_2_ - 1; i2 <= p_35295_2_ + 1; i2++)
        {
            for(int j2 = p_35295_4_ - 1; j2 <= p_35295_4_ + 1; j2++)
            {
                int k2 = p_35295_1_.func_600_a(i2, p_35295_3_ - 1, j2);
                float f1 = 0.0F;
                if(k2 == Block.field_446_aB.field_376_bc)
                {
                    f1 = 1.0F;
                    if(p_35295_1_.func_602_e(i2, p_35295_3_ - 1, j2) > 0)
                    {
                        f1 = 3F;
                    }
                }
                if(i2 != p_35295_2_ || j2 != p_35295_4_)
                {
                    f1 /= 4F;
                }
                f += f1;
            }

        }

        if(flag2 || flag && flag1)
        {
            f /= 2.0F;
        }
        return f;
    }

    public int func_31030_b(int p_31030_1_)
    {
        int i = p_31030_1_ * 32;
        int j = 255 - p_31030_1_ * 8;
        int k = p_31030_1_ * 4;
        return i << 16 | j << 8 | k;
    }

    public int func_207_d(IBlockAccess p_207_1_, int p_207_2_, int p_207_3_, int p_207_4_)
    {
        return func_31030_b(p_207_1_.func_602_e(p_207_2_, p_207_3_, p_207_4_));
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        return field_378_bb;
    }

    public void func_237_e()
    {
        float f = 0.125F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        field_362_bj = (float)(p_238_1_.func_602_e(p_238_2_, p_238_3_, p_238_4_) * 2 + 2) / 16F;
        float f = 0.125F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, (float)field_362_bj, 0.5F + f);
    }

    public int func_210_f()
    {
        return 19;
    }

    public int func_35296_f(IBlockAccess p_35296_1_, int p_35296_2_, int p_35296_3_, int p_35296_4_)
    {
        int i = p_35296_1_.func_602_e(p_35296_2_, p_35296_3_, p_35296_4_);
        if(i < 7)
        {
            return -1;
        }
        if(p_35296_1_.func_600_a(p_35296_2_ - 1, p_35296_3_, p_35296_4_) == field_35297_a.field_376_bc)
        {
            return 0;
        }
        if(p_35296_1_.func_600_a(p_35296_2_ + 1, p_35296_3_, p_35296_4_) == field_35297_a.field_376_bc)
        {
            return 1;
        }
        if(p_35296_1_.func_600_a(p_35296_2_, p_35296_3_, p_35296_4_ - 1) == field_35297_a.field_376_bc)
        {
            return 2;
        }
        return p_35296_1_.func_600_a(p_35296_2_, p_35296_3_, p_35296_4_ + 1) != field_35297_a.field_376_bc ? -1 : 3;
    }

    public void func_216_a(World p_216_1_, int p_216_2_, int p_216_3_, int p_216_4_, int p_216_5_, float p_216_6_, int p_216_7_)
    {
        super.func_216_a(p_216_1_, p_216_2_, p_216_3_, p_216_4_, p_216_5_, p_216_6_, p_216_7_);
        if(p_216_1_.field_1026_y)
        {
            return;
        }
        Item item = null;
        if(field_35297_a == Block.field_4055_bb)
        {
            item = Item.field_35422_bh;
        }
        if(field_35297_a == Block.field_35281_bs)
        {
            item = Item.field_35423_bi;
        }
        for(int i = 0; i < 3; i++)
        {
            if(p_216_1_.field_1037_n.nextInt(15) <= p_216_5_)
            {
                float f = 0.7F;
                float f1 = p_216_1_.field_1037_n.nextFloat() * f + (1.0F - f) * 0.5F;
                float f2 = p_216_1_.field_1037_n.nextFloat() * f + (1.0F - f) * 0.5F;
                float f3 = p_216_1_.field_1037_n.nextFloat() * f + (1.0F - f) * 0.5F;
                EntityItem entityitem = new EntityItem(p_216_1_, (float)p_216_2_ + f1, (float)p_216_3_ + f2, (float)p_216_4_ + f3, new ItemStack(item));
                entityitem.field_805_c = 10;
                p_216_1_.func_674_a(entityitem);
            }
        }

    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        if(p_240_1_ != 7);
        return -1;
    }

    public int func_229_a(Random p_229_1_)
    {
        return 1;
    }
}
