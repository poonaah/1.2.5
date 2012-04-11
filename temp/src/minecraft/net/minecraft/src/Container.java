// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            Slot, ItemStack, ICrafting, EntityPlayer, 
//            InventoryPlayer, IInventory

public abstract class Container
{

    public List field_20123_d;
    public List field_20122_e;
    public int field_1618_c;
    private short field_20917_a;
    protected List field_20121_g;
    private Set field_20918_b;

    public Container()
    {
        field_20123_d = new ArrayList();
        field_20122_e = new ArrayList();
        field_1618_c = 0;
        field_20917_a = 0;
        field_20121_g = new ArrayList();
        field_20918_b = new HashSet();
    }

    protected void func_20117_a(Slot p_20117_1_)
    {
        p_20117_1_.field_20007_a = field_20122_e.size();
        field_20122_e.add(p_20117_1_);
        field_20123_d.add(null);
    }

    public void func_20114_a()
    {
        for(int i = 0; i < field_20122_e.size(); i++)
        {
            ItemStack itemstack = ((Slot)field_20122_e.get(i)).func_777_b();
            ItemStack itemstack1 = (ItemStack)field_20123_d.get(i);
            if(ItemStack.func_20107_a(itemstack1, itemstack))
            {
                continue;
            }
            itemstack1 = itemstack != null ? itemstack.func_1102_e() : null;
            field_20123_d.set(i, itemstack1);
            for(int j = 0; j < field_20121_g.size(); j++)
            {
                ((ICrafting)field_20121_g.get(j)).func_20159_a(this, i, itemstack1);
            }

        }

    }

    public boolean func_40233_a(EntityPlayer p_40233_1_, int p_40233_2_)
    {
        return false;
    }

    public Slot func_20118_a(int p_20118_1_)
    {
        return (Slot)field_20122_e.get(p_20118_1_);
    }

    public ItemStack func_27279_a(int p_27279_1_)
    {
        Slot slot = (Slot)field_20122_e.get(p_27279_1_);
        if(slot != null)
        {
            return slot.func_777_b();
        } else
        {
            return null;
        }
    }

    public ItemStack func_27280_a(int p_27280_1_, int p_27280_2_, boolean p_27280_3_, EntityPlayer p_27280_4_)
    {
        ItemStack itemstack = null;
        if(p_27280_2_ > 1)
        {
            return null;
        }
        if(p_27280_2_ == 0 || p_27280_2_ == 1)
        {
            InventoryPlayer inventoryplayer = p_27280_4_.field_778_b;
            if(p_27280_1_ == -999)
            {
                if(inventoryplayer.func_20075_i() != null && p_27280_1_ == -999)
                {
                    if(p_27280_2_ == 0)
                    {
                        p_27280_4_.func_48153_a(inventoryplayer.func_20075_i());
                        inventoryplayer.func_20076_b(null);
                    }
                    if(p_27280_2_ == 1)
                    {
                        p_27280_4_.func_48153_a(inventoryplayer.func_20075_i().func_1085_a(1));
                        if(inventoryplayer.func_20075_i().field_1615_a == 0)
                        {
                            inventoryplayer.func_20076_b(null);
                        }
                    }
                }
            } else
            if(p_27280_3_)
            {
                ItemStack itemstack1 = func_27279_a(p_27280_1_);
                if(itemstack1 != null)
                {
                    int i = itemstack1.field_1617_c;
                    itemstack = itemstack1.func_1102_e();
                    Slot slot1 = (Slot)field_20122_e.get(p_27280_1_);
                    if(slot1 != null && slot1.func_777_b() != null && slot1.func_777_b().field_1617_c == i)
                    {
                        func_35373_b(p_27280_1_, p_27280_2_, p_27280_3_, p_27280_4_);
                    }
                }
            } else
            {
                if(p_27280_1_ < 0)
                {
                    return null;
                }
                Slot slot = (Slot)field_20122_e.get(p_27280_1_);
                if(slot != null)
                {
                    slot.func_779_d();
                    ItemStack itemstack2 = slot.func_777_b();
                    ItemStack itemstack4 = inventoryplayer.func_20075_i();
                    if(itemstack2 != null)
                    {
                        itemstack = itemstack2.func_1102_e();
                    }
                    if(itemstack2 == null)
                    {
                        if(itemstack4 != null && slot.func_4105_a(itemstack4))
                        {
                            int j = p_27280_2_ != 0 ? 1 : itemstack4.field_1615_a;
                            if(j > slot.func_4104_e())
                            {
                                j = slot.func_4104_e();
                            }
                            slot.func_776_b(itemstack4.func_1085_a(j));
                            if(itemstack4.field_1615_a == 0)
                            {
                                inventoryplayer.func_20076_b(null);
                            }
                        }
                    } else
                    if(itemstack4 == null)
                    {
                        int k = p_27280_2_ != 0 ? (itemstack2.field_1615_a + 1) / 2 : itemstack2.field_1615_a;
                        ItemStack itemstack6 = slot.func_20004_a(k);
                        inventoryplayer.func_20076_b(itemstack6);
                        if(itemstack2.field_1615_a == 0)
                        {
                            slot.func_776_b(null);
                        }
                        slot.func_4103_a(inventoryplayer.func_20075_i());
                    } else
                    if(slot.func_4105_a(itemstack4))
                    {
                        if(itemstack2.field_1617_c != itemstack4.field_1617_c || itemstack2.func_21183_f() && itemstack2.func_21181_i() != itemstack4.func_21181_i() || !ItemStack.func_46154_a(itemstack2, itemstack4))
                        {
                            if(itemstack4.field_1615_a <= slot.func_4104_e())
                            {
                                ItemStack itemstack5 = itemstack2;
                                slot.func_776_b(itemstack4);
                                inventoryplayer.func_20076_b(itemstack5);
                            }
                        } else
                        {
                            int l = p_27280_2_ != 0 ? 1 : itemstack4.field_1615_a;
                            if(l > slot.func_4104_e() - itemstack2.field_1615_a)
                            {
                                l = slot.func_4104_e() - itemstack2.field_1615_a;
                            }
                            if(l > itemstack4.func_1089_c() - itemstack2.field_1615_a)
                            {
                                l = itemstack4.func_1089_c() - itemstack2.field_1615_a;
                            }
                            itemstack4.func_1085_a(l);
                            if(itemstack4.field_1615_a == 0)
                            {
                                inventoryplayer.func_20076_b(null);
                            }
                            itemstack2.field_1615_a += l;
                        }
                    } else
                    if(itemstack2.field_1617_c == itemstack4.field_1617_c && itemstack4.func_1089_c() > 1 && (!itemstack2.func_21183_f() || itemstack2.func_21181_i() == itemstack4.func_21181_i()) && ItemStack.func_46154_a(itemstack2, itemstack4))
                    {
                        int i1 = itemstack2.field_1615_a;
                        if(i1 > 0 && i1 + itemstack4.field_1615_a <= itemstack4.func_1089_c())
                        {
                            itemstack4.field_1615_a += i1;
                            ItemStack itemstack3 = slot.func_20004_a(i1);
                            if(itemstack3.field_1615_a == 0)
                            {
                                slot.func_776_b(null);
                            }
                            slot.func_4103_a(inventoryplayer.func_20075_i());
                        }
                    }
                }
            }
        }
        return itemstack;
    }

    protected void func_35373_b(int p_35373_1_, int p_35373_2_, boolean p_35373_3_, EntityPlayer p_35373_4_)
    {
        func_27280_a(p_35373_1_, p_35373_2_, p_35373_3_, p_35373_4_);
    }

    public void func_1104_a(EntityPlayer p_1104_1_)
    {
        InventoryPlayer inventoryplayer = p_1104_1_.field_778_b;
        if(inventoryplayer.func_20075_i() != null)
        {
            p_1104_1_.func_48153_a(inventoryplayer.func_20075_i());
            inventoryplayer.func_20076_b(null);
        }
    }

    public void func_1103_a(IInventory p_1103_1_)
    {
        func_20114_a();
    }

    public void func_20119_a(int p_20119_1_, ItemStack p_20119_2_)
    {
        func_20118_a(p_20119_1_).func_776_b(p_20119_2_);
    }

    public void func_20115_a(ItemStack p_20115_1_[])
    {
        for(int i = 0; i < p_20115_1_.length; i++)
        {
            func_20118_a(i).func_776_b(p_20115_1_[i]);
        }

    }

    public void func_20112_a(int i, int j)
    {
    }

    public short func_20111_a(InventoryPlayer p_20111_1_)
    {
        field_20917_a++;
        return field_20917_a;
    }

    public void func_20113_a(short word0)
    {
    }

    public void func_20110_b(short word0)
    {
    }

    public abstract boolean func_20120_b(EntityPlayer entityplayer);

    protected boolean func_28125_a(ItemStack p_28125_1_, int p_28125_2_, int p_28125_3_, boolean p_28125_4_)
    {
        boolean flag = false;
        int i = p_28125_2_;
        if(p_28125_4_)
        {
            i = p_28125_3_ - 1;
        }
        if(p_28125_1_.func_21180_d())
        {
            while(p_28125_1_.field_1615_a > 0 && (!p_28125_4_ && i < p_28125_3_ || p_28125_4_ && i >= p_28125_2_)) 
            {
                Slot slot = (Slot)field_20122_e.get(i);
                ItemStack itemstack = slot.func_777_b();
                if(itemstack != null && itemstack.field_1617_c == p_28125_1_.field_1617_c && (!p_28125_1_.func_21183_f() || p_28125_1_.func_21181_i() == itemstack.func_21181_i()) && ItemStack.func_46154_a(p_28125_1_, itemstack))
                {
                    int k = itemstack.field_1615_a + p_28125_1_.field_1615_a;
                    if(k <= p_28125_1_.func_1089_c())
                    {
                        p_28125_1_.field_1615_a = 0;
                        itemstack.field_1615_a = k;
                        slot.func_779_d();
                        flag = true;
                    } else
                    if(itemstack.field_1615_a < p_28125_1_.func_1089_c())
                    {
                        p_28125_1_.field_1615_a -= p_28125_1_.func_1089_c() - itemstack.field_1615_a;
                        itemstack.field_1615_a = p_28125_1_.func_1089_c();
                        slot.func_779_d();
                        flag = true;
                    }
                }
                if(p_28125_4_)
                {
                    i--;
                } else
                {
                    i++;
                }
            }
        }
        if(p_28125_1_.field_1615_a > 0)
        {
            int j;
            if(p_28125_4_)
            {
                j = p_28125_3_ - 1;
            } else
            {
                j = p_28125_2_;
            }
            do
            {
                if((p_28125_4_ || j >= p_28125_3_) && (!p_28125_4_ || j < p_28125_2_))
                {
                    break;
                }
                Slot slot1 = (Slot)field_20122_e.get(j);
                ItemStack itemstack1 = slot1.func_777_b();
                if(itemstack1 == null)
                {
                    slot1.func_776_b(p_28125_1_.func_1102_e());
                    slot1.func_779_d();
                    p_28125_1_.field_1615_a = 0;
                    flag = true;
                    break;
                }
                if(p_28125_4_)
                {
                    j--;
                } else
                {
                    j++;
                }
            } while(true);
        }
        return flag;
    }
}
