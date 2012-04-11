// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, Block, World, Material

public class WorldGenClay extends WorldGenerator
{

    private int field_867_a;
    private int field_866_b;

    public WorldGenClay(int p_i390_1_)
    {
        field_867_a = Block.field_424_aX.field_376_bc;
        field_866_b = p_i390_1_;
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        if(p_516_1_.func_599_f(p_516_3_, p_516_4_, p_516_5_) != Material.field_1332_f)
        {
            return false;
        }
        int i = p_516_2_.nextInt(field_866_b - 2) + 2;
        int j = 1;
        for(int k = p_516_3_ - i; k <= p_516_3_ + i; k++)
        {
            for(int l = p_516_5_ - i; l <= p_516_5_ + i; l++)
            {
                int i1 = k - p_516_3_;
                int j1 = l - p_516_5_;
                if(i1 * i1 + j1 * j1 > i * i)
                {
                    continue;
                }
                for(int k1 = p_516_4_ - j; k1 <= p_516_4_ + j; k1++)
                {
                    int l1 = p_516_1_.func_600_a(k, k1, l);
                    if(l1 == Block.field_336_w.field_376_bc || l1 == Block.field_424_aX.field_376_bc)
                    {
                        p_516_1_.func_634_a(k, k1, l, field_867_a);
                    }
                }

            }

        }

        return true;
    }
}
