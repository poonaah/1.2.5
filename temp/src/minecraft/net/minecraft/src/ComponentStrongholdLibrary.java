// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, StructureBoundingBox, StructureComponent, StructureStrongholdPieces, 
//            Block, StructurePieceTreasure, Item, ItemMap, 
//            EnumDoor, World

public class ComponentStrongholdLibrary extends ComponentStronghold
{

    private static final StructurePieceTreasure field_35056_b[];
    protected final EnumDoor field_35058_a;
    private final boolean field_35057_c;

    public ComponentStrongholdLibrary(int p_i35_1_, Random p_i35_2_, StructureBoundingBox p_i35_3_, int p_i35_4_)
    {
        super(p_i35_1_);
        field_35025_h = p_i35_4_;
        field_35058_a = func_35031_a(p_i35_2_);
        field_35024_g = p_i35_3_;
        field_35057_c = p_i35_3_.func_35743_c() > 6;
    }

    public void func_35004_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentStrongholdLibrary func_35055_a(List p_35055_0_, Random p_35055_1_, int p_35055_2_, int p_35055_3_, int p_35055_4_, int p_35055_5_, int p_35055_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_35055_2_, p_35055_3_, p_35055_4_, -4, -1, 0, 14, 11, 15, p_35055_5_);
        if(!func_35030_a(structureboundingbox) || StructureComponent.func_35020_a(p_35055_0_, structureboundingbox) != null)
        {
            structureboundingbox = StructureBoundingBox.func_35747_a(p_35055_2_, p_35055_3_, p_35055_4_, -4, -1, 0, 14, 6, 15, p_35055_5_);
            if(!func_35030_a(structureboundingbox) || StructureComponent.func_35020_a(p_35055_0_, structureboundingbox) != null)
            {
                return null;
            }
        }
        return new ComponentStrongholdLibrary(p_35055_6_, p_35055_1_, structureboundingbox, p_35055_5_);
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(func_35013_a(p_35023_1_, p_35023_3_))
        {
            return false;
        }
        byte byte0 = 11;
        if(!field_35057_c)
        {
            byte0 = 6;
        }
        func_35022_a(p_35023_1_, p_35023_3_, 0, 0, 0, 13, byte0 - 1, 14, true, p_35023_2_, StructureStrongholdPieces.func_35852_b());
        func_35033_a(p_35023_1_, p_35023_2_, p_35023_3_, field_35058_a, 4, 1, 0);
        func_35010_a(p_35023_1_, p_35023_3_, p_35023_2_, 0.07F, 2, 1, 1, 11, 4, 13, Block.field_9258_W.field_376_bc, Block.field_9258_W.field_376_bc, false);
        for(int i = 1; i <= 13; i++)
        {
            if((i - 1) % 4 == 0)
            {
                func_35011_a(p_35023_1_, p_35023_3_, 1, 1, i, 1, 4, i, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
                func_35011_a(p_35023_1_, p_35023_3_, 12, 1, i, 12, 4, i, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
                func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, 2, 3, i, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, 11, 3, i, p_35023_3_);
                if(field_35057_c)
                {
                    func_35011_a(p_35023_1_, p_35023_3_, 1, 6, i, 1, 9, i, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
                    func_35011_a(p_35023_1_, p_35023_3_, 12, 6, i, 12, 9, i, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
                }
                continue;
            }
            func_35011_a(p_35023_1_, p_35023_3_, 1, 1, i, 1, 4, i, Block.field_407_ao.field_376_bc, Block.field_407_ao.field_376_bc, false);
            func_35011_a(p_35023_1_, p_35023_3_, 12, 1, i, 12, 4, i, Block.field_407_ao.field_376_bc, Block.field_407_ao.field_376_bc, false);
            if(field_35057_c)
            {
                func_35011_a(p_35023_1_, p_35023_3_, 1, 6, i, 1, 9, i, Block.field_407_ao.field_376_bc, Block.field_407_ao.field_376_bc, false);
                func_35011_a(p_35023_1_, p_35023_3_, 12, 6, i, 12, 9, i, Block.field_407_ao.field_376_bc, Block.field_407_ao.field_376_bc, false);
            }
        }

        for(int j = 3; j < 12; j += 2)
        {
            func_35011_a(p_35023_1_, p_35023_3_, 3, 1, j, 4, 3, j, Block.field_407_ao.field_376_bc, Block.field_407_ao.field_376_bc, false);
            func_35011_a(p_35023_1_, p_35023_3_, 6, 1, j, 7, 3, j, Block.field_407_ao.field_376_bc, Block.field_407_ao.field_376_bc, false);
            func_35011_a(p_35023_1_, p_35023_3_, 9, 1, j, 10, 3, j, Block.field_407_ao.field_376_bc, Block.field_407_ao.field_376_bc, false);
        }

        if(field_35057_c)
        {
            func_35011_a(p_35023_1_, p_35023_3_, 1, 5, 1, 3, 5, 13, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
            func_35011_a(p_35023_1_, p_35023_3_, 10, 5, 1, 12, 5, 13, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
            func_35011_a(p_35023_1_, p_35023_3_, 4, 5, 1, 9, 5, 2, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
            func_35011_a(p_35023_1_, p_35023_3_, 4, 5, 12, 9, 5, 13, Block.field_334_y.field_376_bc, Block.field_334_y.field_376_bc, false);
            func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 9, 5, 11, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 8, 5, 11, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 9, 5, 10, p_35023_3_);
            func_35011_a(p_35023_1_, p_35023_3_, 3, 6, 2, 3, 6, 12, Block.field_4057_ba.field_376_bc, Block.field_4057_ba.field_376_bc, false);
            func_35011_a(p_35023_1_, p_35023_3_, 10, 6, 2, 10, 6, 10, Block.field_4057_ba.field_376_bc, Block.field_4057_ba.field_376_bc, false);
            func_35011_a(p_35023_1_, p_35023_3_, 4, 6, 2, 9, 6, 2, Block.field_4057_ba.field_376_bc, Block.field_4057_ba.field_376_bc, false);
            func_35011_a(p_35023_1_, p_35023_3_, 4, 6, 12, 8, 6, 12, Block.field_4057_ba.field_376_bc, Block.field_4057_ba.field_376_bc, false);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 9, 6, 11, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 8, 6, 11, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 9, 6, 10, p_35023_3_);
            int k = func_35009_c(Block.field_441_aG.field_376_bc, 3);
            func_35018_a(p_35023_1_, Block.field_441_aG.field_376_bc, k, 10, 1, 13, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_441_aG.field_376_bc, k, 10, 2, 13, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_441_aG.field_376_bc, k, 10, 3, 13, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_441_aG.field_376_bc, k, 10, 4, 13, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_441_aG.field_376_bc, k, 10, 5, 13, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_441_aG.field_376_bc, k, 10, 6, 13, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_441_aG.field_376_bc, k, 10, 7, 13, p_35023_3_);
            byte byte1 = 7;
            byte byte2 = 7;
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, byte1 - 1, 9, byte2, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, byte1, 9, byte2, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, byte1 - 1, 8, byte2, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, byte1, 8, byte2, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, byte1 - 1, 7, byte2, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, byte1, 7, byte2, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, byte1 - 2, 7, byte2, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, byte1 + 1, 7, byte2, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, byte1 - 1, 7, byte2 - 1, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, byte1 - 1, 7, byte2 + 1, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, byte1, 7, byte2 - 1, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, byte1, 7, byte2 + 1, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, byte1 - 2, 8, byte2, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, byte1 + 1, 8, byte2, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, byte1 - 1, 8, byte2 - 1, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, byte1 - 1, 8, byte2 + 1, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, byte1, 8, byte2 - 1, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, byte1, 8, byte2 + 1, p_35023_3_);
        }
        func_35003_a(p_35023_1_, p_35023_3_, p_35023_2_, 3, 3, 5, field_35056_b, 1 + p_35023_2_.nextInt(4));
        if(field_35057_c)
        {
            func_35018_a(p_35023_1_, 0, 0, 12, 9, 1, p_35023_3_);
            func_35003_a(p_35023_1_, p_35023_3_, p_35023_2_, 12, 8, 1, field_35056_b, 1 + p_35023_2_.nextInt(4));
        }
        return true;
    }

    static 
    {
        field_35056_b = (new StructurePieceTreasure[] {
            new StructurePieceTreasure(Item.field_4028_aJ.field_291_aS, 0, 1, 3, 20), new StructurePieceTreasure(Item.field_4029_aI.field_291_aS, 0, 2, 7, 20), new StructurePieceTreasure(Item.field_28010_bb.field_291_aS, 0, 1, 1, 1), new StructurePieceTreasure(Item.field_4025_aO.field_291_aS, 0, 1, 1, 1)
        });
    }
}
