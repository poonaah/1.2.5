// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, ComponentStrongholdStairs2, StructureBoundingBox, StructureComponent, 
//            StructureStrongholdPieces, EnumDoor, Block, StructurePieceTreasure, 
//            Item, World

public class ComponentStrongholdChestCorridor extends ComponentStronghold
{

    private static final StructurePieceTreasure field_40013_a[];
    private final EnumDoor field_40011_b;
    private boolean field_40012_c;

    public ComponentStrongholdChestCorridor(int p_i705_1_, Random p_i705_2_, StructureBoundingBox p_i705_3_, int p_i705_4_)
    {
        super(p_i705_1_);
        field_35025_h = p_i705_4_;
        field_40011_b = func_35031_a(p_i705_2_);
        field_35024_g = p_i705_3_;
    }

    public void func_35004_a(StructureComponent p_35004_1_, List p_35004_2_, Random p_35004_3_)
    {
        func_35028_a((ComponentStrongholdStairs2)p_35004_1_, p_35004_2_, p_35004_3_, 1, 1);
    }

    public static ComponentStrongholdChestCorridor func_40010_a(List p_40010_0_, Random p_40010_1_, int p_40010_2_, int p_40010_3_, int p_40010_4_, int p_40010_5_, int p_40010_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_40010_2_, p_40010_3_, p_40010_4_, -1, -1, 0, 5, 5, 7, p_40010_5_);
        if(!func_35030_a(structureboundingbox) || StructureComponent.func_35020_a(p_40010_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentStrongholdChestCorridor(p_40010_6_, p_40010_1_, structureboundingbox, p_40010_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(func_35013_a(p_35023_1_, p_35023_3_))
        {
            return false;
        }
        func_35022_a(p_35023_1_, p_35023_3_, 0, 0, 0, 4, 4, 6, true, p_35023_2_, StructureStrongholdPieces.func_35852_b());
        func_35033_a(p_35023_1_, p_35023_2_, p_35023_3_, field_40011_b, 1, 1, 0);
        func_35033_a(p_35023_1_, p_35023_2_, p_35023_3_, EnumDoor.OPENING, 1, 1, 6);
        func_35011_a(p_35023_1_, p_35023_3_, 3, 1, 2, 3, 1, 4, Block.field_35285_bn.field_376_bc, Block.field_35285_bn.field_376_bc, false);
        func_35018_a(p_35023_1_, Block.field_410_al.field_376_bc, 5, 3, 1, 1, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_410_al.field_376_bc, 5, 3, 1, 5, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_410_al.field_376_bc, 5, 3, 2, 2, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_410_al.field_376_bc, 5, 3, 2, 4, p_35023_3_);
        for(int i = 2; i <= 4; i++)
        {
            func_35018_a(p_35023_1_, Block.field_410_al.field_376_bc, 5, 2, 1, i, p_35023_3_);
        }

        if(!field_40012_c)
        {
            int j = func_35008_a(2);
            int k = func_35017_a(3, 3);
            int l = func_35006_b(3, 3);
            if(p_35023_3_.func_35742_b(k, j, l))
            {
                field_40012_c = true;
                func_35003_a(p_35023_1_, p_35023_3_, p_35023_2_, 3, 2, 3, field_40013_a, 2 + p_35023_2_.nextInt(2));
            }
        }
        return true;
    }

    static 
    {
        field_40013_a = (new StructurePieceTreasure[] {
            new StructurePieceTreasure(Item.field_35416_bo.field_291_aS, 0, 1, 1, 10), new StructurePieceTreasure(Item.field_224_l.field_291_aS, 0, 1, 3, 3), new StructurePieceTreasure(Item.field_223_m.field_291_aS, 0, 1, 5, 10), new StructurePieceTreasure(Item.field_222_n.field_291_aS, 0, 1, 3, 5), new StructurePieceTreasure(Item.field_309_aA.field_291_aS, 0, 4, 9, 5), new StructurePieceTreasure(Item.field_242_S.field_291_aS, 0, 1, 3, 15), new StructurePieceTreasure(Item.field_228_h.field_291_aS, 0, 1, 3, 15), new StructurePieceTreasure(Item.field_231_e.field_291_aS, 0, 1, 1, 5), new StructurePieceTreasure(Item.field_221_o.field_291_aS, 0, 1, 1, 5), new StructurePieceTreasure(Item.field_284_ac.field_291_aS, 0, 1, 1, 5), 
            new StructurePieceTreasure(Item.field_285_ab.field_291_aS, 0, 1, 1, 5), new StructurePieceTreasure(Item.field_283_ad.field_291_aS, 0, 1, 1, 5), new StructurePieceTreasure(Item.field_282_ae.field_291_aS, 0, 1, 1, 5), new StructurePieceTreasure(Item.field_269_ar.field_291_aS, 0, 1, 1, 1)
        });
    }
}
