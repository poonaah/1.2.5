// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            TileEntity, IInventory, ItemStack, NBTTagCompound, 
//            NBTTagList, World, EntityPlayer

public class TileEntityDispenser extends TileEntity
    implements IInventory
{

    private ItemStack field_21102_a[];
    private Random field_21101_b;

    public TileEntityDispenser()
    {
        field_21102_a = new ItemStack[9];
        field_21101_b = new Random();
    }

    public int func_469_c()
    {
        return 9;
    }

    public ItemStack func_468_c(int p_468_1_)
    {
        return field_21102_a[p_468_1_];
    }

    public ItemStack func_473_a(int p_473_1_, int p_473_2_)
    {
        if(field_21102_a[p_473_1_] != null)
        {
            if(field_21102_a[p_473_1_].field_1615_a <= p_473_2_)
            {
                ItemStack itemstack = field_21102_a[p_473_1_];
                field_21102_a[p_473_1_] = null;
                func_474_j_();
                return itemstack;
            }
            ItemStack itemstack1 = field_21102_a[p_473_1_].func_1085_a(p_473_2_);
            if(field_21102_a[p_473_1_].field_1615_a == 0)
            {
                field_21102_a[p_473_1_] = null;
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
        if(field_21102_a[p_48081_1_] != null)
        {
            ItemStack itemstack = field_21102_a[p_48081_1_];
            field_21102_a[p_48081_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public ItemStack func_21100_b()
    {
        int i = -1;
        int j = 1;
        for(int k = 0; k < field_21102_a.length; k++)
        {
            if(field_21102_a[k] != null && field_21101_b.nextInt(j++) == 0)
            {
                i = k;
            }
        }

        if(i >= 0)
        {
            return func_473_a(i, 1);
        } else
        {
            return null;
        }
    }

    public void func_472_a(int p_472_1_, ItemStack p_472_2_)
    {
        field_21102_a[p_472_1_] = p_472_2_;
        if(p_472_2_ != null && p_472_2_.field_1615_a > func_470_e())
        {
            p_472_2_.field_1615_a = func_470_e();
        }
        func_474_j_();
    }

    public String func_471_d()
    {
        return "container.dispenser";
    }

    public void func_482_a(NBTTagCompound p_482_1_)
    {
        super.func_482_a(p_482_1_);
        NBTTagList nbttaglist = p_482_1_.func_753_l("Items");
        field_21102_a = new ItemStack[func_469_c()];
        for(int i = 0; i < nbttaglist.func_740_c(); i++)
        {
            NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.func_741_a(i);
            int j = nbttagcompound.func_746_c("Slot") & 0xff;
            if(j >= 0 && j < field_21102_a.length)
            {
                field_21102_a[j] = ItemStack.func_35864_a(nbttagcompound);
            }
        }

    }

    public void func_481_b(NBTTagCompound p_481_1_)
    {
        super.func_481_b(p_481_1_);
        NBTTagList nbttaglist = new NBTTagList();
        for(int i = 0; i < field_21102_a.length; i++)
        {
            if(field_21102_a[i] != null)
            {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                nbttagcompound.func_761_a("Slot", (byte)i);
                field_21102_a[i].func_1086_a(nbttagcompound);
                nbttaglist.func_742_a(nbttagcompound);
            }
        }

        p_481_1_.func_762_a("Items", nbttaglist);
    }

    public int func_470_e()
    {
        return 64;
    }

    public boolean func_20070_a_(EntityPlayer p_20070_1_)
    {
        if(field_824_e.func_603_b(field_823_f, field_822_g, field_821_h) != this)
        {
            return false;
        }
        return p_20070_1_.func_360_d((double)field_823_f + 0.5D, (double)field_822_g + 0.5D, (double)field_821_h + 0.5D) <= 64D;
    }

    public void func_35142_x_()
    {
    }

    public void func_35141_y_()
    {
    }
}
