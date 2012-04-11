// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentNetherBridgePiece, ComponentNetherBridgeStartPiece, StructureBoundingBox, StructureComponent, 
//            Block, World

public class ComponentNetherBridgeCorridor extends ComponentNetherBridgePiece
{

    public ComponentNetherBridgeCorridor(int p_i378_1_, Random p_i378_2_, StructureBoundingBox p_i378_3_, int p_i378_4_)
    {
        super(p_i378_1_);
        field_35025_h = p_i378_4_;
        field_35024_g = p_i378_3_;
    }

    public void func_35004_a(StructureComponent p_35004_1_, List p_35004_2_, Random p_35004_3_)
    {
        func_40019_b((ComponentNetherBridgeStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, 0, 1, true);
    }

    public static ComponentNetherBridgeCorridor func_40038_a(List p_40038_0_, Random p_40038_1_, int p_40038_2_, int p_40038_3_, int p_40038_4_, int p_40038_5_, int p_40038_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_40038_2_, p_40038_3_, p_40038_4_, -1, 0, 0, 5, 7, 5, p_40038_5_);
        if(!func_40021_a(structureboundingbox) || StructureComponent.func_35020_a(p_40038_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentNetherBridgeCorridor(p_40038_6_, p_40038_1_, structureboundingbox, p_40038_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        func_35011_a(p_35023_1_, p_35023_3_, 0, 0, 0, 4, 1, 4, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 2, 0, 4, 5, 4, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 4, 2, 0, 4, 5, 4, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 4, 3, 1, 4, 4, 1, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 4, 3, 3, 4, 4, 3, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 2, 0, 0, 5, 0, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 2, 4, 3, 5, 4, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 3, 4, 1, 4, 4, Block.field_40207_bC.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 3, 3, 4, 3, 4, 4, Block.field_40207_bC.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 6, 0, 4, 6, 4, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        for(int i = 0; i <= 4; i++)
        {
            for(int j = 0; j <= 4; j++)
            {
                func_35005_b(p_35023_1_, Block.field_40206_bB.field_376_bc, 0, i, -1, j, p_35023_3_);
            }

        }

        return true;
    }
}
