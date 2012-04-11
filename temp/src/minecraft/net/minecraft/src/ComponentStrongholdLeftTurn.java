// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, ComponentStrongholdStairs2, StructureBoundingBox, StructureComponent, 
//            StructureStrongholdPieces, EnumDoor, World

public class ComponentStrongholdLeftTurn extends ComponentStronghold
{

    protected final EnumDoor field_35046_a;

    public ComponentStrongholdLeftTurn(int p_i493_1_, Random p_i493_2_, StructureBoundingBox p_i493_3_, int p_i493_4_)
    {
        super(p_i493_1_);
        field_35025_h = p_i493_4_;
        field_35046_a = func_35031_a(p_i493_2_);
        field_35024_g = p_i493_3_;
    }

    public void func_35004_a(StructureComponent p_35004_1_, List p_35004_2_, Random p_35004_3_)
    {
        if(field_35025_h == 2 || field_35025_h == 3)
        {
            func_35032_b((ComponentStrongholdStairs2)p_35004_1_, p_35004_2_, p_35004_3_, 1, 1);
        } else
        {
            func_35029_c((ComponentStrongholdStairs2)p_35004_1_, p_35004_2_, p_35004_3_, 1, 1);
        }
    }

    public static ComponentStrongholdLeftTurn func_35045_a(List p_35045_0_, Random p_35045_1_, int p_35045_2_, int p_35045_3_, int p_35045_4_, int p_35045_5_, int p_35045_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_35045_2_, p_35045_3_, p_35045_4_, -1, -1, 0, 5, 5, 5, p_35045_5_);
        if(!func_35030_a(structureboundingbox) || StructureComponent.func_35020_a(p_35045_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentStrongholdLeftTurn(p_35045_6_, p_35045_1_, structureboundingbox, p_35045_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(func_35013_a(p_35023_1_, p_35023_3_))
        {
            return false;
        }
        func_35022_a(p_35023_1_, p_35023_3_, 0, 0, 0, 4, 4, 4, true, p_35023_2_, StructureStrongholdPieces.func_35852_b());
        func_35033_a(p_35023_1_, p_35023_2_, p_35023_3_, field_35046_a, 1, 1, 0);
        if(field_35025_h == 2 || field_35025_h == 3)
        {
            func_35011_a(p_35023_1_, p_35023_3_, 0, 1, 1, 0, 3, 3, 0, 0, false);
        } else
        {
            func_35011_a(p_35023_1_, p_35023_3_, 4, 1, 1, 4, 3, 3, 0, 0, false);
        }
        return true;
    }
}
