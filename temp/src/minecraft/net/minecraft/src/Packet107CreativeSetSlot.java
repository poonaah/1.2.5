// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler, ItemStack

public class Packet107CreativeSetSlot extends Packet
{

    public int field_35236_a;
    public ItemStack field_40190_b;

    public Packet107CreativeSetSlot()
    {
    }

    public Packet107CreativeSetSlot(int p_i279_1_, ItemStack p_i279_2_)
    {
        field_35236_a = p_i279_1_;
        field_40190_b = p_i279_2_;
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_35781_a(this);
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_35236_a = p_327_1_.readShort();
        field_40190_b = func_40187_b(p_327_1_);
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeShort(field_35236_a);
        func_40188_a(field_40190_b, p_322_1_);
    }

    public int func_329_a()
    {
        return 8;
    }
}
