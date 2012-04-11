// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockLeaves, 
//            BlockGrass

public class WorldGenShrub extends WorldGenerator
{

    private int field_48197_a;
    private int field_48196_b;

    public WorldGenShrub(int p_i1008_1_, int p_i1008_2_)
    {
        field_48196_b = p_i1008_1_;
        field_48197_a = p_i1008_2_;
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        for(int i = 0; ((i = p_516_1_.func_600_a(p_516_3_, p_516_4_, p_516_5_)) == 0 || i == Block.field_384_L.field_376_bc) && p_516_4_ > 0; p_516_4_--) { }
        int j = p_516_1_.func_600_a(p_516_3_, p_516_4_, p_516_5_);
        if(j == Block.field_336_w.field_376_bc || j == Block.field_337_v.field_376_bc)
        {
            p_516_4_++;
            func_41060_a(p_516_1_, p_516_3_, p_516_4_, p_516_5_, Block.field_385_K.field_376_bc, field_48196_b);
            for(int k = p_516_4_; k <= p_516_4_ + 2; k++)
            {
                int l = k - p_516_4_;
                int i1 = 2 - l;
                for(int j1 = p_516_3_ - i1; j1 <= p_516_3_ + i1; j1++)
                {
                    int k1 = j1 - p_516_3_;
                    for(int l1 = p_516_5_ - i1; l1 <= p_516_5_ + i1; l1++)
                    {
                        int i2 = l1 - p_516_5_;
                        if((Math.abs(k1) != i1 || Math.abs(i2) != i1 || p_516_2_.nextInt(2) != 0) && !Block.field_343_p[p_516_1_.func_600_a(j1, k, l1)])
                        {
                            func_41060_a(p_516_1_, j1, k, l1, Block.field_384_L.field_376_bc, field_48197_a);
                        }
                    }

                }

            }

        }
        return true;
    }
}
