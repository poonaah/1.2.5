// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            PathPoint, Entity, Vec3D

public class PathEntity
{

    private final PathPoint field_1764_b[];
    private int field_48649_b;
    private int field_1765_a;

    public PathEntity(PathPoint p_i652_1_[])
    {
        field_1764_b = p_i652_1_;
        field_1765_a = p_i652_1_.length;
    }

    public void func_1206_a()
    {
        field_48649_b++;
    }

    public boolean func_1207_b()
    {
        return field_48649_b >= field_1765_a;
    }

    public PathPoint func_48645_c()
    {
        if(field_1765_a > 0)
        {
            return field_1764_b[field_1765_a - 1];
        } else
        {
            return null;
        }
    }

    public PathPoint func_48648_a(int p_48648_1_)
    {
        return field_1764_b[p_48648_1_];
    }

    public int func_48644_d()
    {
        return field_1765_a;
    }

    public void func_48641_b(int p_48641_1_)
    {
        field_1765_a = p_48641_1_;
    }

    public int func_48643_e()
    {
        return field_48649_b;
    }

    public void func_48642_c(int p_48642_1_)
    {
        field_48649_b = p_48642_1_;
    }

    public Vec3D func_48646_a(Entity p_48646_1_, int p_48646_2_)
    {
        double d = (double)field_1764_b[p_48646_2_].field_1718_a + (double)(int)(p_48646_1_.field_644_aC + 1.0F) * 0.5D;
        double d1 = field_1764_b[p_48646_2_].field_1717_b;
        double d2 = (double)field_1764_b[p_48646_2_].field_1716_c + (double)(int)(p_48646_1_.field_644_aC + 1.0F) * 0.5D;
        return Vec3D.func_1248_b(d, d1, d2);
    }

    public Vec3D func_48640_a(Entity p_48640_1_)
    {
        return func_48646_a(p_48640_1_, field_48649_b);
    }

    public boolean func_48647_a(PathEntity p_48647_1_)
    {
        if(p_48647_1_ == null)
        {
            return false;
        }
        if(p_48647_1_.field_1764_b.length != field_1764_b.length)
        {
            return false;
        }
        for(int i = 0; i < field_1764_b.length; i++)
        {
            if(field_1764_b[i].field_1718_a != p_48647_1_.field_1764_b[i].field_1718_a || field_1764_b[i].field_1717_b != p_48647_1_.field_1764_b[i].field_1717_b || field_1764_b[i].field_1716_c != p_48647_1_.field_1764_b[i].field_1716_c)
            {
                return false;
            }
        }

        return true;
    }

    public boolean func_48639_a(Vec3D p_48639_1_)
    {
        PathPoint pathpoint = func_48645_c();
        if(pathpoint == null)
        {
            return false;
        } else
        {
            return pathpoint.field_1718_a == (int)p_48639_1_.field_1776_a && pathpoint.field_1716_c == (int)p_48639_1_.field_1779_c;
        }
    }
}
