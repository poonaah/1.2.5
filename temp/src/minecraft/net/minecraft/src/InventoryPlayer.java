// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IInventory, ItemStack, Item, NBTTagCompound, 
//            EntityPlayer, PlayerCapabilities, NBTTagList, Block, 
//            Material, ItemArmor, Entity

public class InventoryPlayer
    implements IInventory
{

    public ItemStack field_843_a[];
    public ItemStack field_842_b[];
    public int field_847_d;
    public EntityPlayer field_844_g;
    private ItemStack field_20077_f;
    public boolean field_845_f;

    public InventoryPlayer(EntityPlayer p_i740_1_)
    {
        field_843_a = new ItemStack[36];
        field_842_b = new ItemStack[4];
        field_847_d = 0;
        field_845_f = false;
        field_844_g = p_i740_1_;
    }

    public ItemStack func_494_a()
    {
        if(field_847_d < 9 && field_847_d >= 0)
        {
            return field_843_a[field_847_d];
        } else
        {
            return null;
        }
    }

    private int func_505_f(int p_505_1_)
    {
        for(int i = 0; i < field_843_a.length; i++)
        {
            if(field_843_a[i] != null && field_843_a[i].field_1617_c == p_505_1_)
            {
                return i;
            }
        }

        return -1;
    }

    private int func_41021_b(int p_41021_1_, int p_41021_2_)
    {
        for(int i = 0; i < field_843_a.length; i++)
        {
            if(field_843_a[i] != null && field_843_a[i].field_1617_c == p_41021_1_ && field_843_a[i].func_21181_i() == p_41021_2_)
            {
                return i;
            }
        }

        return -1;
    }

    private int func_21105_c(ItemStack p_21105_1_)
    {
        for(int i = 0; i < field_843_a.length; i++)
        {
            if(field_843_a[i] != null && field_843_a[i].field_1617_c == p_21105_1_.field_1617_c && field_843_a[i].func_21180_d() && field_843_a[i].field_1615_a < field_843_a[i].func_1089_c() && field_843_a[i].field_1615_a < func_470_e() && (!field_843_a[i].func_21183_f() || field_843_a[i].func_21181_i() == p_21105_1_.func_21181_i()) && ItemStack.func_46154_a(field_843_a[i], p_21105_1_))
            {
                return i;
            }
        }

        return -1;
    }

    private int func_499_j()
    {
        for(int i = 0; i < field_843_a.length; i++)
        {
            if(field_843_a[i] == null)
            {
                return i;
            }
        }

        return -1;
    }

    public void func_496_a(int p_496_1_, int p_496_2_, boolean p_496_3_, boolean p_496_4_)
    {
        int i = -1;
        if(p_496_3_)
        {
            i = func_41021_b(p_496_1_, p_496_2_);
        } else
        {
            i = func_505_f(p_496_1_);
        }
        if(i >= 0 && i < 9)
        {
            field_847_d = i;
            return;
        }
        if(p_496_4_ && p_496_1_ > 0)
        {
            int j = func_499_j();
            if(j >= 0 && j < 9)
            {
                field_847_d = j;
            }
            func_52006_a(Item.field_233_c[p_496_1_], p_496_2_);
        }
    }

    public void func_498_a(int p_498_1_)
    {
        if(p_498_1_ > 0)
        {
            p_498_1_ = 1;
        }
        if(p_498_1_ < 0)
        {
            p_498_1_ = -1;
        }
        for(field_847_d -= p_498_1_; field_847_d < 0; field_847_d += 9) { }
        for(; field_847_d >= 9; field_847_d -= 9) { }
    }

    public void func_52006_a(Item p_52006_1_, int p_52006_2_)
    {
        if(p_52006_1_ != null)
        {
            int i = func_41021_b(p_52006_1_.field_291_aS, p_52006_2_);
            if(i >= 0)
            {
                field_843_a[i] = field_843_a[field_847_d];
            }
            field_843_a[field_847_d] = new ItemStack(Item.field_233_c[p_52006_1_.field_291_aS], 1, p_52006_2_);
        }
    }

    private int func_21106_d(ItemStack p_21106_1_)
    {
        int i = p_21106_1_.field_1617_c;
        int j = p_21106_1_.field_1615_a;
        if(p_21106_1_.func_1089_c() == 1)
        {
            int k = func_499_j();
            if(k < 0)
            {
                return j;
            }
            if(field_843_a[k] == null)
            {
                field_843_a[k] = ItemStack.func_30010_b(p_21106_1_);
            }
            return 0;
        }
        int l = func_21105_c(p_21106_1_);
        if(l < 0)
        {
            l = func_499_j();
        }
        if(l < 0)
        {
            return j;
        }
        if(field_843_a[l] == null)
        {
            field_843_a[l] = new ItemStack(i, 0, p_21106_1_.func_21181_i());
            if(p_21106_1_.func_40710_n())
            {
                field_843_a[l].func_40706_d((NBTTagCompound)p_21106_1_.func_40709_o().func_40195_b());
            }
        }
        int i1 = j;
        if(i1 > field_843_a[l].func_1089_c() - field_843_a[l].field_1615_a)
        {
            i1 = field_843_a[l].func_1089_c() - field_843_a[l].field_1615_a;
        }
        if(i1 > func_470_e() - field_843_a[l].field_1615_a)
        {
            i1 = func_470_e() - field_843_a[l].field_1615_a;
        }
        if(i1 == 0)
        {
            return j;
        } else
        {
            j -= i1;
            field_843_a[l].field_1615_a += i1;
            field_843_a[l].field_1614_b = 5;
            return j;
        }
    }

    public void func_511_b()
    {
        for(int i = 0; i < field_843_a.length; i++)
        {
            if(field_843_a[i] != null)
            {
                field_843_a[i].func_28153_a(field_844_g.field_615_ag, field_844_g, i, field_847_d == i);
            }
        }

    }

    public boolean func_510_b(int p_510_1_)
    {
        int i = func_505_f(p_510_1_);
        if(i < 0)
        {
            return false;
        }
        if(--field_843_a[i].field_1615_a <= 0)
        {
            field_843_a[i] = null;
        }
        return true;
    }

    public boolean func_35157_d(int p_35157_1_)
    {
        int i = func_505_f(p_35157_1_);
        return i >= 0;
    }

    public boolean func_504_a(ItemStack p_504_1_)
    {
        if(!p_504_1_.func_21185_g())
        {
            int i;
            do
            {
                i = p_504_1_.field_1615_a;
                p_504_1_.field_1615_a = func_21106_d(p_504_1_);
            } while(p_504_1_.field_1615_a > 0 && p_504_1_.field_1615_a < i);
            if(p_504_1_.field_1615_a == i && field_844_g.field_35212_aW.field_35756_d)
            {
                p_504_1_.field_1615_a = 0;
                return true;
            } else
            {
                return p_504_1_.field_1615_a < i;
            }
        }
        int j = func_499_j();
        if(j >= 0)
        {
            field_843_a[j] = ItemStack.func_30010_b(p_504_1_);
            field_843_a[j].field_1614_b = 5;
            p_504_1_.field_1615_a = 0;
            return true;
        }
        if(field_844_g.field_35212_aW.field_35756_d)
        {
            p_504_1_.field_1615_a = 0;
            return true;
        } else
        {
            return false;
        }
    }

    public ItemStack func_473_a(int p_473_1_, int p_473_2_)
    {
        ItemStack aitemstack[] = field_843_a;
        if(p_473_1_ >= field_843_a.length)
        {
            aitemstack = field_842_b;
            p_473_1_ -= field_843_a.length;
        }
        if(aitemstack[p_473_1_] != null)
        {
            if(aitemstack[p_473_1_].field_1615_a <= p_473_2_)
            {
                ItemStack itemstack = aitemstack[p_473_1_];
                aitemstack[p_473_1_] = null;
                return itemstack;
            }
            ItemStack itemstack1 = aitemstack[p_473_1_].func_1085_a(p_473_2_);
            if(aitemstack[p_473_1_].field_1615_a == 0)
            {
                aitemstack[p_473_1_] = null;
            }
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public ItemStack func_48081_b(int p_48081_1_)
    {
        ItemStack aitemstack[] = field_843_a;
        if(p_48081_1_ >= field_843_a.length)
        {
            aitemstack = field_842_b;
            p_48081_1_ -= field_843_a.length;
        }
        if(aitemstack[p_48081_1_] != null)
        {
            ItemStack itemstack = aitemstack[p_48081_1_];
            aitemstack[p_48081_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int p_472_1_, ItemStack p_472_2_)
    {
        ItemStack aitemstack[] = field_843_a;
        if(p_472_1_ >= aitemstack.length)
        {
            p_472_1_ -= aitemstack.length;
            aitemstack = field_842_b;
        }
        aitemstack[p_472_1_] = p_472_2_;
    }

    public float func_508_a(Block p_508_1_)
    {
        float f = 1.0F;
        if(field_843_a[field_847_d] != null)
        {
            f *= field_843_a[field_847_d].func_1098_a(p_508_1_);
        }
        return f;
    }

    public NBTTagList func_493_a(NBTTagList p_493_1_)
    {
        for(int i = 0; i < field_843_a.length; i++)
        {
            if(field_843_a[i] != null)
            {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                nbttagcompound.func_761_a("Slot", (byte)i);
                field_843_a[i].func_1086_a(nbttagcompound);
                p_493_1_.func_742_a(nbttagcompound);
            }
        }

        for(int j = 0; j < field_842_b.length; j++)
        {
            if(field_842_b[j] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.func_761_a("Slot", (byte)(j + 100));
                field_842_b[j].func_1086_a(nbttagcompound1);
                p_493_1_.func_742_a(nbttagcompound1);
            }
        }

        return p_493_1_;
    }

    public void func_513_b(NBTTagList p_513_1_)
    {
        field_843_a = new ItemStack[36];
        field_842_b = new ItemStack[4];
        for(int i = 0; i < p_513_1_.func_740_c(); i++)
        {
            NBTTagCompound nbttagcompound = (NBTTagCompound)p_513_1_.func_741_a(i);
            int j = nbttagcompound.func_746_c("Slot") & 0xff;
            ItemStack itemstack = ItemStack.func_35864_a(nbttagcompound);
            if(itemstack == null)
            {
                continue;
            }
            if(j >= 0 && j < field_843_a.length)
            {
                field_843_a[j] = itemstack;
            }
            if(j >= 100 && j < field_842_b.length + 100)
            {
                field_842_b[j - 100] = itemstack;
            }
        }

    }

    public int func_469_c()
    {
        return field_843_a.length + 4;
    }

    public ItemStack func_468_c(int p_468_1_)
    {
        ItemStack aitemstack[] = field_843_a;
        if(p_468_1_ >= aitemstack.length)
        {
            p_468_1_ -= aitemstack.length;
            aitemstack = field_842_b;
        }
        return aitemstack[p_468_1_];
    }

    public String func_471_d()
    {
        return "container.inventory";
    }

    public int func_470_e()
    {
        return 64;
    }

    public int func_502_a(Entity p_502_1_)
    {
        ItemStack itemstack = func_468_c(field_847_d);
        if(itemstack != null)
        {
            return itemstack.func_1095_a(p_502_1_);
        } else
        {
            return 1;
        }
    }

    public boolean func_509_b(Block p_509_1_)
    {
        if(p_509_1_.field_356_bn.func_31061_i())
        {
            return true;
        }
        ItemStack itemstack = func_468_c(field_847_d);
        if(itemstack != null)
        {
            return itemstack.func_1099_b(p_509_1_);
        } else
        {
            return false;
        }
    }

    public ItemStack func_492_d(int p_492_1_)
    {
        return field_842_b[p_492_1_];
    }

    public int func_506_f()
    {
        int i = 0;
        for(int j = 0; j < field_842_b.length; j++)
        {
            if(field_842_b[j] != null && (field_842_b[j].func_1091_a() instanceof ItemArmor))
            {
                int k = ((ItemArmor)field_842_b[j].func_1091_a()).field_312_aY;
                i += k;
            }
        }

        return i;
    }

    public void func_507_e(int p_507_1_)
    {
        p_507_1_ /= 4;
        if(p_507_1_ < 1)
        {
            p_507_1_ = 1;
        }
        for(int i = 0; i < field_842_b.length; i++)
        {
            if(field_842_b[i] == null || !(field_842_b[i].func_1091_a() instanceof ItemArmor))
            {
                continue;
            }
            field_842_b[i].func_25190_a(p_507_1_, field_844_g);
            if(field_842_b[i].field_1615_a == 0)
            {
                field_842_b[i].func_1097_a(field_844_g);
                field_842_b[i] = null;
            }
        }

    }

    public void func_503_g()
    {
        for(int i = 0; i < field_843_a.length; i++)
        {
            if(field_843_a[i] != null)
            {
                field_844_g.func_48151_a(field_843_a[i], true);
                field_843_a[i] = null;
            }
        }

        for(int j = 0; j < field_842_b.length; j++)
        {
            if(field_842_b[j] != null)
            {
                field_844_g.func_48151_a(field_842_b[j], true);
                field_842_b[j] = null;
            }
        }

    }

    public void func_474_j_()
    {
        field_845_f = true;
    }

    public void func_20076_b(ItemStack p_20076_1_)
    {
        field_20077_f = p_20076_1_;
        field_844_g.func_20058_b(p_20076_1_);
    }

    public ItemStack func_20075_i()
    {
        return field_20077_f;
    }

    public boolean func_20070_a_(EntityPlayer p_20070_1_)
    {
        if(field_844_g.field_646_aA)
        {
            return false;
        }
        return p_20070_1_.func_387_e(field_844_g) <= 64D;
    }

    public boolean func_28018_c(ItemStack p_28018_1_)
    {
        for(int i = 0; i < field_842_b.length; i++)
        {
            if(field_842_b[i] != null && field_842_b[i].func_28154_b(p_28018_1_))
            {
                return true;
            }
        }

        for(int j = 0; j < field_843_a.length; j++)
        {
            if(field_843_a[j] != null && field_843_a[j].func_28154_b(p_28018_1_))
            {
                return true;
            }
        }

        return false;
    }

    public void func_35142_x_()
    {
    }

    public void func_35141_y_()
    {
    }

    public void func_41022_a(InventoryPlayer p_41022_1_)
    {
        for(int i = 0; i < field_843_a.length; i++)
        {
            field_843_a[i] = ItemStack.func_30010_b(p_41022_1_.field_843_a[i]);
        }

        for(int j = 0; j < field_842_b.length; j++)
        {
            field_842_b[j] = ItemStack.func_30010_b(p_41022_1_.field_842_b[j]);
        }

    }
}
