// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Vec3D, MovingObjectPosition

public class AxisAlignedBB
{

    private static List field_1700_g = new ArrayList();
    private static int field_1699_h = 0;
    public double field_1698_a;
    public double field_1697_b;
    public double field_1704_c;
    public double field_1703_d;
    public double field_1702_e;
    public double field_1701_f;

    public static AxisAlignedBB func_1168_a(double p_1168_0_, double p_1168_2_, double p_1168_4_, double p_1168_6_, 
            double p_1168_8_, double p_1168_10_)
    {
        return new AxisAlignedBB(p_1168_0_, p_1168_2_, p_1168_4_, p_1168_6_, p_1168_8_, p_1168_10_);
    }

    public static void func_28196_a()
    {
        field_1700_g.clear();
        field_1699_h = 0;
    }

    public static void func_4149_a()
    {
        field_1699_h = 0;
    }

    public static AxisAlignedBB func_1161_b(double p_1161_0_, double p_1161_2_, double p_1161_4_, double p_1161_6_, 
            double p_1161_8_, double p_1161_10_)
    {
        if(field_1699_h >= field_1700_g.size())
        {
            field_1700_g.add(func_1168_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D));
        }
        return ((AxisAlignedBB)field_1700_g.get(field_1699_h++)).func_1165_c(p_1161_0_, p_1161_2_, p_1161_4_, p_1161_6_, p_1161_8_, p_1161_10_);
    }

    private AxisAlignedBB(double p_i667_1_, double p_i667_3_, double p_i667_5_, double p_i667_7_, double p_i667_9_, double p_i667_11_)
    {
        field_1698_a = p_i667_1_;
        field_1697_b = p_i667_3_;
        field_1704_c = p_i667_5_;
        field_1703_d = p_i667_7_;
        field_1702_e = p_i667_9_;
        field_1701_f = p_i667_11_;
    }

    public AxisAlignedBB func_1165_c(double p_1165_1_, double p_1165_3_, double p_1165_5_, double p_1165_7_, double p_1165_9_, double p_1165_11_)
    {
        field_1698_a = p_1165_1_;
        field_1697_b = p_1165_3_;
        field_1704_c = p_1165_5_;
        field_1703_d = p_1165_7_;
        field_1702_e = p_1165_9_;
        field_1701_f = p_1165_11_;
        return this;
    }

    public AxisAlignedBB func_1170_a(double p_1170_1_, double p_1170_3_, double p_1170_5_)
    {
        double d = field_1698_a;
        double d1 = field_1697_b;
        double d2 = field_1704_c;
        double d3 = field_1703_d;
        double d4 = field_1702_e;
        double d5 = field_1701_f;
        if(p_1170_1_ < 0.0D)
        {
            d += p_1170_1_;
        }
        if(p_1170_1_ > 0.0D)
        {
            d3 += p_1170_1_;
        }
        if(p_1170_3_ < 0.0D)
        {
            d1 += p_1170_3_;
        }
        if(p_1170_3_ > 0.0D)
        {
            d4 += p_1170_3_;
        }
        if(p_1170_5_ < 0.0D)
        {
            d2 += p_1170_5_;
        }
        if(p_1170_5_ > 0.0D)
        {
            d5 += p_1170_5_;
        }
        return func_1161_b(d, d1, d2, d3, d4, d5);
    }

    public AxisAlignedBB func_1177_b(double p_1177_1_, double p_1177_3_, double p_1177_5_)
    {
        double d = field_1698_a - p_1177_1_;
        double d1 = field_1697_b - p_1177_3_;
        double d2 = field_1704_c - p_1177_5_;
        double d3 = field_1703_d + p_1177_1_;
        double d4 = field_1702_e + p_1177_3_;
        double d5 = field_1701_f + p_1177_5_;
        return func_1161_b(d, d1, d2, d3, d4, d5);
    }

    public AxisAlignedBB func_1166_c(double p_1166_1_, double p_1166_3_, double p_1166_5_)
    {
        return func_1161_b(field_1698_a + p_1166_1_, field_1697_b + p_1166_3_, field_1704_c + p_1166_5_, field_1703_d + p_1166_1_, field_1702_e + p_1166_3_, field_1701_f + p_1166_5_);
    }

    public double func_1163_a(AxisAlignedBB p_1163_1_, double p_1163_2_)
    {
        if(p_1163_1_.field_1702_e <= field_1697_b || p_1163_1_.field_1697_b >= field_1702_e)
        {
            return p_1163_2_;
        }
        if(p_1163_1_.field_1701_f <= field_1704_c || p_1163_1_.field_1704_c >= field_1701_f)
        {
            return p_1163_2_;
        }
        if(p_1163_2_ > 0.0D && p_1163_1_.field_1703_d <= field_1698_a)
        {
            double d = field_1698_a - p_1163_1_.field_1703_d;
            if(d < p_1163_2_)
            {
                p_1163_2_ = d;
            }
        }
        if(p_1163_2_ < 0.0D && p_1163_1_.field_1698_a >= field_1703_d)
        {
            double d1 = field_1703_d - p_1163_1_.field_1698_a;
            if(d1 > p_1163_2_)
            {
                p_1163_2_ = d1;
            }
        }
        return p_1163_2_;
    }

    public double func_1172_b(AxisAlignedBB p_1172_1_, double p_1172_2_)
    {
        if(p_1172_1_.field_1703_d <= field_1698_a || p_1172_1_.field_1698_a >= field_1703_d)
        {
            return p_1172_2_;
        }
        if(p_1172_1_.field_1701_f <= field_1704_c || p_1172_1_.field_1704_c >= field_1701_f)
        {
            return p_1172_2_;
        }
        if(p_1172_2_ > 0.0D && p_1172_1_.field_1702_e <= field_1697_b)
        {
            double d = field_1697_b - p_1172_1_.field_1702_e;
            if(d < p_1172_2_)
            {
                p_1172_2_ = d;
            }
        }
        if(p_1172_2_ < 0.0D && p_1172_1_.field_1697_b >= field_1702_e)
        {
            double d1 = field_1702_e - p_1172_1_.field_1697_b;
            if(d1 > p_1172_2_)
            {
                p_1172_2_ = d1;
            }
        }
        return p_1172_2_;
    }

    public double func_1162_c(AxisAlignedBB p_1162_1_, double p_1162_2_)
    {
        if(p_1162_1_.field_1703_d <= field_1698_a || p_1162_1_.field_1698_a >= field_1703_d)
        {
            return p_1162_2_;
        }
        if(p_1162_1_.field_1702_e <= field_1697_b || p_1162_1_.field_1697_b >= field_1702_e)
        {
            return p_1162_2_;
        }
        if(p_1162_2_ > 0.0D && p_1162_1_.field_1701_f <= field_1704_c)
        {
            double d = field_1704_c - p_1162_1_.field_1701_f;
            if(d < p_1162_2_)
            {
                p_1162_2_ = d;
            }
        }
        if(p_1162_2_ < 0.0D && p_1162_1_.field_1704_c >= field_1701_f)
        {
            double d1 = field_1701_f - p_1162_1_.field_1704_c;
            if(d1 > p_1162_2_)
            {
                p_1162_2_ = d1;
            }
        }
        return p_1162_2_;
    }

    public boolean func_1178_a(AxisAlignedBB p_1178_1_)
    {
        if(p_1178_1_.field_1703_d <= field_1698_a || p_1178_1_.field_1698_a >= field_1703_d)
        {
            return false;
        }
        if(p_1178_1_.field_1702_e <= field_1697_b || p_1178_1_.field_1697_b >= field_1702_e)
        {
            return false;
        }
        return p_1178_1_.field_1701_f > field_1704_c && p_1178_1_.field_1704_c < field_1701_f;
    }

    public AxisAlignedBB func_1174_d(double p_1174_1_, double p_1174_3_, double p_1174_5_)
    {
        field_1698_a += p_1174_1_;
        field_1697_b += p_1174_3_;
        field_1704_c += p_1174_5_;
        field_1703_d += p_1174_1_;
        field_1702_e += p_1174_3_;
        field_1701_f += p_1174_5_;
        return this;
    }

    public boolean func_4150_a(Vec3D p_4150_1_)
    {
        if(p_4150_1_.field_1776_a <= field_1698_a || p_4150_1_.field_1776_a >= field_1703_d)
        {
            return false;
        }
        if(p_4150_1_.field_1775_b <= field_1697_b || p_4150_1_.field_1775_b >= field_1702_e)
        {
            return false;
        }
        return p_4150_1_.field_1779_c > field_1704_c && p_4150_1_.field_1779_c < field_1701_f;
    }

    public double func_1164_b()
    {
        double d = field_1703_d - field_1698_a;
        double d1 = field_1702_e - field_1697_b;
        double d2 = field_1701_f - field_1704_c;
        return (d + d1 + d2) / 3D;
    }

    public AxisAlignedBB func_28195_e(double p_28195_1_, double p_28195_3_, double p_28195_5_)
    {
        double d = field_1698_a + p_28195_1_;
        double d1 = field_1697_b + p_28195_3_;
        double d2 = field_1704_c + p_28195_5_;
        double d3 = field_1703_d - p_28195_1_;
        double d4 = field_1702_e - p_28195_3_;
        double d5 = field_1701_f - p_28195_5_;
        return func_1161_b(d, d1, d2, d3, d4, d5);
    }

    public AxisAlignedBB func_1160_c()
    {
        return func_1161_b(field_1698_a, field_1697_b, field_1704_c, field_1703_d, field_1702_e, field_1701_f);
    }

    public MovingObjectPosition func_1169_a(Vec3D p_1169_1_, Vec3D p_1169_2_)
    {
        Vec3D vec3d = p_1169_1_.func_1247_a(p_1169_2_, field_1698_a);
        Vec3D vec3d1 = p_1169_1_.func_1247_a(p_1169_2_, field_1703_d);
        Vec3D vec3d2 = p_1169_1_.func_1250_b(p_1169_2_, field_1697_b);
        Vec3D vec3d3 = p_1169_1_.func_1250_b(p_1169_2_, field_1702_e);
        Vec3D vec3d4 = p_1169_1_.func_1256_c(p_1169_2_, field_1704_c);
        Vec3D vec3d5 = p_1169_1_.func_1256_c(p_1169_2_, field_1701_f);
        if(!func_1167_a(vec3d))
        {
            vec3d = null;
        }
        if(!func_1167_a(vec3d1))
        {
            vec3d1 = null;
        }
        if(!func_1175_b(vec3d2))
        {
            vec3d2 = null;
        }
        if(!func_1175_b(vec3d3))
        {
            vec3d3 = null;
        }
        if(!func_1176_c(vec3d4))
        {
            vec3d4 = null;
        }
        if(!func_1176_c(vec3d5))
        {
            vec3d5 = null;
        }
        Vec3D vec3d6 = null;
        if(vec3d != null && (vec3d6 == null || p_1169_1_.func_1261_d(vec3d) < p_1169_1_.func_1261_d(vec3d6)))
        {
            vec3d6 = vec3d;
        }
        if(vec3d1 != null && (vec3d6 == null || p_1169_1_.func_1261_d(vec3d1) < p_1169_1_.func_1261_d(vec3d6)))
        {
            vec3d6 = vec3d1;
        }
        if(vec3d2 != null && (vec3d6 == null || p_1169_1_.func_1261_d(vec3d2) < p_1169_1_.func_1261_d(vec3d6)))
        {
            vec3d6 = vec3d2;
        }
        if(vec3d3 != null && (vec3d6 == null || p_1169_1_.func_1261_d(vec3d3) < p_1169_1_.func_1261_d(vec3d6)))
        {
            vec3d6 = vec3d3;
        }
        if(vec3d4 != null && (vec3d6 == null || p_1169_1_.func_1261_d(vec3d4) < p_1169_1_.func_1261_d(vec3d6)))
        {
            vec3d6 = vec3d4;
        }
        if(vec3d5 != null && (vec3d6 == null || p_1169_1_.func_1261_d(vec3d5) < p_1169_1_.func_1261_d(vec3d6)))
        {
            vec3d6 = vec3d5;
        }
        if(vec3d6 == null)
        {
            return null;
        }
        byte byte0 = -1;
        if(vec3d6 == vec3d)
        {
            byte0 = 4;
        }
        if(vec3d6 == vec3d1)
        {
            byte0 = 5;
        }
        if(vec3d6 == vec3d2)
        {
            byte0 = 0;
        }
        if(vec3d6 == vec3d3)
        {
            byte0 = 1;
        }
        if(vec3d6 == vec3d4)
        {
            byte0 = 2;
        }
        if(vec3d6 == vec3d5)
        {
            byte0 = 3;
        }
        return new MovingObjectPosition(0, 0, 0, byte0, vec3d6);
    }

    private boolean func_1167_a(Vec3D p_1167_1_)
    {
        if(p_1167_1_ == null)
        {
            return false;
        } else
        {
            return p_1167_1_.field_1775_b >= field_1697_b && p_1167_1_.field_1775_b <= field_1702_e && p_1167_1_.field_1779_c >= field_1704_c && p_1167_1_.field_1779_c <= field_1701_f;
        }
    }

    private boolean func_1175_b(Vec3D p_1175_1_)
    {
        if(p_1175_1_ == null)
        {
            return false;
        } else
        {
            return p_1175_1_.field_1776_a >= field_1698_a && p_1175_1_.field_1776_a <= field_1703_d && p_1175_1_.field_1779_c >= field_1704_c && p_1175_1_.field_1779_c <= field_1701_f;
        }
    }

    private boolean func_1176_c(Vec3D p_1176_1_)
    {
        if(p_1176_1_ == null)
        {
            return false;
        } else
        {
            return p_1176_1_.field_1776_a >= field_1698_a && p_1176_1_.field_1776_a <= field_1703_d && p_1176_1_.field_1775_b >= field_1697_b && p_1176_1_.field_1775_b <= field_1702_e;
        }
    }

    public void func_1171_b(AxisAlignedBB p_1171_1_)
    {
        field_1698_a = p_1171_1_.field_1698_a;
        field_1697_b = p_1171_1_.field_1697_b;
        field_1704_c = p_1171_1_.field_1704_c;
        field_1703_d = p_1171_1_.field_1703_d;
        field_1702_e = p_1171_1_.field_1702_e;
        field_1701_f = p_1171_1_.field_1701_f;
    }

    public String toString()
    {
        return (new StringBuilder()).append("box[").append(field_1698_a).append(", ").append(field_1697_b).append(", ").append(field_1704_c).append(" -> ").append(field_1703_d).append(", ").append(field_1702_e).append(", ").append(field_1701_f).append("]").toString();
    }

}
