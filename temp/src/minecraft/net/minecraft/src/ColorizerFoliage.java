// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class ColorizerFoliage
{

    private static int field_6529_a[] = new int[0x10000];

    public ColorizerFoliage()
    {
    }

    public static void func_28152_a(int p_28152_0_[])
    {
        field_6529_a = p_28152_0_;
    }

    public static int func_4146_a(double p_4146_0_, double p_4146_2_)
    {
        p_4146_2_ *= p_4146_0_;
        int i = (int)((1.0D - p_4146_0_) * 255D);
        int j = (int)((1.0D - p_4146_2_) * 255D);
        return field_6529_a[j << 8 | i];
    }

    public static int func_21175_a()
    {
        return 0x619961;
    }

    public static int func_21174_b()
    {
        return 0x80a755;
    }

    public static int func_31073_c()
    {
        return 0x48b518;
    }

}
