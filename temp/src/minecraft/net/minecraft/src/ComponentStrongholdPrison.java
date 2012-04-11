// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, ComponentStrongholdStairs2, StructureBoundingBox, StructureComponent, 
//            StructureStrongholdPieces, Block, EnumDoor, World

public class ComponentStrongholdPrison extends ComponentStronghold
{

    protected final EnumDoor field_35064_a;

    public ComponentStrongholdPrison(int p_i76_1_, Random p_i76_2_, StructureBoundingBox p_i76_3_, int p_i76_4_)
    {
        super(p_i76_1_);
        field_35025_h = p_i76_4_;
        field_35064_a = func_35031_a(p_i76_2_);
        field_35024_g = p_i76_3_;
    }

    public void func_35004_a(StructureComponent p_35004_1_, List p_35004_2_, Random p_35004_3_)
    {
        func_35028_a((ComponentStrongholdStairs2)p_35004_1_, p_35004_2_, p_35004_3_, 1, 1);
    }

    public static ComponentStrongholdPrison func_35063_a(List p_35063_0_, Random p_35063_1_, int p_35063_2_, int p_35063_3_, int p_35063_4_, int p_35063_5_, int p_35063_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_35063_2_, p_35063_3_, p_35063_4_, -1, -1, 0, 9, 5, 11, p_35063_5_);
        if(!func_35030_a(structureboundingbox) || StructureComponent.func_35020_a(p_35063_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentStrongholdPrison(p_35063_6_, p_35063_1_, structureboundingbox, p_35063_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(func_35013_a(p_35023_1_, p_35023_3_))
        {
            return false;
        } else
        {
            func_35022_a(p_35023_1_, p_35023_3_, 0, 0, 0, 8, 4, 10, true, p_35023_2_, StructureStrongholdPieces.func_35852_b());
            func_35033_a(p_35023_1_, p_35023_2_, p_35023_3_, field_35064_a, 1, 1, 0);
            func_35011_a(p_35023_1_, p_35023_3_, 1, 1, 10, 3, 3, 10, 0, 0, false);
            func_35022_a(p_35023_1_, p_35023_3_, 4, 1, 1, 4, 3, 1, false, p_35023_2_, StructureStrongholdPieces.func_35852_b());
            func_35022_a(p_35023_1_, p_35023_3_, 4, 1, 3, 4, 3, 3, false, p_35023_2_, StructureStrongholdPieces.func_35852_b());
            func_35022_a(p_35023_1_, p_35023_3_, 4, 1, 7, 4, 3, 7, false, p_35023_2_, StructureStrongholdPieces.func_35852_b());
            func_35022_a(p_35023_1_, p_35023_3_, 4, 1, 9, 4, 3, 9, false, p_35023_2_, StructureStrongholdPieces.func_35852_b());
            func_35011_a(p_35023_1_, p_35023_3_, 4, 1, 4, 4, 3, 6, Block.field_35288_bq.field_376_bc, Block.field_35288_bq.field_376_bc, false);
            func_35011_a(p_35023_1_, p_35023_3_, 5, 1, 5, 7, 3, 5, Block.field_35288_bq.field_376_bc, Block.field_35288_bq.field_376_bc, false);
            func_35018_a(p_35023_1_, Block.field_35288_bq.field_376_bc, 0, 4, 3, 2, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_35288_bq.field_376_bc, 0, 4, 3, 8, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_435_aM.field_376_bc, func_35009_c(Block.field_435_aM.field_376_bc, 3), 4, 1, 2, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_435_aM.field_376_bc, func_35009_c(Block.field_435_aM.field_376_bc, 3) + 8, 4, 2, 2, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_435_aM.field_376_bc, func_35009_c(Block.field_435_aM.field_376_bc, 3), 4, 1, 8, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_435_aM.field_376_bc, func_35009_c(Block.field_435_aM.field_376_bc, 3) + 8, 4, 2, 8, p_35023_3_);
            return true;
        }
    }
}
