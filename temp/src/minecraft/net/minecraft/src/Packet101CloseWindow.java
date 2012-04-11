// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet101CloseWindow extends Packet
{

    public int field_20034_a;

    public Packet101CloseWindow()
    {
    }

    public Packet101CloseWindow(int p_i33_1_)
    {
        field_20034_a = p_i33_1_;
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_20092_a(this);
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_20034_a = p_327_1_.readByte();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeByte(field_20034_a);
    }

    public int func_329_a()
    {
        return 1;
    }
}
