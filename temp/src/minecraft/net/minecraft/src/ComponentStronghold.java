// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            StructureComponent, EnumDoorHelper, EnumDoor, Block, 
//            StructureBoundingBox, StructureStrongholdPieces, World, ComponentStrongholdStairs2

abstract class ComponentStronghold extends StructureComponent
{

    protected ComponentStronghold(int p_i318_1_)
    {
        super(p_i318_1_);
    }

    protected void func_35033_a(World p_35033_1_, Random p_35033_2_, StructureBoundingBox p_35033_3_, EnumDoor p_35033_4_, int p_35033_5_, int p_35033_6_, int p_35033_7_)
    {
        switch(EnumDoorHelper.field_35619_a[p_35033_4_.ordinal()])
        {
        case 1: // '\001'
        default:
            func_35011_a(p_35033_1_, p_35033_3_, p_35033_5_, p_35033_6_, p_35033_7_, (p_35033_5_ + 3) - 1, (p_35033_6_ + 3) - 1, p_35033_7_, 0, 0, false);
            break;

        case 2: // '\002'
            func_35018_a(p_35033_1_, Block.field_35285_bn.field_376_bc, 0, p_35033_5_, p_35033_6_, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35285_bn.field_376_bc, 0, p_35033_5_, p_35033_6_ + 1, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35285_bn.field_376_bc, 0, p_35033_5_, p_35033_6_ + 2, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35285_bn.field_376_bc, 0, p_35033_5_ + 1, p_35033_6_ + 2, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35285_bn.field_376_bc, 0, p_35033_5_ + 2, p_35033_6_ + 2, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35285_bn.field_376_bc, 0, p_35033_5_ + 2, p_35033_6_ + 1, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35285_bn.field_376_bc, 0, p_35033_5_ + 2, p_35033_6_, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_442_aF.field_376_bc, 0, p_35033_5_ + 1, p_35033_6_, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_442_aF.field_376_bc, 8, p_35033_5_ + 1, p_35033_6_ + 1, p_35033_7_, p_35033_3_);
            break;

        case 3: // '\003'
            func_35018_a(p_35033_1_, 0, 0, p_35033_5_ + 1, p_35033_6_, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, 0, 0, p_35033_5_ + 1, p_35033_6_ + 1, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35288_bq.field_376_bc, 0, p_35033_5_, p_35033_6_, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35288_bq.field_376_bc, 0, p_35033_5_, p_35033_6_ + 1, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35288_bq.field_376_bc, 0, p_35033_5_, p_35033_6_ + 2, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35288_bq.field_376_bc, 0, p_35033_5_ + 1, p_35033_6_ + 2, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35288_bq.field_376_bc, 0, p_35033_5_ + 2, p_35033_6_ + 2, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35288_bq.field_376_bc, 0, p_35033_5_ + 2, p_35033_6_ + 1, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35288_bq.field_376_bc, 0, p_35033_5_ + 2, p_35033_6_, p_35033_7_, p_35033_3_);
            break;

        case 4: // '\004'
            func_35018_a(p_35033_1_, Block.field_35285_bn.field_376_bc, 0, p_35033_5_, p_35033_6_, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35285_bn.field_376_bc, 0, p_35033_5_, p_35033_6_ + 1, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35285_bn.field_376_bc, 0, p_35033_5_, p_35033_6_ + 2, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35285_bn.field_376_bc, 0, p_35033_5_ + 1, p_35033_6_ + 2, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35285_bn.field_376_bc, 0, p_35033_5_ + 2, p_35033_6_ + 2, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35285_bn.field_376_bc, 0, p_35033_5_ + 2, p_35033_6_ + 1, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_35285_bn.field_376_bc, 0, p_35033_5_ + 2, p_35033_6_, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_435_aM.field_376_bc, 0, p_35033_5_ + 1, p_35033_6_, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_435_aM.field_376_bc, 8, p_35033_5_ + 1, p_35033_6_ + 1, p_35033_7_, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_4064_aS.field_376_bc, func_35009_c(Block.field_4064_aS.field_376_bc, 4), p_35033_5_ + 2, p_35033_6_ + 1, p_35033_7_ + 1, p_35033_3_);
            func_35018_a(p_35033_1_, Block.field_4064_aS.field_376_bc, func_35009_c(Block.field_4064_aS.field_376_bc, 3), p_35033_5_ + 2, p_35033_6_ + 1, p_35033_7_ - 1, p_35033_3_);
            break;
        }
    }

    protected EnumDoor func_35031_a(Random p_35031_1_)
    {
        int i = p_35031_1_.nextInt(5);
        switch(i)
        {
        case 0: // '\0'
        case 1: // '\001'
        default:
            return EnumDoor.OPENING;

        case 2: // '\002'
            return EnumDoor.WOOD_DOOR;

        case 3: // '\003'
            return EnumDoor.GRATES;

        case 4: // '\004'
            return EnumDoor.IRON_DOOR;
        }
    }

    protected StructureComponent func_35028_a(ComponentStrongholdStairs2 p_35028_1_, List p_35028_2_, Random p_35028_3_, int p_35028_4_, int p_35028_5_)
    {
        switch(field_35025_h)
        {
        case 2: // '\002'
            return StructureStrongholdPieces.func_35850_a(p_35028_1_, p_35028_2_, p_35028_3_, field_35024_g.field_35753_a + p_35028_4_, field_35024_g.field_35751_b + p_35028_5_, field_35024_g.field_35752_c - 1, field_35025_h, func_35012_c());

        case 0: // '\0'
            return StructureStrongholdPieces.func_35850_a(p_35028_1_, p_35028_2_, p_35028_3_, field_35024_g.field_35753_a + p_35028_4_, field_35024_g.field_35751_b + p_35028_5_, field_35024_g.field_35748_f + 1, field_35025_h, func_35012_c());

        case 1: // '\001'
            return StructureStrongholdPieces.func_35850_a(p_35028_1_, p_35028_2_, p_35028_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b + p_35028_5_, field_35024_g.field_35752_c + p_35028_4_, field_35025_h, func_35012_c());

        case 3: // '\003'
            return StructureStrongholdPieces.func_35850_a(p_35028_1_, p_35028_2_, p_35028_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b + p_35028_5_, field_35024_g.field_35752_c + p_35028_4_, field_35025_h, func_35012_c());
        }
        return null;
    }

    protected StructureComponent func_35032_b(ComponentStrongholdStairs2 p_35032_1_, List p_35032_2_, Random p_35032_3_, int p_35032_4_, int p_35032_5_)
    {
        switch(field_35025_h)
        {
        case 2: // '\002'
            return StructureStrongholdPieces.func_35850_a(p_35032_1_, p_35032_2_, p_35032_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b + p_35032_4_, field_35024_g.field_35752_c + p_35032_5_, 1, func_35012_c());

        case 0: // '\0'
            return StructureStrongholdPieces.func_35850_a(p_35032_1_, p_35032_2_, p_35032_3_, field_35024_g.field_35753_a - 1, field_35024_g.field_35751_b + p_35032_4_, field_35024_g.field_35752_c + p_35032_5_, 1, func_35012_c());

        case 1: // '\001'
            return StructureStrongholdPieces.func_35850_a(p_35032_1_, p_35032_2_, p_35032_3_, field_35024_g.field_35753_a + p_35032_5_, field_35024_g.field_35751_b + p_35032_4_, field_35024_g.field_35752_c - 1, 2, func_35012_c());

        case 3: // '\003'
            return StructureStrongholdPieces.func_35850_a(p_35032_1_, p_35032_2_, p_35032_3_, field_35024_g.field_35753_a + p_35032_5_, field_35024_g.field_35751_b + p_35032_4_, field_35024_g.field_35752_c - 1, 2, func_35012_c());
        }
        return null;
    }

    protected StructureComponent func_35029_c(ComponentStrongholdStairs2 p_35029_1_, List p_35029_2_, Random p_35029_3_, int p_35029_4_, int p_35029_5_)
    {
        switch(field_35025_h)
        {
        case 2: // '\002'
            return StructureStrongholdPieces.func_35850_a(p_35029_1_, p_35029_2_, p_35029_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b + p_35029_4_, field_35024_g.field_35752_c + p_35029_5_, 3, func_35012_c());

        case 0: // '\0'
            return StructureStrongholdPieces.func_35850_a(p_35029_1_, p_35029_2_, p_35029_3_, field_35024_g.field_35749_d + 1, field_35024_g.field_35751_b + p_35029_4_, field_35024_g.field_35752_c + p_35029_5_, 3, func_35012_c());

        case 1: // '\001'
            return StructureStrongholdPieces.func_35850_a(p_35029_1_, p_35029_2_, p_35029_3_, field_35024_g.field_35753_a + p_35029_5_, field_35024_g.field_35751_b + p_35029_4_, field_35024_g.field_35748_f + 1, 0, func_35012_c());

        case 3: // '\003'
            return StructureStrongholdPieces.func_35850_a(p_35029_1_, p_35029_2_, p_35029_3_, field_35024_g.field_35753_a + p_35029_5_, field_35024_g.field_35751_b + p_35029_4_, field_35024_g.field_35748_f + 1, 0, func_35012_c());
        }
        return null;
    }

    protected static boolean func_35030_a(StructureBoundingBox p_35030_0_)
    {
        return p_35030_0_ != null && p_35030_0_.field_35751_b > 10;
    }
}
