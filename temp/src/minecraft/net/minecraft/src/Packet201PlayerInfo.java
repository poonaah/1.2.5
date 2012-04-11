// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet201PlayerInfo extends Packet
{

    public String field_35257_a;
    public boolean field_35255_b;
    public int field_35256_c;

    public Packet201PlayerInfo()
    {
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_35257_a = func_27048_a(p_327_1_, 16);
        field_35255_b = p_327_1_.readByte() != 0;
        field_35256_c = p_327_1_.readShort();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        func_27049_a(field_35257_a, p_322_1_);
        p_322_1_.writeByte(field_35255_b ? 1 : 0);
        p_322_1_.writeShort(field_35256_c);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_35779_a(this);
    }

    public int func_329_a()
    {
        return field_35257_a.length() + 2 + 1 + 2;
    }
}
