// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Slot, ItemStack, Item, ItemPotion, 
//            AchievementList, EntityPlayer, ContainerBrewingStand, IInventory

class SlotBrewingStandPotion extends Slot
{

    private EntityPlayer field_40440_f;
    final ContainerBrewingStand field_40441_a; /* synthetic field */

    public SlotBrewingStandPotion(ContainerBrewingStand p_i373_1_, EntityPlayer p_i373_2_, IInventory p_i373_3_, int p_i373_4_, int p_i373_5_, int p_i373_6_)
    {
        field_40441_a = p_i373_1_;
        super(p_i373_3_, p_i373_4_, p_i373_5_, p_i373_6_);
        field_40440_f = p_i373_2_;
    }

    public boolean func_4105_a(ItemStack p_4105_1_)
    {
        return p_4105_1_ != null && (p_4105_1_.field_1617_c == Item.field_40413_bs.field_291_aS || p_4105_1_.field_1617_c == Item.field_40416_bt.field_291_aS);
    }

    public int func_4104_e()
    {
        return 1;
    }

    public void func_4103_a(ItemStack p_4103_1_)
    {
        if(p_4103_1_.field_1617_c == Item.field_40413_bs.field_291_aS && p_4103_1_.func_21181_i() > 0)
        {
            field_40440_f.func_25058_a(AchievementList.field_40461_A, 1);
        }
        super.func_4103_a(p_4103_1_);
    }
}
