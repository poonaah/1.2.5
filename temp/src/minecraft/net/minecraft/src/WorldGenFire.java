// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockFire

public class WorldGenFire extends WorldGenerator
{

    public WorldGenFire()
    {
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        for(int i = 0; i < 64; i++)
        {
            int j = (p_516_3_ + p_516_2_.nextInt(8)) - p_516_2_.nextInt(8);
            int k = (p_516_4_ + p_516_2_.nextInt(4)) - p_516_2_.nextInt(4);
            int l = (p_516_5_ + p_516_2_.nextInt(8)) - p_516_2_.nextInt(8);
            if(p_516_1_.func_20084_d(j, k, l) && p_516_1_.func_600_a(j, k - 1, l) == Block.field_4053_bc.field_376_bc)
            {
                p_516_1_.func_690_d(j, k, l, Block.field_402_as.field_376_bc);
            }
        }

        return true;
    }
}
