// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Container, Slot, TileEntityDispenser, ItemStack, 
//            IInventory, EntityPlayer

public class ContainerDispenser extends Container
{

    private TileEntityDispenser field_21149_a;

    public ContainerDispenser(IInventory p_i121_1_, TileEntityDispenser p_i121_2_)
    {
        field_21149_a = p_i121_2_;
        for(int i = 0; i < 3; i++)
        {
            for(int l = 0; l < 3; l++)
            {
                func_20117_a(new Slot(p_i121_2_, l + i * 3, 62 + l * 18, 17 + i * 18));
            }

        }

        for(int j = 0; j < 3; j++)
        {
            for(int i1 = 0; i1 < 9; i1++)
            {
                func_20117_a(new Slot(p_i121_1_, i1 + j * 9 + 9, 8 + i1 * 18, 84 + j * 18));
            }

        }

        for(int k = 0; k < 9; k++)
        {
            func_20117_a(new Slot(p_i121_1_, k, 8 + k * 18, 142));
        }

    }

    public boolean func_20120_b(EntityPlayer p_20120_1_)
    {
        return field_21149_a.func_20070_a_(p_20120_1_);
    }

    public ItemStack func_27279_a(int p_27279_1_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)field_20122_e.get(p_27279_1_);
        if(slot != null && slot.func_20005_c())
        {
            ItemStack itemstack1 = slot.func_777_b();
            itemstack = itemstack1.func_1102_e();
            if(p_27279_1_ < 9)
            {
                if(!func_28125_a(itemstack1, 9, 45, true))
                {
                    return null;
                }
            } else
            if(!func_28125_a(itemstack1, 0, 9, false))
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
