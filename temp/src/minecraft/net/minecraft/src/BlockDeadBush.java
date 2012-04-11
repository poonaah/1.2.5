// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockFlower, Material, Block, World, 
//            EntityPlayer, ItemStack, Item, ItemShears, 
//            StatList

public class BlockDeadBush extends BlockFlower
{

    protected BlockDeadBush(int p_i348_1_, int p_i348_2_)
    {
        super(p_i348_1_, p_i348_2_, Material.field_35495_k);
        float f = 0.4F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
    }

    protected boolean func_269_b(int p_269_1_)
    {
        return p_269_1_ == Block.field_393_F.field_376_bc;
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        return field_378_bb;
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return -1;
    }

    public void func_220_a_(World p_220_1_, EntityPlayer p_220_2_, int p_220_3_, int p_220_4_, int p_220_5_, int p_220_6_)
    {
        if(!p_220_1_.field_1026_y && p_220_2_.func_6416_v() != null && p_220_2_.func_6416_v().field_1617_c == Item.field_31001_bc.field_291_aS)
        {
            p_220_2_.func_25058_a(StatList.field_25159_y[field_376_bc], 1);
            func_31027_a(p_220_1_, p_220_3_, p_220_4_, p_220_5_, new ItemStack(Block.field_9256_Y, 1, p_220_6_));
        } else
        {
            super.func_220_a_(p_220_1_, p_220_2_, p_220_3_, p_220_4_, p_220_5_, p_220_6_);
        }
    }
}
