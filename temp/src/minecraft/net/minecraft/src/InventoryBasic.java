// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            IInventory, ItemStack, IInvBasic, EntityPlayer

public class InventoryBasic
    implements IInventory
{

    private String field_20072_a;
    private int field_20071_b;
    private ItemStack field_20074_c[];
    private List field_20073_d;

    public InventoryBasic(String p_i448_1_, int p_i448_2_)
    {
        field_20072_a = p_i448_1_;
        field_20071_b = p_i448_2_;
        field_20074_c = new ItemStack[p_i448_2_];
    }

    public ItemStack func_468_c(int p_468_1_)
    {
        return field_20074_c[p_468_1_];
    }

    public ItemStack func_473_a(int p_473_1_, int p_473_2_)
    {
        if(field_20074_c[p_473_1_] != null)
        {
            if(field_20074_c[p_473_1_].field_1615_a <= p_473_2_)
            {
                ItemStack itemstack = field_20074_c[p_473_1_];
                field_20074_c[p_473_1_] = null;
                func_474_j_();
                return itemstack;
            }
            ItemStack itemstack1 = field_20074_c[p_473_1_].func_1085_a(p_473_2_);
            if(field_20074_c[p_473_1_].field_1615_a == 0)
            {
                field_20074_c[p_473_1_] = null;
            }
            func_474_j_();
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public ItemStack func_48081_b(int p_48081_1_)
    {
        if(field_20074_c[p_48081_1_] != null)
        {
            ItemStack itemstack = field_20074_c[p_48081_1_];
            field_20074_c[p_48081_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int p_472_1_, ItemStack p_472_2_)
    {
        field_20074_c[p_472_1_] = p_472_2_;
        if(p_472_2_ != null && p_472_2_.field_1615_a > func_470_e())
        {
            p_472_2_.field_1615_a = func_470_e();
        }
        func_474_j_();
    }

    public int func_469_c()
    {
        return field_20071_b;
    }

    public String func_471_d()
    {
        return field_20072_a;
    }

    public int func_470_e()
    {
        return 64;
    }

    public void func_474_j_()
    {
        if(field_20073_d != null)
        {
            for(int i = 0; i < field_20073_d.size(); i++)
            {
                ((IInvBasic)field_20073_d.get(i)).func_20134_a(this);
            }

        }
    }

    public boolean func_20070_a_(EntityPlayer p_20070_1_)
    {
        return true;
    }

    public void func_35142_x_()
    {
    }

    public void func_35141_y_()
    {
    }
}
