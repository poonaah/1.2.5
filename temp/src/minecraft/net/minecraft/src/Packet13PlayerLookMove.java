// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet10Flying

public class Packet13PlayerLookMove extends Packet10Flying
{

    public Packet13PlayerLookMove()
    {
        field_553_i = true;
        field_554_h = true;
    }

    public Packet13PlayerLookMove(double p_i290_1_, double p_i290_3_, double p_i290_5_, double p_i290_7_, float p_i290_9_, float p_i290_10_, boolean p_i290_11_)
    {
        field_561_a = p_i290_1_;
        field_560_b = p_i290_3_;
        field_558_d = p_i290_5_;
        field_559_c = p_i290_7_;
        field_557_e = p_i290_9_;
        field_556_f = p_i290_10_;
        field_555_g = p_i290_11_;
        field_553_i = true;
        field_554_h = true;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_561_a = p_327_1_.readDouble();
        field_560_b = p_327_1_.readDouble();
        field_558_d = p_327_1_.readDouble();
        field_559_c = p_327_1_.readDouble();
        field_557_e = p_327_1_.readFloat();
        field_556_f = p_327_1_.readFloat();
        super.func_327_a(p_327_1_);
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeDouble(field_561_a);
        p_322_1_.writeDouble(field_560_b);
        p_322_1_.writeDouble(field_558_d);
        p_322_1_.writeDouble(field_559_c);
        p_322_1_.writeFloat(field_557_e);
        p_322_1_.writeFloat(field_556_f);
        super.func_322_a(p_322_1_);
    }

    public int func_329_a()
    {
        return 41;
    }
}
