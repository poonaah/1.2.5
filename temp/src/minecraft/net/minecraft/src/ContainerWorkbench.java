// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Container, InventoryCrafting, InventoryCraftResult, SlotCrafting, 
//            InventoryPlayer, Slot, CraftingManager, IInventory, 
//            World, EntityPlayer, Block, ItemStack

public class ContainerWorkbench extends Container
{

    public InventoryCrafting field_1622_a;
    public IInventory field_1621_b;
    private World field_20133_c;
    private int field_20132_h;
    private int field_20131_i;
    private int field_20130_j;

    public ContainerWorkbench(InventoryPlayer p_i737_1_, World p_i737_2_, int p_i737_3_, int p_i737_4_, int p_i737_5_)
    {
        field_1622_a = new InventoryCrafting(this, 3, 3);
        field_1621_b = new InventoryCraftResult();
        field_20133_c = p_i737_2_;
        field_20132_h = p_i737_3_;
        field_20131_i = p_i737_4_;
        field_20130_j = p_i737_5_;
        func_20117_a(new SlotCrafting(p_i737_1_.field_844_g, field_1622_a, field_1621_b, 0, 124, 35));
        for(int i = 0; i < 3; i++)
        {
            for(int l = 0; l < 3; l++)
            {
                func_20117_a(new Slot(field_1622_a, l + i * 3, 30 + l * 18, 17 + i * 18));
            }

        }

        for(int j = 0; j < 3; j++)
        {
            for(int i1 = 0; i1 < 9; i1++)
            {
                func_20117_a(new Slot(p_i737_1_, i1 + j * 9 + 9, 8 + i1 * 18, 84 + j * 18));
            }

        }

        for(int k = 0; k < 9; k++)
        {
            func_20117_a(new Slot(p_i737_1_, k, 8 + k * 18, 142));
        }

        func_1103_a(field_1622_a);
    }

    public void func_1103_a(IInventory p_1103_1_)
    {
        field_1621_b.func_472_a(0, CraftingManager.func_1120_a().func_21188_a(field_1622_a));
    }

    public void func_1104_a(EntityPlayer p_1104_1_)
    {
        super.func_1104_a(p_1104_1_);
        if(field_20133_c.field_1026_y)
        {
            return;
        }
        for(int i = 0; i < 9; i++)
        {
            ItemStack itemstack = field_1622_a.func_48081_b(i);
            if(itemstack != null)
            {
                p_1104_1_.func_48153_a(itemstack);
            }
        }

    }

    public boolean func_20120_b(EntityPlayer p_20120_1_)
    {
        if(field_20133_c.func_600_a(field_20132_h, field_20131_i, field_20130_j) != Block.field_387_az.field_376_bc)
        {
            return false;
        }
        return p_20120_1_.func_360_d((double)field_20132_h + 0.5D, (double)field_20131_i + 0.5D, (double)field_20130_j + 0.5D) <= 64D;
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
                if(!func_28125_a(itemstack1, 10, 46, true))
                {
                    return null;
                }
                slot.func_48433_a(itemstack1, itemstack);
            } else
            if(p_27279_1_ >= 10 && p_27279_1_ < 37)
            {
                if(!func_28125_a(itemstack1, 37, 46, false))
                {
                    return null;
                }
            } else
            if(p_27279_1_ >= 37 && p_27279_1_ < 46)
            {
                if(!func_28125_a(itemstack1, 10, 37, false))
                {
                    return null;
                }
            } else
            if(!func_28125_a(itemstack1, 10, 46, false))
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
