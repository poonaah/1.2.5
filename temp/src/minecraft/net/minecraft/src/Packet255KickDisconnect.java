// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet255KickDisconnect extends Packet
{

    public String field_582_a;

    public Packet255KickDisconnect()
    {
    }

    public Packet255KickDisconnect(String p_i218_1_)
    {
        field_582_a = p_i218_1_;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_582_a = func_27048_a(p_327_1_, 256);
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        func_27049_a(field_582_a, p_322_1_);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_844_a(this);
    }

    public int func_329_a()
    {
        return field_582_a.length();
    }
}
