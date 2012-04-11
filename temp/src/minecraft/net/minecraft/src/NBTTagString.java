// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagString extends NBTBase
{

    public String field_1098_a;

    public NBTTagString(String p_i191_1_)
    {
        super(p_i191_1_);
    }

    public NBTTagString(String p_i192_1_, String p_i192_2_)
    {
        super(p_i192_1_);
        field_1098_a = p_i192_2_;
        if(p_i192_2_ == null)
        {
            throw new IllegalArgumentException("Empty string not allowed");
        } else
        {
            return;
        }
    }

    void func_735_a(DataOutput p_735_1_)
        throws IOException
    {
        p_735_1_.writeUTF(field_1098_a);
    }

    void func_736_a(DataInput p_736_1_)
        throws IOException
    {
        field_1098_a = p_736_1_.readUTF();
    }

    public byte func_733_a()
    {
        return 8;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1098_a).toString();
    }

    public NBTBase func_40195_b()
    {
        return new NBTTagString(func_737_b(), field_1098_a);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagString nbttagstring = (NBTTagString)p_equals_1_;
            return field_1098_a == null && nbttagstring.field_1098_a == null || field_1098_a != null && field_1098_a.equals(nbttagstring.field_1098_a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ field_1098_a.hashCode();
    }
}
