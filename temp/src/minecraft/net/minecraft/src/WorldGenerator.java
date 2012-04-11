// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            World, Chunk

public abstract class WorldGenerator
{

    private final boolean field_41061_a;

    public WorldGenerator()
    {
        field_41061_a = false;
    }

    public WorldGenerator(boolean p_i432_1_)
    {
        field_41061_a = p_i432_1_;
    }

    public abstract boolean func_516_a(World world, Random random, int i, int j, int k);

    public void func_517_a(double d, double d1, double d2)
    {
    }

    protected void func_50073_a(World p_50073_1_, int p_50073_2_, int p_50073_3_, int p_50073_4_, int p_50073_5_)
    {
        func_41060_a(p_50073_1_, p_50073_2_, p_50073_3_, p_50073_4_, p_50073_5_, 0);
    }

    protected void func_41060_a(World p_41060_1_, int p_41060_2_, int p_41060_3_, int p_41060_4_, int p_41060_5_, int p_41060_6_)
    {
        if(field_41061_a)
        {
            p_41060_1_.func_688_b(p_41060_2_, p_41060_3_, p_41060_4_, p_41060_5_, p_41060_6_);
        } else
        if(p_41060_1_.func_630_d(p_41060_2_, p_41060_3_, p_41060_4_) && p_41060_1_.func_673_a(p_41060_2_, p_41060_4_).field_50120_o)
        {
            if(p_41060_1_.func_643_a(p_41060_2_, p_41060_3_, p_41060_4_, p_41060_5_, p_41060_6_))
            {
                p_41060_1_.func_665_h(p_41060_2_, p_41060_3_, p_41060_4_);
            }
        } else
        {
            p_41060_1_.func_643_a(p_41060_2_, p_41060_3_, p_41060_4_, p_41060_5_, p_41060_6_);
        }
    }
}
