// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet61DoorChange extends Packet
{

    public int field_28050_a;
    public int field_28049_b;
    public int field_28053_c;
    public int field_28052_d;
    public int field_28051_e;

    public Packet61DoorChange()
    {
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_28050_a = p_327_1_.readInt();
        field_28053_c = p_327_1_.readInt();
        field_28052_d = p_327_1_.readByte() & 0xff;
        field_28051_e = p_327_1_.readInt();
        field_28049_b = p_327_1_.readInt();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_28050_a);
        p_322_1_.writeInt(field_28053_c);
        p_322_1_.writeByte(field_28052_d & 0xff);
        p_322_1_.writeInt(field_28051_e);
        p_322_1_.writeInt(field_28049_b);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_28115_a(this);
    }

    public int func_329_a()
    {
        return 20;
    }
}
