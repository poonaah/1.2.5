// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class VillageDoorInfo
{

    public final int field_48600_a;
    public final int field_48598_b;
    public final int field_48599_c;
    public final int field_48596_d;
    public final int field_48597_e;
    public int field_48594_f;
    public boolean field_48595_g;
    private int field_48601_h;

    public VillageDoorInfo(int p_i1004_1_, int p_i1004_2_, int p_i1004_3_, int p_i1004_4_, int p_i1004_5_, int p_i1004_6_)
    {
        field_48595_g = false;
        field_48601_h = 0;
        field_48600_a = p_i1004_1_;
        field_48598_b = p_i1004_2_;
        field_48599_c = p_i1004_3_;
        field_48596_d = p_i1004_4_;
        field_48597_e = p_i1004_5_;
        field_48594_f = p_i1004_6_;
    }

    public int func_48588_a(int p_48588_1_, int p_48588_2_, int p_48588_3_)
    {
        int i = p_48588_1_ - field_48600_a;
        int j = p_48588_2_ - field_48598_b;
        int k = p_48588_3_ - field_48599_c;
        return i * i + j * j + k * k;
    }

    public int func_48593_b(int p_48593_1_, int p_48593_2_, int p_48593_3_)
    {
        int i = p_48593_1_ - field_48600_a - field_48596_d;
        int j = p_48593_2_ - field_48598_b;
        int k = p_48593_3_ - field_48599_c - field_48597_e;
        return i * i + j * j + k * k;
    }

    public int func_48590_a()
    {
        return field_48600_a + field_48596_d;
    }

    public int func_48592_b()
    {
        return field_48598_b;
    }

    public int func_48591_c()
    {
        return field_48599_c + field_48597_e;
    }

    public boolean func_48586_a(int p_48586_1_, int p_48586_2_)
    {
        int i = p_48586_1_ - field_48600_a;
        int j = p_48586_2_ - field_48599_c;
        return i * field_48596_d + j * field_48597_e >= 0;
    }

    public void func_48585_d()
    {
        field_48601_h = 0;
    }

    public void func_48589_e()
    {
        field_48601_h++;
    }

    public int func_48587_f()
    {
        return field_48601_h;
    }
}
