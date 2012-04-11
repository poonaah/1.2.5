// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet105UpdateProgressbar extends Packet
{

    public int field_20032_a;
    public int field_20031_b;
    public int field_20033_c;

    public Packet105UpdateProgressbar()
    {
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_20090_a(this);
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_20032_a = p_327_1_.readByte();
        field_20031_b = p_327_1_.readShort();
        field_20033_c = p_327_1_.readShort();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeByte(field_20032_a);
        p_322_1_.writeShort(field_20031_b);
        p_322_1_.writeShort(field_20033_c);
    }

    public int func_329_a()
    {
        return 5;
    }
}
