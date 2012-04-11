// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            ComponentStronghold, ComponentStrongholdStairs2, StructureBoundingBox, StructureComponent, 
//            StructureStrongholdPieces, Block, EnumDoor, World

public class ComponentStrongholdCrossing extends ComponentStronghold
{

    protected final EnumDoor field_35044_a;
    private boolean field_35042_b;
    private boolean field_35043_c;
    private boolean field_35040_d;
    private boolean field_35041_e;

    public ComponentStrongholdCrossing(int p_i166_1_, Random p_i166_2_, StructureBoundingBox p_i166_3_, int p_i166_4_)
    {
        super(p_i166_1_);
        field_35025_h = p_i166_4_;
        field_35044_a = func_35031_a(p_i166_2_);
        field_35024_g = p_i166_3_;
        field_35042_b = p_i166_2_.nextBoolean();
        field_35043_c = p_i166_2_.nextBoolean();
        field_35040_d = p_i166_2_.nextBoolean();
        field_35041_e = p_i166_2_.nextInt(3) > 0;
    }

    public void func_35004_a(StructureComponent p_35004_1_, List p_35004_2_, Random p_35004_3_)
    {
        int i = 3;
        int j = 5;
        if(field_35025_h == 1 || field_35025_h == 2)
        {
            i = 8 - i;
            j = 8 - j;
        }
        func_35028_a((ComponentStrongholdStairs2)p_35004_1_, p_35004_2_, p_35004_3_, 5, 1);
        if(field_35042_b)
        {
            func_35032_b((ComponentStrongholdStairs2)p_35004_1_, p_35004_2_, p_35004_3_, i, 1);
        }
        if(field_35043_c)
        {
            func_35032_b((ComponentStrongholdStairs2)p_35004_1_, p_35004_2_, p_35004_3_, j, 7);
        }
        if(field_35040_d)
        {
            func_35029_c((ComponentStrongholdStairs2)p_35004_1_, p_35004_2_, p_35004_3_, i, 1);
        }
        if(field_35041_e)
        {
            func_35029_c((ComponentStrongholdStairs2)p_35004_1_, p_35004_2_, p_35004_3_, j, 7);
        }
    }

    public static ComponentStrongholdCrossing func_35039_a(List p_35039_0_, Random p_35039_1_, int p_35039_2_, int p_35039_3_, int p_35039_4_, int p_35039_5_, int p_35039_6_)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.func_35747_a(p_35039_2_, p_35039_3_, p_35039_4_, -4, -3, 0, 10, 9, 11, p_35039_5_);
        if(!func_35030_a(structureboundingbox) || StructureComponent.func_35020_a(p_35039_0_, structureboundingbox) != null)
        {
            return null;
        } else
        {
            return new ComponentStrongholdCrossing(p_35039_6_, p_35039_1_, structureboundingbox, p_35039_5_);
        }
    }

    public boolean func_35023_a(World p_35023_1_, Random p_35023_2_, StructureBoundingBox p_35023_3_)
    {
        if(func_35013_a(p_35023_1_, p_35023_3_))
        {
            return false;
        }
        func_35022_a(p_35023_1_, p_35023_3_, 0, 0, 0, 9, 8, 10, true, p_35023_2_, StructureStrongholdPieces.func_35852_b());
        func_35033_a(p_35023_1_, p_35023_2_, p_35023_3_, field_35044_a, 4, 3, 0);
        if(field_35042_b)
        {
            func_35011_a(p_35023_1_, p_35023_3_, 0, 3, 1, 0, 5, 3, 0, 0, false);
        }
        if(field_35040_d)
        {
            func_35011_a(p_35023_1_, p_35023_3_, 9, 3, 1, 9, 5, 3, 0, 0, false);
        }
        if(field_35043_c)
        {
            func_35011_a(p_35023_1_, p_35023_3_, 0, 5, 7, 0, 7, 9, 0, 0, false);
        }
        if(field_35041_e)
        {
            func_35011_a(p_35023_1_, p_35023_3_, 9, 5, 7, 9, 7, 9, 0, 0, false);
        }
        func_35011_a(p_35023_1_, p_35023_3_, 5, 1, 10, 7, 3, 10, 0, 0, false);
        func_35022_a(p_35023_1_, p_35023_3_, 1, 2, 1, 8, 2, 6, false, p_35023_2_, StructureStrongholdPieces.func_35852_b());
        func_35022_a(p_35023_1_, p_35023_3_, 4, 1, 5, 4, 4, 9, false, p_35023_2_, StructureStrongholdPieces.func_35852_b());
        func_35022_a(p_35023_1_, p_35023_3_, 8, 1, 5, 8, 4, 9, false, p_35023_2_, StructureStrongholdPieces.func_35852_b());
        func_35022_a(p_35023_1_, p_35023_3_, 1, 4, 7, 3, 4, 9, false, p_35023_2_, StructureStrongholdPieces.func_35852_b());
        func_35022_a(p_35023_1_, p_35023_3_, 1, 3, 5, 3, 3, 6, false, p_35023_2_, StructureStrongholdPieces.func_35852_b());
        func_35011_a(p_35023_1_, p_35023_3_, 1, 3, 4, 3, 3, 4, Block.field_410_al.field_376_bc, Block.field_410_al.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 1, 4, 6, 3, 4, 6, Block.field_410_al.field_376_bc, Block.field_410_al.field_376_bc, false);
        func_35022_a(p_35023_1_, p_35023_3_, 5, 1, 7, 7, 1, 8, false, p_35023_2_, StructureStrongholdPieces.func_35852_b());
        func_35011_a(p_35023_1_, p_35023_3_, 5, 1, 9, 7, 1, 9, Block.field_410_al.field_376_bc, Block.field_410_al.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 5, 2, 7, 7, 2, 7, Block.field_410_al.field_376_bc, Block.field_410_al.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 4, 5, 7, 4, 5, 9, Block.field_410_al.field_376_bc, Block.field_410_al.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 8, 5, 7, 8, 5, 9, Block.field_410_al.field_376_bc, Block.field_410_al.field_376_bc, false);
        func_35011_a(p_35023_1_, p_35023_3_, 5, 5, 7, 7, 5, 9, Block.field_411_ak.field_376_bc, Block.field_411_ak.field_376_bc, false);
        func_35018_a(p_35023_1_, Block.field_404_ar.field_376_bc, 0, 6, 5, 6, p_35023_3_);
        return true;
    }
}
