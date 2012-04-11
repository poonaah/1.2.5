// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            Container, SlotEnchantmentTable, SlotEnchantment, Slot, 
//            ICrafting, IInventory, ItemStack, World, 
//            Block, EnchantmentHelper, EntityPlayer, PlayerCapabilities, 
//            EnchantmentData, InventoryPlayer

public class ContainerEnchantment extends Container
{

    public IInventory field_40236_a;
    private World field_40240_h;
    private int field_40241_i;
    private int field_40238_j;
    private int field_40239_k;
    private Random field_40237_l;
    public long field_40234_b;
    public int field_40235_c[];

    public ContainerEnchantment(InventoryPlayer p_i344_1_, World p_i344_2_, int p_i344_3_, int p_i344_4_, int p_i344_5_)
    {
        field_40236_a = new SlotEnchantmentTable(this, "Enchant", 1);
        field_40237_l = new Random();
        field_40235_c = new int[3];
        field_40240_h = p_i344_2_;
        field_40241_i = p_i344_3_;
        field_40238_j = p_i344_4_;
        field_40239_k = p_i344_5_;
        func_20117_a(new SlotEnchantment(this, field_40236_a, 0, 25, 47));
        for(int i = 0; i < 3; i++)
        {
            for(int k = 0; k < 9; k++)
            {
                func_20117_a(new Slot(p_i344_1_, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
            }

        }

        for(int j = 0; j < 9; j++)
        {
            func_20117_a(new Slot(p_i344_1_, j, 8 + j * 18, 142));
        }

    }

    public void func_20114_a()
    {
        super.func_20114_a();
        for(int i = 0; i < field_20121_g.size(); i++)
        {
            ICrafting icrafting = (ICrafting)field_20121_g.get(i);
            icrafting.func_20158_a(this, 0, field_40235_c[0]);
            icrafting.func_20158_a(this, 1, field_40235_c[1]);
            icrafting.func_20158_a(this, 2, field_40235_c[2]);
        }

    }

    public void func_20112_a(int p_20112_1_, int p_20112_2_)
    {
        if(p_20112_1_ >= 0 && p_20112_1_ <= 2)
        {
            field_40235_c[p_20112_1_] = p_20112_2_;
        } else
        {
            super.func_20112_a(p_20112_1_, p_20112_2_);
        }
    }

    public void func_1103_a(IInventory p_1103_1_)
    {
        if(p_1103_1_ == field_40236_a)
        {
            ItemStack itemstack = p_1103_1_.func_468_c(0);
            if(itemstack == null || !itemstack.func_40708_t())
            {
                for(int i = 0; i < 3; i++)
                {
                    field_40235_c[i] = 0;
                }

            } else
            {
                field_40234_b = field_40237_l.nextLong();
                if(!field_40240_h.field_1026_y)
                {
                    int j = 0;
                    for(int k = -1; k <= 1; k++)
                    {
                        for(int i1 = -1; i1 <= 1; i1++)
                        {
                            if(k == 0 && i1 == 0 || !field_40240_h.func_20084_d(field_40241_i + i1, field_40238_j, field_40239_k + k) || !field_40240_h.func_20084_d(field_40241_i + i1, field_40238_j + 1, field_40239_k + k))
                            {
                                continue;
                            }
                            if(field_40240_h.func_600_a(field_40241_i + i1 * 2, field_40238_j, field_40239_k + k * 2) == Block.field_407_ao.field_376_bc)
                            {
                                j++;
                            }
                            if(field_40240_h.func_600_a(field_40241_i + i1 * 2, field_40238_j + 1, field_40239_k + k * 2) == Block.field_407_ao.field_376_bc)
                            {
                                j++;
                            }
                            if(i1 == 0 || k == 0)
                            {
                                continue;
                            }
                            if(field_40240_h.func_600_a(field_40241_i + i1 * 2, field_40238_j, field_40239_k + k) == Block.field_407_ao.field_376_bc)
                            {
                                j++;
                            }
                            if(field_40240_h.func_600_a(field_40241_i + i1 * 2, field_40238_j + 1, field_40239_k + k) == Block.field_407_ao.field_376_bc)
                            {
                                j++;
                            }
                            if(field_40240_h.func_600_a(field_40241_i + i1, field_40238_j, field_40239_k + k * 2) == Block.field_407_ao.field_376_bc)
                            {
                                j++;
                            }
                            if(field_40240_h.func_600_a(field_40241_i + i1, field_40238_j + 1, field_40239_k + k * 2) == Block.field_407_ao.field_376_bc)
                            {
                                j++;
                            }
                        }

                    }

                    for(int l = 0; l < 3; l++)
                    {
                        field_40235_c[l] = EnchantmentHelper.func_40629_a(field_40237_l, l, j, itemstack);
                    }

                    func_20114_a();
                }
            }
        }
    }

    public boolean func_40233_a(EntityPlayer p_40233_1_, int p_40233_2_)
    {
        ItemStack itemstack = field_40236_a.func_468_c(0);
        if(field_40235_c[p_40233_2_] > 0 && itemstack != null && (p_40233_1_.field_35210_aY >= field_40235_c[p_40233_2_] || p_40233_1_.field_35212_aW.field_35756_d))
        {
            if(!field_40240_h.field_1026_y)
            {
                List list = EnchantmentHelper.func_40644_a(field_40237_l, itemstack, field_40235_c[p_40233_2_]);
                if(list != null)
                {
                    p_40233_1_.func_40184_i(field_40235_c[p_40233_2_]);
                    EnchantmentData enchantmentdata;
                    for(Iterator iterator = list.iterator(); iterator.hasNext(); itemstack.func_40705_a(enchantmentdata.field_40264_a, enchantmentdata.field_40263_b))
                    {
                        enchantmentdata = (EnchantmentData)iterator.next();
                    }

                    func_1103_a(field_40236_a);
                }
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void func_1104_a(EntityPlayer p_1104_1_)
    {
        super.func_1104_a(p_1104_1_);
        if(field_40240_h.field_1026_y)
        {
            return;
        }
        ItemStack itemstack = field_40236_a.func_48081_b(0);
        if(itemstack != null)
        {
            p_1104_1_.func_48153_a(itemstack);
        }
    }

    public boolean func_20120_b(EntityPlayer p_20120_1_)
    {
        if(field_40240_h.func_600_a(field_40241_i, field_40238_j, field_40239_k) != Block.field_40210_bF.field_376_bc)
        {
            return false;
        }
        return p_20120_1_.func_360_d((double)field_40241_i + 0.5D, (double)field_40238_j + 0.5D, (double)field_40239_k + 0.5D) <= 64D;
    }

    public ItemStack func_27279_a(int p_27279_1_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)field_20122_e.get(p_27279_1_);
        if(slot != null && slot.func_20005_c())
        {
            ItemStack itemstack1 = slot.func_777_b();
            itemstack = itemstack1.func_1102_e();
            if(p_27279_1_ == 0)
            {
                if(!func_28125_a(itemstack1, 1, 37, true))
                {
                    return null;
                }
            } else
            {
                return null;
            }
            if(itemstack1.field_1615_a == 0)
            {
                slot.func_776_b(null);
            } else
            {
                slot.func_779_d();
            }
            if(itemstack1.field_1615_a != itemstack.field_1615_a)
            {
                slot.func_4103_a(itemstack1);
            } else
            {
                return null;
            }
        }
        return itemstack;
    }
}
