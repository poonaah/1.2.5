// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, StructureComponent, Block, 
//            World

public class ComponentVillageHouse3 extends ComponentVillage
{

    private int field_35102_a;

    public ComponentVillageHouse3(int p_i692_1_, Random p_i692_2_, StructureBoundingBox p_i692_3_, int p_i692_4_)
    {
        super(p_i692_1_);
        field_35102_a = -1;
        field_35025_h = p_i692_4_;
        field_35024_g = p_i692_3_;
    }

    public void func_35004_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentVillageHouse3 func_35101_a(List p_35101_0_, Random p_35101_1_, int p_35101_2_, int p_35101_3_, int p_35101_4_, int p_35101_5_, int p_35101_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_35101_2_, p_35101_3_, p_35101_4_, 0, 0, 0, 9, 7, 12, p_35101_5_);
        if(!func_35074_a(structureboundingbox) || StructureComponent.func_35020_a(p_35101_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentVillageHouse3(p_35101_6_, p_35101_1_, structureboundingbox, p_35101_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(field_35102_a < 0)
        {
            field_35102_a = func_35075_b(p_35023_1_, p_35023_3_);
            if(field_35102_a < 0)
            {
                return true;
            }
            field_35024_g.func_35745_a(0, ((field_35102_a - field_35024_g.field_35750_e) + 7) - 1, 0);
        }
        func_35011_a(p_35023_1_, p_35023_3_, 1, 1, 1, 7, 4, 4, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 2, 1, 6, 8, 4, 10, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 2, 0, 5, 8, 0, 10, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 0, 1, 7, 0, 4, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 0, 0, 0, 3, 5, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 8, 0, 0, 8, 3, 10, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 0, 0, 7, 2, 0, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 0, 5, 2, 1, 5, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 2, 0, 6, 2, 3, 10, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 3, 0, 10, 7, 3, 10, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 2, 0, 7, 3, 0, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 2, 5, 2, 3, 5, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 4, 1, 8, 4, 1, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 4, 4, 3, 4, 4, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 5, 2, 8, 5, 3, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 0, 4, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 0, 4, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 8, 4, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 8, 4, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 8, 4, 4, p_35023_3_);
        int i = func_35009_c(Block.field_4059_au.field_376_bc, 3);
        int j = func_35009_c(Block.field_4059_au.field_376_bc, 2);
        for(int k = -1; k <= 2; k++)
        {
            for(int i1 = 0; i1 <= 8; i1++)
            {
                func_35018_a(p_35023_1_, Block.field_4059_au.field_376_bc, i, i1, 4 + k, k, p_35023_3_);
                if((k > -1 || i1 <= 1) && (k > 0 || i1 <= 3) && (k > 1 || i1 <= 4 || i1 >= 6))
                {
                    func_35018_a(p_35023_1_, Block.field_4059_au.field_376_bc, j, i1, 4 + k, 5 - k, p_35023_3_);
                }
            }

        }

        func_35011_a(p_35023_1_, p_35023_3_, 3, 4, 5, 3, 4, 10, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 7, 4, 2, 7, 4, 10, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 4, 5, 4, 4, 5, 10, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 6, 5, 4, 6, 5, 10, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 5, 6, 3, 5, 6, 10, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        int l = func_35009_c(Block.field_4059_au.field_376_bc, 0);
        for(int j1 = 4; j1 >= 1; j1--)
        {
            func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, j1, 2 + j1, 7 - j1, p_35023_3_);
            for(int l1 = 8 - j1; l1 <= 10; l1++)
            {
                func_35018_a(p_35023_1_, Block.field_4059_au.field_376_bc, l, j1, 2 + j1, l1, p_35023_3_);
            }

        }

        int k1 = func_35009_c(Block.field_4059_au.field_376_bc, 1);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 6, 6, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 7, 5, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_4059_au.field_376_bc, k1, 6, 6, 4, p_35023_3_);
        for(int i2 = 6; i2 <= 8; i2++)
        {
            for(int l2 = 5; l2 <= 10; l2++)
            {
                func_35018_a(p_35023_1_, Block.field_4059_au.field_376_bc, k1, i2, 12 - i2, l2, p_35023_3_);
            }

        }

        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 0, 2, 1, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 0, 2, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 0, 2, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 0, 2, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 4, 2, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 5, 2, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 6, 2, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 8, 2, 1, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 8, 2, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 8, 2, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 8, 2, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 8, 2, 5, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 8, 2, 6, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 8, 2, 7, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 8, 2, 8, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 8, 2, 9, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 2, 2, 6, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 2, 2, 7, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 2, 2, 8, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 2, 2, 9, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 4, 4, 10, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 5, 4, 10, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 6, 4, 10, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 5, 5, 10, p_35023_3_);
        func_35018_a(p_35023_1_, 0, 0, 2, 1, 0, p_35023_3_);
        func_35018_a(p_35023_1_, 0, 0, 2, 2, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, 2, 3, 1, p_35023_3_);
        func_35002_a(p_35023_1_, p_35023_3_, p_35023_2_, 2, 1, 0, func_35009_c(Block.field_442_aF.field_376_bc, 1));
        func_35011_a(p_35023_1_, p_35023_3_, 1, 0, -1, 3, 2, -1, 0, 0, false);
        if(func_35007_a(p_35023_1_, 2, 0, -1, p_35023_3_) == 0 && func_35007_a(p_35023_1_, 2, -1, -1, p_35023_3_) != 0)
        {
            func_35018_a(p_35023_1_, Block.field_4069_aI.field_376_bc, func_35009_c(Block.field_4069_aI.field_376_bc, 3), 2, 0, -1, p_35023_3_);
        }
        for(int j2 = 0; j2 < 5; j2++)
        {
            for(int i3 = 0; i3 < 9; i3++)
            {
                func_35016_b(p_35023_1_, i3, 7, j2, p_35023_3_);
                func_35005_b(p_35023_1_, Block.field_335_x.field_376_bc, 0, i3, -1, j2, p_35023_3_);
            }

        }

        for(int k2 = 5; k2 < 11; k2++)
        {
            for(int j3 = 2; j3 < 9; j3++)
            {
                func_35016_b(p_35023_1_, j3, 7, k2, p_35023_3_);
                func_35005_b(p_35023_1_, Block.field_335_x.field_376_bc, 0, j3, -1, k2, p_35023_3_);
            }

        }

        func_40044_a(p_35023_1_, p_35023_3_, 4, 1, 2, 2);
        return true;
    }
}
