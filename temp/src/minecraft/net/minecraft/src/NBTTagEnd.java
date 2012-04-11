// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagEnd extends NBTBase
{

    public NBTTagEnd()
    {
        super(null);
    }

    void func_736_a(DataInput datainput)
        throws IOException
    {
    }

    void func_735_a(DataOutput dataoutput)
        throws IOException
    {
    }

    public byte func_733_a()
    {
        return 0;
    }

    public String toString()
    {
        return "END";
    }

    public NBTBase func_40195_b()
    {
        return new NBTTagEnd();
    }

    public boolean equals(Object p_equals_1_)
    {
        return super.equals(p_equals_1_);
    }
}
