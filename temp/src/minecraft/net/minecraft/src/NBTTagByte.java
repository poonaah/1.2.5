// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagByte extends NBTBase
{

    public byte field_1092_a;

    public NBTTagByte(String p_i449_1_)
    {
        super(p_i449_1_);
    }

    public NBTTagByte(String p_i450_1_, byte p_i450_2_)
    {
        super(p_i450_1_);
        field_1092_a = p_i450_2_;
    }

    void func_735_a(DataOutput p_735_1_)
        throws IOException
    {
        p_735_1_.writeByte(field_1092_a);
    }

    void func_736_a(DataInput p_736_1_)
        throws IOException
    {
        field_1092_a = p_736_1_.readByte();
    }

    public byte func_733_a()
    {
        return 1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1092_a).toString();
    }

    public NBTBase func_40195_b()
    {
        return new NBTTagByte(func_737_b(), field_1092_a);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagByte nbttagbyte = (NBTTagByte)p_equals_1_;
            return field_1092_a == nbttagbyte.field_1092_a;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ field_1092_a;
    }
}
