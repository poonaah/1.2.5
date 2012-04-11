// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet100OpenWindow extends Packet
{

    public int field_20038_a;
    public int field_20037_b;
    public String field_20040_c;
    public int field_20039_d;

    public Packet100OpenWindow()
    {
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_20087_a(this);
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_20038_a = p_327_1_.readByte() & 0xff;
        field_20037_b = p_327_1_.readByte() & 0xff;
        field_20040_c = func_27048_a(p_327_1_, 32);
        field_20039_d = p_327_1_.readByte() & 0xff;
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeByte(field_20038_a & 0xff);
        p_322_1_.writeByte(field_20037_b & 0xff);
        func_27049_a(field_20040_c, p_322_1_);
        p_322_1_.writeByte(field_20039_d & 0xff);
    }

    public int func_329_a()
    {
        return 3 + field_20040_c.length();
    }
}
