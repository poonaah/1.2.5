// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.Arrays;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagIntArray extends NBTBase
{

    public int field_48181_a[];

    public NBTTagIntArray(String p_i1036_1_)
    {
        super(p_i1036_1_);
    }

    public NBTTagIntArray(String p_i1037_1_, int p_i1037_2_[])
    {
        super(p_i1037_1_);
        field_48181_a = p_i1037_2_;
    }

    void func_735_a(DataOutput p_735_1_)
        throws IOException
    {
        p_735_1_.writeInt(field_48181_a.length);
        for(int i = 0; i < field_48181_a.length; i++)
        {
            p_735_1_.writeInt(field_48181_a[i]);
        }

    }

    void func_736_a(DataInput p_736_1_)
        throws IOException
    {
        int i = p_736_1_.readInt();
        field_48181_a = new int[i];
        for(int j = 0; j < i; j++)
        {
            field_48181_a[j] = p_736_1_.readInt();
        }

    }

    public byte func_733_a()
    {
        return 11;
    }

    public String toString()
    {
        return (new StringBuilder()).append("[").append(field_48181_a.length).append(" bytes]").toString();
    }

    public NBTBase func_40195_b()
    {
        int ai[] = new int[field_48181_a.length];
        System.arraycopy(field_48181_a, 0, ai, 0, field_48181_a.length);
        return new NBTTagIntArray(func_737_b(), ai);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagIntArray nbttagintarray = (NBTTagIntArray)p_equals_1_;
            return field_48181_a == null && nbttagintarray.field_48181_a == null || field_48181_a != null && field_48181_a.equals(nbttagintarray.field_48181_a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ Arrays.hashCode(field_48181_a);
    }
}
