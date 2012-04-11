// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, StructureComponent, Block, 
//            MathHelper, World

public class ComponentVillageField2 extends ComponentVillage
{

    private int field_35090_a;

    public ComponentVillageField2(int p_i542_1_, Random p_i542_2_, StructureBoundingBox p_i542_3_, int p_i542_4_)
    {
        super(p_i542_1_);
        field_35090_a = -1;
        field_35025_h = p_i542_4_;
        field_35024_g = p_i542_3_;
    }

    public void func_35004_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static ComponentVillageField2 func_35089_a(List p_35089_0_, Random p_35089_1_, int p_35089_2_, int p_35089_3_, int p_35089_4_, int p_35089_5_, int p_35089_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_35089_2_, p_35089_3_, p_35089_4_, 0, 0, 0, 7, 4, 9, p_35089_5_);
        if(!func_35074_a(structureboundingbox) || StructureComponent.func_35020_a(p_35089_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentVillageField2(p_35089_6_, p_35089_1_, structureboundingbox, p_35089_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(field_35090_a < 0)
        {
            field_35090_a = func_35075_b(p_35023_1_, p_35023_3_);
            if(field_35090_a < 0)
            {
                return true;
            }
            field_35024_g.func_35745_a(0, ((field_35090_a - field_35024_g.field_35750_e) + 4) - 1, 0);
        }
        func_35011_a(p_35023_1_, p_35023_3_, 0, 1, 0, 6, 4, 8, 0, 0, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 0, 1, 2, 0, 7, Block.field_446_aB.field_376_bc, Block.field_446_aB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 4, 0, 1, 5, 0, 7, Block.field_446_aB.field_376_bc, Block.field_446_aB.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 0, 0, 0, 0, 0, 8, Block.field_385_K.field_376_bc, Block.field_385_K.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 6, 0, 0, 6, 0, 8, Block.field_385_K.field_376_bc, Block.field_385_K.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 0, 0, 5, 0, 0, Block.field_385_K.field_376_bc, Block.field_385_K.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 0, 8, 5, 0, 8, Block.field_385_K.field_376_bc, Block.field_385_K.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 3, 0, 1, 3, 0, 7, Block.field_401_B.field_376_bc, Block.field_401_B.field_376_bc, false);
        for(int i = 1; i <= 7; i++)
        {
            func_35018_a(p_35023_1_, Block.field_447_aA.field_376_bc, MathHelper.func_35598_a(p_35023_2_, 2, 7), 1, 1, i, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_447_aA.field_376_bc, MathHelper.func_35598_a(p_35023_2_, 2, 7), 2, 1, i, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_447_aA.field_376_bc, MathHelper.func_35598_a(p_35023_2_, 2, 7), 4, 1, i, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_447_aA.field_376_bc, MathHelper.func_35598_a(p_35023_2_, 2, 7), 5, 1, i, p_35023_3_);
        }

        for(int j = 0; j < 9; j++)
        {
            for(int k = 0; k < 7; k++)
            {
                func_35016_b(p_35023_1_, k, 4, j, p_35023_3_);
                func_35005_b(p_35023_1_, Block.field_336_w.field_376_bc, 0, k, -1, j, p_35023_3_);
            }

        }

        return true;
    }
}
