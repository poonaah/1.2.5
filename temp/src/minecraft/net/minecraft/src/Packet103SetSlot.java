// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler, ItemStack

public class Packet103SetSlot extends Packet
{

    public int field_20042_a;
    public int field_20041_b;
    public ItemStack field_20043_c;

    public Packet103SetSlot()
    {
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_20088_a(this);
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_20042_a = p_327_1_.readByte();
        field_20041_b = p_327_1_.readShort();
        field_20043_c = func_40187_b(p_327_1_);
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeByte(field_20042_a);
        p_322_1_.writeShort(field_20041_b);
        func_40188_a(field_20043_c, p_322_1_);
    }

    public int func_329_a()
    {
        return 8;
    }
}
