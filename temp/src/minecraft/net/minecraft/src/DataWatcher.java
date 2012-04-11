// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            WatchableObject, Packet, ItemStack, Item, 
//            ChunkCoordinates

public class DataWatcher
{

    private static final HashMap field_21133_a;
    private final Map field_21132_b = new HashMap();
    private boolean field_21134_c;

    public DataWatcher()
    {
    }

    public void func_21124_a(int p_21124_1_, Object p_21124_2_)
    {
        Integer integer = (Integer)field_21133_a.get(p_21124_2_.getClass());
        if(integer == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown data type: ").append(p_21124_2_.getClass()).toString());
        }
        if(p_21124_1_ > 31)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Data value id is too big with ").append(p_21124_1_).append("! (Max is ").append(31).append(")").toString());
        }
        if(field_21132_b.containsKey(Integer.valueOf(p_21124_1_)))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate id value for ").append(p_21124_1_).append("!").toString());
        } else
        {
            WatchableObject watchableobject = new WatchableObject(integer.intValue(), p_21124_1_, p_21124_2_);
            field_21132_b.put(Integer.valueOf(p_21124_1_), watchableobject);
            return;
        }
    }

    public byte func_21130_a(int p_21130_1_)
    {
        return ((Byte)((WatchableObject)field_21132_b.get(Integer.valueOf(p_21130_1_))).func_21158_b()).byteValue();
    }

    public short func_41062_b(int p_41062_1_)
    {
        return ((Short)((WatchableObject)field_21132_b.get(Integer.valueOf(p_41062_1_))).func_21158_b()).shortValue();
    }

    public int func_25115_b(int p_25115_1_)
    {
        return ((Integer)((WatchableObject)field_21132_b.get(Integer.valueOf(p_25115_1_))).func_21158_b()).intValue();
    }

    public String func_25116_c(int p_25116_1_)
    {
        return (String)((WatchableObject)field_21132_b.get(Integer.valueOf(p_25116_1_))).func_21158_b();
    }

    public void func_21129_b(int p_21129_1_, Object p_21129_2_)
    {
        WatchableObject watchableobject = (WatchableObject)field_21132_b.get(Integer.valueOf(p_21129_1_));
        if(!p_21129_2_.equals(watchableobject.func_21158_b()))
        {
            watchableobject.func_21160_a(p_21129_2_);
            watchableobject.func_21162_a(true);
            field_21134_c = true;
        }
    }

    public static void func_21125_a(List p_21125_0_, DataOutputStream p_21125_1_)
        throws IOException
    {
        if(p_21125_0_ != null)
        {
            WatchableObject watchableobject;
            for(Iterator iterator = p_21125_0_.iterator(); iterator.hasNext(); func_21128_a(p_21125_1_, watchableobject))
            {
                watchableobject = (WatchableObject)iterator.next();
            }

        }
        p_21125_1_.writeByte(127);
    }

    public void func_21127_a(DataOutputStream p_21127_1_)
        throws IOException
    {
        WatchableObject watchableobject;
        for(Iterator iterator = field_21132_b.values().iterator(); iterator.hasNext(); func_21128_a(p_21127_1_, watchableobject))
        {
            watchableobject = (WatchableObject)iterator.next();
        }

        p_21127_1_.writeByte(127);
    }

    private static void func_21128_a(DataOutputStream p_21128_0_, WatchableObject p_21128_1_)
        throws IOException
    {
        int i = (p_21128_1_.func_21159_c() << 5 | p_21128_1_.func_21161_a() & 0x1f) & 0xff;
        p_21128_0_.writeByte(i);
        switch(p_21128_1_.func_21159_c())
        {
        case 0: // '\0'
            p_21128_0_.writeByte(((Byte)p_21128_1_.func_21158_b()).byteValue());
            break;

        case 1: // '\001'
            p_21128_0_.writeShort(((Short)p_21128_1_.func_21158_b()).shortValue());
            break;

        case 2: // '\002'
            p_21128_0_.writeInt(((Integer)p_21128_1_.func_21158_b()).intValue());
            break;

        case 3: // '\003'
            p_21128_0_.writeFloat(((Float)p_21128_1_.func_21158_b()).floatValue());
            break;

        case 4: // '\004'
            Packet.func_27049_a((String)p_21128_1_.func_21158_b(), p_21128_0_);
            break;

        case 5: // '\005'
            ItemStack itemstack = (ItemStack)p_21128_1_.func_21158_b();
            p_21128_0_.writeShort(itemstack.func_1091_a().field_291_aS);
            p_21128_0_.writeByte(itemstack.field_1615_a);
            p_21128_0_.writeShort(itemstack.func_21181_i());
            break;

        case 6: // '\006'
            ChunkCoordinates chunkcoordinates = (ChunkCoordinates)p_21128_1_.func_21158_b();
            p_21128_0_.writeInt(chunkcoordinates.field_22395_a);
            p_21128_0_.writeInt(chunkcoordinates.field_22394_b);
            p_21128_0_.writeInt(chunkcoordinates.field_22396_c);
            break;
        }
    }

    public static List func_21131_a(DataInputStream p_21131_0_)
        throws IOException
    {
        ArrayList arraylist = null;
        for(byte byte0 = p_21131_0_.readByte(); byte0 != 127; byte0 = p_21131_0_.readByte())
        {
            if(arraylist == null)
            {
                arraylist = new ArrayList();
            }
            int i = (byte0 & 0xe0) >> 5;
            int j = byte0 & 0x1f;
            WatchableObject watchableobject = null;
            switch(i)
            {
            case 0: // '\0'
                watchableobject = new WatchableObject(i, j, Byte.valueOf(p_21131_0_.readByte()));
                break;

            case 1: // '\001'
                watchableobject = new WatchableObject(i, j, Short.valueOf(p_21131_0_.readShort()));
                break;

            case 2: // '\002'
                watchableobject = new WatchableObject(i, j, Integer.valueOf(p_21131_0_.readInt()));
                break;

            case 3: // '\003'
                watchableobject = new WatchableObject(i, j, Float.valueOf(p_21131_0_.readFloat()));
                break;

            case 4: // '\004'
                watchableobject = new WatchableObject(i, j, Packet.func_27048_a(p_21131_0_, 64));
                break;

            case 5: // '\005'
                short word0 = p_21131_0_.readShort();
                byte byte1 = p_21131_0_.readByte();
                short word1 = p_21131_0_.readShort();
                watchableobject = new WatchableObject(i, j, new ItemStack(word0, byte1, word1));
                break;

            case 6: // '\006'
                int k = p_21131_0_.readInt();
                int l = p_21131_0_.readInt();
                int i1 = p_21131_0_.readInt();
                watchableobject = new WatchableObject(i, j, new ChunkCoordinates(k, l, i1));
                break;
            }
            arraylist.add(watchableobject);
        }

        return arraylist;
    }

    public void func_21126_a(List p_21126_1_)
    {
        Iterator iterator = p_21126_1_.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            WatchableObject watchableobject = (WatchableObject)iterator.next();
            WatchableObject watchableobject1 = (WatchableObject)field_21132_b.get(Integer.valueOf(watchableobject.func_21161_a()));
            if(watchableobject1 != null)
            {
                watchableobject1.func_21160_a(watchableobject.func_21158_b());
            }
        } while(true);
    }

    static Class _mthclass$(String s)
    {
        try
        {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    static 
    {
        field_21133_a = new HashMap();
        field_21133_a.put(java.lang.Byte.class, Integer.valueOf(0));
        field_21133_a.put(java.lang.Short.class, Integer.valueOf(1));
        field_21133_a.put(java.lang.Integer.class, Integer.valueOf(2));
        field_21133_a.put(java.lang.Float.class, Integer.valueOf(3));
        field_21133_a.put(java.lang.String.class, Integer.valueOf(4));
        field_21133_a.put(net.minecraft.src.ItemStack.class, Integer.valueOf(5));
        field_21133_a.put(net.minecraft.src.ChunkCoordinates.class, Integer.valueOf(6));
    }
}
