// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet52MultiBlockChange extends Packet
{

    public int field_479_a;
    public int field_478_b;
    public byte field_481_e[];
    public int field_480_f;
    private static byte field_48168_e[] = new byte[0];

    public Packet52MultiBlockChange()
    {
        field_472_j = true;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_479_a = p_327_1_.readInt();
        field_478_b = p_327_1_.readInt();
        field_480_f = p_327_1_.readShort() & 0xffff;
        int i = p_327_1_.readInt();
        if(i > 0)
        {
            field_481_e = new byte[i];
            p_327_1_.readFully(field_481_e);
        }
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_479_a);
        p_322_1_.writeInt(field_478_b);
        p_322_1_.writeShort((short)field_480_f);
        if(field_481_e != null)
        {
            p_322_1_.writeInt(field_481_e.length);
            p_322_1_.write(field_481_e);
        } else
        {
            p_322_1_.writeInt(0);
        }
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_824_a(this);
    }

    public int func_329_a()
    {
        return 10 + field_480_f * 4;
    }

}
