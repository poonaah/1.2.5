// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentNetherBridgePiece, ComponentNetherBridgeStartPiece, StructureBoundingBox, StructureComponent, 
//            Block, World

public class ComponentNetherBridgeCorridor4 extends ComponentNetherBridgePiece
{

    public ComponentNetherBridgeCorridor4(int p_i395_1_, Random p_i395_2_, StructureBoundingBox p_i395_3_, int p_i395_4_)
    {
        super(p_i395_1_);
        field_35025_h = p_i395_4_;
        field_35024_g = p_i395_3_;
    }

    public void func_35004_a(StructureComponent p_35004_1_, List p_35004_2_, Random p_35004_3_)
    {
        byte byte0 = 1;
        if(field_35025_h == 1 || field_35025_h == 2)
        {
            byte0 = 5;
        }
        func_40019_b((ComponentNetherBridgeStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, 0, byte0, p_35004_3_.nextInt(8) > 0);
        func_40016_c((ComponentNetherBridgeStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, 0, byte0, p_35004_3_.nextInt(8) > 0);
    }

    public static ComponentNetherBridgeCorridor4 func_40039_a(List p_40039_0_, Random p_40039_1_, int p_40039_2_, int p_40039_3_, int p_40039_4_, int p_40039_5_, int p_40039_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_40039_2_, p_40039_3_, p_40039_4_, -3, 0, 0, 9, 7, 9, p_40039_5_);
        if(!func_40021_a(structureboundingbox) || StructureComponent.func_35020_a(p_40039_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentNetherBridgeCorridor4(p_40039_6_, p_40039_1_, structureboundingbox, p_40039_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        func_35011_a(p_35023_1_, p_35023_3_, 0, 0, 0, 8, 1, 8, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 2, 0, 8, 5, 8, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 6, 0, 8, 6, 5, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 2, 0, 2, 5, 0, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 6, 2, 0, 8, 5, 0, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 3, 0, 1, 4, 0, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 7, 3, 0, 7, 4, 0, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 2, 4, 8, 2, 8, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 1, 4, 2, 2, 4, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 6, 1, 4, 7, 2, 4, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 3, 8, 8, 3, 8, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 3, 6, 0, 3, 7, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 8, 3, 6, 8, 3, 7, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 3, 4, 0, 5, 5, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 8, 3, 4, 8, 5, 5, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 3, 5, 2, 5, 5, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 6, 3, 5, 7, 5, 5, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 4, 5, 1, 5, 5, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 7, 4, 5, 7, 5, 5, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
        for(int i = 0; i <= 5; i++)
        {
            for(int j = 0; j <= 8; j++)
            {
                func_35005_b(p_35023_1_, Block.field_40206_bB.field_376_bc, 0, j, -1, i, p_35023_3_);
            }

        }

        return true;
    }
}
