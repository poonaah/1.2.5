// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Slot, Item, ItemStack, ContainerBrewingStand, 
//            IInventory

class SlotBrewingStandIngredient extends Slot
{

    final ContainerBrewingStand field_40442_a; /* synthetic field */

    public SlotBrewingStandIngredient(ContainerBrewingStand p_i648_1_, IInventory p_i648_2_, int p_i648_3_, int p_i648_4_, int p_i648_5_)
    {
        field_40442_a = p_i648_1_;
        super(p_i648_2_, p_i648_3_, p_i648_4_, p_i648_5_);
    }

    public boolean func_4105_a(ItemStack p_4105_1_)
    {
        if(p_4105_1_ != null)
        {
            return Item.field_233_c[p_4105_1_.field_1617_c].func_40406_n();
        } else
        {
            return false;
        }
    }

    public int func_4104_e()
    {
        return 64;
    }
}
