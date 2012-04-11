// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Container, SlotBrewingStandPotion, InventoryPlayer, SlotBrewingStandIngredient, 
//            Slot, ICrafting, TileEntityBrewingStand, ItemStack, 
//            EntityPlayer

public class ContainerBrewingStand extends Container
{

    private TileEntityBrewingStand field_40243_a;
    private int field_40242_b;

    public ContainerBrewingStand(InventoryPlayer p_i750_1_, TileEntityBrewingStand p_i750_2_)
    {
        field_40242_b = 0;
        field_40243_a = p_i750_2_;
        func_20117_a(new SlotBrewingStandPotion(this, p_i750_1_.field_844_g, p_i750_2_, 0, 56, 46));
        func_20117_a(new SlotBrewingStandPotion(this, p_i750_1_.field_844_g, p_i750_2_, 1, 79, 53));
        func_20117_a(new SlotBrewingStandPotion(this, p_i750_1_.field_844_g, p_i750_2_, 2, 102, 46));
        func_20117_a(new SlotBrewingStandIngredient(this, p_i750_2_, 3, 79, 17));
        for(int i = 0; i < 3; i++)
        {
            for(int k = 0; k < 9; k++)
            {
                func_20117_a(new Slot(p_i750_1_, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
            }

        }

        for(int j = 0; j < 9; j++)
        {
            func_20117_a(new Slot(p_i750_1_, j, 8 + j * 18, 142));
        }

    }

    public void func_20114_a()
    {
        super.func_20114_a();
        for(int i = 0; i < field_20121_g.size(); i++)
        {
            ICrafting icrafting = (ICrafting)field_20121_g.get(i);
            if(field_40242_b != field_40243_a.func_40053_g())
            {
                icrafting.func_20158_a(this, 0, field_40243_a.func_40053_g());
            }
        }

        field_40242_b = field_40243_a.func_40053_g();
    }

    public void func_20112_a(int p_20112_1_, int p_20112_2_)
    {
        if(p_20112_1_ == 0)
        {
            field_40243_a.func_40049_b(p_20112_2_);
        }
    }

    public boolean func_20120_b(EntityPlayer p_20120_1_)
    {
        return field_40243_a.func_20070_a_(p_20120_1_);
    }

    public ItemStack func_27279_a(int p_27279_1_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)field_20122_e.get(p_27279_1_);
        if(slot != null && slot.func_20005_c())
        {
            ItemStack itemstack1 = slot.func_777_b();
            itemstack = itemstack1.func_1102_e();
            if(p_27279_1_ >= 0 && p_27279_1_ <= 2 || p_27279_1_ == 3)
            {
                if(!func_28125_a(itemstack1, 4, 40, true))
                {
                    return null;
                }
                slot.func_48433_a(itemstack1, itemstack);
            } else
            if(p_27279_1_ >= 4 && p_27279_1_ < 31)
            {
                if(!func_28125_a(itemstack1, 31, 40, false))
                {
                    return null;
                }
            } else
            if(p_27279_1_ >= 31 && p_27279_1_ < 40)
            {
                if(!func_28125_a(itemstack1, 4, 31, false))
                {
                    return null;
                }
            } else
            if(!func_28125_a(itemstack1, 4, 40, false))
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
