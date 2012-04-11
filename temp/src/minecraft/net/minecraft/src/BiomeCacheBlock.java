// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, BiomeCache, WorldChunkManager

public class BiomeCacheBlock
{

    public float field_35659_a[];
    public float field_35657_b[];
    public BiomeGenBase field_35658_c[];
    public int field_35655_d;
    public int field_35656_e;
    public long field_35653_f;
    final BiomeCache field_35654_g; /* synthetic field */

    public BiomeCacheBlock(BiomeCache p_i147_1_, int p_i147_2_, int p_i147_3_)
    {
        field_35654_g = p_i147_1_;
        super();
        field_35659_a = new float[256];
        field_35657_b = new float[256];
        field_35658_c = new BiomeGenBase[256];
        field_35655_d = p_i147_2_;
        field_35656_e = p_i147_3_;
        BiomeCache.func_35721_a(p_i147_1_).func_4071_a(field_35659_a, p_i147_2_ << 4, p_i147_3_ << 4, 16, 16);
        BiomeCache.func_35721_a(p_i147_1_).func_35560_b(field_35657_b, p_i147_2_ << 4, p_i147_3_ << 4, 16, 16);
        BiomeCache.func_35721_a(p_i147_1_).func_35555_a(field_35658_c, p_i147_2_ << 4, p_i147_3_ << 4, 16, 16, false);
    }

    public BiomeGenBase func_35651_a(int p_35651_1_, int p_35651_2_)
    {
        return field_35658_c[p_35651_1_ & 0xf | (p_35651_2_ & 0xf) << 4];
    }
}
