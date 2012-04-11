// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet5PlayerInventory extends Packet
{

    public int field_571_a;
    public int field_21056_b;
    public int field_570_b;
    public int field_20044_c;

    public Packet5PlayerInventory()
    {
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_571_a = p_327_1_.readInt();
        field_21056_b = p_327_1_.readShort();
        field_570_b = p_327_1_.readShort();
        field_20044_c = p_327_1_.readShort();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_571_a);
        p_322_1_.writeShort(field_21056_b);
        p_322_1_.writeShort(field_570_b);
        p_322_1_.writeShort(field_20044_c);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_843_a(this);
    }

    public int func_329_a()
    {
        return 8;
    }
}
