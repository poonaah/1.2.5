// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IntHashMap

class IntHashMapEntry
{

    final int field_1106_a;
    Object field_1105_b;
    IntHashMapEntry field_1108_c;
    final int field_1107_d;

    IntHashMapEntry(int p_i560_1_, int p_i560_2_, Object p_i560_3_, IntHashMapEntry p_i560_4_)
    {
        field_1105_b = p_i560_3_;
        field_1108_c = p_i560_4_;
        field_1106_a = p_i560_2_;
        field_1107_d = p_i560_1_;
    }

    public final int func_768_a()
    {
        return field_1106_a;
    }

    public final Object func_767_b()
    {
        return field_1105_b;
    }

    public final boolean equals(Object p_equals_1_)
    {
        if(!(p_equals_1_ instanceof IntHashMapEntry))
        {
            return false;
        }
        IntHashMapEntry inthashmapentry = (IntHashMapEntry)p_equals_1_;
        Integer integer = Integer.valueOf(func_768_a());
        Integer integer1 = Integer.valueOf(inthashmapentry.func_768_a());
        if(integer == integer1 || integer != null && integer.equals(integer1))
        {
            Object obj = func_767_b();
            Object obj1 = inthashmapentry.func_767_b();
            if(obj == obj1 || obj != null && obj.equals(obj1))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return IntHashMap.func_1056_d(field_1106_a);
    }

    public final String toString()
    {
        return (new StringBuilder()).append(func_768_a()).append("=").append(func_767_b()).toString();
    }
}
