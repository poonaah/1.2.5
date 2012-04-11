// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockFlower

public class WorldGenFlowers extends WorldGenerator
{

    private int field_885_a;

    public WorldGenFlowers(int p_i619_1_)
    {
        field_885_a = p_i619_1_;
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        for(int i = 0; i < 64; i++)
        {
            int j = (p_516_3_ + p_516_2_.nextInt(8)) - p_516_2_.nextInt(8);
            int k = (p_516_4_ + p_516_2_.nextInt(4)) - p_516_2_.nextInt(4);
            int l = (p_516_5_ + p_516_2_.nextInt(8)) - p_516_2_.nextInt(8);
            if(p_516_1_.func_20084_d(j, k, l) && ((BlockFlower)Block.field_345_n[field_885_a]).func_223_g(p_516_1_, j, k, l))
            {
                p_516_1_.func_634_a(j, k, l, field_885_a);
            }
        }

        return true;
    }
}
