// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet30Entity extends Packet
{

    public int field_485_a;
    public byte field_484_b;
    public byte field_490_c;
    public byte field_489_d;
    public byte field_488_e;
    public byte field_487_f;
    public boolean field_486_g;

    public Packet30Entity()
    {
        field_486_g = false;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_485_a = p_327_1_.readInt();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_485_a);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_827_a(this);
    }

    public int func_329_a()
    {
        return 4;
    }
}
