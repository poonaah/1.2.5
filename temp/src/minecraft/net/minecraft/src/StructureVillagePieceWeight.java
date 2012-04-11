// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class StructureVillagePieceWeight
{

    public Class field_35607_a;
    public final int field_35605_b;
    public int field_35606_c;
    public int field_35604_d;

    public StructureVillagePieceWeight(Class p_i289_1_, int p_i289_2_, int p_i289_3_)
    {
        field_35607_a = p_i289_1_;
        field_35605_b = p_i289_2_;
        field_35604_d = p_i289_3_;
    }

    public boolean func_35602_a(int p_35602_1_)
    {
        return field_35604_d == 0 || field_35606_c < field_35604_d;
    }

    public boolean func_35603_a()
    {
        return field_35604_d == 0 || field_35606_c < field_35604_d;
    }
}
