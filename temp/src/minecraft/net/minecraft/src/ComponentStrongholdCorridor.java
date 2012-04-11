// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, StructureBoundingBox, StructureComponent, Block, 
//            World

public class ComponentStrongholdCorridor extends ComponentStronghold
{

    private final int field_35052_a;

    public ComponentStrongholdCorridor(int p_i412_1_, Random p_i412_2_, StructureBoundingBox p_i412_3_, int p_i412_4_)
    {
        super(p_i412_1_);
        field_35025_h = p_i412_4_;
        field_35024_g = p_i412_3_;
        field_35052_a = p_i412_4_ != 2 && p_i412_4_ != 0 ? p_i412_3_.func_35744_b() : p_i412_3_.func_35739_d();
    }

    public void func_35004_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static StructureBoundingBox func_35051_a(List p_35051_0_, Random p_35051_1_, int p_35051_2_, int p_35051_3_, int p_35051_4_, int p_35051_5_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_35051_2_, p_35051_3_, p_35051_4_, -1, -1, 0, 5, 5, 4, p_35051_5_);
        StructureComponent structurecomponent = StructureComponent.func_35020_a(p_35051_0_, structureboundingbox);
        if(structurecomponent == null)
        {
            return null;
        }
        if(structurecomponent.func_35021_b().field_35751_b == structureboundingbox.field_35751_b)
        {
            for(int i = 3; i >= 1; i--)
            {
                StructureBoundingBox structureboundingbox1 = StructureBoundingBox.func_35747_a(p_35051_2_, p_35051_3_, p_35051_4_, -1, -1, 0, 5, 5, i - 1, p_35051_5_);
                if(!structurecomponent.func_35021_b().func_35740_a(structureboundingbox1))
                {
                    return StructureBoundingBox.func_35747_a(p_35051_2_, p_35051_3_, p_35051_4_, -1, -1, 0, 5, 5, i, p_35051_5_);
                }
            }

        }
        return null;
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(func_35013_a(p_35023_1_, p_35023_3_))
        {
            return false;
        }
        for(int i = 0; i < field_35052_a; i++)
        {
            func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 0, 0, i, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 1, 0, i, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 2, 0, i, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 3, 0, i, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 4, 0, i, p_35023_3_);
            for(int j = 1; j <= 3; j++)
            {
                func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 0, j, i, p_35023_3_);
                func_35018_a(p_35023_1_, 0, 0, 1, j, i, p_35023_3_);
                func_35018_a(p_35023_1_, 0, 0, 2, j, i, p_35023_3_);
                func_35018_a(p_35023_1_, 0, 0, 3, j, i, p_35023_3_);
                func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 4, j, i, p_35023_3_);
            }

            func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 0, 4, i, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 1, 4, i, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 2, 4, i, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 3, 4, i, p_35023_3_);
            func_35018_a(p_35023_1_, Block.field_35285_bn.field_376_bc, 0, 4, 4, i, p_35023_3_);
        }

        return true;
    }
}
