// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package net.minecraft.src:
//            Block, ItemStack, Item

public class FurnaceRecipes
{

    private static final FurnaceRecipes field_21202_a = new FurnaceRecipes();
    private Map field_21201_b;

    public static final FurnaceRecipes func_21200_a()
    {
        return field_21202_a;
    }

    private FurnaceRecipes()
    {
        field_21201_b = new HashMap();
        func_21199_a(Block.field_388_I.field_376_bc, new ItemStack(Item.field_223_m));
        func_21199_a(Block.field_390_H.field_376_bc, new ItemStack(Item.field_222_n));
        func_21199_a(Block.field_391_ax.field_376_bc, new ItemStack(Item.field_224_l));
        func_21199_a(Block.field_393_F.field_376_bc, new ItemStack(Block.field_382_N));
        func_21199_a(Item.field_272_ao.field_291_aS, new ItemStack(Item.field_4017_ap));
        func_21199_a(Item.field_35417_bj.field_291_aS, new ItemStack(Item.field_35418_bk));
        func_21199_a(Item.field_35419_bl.field_291_aS, new ItemStack(Item.field_35420_bm));
        func_21199_a(Item.field_4021_aS.field_291_aS, new ItemStack(Item.field_4020_aT));
        func_21199_a(Block.field_335_x.field_376_bc, new ItemStack(Block.field_338_u));
        func_21199_a(Item.field_303_aG.field_291_aS, new ItemStack(Item.field_4030_aF));
        func_21199_a(Block.field_425_aW.field_376_bc, new ItemStack(Item.field_21021_aU, 1, 2));
        func_21199_a(Block.field_385_K.field_376_bc, new ItemStack(Item.field_225_k, 1, 1));
        func_21199_a(Block.field_386_J.field_376_bc, new ItemStack(Item.field_225_k));
        func_21199_a(Block.field_433_aO.field_376_bc, new ItemStack(Item.field_309_aA));
        func_21199_a(Block.field_9267_N.field_376_bc, new ItemStack(Item.field_21021_aU, 1, 4));
    }

    public void func_21199_a(int p_21199_1_, ItemStack p_21199_2_)
    {
        field_21201_b.put(Integer.valueOf(p_21199_1_), p_21199_2_);
    }

    public ItemStack func_21198_a(int p_21198_1_)
    {
        return (ItemStack)field_21201_b.get(Integer.valueOf(p_21198_1_));
    }

    public Map func_25194_b()
    {
        return field_21201_b;
    }

}
