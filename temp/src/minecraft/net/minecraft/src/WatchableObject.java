// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class WatchableObject
{

    private final int field_21164_a;
    private final int field_21163_b;
    private Object field_21166_c;
    private boolean field_21165_d;

    public WatchableObject(int p_i27_1_, int p_i27_2_, Object p_i27_3_)
    {
        field_21163_b = p_i27_2_;
        field_21166_c = p_i27_3_;
        field_21164_a = p_i27_1_;
        field_21165_d = true;
    }

    public int func_21161_a()
    {
        return field_21163_b;
    }

    public void func_21160_a(Object p_21160_1_)
    {
        field_21166_c = p_21160_1_;
    }

    public Object func_21158_b()
    {
        return field_21166_c;
    }

    public int func_21159_c()
    {
        return field_21164_a;
    }

    public void func_21162_a(boolean p_21162_1_)
    {
        field_21165_d = p_21162_1_;
    }
}
