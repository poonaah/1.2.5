// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            ISaveFormat, SaveFormatComparator, WorldInfo, CompressedStreamTools, 
//            NBTTagCompound, SaveHandler, ISaveHandler, IProgressUpdate

public class SaveFormatOld
    implements ISaveFormat
{

    protected final File field_22180_a;

    public SaveFormatOld(File p_i136_1_)
    {
        if(!p_i136_1_.exists())
        {
            p_i136_1_.mkdirs();
        }
        field_22180_a = p_i136_1_;
    }

    public String func_22178_a()
    {
        return "Old Format";
    }

    public List func_22176_b()
    {
        ArrayList arraylist = new ArrayList();
        for(int i = 0; i < 5; i++)
        {
            String s = (new StringBuilder()).append("World").append(i + 1).toString();
            WorldInfo worldinfo = func_22173_b(s);
            if(worldinfo != null)
            {
                arraylist.add(new SaveFormatComparator(s, "", worldinfo.func_22301_l(), worldinfo.func_22306_g(), worldinfo.func_35918_q(), false, worldinfo.func_40724_s()));
            }
        }

        return arraylist;
    }

    public void func_22177_c()
    {
    }

    public WorldInfo func_22173_b(String p_22173_1_)
    {
        File file = new File(field_22180_a, p_22173_1_);
        if(!file.exists())
        {
            return null;
        }
        File file1 = new File(file, "level.dat");
        if(file1.exists())
        {
            try
            {
                NBTTagCompound nbttagcompound = CompressedStreamTools.func_1138_a(new FileInputStream(file1));
                NBTTagCompound nbttagcompound2 = nbttagcompound.func_743_k("Data");
                return new WorldInfo(nbttagcompound2);
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }
        }
        file1 = new File(file, "level.dat_old");
        if(file1.exists())
        {
            try
            {
                NBTTagCompound nbttagcompound1 = CompressedStreamTools.func_1138_a(new FileInputStream(file1));
                NBTTagCompound nbttagcompound3 = nbttagcompound1.func_743_k("Data");
                return new WorldInfo(nbttagcompound3);
            }
            catch(Exception exception1)
            {
                exception1.printStackTrace();
            }
        }
        return null;
    }

    public void func_22170_a(String p_22170_1_, String p_22170_2_)
    {
        File file = new File(field_22180_a, p_22170_1_);
        if(!file.exists())
        {
            return;
        }
        File file1 = new File(file, "level.dat");
        if(file1.exists())
        {
            try
            {
                NBTTagCompound nbttagcompound = CompressedStreamTools.func_1138_a(new FileInputStream(file1));
                NBTTagCompound nbttagcompound1 = nbttagcompound.func_743_k("Data");
                nbttagcompound1.func_754_a("LevelName", p_22170_2_);
                CompressedStreamTools.func_1143_a(nbttagcompound, new FileOutputStream(file1));
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }
        }
    }

    public void func_22172_c(String p_22172_1_)
    {
        File file = new File(field_22180_a, p_22172_1_);
        if(!file.exists())
        {
            return;
        } else
        {
            func_22179_a(file.listFiles());
            file.delete();
            return;
        }
    }

    protected static void func_22179_a(File p_22179_0_[])
    {
        for(int i = 0; i < p_22179_0_.length; i++)
        {
            if(p_22179_0_[i].isDirectory())
            {
                System.out.println((new StringBuilder()).append("Deleting ").append(p_22179_0_[i]).toString());
                func_22179_a(p_22179_0_[i].listFiles());
            }
            p_22179_0_[i].delete();
        }

    }

    public ISaveHandler func_22174_a(String p_22174_1_, boolean p_22174_2_)
    {
        return new SaveHandler(field_22180_a, p_22174_1_, p_22174_2_);
    }

    public boolean func_22175_a(String p_22175_1_)
    {
        return false;
    }

    public boolean func_22171_a(String p_22171_1_, IProgressUpdate p_22171_2_)
    {
        return false;
    }
}
