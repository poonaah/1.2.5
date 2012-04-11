// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, ItemStack, NetHandler

public class Packet104WindowItems extends Packet
{

    public int field_20036_a;
    public ItemStack field_20035_b[];

    public Packet104WindowItems()
    {
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_20036_a = p_327_1_.readByte();
        short word0 = p_327_1_.readShort();
        field_20035_b = new ItemStack[word0];
        for(int i = 0; i < word0; i++)
        {
            field_20035_b[i] = func_40187_b(p_327_1_);
        }

    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeByte(field_20036_a);
        p_322_1_.writeShort(field_20035_b.length);
        for(int i = 0; i < field_20035_b.length; i++)
        {
            func_40188_a(field_20035_b[i], p_322_1_);
        }

    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_20094_a(this);
    }

    public int func_329_a()
    {
        return 3 + field_20035_b.length * 5;
    }
}
