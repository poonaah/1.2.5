// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package net.minecraft.src:
//            NBTBase, NBTTagCompound

public class CompressedStreamTools
{

    public CompressedStreamTools()
    {
    }

    public static NBTTagCompound func_1138_a(InputStream p_1138_0_)
        throws IOException
    {
        DataInputStream datainputstream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(p_1138_0_)));
        try
        {
            NBTTagCompound nbttagcompound = func_1141_a(datainputstream);
            return nbttagcompound;
        }
        finally
        {
            datainputstream.close();
        }
    }

    public static void func_1143_a(NBTTagCompound p_1143_0_, OutputStream p_1143_1_)
        throws IOException
    {
        DataOutputStream dataoutputstream = new DataOutputStream(new GZIPOutputStream(p_1143_1_));
        try
        {
            func_1139_a(p_1143_0_, dataoutputstream);
        }
        finally
        {
            dataoutputstream.close();
        }
    }

    public static NBTTagCompound func_40592_a(byte p_40592_0_[])
        throws IOException
    {
        DataInputStream datainputstream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(p_40592_0_))));
        try
        {
            NBTTagCompound nbttagcompound = func_1141_a(datainputstream);
            return nbttagcompound;
        }
        finally
        {
            datainputstream.close();
        }
    }

    public static byte[] func_40591_a(NBTTagCompound p_40591_0_)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        DataOutputStream dataoutputstream = new DataOutputStream(new GZIPOutputStream(bytearrayoutputstream));
        try
        {
            func_1139_a(p_40591_0_, dataoutputstream);
        }
        finally
        {
            dataoutputstream.close();
        }
        return bytearrayoutputstream.toByteArray();
    }

    public static void func_35621_a(NBTTagCompound p_35621_0_, File p_35621_1_)
        throws IOException
    {
        File file = new File((new StringBuilder()).append(p_35621_1_.getAbsolutePath()).append("_tmp").toString());
        if(file.exists())
        {
            file.delete();
        }
        func_35620_b(p_35621_0_, file);
        if(p_35621_1_.exists())
        {
            p_35621_1_.delete();
        }
        if(p_35621_1_.exists())
        {
            throw new IOException((new StringBuilder()).append("Failed to delete ").append(p_35621_1_).toString());
        } else
        {
            file.renameTo(p_35621_1_);
            return;
        }
    }

    public static void func_35620_b(NBTTagCompound p_35620_0_, File p_35620_1_)
        throws IOException
    {
        DataOutputStream dataoutputstream = new DataOutputStream(new FileOutputStream(p_35620_1_));
        try
        {
            func_1139_a(p_35620_0_, dataoutputstream);
        }
        finally
        {
            dataoutputstream.close();
        }
    }

    public static NBTTagCompound func_35622_a(File p_35622_0_)
        throws IOException
    {
        if(!p_35622_0_.exists())
        {
            return null;
        }
        DataInputStream datainputstream = new DataInputStream(new FileInputStream(p_35622_0_));
        try
        {
            NBTTagCompound nbttagcompound = func_1141_a(datainputstream);
            return nbttagcompound;
        }
        finally
        {
            datainputstream.close();
        }
    }

    public static NBTTagCompound func_1141_a(DataInput p_1141_0_)
        throws IOException
    {
        NBTBase nbtbase = NBTBase.func_734_b(p_1141_0_);
        if(nbtbase instanceof NBTTagCompound)
        {
            return (NBTTagCompound)nbtbase;
        } else
        {
            throw new IOException("Root tag must be a named compound tag");
        }
    }

    public static void func_1139_a(NBTTagCompound p_1139_0_, DataOutput p_1139_1_)
        throws IOException
    {
        NBTBase.func_738_a(p_1139_0_, p_1139_1_);
    }
}
