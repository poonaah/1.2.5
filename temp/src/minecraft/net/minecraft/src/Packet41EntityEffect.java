// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet41EntityEffect extends Packet
{

    public int field_35261_a;
    public byte field_35259_b;
    public byte field_35260_c;
    public short field_35258_d;

    public Packet41EntityEffect()
    {
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_35261_a = p_327_1_.readInt();
        field_35259_b = p_327_1_.readByte();
        field_35260_c = p_327_1_.readByte();
        field_35258_d = p_327_1_.readShort();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_35261_a);
        p_322_1_.writeByte(field_35259_b);
        p_322_1_.writeByte(field_35260_c);
        p_322_1_.writeShort(field_35258_d);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_35780_a(this);
    }

    public int func_329_a()
    {
        return 8;
    }
}
