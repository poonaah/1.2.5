// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, StructureComponent, Block, 
//            World

public class ComponentVillageHall extends ComponentVillage
{

    private int field_35079_a;

    public ComponentVillageHall(int p_i530_1_, Random p_i530_2_, StructureBoundingBox p_i530_3_, int p_i530_4_)
    {
        super(p_i530_1_);
        field_35079_a = -1;
        field_35025_h = p_i530_4_;
        field_35024_g = p_i530_3_;
    }

    public void func_35004_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentVillageHall func_35078_a(List p_35078_0_, Random p_35078_1_, int p_35078_2_, int p_35078_3_, int p_35078_4_, int p_35078_5_, int p_35078_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_35078_2_, p_35078_3_, p_35078_4_, 0, 0, 0, 9, 7, 11, p_35078_5_);
        if(!func_35074_a(structureboundingbox) || StructureComponent.func_35020_a(p_35078_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentVillageHall(p_35078_6_, p_35078_1_, structureboundingbox, p_35078_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(field_35079_a < 0)
        {
            field_35079_a = func_35075_b(p_35023_1_, p_35023_3_);
            if(field_35079_a < 0)
            {
                return true;
            }
            field_35024_g.func_35745_a(0, ((field_35079_a - field_35024_g.field_35750_e) + 7) - 1, 0);
        }
        func_35011_a(p_35023_1_, p_35023_3_, 1, 1, 1, 7, 4, 4, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 2, 1, 6, 8, 4, 10, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 2, 0, 6, 8, 0, 10, Block.field_336_w.field_376_bc, Block.field_336_w.field_376_bc, false);
        func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 6, 0, 6, p_35023_3_);
        func_35011_a(p_35023_1_, p_35023_3_, 2, 1, 6, 2, 1, 10, Block.field_4057_ba.field_376_bc, Block.field_4057_ba.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 8, 1, 6, 8, 1, 10, Block.field_4057_ba.field_376_bc, Block.field_4057_ba.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 3, 1, 10, 7, 1, 10, Block.field_4057_ba.field_376_bc, Block.field_4057_ba.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 0, 1, 7, 0, 4, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 0, 0, 0, 3, 5, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 8, 0, 0, 8, 3, 5, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 0, 0, 7, 1, 0, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 0, 5, 7, 1, 5, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 2, 0, 7, 3, 0, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 2, 5, 7, 3, 5, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 4, 1, 8, 4, 1, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 4, 4, 8, 4, 4, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 5, 2, 8, 5, 3, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 0, 4, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 0, 4, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 8, 4, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 8, 4, 3, p_35023_3_);
        int i = func_35009_c(Block.field_4059_au.field_376_bc, 3);
        int j = func_35009_c(Block.field_4059_au.field_376_bc, 2);
        for(int k = -1; k <= 2; k++)
        {
            for(int i1 = 0; i1 <= 8; i1++)
            {
                func_35018_a(p_35023_1_, Block.field_4059_au.field_376_bc, i, i1, 4 + k, k, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_4059_au.field_376_bc, j, i1, 4 + k, 5 - k, p_35023_3_);
            }

        }

        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 0, 2, 1, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 0, 2, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 8, 2, 1, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 8, 2, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 0, 2, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 0, 2, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 8, 2, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 8, 2, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 2, 2, 5, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 3, 2, 5, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 5, 2, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 6, 2, 5, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 2, 1, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_4065_aN.field_376_bc, 0, 2, 2, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 1, 1, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_4059_au.field_376_bc, func_35009_c(Block.field_4059_au.field_376_bc, 3), 2, 1, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_4059_au.field_376_bc, func_35009_c(Block.field_4059_au.field_376_bc, 1), 1, 1, 3, p_35023_3_);
        func_35011_a(p_35023_1_, p_35023_3_, 5, 0, 1, 7, 0, 3, Block.field_411_ak.field_376_bc, Block.field_411_ak.field_376_bc, false);
        func_35018_a(p_35023_1_, Block.field_411_ak.field_376_bc, 0, 6, 1, 1, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_411_ak.field_376_bc, 0, 6, 1, 2, p_35023_3_);
        func_35018_a(p_35023_1_, 0, 0, 2, 1, 0, p_35023_3_);
        func_35018_a(p_35023_1_, 0, 0, 2, 2, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, 2, 3, 1, p_35023_3_);
        func_35002_a(p_35023_1_, p_35023_3_, p_35023_2_, 2, 1, 0, func_35009_c(Block.field_442_aF.field_376_bc, 1));
        if(func_35007_a(p_35023_1_, 2, 0, -1, p_35023_3_) == 0 && func_35007_a(p_35023_1_, 2, -1, -1, p_35023_3_) != 0)
        {
            func_35018_a(p_35023_1_, Block.field_4069_aI.field_376_bc, func_35009_c(Block.field_4069_aI.field_376_bc, 3), 2, 0, -1, p_35023_3_);
        }
        func_35018_a(p_35023_1_, 0, 0, 6, 1, 5, p_35023_3_);
        func_35018_a(p_35023_1_, 0, 0, 6, 2, 5, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, 6, 3, 4, p_35023_3_);
        func_35002_a(p_35023_1_, p_35023_3_, p_35023_2_, 6, 1, 5, func_35009_c(Block.field_442_aF.field_376_bc, 1));
        for(int l = 0; l < 5; l++)
        {
            for(int j1 = 0; j1 < 9; j1++)
            {
                func_35016_b(p_35023_1_, j1, 7, l, p_35023_3_);
                func_35005_b(p_35023_1_, Block.field_335_x.field_376_bc, 0, j1, -1, l, p_35023_3_);
            }

        }

        func_40044_a(p_35023_1_, p_35023_3_, 4, 1, 2, 2);
        return true;
    }

    protected int func_40043_a(int p_40043_1_)
    {
        return p_40043_1_ != 0 ? 0 : 4;
    }
}
