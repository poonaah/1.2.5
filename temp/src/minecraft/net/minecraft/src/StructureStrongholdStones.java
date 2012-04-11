// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            StructurePieceBlockSelector, Block, StructureStrongholdPieceWeight2

class StructureStrongholdStones extends StructurePieceBlockSelector
{

    private StructureStrongholdStones()
    {
    }

    public void func_35706_a(Random p_35706_1_, int p_35706_2_, int p_35706_3_, int p_35706_4_, boolean p_35706_5_)
    {
        if(!p_35706_5_)
        {
            field_35710_a = 0;
            field_35709_b = 0;
        } else
        {
            field_35710_a = Block.field_35285_bn.field_376_bc;
            float f = p_35706_1_.nextFloat();
            if(f < 0.2F)
            {
                field_35709_b = 2;
            } else
            if(f < 0.5F)
            {
                field_35709_b = 1;
            } else
            if(f < 0.55F)
            {
                field_35710_a = Block.field_35289_bm.field_376_bc;
                field_35709_b = 2;
            } else
            {
                field_35709_b = 0;
            }
        }
    }

    StructureStrongholdStones(StructureStrongholdPieceWeight2 p_i161_1_)
    {
        this();
    }
}
