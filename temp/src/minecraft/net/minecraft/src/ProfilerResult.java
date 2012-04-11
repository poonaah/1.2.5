// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public final class ProfilerResult
    implements Comparable
{

    public double field_40704_a;
    public double field_40702_b;
    public String field_40703_c;

    public ProfilerResult(String p_i736_1_, double p_i736_2_, double p_i736_4_)
    {
        field_40703_c = p_i736_1_;
        field_40704_a = p_i736_2_;
        field_40702_b = p_i736_4_;
    }

    public int func_40701_a(ProfilerResult p_40701_1_)
    {
        if(p_40701_1_.field_40704_a < field_40704_a)
        {
            return -1;
        }
        if(p_40701_1_.field_40704_a > field_40704_a)
        {
            return 1;
        } else
        {
            return p_40701_1_.field_40703_c.compareTo(field_40703_c);
        }
    }

    public int func_40700_a()
    {
        return (field_40703_c.hashCode() & 0xaaaaaa) + 0x444444;
    }

    public int compareTo(Object p_compareTo_1_)
    {
        return func_40701_a((ProfilerResult)p_compareTo_1_);
    }
}
