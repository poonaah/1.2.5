// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentNetherBridgePiece, StructureBoundingBox, StructureComponent, Block, 
//            World, TileEntityMobSpawner

public class ComponentNetherBridgeThrone extends ComponentNetherBridgePiece
{

    private boolean field_40027_a;

    public ComponentNetherBridgeThrone(int p_i175_1_, Random p_i175_2_, StructureBoundingBox p_i175_3_, int p_i175_4_)
    {
        super(p_i175_1_);
        field_35025_h = p_i175_4_;
        field_35024_g = p_i175_3_;
    }

    public void func_35004_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentNetherBridgeThrone func_40026_a(List p_40026_0_, Random p_40026_1_, int p_40026_2_, int p_40026_3_, int p_40026_4_, int p_40026_5_, int p_40026_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_40026_2_, p_40026_3_, p_40026_4_, -2, 0, 0, 7, 8, 9, p_40026_5_);
        if(!func_40021_a(structureboundingbox) || StructureComponent.func_35020_a(p_40026_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentNetherBridgeThrone(p_40026_6_, p_40026_1_, structureboundingbox, p_40026_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        func_35011_a(p_35023_1_, p_35023_3_, 0, 2, 0, 6, 7, 7, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 0, 0, 5, 1, 7, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 2, 1, 5, 2, 7, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 3, 2, 5, 3, 7, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 4, 3, 5, 4, 7, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 2, 0, 1, 4, 2, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 5, 2, 0, 5, 4, 2, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 5, 2, 1, 5, 3, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 5, 5, 2, 5, 5, 3, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 5, 3, 0, 5, 8, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 6, 5, 3, 6, 5, 8, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 5, 8, 5, 5, 8, Block.field_40206_bB.field_376_bc, Block.field_40206_bB.field_376_bc, false);
        func_35018_a(p_35023_1_, Block.field_40207_bC.field_376_bc, 0, 1, 6, 3, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_40207_bC.field_376_bc, 0, 5, 6, 3, p_35023_3_);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 6, 3, 0, 6, 8, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 6, 6, 3, 6, 6, 8, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 6, 8, 5, 7, 8, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 2, 8, 8, 4, 8, 8, Block.field_40207_bC.field_376_bc, Block.field_40207_bC.field_376_bc, false);
        if(!field_40027_a)
        {
            int i = func_35008_a(5);
            int k = func_35017_a(3, 5);
            int i1 = func_35006_b(3, 5);
            if(p_35023_3_.func_35742_b(k, i, i1))
            {
                field_40027_a = true;
                p_35023_1_.func_690_d(k, i, i1, Block.field_400_at.field_376_bc);
                TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)p_35023_1_.func_603_b(k, i, i1);
                if(tileentitymobspawner != null)
                {
                    tileentitymobspawner.func_21098_a("Blaze");
                }
            }
        }
        for(int j = 0; j <= 6; j++)
        {
            for(int l = 0; l <= 6; l++)
            {
                func_35005_b(p_35023_1_, Block.field_40206_bB.field_376_bc, 0, j, -1, l, p_35023_3_);
            }

        }

        return true;
    }
}
