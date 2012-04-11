// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IRecipe, ItemStack, InventoryCrafting

public class ShapedRecipes
    implements IRecipe
{

    private int field_21138_b;
    private int field_21142_c;
    private ItemStack field_21141_d[];
    private ItemStack field_21140_e;
    public final int field_21139_a;

    public ShapedRecipes(int p_i738_1_, int p_i738_2_, ItemStack p_i738_3_[], ItemStack p_i738_4_)
    {
        field_21139_a = p_i738_4_.field_1617_c;
        field_21138_b = p_i738_1_;
        field_21142_c = p_i738_2_;
        field_21141_d = p_i738_3_;
        field_21140_e = p_i738_4_;
    }

    public ItemStack func_25117_b()
    {
        return field_21140_e;
    }

    public boolean func_21135_a(InventoryCrafting p_21135_1_)
    {
        for(int i = 0; i <= 3 - field_21138_b; i++)
        {
            for(int j = 0; j <= 3 - field_21142_c; j++)
            {
                if(func_21137_a(p_21135_1_, i, j, true))
                {
                    return true;
                }
                if(func_21137_a(p_21135_1_, i, j, false))
                {
                    return true;
                }
            }

        }

        return false;
    }

    private boolean func_21137_a(InventoryCrafting p_21137_1_, int p_21137_2_, int p_21137_3_, boolean p_21137_4_)
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                int k = i - p_21137_2_;
                int l = j - p_21137_3_;
                ItemStack itemstack = null;
                if(k >= 0 && l >= 0 && k < field_21138_b && l < field_21142_c)
                {
                    if(p_21137_4_)
                    {
                        itemstack = field_21141_d[(field_21138_b - k - 1) + l * field_21138_b];
                    } else
                    {
                        itemstack = field_21141_d[k + l * field_21138_b];
                    }
                }
                ItemStack itemstack1 = p_21137_1_.func_21103_b(i, j);
                if(itemstack1 == null && itemstack == null)
                {
                    continue;
                }
                if(itemstack1 == null && itemstack != null || itemstack1 != null && itemstack == null)
                {
                    return false;
                }
                if(itemstack.field_1617_c != itemstack1.field_1617_c)
                {
                    return false;
                }
                if(itemstack.func_21181_i() != -1 && itemstack.func_21181_i() != itemstack1.func_21181_i())
                {
                    return false;
                }
            }

        }

        return true;
    }

    public ItemStack func_21136_b(InventoryCrafting p_21136_1_)
    {
        return new ItemStack(field_21140_e.field_1617_c, field_21140_e.field_1615_a, field_21140_e.func_21181_i());
    }

    public int func_1184_a()
    {
        return field_21138_b * field_21142_c;
    }
}
