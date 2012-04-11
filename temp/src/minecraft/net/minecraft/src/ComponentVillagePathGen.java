// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillageRoadPiece, StructureBoundingBox, ComponentVillageStartPiece, StructureComponent, 
//            StructureVillagePieces, MathHelper, World, Block

public class ComponentVillagePathGen extends ComponentVillageRoadPiece
{

    private int field_35088_a;

    public ComponentVillagePathGen(int p_i139_1_, Random p_i139_2_, StructureBoundingBox p_i139_3_, int p_i139_4_)
    {
        super(p_i139_1_);
        field_35025_h = p_i139_4_;
        field_35024_g = p_i139_3_;
        field_35088_a = Math.max(p_i139_3_.func_35744_b(), p_i139_3_.func_35739_d());
    }

    public void func_35004_a(StructureComponent p_35004_1_, List p_35004_2_, Random p_35004_3_)
    {
        boolean flag = false;
        for(int i = p_35004_3_.nextInt(5); i < field_35088_a - 8; i += 2 + p_35004_3_.nextInt(5))
        {
            StructureComponent structurecomponent = func_35077_a((ComponentVillageStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, 0, i);
            if(structurecomponent != null)
            {
                i += Math.max(structurecomponent.field_35024_g.func_35744_b(), structurecomponent.field_35024_g.func_35739_d());
                flag = true;
            }
        }

        for(int j = p_35004_3_.nextInt(5); j < field_35088_a - 8; j += 2 + p_35004_3_.nextInt(5))
        {
            StructureComponent structurecomponent1 = func_35076_b((ComponentVillageStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, 0, j);
            if(structurecomponent1 != null)
            {
                j += Math.max(structurecomponent1.field_35024_g.func_35744_b(), structurecomponent1.field_35024_g.func_35739_d());
                flag = true;
            }
        }

        if(flag && p_35004_3_.nextInt(3) > 0)
        {
            switch(field_35025_h)
            {
            case 2: // '\002'
                StructureVillagePieces.func_35701_b((ComponentVillageStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c, 1, func_35012_c());
                break;

            case 0: // '\0'
                StructureVillagePieces.func_35701_b((ComponentVillageStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b, field_35024_g.field_35748_f - 2, 1, func_35012_c());
                break;

            case 3: // '\003'
                StructureVillagePieces.func_35701_b((ComponentVillageStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35749_d - 2, field_35024_g.field_35751_b, field_35024_g.field_35752_c - 1, 2, func_35012_c());
                break;

            case 1: // '\001'
                StructureVillagePieces.func_35701_b((ComponentVillageStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a, field_35024_g.field_35751_b, field_35024_g.field_35752_c - 1, 2, func_35012_c());
                break;
            }
        }
        if(flag && p_35004_3_.nextInt(3) > 0)
        {
            switch(field_35025_h)
            {
            case 2: // '\002'
                StructureVillagePieces.func_35701_b((ComponentVillageStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c, 3, func_35012_c());
                break;

            case 0: // '\0'
                StructureVillagePieces.func_35701_b((ComponentVillageStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b, field_35024_g.field_35748_f - 2, 3, func_35012_c());
                break;

            case 3: // '\003'
                StructureVillagePieces.func_35701_b((ComponentVillageStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35749_d - 2, field_35024_g.field_35751_b, field_35024_g.field_35748_f + 1, 0, func_35012_c());
                break;

            case 1: // '\001'
                StructureVillagePieces.func_35701_b((ComponentVillageStartPiece)p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a, field_35024_g.field_35751_b, field_35024_g.field_35748_f + 1, 0, func_35012_c());
                break;
            }
        }
    }

    public static StructureBoundingBox func_35087_a(ComponentVillageStartPiece p_35087_0_, List p_35087_1_, Random p_35087_2_, int p_35087_3_, int p_35087_4_, int p_35087_5_, int p_35087_6_)
    {
        for(int i = 7 * MathHelper.func_35598_a(p_35087_2_, 3, 5); i >= 7; i -= 7)
        {
            StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_35087_3_, p_35087_4_, p_35087_5_, 0, 0, 0, 3, 3, i, p_35087_6_);
            if(StructureComponent.func_35020_a(p_35087_1_, structureboundingbox) == null)
            {
                return structureboundingbox;
            }
        }

        return null;
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        for(int i = field_35024_g.field_35753_a; i <= field_35024_g.field_35749_d; i++)
        {
            for(int j = field_35024_g.field_35752_c; j <= field_35024_g.field_35748_f; j++)
            {
                if(p_35023_3_.func_35742_b(i, 64, j))
                {
                    int k = p_35023_1_.func_4083_e(i, j) - 1;
                    p_35023_1_.func_634_a(i, k, j, Block.field_392_G.field_376_bc);
                }
            }

        }

        return true;
    }
}
