// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockLeaves, 
//            BlockFlower

public class WorldGenDeadBush extends WorldGenerator
{

    private int field_28058_a;

    public WorldGenDeadBush(int p_i776_1_)
    {
        field_28058_a = p_i776_1_;
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        for(int i = 0; ((i = p_516_1_.func_600_a(p_516_3_, p_516_4_, p_516_5_)) == 0 || i == Block.field_384_L.field_376_bc) && p_516_4_ > 0; p_516_4_--) { }
        for(int j = 0; j < 4; j++)
        {
            int k = (p_516_3_ + p_516_2_.nextInt(8)) - p_516_2_.nextInt(8);
            int l = (p_516_4_ + p_516_2_.nextInt(4)) - p_516_2_.nextInt(4);
            int i1 = (p_516_5_ + p_516_2_.nextInt(8)) - p_516_2_.nextInt(8);
            if(p_516_1_.func_20084_d(k, l, i1) && ((BlockFlower)Block.field_345_n[field_28058_a]).func_223_g(p_516_1_, k, l, i1))
            {
                p_516_1_.func_634_a(k, l, i1, field_28058_a);
            }
        }

        return true;
    }
}
