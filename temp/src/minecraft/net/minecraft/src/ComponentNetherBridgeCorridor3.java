// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentNetherBridgePiece, ComponentNetherBridgeStartPiece, StructureBoundingBox, StructureComponent, 
//            Block, World

public class ComponentNetherBridgeCorridor3 extends ComponentNetherBridgePiece
{

    public ComponentNetherBridgeCorridor3(int p_i588_1_, Random p_i588_2_, StructureBoundingBox p_i588_3_, int p_i588_4_)
    {
        super(p_i588_1_);
        field_35025_h = p_i588_4_;
        field_35024_g = p_i588_3_;
    }

    public void func_35004_a(StructureComponent p_35004_1_, List p_35004_2_, Random p_35004_3_)
    {
        func_40022_a((ComponentNetherBridgeStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, 1, 0, true);
    }

    public static ComponentNetherBridgeCorridor3 func_40042_a(List p_40042_0_, Random p_40042_1_, int p_40042_2_, int p_40042_3_, int p_40042_4_, int p_40042_5_, int p_40042_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_40042_2_, p_40042_3_, p_40042_4_, -1, -7, 0, 5, 14, 10, p_40042_5_);
        if(!func_40021_a(structureboundingbox) || StructureComponent.func_35020_a(p_40042_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentNetherBridgeCorridor3(p_40042_6_, p_40042_1_, structureboundingbox, p_40042_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        int i = func_35009_c(Block.field_40204_bD.field_376_bc, 2);
        for(int j = 0; j <= 9; j++)
        {
            int k = Math.max(1, 7 - j);
            int l = Math.min(Math.max(k + 5, 14 - j), 13);
            int i1 = j;
            func_35011_a(p_35023_1_, p_35023_3_, 0, 0, i1, 4, k, i1, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
            func_35011_a(p_35023_1_, p_35023_3_, 1, k + 1, i1, 3, l - 1, i1, 0, 0, false);
            if(j <= 6)
            {
                func_35018_a(p_35023_1_, Block.field_40204_bD.field_376_bc, i, 1, k + 1, i1, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_40204_bD.field_376_bc, i, 2, k + 1, i1, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_40204_bD.field_376_bc, i, 3, k + 1, i1, p_35023_3_);
            }
            func_35011_a(p_35023_1_, p_35023_3_, 0, l, i1, 4, l, i1, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
            func_35011_a(p_35023_1_, p_35023_3_, 0, k + 1, i1, 0, l - 1, i1, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
            func_35011_a(p_35023_1_, p_35023_3_, 4, k + 1, i1, 4, l - 1, i1, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
            if((j & 1) == 0)
            {
                func_35011_a(p_35023_1_, p_35023_3_, 0, k + 2, i1, 0, k + 3, i1, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
                func_35011_a(p_35023_1_, p_35023_3_, 4, k + 2, i1, 4, k + 3, i1, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
            }
            for(int j1 = 0; j1 <= 4; j1++)
            {
                func_35005_b(p_35023_1_, Block.field_40206_bB.field_376_bc, 0, j1, -1, i1, p_35023_3_);
            }

        }

        return true;
    }
}
