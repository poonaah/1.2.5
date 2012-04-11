// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, WorldType, NetHandler

public class Packet1Login extends Packet
{

    public int field_519_a;
    public String field_518_b;
    public WorldType field_46032_d;
    public int field_35249_d;
    public int field_48170_e;
    public byte field_35247_f;
    public byte field_35248_g;
    public byte field_35251_h;

    public Packet1Login()
    {
    }

    public Packet1Login(String p_i58_1_, int p_i58_2_)
    {
        field_518_b = p_i58_1_;
        field_519_a = p_i58_2_;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_519_a = p_327_1_.readInt();
        field_518_b = func_27048_a(p_327_1_, 16);
        String s = func_27048_a(p_327_1_, 16);
        field_46032_d = WorldType.func_46135_a(s);
        if(field_46032_d == null)
        {
            field_46032_d = WorldType.field_48635_b;
        }
        field_35249_d = p_327_1_.readInt();
        field_48170_e = p_327_1_.readInt();
        field_35247_f = p_327_1_.readByte();
        field_35248_g = p_327_1_.readByte();
        field_35251_h = p_327_1_.readByte();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_519_a);
        func_27049_a(field_518_b, p_322_1_);
        if(field_46032_d == null)
        {
            func_27049_a("", p_322_1_);
        } else
        {
            func_27049_a(field_46032_d.func_48628_a(), p_322_1_);
        }
        p_322_1_.writeInt(field_35249_d);
        p_322_1_.writeInt(field_48170_e);
        p_322_1_.writeByte(field_35247_f);
        p_322_1_.writeByte(field_35248_g);
        p_322_1_.writeByte(field_35251_h);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_4115_a(this);
    }

    public int func_329_a()
    {
        int i = 0;
        if(field_46032_d != null)
        {
            i = field_46032_d.func_48628_a().length();
        }
        return 4 + field_518_b.length() + 4 + 7 + 7 + i;
    }
}
