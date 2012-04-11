// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block

public class WorldGenGlowStone1 extends WorldGenerator
{

    public WorldGenGlowStone1()
    {
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        if(!p_516_1_.func_20084_d(p_516_3_, p_516_4_, p_516_5_))
        {
            return false;
        }
        if(p_516_1_.func_600_a(p_516_3_, p_516_4_ + 1, p_516_5_) != Block.field_4053_bc.field_376_bc)
        {
            return false;
        }
        p_516_1_.func_690_d(p_516_3_, p_516_4_, p_516_5_, Block.field_4049_be.field_376_bc);
        for(int i = 0; i < 1500; i++)
        {
            int j = (p_516_3_ + p_516_2_.nextInt(8)) - p_516_2_.nextInt(8);
            int k = p_516_4_ - p_516_2_.nextInt(12);
            int l = (p_516_5_ + p_516_2_.nextInt(8)) - p_516_2_.nextInt(8);
            if(p_516_1_.func_600_a(j, k, l) != 0)
            {
                continue;
            }
            int i1 = 0;
            for(int j1 = 0; j1 < 6; j1++)
            {
                int k1 = 0;
                if(j1 == 0)
                {
                    k1 = p_516_1_.func_600_a(j - 1, k, l);
                }
                if(j1 == 1)
                {
                    k1 = p_516_1_.func_600_a(j + 1, k, l);
                }
                if(j1 == 2)
                {
                    k1 = p_516_1_.func_600_a(j, k - 1, l);
                }
                if(j1 == 3)
                {
                    k1 = p_516_1_.func_600_a(j, k + 1, l);
                }
                if(j1 == 4)
                {
                    k1 = p_516_1_.func_600_a(j, k, l - 1);
                }
                if(j1 == 5)
                {
                    k1 = p_516_1_.func_600_a(j, k, l + 1);
                }
                if(k1 == Block.field_4049_be.field_376_bc)
                {
                    i1++;
                }
            }

            if(i1 == 1)
            {
                p_516_1_.func_690_d(j, k, l, Block.field_4049_be.field_376_bc);
            }
        }

        return true;
    }
}
