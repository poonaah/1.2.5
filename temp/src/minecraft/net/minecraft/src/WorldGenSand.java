// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Material, Block, 
//            BlockGrass

public class WorldGenSand extends WorldGenerator
{

    private int field_35264_a;
    private int field_35263_b;

    public WorldGenSand(int p_i308_1_, int p_i308_2_)
    {
        field_35264_a = p_i308_2_;
        field_35263_b = p_i308_1_;
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        if(p_516_1_.func_599_f(p_516_3_, p_516_4_, p_516_5_) != Material.field_1332_f)
        {
            return false;
        }
        int i = p_516_2_.nextInt(field_35263_b - 2) + 2;
        byte byte0 = 2;
        for(int j = p_516_3_ - i; j <= p_516_3_ + i; j++)
        {
            for(int k = p_516_5_ - i; k <= p_516_5_ + i; k++)
            {
                int l = j - p_516_3_;
                int i1 = k - p_516_5_;
                if(l * l + i1 * i1 > i * i)
                {
                    continue;
                }
                for(int j1 = p_516_4_ - byte0; j1 <= p_516_4_ + byte0; j1++)
                {
                    int k1 = p_516_1_.func_600_a(j, j1, k);
                    if(k1 == Block.field_336_w.field_376_bc || k1 == Block.field_337_v.field_376_bc)
                    {
                        p_516_1_.func_634_a(j, j1, k, field_35264_a);
                    }
                }

            }

        }

        return true;
    }
}
