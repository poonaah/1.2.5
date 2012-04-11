// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            StructureComponent, StructureBoundingBox, StructureMineshaftPieces, Block, 
//            World

public class ComponentMineshaftCross extends StructureComponent
{

    private final int field_35073_a;
    private final boolean field_35072_b;

    public ComponentMineshaftCross(int p_i406_1_, Random p_i406_2_, StructureBoundingBox p_i406_3_, int p_i406_4_)
    {
        super(p_i406_1_);
        field_35073_a = p_i406_4_;
        field_35024_g = p_i406_3_;
        field_35072_b = p_i406_3_.func_35743_c() > 3;
    }

    public static StructureBoundingBox func_35071_a(List p_35071_0_, Random p_35071_1_, int p_35071_2_, int p_35071_3_, int p_35071_4_, int p_35071_5_)
    {
        StructureBoundingBox structureboundingbox = new StructureBoundingBox(p_35071_2_, p_35071_3_, p_35071_4_, p_35071_2_, p_35071_3_ + 2, p_35071_4_);
        if(p_35071_1_.nextInt(4) == 0)
        {
            structureboundingbox.field_35750_e += 4;
        }
        switch(p_35071_5_)
        {
        case 2: // '\002'
            structureboundingbox.field_35753_a = p_35071_2_ - 1;
            structureboundingbox.field_35749_d = p_35071_2_ + 3;
            structureboundingbox.field_35752_c = p_35071_4_ - 4;
            break;

        case 0: // '\0'
            structureboundingbox.field_35753_a = p_35071_2_ - 1;
            structureboundingbox.field_35749_d = p_35071_2_ + 3;
            structureboundingbox.field_35748_f = p_35071_4_ + 4;
            break;

        case 1: // '\001'
            structureboundingbox.field_35753_a = p_35071_2_ - 4;
            structureboundingbox.field_35752_c = p_35071_4_ - 1;
            structureboundingbox.field_35748_f = p_35071_4_ + 3;
            break;

        case 3: // '\003'
            structureboundingbox.field_35749_d = p_35071_2_ + 4;
            structureboundingbox.field_35752_c = p_35071_4_ - 1;
            structureboundingbox.field_35748_f = p_35071_4_ + 3;
            break;
        }
        if(StructureComponent.func_35020_a(p_35071_0_, structureboundingbox) != null)
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
        switch(field_35073_a)
        {
        case 2: // '\002'
            StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a + 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c - 1, 2, i);
            StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c + 1, 1, i);
            StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c + 1, 3, i);
            break;

        case 0: // '\0'
            StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a + 1, field_35024_g.field_35751_b, field_35024_g.field_35748_f + 1, 0, i);
            StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c + 1, 1, i);
            StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c + 1, 3, i);
            break;

        case 1: // '\001'
            StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a + 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c - 1, 2, i);
            StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a + 1, field_35024_g.field_35751_b, field_35024_g.field_35748_f + 1, 0, i);
            StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c + 1, 1, i);
            break;

        case 3: // '\003'
            StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a + 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c - 1, 2, i);
            StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a + 1, field_35024_g.field_35751_b, field_35024_g.field_35748_f + 1, 0, i);
            StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c + 1, 3, i);
            break;
        }
        if(field_35072_b)
        {
            if(p_35004_3_.nextBoolean())
            {
                StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a + 1, field_35024_g.field_35751_b + 3 + 1, field_35024_g.field_35752_c - 1, 2, i);
            }
            if(p_35004_3_.nextBoolean())
            {
                StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b + 3 + 1, field_35024_g.field_35752_c + 1, 1, i);
            }
            if(p_35004_3_.nextBoolean())
            {
                StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b + 3 + 1, field_35024_g.field_35752_c + 1, 3, i);
            }
            if(p_35004_3_.nextBoolean())
            {
                StructureMineshaftPieces.func_35585_a(p_35004_1_, p_35004_2_, p_35004_3_, field_35024_g.field_35753_a + 1, field_35024_g.field_35751_b + 3 + 1, field_35024_g.field_35748_f + 1, 0, i);
            }
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(func_35013_a(p_35023_1_, p_35023_3_))
        {
            return false;
        }
        if(field_35072_b)
        {
            func_35011_a(p_35023_1_, p_35023_3_, field_35024_g.field_35753_a + 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c, field_35024_g.field_35749_d - 1, (field_35024_g.field_35751_b + 3) - 1, field_35024_g.field_35748_f, 0, 0, false);
            func_35011_a(p_35023_1_, p_35023_3_, field_35024_g.field_35753_a, field_35024_g.field_35751_b, field_35024_g.field_35752_c + 1, field_35024_g.field_35749_d, (field_35024_g.field_35751_b + 3) - 1, field_35024_g.field_35748_f - 1, 0, 0, false);
            func_35011_a(p_35023_1_, p_35023_3_, field_35024_g.field_35753_a + 1, field_35024_g.field_35750_e - 2, field_35024_g.field_35752_c, field_35024_g.field_35749_d - 1, field_35024_g.field_35750_e, field_35024_g.field_35748_f, 0, 0, false);
            func_35011_a(p_35023_1_, p_35023_3_, field_35024_g.field_35753_a, field_35024_g.field_35750_e - 2, field_35024_g.field_35752_c + 1, field_35024_g.field_35749_d, field_35024_g.field_35750_e, field_35024_g.field_35748_f - 1, 0, 0, false);
            func_35011_a(p_35023_1_, p_35023_3_, field_35024_g.field_35753_a + 1, field_35024_g.field_35751_b + 3, field_35024_g.field_35752_c + 1, field_35024_g.field_35749_d - 1, field_35024_g.field_35751_b + 3, field_35024_g.field_35748_f - 1, 0, 0, false);
        } else
        {
            func_35011_a(p_35023_1_, p_35023_3_, field_35024_g.field_35753_a + 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c, field_35024_g.field_35749_d - 1, field_35024_g.field_35750_e, field_35024_g.field_35748_f, 0, 0, false);
            func_35011_a(p_35023_1_, p_35023_3_, field_35024_g.field_35753_a, field_35024_g.field_35751_b, field_35024_g.field_35752_c + 1, field_35024_g.field_35749_d, field_35024_g.field_35750_e, field_35024_g.field_35748_f - 1, 0, 0, false);
        }
        func_35011_a(p_35023_1_, p_35023_3_, field_35024_g.field_35753_a + 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c + 1, field_35024_g.field_35753_a + 1, field_35024_g.field_35750_e, field_35024_g.field_35752_c + 1, Block.field_334_y.field_376_bc, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, field_35024_g.field_35753_a + 1, field_35024_g.field_35751_b, field_35024_g.field_35748_f - 1, field_35024_g.field_35753_a + 1, field_35024_g.field_35750_e, field_35024_g.field_35748_f - 1, Block.field_334_y.field_376_bc, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, field_35024_g.field_35749_d - 1, field_35024_g.field_35751_b, field_35024_g.field_35752_c + 1, field_35024_g.field_35749_d - 1, field_35024_g.field_35750_e, field_35024_g.field_35752_c + 1, Block.field_334_y.field_376_bc, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, field_35024_g.field_35749_d - 1, field_35024_g.field_35751_b, field_35024_g.field_35748_f - 1, field_35024_g.field_35749_d - 1, field_35024_g.field_35750_e, field_35024_g.field_35748_f - 1, Block.field_334_y.field_376_bc, 0, false);
        for(int i = field_35024_g.field_35753_a; i <= field_35024_g.field_35749_d; i++)
        {
            for(int j = field_35024_g.field_35752_c; j <= field_35024_g.field_35748_f; j++)
            {
                int k = func_35007_a(p_35023_1_, i, field_35024_g.field_35751_b - 1, j, p_35023_3_);
                if(k == 0)
                {
                    func_35018_a(p_35023_1_, Block.field_334_y.field_376_bc, 0, i, field_35024_g.field_35751_b - 1, j, p_35023_3_);
                }
            }

        }

        return true;
    }
}
