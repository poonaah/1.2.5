// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagInt extends NBTBase
{

    public int field_1093_a;

    public NBTTagInt(String p_i85_1_)
    {
        super(p_i85_1_);
    }

    public NBTTagInt(String p_i86_1_, int p_i86_2_)
    {
        super(p_i86_1_);
        field_1093_a = p_i86_2_;
    }

    void func_735_a(DataOutput p_735_1_)
        throws IOException
    {
        p_735_1_.writeInt(field_1093_a);
    }

    void func_736_a(DataInput p_736_1_)
        throws IOException
    {
        field_1093_a = p_736_1_.readInt();
    }

    public byte func_733_a()
    {
        return 3;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1093_a).toString();
    }

    public NBTBase func_40195_b()
    {
        return new NBTTagInt(func_737_b(), field_1093_a);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagInt nbttagint = (NBTTagInt)p_equals_1_;
            return field_1093_a == nbttagint.field_1093_a;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ field_1093_a;
    }
}
