// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            MathHelper

public class Vec3D
{

    private static List field_1778_d = new ArrayList();
    private static int field_1777_e = 0;
    public double field_1776_a;
    public double field_1775_b;
    public double field_1779_c;

    public static Vec3D func_1260_a(double p_1260_0_, double p_1260_2_, double p_1260_4_)
    {
        return new Vec3D(p_1260_0_, p_1260_2_, p_1260_4_);
    }

    public static void func_28215_a()
    {
        field_1778_d.clear();
        field_1777_e = 0;
    }

    public static void func_1259_a()
    {
        field_1777_e = 0;
    }

    public static Vec3D func_1248_b(double p_1248_0_, double p_1248_2_, double p_1248_4_)
    {
        if(field_1777_e >= field_1778_d.size())
        {
            field_1778_d.add(func_1260_a(0.0D, 0.0D, 0.0D));
        }
        return ((Vec3D)field_1778_d.get(field_1777_e++)).func_1254_e(p_1248_0_, p_1248_2_, p_1248_4_);
    }

    private Vec3D(double p_i247_1_, double p_i247_3_, double p_i247_5_)
    {
        if(p_i247_1_ == -0D)
        {
            p_i247_1_ = 0.0D;
        }
        if(p_i247_3_ == -0D)
        {
            p_i247_3_ = 0.0D;
        }
        if(p_i247_5_ == -0D)
        {
            p_i247_5_ = 0.0D;
        }
        field_1776_a = p_i247_1_;
        field_1775_b = p_i247_3_;
        field_1779_c = p_i247_5_;
    }

    private Vec3D func_1254_e(double p_1254_1_, double p_1254_3_, double p_1254_5_)
    {
        field_1776_a = p_1254_1_;
        field_1775_b = p_1254_3_;
        field_1779_c = p_1254_5_;
        return this;
    }

    public Vec3D func_1262_a(Vec3D p_1262_1_)
    {
        return func_1248_b(p_1262_1_.field_1776_a - field_1776_a, p_1262_1_.field_1775_b - field_1775_b, p_1262_1_.field_1779_c - field_1779_c);
    }

    public Vec3D func_1252_b()
    {
        double d = MathHelper.func_1109_a(field_1776_a * field_1776_a + field_1775_b * field_1775_b + field_1779_c * field_1779_c);
        if(d < 0.0001D)
        {
            return func_1248_b(0.0D, 0.0D, 0.0D);
        } else
        {
            return func_1248_b(field_1776_a / d, field_1775_b / d, field_1779_c / d);
        }
    }

    public double func_35612_b(Vec3D p_35612_1_)
    {
        return field_1776_a * p_35612_1_.field_1776_a + field_1775_b * p_35612_1_.field_1775_b + field_1779_c * p_35612_1_.field_1779_c;
    }

    public Vec3D func_1246_b(Vec3D p_1246_1_)
    {
        return func_1248_b(field_1775_b * p_1246_1_.field_1779_c - field_1779_c * p_1246_1_.field_1775_b, field_1779_c * p_1246_1_.field_1776_a - field_1776_a * p_1246_1_.field_1779_c, field_1776_a * p_1246_1_.field_1775_b - field_1775_b * p_1246_1_.field_1776_a);
    }

    public Vec3D func_1257_c(double p_1257_1_, double p_1257_3_, double p_1257_5_)
    {
        return func_1248_b(field_1776_a + p_1257_1_, field_1775_b + p_1257_3_, field_1779_c + p_1257_5_);
    }

    public double func_1251_c(Vec3D p_1251_1_)
    {
        double d = p_1251_1_.field_1776_a - field_1776_a;
        double d1 = p_1251_1_.field_1775_b - field_1775_b;
        double d2 = p_1251_1_.field_1779_c - field_1779_c;
        return (double)MathHelper.func_1109_a(d * d + d1 * d1 + d2 * d2);
    }

    public double func_1261_d(Vec3D p_1261_1_)
    {
        double d = p_1261_1_.field_1776_a - field_1776_a;
        double d1 = p_1261_1_.field_1775_b - field_1775_b;
        double d2 = p_1261_1_.field_1779_c - field_1779_c;
        return d * d + d1 * d1 + d2 * d2;
    }

    public double func_1255_d(double p_1255_1_, double p_1255_3_, double p_1255_5_)
    {
        double d = p_1255_1_ - field_1776_a;
        double d1 = p_1255_3_ - field_1775_b;
        double d2 = p_1255_5_ - field_1779_c;
        return d * d + d1 * d1 + d2 * d2;
    }

    public double func_1253_c()
    {
        return (double)MathHelper.func_1109_a(field_1776_a * field_1776_a + field_1775_b * field_1775_b + field_1779_c * field_1779_c);
    }

    public Vec3D func_1247_a(Vec3D p_1247_1_, double p_1247_2_)
    {
        double d = p_1247_1_.field_1776_a - field_1776_a;
        double d1 = p_1247_1_.field_1775_b - field_1775_b;
        double d2 = p_1247_1_.field_1779_c - field_1779_c;
        if(d * d < 1.0000000116860974E-007D)
        {
            return null;
        }
        double d3 = (p_1247_2_ - field_1776_a) / d;
        if(d3 < 0.0D || d3 > 1.0D)
        {
            return null;
        } else
        {
            return func_1248_b(field_1776_a + d * d3, field_1775_b + d1 * d3, field_1779_c + d2 * d3);
        }
    }

    public Vec3D func_1250_b(Vec3D p_1250_1_, double p_1250_2_)
    {
        double d = p_1250_1_.field_1776_a - field_1776_a;
        double d1 = p_1250_1_.field_1775_b - field_1775_b;
        double d2 = p_1250_1_.field_1779_c - field_1779_c;
        if(d1 * d1 < 1.0000000116860974E-007D)
        {
            return null;
        }
        double d3 = (p_1250_2_ - field_1775_b) / d1;
        if(d3 < 0.0D || d3 > 1.0D)
        {
            return null;
        } else
        {
            return func_1248_b(field_1776_a + d * d3, field_1775_b + d1 * d3, field_1779_c + d2 * d3);
        }
    }

    public Vec3D func_1256_c(Vec3D p_1256_1_, double p_1256_2_)
    {
        double d = p_1256_1_.field_1776_a - field_1776_a;
        double d1 = p_1256_1_.field_1775_b - field_1775_b;
        double d2 = p_1256_1_.field_1779_c - field_1779_c;
        if(d2 * d2 < 1.0000000116860974E-007D)
        {
            return null;
        }
        double d3 = (p_1256_2_ - field_1779_c) / d2;
        if(d3 < 0.0D || d3 > 1.0D)
        {
            return null;
        } else
        {
            return func_1248_b(field_1776_a + d * d3, field_1775_b + d1 * d3, field_1779_c + d2 * d3);
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("(").append(field_1776_a).append(", ").append(field_1775_b).append(", ").append(field_1779_c).append(")").toString();
    }

    public void func_1258_a(float p_1258_1_)
    {
        float f = MathHelper.func_1114_b(p_1258_1_);
        float f1 = MathHelper.func_1106_a(p_1258_1_);
        double d = field_1776_a;
        double d1 = field_1775_b * (double)f + field_1779_c * (double)f1;
        double d2 = field_1779_c * (double)f - field_1775_b * (double)f1;
        field_1776_a = d;
        field_1775_b = d1;
        field_1779_c = d2;
    }

    public void func_1249_b(float p_1249_1_)
    {
        float f = MathHelper.func_1114_b(p_1249_1_);
        float f1 = MathHelper.func_1106_a(p_1249_1_);
        double d = field_1776_a * (double)f + field_1779_c * (double)f1;
        double d1 = field_1775_b;
        double d2 = field_1779_c * (double)f - field_1776_a * (double)f1;
        field_1776_a = d;
        field_1775_b = d1;
        field_1779_c = d2;
    }

}
