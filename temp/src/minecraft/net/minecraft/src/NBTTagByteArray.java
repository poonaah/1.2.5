// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.Arrays;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagByteArray extends NBTBase
{

    public byte field_1096_a[];

    public NBTTagByteArray(String p_i718_1_)
    {
        super(p_i718_1_);
    }

    public NBTTagByteArray(String p_i719_1_, byte p_i719_2_[])
    {
        super(p_i719_1_);
        field_1096_a = p_i719_2_;
    }

    void func_735_a(DataOutput p_735_1_)
        throws IOException
    {
        p_735_1_.writeInt(field_1096_a.length);
        p_735_1_.write(field_1096_a);
    }

    void func_736_a(DataInput p_736_1_)
        throws IOException
    {
        int i = p_736_1_.readInt();
        field_1096_a = new byte[i];
        p_736_1_.readFully(field_1096_a);
    }

    public byte func_733_a()
    {
        return 7;
    }

    public String toString()
    {
        return (new StringBuilder()).append("[").append(field_1096_a.length).append(" bytes]").toString();
    }

    public NBTBase func_40195_b()
    {
        byte abyte0[] = new byte[field_1096_a.length];
        System.arraycopy(field_1096_a, 0, abyte0, 0, field_1096_a.length);
        return new NBTTagByteArray(func_737_b(), abyte0);
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            return Arrays.equals(field_1096_a, ((NBTTagByteArray)p_equals_1_).field_1096_a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ Arrays.hashCode(field_1096_a);
    }
}
