// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            StructureComponent, StructureBoundingBox, StructureMineshaftPieces, World

public class ComponentMineshaftStairs extends StructureComponent
{

    public ComponentMineshaftStairs(int p_i368_1_, Random p_i368_2_, StructureBoundingBox p_i368_3_, int p_i368_4_)
    {
        super(p_i368_1_);
        field_35025_h = p_i368_4_;
        field_35024_g = p_i368_3_;
    }

    public static StructureBoundingBox func_35027_a(List p_35027_0_, Random p_35027_1_, int p_35027_2_, int p_35027_3_, int p_35027_4_, int p_35027_5_)
    {
        StructureBoundingBox structureboundingbox = new StructureBoundingBox(p_35027_2_, p_35027_3_ - 5, p_35027_4_, p_35027_2_, p_35027_3_ + 2, p_35027_4_);
        switch(p_35027_5_)
        {
        case 2: // '\002'
            structureboundingbox.field_35749_d = p_35027_2_ + 2;
            structureboundingbox.field_35752_c = p_35027_4_ - 8;
            break;

        case 0: // '\0'
            structureboundingbox.field_35749_d = p_35027_2_ + 2;
            structureboundingbox.field_35748_f = p_35027_4_ + 8;
            break;

        case 1: // '\001'
            structureboundingbox.field_35753_a = p_35027_2_ - 8;
            structureboundingbox.field_35748_f = p_35027_4_ + 2;
            break;

        case 3: // '\003'
            structureboundingbox.field_35749_d = p_35027_2_ + 8;
            structureboundingbox.field_35748_f = p_35027_4_ + 2;
            break;
        }
        if(StructureComponent.func_35020_a(p_35027_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return structureboundingbox;
        }
    }

    public void func_35004_a(StructureComponent p_35004_1_, List p_35004_2_, Random p_35004_3_)
    {
        int i = func_35012_c();
        switch(field_35025_h)
        {
        case 2: // '\002'
            StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a, field_35024_g.field_35751_b, field_35024_g.field_35752_c - 1, 2, i);
            break;

        case 0: // '\0'
            StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a, field_35024_g.field_35751_b, field_35024_g.field_35748_f + 1, 0, i);
            break;

        case 1: // '\001'
            StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c, 1, i);
            break;

        case 3: // '\003'
            StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c, 3, i);
            break;
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(func_35013_a(p_35023_1_, p_35023_3_))
        {
            return false;
        }
        func_35011_a(p_35023_1_, p_35023_3_, 0, 5, 0, 2, 7, 1, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 0, 7, 2, 2, 8, 0, 0, false);
        for(int i = 0; i < 5; i++)
        {
            func_35011_a(p_35023_1_, p_35023_3_, 0, 5 - i - (i >= 4 ? 0 : 1), 2 + i, 2, 7 - i, 2 + i, 0, 0, false);
        }

        return true;
    }
}
