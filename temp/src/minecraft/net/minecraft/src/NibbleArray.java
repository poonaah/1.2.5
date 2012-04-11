// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class NibbleArray
{

    public final byte field_1109_a[];
    private final int field_35754_b;
    private final int field_35755_c;

    public NibbleArray(int p_i558_1_, int p_i558_2_)
    {
        field_1109_a = new byte[p_i558_1_ >> 1];
        field_35754_b = p_i558_2_;
        field_35755_c = p_i558_2_ + 4;
    }

    public NibbleArray(byte p_i559_1_[], int p_i559_2_)
    {
        field_1109_a = p_i559_1_;
        field_35754_b = p_i559_2_;
        field_35755_c = p_i559_2_ + 4;
    }

    public int func_771_a(int p_771_1_, int p_771_2_, int p_771_3_)
    {
        int i = p_771_2_ << field_35755_c | p_771_3_ << field_35754_b | p_771_1_;
        int j = i >> 1;
        int k = i & 1;
        if(k == 0)
        {
            return field_1109_a[j] & 0xf;
        } else
        {
            return field_1109_a[j] >> 4 & 0xf;
        }
    }

    public void func_770_a(int p_770_1_, int p_770_2_, int p_770_3_, int p_770_4_)
    {
        int i = p_770_2_ << field_35755_c | p_770_3_ << field_35754_b | p_770_1_;
        int j = i >> 1;
        int k = i & 1;
        if(k == 0)
        {
            field_1109_a[j] = (byte)(field_1109_a[j] & 0xf0 | p_770_4_ & 0xf);
        } else
        {
            field_1109_a[j] = (byte)(field_1109_a[j] & 0xf | (p_770_4_ & 0xf) << 4);
        }
    }
}
