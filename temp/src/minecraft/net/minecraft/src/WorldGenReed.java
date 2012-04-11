// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Material, Block

public class WorldGenReed extends WorldGenerator
{

    public WorldGenReed()
    {
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        for(int i = 0; i < 20; i++)
        {
            int j = (p_516_3_ + p_516_2_.nextInt(4)) - p_516_2_.nextInt(4);
            int k = p_516_4_;
            int l = (p_516_5_ + p_516_2_.nextInt(4)) - p_516_2_.nextInt(4);
            if(!p_516_1_.func_20084_d(j, k, l) || p_516_1_.func_599_f(j - 1, k - 1, l) != Material.field_1332_f && p_516_1_.func_599_f(j + 1, k - 1, l) != Material.field_1332_f && p_516_1_.func_599_f(j, k - 1, l - 1) != Material.field_1332_f && p_516_1_.func_599_f(j, k - 1, l + 1) != Material.field_1332_f)
            {
                continue;
            }
            int i1 = 2 + p_516_2_.nextInt(p_516_2_.nextInt(3) + 1);
            for(int j1 = 0; j1 < i1; j1++)
            {
                if(Block.field_423_aY.func_223_g(p_516_1_, j, k + j1, l))
                {
                    p_516_1_.func_634_a(j, k + j1, l, Block.field_423_aY.field_376_bc);
                }
            }

        }

        return true;
    }
}
