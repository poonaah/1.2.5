// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, Direction, 
//            Facing

public class WorldGenVines extends WorldGenerator
{

    public WorldGenVines()
    {
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        int i = p_516_3_;
        int j = p_516_5_;
label0:
        for(; p_516_4_ < 128; p_516_4_++)
        {
            if(p_516_1_.func_20084_d(p_516_3_, p_516_4_, p_516_5_))
            {
                int k = 2;
                do
                {
                    if(k > 5)
                    {
                        continue label0;
                    }
                    if(Block.field_35278_bv.func_28030_e(p_516_1_, p_516_3_, p_516_4_, p_516_5_, k))
                    {
                        p_516_1_.func_643_a(p_516_3_, p_516_4_, p_516_5_, Block.field_35278_bv.field_376_bc, 1 << Direction.field_35869_d[Facing.field_31057_a[k]]);
                        continue label0;
                    }
                    k++;
                } while(true);
            }
            p_516_3_ = (i + p_516_2_.nextInt(4)) - p_516_2_.nextInt(4);
            p_516_5_ = (j + p_516_2_.nextInt(4)) - p_516_2_.nextInt(4);
        }

        return true;
    }
}
