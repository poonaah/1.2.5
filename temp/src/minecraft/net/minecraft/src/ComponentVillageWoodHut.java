// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, StructureComponent, Block, 
//            World

public class ComponentVillageWoodHut extends ComponentVillage
{

    private int field_35094_a;
    private final boolean field_35092_b;
    private final int field_35093_c;

    public ComponentVillageWoodHut(int p_i222_1_, Random p_i222_2_, StructureBoundingBox p_i222_3_, int p_i222_4_)
    {
        super(p_i222_1_);
        field_35094_a = -1;
        field_35025_h = p_i222_4_;
        field_35024_g = p_i222_3_;
        field_35092_b = p_i222_2_.nextBoolean();
        field_35093_c = p_i222_2_.nextInt(3);
    }

    public void func_35004_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentVillageWoodHut func_35091_a(List p_35091_0_, Random p_35091_1_, int p_35091_2_, int p_35091_3_, int p_35091_4_, int p_35091_5_, int p_35091_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_35091_2_, p_35091_3_, p_35091_4_, 0, 0, 0, 4, 6, 5, p_35091_5_);
        if(!func_35074_a(structureboundingbox) || StructureComponent.func_35020_a(p_35091_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentVillageWoodHut(p_35091_6_, p_35091_1_, structureboundingbox, p_35091_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(field_35094_a < 0)
        {
            field_35094_a = func_35075_b(p_35023_1_, p_35023_3_);
            if(field_35094_a < 0)
            {
                return true;
            }
            field_35024_g.func_35745_a(0, ((field_35094_a - field_35024_g.field_35750_e) + 6) - 1, 0);
        }
        func_35011_a(p_35023_1_, p_35023_3_, 1, 1, 1, 3, 5, 4, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 0, 0, 3, 0, 4, Block.field_335_x.field_376_bc, Block.field_335_x.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 0, 1, 2, 0, 3, Block.field_336_w.field_376_bc, Block.field_336_w.field_376_bc, false);
        if(field_35092_b)
        {
            func_35011_a(p_35023_1_, p_35023_3_, 1, 4, 1, 2, 4, 3, Block.field_385_K.field_376_bc, Block.field_385_K.field_376_bc, false);
        } else
        {
            func_35011_a(p_35023_1_, p_35023_3_, 1, 5, 1, 2, 5, 3, Block.field_385_K.field_376_bc, Block.field_385_K.field_376_bc, false);
        }
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 1, 4, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 2, 4, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 1, 4, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 2, 4, 4, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 0, 4, 1, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 0, 4, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 0, 4, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 3, 4, 1, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 3, 4, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_385_K.field_376_bc, 0, 3, 4, 3, p_35023_3_);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 1, 0, 0, 3, 0, Block.field_385_K.field_376_bc, Block.field_385_K.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 3, 1, 0, 3, 3, 0, Block.field_385_K.field_376_bc, Block.field_385_K.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 1, 4, 0, 3, 4, Block.field_385_K.field_376_bc, Block.field_385_K.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 3, 1, 4, 3, 3, 4, Block.field_385_K.field_376_bc, Block.field_385_K.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 1, 1, 0, 3, 3, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 3, 1, 1, 3, 3, 3, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 1, 0, 2, 3, 0, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 1, 4, 2, 3, 4, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 0, 2, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_35282_br.field_376_bc, 0, 3, 2, 2, p_35023_3_);
        if(field_35093_c > 0)
        {
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, field_35093_c, 1, 3, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4065_aN.field_376_bc, 0, field_35093_c, 2, 3, p_35023_3_);
        }
        func_35018_a(p_35023_1_, 0, 0, 1, 1, 0, p_35023_3_);
        func_35018_a(p_35023_1_, 0, 0, 1, 2, 0, p_35023_3_);
        func_35002_a(p_35023_1_, p_35023_3_, p_35023_2_, 1, 1, 0, func_35009_c(Block.field_442_aF.field_376_bc, 1));
        if(func_35007_a(p_35023_1_, 1, 0, -1, p_35023_3_) == 0 && func_35007_a(p_35023_1_, 1, -1, -1, p_35023_3_) != 0)
        {
            func_35018_a(p_35023_1_, Block.field_4069_aI.field_376_bc, func_35009_c(Block.field_4069_aI.field_376_bc, 3), 1, 0, -1, p_35023_3_);
        }
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                func_35016_b(p_35023_1_, j, 6, i, p_35023_3_);
                func_35005_b(p_35023_1_, Block.field_335_x.field_376_bc, 0, j, -1, i, p_35023_3_);
            }

        }

        func_40044_a(p_35023_1_, p_35023_3_, 1, 1, 2, 1);
        return true;
    }
}
