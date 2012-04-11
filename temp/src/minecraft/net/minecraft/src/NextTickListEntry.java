// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class NextTickListEntry
    implements Comparable
{

    private static long field_1363_f = 0L;
    public int field_1361_a;
    public int field_1360_b;
    public int field_1366_c;
    public int field_1365_d;
    public long field_1364_e;
    private long field_1362_g;

    public NextTickListEntry(int p_i458_1_, int p_i458_2_, int p_i458_3_, int p_i458_4_)
    {
        field_1362_g = field_1363_f++;
        field_1361_a = p_i458_1_;
        field_1360_b = p_i458_2_;
        field_1366_c = p_i458_3_;
        field_1365_d = p_i458_4_;
    }

    public boolean equals(Object p_equals_1_)
    {
        if(p_equals_1_ instanceof NextTickListEntry)
        {
            NextTickListEntry nextticklistentry = (NextTickListEntry)p_equals_1_;
            return field_1361_a == nextticklistentry.field_1361_a && field_1360_b == nextticklistentry.field_1360_b && field_1366_c == nextticklistentry.field_1366_c && field_1365_d == nextticklistentry.field_1365_d;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return (field_1361_a * 1024 * 1024 + field_1366_c * 1024 + field_1360_b) * 256 + field_1365_d;
    }

    public NextTickListEntry func_900_a(long p_900_1_)
    {
        field_1364_e = p_900_1_;
        return this;
    }

    public int func_899_a(NextTickListEntry p_899_1_)
    {
        if(field_1364_e < p_899_1_.field_1364_e)
        {
            return -1;
        }
        if(field_1364_e > p_899_1_.field_1364_e)
        {
            return 1;
        }
        if(field_1362_g < p_899_1_.field_1362_g)
        {
            return -1;
        }
        return field_1362_g <= p_899_1_.field_1362_g ? 0 : 1;
    }

    public int compareTo(Object p_compareTo_1_)
    {
        return func_899_a((NextTickListEntry)p_compareTo_1_);
    }

}
