// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            BiomeCache, BiomeGenBase, GenLayer, World, 
//            WorldInfo, IntCache, ChunkPosition, WorldType

public class WorldChunkManager
{

    private GenLayer field_34903_b;
    private GenLayer field_34902_c;
    private BiomeCache field_35563_f;
    private List field_35564_g;

    protected WorldChunkManager()
    {
        field_35563_f = new BiomeCache(this);
        field_35564_g = new ArrayList();
        field_35564_g.add(BiomeGenBase.field_4253_d);
        field_35564_g.add(BiomeGenBase.field_35485_c);
        field_35564_g.add(BiomeGenBase.field_4250_g);
        field_35564_g.add(BiomeGenBase.field_46047_u);
        field_35564_g.add(BiomeGenBase.field_46048_t);
        field_35564_g.add(BiomeGenBase.field_48416_w);
        field_35564_g.add(BiomeGenBase.field_48417_x);
    }

    public WorldChunkManager(long p_i1063_1_, WorldType p_i1063_3_)
    {
        this();
        GenLayer agenlayer[] = GenLayer.func_48425_a(p_i1063_1_, p_i1063_3_);
        field_34903_b = agenlayer[0];
        field_34902_c = agenlayer[1];
    }

    public WorldChunkManager(World p_i578_1_)
    {
        this(p_i578_1_.func_22138_q(), p_i578_1_.func_22144_v().func_46133_t());
    }

    public List func_35559_a()
    {
        return field_35564_g;
    }

    public BiomeGenBase func_4073_a(int p_4073_1_, int p_4073_2_)
    {
        return field_35563_f.func_35725_a(p_4073_1_, p_4073_2_);
    }

    public float[] func_35560_b(float p_35560_1_[], int p_35560_2_, int p_35560_3_, int p_35560_4_, int p_35560_5_)
    {
        IntCache.func_35268_a();
        if(p_35560_1_ == null || p_35560_1_.length < p_35560_4_ * p_35560_5_)
        {
            p_35560_1_ = new float[p_35560_4_ * p_35560_5_];
        }
        int ai[] = field_34902_c.func_35500_a(p_35560_2_, p_35560_3_, p_35560_4_, p_35560_5_);
        for(int i = 0; i < p_35560_4_ * p_35560_5_; i++)
        {
            float f = (float)BiomeGenBase.field_35486_a[ai[i]].func_35476_e() / 65536F;
            if(f > 1.0F)
            {
                f = 1.0F;
            }
            p_35560_1_[i] = f;
        }

        return p_35560_1_;
    }

    public float func_40540_a(float p_40540_1_, int p_40540_2_)
    {
        return p_40540_1_;
    }

    public float[] func_4071_a(float p_4071_1_[], int p_4071_2_, int p_4071_3_, int p_4071_4_, int p_4071_5_)
    {
        IntCache.func_35268_a();
        if(p_4071_1_ == null || p_4071_1_.length < p_4071_4_ * p_4071_5_)
        {
            p_4071_1_ = new float[p_4071_4_ * p_4071_5_];
        }
        int ai[] = field_34902_c.func_35500_a(p_4071_2_, p_4071_3_, p_4071_4_, p_4071_5_);
        for(int i = 0; i < p_4071_4_ * p_4071_5_; i++)
        {
            float f = (float)BiomeGenBase.field_35486_a[ai[i]].func_35474_f() / 65536F;
            if(f > 1.0F)
            {
                f = 1.0F;
            }
            p_4071_1_[i] = f;
        }

        return p_4071_1_;
    }

    public BiomeGenBase[] func_35557_b(BiomeGenBase p_35557_1_[], int p_35557_2_, int p_35557_3_, int p_35557_4_, int p_35557_5_)
    {
        IntCache.func_35268_a();
        if(p_35557_1_ == null || p_35557_1_.length < p_35557_4_ * p_35557_5_)
        {
            p_35557_1_ = new BiomeGenBase[p_35557_4_ * p_35557_5_];
        }
        int ai[] = field_34903_b.func_35500_a(p_35557_2_, p_35557_3_, p_35557_4_, p_35557_5_);
        for(int i = 0; i < p_35557_4_ * p_35557_5_; i++)
        {
            p_35557_1_[i] = BiomeGenBase.field_35486_a[ai[i]];
        }

        return p_35557_1_;
    }

    public BiomeGenBase[] func_4070_a(BiomeGenBase p_4070_1_[], int p_4070_2_, int p_4070_3_, int p_4070_4_, int p_4070_5_)
    {
        return func_35555_a(p_4070_1_, p_4070_2_, p_4070_3_, p_4070_4_, p_4070_5_, true);
    }

    public BiomeGenBase[] func_35555_a(BiomeGenBase p_35555_1_[], int p_35555_2_, int p_35555_3_, int p_35555_4_, int p_35555_5_, boolean p_35555_6_)
    {
        IntCache.func_35268_a();
        if(p_35555_1_ == null || p_35555_1_.length < p_35555_4_ * p_35555_5_)
        {
            p_35555_1_ = new BiomeGenBase[p_35555_4_ * p_35555_5_];
        }
        if(p_35555_6_ && p_35555_4_ == 16 && p_35555_5_ == 16 && (p_35555_2_ & 0xf) == 0 && (p_35555_3_ & 0xf) == 0)
        {
            BiomeGenBase abiomegenbase[] = field_35563_f.func_35723_d(p_35555_2_, p_35555_3_);
            System.arraycopy(abiomegenbase, 0, p_35555_1_, 0, p_35555_4_ * p_35555_5_);
            return p_35555_1_;
        }
        int ai[] = field_34902_c.func_35500_a(p_35555_2_, p_35555_3_, p_35555_4_, p_35555_5_);
        for(int i = 0; i < p_35555_4_ * p_35555_5_; i++)
        {
            p_35555_1_[i] = BiomeGenBase.field_35486_a[ai[i]];
        }

        return p_35555_1_;
    }

    public boolean func_35562_a(int p_35562_1_, int p_35562_2_, int p_35562_3_, List p_35562_4_)
    {
        int i = p_35562_1_ - p_35562_3_ >> 2;
        int j = p_35562_2_ - p_35562_3_ >> 2;
        int k = p_35562_1_ + p_35562_3_ >> 2;
        int l = p_35562_2_ + p_35562_3_ >> 2;
        int i1 = (k - i) + 1;
        int j1 = (l - j) + 1;
        int ai[] = field_34903_b.func_35500_a(i, j, i1, j1);
        for(int k1 = 0; k1 < i1 * j1; k1++)
        {
            BiomeGenBase biomegenbase = BiomeGenBase.field_35486_a[ai[k1]];
            if(!p_35562_4_.contains(biomegenbase))
            {
                return false;
            }
        }

        return true;
    }

    public ChunkPosition func_35556_a(int p_35556_1_, int p_35556_2_, int p_35556_3_, List p_35556_4_, Random p_35556_5_)
    {
        int i = p_35556_1_ - p_35556_3_ >> 2;
        int j = p_35556_2_ - p_35556_3_ >> 2;
        int k = p_35556_1_ + p_35556_3_ >> 2;
        int l = p_35556_2_ + p_35556_3_ >> 2;
        int i1 = (k - i) + 1;
        int j1 = (l - j) + 1;
        int ai[] = field_34903_b.func_35500_a(i, j, i1, j1);
        ChunkPosition chunkposition = null;
        int k1 = 0;
        for(int l1 = 0; l1 < ai.length; l1++)
        {
            int i2 = i + l1 % i1 << 2;
            int j2 = j + l1 / i1 << 2;
            BiomeGenBase biomegenbase = BiomeGenBase.field_35486_a[ai[l1]];
            if(p_35556_4_.contains(biomegenbase) && (chunkposition == null || p_35556_5_.nextInt(k1 + 1) == 0))
            {
                chunkposition = new ChunkPosition(i2, 0, j2);
                k1++;
            }
        }

        return chunkposition;
    }

    public void func_35561_b()
    {
        field_35563_f.func_35724_a();
    }
}
