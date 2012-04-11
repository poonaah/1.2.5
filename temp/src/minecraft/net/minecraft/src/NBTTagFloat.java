// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagFloat extends NBTBase
{

    public float field_1097_a;

    public NBTTagFloat(String p_i465_1_)
    {
        super(p_i465_1_);
    }

    public NBTTagFloat(String p_i466_1_, float p_i466_2_)
    {
        super(p_i466_1_);
        field_1097_a = p_i466_2_;
    }

    void func_735_a(DataOutput p_735_1_)
        throws IOException
    {
        p_735_1_.writeFloat(field_1097_a);
    }

    void func_736_a(DataInput p_736_1_)
        throws IOException
    {
        field_1097_a = p_736_1_.readFloat();
    }

    public byte func_733_a()
    {
        return 5;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1097_a).toString();
    }

    public NBTBase func_40195_b()
    {
        return new NBTTagFloat(func_737_b(), field_1097_a);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagFloat nbttagfloat = (NBTTagFloat)p_equals_1_;
            return field_1097_a == nbttagfloat.field_1097_a;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ Float.floatToIntBits(field_1097_a);
    }
}
