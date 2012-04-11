// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagLong extends NBTBase
{

    public long field_1095_a;

    public NBTTagLong(String p_i30_1_)
    {
        super(p_i30_1_);
    }

    public NBTTagLong(String p_i31_1_, long p_i31_2_)
    {
        super(p_i31_1_);
        field_1095_a = p_i31_2_;
    }

    void func_735_a(DataOutput p_735_1_)
        throws IOException
    {
        p_735_1_.writeLong(field_1095_a);
    }

    void func_736_a(DataInput p_736_1_)
        throws IOException
    {
        field_1095_a = p_736_1_.readLong();
    }

    public byte func_733_a()
    {
        return 4;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1095_a).toString();
    }

    public NBTBase func_40195_b()
    {
        return new NBTTagLong(func_737_b(), field_1095_a);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagLong nbttaglong = (NBTTagLong)p_equals_1_;
            return field_1095_a == nbttaglong.field_1095_a;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ (int)(field_1095_a ^ field_1095_a >>> 32);
    }
}
