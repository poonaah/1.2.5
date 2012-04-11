// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Container, IInventory, Slot, ItemStack, 
//            EntityPlayer

public class ContainerChest extends Container
{

    private IInventory field_20125_a;
    private int field_27282_b;

    public ContainerChest(IInventory p_i249_1_, IInventory p_i249_2_)
    {
        field_20125_a = p_i249_2_;
        field_27282_b = p_i249_2_.func_469_c() / 9;
        p_i249_2_.func_35142_x_();
        int i = (field_27282_b - 4) * 18;
        for(int j = 0; j < field_27282_b; j++)
        {
            for(int i1 = 0; i1 < 9; i1++)
            {
                func_20117_a(new Slot(p_i249_2_, i1 + j * 9, 8 + i1 * 18, 18 + j * 18));
            }

        }

        for(int k = 0; k < 3; k++)
        {
            for(int j1 = 0; j1 < 9; j1++)
            {
                func_20117_a(new Slot(p_i249_1_, j1 + k * 9 + 9, 8 + j1 * 18, 103 + k * 18 + i));
            }

        }

        for(int l = 0; l < 9; l++)
        {
            func_20117_a(new Slot(p_i249_1_, l, 8 + l * 18, 161 + i));
        }

    }

    public boolean func_20120_b(EntityPlayer p_20120_1_)
    {
        return field_20125_a.func_20070_a_(p_20120_1_);
    }

    public ItemStack func_27279_a(int p_27279_1_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)field_20122_e.get(p_27279_1_);
        if(slot != null && slot.func_20005_c())
        {
            ItemStack itemstack1 = slot.func_777_b();
            itemstack = itemstack1.func_1102_e();
            if(p_27279_1_ < field_27282_b * 9)
            {
                if(!func_28125_a(itemstack1, field_27282_b * 9, field_20122_e.size(), true))
                {
                    return null;
                }
            } else
            if(!func_28125_a(itemstack1, 0, field_27282_b * 9, false))
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
        }
        return itemstack;
    }

    public void func_1104_a(EntityPlayer p_1104_1_)
    {
        super.func_1104_a(p_1104_1_);
        field_20125_a.func_35141_y_();
    }
}
