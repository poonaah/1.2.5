// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block

public class WorldGenDesertWells extends WorldGenerator
{

    public WorldGenDesertWells()
    {
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        for(; p_516_1_.func_20084_d(p_516_3_, p_516_4_, p_516_5_) && p_516_4_ > 2; p_516_4_--) { }
        int i = p_516_1_.func_600_a(p_516_3_, p_516_4_, p_516_5_);
        if(i != Block.field_393_F.field_376_bc)
        {
            return false;
        }
        for(int j = -2; j <= 2; j++)
        {
            for(int k1 = -2; k1 <= 2; k1++)
            {
                if(p_516_1_.func_20084_d(p_516_3_ + j, p_516_4_ - 1, p_516_5_ + k1) && p_516_1_.func_20084_d(p_516_3_ + j, p_516_4_ - 2, p_516_5_ + k1))
                {
                    return false;
                }
            }

        }

        for(int k = -1; k <= 0; k++)
        {
            for(int l1 = -2; l1 <= 2; l1++)
            {
                for(int k2 = -2; k2 <= 2; k2++)
                {
                    p_516_1_.func_634_a(p_516_3_ + l1, p_516_4_ + k, p_516_5_ + k2, Block.field_9264_Q.field_376_bc);
                }

            }

        }

        p_516_1_.func_634_a(p_516_3_, p_516_4_, p_516_5_, Block.field_401_B.field_376_bc);
        p_516_1_.func_634_a(p_516_3_ - 1, p_516_4_, p_516_5_, Block.field_401_B.field_376_bc);
        p_516_1_.func_634_a(p_516_3_ + 1, p_516_4_, p_516_5_, Block.field_401_B.field_376_bc);
        p_516_1_.func_634_a(p_516_3_, p_516_4_, p_516_5_ - 1, Block.field_401_B.field_376_bc);
        p_516_1_.func_634_a(p_516_3_, p_516_4_, p_516_5_ + 1, Block.field_401_B.field_376_bc);
        for(int l = -2; l <= 2; l++)
        {
            for(int i2 = -2; i2 <= 2; i2++)
            {
                if(l == -2 || l == 2 || i2 == -2 || i2 == 2)
                {
                    p_516_1_.func_634_a(p_516_3_ + l, p_516_4_ + 1, p_516_5_ + i2, Block.field_9264_Q.field_376_bc);
                }
            }

        }

        p_516_1_.func_643_a(p_516_3_ + 2, p_516_4_ + 1, p_516_5_, Block.field_410_al.field_376_bc, 1);
        p_516_1_.func_643_a(p_516_3_ - 2, p_516_4_ + 1, p_516_5_, Block.field_410_al.field_376_bc, 1);
        p_516_1_.func_643_a(p_516_3_, p_516_4_ + 1, p_516_5_ + 2, Block.field_410_al.field_376_bc, 1);
        p_516_1_.func_643_a(p_516_3_, p_516_4_ + 1, p_516_5_ - 2, Block.field_410_al.field_376_bc, 1);
        for(int i1 = -1; i1 <= 1; i1++)
        {
            for(int j2 = -1; j2 <= 1; j2++)
            {
                if(i1 == 0 && j2 == 0)
                {
                    p_516_1_.func_634_a(p_516_3_ + i1, p_516_4_ + 4, p_516_5_ + j2, Block.field_9264_Q.field_376_bc);
                } else
                {
                    p_516_1_.func_643_a(p_516_3_ + i1, p_516_4_ + 4, p_516_5_ + j2, Block.field_410_al.field_376_bc, 1);
                }
            }

        }

        for(int j1 = 1; j1 <= 3; j1++)
        {
            p_516_1_.func_634_a(p_516_3_ - 1, p_516_4_ + j1, p_516_5_ - 1, Block.field_9264_Q.field_376_bc);
            p_516_1_.func_634_a(p_516_3_ - 1, p_516_4_ + j1, p_516_5_ + 1, Block.field_9264_Q.field_376_bc);
            p_516_1_.func_634_a(p_516_3_ + 1, p_516_4_ + j1, p_516_5_ - 1, Block.field_9264_Q.field_376_bc);
            p_516_1_.func_634_a(p_516_3_ + 1, p_516_4_ + j1, p_516_5_ + 1, Block.field_9264_Q.field_376_bc);
        }

        return true;
    }
}
