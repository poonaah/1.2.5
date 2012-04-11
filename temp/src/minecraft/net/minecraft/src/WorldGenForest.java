// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockLeaves, 
//            BlockGrass

public class WorldGenForest extends WorldGenerator
{

    public WorldGenForest(boolean p_i396_1_)
    {
        super(p_i396_1_);
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        int i = p_516_2_.nextInt(3) + 5;
        boolean flag = true;
        if(p_516_4_ < 1 || p_516_4_ + i + 1 > 256)
        {
            return false;
        }
        for(int j = p_516_4_; j <= p_516_4_ + 1 + i; j++)
        {
            byte byte0 = 1;
            if(j == p_516_4_)
            {
                byte0 = 0;
            }
            if(j >= (p_516_4_ + 1 + i) - 2)
            {
                byte0 = 2;
            }
            for(int j1 = p_516_3_ - byte0; j1 <= p_516_3_ + byte0 && flag; j1++)
            {
                for(int i2 = p_516_5_ - byte0; i2 <= p_516_5_ + byte0 && flag; i2++)
                {
                    if(j >= 0 && j < 256)
                    {
                        int k2 = p_516_1_.func_600_a(j1, j, i2);
                        if(k2 != 0 && k2 != Block.field_384_L.field_376_bc)
                        {
                            flag = false;
                        }
                    } else
                    {
                        flag = false;
                    }
                }

            }

        }

        if(!flag)
        {
            return false;
        }
        int k = p_516_1_.func_600_a(p_516_3_, p_516_4_ - 1, p_516_5_);
        if(k != Block.field_337_v.field_376_bc && k != Block.field_336_w.field_376_bc || p_516_4_ >= 256 - i - 1)
        {
            return false;
        }
        func_50073_a(p_516_1_, p_516_3_, p_516_4_ - 1, p_516_5_, Block.field_336_w.field_376_bc);
        for(int l = (p_516_4_ - 3) + i; l <= p_516_4_ + i; l++)
        {
            int k1 = l - (p_516_4_ + i);
            int j2 = 1 - k1 / 2;
            for(int l2 = p_516_3_ - j2; l2 <= p_516_3_ + j2; l2++)
            {
                int i3 = l2 - p_516_3_;
                for(int j3 = p_516_5_ - j2; j3 <= p_516_5_ + j2; j3++)
                {
                    int k3 = j3 - p_516_5_;
                    if((Math.abs(i3) != j2 || Math.abs(k3) != j2 || p_516_2_.nextInt(2) != 0 && k1 != 0) && !Block.field_343_p[p_516_1_.func_600_a(l2, l, j3)])
                    {
                        func_41060_a(p_516_1_, l2, l, j3, Block.field_384_L.field_376_bc, 2);
                    }
                }

            }

        }

        for(int i1 = 0; i1 < i; i1++)
        {
            int l1 = p_516_1_.func_600_a(p_516_3_, p_516_4_ + i1, p_516_5_);
            if(l1 == 0 || l1 == Block.field_384_L.field_376_bc)
            {
                func_41060_a(p_516_1_, p_516_3_, p_516_4_ + i1, p_516_5_, Block.field_385_K.field_376_bc, 2);
            }
        }

        return true;
    }
}
