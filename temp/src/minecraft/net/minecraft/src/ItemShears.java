// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, Block, BlockLeaves, BlockTallGrass, 
//            ItemStack, EntityLiving

public class ItemShears extends Item
{

    public ItemShears(int p_i242_1_)
    {
        super(p_i242_1_);
        func_21009_c(1);
        func_21013_d(238);
    }

    public boolean func_25008_a(ItemStack p_25008_1_, int p_25008_2_, int p_25008_3_, int p_25008_4_, int p_25008_5_, EntityLiving p_25008_6_)
    {
        if(p_25008_2_ == Block.field_384_L.field_376_bc || p_25008_2_ == Block.field_9258_W.field_376_bc || p_25008_2_ == Block.field_9257_X.field_376_bc || p_25008_2_ == Block.field_35278_bv.field_376_bc)
        {
            p_25008_1_.func_25190_a(1, p_25008_6_);
            return true;
        } else
        {
            return super.func_25008_a(p_25008_1_, p_25008_2_, p_25008_3_, p_25008_4_, p_25008_5_, p_25008_6_);
        }
    }

    public boolean func_4018_a(Block p_4018_1_)
    {
        return p_4018_1_.field_376_bc == Block.field_9258_W.field_376_bc;
    }

    public float func_204_a(ItemStack p_204_1_, Block p_204_2_)
    {
        if(p_204_2_.field_376_bc == Block.field_9258_W.field_376_bc || p_204_2_.field_376_bc == Block.field_384_L.field_376_bc)
        {
            return 15F;
        }
        if(p_204_2_.field_376_bc == Block.field_419_ac.field_376_bc)
        {
            return 5F;
        } else
        {
            return super.func_204_a(p_204_1_, p_204_2_);
        }
    }
}
