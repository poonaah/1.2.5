// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Packet, EntityLiving, EntityList, MathHelper, 
//            DataWatcher, NetHandler

public class Packet24MobSpawn extends Packet
{

    public int field_547_a;
    public int field_546_b;
    public int field_552_c;
    public int field_551_d;
    public int field_550_e;
    public byte field_549_f;
    public byte field_548_g;
    public byte field_48169_h;
    private DataWatcher field_21055_h;
    private List field_21054_i;

    public Packet24MobSpawn()
    {
    }

    public Packet24MobSpawn(EntityLiving p_i757_1_)
    {
        field_547_a = p_i757_1_.field_620_ab;
        field_546_b = (byte)EntityList.func_1082_a(p_i757_1_);
        field_552_c = MathHelper.func_1108_b(p_i757_1_.field_611_ak * 32D);
        field_551_d = MathHelper.func_1108_b(p_i757_1_.field_610_al * 32D);
        field_550_e = MathHelper.func_1108_b(p_i757_1_.field_609_am * 32D);
        field_549_f = (byte)(int)((p_i757_1_.field_605_aq * 256F) / 360F);
        field_548_g = (byte)(int)((p_i757_1_.field_604_ar * 256F) / 360F);
        field_48169_h = (byte)(int)((p_i757_1_.field_46015_bf * 256F) / 360F);
        field_21055_h = p_i757_1_.func_21061_O();
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_547_a = p_327_1_.readInt();
        field_546_b = p_327_1_.readByte() & 0xff;
        field_552_c = p_327_1_.readInt();
        field_551_d = p_327_1_.readInt();
        field_550_e = p_327_1_.readInt();
        field_549_f = p_327_1_.readByte();
        field_548_g = p_327_1_.readByte();
        field_48169_h = p_327_1_.readByte();
        field_21054_i = DataWatcher.func_21131_a(p_327_1_);
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_547_a);
        p_322_1_.writeByte(field_546_b & 0xff);
        p_322_1_.writeInt(field_552_c);
        p_322_1_.writeInt(field_551_d);
        p_322_1_.writeInt(field_550_e);
        p_322_1_.writeByte(field_549_f);
        p_322_1_.writeByte(field_548_g);
        p_322_1_.writeByte(field_48169_h);
        field_21055_h.func_21127_a(p_322_1_);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_828_a(this);
    }

    public int func_329_a()
    {
        return 20;
    }

    public List func_21053_b()
    {
        return field_21054_i;
    }
}
