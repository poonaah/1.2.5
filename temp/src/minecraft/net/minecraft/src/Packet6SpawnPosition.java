// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet6SpawnPosition extends Packet
{

    public int field_515_a;
    public int field_514_b;
    public int field_516_c;

    public Packet6SpawnPosition()
    {
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_515_a = p_327_1_.readInt();
        field_514_b = p_327_1_.readInt();
        field_516_c = p_327_1_.readInt();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_515_a);
        p_322_1_.writeInt(field_514_b);
        p_322_1_.writeInt(field_516_c);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_845_a(this);
    }

    public int func_329_a()
    {
        return 12;
    }
}
