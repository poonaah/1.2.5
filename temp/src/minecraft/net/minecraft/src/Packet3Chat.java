// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet3Chat extends Packet
{

    public static int field_52010_b = 119;
    public String field_517_a;

    public Packet3Chat()
    {
    }

    public Packet3Chat(String p_i81_1_)
    {
        if(p_i81_1_.length() > field_52010_b)
        {
            p_i81_1_ = p_i81_1_.substring(0, field_52010_b);
        }
        field_517_a = p_i81_1_;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_517_a = func_27048_a(p_327_1_, field_52010_b);
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        func_27049_a(field_517_a, p_322_1_);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_4113_a(this);
    }

    public int func_329_a()
    {
        return 2 + field_517_a.length() * 2;
    }

}
