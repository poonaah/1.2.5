// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package net.minecraft.src:
//            IntHashMapEntry

public class IntHashMap
{

    private transient IntHashMapEntry field_1590_a[];
    private transient int field_1589_b;
    private int field_1593_c;
    private final float field_1592_d = 0.75F;
    private volatile transient int field_1591_e;
    private Set field_35861_f;

    public IntHashMap()
    {
        field_35861_f = new HashSet();
        field_1593_c = 12;
        field_1590_a = new IntHashMapEntry[16];
    }

    private static int func_1055_e(int p_1055_0_)
    {
        p_1055_0_ ^= p_1055_0_ >>> 20 ^ p_1055_0_ >>> 12;
        return p_1055_0_ ^ p_1055_0_ >>> 7 ^ p_1055_0_ >>> 4;
    }

    private static int func_1062_a(int p_1062_0_, int p_1062_1_)
    {
        return p_1062_0_ & p_1062_1_ - 1;
    }

    public Object func_1057_a(int p_1057_1_)
    {
        int i = func_1055_e(p_1057_1_);
        for(IntHashMapEntry inthashmapentry = field_1590_a[func_1062_a(i, field_1590_a.length)]; inthashmapentry != null; inthashmapentry = inthashmapentry.field_1108_c)
        {
            if(inthashmapentry.field_1106_a == p_1057_1_)
            {
                return inthashmapentry.field_1105_b;
            }
        }

        return null;
    }

    public boolean func_35858_b(int p_35858_1_)
    {
        return func_35859_c(p_35858_1_) != null;
    }

    final IntHashMapEntry func_35859_c(int p_35859_1_)
    {
        int i = func_1055_e(p_35859_1_);
        for(IntHashMapEntry inthashmapentry = field_1590_a[func_1062_a(i, field_1590_a.length)]; inthashmapentry != null; inthashmapentry = inthashmapentry.field_1108_c)
        {
            if(inthashmapentry.field_1106_a == p_35859_1_)
            {
                return inthashmapentry;
            }
        }

        return null;
    }

    public void func_1061_a(int p_1061_1_, Object p_1061_2_)
    {
        field_35861_f.add(Integer.valueOf(p_1061_1_));
        int i = func_1055_e(p_1061_1_);
        int j = func_1062_a(i, field_1590_a.length);
        for(IntHashMapEntry inthashmapentry = field_1590_a[j]; inthashmapentry != null; inthashmapentry = inthashmapentry.field_1108_c)
        {
            if(inthashmapentry.field_1106_a == p_1061_1_)
            {
                inthashmapentry.field_1105_b = p_1061_2_;
            }
        }

        field_1591_e++;
        func_1053_a(i, p_1061_1_, p_1061_2_, j);
    }

    private void func_1060_f(int p_1060_1_)
    {
        IntHashMapEntry ainthashmapentry[] = field_1590_a;
        int i = ainthashmapentry.length;
        if(i == 0x40000000)
        {
            field_1593_c = 0x7fffffff;
            return;
        } else
        {
            IntHashMapEntry ainthashmapentry1[] = new IntHashMapEntry[p_1060_1_];
            func_1059_a(ainthashmapentry1);
            field_1590_a = ainthashmapentry1;
            field_1593_c = (int)((float)p_1060_1_ * field_1592_d);
            return;
        }
    }

    private void func_1059_a(IntHashMapEntry p_1059_1_[])
    {
        IntHashMapEntry ainthashmapentry[] = field_1590_a;
        int i = p_1059_1_.length;
        for(int j = 0; j < ainthashmapentry.length; j++)
        {
            IntHashMapEntry inthashmapentry = ainthashmapentry[j];
            if(inthashmapentry == null)
            {
                continue;
            }
            ainthashmapentry[j] = null;
            do
            {
                IntHashMapEntry inthashmapentry1 = inthashmapentry.field_1108_c;
                int k = func_1062_a(inthashmapentry.field_1107_d, i);
                inthashmapentry.field_1108_c = p_1059_1_[k];
                p_1059_1_[k] = inthashmapentry;
                inthashmapentry = inthashmapentry1;
            } while(inthashmapentry != null);
        }

    }

    public Object func_1052_b(int p_1052_1_)
    {
        field_35861_f.remove(Integer.valueOf(p_1052_1_));
        IntHashMapEntry inthashmapentry = func_1054_c(p_1052_1_);
        return inthashmapentry != null ? inthashmapentry.field_1105_b : null;
    }

    final IntHashMapEntry func_1054_c(int p_1054_1_)
    {
        int i = func_1055_e(p_1054_1_);
        int j = func_1062_a(i, field_1590_a.length);
        IntHashMapEntry inthashmapentry = field_1590_a[j];
        IntHashMapEntry inthashmapentry1;
        IntHashMapEntry inthashmapentry2;
        for(inthashmapentry1 = inthashmapentry; inthashmapentry1 != null; inthashmapentry1 = inthashmapentry2)
        {
            inthashmapentry2 = inthashmapentry1.field_1108_c;
            if(inthashmapentry1.field_1106_a == p_1054_1_)
            {
                field_1591_e++;
                field_1589_b--;
                if(inthashmapentry == inthashmapentry1)
                {
                    field_1590_a[j] = inthashmapentry2;
                } else
                {
                    inthashmapentry.field_1108_c = inthashmapentry2;
                }
                return inthashmapentry1;
            }
            inthashmapentry = inthashmapentry1;
        }

        return inthashmapentry1;
    }

    public void func_1058_a()
    {
        field_1591_e++;
        IntHashMapEntry ainthashmapentry[] = field_1590_a;
        for(int i = 0; i < ainthashmapentry.length; i++)
        {
            ainthashmapentry[i] = null;
        }

        field_1589_b = 0;
    }

    private void func_1053_a(int p_1053_1_, int p_1053_2_, Object p_1053_3_, int p_1053_4_)
    {
        IntHashMapEntry inthashmapentry = field_1590_a[p_1053_4_];
        field_1590_a[p_1053_4_] = new IntHashMapEntry(p_1053_1_, p_1053_2_, p_1053_3_, inthashmapentry);
        if(field_1589_b++ >= field_1593_c)
        {
            func_1060_f(2 * field_1590_a.length);
        }
    }

    public Set func_35860_b()
    {
        return field_35861_f;
    }

    static int func_1056_d(int p_1056_0_)
    {
        return func_1055_e(p_1056_0_);
    }
}
