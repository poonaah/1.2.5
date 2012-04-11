// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet14BlockDig extends Packet
{

    public int field_542_a;
    public int field_541_b;
    public int field_545_c;
    public int field_544_d;
    public int field_543_e;

    public Packet14BlockDig()
    {
    }

    public Packet14BlockDig(int p_i352_1_, int p_i352_2_, int p_i352_3_, int p_i352_4_, int p_i352_5_)
    {
        field_543_e = p_i352_1_;
        field_542_a = p_i352_2_;
        field_541_b = p_i352_3_;
        field_545_c = p_i352_4_;
        field_544_d = p_i352_5_;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_543_e = p_327_1_.read();
        field_542_a = p_327_1_.readInt();
        field_541_b = p_327_1_.read();
        field_545_c = p_327_1_.readInt();
        field_544_d = p_327_1_.read();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.write(field_543_e);
        p_322_1_.writeInt(field_542_a);
        p_322_1_.write(field_541_b);
        p_322_1_.writeInt(field_545_c);
        p_322_1_.write(field_544_d);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_821_a(this);
    }

    public int func_329_a()
    {
        return 11;
    }
}
