// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, StructureComponent, Block, 
//            World

public class ComponentVillageHouse4_Garden extends ComponentVillage
{

    private int field_35084_a;
    private final boolean field_35083_b;

    public ComponentVillageHouse4_Garden(int p_i310_1_, Random p_i310_2_, StructureBoundingBox p_i310_3_, int p_i310_4_)
    {
        super(p_i310_1_);
        field_35084_a = -1;
        field_35025_h = p_i310_4_;
        field_35024_g = p_i310_3_;
        field_35083_b = p_i310_2_.nextBoolean();
    }

    public void func_35004_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentVillageHouse4_Garden func_35082_a(List p_35082_0_, Random p_35082_1_, int p_35082_2_, int p_35082_3_, int p_35082_4_, int p_35082_5_, int p_35082_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_35082_2_, p_35082_3_, p_35082_4_, 0, 0, 0, 5, 6, 5, p_35082_5_);
        if(StructureComponent.func_35020_a(p_35082_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentVillageHouse4_Garden(p_35082_6_, p_35082_1_, structureboundingbox, p_35082_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(field_35084_a < 0)
        {
            field_35084_a = func_35075_b(p_35023_1_, p_35023_3_);
            if(field_35084_a < 0)
            {
                return true;
            }
            field_35024_g.func_35745_a(0, ((field_35084_a - field_35024_g.field_35750_e) + 6) - 1, 0);
        }
        func_35011_a(p_35023_1_, p_35023_3_, 0, 0, 0, 4, 0, 4, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 4, 0, 4, 4, 4, Block.field_385_K.field_376_bc, Block.field_385_K.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 4, 1, 3, 4, 3, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 0, 1, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 0, 2, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 0, 3, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 4, 1, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 4, 2, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 4, 3, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 0, 1, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 0, 2, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 0, 3, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 4, 1, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 4, 2, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 4, 3, 4, p_35023_3_);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 1, 1, 0, 3, 3, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 4, 1, 1, 4, 3, 3, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 1, 4, 3, 3, 4, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 0, 2, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 2, 2, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 4, 2, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 1, 1, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 1, 2, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 1, 3, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 2, 3, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 3, 3, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 3, 2, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 3, 1, 0, p_35023_3_);
        if(func_35007_a(p_35023_1_, 2, 0, -1, p_35023_3_) == 0 && func_35007_a(p_35023_1_, 2, -1, -1, p_35023_3_) != 0)
        {
            func_35018_a(p_35023_1_, Block.field_4069_aI.field_376_bc, func_35009_c(Block.field_4069_aI.field_376_bc, 3), 2, 0, -1, p_35023_3_);
        }
        func_35011_a(p_35023_1_, p_35023_3_, 1, 1, 1, 3, 3, 3, 0, 0, false);
        if(field_35083_b)
        {
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 0, 5, 0, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 1, 5, 0, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 2, 5, 0, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 3, 5, 0, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 4, 5, 0, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 0, 5, 4, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 1, 5, 4, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 2, 5, 4, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 3, 5, 4, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 4, 5, 4, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 4, 5, 1, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 4, 5, 2, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 4, 5, 3, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 0, 5, 1, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 0, 5, 2, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 0, 5, 3, p_35023_3_);
        }
        if(field_35083_b)
        {
            int i = func_35009_c(Block.field_441_aG.field_376_bc, 3);
            func_35018_a(p_35023_1_, Block.field_441_aG.field_376_bc, i, 3, 1, 3, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_441_aG.field_376_bc, i, 3, 2, 3, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_441_aG.field_376_bc, i, 3, 3, 3, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_441_aG.field_376_bc, i, 3, 4, 3, p_35023_3_);
        }
        func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, 2, 3, 1, p_35023_3_);
        for(int j = 0; j < 5; j++)
        {
            for(int k = 0; k < 5; k++)
            {
                func_35016_b(p_35023_1_, k, 6, j, p_35023_3_);
                func_35005_b(p_35023_1_, Block.field_335_x.field_376_bc, 0, k, -1, j, p_35023_3_);
            }

        }

        func_40044_a(p_35023_1_, p_35023_3_, 1, 1, 2, 1);
        return true;
    }
}
