// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Slot, ItemStack, ItemArmor, Item, 
//            Block, ContainerPlayer, IInventory

class SlotArmor extends Slot
{

    final int field_1124_c; /* synthetic field */
    final ContainerPlayer field_1123_d; /* synthetic field */

    SlotArmor(ContainerPlayer p_i89_1_, IInventory p_i89_2_, int p_i89_3_, int p_i89_4_, int p_i89_5_, int p_i89_6_)
    {
        field_1123_d = p_i89_1_;
        field_1124_c = p_i89_6_;
        super(p_i89_2_, p_i89_3_, p_i89_4_, p_i89_5_);
    }

    public int func_4104_e()
    {
        return 1;
    }

    public boolean func_4105_a(ItemStack p_4105_1_)
    {
        if(p_4105_1_.func_1091_a() instanceof ItemArmor)
        {
            return ((ItemArmor)p_4105_1_.func_1091_a()).field_313_aX == field_1124_c;
        }
        if(p_4105_1_.func_1091_a().field_291_aS == Block.field_4055_bb.field_376_bc)
        {
            return field_1124_c == 0;
        } else
        {
            return false;
        }
    }

    public int func_775_c()
    {
        return 15 + field_1124_c * 16;
    }
}
