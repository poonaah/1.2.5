// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockFlower, Block, World, BiomeGenHell, 
//            ItemStack, Item

public class BlockNetherStalk extends BlockFlower
{

    protected BlockNetherStalk(int p_i577_1_)
    {
        super(p_i577_1_, 226);
        func_253_b(true);
        float f = 0.5F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
    }

    protected boolean func_269_b(int p_269_1_)
    {
        return p_269_1_ == Block.field_4051_bd.field_376_bc;
    }

    public boolean func_223_g(World p_223_1_, int p_223_2_, int p_223_3_, int p_223_4_)
    {
        return func_269_b(p_223_1_.func_600_a(p_223_2_, p_223_3_ - 1, p_223_4_));
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        int i = p_208_1_.func_602_e(p_208_2_, p_208_3_, p_208_4_);
        if(i < 3)
        {
            BiomeGenBase biomegenbase = p_208_1_.func_48454_a(p_208_2_, p_208_4_);
            if((biomegenbase instanceof BiomeGenHell) && p_208_5_.nextInt(10) == 0)
            {
                i++;
                p_208_1_.func_691_b(p_208_2_, p_208_3_, p_208_4_, i);
            }
        }
        super.func_208_a(p_208_1_, p_208_2_, p_208_3_, p_208_4_, p_208_5_);
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        if(p_232_2_ >= 3)
        {
            return field_378_bb + 2;
        }
        if(p_232_2_ > 0)
        {
            return field_378_bb + 1;
        } else
        {
            return field_378_bb;
        }
    }

    public int func_210_f()
    {
        return 6;
    }

    public void func_216_a(World p_216_1_, int p_216_2_, int p_216_3_, int p_216_4_, int p_216_5_, float p_216_6_, int p_216_7_)
    {
        if(p_216_1_.field_1026_y)
        {
            return;
        }
        int i = 1;
        if(p_216_5_ >= 3)
        {
            i = 2 + p_216_1_.field_1037_n.nextInt(3);
            if(p_216_7_ > 0)
            {
                i += p_216_1_.field_1037_n.nextInt(p_216_7_ + 1);
            }
        }
        for(int j = 0; j < i; j++)
        {
            func_31027_a(p_216_1_, p_216_2_, p_216_3_, p_216_4_, new ItemStack(Item.field_40414_br));
        }

    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return 0;
    }

    public int func_229_a(Random p_229_1_)
    {
        return 0;
    }
}
