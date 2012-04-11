// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockSand, Item

public class BlockGravel extends BlockSand
{

    public BlockGravel(int p_i399_1_, int p_i399_2_)
    {
        super(p_i399_1_, p_i399_2_);
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        if(p_240_2_.nextInt(10 - p_240_3_ * 3) == 0)
        {
            return Item.field_273_an.field_291_aS;
        } else
        {
            return field_376_bc;
        }
    }
}
