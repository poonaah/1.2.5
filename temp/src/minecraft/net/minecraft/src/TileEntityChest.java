// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            TileEntity, IInventory, ItemStack, NBTTagCompound, 
//            NBTTagList, World, EntityPlayer, Block

public class TileEntityChest extends TileEntity
    implements IInventory
{

    private ItemStack field_827_a[];
    public boolean field_35155_a;
    public TileEntityChest field_35152_b;
    public TileEntityChest field_35153_c;
    public TileEntityChest field_35150_d;
    public TileEntityChest field_35151_e;
    public float field_35148_f;
    public float field_35149_g;
    public int field_35156_h;
    private int field_35154_q;

    public TileEntityChest()
    {
        field_827_a = new ItemStack[36];
        field_35155_a = false;
    }

    public int func_469_c()
    {
        return 27;
    }

    public ItemStack func_468_c(int p_468_1_)
    {
        return field_827_a[p_468_1_];
    }

    public ItemStack func_473_a(int p_473_1_, int p_473_2_)
    {
        if(field_827_a[p_473_1_] != null)
        {
            if(field_827_a[p_473_1_].field_1615_a <= p_473_2_)
            {
                ItemStack itemstack = field_827_a[p_473_1_];
                field_827_a[p_473_1_] = null;
                func_474_j_();
                return itemstack;
            }
            ItemStack itemstack1 = field_827_a[p_473_1_].func_1085_a(p_473_2_);
            if(field_827_a[p_473_1_].field_1615_a == 0)
            {
                field_827_a[p_473_1_] = null;
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
        if(field_827_a[p_48081_1_] != null)
        {
            ItemStack itemstack = field_827_a[p_48081_1_];
            field_827_a[p_48081_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int p_472_1_, ItemStack p_472_2_)
    {
        field_827_a[p_472_1_] = p_472_2_;
        if(p_472_2_ != null && p_472_2_.field_1615_a > func_470_e())
        {
            p_472_2_.field_1615_a = func_470_e();
        }
        func_474_j_();
    }

    public String func_471_d()
    {
        return "container.chest";
    }

    public void func_482_a(NBTTagCompound p_482_1_)
    {
        super.func_482_a(p_482_1_);
        NBTTagList nbttaglist = p_482_1_.func_753_l("Items");
        field_827_a = new ItemStack[func_469_c()];
        for(int i = 0; i < nbttaglist.func_740_c(); i++)
        {
            NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.func_741_a(i);
            int j = nbttagcompound.func_746_c("Slot") & 0xff;
            if(j >= 0 && j < field_827_a.length)
            {
                field_827_a[j] = ItemStack.func_35864_a(nbttagcompound);
            }
        }

    }

    public void func_481_b(NBTTagCompound p_481_1_)
    {
        super.func_481_b(p_481_1_);
        NBTTagList nbttaglist = new NBTTagList();
        for(int i = 0; i < field_827_a.length; i++)
        {
            if(field_827_a[i] != null)
            {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                nbttagcompound.func_761_a("Slot", (byte)i);
                field_827_a[i].func_1086_a(nbttagcompound);
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

    public void func_35144_b()
    {
        super.func_35144_b();
        field_35155_a = false;
    }

    public void func_35147_g()
    {
        if(field_35155_a)
        {
            return;
        }
        field_35155_a = true;
        field_35152_b = null;
        field_35153_c = null;
        field_35150_d = null;
        field_35151_e = null;
        if(field_824_e.func_600_a(field_823_f - 1, field_822_g, field_821_h) == Block.field_396_av.field_376_bc)
        {
            field_35150_d = (TileEntityChest)field_824_e.func_603_b(field_823_f - 1, field_822_g, field_821_h);
        }
        if(field_824_e.func_600_a(field_823_f + 1, field_822_g, field_821_h) == Block.field_396_av.field_376_bc)
        {
            field_35153_c = (TileEntityChest)field_824_e.func_603_b(field_823_f + 1, field_822_g, field_821_h);
        }
        if(field_824_e.func_600_a(field_823_f, field_822_g, field_821_h - 1) == Block.field_396_av.field_376_bc)
        {
            field_35152_b = (TileEntityChest)field_824_e.func_603_b(field_823_f, field_822_g, field_821_h - 1);
        }
        if(field_824_e.func_600_a(field_823_f, field_822_g, field_821_h + 1) == Block.field_396_av.field_376_bc)
        {
            field_35151_e = (TileEntityChest)field_824_e.func_603_b(field_823_f, field_822_g, field_821_h + 1);
        }
        if(field_35152_b != null)
        {
            field_35152_b.func_35144_b();
        }
        if(field_35151_e != null)
        {
            field_35151_e.func_35144_b();
        }
        if(field_35153_c != null)
        {
            field_35153_c.func_35144_b();
        }
        if(field_35150_d != null)
        {
            field_35150_d.func_35144_b();
        }
    }

    public void func_475_b()
    {
        super.func_475_b();
        func_35147_g();
        if((++field_35154_q % 20) * 4 == 0)
        {
            field_824_e.func_21116_c(field_823_f, field_822_g, field_821_h, 1, field_35156_h);
        }
        field_35149_g = field_35148_f;
        float f = 0.1F;
        if(field_35156_h > 0 && field_35148_f == 0.0F && field_35152_b == null && field_35150_d == null)
        {
            double d = (double)field_823_f + 0.5D;
            double d1 = (double)field_821_h + 0.5D;
            if(field_35151_e != null)
            {
                d1 += 0.5D;
            }
            if(field_35153_c != null)
            {
                d += 0.5D;
            }
            field_824_e.func_684_a(d, (double)field_822_g + 0.5D, d1, "random.chestopen", 0.5F, field_824_e.field_1037_n.nextFloat() * 0.1F + 0.9F);
        }
        if(field_35156_h == 0 && field_35148_f > 0.0F || field_35156_h > 0 && field_35148_f < 1.0F)
        {
            float f1 = field_35148_f;
            if(field_35156_h > 0)
            {
                field_35148_f += f;
            } else
            {
                field_35148_f -= f;
            }
            if(field_35148_f > 1.0F)
            {
                field_35148_f = 1.0F;
            }
            float f2 = 0.5F;
            if(field_35148_f < f2 && f1 >= f2 && field_35152_b == null && field_35150_d == null)
            {
                double d2 = (double)field_823_f + 0.5D;
                double d3 = (double)field_821_h + 0.5D;
                if(field_35151_e != null)
                {
                    d3 += 0.5D;
                }
                if(field_35153_c != null)
                {
                    d2 += 0.5D;
                }
                field_824_e.func_684_a(d2, (double)field_822_g + 0.5D, d3, "random.chestclosed", 0.5F, field_824_e.field_1037_n.nextFloat() * 0.1F + 0.9F);
            }
            if(field_35148_f < 0.0F)
            {
                field_35148_f = 0.0F;
            }
        }
    }

    public void func_35143_b(int p_35143_1_, int p_35143_2_)
    {
        if(p_35143_1_ == 1)
        {
            field_35156_h = p_35143_2_;
        }
    }

    public void func_35142_x_()
    {
        field_35156_h++;
        field_824_e.func_21116_c(field_823_f, field_822_g, field_821_h, 1, field_35156_h);
    }

    public void func_35141_y_()
    {
        field_35156_h--;
        field_824_e.func_21116_c(field_823_f, field_822_g, field_821_h, 1, field_35156_h);
    }

    public void func_31005_i()
    {
        func_35144_b();
        func_35147_g();
        super.func_31005_i();
    }
}
