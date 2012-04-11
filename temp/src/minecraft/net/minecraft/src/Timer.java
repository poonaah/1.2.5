// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class Timer
{

    float field_1380_a;
    private double field_1375_f;
    public int field_1379_b;
    public float field_1378_c;
    public float field_1377_d;
    public float field_1376_e;
    private long field_1374_g;
    private long field_1373_h;
    private long field_28132_i;
    private double field_1372_i;

    public Timer(float p_i90_1_)
    {
        field_1377_d = 1.0F;
        field_1376_e = 0.0F;
        field_1372_i = 1.0D;
        field_1380_a = p_i90_1_;
        field_1374_g = System.currentTimeMillis();
        field_1373_h = System.nanoTime() / 0xf4240L;
    }

    public void func_904_a()
    {
        long l = System.currentTimeMillis();
        long l1 = l - field_1374_g;
        long l2 = System.nanoTime() / 0xf4240L;
        double d = (double)l2 / 1000D;
        if(l1 > 1000L)
        {
            field_1375_f = d;
        } else
        if(l1 < 0L)
        {
            field_1375_f = d;
        } else
        {
            field_28132_i += l1;
            if(field_28132_i > 1000L)
            {
                long l3 = l2 - field_1373_h;
                double d2 = (double)field_28132_i / (double)l3;
                field_1372_i += (d2 - field_1372_i) * 0.20000000298023224D;
                field_1373_h = l2;
                field_28132_i = 0L;
            }
            if(field_28132_i < 0L)
            {
                field_1373_h = l2;
            }
        }
        field_1374_g = l;
        double d1 = (d - field_1375_f) * field_1372_i;
        field_1375_f = d;
        if(d1 < 0.0D)
        {
            d1 = 0.0D;
        }
        if(d1 > 1.0D)
        {
            d1 = 1.0D;
        }
        field_1376_e += d1 * (double)field_1377_d * (double)field_1380_a;
        field_1379_b = (int)field_1376_e;
        field_1376_e -= field_1379_b;
        if(field_1379_b > 10)
        {
            field_1379_b = 10;
        }
        field_1378_c = field_1376_e;
    }
}
