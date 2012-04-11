// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            SaveFormatOld, WorldInfo, MathHelper, SaveFormatComparator, 
//            RegionFileCache, AnvilSaveHandler, IProgressUpdate, WorldType, 
//            WorldChunkManagerHell, BiomeGenBase, WorldChunkManager, ISaveHandler, 
//            RegionFile, CompressedStreamTools, NBTTagCompound, ChunkLoader, 
//            AnvilSaveConverterFileFilter

public class AnvilSaveConverter extends SaveFormatOld
{

    public AnvilSaveConverter(File p_i1034_1_)
    {
        super(p_i1034_1_);
    }

    public String func_22178_a()
    {
        return "Anvil";
    }

    public List func_22176_b()
    {
        ArrayList arraylist = new ArrayList();
        File afile[] = field_22180_a.listFiles();
        File afile1[] = afile;
        int i = afile1.length;
        for(int j = 0; j < i; j++)
        {
            File file = afile1[j];
            if(!file.isDirectory())
            {
                continue;
            }
            String s = file.getName();
            WorldInfo worldinfo = func_22173_b(s);
            if(worldinfo == null || worldinfo.func_22296_k() != 19132 && worldinfo.func_22296_k() != 19133)
            {
                continue;
            }
            boolean flag = worldinfo.func_22296_k() != func_48431_c();
            String s1 = worldinfo.func_22302_j();
            if(s1 == null || MathHelper.func_22282_a(s1))
            {
                s1 = s;
            }
            long l = 0L;
            arraylist.add(new SaveFormatComparator(s, s1, worldinfo.func_22301_l(), l, worldinfo.func_35918_q(), flag, worldinfo.func_40724_s()));
        }

        return arraylist;
    }

    protected int func_48431_c()
    {
        return 19133;
    }

    public void func_22177_c()
    {
        RegionFileCache.func_22192_a();
    }

    public ISaveHandler func_22174_a(String p_22174_1_, boolean p_22174_2_)
    {
        return new AnvilSaveHandler(field_22180_a, p_22174_1_, p_22174_2_);
    }

    public boolean func_22175_a(String p_22175_1_)
    {
        WorldInfo worldinfo = func_22173_b(p_22175_1_);
        return worldinfo != null && worldinfo.func_22296_k() != func_48431_c();
    }

    public boolean func_22171_a(String p_22171_1_, IProgressUpdate p_22171_2_)
    {
        p_22171_2_.func_593_a(0);
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        File file = new File(field_22180_a, p_22171_1_);
        File file1 = new File(file, "DIM-1");
        File file2 = new File(file, "DIM1");
        System.out.println("Scanning folders...");
        func_48432_a(file, arraylist);
        if(file1.exists())
        {
            func_48432_a(file1, arraylist1);
        }
        if(file2.exists())
        {
            func_48432_a(file2, arraylist2);
        }
        int i = arraylist.size() + arraylist1.size() + arraylist2.size();
        System.out.println((new StringBuilder()).append("Total conversion count is ").append(i).toString());
        WorldInfo worldinfo = func_22173_b(p_22171_1_);
        Object obj = null;
        if(worldinfo.func_46133_t() == WorldType.field_48636_c)
        {
            obj = new WorldChunkManagerHell(BiomeGenBase.field_35485_c, 0.5F, 0.5F);
        } else
        {
            obj = new WorldChunkManager(worldinfo.func_22288_b(), worldinfo.func_46133_t());
        }
        func_48428_a(new File(file, "region"), arraylist, ((WorldChunkManager) (obj)), 0, i, p_22171_2_);
        func_48428_a(new File(file1, "region"), arraylist1, new WorldChunkManagerHell(BiomeGenBase.field_4245_l, 1.0F, 0.0F), arraylist.size(), i, p_22171_2_);
        func_48428_a(new File(file2, "region"), arraylist2, new WorldChunkManagerHell(BiomeGenBase.field_28057_m, 0.5F, 0.0F), arraylist.size() + arraylist1.size(), i, p_22171_2_);
        worldinfo.func_22289_d(19133);
        if(worldinfo.func_46133_t() == WorldType.field_48634_d)
        {
            worldinfo.func_48619_a(WorldType.field_48635_b);
        }
        func_48429_d(p_22171_1_);
        ISaveHandler isavehandler = func_22174_a(p_22171_1_, false);
        isavehandler.func_22152_a(worldinfo);
        return true;
    }

    private void func_48429_d(String p_48429_1_)
    {
        File file = new File(field_22180_a, p_48429_1_);
        if(!file.exists())
        {
            System.out.println("Warning: Unable to create level.dat_mcr backup");
            return;
        }
        File file1 = new File(file, "level.dat");
        if(!file1.exists())
        {
            System.out.println("Warning: Unable to create level.dat_mcr backup");
            return;
        }
        File file2 = new File(file, "level.dat_mcr");
        if(!file1.renameTo(file2))
        {
            System.out.println("Warning: Unable to create level.dat_mcr backup");
        }
    }

    private void func_48428_a(File p_48428_1_, ArrayList p_48428_2_, WorldChunkManager p_48428_3_, int p_48428_4_, int p_48428_5_, IProgressUpdate p_48428_6_)
    {
        int i;
        for(Iterator iterator = p_48428_2_.iterator(); iterator.hasNext(); p_48428_6_.func_593_a(i))
        {
            File file = (File)iterator.next();
            func_48430_a(p_48428_1_, file, p_48428_3_, p_48428_4_, p_48428_5_, p_48428_6_);
            p_48428_4_++;
            i = (int)Math.round((100D * (double)p_48428_4_) / (double)p_48428_5_);
        }

    }

    private void func_48430_a(File p_48430_1_, File p_48430_2_, WorldChunkManager p_48430_3_, int p_48430_4_, int p_48430_5_, IProgressUpdate p_48430_6_)
    {
        try
        {
            String s = p_48430_2_.getName();
            RegionFile regionfile = new RegionFile(p_48430_2_);
            RegionFile regionfile1 = new RegionFile(new File(p_48430_1_, (new StringBuilder()).append(s.substring(0, s.length() - ".mcr".length())).append(".mca").toString()));
            for(int i = 0; i < 32; i++)
            {
                for(int j = 0; j < 32; j++)
                {
                    if(!regionfile.func_22202_c(i, j) || regionfile1.func_22202_c(i, j))
                    {
                        continue;
                    }
                    DataInputStream datainputstream = regionfile.func_22210_a(i, j);
                    if(datainputstream == null)
                    {
                        System.out.println("Failed to fetch input stream");
                    } else
                    {
                        NBTTagCompound nbttagcompound = CompressedStreamTools.func_1141_a(datainputstream);
                        datainputstream.close();
                        NBTTagCompound nbttagcompound1 = nbttagcompound.func_743_k("Level");
                        AnvilConverterData anvilconverterdata = ChunkLoader.func_48485_a(nbttagcompound1);
                        NBTTagCompound nbttagcompound2 = new NBTTagCompound();
                        NBTTagCompound nbttagcompound3 = new NBTTagCompound();
                        nbttagcompound2.func_762_a("Level", nbttagcompound3);
                        ChunkLoader.func_48486_a(anvilconverterdata, nbttagcompound3, p_48430_3_);
                        DataOutputStream dataoutputstream = regionfile1.func_22205_b(i, j);
                        CompressedStreamTools.func_1139_a(nbttagcompound2, dataoutputstream);
                        dataoutputstream.close();
                    }
                }

                int k = (int)Math.round((100D * (double)(p_48430_4_ * 1024)) / (double)(p_48430_5_ * 1024));
                int l = (int)Math.round((100D * (double)((i + 1) * 32 + p_48430_4_ * 1024)) / (double)(p_48430_5_ * 1024));
                if(l > k)
                {
                    p_48430_6_.func_593_a(l);
                }
            }

            regionfile.func_22196_b();
            regionfile1.func_22196_b();
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    private void func_48432_a(File p_48432_1_, ArrayList p_48432_2_)
    {
        File file = new File(p_48432_1_, "region");
        File afile[] = file.listFiles(new AnvilSaveConverterFileFilter(this));
        if(afile != null)
        {
            File afile1[] = afile;
            int i = afile1.length;
            for(int j = 0; j < i; j++)
            {
                File file1 = afile1[j];
                p_48432_2_.add(file1);
            }

        }
    }
}
