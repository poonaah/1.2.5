// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, Entity, MathHelper, NetHandler

public class Packet34EntityTeleport extends Packet
{

    public int field_509_a;
    public int field_508_b;
    public int field_513_c;
    public int field_512_d;
    public byte field_511_e;
    public byte field_510_f;

    public Packet34EntityTeleport()
    {
    }

    public Packet34EntityTeleport(Entity p_i464_1_)
    {
        field_509_a = p_i464_1_.field_620_ab;
        field_508_b = MathHelper.func_1108_b(p_i464_1_.field_611_ak * 32D);
        field_513_c = MathHelper.func_1108_b(p_i464_1_.field_610_al * 32D);
        field_512_d = MathHelper.func_1108_b(p_i464_1_.field_609_am * 32D);
        field_511_e = (byte)(int)((p_i464_1_.field_605_aq * 256F) / 360F);
        field_510_f = (byte)(int)((p_i464_1_.field_604_ar * 256F) / 360F);
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_509_a = p_327_1_.readInt();
        field_508_b = p_327_1_.readInt();
        field_513_c = p_327_1_.readInt();
        field_512_d = p_327_1_.readInt();
        field_511_e = (byte)p_327_1_.read();
        field_510_f = (byte)p_327_1_.read();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_509_a);
        p_322_1_.writeInt(field_508_b);
        p_322_1_.writeInt(field_513_c);
        p_322_1_.writeInt(field_512_d);
        p_322_1_.write(field_511_e);
        p_322_1_.write(field_510_f);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_829_a(this);
    }

    public int func_329_a()
    {
        return 34;
    }
}
