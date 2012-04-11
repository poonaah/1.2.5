// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet250CustomPayload extends Packet
{

    public String field_44012_a;
    public int field_44010_b;
    public byte field_44011_c[];

    public Packet250CustomPayload()
    {
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_44012_a = func_27048_a(p_327_1_, 16);
        field_44010_b = p_327_1_.readShort();
        if(field_44010_b > 0 && field_44010_b < 32767)
        {
            field_44011_c = new byte[field_44010_b];
            p_327_1_.readFully(field_44011_c);
        }
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        func_27049_a(field_44012_a, p_322_1_);
        p_322_1_.writeShort((short)field_44010_b);
        if(field_44011_c != null)
        {
            p_322_1_.write(field_44011_c);
        }
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_44028_a(this);
    }

    public int func_329_a()
    {
        return 2 + field_44012_a.length() * 2 + 2 + field_44010_b;
    }
}
