// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet53BlockChange extends Packet
{

    public int field_492_a;
    public int field_491_b;
    public int field_495_c;
    public int field_494_d;
    public int field_493_e;

    public Packet53BlockChange()
    {
        field_472_j = true;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_492_a = p_327_1_.readInt();
        field_491_b = p_327_1_.read();
        field_495_c = p_327_1_.readInt();
        field_494_d = p_327_1_.read();
        field_493_e = p_327_1_.read();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_492_a);
        p_322_1_.write(field_491_b);
        p_322_1_.writeInt(field_495_c);
        p_322_1_.write(field_494_d);
        p_322_1_.write(field_493_e);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_822_a(this);
    }

    public int func_329_a()
    {
        return 11;
    }
}
