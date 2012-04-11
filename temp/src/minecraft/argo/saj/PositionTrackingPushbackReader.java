// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package argo.saj;

import java.io.*;

// Referenced classes of package argo.saj:
//            ThingWithPosition

final class PositionTrackingPushbackReader
    implements ThingWithPosition
{

    private final PushbackReader field_27338_a;
    private int field_27337_b;
    private int field_27340_c;
    private boolean field_27339_d;

    public PositionTrackingPushbackReader(Reader p_i7_1_)
    {
        field_27337_b = 0;
        field_27340_c = 1;
        field_27339_d = false;
        field_27338_a = new PushbackReader(p_i7_1_);
    }

    public void func_27334_a(char p_27334_1_)
        throws IOException
    {
        field_27337_b--;
        if(field_27337_b < 0)
        {
            field_27337_b = 0;
        }
        field_27338_a.unread(p_27334_1_);
    }

    public void func_27335_a(char p_27335_1_[])
    {
        field_27337_b = field_27337_b - p_27335_1_.length;
        if(field_27337_b < 0)
        {
            field_27337_b = 0;
        }
    }

    public int func_27333_c()
        throws IOException
    {
        int i = field_27338_a.read();
        func_27332_a(i);
        return i;
    }

    public int func_27336_b(char p_27336_1_[])
        throws IOException
    {
        int i = field_27338_a.read(p_27336_1_);
        char ac[] = p_27336_1_;
        int j = ac.length;
        for(int k = 0; k < j; k++)
        {
            char c = ac[k];
            func_27332_a(c);
        }

        return i;
    }

    private void func_27332_a(int p_27332_1_)
    {
        if(13 == p_27332_1_)
        {
            field_27337_b = 0;
            field_27340_c++;
            field_27339_d = true;
        } else
        {
            if(10 == p_27332_1_ && !field_27339_d)
            {
                field_27337_b = 0;
                field_27340_c++;
            } else
            {
                field_27337_b++;
            }
            field_27339_d = false;
        }
    }

    public int func_27331_a()
    {
        return field_27337_b;
    }

    public int func_27330_b()
    {
        return field_27340_c;
    }
}
