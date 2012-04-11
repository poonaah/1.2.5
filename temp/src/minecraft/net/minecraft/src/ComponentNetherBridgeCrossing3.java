// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentNetherBridgePiece, StructureBoundingBox, ComponentNetherBridgeStartPiece, StructureComponent, 
//            Block, World

public class ComponentNetherBridgeCrossing3 extends ComponentNetherBridgePiece
{

    public ComponentNetherBridgeCrossing3(int p_i443_1_, Random p_i443_2_, StructureBoundingBox p_i443_3_, int p_i443_4_)
    {
        super(p_i443_1_);
        field_35025_h = p_i443_4_;
        field_35024_g = p_i443_3_;
    }

    protected ComponentNetherBridgeCrossing3(Random p_i444_1_, int p_i444_2_, int p_i444_3_)
    {
        super(0);
        field_35025_h = p_i444_1_.nextInt(4);
        switch(field_35025_h)
        {
        case 0: // '\0'
        case 2: // '\002'
            field_35024_g = new StructureBoundingBox(p_i444_2_, 64, p_i444_3_, (p_i444_2_ + 19) - 1, 73, (p_i444_3_ + 19) - 1);
            break;

        default:
            field_35024_g = new StructureBoundingBox(p_i444_2_, 64, p_i444_3_, (p_i444_2_ + 19) - 1, 73, (p_i444_3_ + 19) - 1);
            break;
        }
    }

    public void func_35004_a(StructureComponent p_35004_1_, List p_35004_2_, Random p_35004_3_)
    {
        func_40022_a((ComponentNetherBridgeStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, 8, 3, false);
        func_40019_b((ComponentNetherBridgeStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, 3, 8, false);
        func_40016_c((ComponentNetherBridgeStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, 3, 8, false);
    }

    public static ComponentNetherBridgeCrossing3 func_40033_a(List p_40033_0_, Random p_40033_1_, int p_40033_2_, int p_40033_3_, int p_40033_4_, int p_40033_5_, int p_40033_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_40033_2_, p_40033_3_, p_40033_4_, -8, -3, 0, 19, 10, 19, p_40033_5_);
        if(!func_40021_a(structureboundingbox) || StructureComponent.func_35020_a(p_40033_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentNetherBridgeCrossing3(p_40033_6_, p_40033_1_, structureboundingbox, p_40033_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        func_35011_a(p_35023_1_, p_35023_3_, 7, 3, 0, 11, 4, 18, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 3, 7, 18, 4, 11, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 8, 5, 0, 10, 7, 18, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 5, 8, 18, 7, 10, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 7, 5, 0, 7, 5, 7, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 7, 5, 11, 7, 5, 18, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 11, 5, 0, 11, 5, 7, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 11, 5, 11, 11, 5, 18, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 5, 7, 7, 5, 7, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 11, 5, 7, 18, 5, 7, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 5, 11, 7, 5, 11, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 11, 5, 11, 18, 5, 11, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 7, 2, 0, 11, 2, 5, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 7, 2, 13, 11, 2, 18, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 7, 0, 0, 11, 1, 3, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 7, 0, 15, 11, 1, 18, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        for(int i = 7; i <= 11; i++)
        {
            for(int k = 0; k <= 2; k++)
            {
                func_35005_b(p_35023_1_, Block.field_40206_bB.field_376_bc, 0, i, -1, k, p_35023_3_);
                func_35005_b(p_35023_1_, Block.field_40206_bB.field_376_bc, 0, i, -1, 18 - k, p_35023_3_);
            }

        }

        func_35011_a(p_35023_1_, p_35023_3_, 0, 2, 7, 5, 2, 11, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 13, 2, 7, 18, 2, 11, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 0, 7, 3, 1, 11, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 15, 0, 7, 18, 1, 11, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        for(int j = 0; j <= 2; j++)
        {
            for(int l = 7; l <= 11; l++)
            {
                func_35005_b(p_35023_1_, Block.field_40206_bB.field_376_bc, 0, j, -1, l, p_35023_3_);
                func_35005_b(p_35023_1_, Block.field_40206_bB.field_376_bc, 0, 18 - j, -1, l, p_35023_3_);
            }

        }

        return true;
    }
}
