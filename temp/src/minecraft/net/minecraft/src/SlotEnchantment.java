// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Slot, ContainerEnchantment, IInventory, ItemStack

class SlotEnchantment extends Slot
{

    final ContainerEnchantment field_40443_a; /* synthetic field */

    SlotEnchantment(ContainerEnchantment p_i593_1_, IInventory p_i593_2_, int p_i593_3_, int p_i593_4_, int p_i593_5_)
    {
        field_40443_a = p_i593_1_;
        super(p_i593_2_, p_i593_3_, p_i593_4_, p_i593_5_);
    }

    public boolean func_4105_a(ItemStack p_4105_1_)
    {
        return true;
    }
}
