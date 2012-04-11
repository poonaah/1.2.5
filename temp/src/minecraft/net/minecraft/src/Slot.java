// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemStack, IInventory

public class Slot
{

    private final int field_1119_a;
    public final IInventory field_1118_b;
    public int field_20007_a;
    public int field_20006_b;
    public int field_20008_c;

    public Slot(IInventory p_i706_1_, int p_i706_2_, int p_i706_3_, int p_i706_4_)
    {
        field_1118_b = p_i706_1_;
        field_1119_a = p_i706_2_;
        field_20006_b = p_i706_3_;
        field_20008_c = p_i706_4_;
    }

    public void func_48433_a(ItemStack p_48433_1_, ItemStack p_48433_2_)
    {
        if(p_48433_1_ == null || p_48433_2_ == null)
        {
            return;
        }
        if(p_48433_1_.field_1617_c != p_48433_2_.field_1617_c)
        {
            return;
        }
        int i = p_48433_2_.field_1615_a - p_48433_1_.field_1615_a;
        if(i > 0)
        {
            func_48435_a(p_48433_1_, i);
        }
    }

    protected void func_48435_a(ItemStack itemstack, int i)
    {
    }

    protected void func_48434_c(ItemStack itemstack)
    {
    }

    public void func_4103_a(ItemStack p_4103_1_)
    {
        func_779_d();
    }

    public boolean func_4105_a(ItemStack p_4105_1_)
    {
        return true;
    }

    public ItemStack func_777_b()
    {
        return field_1118_b.func_468_c(field_1119_a);
    }

    public boolean func_20005_c()
    {
        return func_777_b() != null;
    }

    public void func_776_b(ItemStack p_776_1_)
    {
        field_1118_b.func_472_a(field_1119_a, p_776_1_);
        func_779_d();
    }

    public void func_779_d()
    {
        field_1118_b.func_474_j_();
    }

    public int func_4104_e()
    {
        return field_1118_b.func_470_e();
    }

    public int func_775_c()
    {
        return -1;
    }

    public ItemStack func_20004_a(int p_20004_1_)
    {
        return field_1118_b.func_473_a(field_1119_a, p_20004_1_);
    }
}
