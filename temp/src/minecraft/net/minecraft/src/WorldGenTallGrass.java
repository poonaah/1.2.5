// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockLeaves, 
//            BlockFlower

public class WorldGenTallGrass extends WorldGenerator
{

    private int field_28060_a;
    private int field_28059_b;

    public WorldGenTallGrass(int p_i612_1_, int p_i612_2_)
    {
        field_28060_a = p_i612_1_;
        field_28059_b = p_i612_2_;
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        for(int i = 0; ((i = p_516_1_.func_600_a(p_516_3_, p_516_4_, p_516_5_)) == 0 || i == Block.field_384_L.field_376_bc) && p_516_4_ > 0; p_516_4_--) { }
        for(int j = 0; j < 128; j++)
        {
            int k = (p_516_3_ + p_516_2_.nextInt(8)) - p_516_2_.nextInt(8);
            int l = (p_516_4_ + p_516_2_.nextInt(4)) - p_516_2_.nextInt(4);
            int i1 = (p_516_5_ + p_516_2_.nextInt(8)) - p_516_2_.nextInt(8);
            if(p_516_1_.func_20084_d(k, l, i1) && ((BlockFlower)Block.field_345_n[field_28060_a]).func_223_g(p_516_1_, k, l, i1))
            {
                p_516_1_.func_643_a(k, l, i1, field_28060_a, field_28059_b);
            }
        }

        return true;
    }
}
