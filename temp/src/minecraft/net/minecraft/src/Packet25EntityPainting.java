// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, EntityPainting, EnumArt, NetHandler

public class Packet25EntityPainting extends Packet
{

    public int field_21042_a;
    public int field_21041_b;
    public int field_21046_c;
    public int field_21045_d;
    public int field_21044_e;
    public String field_21043_f;

    public Packet25EntityPainting()
    {
    }

    public Packet25EntityPainting(EntityPainting p_i537_1_)
    {
        field_21042_a = p_i537_1_.field_620_ab;
        field_21041_b = p_i537_1_.field_9322_d;
        field_21046_c = p_i537_1_.field_9321_e;
        field_21045_d = p_i537_1_.field_9320_f;
        field_21044_e = p_i537_1_.field_691_a;
        field_21043_f = p_i537_1_.field_690_b.field_1624_y;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_21042_a = p_327_1_.readInt();
        field_21043_f = func_27048_a(p_327_1_, EnumArt.field_27365_z);
        field_21041_b = p_327_1_.readInt();
        field_21046_c = p_327_1_.readInt();
        field_21045_d = p_327_1_.readInt();
        field_21044_e = p_327_1_.readInt();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_21042_a);
        func_27049_a(field_21043_f, p_322_1_);
        p_322_1_.writeInt(field_21041_b);
        p_322_1_.writeInt(field_21046_c);
        p_322_1_.writeInt(field_21045_d);
        p_322_1_.writeInt(field_21044_e);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_21146_a(this);
    }

    public int func_329_a()
    {
        return 24;
    }
}
