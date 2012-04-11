// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet43Experience extends Packet
{

    public float field_35230_a;
    public int field_35228_b;
    public int field_35229_c;

    public Packet43Experience()
    {
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_35230_a = p_327_1_.readFloat();
        field_35229_c = p_327_1_.readShort();
        field_35228_b = p_327_1_.readShort();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeFloat(field_35230_a);
        p_322_1_.writeShort(field_35229_c);
        p_322_1_.writeShort(field_35228_b);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_35777_a(this);
    }

    public int func_329_a()
    {
        return 4;
    }
}
