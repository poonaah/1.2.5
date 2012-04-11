// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, Entity, MathHelper, EntityLightningBolt, 
//            NetHandler

public class Packet71Weather extends Packet
{

    public int field_27054_a;
    public int field_27053_b;
    public int field_27057_c;
    public int field_27056_d;
    public int field_27055_e;

    public Packet71Weather()
    {
    }

    public Packet71Weather(Entity p_i670_1_)
    {
        field_27054_a = p_i670_1_.field_620_ab;
        field_27053_b = MathHelper.func_1108_b(p_i670_1_.field_611_ak * 32D);
        field_27057_c = MathHelper.func_1108_b(p_i670_1_.field_610_al * 32D);
        field_27056_d = MathHelper.func_1108_b(p_i670_1_.field_609_am * 32D);
        if(p_i670_1_ instanceof EntityLightningBolt)
        {
            field_27055_e = 1;
        }
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_27054_a = p_327_1_.readInt();
        field_27055_e = p_327_1_.readByte();
        field_27053_b = p_327_1_.readInt();
        field_27057_c = p_327_1_.readInt();
        field_27056_d = p_327_1_.readInt();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_27054_a);
        p_322_1_.writeByte(field_27055_e);
        p_322_1_.writeInt(field_27053_b);
        p_322_1_.writeInt(field_27057_c);
        p_322_1_.writeInt(field_27056_d);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_27246_a(this);
    }

    public int func_329_a()
    {
        return 17;
    }
}
