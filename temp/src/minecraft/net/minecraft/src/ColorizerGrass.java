// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class ColorizerGrass
{

    private static int field_6540_a[] = new int[0x10000];

    public ColorizerGrass()
    {
    }

    public static void func_28181_a(int p_28181_0_[])
    {
        field_6540_a = p_28181_0_;
    }

    public static int func_4147_a(double p_4147_0_, double p_4147_2_)
    {
        p_4147_2_ *= p_4147_0_;
        int i = (int)((1.0D - p_4147_0_) * 255D);
        int j = (int)((1.0D - p_4147_2_) * 255D);
        return field_6540_a[j << 8 | i];
    }

}
