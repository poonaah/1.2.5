// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet30Entity

public class Packet32EntityLook extends Packet30Entity
{

    public Packet32EntityLook()
    {
        field_486_g = true;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        super.func_327_a(p_327_1_);
        field_488_e = p_327_1_.readByte();
        field_487_f = p_327_1_.readByte();
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        super.func_322_a(p_322_1_);
        p_322_1_.writeByte(field_488_e);
        p_322_1_.writeByte(field_487_f);
    }

    public int func_329_a()
    {
        return 6;
    }
}
