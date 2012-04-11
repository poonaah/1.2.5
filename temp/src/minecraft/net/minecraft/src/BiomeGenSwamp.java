// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, BiomeDecorator, ColorizerGrass, ColorizerFoliage, 
//            WorldGenerator

public class BiomeGenSwamp extends BiomeGenBase
{

    protected BiomeGenSwamp(int p_i131_1_)
    {
        super(p_i131_1_);
        field_35488_u.field_35911_r = 2;
        field_35488_u.field_35910_s = -999;
        field_35488_u.field_35908_u = 1;
        field_35488_u.field_35907_v = 8;
        field_35488_u.field_35906_w = 10;
        field_35488_u.field_35888_A = 1;
        field_35488_u.field_40721_y = 4;
        field_40256_A = 0xe0ffae;
    }

    public WorldGenerator func_21107_a(Random p_21107_1_)
    {
        return field_35482_C;
    }

    public int func_48415_j()
    {
        double d = func_48411_i();
        double d1 = func_48414_h();
        return ((ColorizerGrass.func_4147_a(d, d1) & 0xfefefe) + 0x4e0e4e) / 2;
    }

    public int func_48412_k()
    {
        double d = func_48411_i();
        double d1 = func_48414_h();
        return ((ColorizerFoliage.func_4146_a(d, d1) & 0xfefefe) + 0x4e0e4e) / 2;
    }
}
