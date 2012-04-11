// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet131MapData extends Packet
{

    public short field_28055_a;
    public short field_28054_b;
    public byte field_28056_c[];

    public Packet131MapData()
    {
        field_472_j = true;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_28055_a = p_327_1_.readShort();
        field_28054_b = p_327_1_.readShort();
        field_28056_c = new byte[p_327_1_.readByte() & 0xff];
        p_327_1_.readFully(field_28056_c);
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeShort(field_28055_a);
        p_322_1_.writeShort(field_28054_b);
        p_322_1_.writeByte(field_28056_c.length);
        p_322_1_.write(field_28056_c);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_28116_a(this);
    }

    public int func_329_a()
    {
        return 4 + field_28056_c.length;
    }
}
