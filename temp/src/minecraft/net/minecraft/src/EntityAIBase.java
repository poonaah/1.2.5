// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public abstract class EntityAIBase
{

    private int field_46085_a;

    public EntityAIBase()
    {
        field_46085_a = 0;
    }

    public abstract boolean func_46082_a();

    public boolean func_46084_g()
    {
        return func_46082_a();
    }

    public boolean func_46078_f()
    {
        return true;
    }

    public void func_46080_e()
    {
    }

    public void func_46077_d()
    {
    }

    public void func_46081_b()
    {
    }

    public void func_46079_a(int p_46079_1_)
    {
        field_46085_a = p_46079_1_;
    }

    public int func_46083_c()
    {
        return field_46085_a;
    }
}
