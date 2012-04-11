// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block

public class WorldGenCactus extends WorldGenerator
{

    public WorldGenCactus()
    {
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        for(int i = 0; i < 10; i++)
        {
            int j = (p_516_3_ + p_516_2_.nextInt(8)) - p_516_2_.nextInt(8);
            int k = (p_516_4_ + p_516_2_.nextInt(4)) - p_516_2_.nextInt(4);
            int l = (p_516_5_ + p_516_2_.nextInt(8)) - p_516_2_.nextInt(8);
            if(!p_516_1_.func_20084_d(j, k, l))
            {
                continue;
            }
            int i1 = 1 + p_516_2_.nextInt(p_516_2_.nextInt(3) + 1);
            for(int j1 = 0; j1 < i1; j1++)
            {
                if(Block.field_425_aW.func_223_g(p_516_1_, j, k + j1, l))
                {
                    p_516_1_.func_634_a(j, k + j1, l, Block.field_425_aW.field_376_bc);
                }
            }

        }

        return true;
    }
}
