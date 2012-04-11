// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet8UpdateHealth extends Packet
{

    public int field_9275_a;
    public int field_35231_b;
    public float field_35232_c;

    public Packet8UpdateHealth()
    {
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_9275_a = p_327_1_.readShort();
        field_35231_b = p_327_1_.readShort();
        field_35232_c = p_327_1_.readFloat();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeShort(field_9275_a);
        p_322_1_.writeShort(field_35231_b);
        p_322_1_.writeFloat(field_35232_c);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_9446_a(this);
    }

    public int func_329_a()
    {
        return 8;
    }
}
