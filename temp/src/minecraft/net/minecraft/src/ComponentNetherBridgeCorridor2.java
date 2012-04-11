// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentNetherBridgePiece, ComponentNetherBridgeStartPiece, StructureBoundingBox, StructureComponent, 
//            Block, World

public class ComponentNetherBridgeCorridor2 extends ComponentNetherBridgePiece
{

    public ComponentNetherBridgeCorridor2(int p_i651_1_, Random p_i651_2_, StructureBoundingBox p_i651_3_, int p_i651_4_)
    {
        super(p_i651_1_);
        field_35025_h = p_i651_4_;
        field_35024_g = p_i651_3_;
    }

    public void func_35004_a(StructureComponent p_35004_1_, List p_35004_2_, Random p_35004_3_)
    {
        func_40016_c((ComponentNetherBridgeStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, 0, 1, true);
    }

    public static ComponentNetherBridgeCorridor2 func_40041_a(List p_40041_0_, Random p_40041_1_, int p_40041_2_, int p_40041_3_, int p_40041_4_, int p_40041_5_, int p_40041_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_40041_2_, p_40041_3_, p_40041_4_, -1, 0, 0, 5, 7, 5, p_40041_5_);
        if(!func_40021_a(structureboundingbox) || StructureComponent.func_35020_a(p_40041_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentNetherBridgeCorridor2(p_40041_6_, p_40041_1_, structureboundingbox, p_40041_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        func_35011_a(p_35023_1_, p_35023_3_, 0, 0, 0, 4, 1, 4, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 2, 0, 4, 5, 4, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 2, 0, 0, 5, 4, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 3, 1, 0, 4, 1, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 3, 3, 0, 4, 3, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 4, 2, 0, 4, 5, 0, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 2, 4, 4, 5, 4, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
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
