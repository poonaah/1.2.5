// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            Packet10Flying

public class Packet11PlayerPosition extends Packet10Flying
{

    public Packet11PlayerPosition()
    {
        field_554_h = true;
    }

    public Packet11PlayerPosition(double p_i97_1_, double p_i97_3_, double p_i97_5_, double p_i97_7_, boolean p_i97_9_)
    {
        field_561_a = p_i97_1_;
        field_560_b = p_i97_3_;
        field_558_d = p_i97_5_;
        field_559_c = p_i97_7_;
        field_555_g = p_i97_9_;
        field_554_h = true;
    }

    public void func_327_a(DataInputStream p_327_1_)
        throws IOException
    {
        field_561_a = p_327_1_.readDouble();
        field_560_b = p_327_1_.readDouble();
        field_558_d = p_327_1_.readDouble();
        field_559_c = p_327_1_.readDouble();
        super.func_327_a(p_327_1_);
    }

    public void func_322_a(DataOutputStream p_322_1_)
        throws IOException
    {
        p_322_1_.writeDouble(field_561_a);
        p_322_1_.writeDouble(field_560_b);
        p_322_1_.writeDouble(field_558_d);
        p_322_1_.writeDouble(field_559_c);
        super.func_322_a(p_322_1_);
    }

    public int func_329_a()
    {
        return 33;
    }
}
