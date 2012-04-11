// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;

// Referenced classes of package net.minecraft.src:
//            NBTTagEnd, NBTTagByte, NBTTagShort, NBTTagInt, 
//            NBTTagLong, NBTTagFloat, NBTTagDouble, NBTTagByteArray, 
//            NBTTagIntArray, NBTTagString, NBTTagList, NBTTagCompound

public abstract class NBTBase
{

    private String field_1087_a;

    abstract void func_735_a(DataOutput dataoutput)
        throws IOException;

    abstract void func_736_a(DataInput datainput)
        throws IOException;

    public abstract byte func_733_a();

    protected NBTBase(String p_i339_1_)
    {
        if(p_i339_1_ == null)
        {
            field_1087_a = "";
        } else
        {
            field_1087_a = p_i339_1_;
        }
    }

    public NBTBase func_732_a(String p_732_1_)
    {
        if(p_732_1_ == null)
        {
            field_1087_a = "";
        } else
        {
            field_1087_a = p_732_1_;
        }
        return this;
    }

    public String func_737_b()
    {
        if(field_1087_a == null)
        {
            return "";
        } else
        {
            return field_1087_a;
        }
    }

    public static NBTBase func_734_b(DataInput p_734_0_)
        throws IOException
    {
        byte byte0 = p_734_0_.readByte();
        if(byte0 == 0)
        {
            return new NBTTagEnd();
        } else
        {
            String s = p_734_0_.readUTF();
            NBTBase nbtbase = func_739_a(byte0, s);
            nbtbase.func_736_a(p_734_0_);
            return nbtbase;
        }
    }

    public static void func_738_a(NBTBase p_738_0_, DataOutput p_738_1_)
        throws IOException
    {
        p_738_1_.writeByte(p_738_0_.func_733_a());
        if(p_738_0_.func_733_a() == 0)
        {
            return;
        } else
        {
            p_738_1_.writeUTF(p_738_0_.func_737_b());
            p_738_0_.func_735_a(p_738_1_);
            return;
        }
    }

    public static NBTBase func_739_a(byte p_739_0_, String p_739_1_)
    {
        switch(p_739_0_)
        {
        case 0: // '\0'
            return new NBTTagEnd();

        case 1: // '\001'
            return new NBTTagByte(p_739_1_);

        case 2: // '\002'
            return new NBTTagShort(p_739_1_);

        case 3: // '\003'
            return new NBTTagInt(p_739_1_);

        case 4: // '\004'
            return new NBTTagLong(p_739_1_);

        case 5: // '\005'
            return new NBTTagFloat(p_739_1_);

        case 6: // '\006'
            return new NBTTagDouble(p_739_1_);

        case 7: // '\007'
            return new NBTTagByteArray(p_739_1_);

        case 11: // '\013'
            return new NBTTagIntArray(p_739_1_);

        case 8: // '\b'
            return new NBTTagString(p_739_1_);

        case 9: // '\t'
            return new NBTTagList(p_739_1_);

        case 10: // '\n'
            return new NBTTagCompound(p_739_1_);
        }
        return null;
    }

    public static String func_731_b(byte p_731_0_)
    {
        switch(p_731_0_)
        {
        case 0: // '\0'
            return "TAG_End";

        case 1: // '\001'
            return "TAG_Byte";

        case 2: // '\002'
            return "TAG_Short";

        case 3: // '\003'
            return "TAG_Int";

        case 4: // '\004'
            return "TAG_Long";

        case 5: // '\005'
            return "TAG_Float";

        case 6: // '\006'
            return "TAG_Double";

        case 7: // '\007'
            return "TAG_Byte_Array";

        case 11: // '\013'
            return "TAG_Int_Array";

        case 8: // '\b'
            return "TAG_String";

        case 9: // '\t'
            return "TAG_List";

        case 10: // '\n'
            return "TAG_Compound";
        }
        return "UNKNOWN";
    }

    public abstract NBTBase func_40195_b();

    public boolean equals(Object p_equals_1_)
    {
        if(p_equals_1_ == null || !(p_equals_1_ instanceof NBTBase))
        {
            return false;
        }
        NBTBase nbtbase = (NBTBase)p_equals_1_;
        if(func_733_a() != nbtbase.func_733_a())
        {
            return false;
        }
        if(field_1087_a == null && nbtbase.field_1087_a != null || field_1087_a != null && nbtbase.field_1087_a == null)
        {
            return false;
        }
        return field_1087_a == null || field_1087_a.equals(nbtbase.field_1087_a);
    }

    public int hashCode()
    {
        return field_1087_a.hashCode() ^ func_733_a();
    }
}
