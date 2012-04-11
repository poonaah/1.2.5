// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, EntityPlayer, MathHelper, InventoryPlayer, 
//            ItemStack, NetHandler

public class Packet20NamedEntitySpawn extends Packet
{

    public int field_534_a;
    public String field_533_b;
    public int field_540_c;
    public int field_539_d;
    public int field_538_e;
    public byte field_537_f;
    public byte field_536_g;
    public int field_535_h;

    public Packet20NamedEntitySpawn()
    {
    }

    public Packet20NamedEntitySpawn(EntityPlayer p_i382_1_)
    {
        field_534_a = p_i382_1_.field_620_ab;
        field_533_b = p_i382_1_.field_771_i;
        field_540_c = MathHelper.func_1108_b(p_i382_1_.field_611_ak * 32D);
        field_539_d = MathHelper.func_1108_b(p_i382_1_.field_610_al * 32D);
        field_538_e = MathHelper.func_1108_b(p_i382_1_.field_609_am * 32D);
        field_537_f = (byte)(int)((p_i382_1_.field_605_aq * 256F) / 360F);
        field_536_g = (byte)(int)((p_i382_1_.field_604_ar * 256F) / 360F);
        ItemStack itemstack = p_i382_1_.field_778_b.func_494_a();
        field_535_h = itemstack != null ? itemstack.field_1617_c : 0;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_534_a = p_327_1_.readInt();
        field_533_b = func_27048_a(p_327_1_, 16);
        field_540_c = p_327_1_.readInt();
        field_539_d = p_327_1_.readInt();
        field_538_e = p_327_1_.readInt();
        field_537_f = p_327_1_.readByte();
        field_536_g = p_327_1_.readByte();
        field_535_h = p_327_1_.readShort();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeInt(field_534_a);
        func_27049_a(field_533_b, p_322_1_);
        p_322_1_.writeInt(field_540_c);
        p_322_1_.writeInt(field_539_d);
        p_322_1_.writeInt(field_538_e);
        p_322_1_.writeByte(field_537_f);
        p_322_1_.writeByte(field_536_g);
        p_322_1_.writeShort(field_535_h);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_820_a(this);
    }

    public int func_329_a()
    {
        return 28;
    }
}
