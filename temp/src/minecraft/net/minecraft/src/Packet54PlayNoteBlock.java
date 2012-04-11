// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet54PlayNoteBlock extends Packet
{

    public int field_21037_a;
    public int field_21036_b;
    public int field_21040_c;
    public int field_21039_d;
    public int field_21038_e;

    public Packet54PlayNoteBlock()
    {
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_21037_a = p_327_1_.readInt();
        field_21036_b = p_327_1_.readShort();
        field_21040_c = p_327_1_.readInt();
        field_21039_d = p_327_1_.read();
        field_21038_e = p_327_1_.read();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_21037_a);
        p_322_1_.writeShort(field_21036_b);
        p_322_1_.writeInt(field_21040_c);
        p_322_1_.write(field_21039_d);
        p_322_1_.write(field_21038_e);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_21145_a(this);
    }

    public int func_329_a()
    {
        return 12;
    }
}
