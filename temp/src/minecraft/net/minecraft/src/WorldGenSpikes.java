// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, EntityEnderCrystal, 
//            Entity

public class WorldGenSpikes extends WorldGenerator
{

    private int field_40197_a;

    public WorldGenSpikes(int p_i62_1_)
    {
        field_40197_a = p_i62_1_;
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        if(!p_516_1_.func_20084_d(p_516_3_, p_516_4_, p_516_5_) || p_516_1_.func_600_a(p_516_3_, p_516_4_ - 1, p_516_5_) != field_40197_a)
        {
            return false;
        }
        int i = p_516_2_.nextInt(32) + 6;
        int j = p_516_2_.nextInt(4) + 1;
        for(int k = p_516_3_ - j; k <= p_516_3_ + j; k++)
        {
            for(int i1 = p_516_5_ - j; i1 <= p_516_5_ + j; i1++)
            {
                int k1 = k - p_516_3_;
                int i2 = i1 - p_516_5_;
                if(k1 * k1 + i2 * i2 <= j * j + 1 && p_516_1_.func_600_a(k, p_516_4_ - 1, i1) != field_40197_a)
                {
                    return false;
                }
            }

        }

        for(int l = p_516_4_; l < p_516_4_ + i && l < 128; l++)
        {
            for(int j1 = p_516_3_ - j; j1 <= p_516_3_ + j; j1++)
            {
                for(int l1 = p_516_5_ - j; l1 <= p_516_5_ + j; l1++)
                {
                    int j2 = j1 - p_516_3_;
                    int k2 = l1 - p_516_5_;
                    if(j2 * j2 + k2 * k2 <= j * j + 1)
                    {
                        p_516_1_.func_690_d(j1, l, l1, Block.field_405_aq.field_376_bc);
                    }
                }

            }

        }

        EntityEnderCrystal entityendercrystal = new EntityEnderCrystal(p_516_1_);
        entityendercrystal.func_365_c((float)p_516_3_ + 0.5F, p_516_4_ + i, (float)p_516_5_ + 0.5F, p_516_2_.nextFloat() * 360F, 0.0F);
        p_516_1_.func_674_a(entityendercrystal);
        p_516_1_.func_690_d(p_516_3_, p_516_4_ + i, p_516_5_, Block.field_403_A.field_376_bc);
        return true;
    }
}
