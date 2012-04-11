// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IInventory, ItemStack, Container, EntityPlayer

public class InventoryCrafting
    implements IInventory
{

    private ItemStack field_840_a[];
    private int field_21104_b;
    private Container field_841_c;

    public InventoryCrafting(Container p_i34_1_, int p_i34_2_, int p_i34_3_)
    {
        int i = p_i34_2_ * p_i34_3_;
        field_840_a = new ItemStack[i];
        field_841_c = p_i34_1_;
        field_21104_b = p_i34_2_;
    }

    public int func_469_c()
    {
        return field_840_a.length;
    }

    public ItemStack func_468_c(int p_468_1_)
    {
        if(p_468_1_ >= func_469_c())
        {
            return null;
        } else
        {
            return field_840_a[p_468_1_];
        }
    }

    public ItemStack func_21103_b(int p_21103_1_, int p_21103_2_)
    {
        if(p_21103_1_ < 0 || p_21103_1_ >= field_21104_b)
        {
            return null;
        } else
        {
            int i = p_21103_1_ + p_21103_2_ * field_21104_b;
            return func_468_c(i);
        }
    }

    public String func_471_d()
    {
        return "container.crafting";
    }

    public ItemStack func_48081_b(int p_48081_1_)
    {
        if(field_840_a[p_48081_1_] != null)
        {
            ItemStack itemstack = field_840_a[p_48081_1_];
            field_840_a[p_48081_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public ItemStack func_473_a(int p_473_1_, int p_473_2_)
    {
        if(field_840_a[p_473_1_] != null)
        {
            if(field_840_a[p_473_1_].field_1615_a <= p_473_2_)
            {
                ItemStack itemstack = field_840_a[p_473_1_];
                field_840_a[p_473_1_] = null;
                field_841_c.func_1103_a(this);
                return itemstack;
            }
            ItemStack itemstack1 = field_840_a[p_473_1_].func_1085_a(p_473_2_);
            if(field_840_a[p_473_1_].field_1615_a == 0)
            {
                field_840_a[p_473_1_] = null;
            }
            field_841_c.func_1103_a(this);
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int p_472_1_, ItemStack p_472_2_)
    {
        field_840_a[p_472_1_] = p_472_2_;
        field_841_c.func_1103_a(this);
    }

    public int func_470_e()
    {
        return 64;
    }

    public void func_474_j_()
    {
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
