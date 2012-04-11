// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            LongHashMap, BiomeCacheBlock, WorldChunkManager, BiomeGenBase

public class BiomeCache
{

    private final WorldChunkManager field_35731_a;
    private long field_35729_b;
    private LongHashMap field_35730_c;
    private List field_35728_d;

    public BiomeCache(WorldChunkManager p_i519_1_)
    {
        field_35729_b = 0L;
        field_35730_c = new LongHashMap();
        field_35728_d = new ArrayList();
        field_35731_a = p_i519_1_;
    }

    public BiomeCacheBlock func_35726_e(int p_35726_1_, int p_35726_2_)
    {
        p_35726_1_ >>= 4;
        p_35726_2_ >>= 4;
        long l = (long)p_35726_1_ & 0xffffffffL | ((long)p_35726_2_ & 0xffffffffL) << 32;
        BiomeCacheBlock biomecacheblock = (BiomeCacheBlock)field_35730_c.func_35578_a(l);
        if(biomecacheblock == null)
        {
            biomecacheblock = new BiomeCacheBlock(this, p_35726_1_, p_35726_2_);
            field_35730_c.func_35577_a(l, biomecacheblock);
            field_35728_d.add(biomecacheblock);
        }
        biomecacheblock.field_35653_f = System.currentTimeMillis();
        return biomecacheblock;
    }

    public BiomeGenBase func_35725_a(int p_35725_1_, int p_35725_2_)
    {
        return func_35726_e(p_35725_1_, p_35725_2_).func_35651_a(p_35725_1_, p_35725_2_);
    }

    public void func_35724_a()
    {
        long l = System.currentTimeMillis();
        long l1 = l - field_35729_b;
        if(l1 > 7500L || l1 < 0L)
        {
            field_35729_b = l;
            for(int i = 0; i < field_35728_d.size(); i++)
            {
                BiomeCacheBlock biomecacheblock = (BiomeCacheBlock)field_35728_d.get(i);
                long l2 = l - biomecacheblock.field_35653_f;
                if(l2 > 30000L || l2 < 0L)
                {
                    field_35728_d.remove(i--);
                    long l3 = (long)biomecacheblock.field_35655_d & 0xffffffffL | ((long)biomecacheblock.field_35656_e & 0xffffffffL) << 32;
                    field_35730_c.func_35574_d(l3);
                }
            }

        }
    }

    public BiomeGenBase[] func_35723_d(int p_35723_1_, int p_35723_2_)
    {
        return func_35726_e(p_35723_1_, p_35723_2_).field_35658_c;
    }

    static WorldChunkManager func_35721_a(BiomeCache p_35721_0_)
    {
        return p_35721_0_.field_35731_a;
    }
}
