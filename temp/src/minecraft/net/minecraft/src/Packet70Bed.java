// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet70Bed extends Packet
{

    public static final String field_25020_a[] = {
        "tile.bed.notValid", null, null, "gameMode.changed"
    };
    public int field_25019_b;
    public int field_35262_c;

    public Packet70Bed()
    {
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_25019_b = p_327_1_.readByte();
        field_35262_c = p_327_1_.readByte();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeByte(field_25019_b);
        p_322_1_.writeByte(field_35262_c);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_25118_a(this);
    }

    public int func_329_a()
    {
        return 2;
    }

}
