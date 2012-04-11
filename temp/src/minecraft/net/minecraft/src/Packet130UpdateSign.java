// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler

public class Packet130UpdateSign extends Packet
{

    public int field_20020_a;
    public int field_20019_b;
    public int field_20022_c;
    public String field_20021_d[];

    public Packet130UpdateSign()
    {
        field_472_j = true;
    }

    public Packet130UpdateSign(int p_i148_1_, int p_i148_2_, int p_i148_3_, String p_i148_4_[])
    {
        field_472_j = true;
        field_20020_a = p_i148_1_;
        field_20019_b = p_i148_2_;
        field_20022_c = p_i148_3_;
        field_20021_d = p_i148_4_;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_20020_a = p_327_1_.readInt();
        field_20019_b = p_327_1_.readShort();
        field_20022_c = p_327_1_.readInt();
        field_20021_d = new String[4];
        for(int i = 0; i < 4; i++)
        {
            field_20021_d[i] = func_27048_a(p_327_1_, 15);
        }

    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_20020_a);
        p_322_1_.writeShort(field_20019_b);
        p_322_1_.writeInt(field_20022_c);
        for(int i = 0; i < 4; i++)
        {
            func_27049_a(field_20021_d[i], p_322_1_);
        }

    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_20093_a(this);
    }

    public int func_329_a()
    {
        int i = 0;
        for(int j = 0; j < 4; j++)
        {
            i += field_20021_d[j].length();
        }

        return i;
    }
}
