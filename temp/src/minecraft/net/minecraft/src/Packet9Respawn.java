// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, NetHandler, WorldType

public class Packet9Respawn extends Packet
{

    public int field_35244_b;
    public int field_35245_c;
    public int field_35242_d;
    public int field_35243_e;
    public WorldType field_46031_f;

    public Packet9Respawn()
    {
    }

    public Packet9Respawn(int p_i1051_1_, byte p_i1051_2_, WorldType p_i1051_3_, int p_i1051_4_, int p_i1051_5_)
    {
        field_35244_b = p_i1051_1_;
        field_35245_c = p_i1051_2_;
        field_35242_d = p_i1051_4_;
        field_35243_e = p_i1051_5_;
        field_46031_f = p_i1051_3_;
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_9448_a(this);
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_35244_b = p_327_1_.readInt();
        field_35245_c = p_327_1_.readByte();
        field_35243_e = p_327_1_.readByte();
        field_35242_d = p_327_1_.readShort();
        String s = func_27048_a(p_327_1_, 16);
        field_46031_f = WorldType.func_46135_a(s);
        if(field_46031_f == null)
        {
            field_46031_f = WorldType.field_48635_b;
        }
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_35244_b);
        p_322_1_.writeByte(field_35245_c);
        p_322_1_.writeByte(field_35243_e);
        p_322_1_.writeShort(field_35242_d);
        func_27049_a(field_46031_f.func_48628_a(), p_322_1_);
    }

    public int func_329_a()
    {
        return 8 + field_46031_f.func_48628_a().length();
    }
}
