// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase

public class NBTTagList extends NBTBase
{

    private List field_1091_a;
    private byte field_1090_b;

    public NBTTagList()
    {
        super("");
        field_1091_a = new ArrayList();
    }

    public NBTTagList(String p_i481_1_)
    {
        super(p_i481_1_);
        field_1091_a = new ArrayList();
    }

    void func_735_a(DataOutput p_735_1_)
        throws IOException
    {
        if(field_1091_a.size() > 0)
        {
            field_1090_b = ((NBTBase)field_1091_a.get(0)).func_733_a();
        } else
        {
            field_1090_b = 1;
        }
        p_735_1_.writeByte(field_1090_b);
        p_735_1_.writeInt(field_1091_a.size());
        for(int i = 0; i < field_1091_a.size(); i++)
        {
            ((NBTBase)field_1091_a.get(i)).func_735_a(p_735_1_);
        }

    }

    void func_736_a(DataInput p_736_1_)
        throws IOException
    {
        field_1090_b = p_736_1_.readByte();
        int i = p_736_1_.readInt();
        field_1091_a = new ArrayList();
        for(int j = 0; j < i; j++)
        {
            NBTBase nbtbase = NBTBase.func_739_a(field_1090_b, null);
            nbtbase.func_736_a(p_736_1_);
            field_1091_a.add(nbtbase);
        }

    }

    public byte func_733_a()
    {
        return 9;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1091_a.size()).append(" entries of type ").append(NBTBase.func_731_b(field_1090_b)).toString();
    }

    public void func_742_a(NBTBase p_742_1_)
    {
        field_1090_b = p_742_1_.func_733_a();
        field_1091_a.add(p_742_1_);
    }

    public NBTBase func_741_a(int p_741_1_)
    {
        return (NBTBase)field_1091_a.get(p_741_1_);
    }

    public int func_740_c()
    {
        return field_1091_a.size();
    }

    public NBTBase func_40195_b()
    {
        NBTTagList nbttaglist = new NBTTagList(func_737_b());
        nbttaglist.field_1090_b = field_1090_b;
        NBTBase nbtbase1;
        for(Iterator iterator = field_1091_a.iterator(); iterator.hasNext(); nbttaglist.field_1091_a.add(nbtbase1))
        {
            NBTBase nbtbase = (NBTBase)iterator.next();
            nbtbase1 = nbtbase.func_40195_b();
        }

        return nbttaglist;
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagList nbttaglist = (NBTTagList)p_equals_1_;
            if(field_1090_b == nbttaglist.field_1090_b)
            {
                return field_1091_a.equals(nbttaglist.field_1091_a);
            }
        }
        return false;
    }

    public int hashCode()
    {
        return super.hashCode() ^ field_1091_a.hashCode();
    }
}
