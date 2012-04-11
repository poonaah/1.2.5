// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockGrass

public class WorldGenPumpkin extends WorldGenerator
{

    public WorldGenPumpkin()
    {
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        for(int i = 0; i < 64; i++)
        {
            int j = (p_516_3_ + p_516_2_.nextInt(8)) - p_516_2_.nextInt(8);
            int k = (p_516_4_ + p_516_2_.nextInt(4)) - p_516_2_.nextInt(4);
            int l = (p_516_5_ + p_516_2_.nextInt(8)) - p_516_2_.nextInt(8);
            if(p_516_1_.func_20084_d(j, k, l) && p_516_1_.func_600_a(j, k - 1, l) == Block.field_337_v.field_376_bc && Block.field_4055_bb.func_243_a(p_516_1_, j, k, l))
            {
                p_516_1_.func_643_a(j, k, l, Block.field_4055_bb.field_376_bc, p_516_2_.nextInt(4));
            }
        }

        return true;
    }
}
