// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet, PlayerCapabilities, NetHandler

public class Packet202PlayerAbilities extends Packet
{

    public boolean field_50072_a;
    public boolean field_50070_b;
    public boolean field_50071_c;
    public boolean field_50069_d;

    public Packet202PlayerAbilities()
    {
        field_50072_a = false;
        field_50070_b = false;
        field_50071_c = false;
        field_50069_d = false;
    }

    public Packet202PlayerAbilities(PlayerCapabilities p_i1208_1_)
    {
        field_50072_a = false;
        field_50070_b = false;
        field_50071_c = false;
        field_50069_d = false;
        field_50072_a = p_i1208_1_.field_35759_a;
        field_50070_b = p_i1208_1_.field_35757_b;
        field_50071_c = p_i1208_1_.field_35758_c;
        field_50069_d = p_i1208_1_.field_35756_d;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_50072_a = p_327_1_.readBoolean();
        field_50070_b = p_327_1_.readBoolean();
        field_50071_c = p_327_1_.readBoolean();
        field_50069_d = p_327_1_.readBoolean();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeBoolean(field_50072_a);
        p_322_1_.writeBoolean(field_50070_b);
        p_322_1_.writeBoolean(field_50071_c);
        p_322_1_.writeBoolean(field_50069_d);
    }

    public void func_323_a(NetHandler p_323_1_)
    {
        p_323_1_.func_50100_a(this);
    }

    public int func_329_a()
    {
        return 1;
    }
}
