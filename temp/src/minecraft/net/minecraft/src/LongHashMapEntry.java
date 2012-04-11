// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            LongHashMap

class LongHashMapEntry
{

    final long field_35834_a;
    Object field_35832_b;
    LongHashMapEntry field_35833_c;
    final int field_35831_d;

    LongHashMapEntry(int p_i452_1_, long p_i452_2_, Object p_i452_4_, LongHashMapEntry p_i452_5_)
    {
        field_35832_b = p_i452_4_;
        field_35833_c = p_i452_5_;
        field_35834_a = p_i452_2_;
        field_35831_d = p_i452_1_;
    }

    public final long func_35830_a()
    {
        return field_35834_a;
    }

    public final Object func_35829_b()
    {
        return field_35832_b;
    }

    public final boolean equals(Object p_equals_1_)
    {
        if(!(p_equals_1_ instanceof LongHashMapEntry))
        {
            return false;
        }
        LongHashMapEntry longhashmapentry = (LongHashMapEntry)p_equals_1_;
        Long long1 = Long.valueOf(func_35830_a());
        Long long2 = Long.valueOf(longhashmapentry.func_35830_a());
        if(long1 == long2 || long1 != null && long1.equals(long2))
        {
            Object obj = func_35829_b();
            Object obj1 = longhashmapentry.func_35829_b();
            if(obj == obj1 || obj != null && obj.equals(obj1))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return LongHashMap.func_35566_f(field_35834_a);
    }

    public final String toString()
    {
        return (new StringBuilder()).append(func_35830_a()).append("=").append(func_35829_b()).toString();
    }
}
