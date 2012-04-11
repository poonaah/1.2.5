// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagShort extends NBTBase
{

    public short field_1088_a;

    public NBTTagShort(String p_i504_1_)
    {
        super(p_i504_1_);
    }

    public NBTTagShort(String p_i505_1_, short p_i505_2_)
    {
        super(p_i505_1_);
        field_1088_a = p_i505_2_;
    }

    void func_735_a(DataOutput p_735_1_)
        throws IOException
    {
        p_735_1_.writeShort(field_1088_a);
    }

    void func_736_a(DataInput p_736_1_)
        throws IOException
    {
        field_1088_a = p_736_1_.readShort();
    }

    public byte func_733_a()
    {
        return 2;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1088_a).toString();
    }

    public NBTBase func_40195_b()
    {
        return new NBTTagShort(func_737_b(), field_1088_a);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagShort nbttagshort = (NBTTagShort)p_equals_1_;
            return field_1088_a == nbttagshort.field_1088_a;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ field_1088_a;
    }
}
