// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            PathPoint

public class Path
{

    private PathPoint field_1556_a[];
    private int field_1555_b;

    public Path()
    {
        field_1556_a = new PathPoint[1024];
        field_1555_b = 0;
    }

    public PathPoint func_1034_a(PathPoint p_1034_1_)
    {
        if(p_1034_1_.field_1714_e >= 0)
        {
            throw new IllegalStateException("OW KNOWS!");
        }
        if(field_1555_b == field_1556_a.length)
        {
            PathPoint apathpoint[] = new PathPoint[field_1555_b << 1];
            System.arraycopy(field_1556_a, 0, apathpoint, 0, field_1555_b);
            field_1556_a = apathpoint;
        }
        field_1556_a[field_1555_b] = p_1034_1_;
        p_1034_1_.field_1714_e = field_1555_b;
        func_1033_a(field_1555_b++);
        return p_1034_1_;
    }

    public void func_1038_a()
    {
        field_1555_b = 0;
    }

    public PathPoint func_1036_b()
    {
        PathPoint pathpoint = field_1556_a[0];
        field_1556_a[0] = field_1556_a[--field_1555_b];
        field_1556_a[field_1555_b] = null;
        if(field_1555_b > 0)
        {
            func_1037_b(0);
        }
        pathpoint.field_1714_e = -1;
        return pathpoint;
    }

    public void func_1035_a(PathPoint p_1035_1_, float p_1035_2_)
    {
        float f = p_1035_1_.field_1711_h;
        p_1035_1_.field_1711_h = p_1035_2_;
        if(p_1035_2_ < f)
        {
            func_1033_a(p_1035_1_.field_1714_e);
        } else
        {
            func_1037_b(p_1035_1_.field_1714_e);
        }
    }

    private void func_1033_a(int p_1033_1_)
    {
        PathPoint pathpoint = field_1556_a[p_1033_1_];
        float f = pathpoint.field_1711_h;
        do
        {
            if(p_1033_1_ <= 0)
            {
                break;
            }
            int i = p_1033_1_ - 1 >> 1;
            PathPoint pathpoint1 = field_1556_a[i];
            if(f >= pathpoint1.field_1711_h)
            {
                break;
            }
            field_1556_a[p_1033_1_] = pathpoint1;
            pathpoint1.field_1714_e = p_1033_1_;
            p_1033_1_ = i;
        } while(true);
        field_1556_a[p_1033_1_] = pathpoint;
        pathpoint.field_1714_e = p_1033_1_;
    }

    private void func_1037_b(int p_1037_1_)
    {
        PathPoint pathpoint = field_1556_a[p_1037_1_];
        float f = pathpoint.field_1711_h;
        do
        {
            int i = 1 + (p_1037_1_ << 1);
            int j = i + 1;
            if(i >= field_1555_b)
            {
                break;
            }
            PathPoint pathpoint1 = field_1556_a[i];
            float f1 = pathpoint1.field_1711_h;
            PathPoint pathpoint2;
            float f2;
            if(j >= field_1555_b)
            {
                pathpoint2 = null;
                f2 = (1.0F / 0.0F);
            } else
            {
                pathpoint2 = field_1556_a[j];
                f2 = pathpoint2.field_1711_h;
            }
            if(f1 < f2)
            {
                if(f1 >= f)
                {
                    break;
                }
                field_1556_a[p_1037_1_] = pathpoint1;
                pathpoint1.field_1714_e = p_1037_1_;
                p_1037_1_ = i;
                continue;
            }
            if(f2 >= f)
            {
                break;
            }
            field_1556_a[p_1037_1_] = pathpoint2;
            pathpoint2.field_1714_e = p_1037_1_;
            p_1037_1_ = j;
        } while(true);
        field_1556_a[p_1037_1_] = pathpoint;
        pathpoint.field_1714_e = p_1037_1_;
    }

    public boolean func_1039_c()
    {
        return field_1555_b == 0;
    }
}
