// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, ComponentStrongholdStairs2, StructureBoundingBox, StructureComponent, 
//            StructureStrongholdPieces, Block, StructurePieceTreasure, Item, 
//            EnumDoor, World

public class ComponentStrongholdRoomCrossing extends ComponentStronghold
{

    private static final StructurePieceTreasure field_35061_c[];
    protected final EnumDoor field_35062_a;
    protected final int field_35060_b;

    public ComponentStrongholdRoomCrossing(int p_i4_1_, Random p_i4_2_, StructureBoundingBox p_i4_3_, int p_i4_4_)
    {
        super(p_i4_1_);
        field_35025_h = p_i4_4_;
        field_35062_a = func_35031_a(p_i4_2_);
        field_35024_g = p_i4_3_;
        field_35060_b = p_i4_2_.nextInt(5);
    }

    public void func_35004_a(StructureComponent p_35004_1_, List p_35004_2_, Random p_35004_3_)
    {
        func_35028_a((ComponentStrongholdStairs2)p_35004_1_, p_35004_2_, p_35004_3_, 4, 1);
        func_35032_b((ComponentStrongholdStairs2)p_35004_1_, p_35004_2_, p_35004_3_, 1, 4);
        func_35029_c((ComponentStrongholdStairs2)p_35004_1_, p_35004_2_, p_35004_3_, 1, 4);
    }

    public static ComponentStrongholdRoomCrossing func_35059_a(List p_35059_0_, Random p_35059_1_, int p_35059_2_, int p_35059_3_, int p_35059_4_, int p_35059_5_, int p_35059_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_35059_2_, p_35059_3_, p_35059_4_, -4, -1, 0, 11, 7, 11, p_35059_5_);
        if(!func_35030_a(structureboundingbox) || StructureComponent.func_35020_a(p_35059_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentStrongholdRoomCrossing(p_35059_6_, p_35059_1_, structureboundingbox, p_35059_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(func_35013_a(p_35023_1_, p_35023_3_))
        {
            return false;
        }
        func_35022_a(p_35023_1_, p_35023_3_, 0, 0, 0, 10, 6, 10, true, p_35023_2_, StructureStrongholdPieces.func_35852_b());
        func_35033_a(p_35023_1_, p_35023_2_, p_35023_3_, field_35062_a, 4, 1, 0);
        func_35011_a(p_35023_1_, p_35023_3_, 4, 1, 10, 6, 3, 10, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 1, 4, 0, 3, 6, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 10, 1, 4, 10, 3, 6, 0, 0, false);
        switch(field_35060_b)
        {
        default:
            break;

        case 0: // '\0'
            func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 5, 1, 5, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 5, 2, 5, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 5, 3, 5, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, 4, 3, 5, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, 6, 3, 5, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, 5, 3, 4, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, 5, 3, 6, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_410_al.field_376_bc, 0, 4, 1, 4, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_410_al.field_376_bc, 0, 4, 1, 5, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_410_al.field_376_bc, 0, 4, 1, 6, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_410_al.field_376_bc, 0, 6, 1, 4, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_410_al.field_376_bc, 0, 6, 1, 5, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_410_al.field_376_bc, 0, 6, 1, 6, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_410_al.field_376_bc, 0, 5, 1, 4, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_410_al.field_376_bc, 0, 5, 1, 6, p_35023_3_);
            break;

        case 1: // '\001'
            for(int i = 0; i < 5; i++)
            {
                func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 3, 1, 3 + i, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 7, 1, 3 + i, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 3 + i, 1, 3, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 3 + i, 1, 7, p_35023_3_);
            }

            func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 5, 1, 5, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 5, 2, 5, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 5, 3, 5, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_401_B.field_376_bc, 0, 5, 4, 5, p_35023_3_);
            break;

        case 2: // '\002'
            for(int j = 1; j <= 9; j++)
            {
                func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 1, 3, j, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 9, 3, j, p_35023_3_);
            }

            for(int k = 1; k <= 9; k++)
            {
                func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, k, 3, 1, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, k, 3, 9, p_35023_3_);
            }

            func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 5, 1, 4, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 5, 1, 6, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 5, 3, 4, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 5, 3, 6, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 4, 1, 5, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 6, 1, 5, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 4, 3, 5, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 6, 3, 5, p_35023_3_);
            for(int l = 1; l <= 3; l++)
            {
                func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 4, l, 4, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 6, l, 4, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 4, l, 6, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_335_x.field_376_bc, 0, 6, l, 6, p_35023_3_);
            }

            func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, 5, 3, 5, p_35023_3_);
            for(int i1 = 2; i1 <= 8; i1++)
            {
                func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 2, 3, i1, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 3, 3, i1, p_35023_3_);
                if(i1 <= 3 || i1 >= 7)
                {
                    func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 4, 3, i1, p_35023_3_);
                    func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 5, 3, i1, p_35023_3_);
                    func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 6, 3, i1, p_35023_3_);
                }
                func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 7, 3, i1, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, 8, 3, i1, p_35023_3_);
            }

            func_35018_a(p_35023_1_, Block.field_441_aG.field_376_bc, func_35009_c(Block.field_441_aG.field_376_bc, 4), 9, 1, 3, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_441_aG.field_376_bc, func_35009_c(Block.field_441_aG.field_376_bc, 4), 9, 2, 3, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_441_aG.field_376_bc, func_35009_c(Block.field_441_aG.field_376_bc, 4), 9, 3, 3, p_35023_3_);
            func_35003_a(p_35023_1_, p_35023_3_, p_35023_2_, 3, 4, 8, field_35061_c, 1 + p_35023_2_.nextInt(4));
            break;
        }
        return true;
    }

    static 
    {
        field_35061_c = (new StructurePieceTreasure[] {
            new StructurePieceTreasure(Item.field_223_m.field_291_aS, 0, 1, 5, 10), new StructurePieceTreasure(Item.field_222_n.field_291_aS, 0, 1, 3, 5), new StructurePieceTreasure(Item.field_309_aA.field_291_aS, 0, 4, 9, 5), new StructurePieceTreasure(Item.field_225_k.field_291_aS, 0, 3, 8, 10), new StructurePieceTreasure(Item.field_242_S.field_291_aS, 0, 1, 3, 15), new StructurePieceTreasure(Item.field_228_h.field_291_aS, 0, 1, 3, 15), new StructurePieceTreasure(Item.field_231_e.field_291_aS, 0, 1, 1, 1)
        });
    }
}
