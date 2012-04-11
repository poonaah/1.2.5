// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemFood, ItemStack, Item, World, 
//            EntityPlayer

public class ItemSoup extends ItemFood
{

    public ItemSoup(int p_i248_1_, int p_i248_2_)
    {
        super(p_i248_1_, p_i248_2_, false);
        func_21009_c(1);
    }

    public ItemStack func_35413_b(ItemStack p_35413_1_, World p_35413_2_, EntityPlayer p_35413_3_)
    {
        super.func_35413_b(p_35413_1_, p_35413_2_, p_35413_3_);
        return new ItemStack(Item.field_264_C);
    }
}
