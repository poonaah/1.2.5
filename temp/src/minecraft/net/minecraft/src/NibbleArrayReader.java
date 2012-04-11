// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class NibbleArrayReader
{

    public final byte field_48511_a[];
    private final int field_48509_b;
    private final int field_48510_c;

    public NibbleArrayReader(byte p_i1058_1_[], int p_i1058_2_)
    {
        field_48511_a = p_i1058_1_;
        field_48509_b = p_i1058_2_;
        field_48510_c = p_i1058_2_ + 4;
    }

    public int func_48508_a(int p_48508_1_, int p_48508_2_, int p_48508_3_)
    {
        int i = p_48508_1_ << field_48510_c | p_48508_3_ << field_48509_b | p_48508_2_;
        int j = i >> 1;
        int k = i & 1;
        if(k == 0)
        {
            return field_48511_a[j] & 0xf;
        } else
        {
            return field_48511_a[j] >> 4 & 0xf;
        }
    }
}
