// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Comparator;

// Referenced classes of package net.minecraft.src:
//            ShapelessRecipes, ShapedRecipes, IRecipe, CraftingManager

class RecipeSorter
    implements Comparator
{

    final CraftingManager field_1557_a; /* synthetic field */

    RecipeSorter(CraftingManager p_i366_1_)
    {
        field_1557_a = p_i366_1_;
        super();
    }

    public int func_1040_a(IRecipe p_1040_1_, IRecipe p_1040_2_)
    {
        if((p_1040_1_ instanceof ShapelessRecipes) && (p_1040_2_ instanceof ShapedRecipes))
        {
            return 1;
        }
        if((p_1040_2_ instanceof ShapelessRecipes) && (p_1040_1_ instanceof ShapedRecipes))
        {
            return -1;
        }
        if(p_1040_2_.func_1184_a() < p_1040_1_.func_1184_a())
        {
            return -1;
        }
        return p_1040_2_.func_1184_a() <= p_1040_1_.func_1184_a() ? 0 : 1;
    }

    public int compare(Object p_compare_1_, Object p_compare_2_)
    {
        return func_1040_a((IRecipe)p_compare_1_, (IRecipe)p_compare_2_);
    }
}
