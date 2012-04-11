// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, ItemStack, World, EntityPlayer, 
//            EnumAction

public class ItemBucketMilk extends Item
{

    public ItemBucketMilk(int p_i512_1_)
    {
        super(p_i512_1_);
        func_21009_c(1);
    }

    public ItemStack func_35413_b(ItemStack p_35413_1_, World p_35413_2_, EntityPlayer p_35413_3_)
    {
        p_35413_1_.field_1615_a--;
        if(!p_35413_2_.field_1026_y)
        {
            p_35413_3_.func_40112_aN();
        }
        if(p_35413_1_.field_1615_a <= 0)
        {
            return new ItemStack(Item.field_262_au);
        } else
        {
            return p_35413_1_;
        }
    }

    public int func_35411_c(ItemStack p_35411_1_)
    {
        return 32;
    }

    public EnumAction func_35412_b(ItemStack p_35412_1_)
    {
        return EnumAction.drink;
    }

    public ItemStack func_193_a(ItemStack p_193_1_, World p_193_2_, EntityPlayer p_193_3_)
    {
        p_193_3_.func_35199_b(p_193_1_, func_35411_c(p_193_1_));
        return p_193_1_;
    }
}
