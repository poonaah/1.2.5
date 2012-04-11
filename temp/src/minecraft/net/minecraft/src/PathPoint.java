// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            MathHelper

public class PathPoint
{

    public final int field_1718_a;
    public final int field_1717_b;
    public final int field_1716_c;
    private final int field_1715_d;
    int field_1714_e;
    float field_1713_f;
    float field_1712_g;
    float field_1711_h;
    PathPoint field_1710_i;
    public boolean field_1709_j;

    public PathPoint(int p_i297_1_, int p_i297_2_, int p_i297_3_)
    {
        field_1714_e = -1;
        field_1709_j = false;
        field_1718_a = p_i297_1_;
        field_1717_b = p_i297_2_;
        field_1716_c = p_i297_3_;
        field_1715_d = func_22329_a(p_i297_1_, p_i297_2_, p_i297_3_);
    }

    public static int func_22329_a(int p_22329_0_, int p_22329_1_, int p_22329_2_)
    {
        return p_22329_1_ & 0xff | (p_22329_0_ & 0x7fff) << 8 | (p_22329_2_ & 0x7fff) << 24 | (p_22329_0_ >= 0 ? 0 : 0x80000000) | (p_22329_2_ >= 0 ? 0 : 0x8000);
    }

    public float func_1180_a(PathPoint p_1180_1_)
    {
        float f = p_1180_1_.field_1718_a - field_1718_a;
        float f1 = p_1180_1_.field_1717_b - field_1717_b;
        float f2 = p_1180_1_.field_1716_c - field_1716_c;
        return MathHelper.func_1113_c(f * f + f1 * f1 + f2 * f2);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(p_equals_1_ instanceof PathPoint)
        {
            PathPoint pathpoint = (PathPoint)p_equals_1_;
            return field_1715_d == pathpoint.field_1715_d && field_1718_a == pathpoint.field_1718_a && field_1717_b == pathpoint.field_1717_b && field_1716_c == pathpoint.field_1716_c;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return field_1715_d;
    }

    public boolean func_1179_a()
    {
        return field_1714_e >= 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append(field_1718_a).append(", ").append(field_1717_b).append(", ").append(field_1716_c).toString();
    }
}
