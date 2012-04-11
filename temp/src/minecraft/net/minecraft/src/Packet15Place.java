// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler, ItemStack

public class Packet15Place extends Packet
{

    public int field_566_a;
    public int field_565_b;
    public int field_569_c;
    public int field_568_d;
    public ItemStack field_567_e;

    public Packet15Place()
    {
    }

    public Packet15Place(int p_i316_1_, int p_i316_2_, int p_i316_3_, int p_i316_4_, ItemStack p_i316_5_)
    {
        field_566_a = p_i316_1_;
        field_565_b = p_i316_2_;
        field_569_c = p_i316_3_;
        field_568_d = p_i316_4_;
        field_567_e = p_i316_5_;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_566_a = p_327_1_.readInt();
        field_565_b = p_327_1_.read();
        field_569_c = p_327_1_.readInt();
        field_568_d = p_327_1_.read();
        field_567_e = func_40187_b(p_327_1_);
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_566_a);
        p_322_1_.write(field_565_b);
        p_322_1_.writeInt(field_569_c);
        p_322_1_.write(field_568_d);
        func_40188_a(field_567_e, p_322_1_);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_819_a(this);
    }

    public int func_329_a()
    {
        return 15;
    }
}
