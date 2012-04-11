// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block

public class WorldGenWaterlily extends WorldGenerator
{

    public WorldGenWaterlily()
    {
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        for(int i = 0; i < 10; i++)
        {
            int j = (p_516_3_ + p_516_2_.nextInt(8)) - p_516_2_.nextInt(8);
            int k = (p_516_4_ + p_516_2_.nextInt(4)) - p_516_2_.nextInt(4);
            int l = (p_516_5_ + p_516_2_.nextInt(8)) - p_516_2_.nextInt(8);
            if(p_516_1_.func_20084_d(j, k, l) && Block.field_40200_bA.func_243_a(p_516_1_, j, k, l))
            {
                p_516_1_.func_634_a(j, k, l, Block.field_40200_bA.field_376_bc);
            }
        }

        return true;
    }
}
