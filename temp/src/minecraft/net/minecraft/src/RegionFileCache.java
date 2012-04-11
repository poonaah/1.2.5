// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            RegionFile

public class RegionFileCache
{

    private static final Map field_22195_a = new HashMap();

    private RegionFileCache()
    {
    }

    public static synchronized RegionFile func_22193_a(File p_22193_0_, int p_22193_1_, int p_22193_2_)
    {
        File file = new File(p_22193_0_, "region");
        File file1 = new File(file, (new StringBuilder()).append("r.").append(p_22193_1_ >> 5).append(".").append(p_22193_2_ >> 5).append(".mca").toString());
        Reference reference = (Reference)field_22195_a.get(file1);
        if(reference != null)
        {
            RegionFile regionfile = (RegionFile)reference.get();
            if(regionfile != null)
            {
                return regionfile;
            }
        }
        if(!file.exists())
        {
            file.mkdirs();
        }
        if(field_22195_a.size() >= 256)
        {
            func_22192_a();
        }
        RegionFile regionfile1 = new RegionFile(file1);
        field_22195_a.put(file1, new SoftReference(regionfile1));
        return regionfile1;
    }

    public static synchronized void func_22192_a()
    {
        Iterator iterator = field_22195_a.values().iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Reference reference = (Reference)iterator.next();
            try
            {
                RegionFile regionfile = (RegionFile)reference.get();
                if(regionfile != null)
                {
                    regionfile.func_22196_b();
                }
            }
            catch(IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        } while(true);
        field_22195_a.clear();
    }

    public static DataInputStream func_22194_c(File p_22194_0_, int p_22194_1_, int p_22194_2_)
    {
        RegionFile regionfile = func_22193_a(p_22194_0_, p_22194_1_, p_22194_2_);
        return regionfile.func_22210_a(p_22194_1_ & 0x1f, p_22194_2_ & 0x1f);
    }

    public static DataOutputStream func_22190_d(File p_22190_0_, int p_22190_1_, int p_22190_2_)
    {
        RegionFile regionfile = func_22193_a(p_22190_0_, p_22190_1_, p_22190_2_);
        return regionfile.func_22205_b(p_22190_1_ & 0x1f, p_22190_2_ & 0x1f);
    }

}
