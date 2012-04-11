// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, ComponentStrongholdStairs2, StructureBoundingBox, StructureComponent, 
//            StructureStrongholdPieces, EnumDoor, Block, World

public class ComponentStrongholdStairsStraight extends ComponentStronghold
{

    private final EnumDoor field_35054_a;

    public ComponentStrongholdStairsStraight(int p_i59_1_, Random p_i59_2_, StructureBoundingBox p_i59_3_, int p_i59_4_)
    {
        super(p_i59_1_);
        field_35025_h = p_i59_4_;
        field_35054_a = func_35031_a(p_i59_2_);
        field_35024_g = p_i59_3_;
    }

    public void func_35004_a(StructureComponent p_35004_1_, List p_35004_2_, Random p_35004_3_)
    {
        func_35028_a((ComponentStrongholdStairs2)p_35004_1_, p_35004_2_, p_35004_3_, 1, 1);
    }

    public static ComponentStrongholdStairsStraight func_35053_a(List p_35053_0_, Random p_35053_1_, int p_35053_2_, int p_35053_3_, int p_35053_4_, int p_35053_5_, int p_35053_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_35053_2_, p_35053_3_, p_35053_4_, -1, -7, 0, 5, 11, 8, p_35053_5_);
        if(!func_35030_a(structureboundingbox) || StructureComponent.func_35020_a(p_35053_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentStrongholdStairsStraight(p_35053_6_, p_35053_1_, structureboundingbox, p_35053_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(func_35013_a(p_35023_1_, p_35023_3_))
        {
            return false;
        }
        func_35022_a(p_35023_1_, p_35023_3_, 0, 0, 0, 4, 10, 7, true, p_35023_2_, StructureStrongholdPieces.func_35852_b());
        func_35033_a(p_35023_1_, p_35023_2_, p_35023_3_, field_35054_a, 1, 7, 0);
        func_35033_a(p_35023_1_, p_35023_2_, p_35023_3_, EnumDoor.OPENING, 1, 1, 7);
        int i = func_35009_c(Block.field_4069_aI.field_376_bc, 2);
        for(int j = 0; j < 6; j++)
        {
            func_35018_a(p_35023_1_, Block.field_4069_aI.field_376_bc, i, 1, 6 - j, 1 + j, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4069_aI.field_376_bc, i, 2, 6 - j, 1 + j, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_4069_aI.field_376_bc, i, 3, 6 - j, 1 + j, p_35023_3_);
            if(j < 5)
            {
                func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 1, 5 - j, 1 + j, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 2, 5 - j, 1 + j, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 3, 5 - j, 1 + j, p_35023_3_);
            }
        }

        return true;
    }
}
