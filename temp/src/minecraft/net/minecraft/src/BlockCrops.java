// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockFlower, Block, World, EntityItem, 
//            ItemStack, Item

public class BlockCrops extends BlockFlower
{

    protected BlockCrops(int p_i403_1_, int p_i403_2_)
    {
        super(p_i403_1_, p_i403_2_);
        field_378_bb = p_i403_2_;
        func_253_b(true);
        float f = 0.5F;
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
            int i = p_208_1_.func_602_e(p_208_2_, p_208_3_, p_208_4_);
            if(i < 7)
            {
                float f = func_270_i(p_208_1_, p_208_2_, p_208_3_, p_208_4_);
                if(p_208_5_.nextInt((int)(25F / f) + 1) == 0)
                {
                    i++;
                    p_208_1_.func_691_b(p_208_2_, p_208_3_, p_208_4_, i);
                }
            }
        }
    }

    public void func_21027_c_(World p_21027_1_, int p_21027_2_, int p_21027_3_, int p_21027_4_)
    {
        p_21027_1_.func_691_b(p_21027_2_, p_21027_3_, p_21027_4_, 7);
    }

    private float func_270_i(World p_270_1_, int p_270_2_, int p_270_3_, int p_270_4_)
    {
        float f = 1.0F;
        int i = p_270_1_.func_600_a(p_270_2_, p_270_3_, p_270_4_ - 1);
        int j = p_270_1_.func_600_a(p_270_2_, p_270_3_, p_270_4_ + 1);
        int k = p_270_1_.func_600_a(p_270_2_ - 1, p_270_3_, p_270_4_);
        int l = p_270_1_.func_600_a(p_270_2_ + 1, p_270_3_, p_270_4_);
        int i1 = p_270_1_.func_600_a(p_270_2_ - 1, p_270_3_, p_270_4_ - 1);
        int j1 = p_270_1_.func_600_a(p_270_2_ + 1, p_270_3_, p_270_4_ - 1);
        int k1 = p_270_1_.func_600_a(p_270_2_ + 1, p_270_3_, p_270_4_ + 1);
        int l1 = p_270_1_.func_600_a(p_270_2_ - 1, p_270_3_, p_270_4_ + 1);
        boolean flag = k == field_376_bc || l == field_376_bc;
        boolean flag1 = i == field_376_bc || j == field_376_bc;
        boolean flag2 = i1 == field_376_bc || j1 == field_376_bc || k1 == field_376_bc || l1 == field_376_bc;
        for(int i2 = p_270_2_ - 1; i2 <= p_270_2_ + 1; i2++)
        {
            for(int j2 = p_270_4_ - 1; j2 <= p_270_4_ + 1; j2++)
            {
                int k2 = p_270_1_.func_600_a(i2, p_270_3_ - 1, j2);
                float f1 = 0.0F;
                if(k2 == Block.field_446_aB.field_376_bc)
                {
                    f1 = 1.0F;
                    if(p_270_1_.func_602_e(i2, p_270_3_ - 1, j2) > 0)
                    {
                        f1 = 3F;
                    }
                }
                if(i2 != p_270_2_ || j2 != p_270_4_)
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

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        if(p_232_2_ < 0)
        {
            p_232_2_ = 7;
        }
        return field_378_bb + p_232_2_;
    }

    public int func_210_f()
    {
        return 6;
    }

    public void func_216_a(World p_216_1_, int p_216_2_, int p_216_3_, int p_216_4_, int p_216_5_, float p_216_6_, int p_216_7_)
    {
        super.func_216_a(p_216_1_, p_216_2_, p_216_3_, p_216_4_, p_216_5_, p_216_6_, 0);
        if(p_216_1_.field_1026_y)
        {
            return;
        }
        int i = 3 + p_216_7_;
        for(int j = 0; j < i; j++)
        {
            if(p_216_1_.field_1037_n.nextInt(15) <= p_216_5_)
            {
                float f = 0.7F;
                float f1 = p_216_1_.field_1037_n.nextFloat() * f + (1.0F - f) * 0.5F;
                float f2 = p_216_1_.field_1037_n.nextFloat() * f + (1.0F - f) * 0.5F;
                float f3 = p_216_1_.field_1037_n.nextFloat() * f + (1.0F - f) * 0.5F;
                EntityItem entityitem = new EntityItem(p_216_1_, (float)p_216_2_ + f1, (float)p_216_3_ + f2, (float)p_216_4_ + f3, new ItemStack(Item.field_244_Q));
                entityitem.field_805_c = 10;
                p_216_1_.func_674_a(entityitem);
            }
        }

    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        if(p_240_1_ == 7)
        {
            return Item.field_243_R.field_291_aS;
        } else
        {
            return -1;
        }
    }

    public int func_229_a(Random p_229_1_)
    {
        return 1;
    }
}
