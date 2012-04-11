// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet10Flying

public class Packet12PlayerLook extends Packet10Flying
{

    public Packet12PlayerLook()
    {
        field_553_i = true;
    }

    public Packet12PlayerLook(float p_i522_1_, float p_i522_2_, boolean p_i522_3_)
    {
        field_557_e = p_i522_1_;
        field_556_f = p_i522_2_;
        field_555_g = p_i522_3_;
        field_553_i = true;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_557_e = p_327_1_.readFloat();
        field_556_f = p_327_1_.readFloat();
        super.func_327_a(p_327_1_);
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeFloat(field_557_e);
        p_322_1_.writeFloat(field_556_f);
        super.func_322_a(p_322_1_);
    }

    public int func_329_a()
    {
        return 9;
    }
}
