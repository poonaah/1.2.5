// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            InventoryBasic, ContainerEnchantment

class SlotEnchantmentTable extends InventoryBasic
{

    final ContainerEnchantment field_40070_a; /* synthetic field */

    SlotEnchantmentTable(ContainerEnchantment p_i608_1_, String p_i608_2_, int p_i608_3_)
    {
        field_40070_a = p_i608_1_;
        super(p_i608_2_, p_i608_3_);
    }

    public int func_470_e()
    {
        return 1;
    }

    public void func_474_j_()
    {
        super.func_474_j_();
        field_40070_a.func_1103_a(this);
    }
}
