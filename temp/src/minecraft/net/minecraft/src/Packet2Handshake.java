// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet2Handshake extends Packet
{

    public String field_532_a;

    public Packet2Handshake()
    {
    }

    public Packet2Handshake(String p_i388_1_)
    {
        field_532_a = p_i388_1_;
    }

    public Packet2Handshake(String p_i1047_1_, String p_i1047_2_, int p_i1047_3_)
    {
        field_532_a = (new StringBuilder()).append(p_i1047_1_).append(";").append(p_i1047_2_).append(":").append(p_i1047_3_).toString();
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_532_a = func_27048_a(p_327_1_, 64);
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        func_27049_a(field_532_a, p_322_1_);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_838_a(this);
    }

    public int func_329_a()
    {
        return 4 + field_532_a.length() + 4;
    }
}
