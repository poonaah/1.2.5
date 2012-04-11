// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Container, Slot, SlotFurnace, InventoryPlayer, 
//            ICrafting, TileEntityFurnace, ItemStack, FurnaceRecipes, 
//            Item, EntityPlayer

public class ContainerFurnace extends Container
{

    private TileEntityFurnace field_20127_a;
    private int field_20126_b;
    private int field_20129_c;
    private int field_20128_h;

    public ContainerFurnace(InventoryPlayer p_i623_1_, TileEntityFurnace p_i623_2_)
    {
        field_20126_b = 0;
        field_20129_c = 0;
        field_20128_h = 0;
        field_20127_a = p_i623_2_;
        func_20117_a(new Slot(p_i623_2_, 0, 56, 17));
        func_20117_a(new Slot(p_i623_2_, 1, 56, 53));
        func_20117_a(new SlotFurnace(p_i623_1_.field_844_g, p_i623_2_, 2, 116, 35));
        for(int i = 0; i < 3; i++)
        {
            for(int k = 0; k < 9; k++)
            {
                func_20117_a(new Slot(p_i623_1_, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
            }

        }

        for(int j = 0; j < 9; j++)
        {
            func_20117_a(new Slot(p_i623_1_, j, 8 + j * 18, 142));
        }

    }

    public void func_20114_a()
    {
        super.func_20114_a();
        for(int i = 0; i < field_20121_g.size(); i++)
        {
            ICrafting icrafting = (ICrafting)field_20121_g.get(i);
            if(field_20126_b != field_20127_a.field_834_d)
            {
                icrafting.func_20158_a(this, 0, field_20127_a.field_834_d);
            }
            if(field_20129_c != field_20127_a.field_832_b)
            {
                icrafting.func_20158_a(this, 1, field_20127_a.field_832_b);
            }
            if(field_20128_h != field_20127_a.field_835_c)
            {
                icrafting.func_20158_a(this, 2, field_20127_a.field_835_c);
            }
        }

        field_20126_b = field_20127_a.field_834_d;
        field_20129_c = field_20127_a.field_832_b;
        field_20128_h = field_20127_a.field_835_c;
    }

    public void func_20112_a(int p_20112_1_, int p_20112_2_)
    {
        if(p_20112_1_ == 0)
        {
            field_20127_a.field_834_d = p_20112_2_;
        }
        if(p_20112_1_ == 1)
        {
            field_20127_a.field_832_b = p_20112_2_;
        }
        if(p_20112_1_ == 2)
        {
            field_20127_a.field_835_c = p_20112_2_;
        }
    }

    public boolean func_20120_b(EntityPlayer p_20120_1_)
    {
        return field_20127_a.func_20070_a_(p_20120_1_);
    }

    public ItemStack func_27279_a(int p_27279_1_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)field_20122_e.get(p_27279_1_);
        if(slot != null && slot.func_20005_c())
        {
            ItemStack itemstack1 = slot.func_777_b();
            itemstack = itemstack1.func_1102_e();
            if(p_27279_1_ == 2)
            {
                if(!func_28125_a(itemstack1, 3, 39, true))
                {
                    return null;
                }
                slot.func_48433_a(itemstack1, itemstack);
            } else
            if(p_27279_1_ == 1 || p_27279_1_ == 0)
            {
                if(!func_28125_a(itemstack1, 3, 39, false))
                {
                    return null;
                }
            } else
            if(FurnaceRecipes.func_21200_a().func_21198_a(itemstack1.func_1091_a().field_291_aS) != null)
            {
                if(!func_28125_a(itemstack1, 0, 1, false))
                {
                    return null;
                }
            } else
            if(TileEntityFurnace.func_52005_b(itemstack1))
            {
                if(!func_28125_a(itemstack1, 1, 2, false))
                {
                    return null;
                }
            } else
            if(p_27279_1_ >= 3 && p_27279_1_ < 30)
            {
                if(!func_28125_a(itemstack1, 30, 39, false))
                {
                    return null;
                }
            } else
            if(p_27279_1_ >= 30 && p_27279_1_ < 39 && !func_28125_a(itemstack1, 3, 30, false))
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
