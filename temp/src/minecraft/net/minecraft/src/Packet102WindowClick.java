// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler, ItemStack

public class Packet102WindowClick extends Packet
{

    public int field_20024_a;
    public int field_20023_b;
    public int field_20027_c;
    public short field_20026_d;
    public ItemStack field_20025_e;
    public boolean field_27050_f;

    public Packet102WindowClick()
    {
    }

    public Packet102WindowClick(int p_i102_1_, int p_i102_2_, int p_i102_3_, boolean p_i102_4_, ItemStack p_i102_5_, short p_i102_6_)
    {
        field_20024_a = p_i102_1_;
        field_20023_b = p_i102_2_;
        field_20027_c = p_i102_3_;
        field_20025_e = p_i102_5_;
        field_20026_d = p_i102_6_;
        field_27050_f = p_i102_4_;
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_20091_a(this);
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_20024_a = p_327_1_.readByte();
        field_20023_b = p_327_1_.readShort();
        field_20027_c = p_327_1_.readByte();
        field_20026_d = p_327_1_.readShort();
        field_27050_f = p_327_1_.readBoolean();
        field_20025_e = func_40187_b(p_327_1_);
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeByte(field_20024_a);
        p_322_1_.writeShort(field_20023_b);
        p_322_1_.writeByte(field_20027_c);
        p_322_1_.writeShort(field_20026_d);
        p_322_1_.writeBoolean(field_27050_f);
        func_40188_a(field_20025_e, p_322_1_);
    }

    public int func_329_a()
    {
        return 11;
    }
}
