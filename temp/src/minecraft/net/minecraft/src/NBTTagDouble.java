// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagDouble extends NBTBase
{

    public double field_1089_a;

    public NBTTagDouble(String p_i126_1_)
    {
        super(p_i126_1_);
    }

    public NBTTagDouble(String p_i127_1_, double p_i127_2_)
    {
        super(p_i127_1_);
        field_1089_a = p_i127_2_;
    }

    void func_735_a(DataOutput p_735_1_)
        throws IOException
    {
        p_735_1_.writeDouble(field_1089_a);
    }

    void func_736_a(DataInput p_736_1_)
        throws IOException
    {
        field_1089_a = p_736_1_.readDouble();
    }

    public byte func_733_a()
    {
        return 6;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1089_a).toString();
    }

    public NBTBase func_40195_b()
    {
        return new NBTTagDouble(func_737_b(), field_1089_a);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagDouble nbttagdouble = (NBTTagDouble)p_equals_1_;
            return field_1089_a == nbttagdouble.field_1089_a;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(field_1089_a);
        return super.hashCode() ^ (int)(l ^ l >>> 32);
    }
}
