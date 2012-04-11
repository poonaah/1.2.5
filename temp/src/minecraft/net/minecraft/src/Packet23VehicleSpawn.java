// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet23VehicleSpawn extends Packet
{

    public int field_500_a;
    public int field_499_b;
    public int field_503_c;
    public int field_502_d;
    public int field_28047_e;
    public int field_28046_f;
    public int field_28045_g;
    public int field_501_e;
    public int field_28044_i;

    public Packet23VehicleSpawn()
    {
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_500_a = p_327_1_.readInt();
        field_501_e = p_327_1_.readByte();
        field_499_b = p_327_1_.readInt();
        field_503_c = p_327_1_.readInt();
        field_502_d = p_327_1_.readInt();
        field_28044_i = p_327_1_.readInt();
        if(field_28044_i > 0)
        {
            field_28047_e = p_327_1_.readShort();
            field_28046_f = p_327_1_.readShort();
            field_28045_g = p_327_1_.readShort();
        }
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_500_a);
        p_322_1_.writeByte(field_501_e);
        p_322_1_.writeInt(field_499_b);
        p_322_1_.writeInt(field_503_c);
        p_322_1_.writeInt(field_502_d);
        p_322_1_.writeInt(field_28044_i);
        if(field_28044_i > 0)
        {
            p_322_1_.writeShort(field_28047_e);
            p_322_1_.writeShort(field_28046_f);
            p_322_1_.writeShort(field_28045_g);
        }
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_835_a(this);
    }

    public int func_329_a()
    {
        return 21 + field_28044_i <= 0 ? 0 : 6;
    }
}
