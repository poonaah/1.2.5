// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet50PreChunk extends Packet
{

    public int field_505_a;
    public int field_504_b;
    public boolean field_506_c;

    public Packet50PreChunk()
    {
        field_472_j = false;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_505_a = p_327_1_.readInt();
        field_504_b = p_327_1_.readInt();
        field_506_c = p_327_1_.read() != 0;
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_505_a);
        p_322_1_.writeInt(field_504_b);
        p_322_1_.write(field_506_c ? 1 : 0);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_826_a(this);
    }

    public int func_329_a()
    {
        return 9;
    }
}
