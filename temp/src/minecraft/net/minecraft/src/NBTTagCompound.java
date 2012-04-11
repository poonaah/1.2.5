// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            NBTBase, NBTTagByte, NBTTagShort, NBTTagInt, 
//            NBTTagLong, NBTTagFloat, NBTTagDouble, NBTTagString, 
//            NBTTagByteArray, NBTTagIntArray, NBTTagList

public class NBTTagCompound extends NBTBase
{

    private Map field_1094_a;

    public NBTTagCompound()
    {
        super("");
        field_1094_a = new HashMap();
    }

    public NBTTagCompound(String p_i51_1_)
    {
        super(p_i51_1_);
        field_1094_a = new HashMap();
    }

    void func_735_a(DataOutput p_735_1_)
        throws IOException
    {
        NBTBase nbtbase;
        for(Iterator iterator = field_1094_a.values().iterator(); iterator.hasNext(); NBTBase.func_738_a(nbtbase, p_735_1_))
        {
            nbtbase = (NBTBase)iterator.next();
        }

        p_735_1_.writeByte(0);
    }

    void func_736_a(DataInput p_736_1_)
        throws IOException
    {
        field_1094_a.clear();
        NBTBase nbtbase;
        for(; (nbtbase = NBTBase.func_734_b(p_736_1_)).func_733_a() != 0; field_1094_a.put(nbtbase.func_737_b(), nbtbase)) { }
    }

    public Collection func_28110_c()
    {
        return field_1094_a.values();
    }

    public byte func_733_a()
    {
        return 10;
    }

    public void func_762_a(String p_762_1_, NBTBase p_762_2_)
    {
        field_1094_a.put(p_762_1_, p_762_2_.func_732_a(p_762_1_));
    }

    public void func_761_a(String p_761_1_, byte p_761_2_)
    {
        field_1094_a.put(p_761_1_, new NBTTagByte(p_761_1_, p_761_2_));
    }

    public void func_749_a(String p_749_1_, short p_749_2_)
    {
        field_1094_a.put(p_749_1_, new NBTTagShort(p_749_1_, p_749_2_));
    }

    public void func_758_a(String p_758_1_, int p_758_2_)
    {
        field_1094_a.put(p_758_1_, new NBTTagInt(p_758_1_, p_758_2_));
    }

    public void func_750_a(String p_750_1_, long p_750_2_)
    {
        field_1094_a.put(p_750_1_, new NBTTagLong(p_750_1_, p_750_2_));
    }

    public void func_744_a(String p_744_1_, float p_744_2_)
    {
        field_1094_a.put(p_744_1_, new NBTTagFloat(p_744_1_, p_744_2_));
    }

    public void func_765_a(String p_765_1_, double p_765_2_)
    {
        field_1094_a.put(p_765_1_, new NBTTagDouble(p_765_1_, p_765_2_));
    }

    public void func_754_a(String p_754_1_, String p_754_2_)
    {
        field_1094_a.put(p_754_1_, new NBTTagString(p_754_1_, p_754_2_));
    }

    public void func_747_a(String p_747_1_, byte p_747_2_[])
    {
        field_1094_a.put(p_747_1_, new NBTTagByteArray(p_747_1_, p_747_2_));
    }

    public void func_48183_a(String p_48183_1_, int p_48183_2_[])
    {
        field_1094_a.put(p_48183_1_, new NBTTagIntArray(p_48183_1_, p_48183_2_));
    }

    public void func_763_a(String p_763_1_, NBTTagCompound p_763_2_)
    {
        field_1094_a.put(p_763_1_, p_763_2_.func_732_a(p_763_1_));
    }

    public void func_748_a(String p_748_1_, boolean p_748_2_)
    {
        func_761_a(p_748_1_, ((byte)(p_748_2_ ? 1 : 0)));
    }

    public NBTBase func_40196_b(String p_40196_1_)
    {
        return (NBTBase)field_1094_a.get(p_40196_1_);
    }

    public boolean func_751_b(String p_751_1_)
    {
        return field_1094_a.containsKey(p_751_1_);
    }

    public byte func_746_c(String p_746_1_)
    {
        if(!field_1094_a.containsKey(p_746_1_))
        {
            return 0;
        } else
        {
            return ((NBTTagByte)field_1094_a.get(p_746_1_)).field_1092_a;
        }
    }

    public short func_745_d(String p_745_1_)
    {
        if(!field_1094_a.containsKey(p_745_1_))
        {
            return 0;
        } else
        {
            return ((NBTTagShort)field_1094_a.get(p_745_1_)).field_1088_a;
        }
    }

    public int func_756_e(String p_756_1_)
    {
        if(!field_1094_a.containsKey(p_756_1_))
        {
            return 0;
        } else
        {
            return ((NBTTagInt)field_1094_a.get(p_756_1_)).field_1093_a;
        }
    }

    public long func_764_f(String p_764_1_)
    {
        if(!field_1094_a.containsKey(p_764_1_))
        {
            return 0L;
        } else
        {
            return ((NBTTagLong)field_1094_a.get(p_764_1_)).field_1095_a;
        }
    }

    public float func_752_g(String p_752_1_)
    {
        if(!field_1094_a.containsKey(p_752_1_))
        {
            return 0.0F;
        } else
        {
            return ((NBTTagFloat)field_1094_a.get(p_752_1_)).field_1097_a;
        }
    }

    public double func_757_h(String p_757_1_)
    {
        if(!field_1094_a.containsKey(p_757_1_))
        {
            return 0.0D;
        } else
        {
            return ((NBTTagDouble)field_1094_a.get(p_757_1_)).field_1089_a;
        }
    }

    public String func_755_i(String p_755_1_)
    {
        if(!field_1094_a.containsKey(p_755_1_))
        {
            return "";
        } else
        {
            return ((NBTTagString)field_1094_a.get(p_755_1_)).field_1098_a;
        }
    }

    public byte[] func_759_j(String p_759_1_)
    {
        if(!field_1094_a.containsKey(p_759_1_))
        {
            return new byte[0];
        } else
        {
            return ((NBTTagByteArray)field_1094_a.get(p_759_1_)).field_1096_a;
        }
    }

    public int[] func_48182_l(String p_48182_1_)
    {
        if(!field_1094_a.containsKey(p_48182_1_))
        {
            return new int[0];
        } else
        {
            return ((NBTTagIntArray)field_1094_a.get(p_48182_1_)).field_48181_a;
        }
    }

    public NBTTagCompound func_743_k(String p_743_1_)
    {
        if(!field_1094_a.containsKey(p_743_1_))
        {
            return new NBTTagCompound(p_743_1_);
        } else
        {
            return (NBTTagCompound)field_1094_a.get(p_743_1_);
        }
    }

    public NBTTagList func_753_l(String p_753_1_)
    {
        if(!field_1094_a.containsKey(p_753_1_))
        {
            return new NBTTagList(p_753_1_);
        } else
        {
            return (NBTTagList)field_1094_a.get(p_753_1_);
        }
    }

    public boolean func_760_m(String p_760_1_)
    {
        return func_746_c(p_760_1_) != 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1094_a.size()).append(" entries").toString();
    }

    public NBTBase func_40195_b()
    {
        NBTTagCompound nbttagcompound = new NBTTagCompound(func_737_b());
        String s;
        for(Iterator iterator = field_1094_a.keySet().iterator(); iterator.hasNext(); nbttagcompound.func_762_a(s, ((NBTBase)field_1094_a.get(s)).func_40195_b()))
        {
            s = (String)iterator.next();
        }

        return nbttagcompound;
    }

    public boolean equals(Object p_equals_1_)
    {
        if(super.equals(p_equals_1_))
        {
            NBTTagCompound nbttagcompound = (NBTTagCompound)p_equals_1_;
            return field_1094_a.entrySet().equals(nbttagcompound.field_1094_a.entrySet());
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return super.hashCode() ^ field_1094_a.hashCode();
    }
}
