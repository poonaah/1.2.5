// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            LongHashMapEntry

public class LongHashMap
{

    private transient LongHashMapEntry field_35584_a[];
    private transient int field_35582_b;
    private int field_35583_c;
    private final float field_35580_d = 0.75F;
    private volatile transient int field_35581_e;

    public LongHashMap()
    {
        field_35583_c = 12;
        field_35584_a = new LongHashMapEntry[16];
    }

    private static int func_35568_g(long p_35568_0_)
    {
        return func_35571_a((int)(p_35568_0_ ^ p_35568_0_ >>> 32));
    }

    private static int func_35571_a(int p_35571_0_)
    {
        p_35571_0_ ^= p_35571_0_ >>> 20 ^ p_35571_0_ >>> 12;
        return p_35571_0_ ^ p_35571_0_ >>> 7 ^ p_35571_0_ >>> 4;
    }

    private static int func_35573_a(int p_35573_0_, int p_35573_1_)
    {
        return p_35573_0_ & p_35573_1_ - 1;
    }

    public int func_35576_a()
    {
        return field_35582_b;
    }

    public Object func_35578_a(long p_35578_1_)
    {
        int i = func_35568_g(p_35578_1_);
        for(LongHashMapEntry longhashmapentry = field_35584_a[func_35573_a(i, field_35584_a.length)]; longhashmapentry != null; longhashmapentry = longhashmapentry.field_35833_c)
        {
            if(longhashmapentry.field_35834_a == p_35578_1_)
            {
                return longhashmapentry.field_35832_b;
            }
        }

        return null;
    }

    public boolean func_35575_b(long p_35575_1_)
    {
        return func_35569_c(p_35575_1_) != null;
    }

    final LongHashMapEntry func_35569_c(long p_35569_1_)
    {
        int i = func_35568_g(p_35569_1_);
        for(LongHashMapEntry longhashmapentry = field_35584_a[func_35573_a(i, field_35584_a.length)]; longhashmapentry != null; longhashmapentry = longhashmapentry.field_35833_c)
        {
            if(longhashmapentry.field_35834_a == p_35569_1_)
            {
                return longhashmapentry;
            }
        }

        return null;
    }

    public void func_35577_a(long p_35577_1_, Object p_35577_3_)
    {
        int i = func_35568_g(p_35577_1_);
        int j = func_35573_a(i, field_35584_a.length);
        for(LongHashMapEntry longhashmapentry = field_35584_a[j]; longhashmapentry != null; longhashmapentry = longhashmapentry.field_35833_c)
        {
            if(longhashmapentry.field_35834_a == p_35577_1_)
            {
                longhashmapentry.field_35832_b = p_35577_3_;
            }
        }

        field_35581_e++;
        func_35570_a(i, p_35577_1_, p_35577_3_, j);
    }

    private void func_35567_b(int p_35567_1_)
    {
        LongHashMapEntry alonghashmapentry[] = field_35584_a;
        int i = alonghashmapentry.length;
        if(i == 0x40000000)
        {
            field_35583_c = 0x7fffffff;
            return;
        } else
        {
            LongHashMapEntry alonghashmapentry1[] = new LongHashMapEntry[p_35567_1_];
            func_35579_a(alonghashmapentry1);
            field_35584_a = alonghashmapentry1;
            field_35583_c = (int)((float)p_35567_1_ * field_35580_d);
            return;
        }
    }

    private void func_35579_a(LongHashMapEntry p_35579_1_[])
    {
        LongHashMapEntry alonghashmapentry[] = field_35584_a;
        int i = p_35579_1_.length;
        for(int j = 0; j < alonghashmapentry.length; j++)
        {
            LongHashMapEntry longhashmapentry = alonghashmapentry[j];
            if(longhashmapentry == null)
            {
                continue;
            }
            alonghashmapentry[j] = null;
            do
            {
                LongHashMapEntry longhashmapentry1 = longhashmapentry.field_35833_c;
                int k = func_35573_a(longhashmapentry.field_35831_d, i);
                longhashmapentry.field_35833_c = p_35579_1_[k];
                p_35579_1_[k] = longhashmapentry;
                longhashmapentry = longhashmapentry1;
            } while(longhashmapentry != null);
        }

    }

    public Object func_35574_d(long p_35574_1_)
    {
        LongHashMapEntry longhashmapentry = func_35572_e(p_35574_1_);
        return longhashmapentry != null ? longhashmapentry.field_35832_b : null;
    }

    final LongHashMapEntry func_35572_e(long p_35572_1_)
    {
        int i = func_35568_g(p_35572_1_);
        int j = func_35573_a(i, field_35584_a.length);
        LongHashMapEntry longhashmapentry = field_35584_a[j];
        LongHashMapEntry longhashmapentry1;
        LongHashMapEntry longhashmapentry2;
        for(longhashmapentry1 = longhashmapentry; longhashmapentry1 != null; longhashmapentry1 = longhashmapentry2)
        {
            longhashmapentry2 = longhashmapentry1.field_35833_c;
            if(longhashmapentry1.field_35834_a == p_35572_1_)
            {
                field_35581_e++;
                field_35582_b--;
                if(longhashmapentry == longhashmapentry1)
                {
                    field_35584_a[j] = longhashmapentry2;
                } else
                {
                    longhashmapentry.field_35833_c = longhashmapentry2;
                }
                return longhashmapentry1;
            }
            longhashmapentry = longhashmapentry1;
        }

        return longhashmapentry1;
    }

    private void func_35570_a(int p_35570_1_, long p_35570_2_, Object p_35570_4_, int p_35570_5_)
    {
        LongHashMapEntry longhashmapentry = field_35584_a[p_35570_5_];
        field_35584_a[p_35570_5_] = new LongHashMapEntry(p_35570_1_, p_35570_2_, p_35570_4_, longhashmapentry);
        if(field_35582_b++ >= field_35583_c)
        {
            func_35567_b(2 * field_35584_a.length);
        }
    }

    static int func_35566_f(long p_35566_0_)
    {
        return func_35568_g(p_35566_0_);
    }
}
