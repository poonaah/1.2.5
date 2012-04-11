// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, StructureComponent, Block, 
//            World

public class ComponentVillageHouse1 extends ComponentVillage
{

    private int field_35096_a;

    public ComponentVillageHouse1(int p_i176_1_, Random p_i176_2_, StructureBoundingBox p_i176_3_, int p_i176_4_)
    {
        super(p_i176_1_);
        field_35096_a = -1;
        field_35025_h = p_i176_4_;
        field_35024_g = p_i176_3_;
    }

    public void func_35004_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentVillageHouse1 func_35095_a(List p_35095_0_, Random p_35095_1_, int p_35095_2_, int p_35095_3_, int p_35095_4_, int p_35095_5_, int p_35095_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_35095_2_, p_35095_3_, p_35095_4_, 0, 0, 0, 9, 9, 6, p_35095_5_);
        if(!func_35074_a(structureboundingbox) || StructureComponent.func_35020_a(p_35095_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentVillageHouse1(p_35095_6_, p_35095_1_, structureboundingbox, p_35095_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(field_35096_a < 0)
        {
            field_35096_a = func_35075_b(p_35023_1_, p_35023_3_);
            if(field_35096_a < 0)
            {
                return true;
            }
            field_35024_g.func_35745_a(0, ((field_35096_a - field_35024_g.field_35750_e) + 9) - 1, 0);
        }
        func_35011_a(p_35023_1_, p_35023_3_, 1, 1, 1, 7, 5, 4, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 0, 0, 8, 0, 5, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 5, 0, 8, 5, 5, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 6, 1, 8, 6, 4, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 7, 2, 8, 7, 3, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        int i = func_35009_c(Block.field_4059_au.field_376_bc, 3);
        int j = func_35009_c(Block.field_4059_au.field_376_bc, 2);
        for(int k = -1; k <= 2; k++)
        {
            for(int i1 = 0; i1 <= 8; i1++)
            {
                func_35018_a(p_35023_1_, Block.field_4059_au.field_376_bc, i, i1, 6 + k, k, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_4059_au.field_376_bc, j, i1, 6 + k, 5 - k, p_35023_3_);
            }

        }

        func_35011_a(p_35023_1_, p_35023_3_, 0, 1, 0, 0, 1, 5, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 1, 5, 8, 1, 5, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 8, 1, 0, 8, 1, 4, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 2, 1, 0, 7, 1, 0, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 2, 0, 0, 4, 0, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 2, 5, 0, 4, 5, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 8, 2, 5, 8, 4, 5, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 8, 2, 0, 8, 4, 0, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 2, 1, 0, 4, 4, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 2, 5, 7, 4, 5, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 8, 2, 1, 8, 4, 4, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 2, 0, 7, 4, 0, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 4, 2, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 5, 2, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 6, 2, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 4, 3, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 5, 3, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 6, 3, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 0, 2, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 0, 2, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 0, 3, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 0, 3, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 8, 2, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 8, 2, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 8, 3, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 8, 3, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 2, 2, 5, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 3, 2, 5, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 5, 2, 5, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 6, 2, 5, p_35023_3_);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 4, 1, 7, 4, 1, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 4, 4, 7, 4, 4, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 3, 4, 7, 3, 4, Block.field_407_ao.field_376_bc, Block.field_407_ao.field_376_bc, false);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 7, 1, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_4059_au.field_376_bc, func_35009_c(Block.field_4059_au.field_376_bc, 0), 7, 1, 3, p_35023_3_);
        int l = func_35009_c(Block.field_4059_au.field_376_bc, 3);
        func_35018_a(p_35023_1_, Block.field_4059_au.field_376_bc, l, 6, 1, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_4059_au.field_376_bc, l, 5, 1, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_4059_au.field_376_bc, l, 4, 1, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_4059_au.field_376_bc, l, 3, 1, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 6, 1, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_4065_aN.field_376_bc, 0, 6, 2, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 4, 1, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_4065_aN.field_376_bc, 0, 4, 2, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_387_az.field_376_bc, 0, 7, 1, 1, p_35023_3_);
        func_35018_a(p_35023_1_, 0, 0, 1, 1, 0, p_35023_3_);
        func_35018_a(p_35023_1_, 0, 0, 1, 2, 0, p_35023_3_);
        func_35002_a(p_35023_1_, p_35023_3_, p_35023_2_, 1, 1, 0, func_35009_c(Block.field_442_aF.field_376_bc, 1));
        if(func_35007_a(p_35023_1_, 1, 0, -1, p_35023_3_) == 0 && func_35007_a(p_35023_1_, 1, -1, -1, p_35023_3_) != 0)
        {
            func_35018_a(p_35023_1_, Block.field_4069_aI.field_376_bc, func_35009_c(Block.field_4069_aI.field_376_bc, 3), 1, 0, -1, p_35023_3_);
        }
        for(int j1 = 0; j1 < 6; j1++)
        {
            for(int k1 = 0; k1 < 9; k1++)
            {
                func_35016_b(p_35023_1_, k1, 9, j1, p_35023_3_);
                func_35005_b(p_35023_1_, Block.field_335_x.field_376_bc, 0, k1, -1, j1, p_35023_3_);
            }

        }

        func_40044_a(p_35023_1_, p_35023_3_, 2, 1, 2, 1);
        return true;
    }

    protected int func_40043_a(int p_40043_1_)
    {
        return 1;
    }
}
