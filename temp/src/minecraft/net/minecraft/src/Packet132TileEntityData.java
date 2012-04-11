// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet132TileEntityData extends Packet
{

    public int field_48167_a;
    public int field_48165_b;
    public int field_48166_c;
    public int field_48163_d;
    public int field_48164_e;
    public int field_48161_f;
    public int field_48162_g;

    public Packet132TileEntityData()
    {
        field_472_j = true;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_48167_a = p_327_1_.readInt();
        field_48165_b = p_327_1_.readShort();
        field_48166_c = p_327_1_.readInt();
        field_48163_d = p_327_1_.readByte();
        field_48164_e = p_327_1_.readInt();
        field_48161_f = p_327_1_.readInt();
        field_48162_g = p_327_1_.readInt();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_48167_a);
        p_322_1_.writeShort(field_48165_b);
        p_322_1_.writeInt(field_48166_c);
        p_322_1_.writeByte((byte)field_48163_d);
        p_322_1_.writeInt(field_48164_e);
        p_322_1_.writeInt(field_48161_f);
        p_322_1_.writeInt(field_48162_g);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_48489_a(this);
    }

    public int func_329_a()
    {
        return 25;
    }
}
