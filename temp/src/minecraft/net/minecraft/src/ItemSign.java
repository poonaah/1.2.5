// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, World, Material, EntityPlayer, 
//            Block, MathHelper, ItemStack, TileEntitySign

public class ItemSign extends Item
{

    public ItemSign(int p_i159_1_)
    {
        super(p_i159_1_);
        field_290_aT = 1;
    }

    public boolean func_192_a(ItemStack p_192_1_, EntityPlayer p_192_2_, World p_192_3_, int p_192_4_, int p_192_5_, int p_192_6_, int p_192_7_)
    {
        if(p_192_7_ == 0)
        {
            return false;
        }
        if(!p_192_3_.func_599_f(p_192_4_, p_192_5_, p_192_6_).func_878_a())
        {
            return false;
        }
        if(p_192_7_ == 1)
        {
            p_192_5_++;
        }
        if(p_192_7_ == 2)
        {
            p_192_6_--;
        }
        if(p_192_7_ == 3)
        {
            p_192_6_++;
        }
        if(p_192_7_ == 4)
        {
            p_192_4_--;
        }
        if(p_192_7_ == 5)
        {
            p_192_4_++;
        }
        if(!p_192_2_.func_35190_e(p_192_4_, p_192_5_, p_192_6_))
        {
            return false;
        }
        if(!Block.field_443_aE.func_243_a(p_192_3_, p_192_4_, p_192_5_, p_192_6_))
        {
            return false;
        }
        if(p_192_7_ == 1)
        {
            int i = MathHelper.func_1108_b((double)(((p_192_2_.field_605_aq + 180F) * 16F) / 360F) + 0.5D) & 0xf;
            p_192_3_.func_688_b(p_192_4_, p_192_5_, p_192_6_, Block.field_443_aE.field_376_bc, i);
        } else
        {
            p_192_3_.func_688_b(p_192_4_, p_192_5_, p_192_6_, Block.field_4068_aJ.field_376_bc, p_192_7_);
        }
        p_192_1_.field_1615_a--;
        TileEntitySign tileentitysign = (TileEntitySign)p_192_3_.func_603_b(p_192_4_, p_192_5_, p_192_6_);
        if(tileentitysign != null)
        {
            p_192_2_.func_4052_a(tileentitysign);
        }
        return true;
    }
}
