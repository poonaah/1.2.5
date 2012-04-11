// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            IRecipe, InventoryCrafting, ItemStack

public class ShapelessRecipes
    implements IRecipe
{

    private final ItemStack field_21144_a;
    private final List field_21143_b;

    public ShapelessRecipes(ItemStack p_i140_1_, List p_i140_2_)
    {
        field_21144_a = p_i140_1_;
        field_21143_b = p_i140_2_;
    }

    public ItemStack func_25117_b()
    {
        return field_21144_a;
    }

    public boolean func_21135_a(InventoryCrafting p_21135_1_)
    {
        ArrayList arraylist = new ArrayList(field_21143_b);
        int i = 0;
        do
        {
            if(i >= 3)
            {
                break;
            }
            for(int j = 0; j < 3; j++)
            {
                ItemStack itemstack = p_21135_1_.func_21103_b(j, i);
                if(itemstack == null)
                {
                    continue;
                }
                boolean flag = false;
                Iterator iterator = arraylist.iterator();
                do
                {
                    if(!iterator.hasNext())
                    {
                        break;
                    }
                    ItemStack itemstack1 = (ItemStack)iterator.next();
                    if(itemstack.field_1617_c != itemstack1.field_1617_c || itemstack1.func_21181_i() != -1 && itemstack.func_21181_i() != itemstack1.func_21181_i())
                    {
                        continue;
                    }
                    flag = true;
                    arraylist.remove(itemstack1);
                    break;
                } while(true);
                if(!flag)
                {
                    return false;
                }
            }

            i++;
        } while(true);
        return arraylist.isEmpty();
    }

    public ItemStack func_21136_b(InventoryCrafting p_21136_1_)
    {
        return field_21144_a.func_1102_e();
    }

    public int func_1184_a()
    {
        return field_21143_b.size();
    }
}
