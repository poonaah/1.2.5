// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet7UseEntity extends Packet
{

    public int field_9277_a;
    public int field_9276_b;
    public int field_9278_c;

    public Packet7UseEntity()
    {
    }

    public Packet7UseEntity(int p_i1_1_, int p_i1_2_, int p_i1_3_)
    {
        field_9277_a = p_i1_1_;
        field_9276_b = p_i1_2_;
        field_9278_c = p_i1_3_;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_9277_a = p_327_1_.readInt();
        field_9276_b = p_327_1_.readInt();
        field_9278_c = p_327_1_.readByte();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_9277_a);
        p_322_1_.writeInt(field_9276_b);
        p_322_1_.writeByte(field_9278_c);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_6499_a(this);
    }

    public int func_329_a()
    {
        return 9;
    }
}
