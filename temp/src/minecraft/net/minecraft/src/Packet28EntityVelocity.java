// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, Entity, NetHandler

public class Packet28EntityVelocity extends Packet
{

    public int field_6367_a;
    public int field_6366_b;
    public int field_6369_c;
    public int field_6368_d;

    public Packet28EntityVelocity()
    {
    }

    public Packet28EntityVelocity(Entity p_i699_1_)
    {
        this(p_i699_1_.field_620_ab, p_i699_1_.field_608_an, p_i699_1_.field_607_ao, p_i699_1_.field_606_ap);
    }

    public Packet28EntityVelocity(int p_i700_1_, double p_i700_2_, double p_i700_4_, double p_i700_6_)
    {
        field_6367_a = p_i700_1_;
        double d = 3.8999999999999999D;
        if(p_i700_2_ < -d)
        {
            p_i700_2_ = -d;
        }
        if(p_i700_4_ < -d)
        {
            p_i700_4_ = -d;
        }
        if(p_i700_6_ < -d)
        {
            p_i700_6_ = -d;
        }
        if(p_i700_2_ > d)
        {
            p_i700_2_ = d;
        }
        if(p_i700_4_ > d)
        {
            p_i700_4_ = d;
        }
        if(p_i700_6_ > d)
        {
            p_i700_6_ = d;
        }
        field_6366_b = (int)(p_i700_2_ * 8000D);
        field_6369_c = (int)(p_i700_4_ * 8000D);
        field_6368_d = (int)(p_i700_6_ * 8000D);
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_6367_a = p_327_1_.readInt();
        field_6366_b = p_327_1_.readShort();
        field_6369_c = p_327_1_.readShort();
        field_6368_d = p_327_1_.readShort();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_6367_a);
        p_322_1_.writeShort(field_6366_b);
        p_322_1_.writeShort(field_6369_c);
        p_322_1_.writeShort(field_6368_d);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_6498_a(this);
    }

    public int func_329_a()
    {
        return 10;
    }
}
