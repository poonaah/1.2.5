// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentVillage, StructureBoundingBox, StructureComponent, Block, 
//            World

public class ComponentVillageTorch extends ComponentVillage
{

    private int field_35100_a;

    public ComponentVillageTorch(int p_i74_1_, Random p_i74_2_, StructureBoundingBox p_i74_3_, int p_i74_4_)
    {
        super(p_i74_1_);
        field_35100_a = -1;
        field_35025_h = p_i74_4_;
        field_35024_g = p_i74_3_;
    }

    public void func_35004_a(StructureComponent structurecomponent, List list, Random random)
    {
    }

    public static StructureBoundingBox func_35099_a(List p_35099_0_, Random p_35099_1_, int p_35099_2_, int p_35099_3_, int p_35099_4_, int p_35099_5_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_35099_2_, p_35099_3_, p_35099_4_, 0, 0, 0, 3, 4, 2, p_35099_5_);
        if(StructureComponent.func_35020_a(p_35099_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return structureboundingbox;
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(field_35100_a < 0)
        {
            field_35100_a = func_35075_b(p_35023_1_, p_35023_3_);
            if(field_35100_a < 0)
            {
                return true;
            }
            field_35024_g.func_35745_a(0, ((field_35100_a - field_35024_g.field_35750_e) + 4) - 1, 0);
        }
        func_35011_a(p_35023_1_, p_35023_3_, 0, 0, 0, 2, 3, 1, 0, 0, false);
        func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 1, 0, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 1, 1, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_4057_ba.field_376_bc, 0, 1, 2, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_419_ac.field_376_bc, 15, 1, 3, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 15, 0, 3, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 15, 1, 3, 1, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 15, 2, 3, 0, p_35023_3_);
        func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 15, 1, 3, -1, p_35023_3_);
        return true;
    }
}
