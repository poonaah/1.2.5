// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Container, InventoryCrafting, InventoryCraftResult, SlotCrafting, 
//            InventoryPlayer, Slot, SlotArmor, CraftingManager, 
//            IInventory, EntityPlayer, ItemStack

public class ContainerPlayer extends Container
{

    public InventoryCrafting field_1620_a;
    public IInventory field_1619_b;
    public boolean field_20124_c;

    public ContainerPlayer(InventoryPlayer p_i685_1_)
    {
        this(p_i685_1_, true);
    }

    public ContainerPlayer(InventoryPlayer p_i686_1_, boolean p_i686_2_)
    {
        field_1620_a = new InventoryCrafting(this, 2, 2);
        field_1619_b = new InventoryCraftResult();
        field_20124_c = false;
        field_20124_c = p_i686_2_;
        func_20117_a(new SlotCrafting(p_i686_1_.field_844_g, field_1620_a, field_1619_b, 0, 144, 36));
        for(int i = 0; i < 2; i++)
        {
            for(int i1 = 0; i1 < 2; i1++)
            {
                func_20117_a(new Slot(field_1620_a, i1 + i * 2, 88 + i1 * 18, 26 + i * 18));
            }

        }

        for(int j = 0; j < 4; j++)
        {
            int j1 = j;
            func_20117_a(new SlotArmor(this, p_i686_1_, p_i686_1_.func_469_c() - 1 - j, 8, 8 + j * 18, j1));
        }

        for(int k = 0; k < 3; k++)
        {
            for(int k1 = 0; k1 < 9; k1++)
            {
                func_20117_a(new Slot(p_i686_1_, k1 + (k + 1) * 9, 8 + k1 * 18, 84 + k * 18));
            }

        }

        for(int l = 0; l < 9; l++)
        {
            func_20117_a(new Slot(p_i686_1_, l, 8 + l * 18, 142));
        }

        func_1103_a(field_1620_a);
    }

    public void func_1103_a(IInventory p_1103_1_)
    {
        field_1619_b.func_472_a(0, CraftingManager.func_1120_a().func_21188_a(field_1620_a));
    }

    public void func_1104_a(EntityPlayer p_1104_1_)
    {
        super.func_1104_a(p_1104_1_);
        for(int i = 0; i < 4; i++)
        {
            ItemStack itemstack = field_1620_a.func_48081_b(i);
            if(itemstack != null)
            {
                p_1104_1_.func_48153_a(itemstack);
            }
        }

        field_1619_b.func_472_a(0, null);
    }

    public boolean func_20120_b(EntityPlayer p_20120_1_)
    {
        return true;
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
                if(!func_28125_a(itemstack1, 9, 45, true))
                {
                    return null;
                }
                slot.func_48433_a(itemstack1, itemstack);
            } else
            if(p_27279_1_ >= 9 && p_27279_1_ < 36)
            {
                if(!func_28125_a(itemstack1, 36, 45, false))
                {
                    return null;
                }
            } else
            if(p_27279_1_ >= 36 && p_27279_1_ < 45)
            {
                if(!func_28125_a(itemstack1, 9, 36, false))
                {
                    return null;
                }
            } else
            if(!func_28125_a(itemstack1, 9, 45, false))
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
