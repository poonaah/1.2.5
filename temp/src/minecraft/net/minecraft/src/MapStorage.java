// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            WorldSavedData, ISaveHandler, CompressedStreamTools, NBTTagCompound, 
//            NBTBase, NBTTagShort

public class MapStorage
{

    private ISaveHandler field_28191_a;
    private Map field_28190_b;
    private List field_28193_c;
    private Map field_28192_d;

    public MapStorage(ISaveHandler p_i713_1_)
    {
        field_28190_b = new HashMap();
        field_28193_c = new ArrayList();
        field_28192_d = new HashMap();
        field_28191_a = p_i713_1_;
        func_28187_b();
    }

    public WorldSavedData func_28185_a(Class p_28185_1_, String p_28185_2_)
    {
        WorldSavedData worldsaveddata = (WorldSavedData)field_28190_b.get(p_28185_2_);
        if(worldsaveddata != null)
        {
            return worldsaveddata;
        }
        if(field_28191_a != null)
        {
            try
            {
                File file = field_28191_a.func_28113_a(p_28185_2_);
                if(file != null && file.exists())
                {
                    try
                    {
                        worldsaveddata = (WorldSavedData)p_28185_1_.getConstructor(new Class[] {
                            java.lang.String.class
                        }).newInstance(new Object[] {
                            p_28185_2_
                        });
                    }
                    catch(Exception exception1)
                    {
                        throw new RuntimeException((new StringBuilder()).append("Failed to instantiate ").append(p_28185_1_.toString()).toString(), exception1);
                    }
                    FileInputStream fileinputstream = new FileInputStream(file);
                    NBTTagCompound nbttagcompound = CompressedStreamTools.func_1138_a(fileinputstream);
                    fileinputstream.close();
                    worldsaveddata.func_28163_a(nbttagcompound.func_743_k("data"));
                }
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }
        }
        if(worldsaveddata != null)
        {
            field_28190_b.put(p_28185_2_, worldsaveddata);
            field_28193_c.add(worldsaveddata);
        }
        return worldsaveddata;
    }

    public void func_28184_a(String p_28184_1_, WorldSavedData p_28184_2_)
    {
        if(p_28184_2_ == null)
        {
            throw new RuntimeException("Can't set null data");
        }
        if(field_28190_b.containsKey(p_28184_1_))
        {
            field_28193_c.remove(field_28190_b.remove(p_28184_1_));
        }
        field_28190_b.put(p_28184_1_, p_28184_2_);
        field_28193_c.add(p_28184_2_);
    }

    public void func_28188_a()
    {
        for(int i = 0; i < field_28193_c.size(); i++)
        {
            WorldSavedData worldsaveddata = (WorldSavedData)field_28193_c.get(i);
            if(worldsaveddata.func_28166_b())
            {
                func_28189_a(worldsaveddata);
                worldsaveddata.func_28165_a(false);
            }
        }

    }

    private void func_28189_a(WorldSavedData p_28189_1_)
    {
        if(field_28191_a == null)
        {
            return;
        }
        try
        {
            File file = field_28191_a.func_28113_a(p_28189_1_.field_28168_a);
            if(file != null)
            {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                p_28189_1_.func_28162_b(nbttagcompound);
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.func_763_a("data", nbttagcompound);
                FileOutputStream fileoutputstream = new FileOutputStream(file);
                CompressedStreamTools.func_1143_a(nbttagcompound1, fileoutputstream);
                fileoutputstream.close();
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void func_28187_b()
    {
        try
        {
            field_28192_d.clear();
            if(field_28191_a == null)
            {
                return;
            }
            File file = field_28191_a.func_28113_a("idcounts");
            if(file != null && file.exists())
            {
                DataInputStream datainputstream = new DataInputStream(new FileInputStream(file));
                NBTTagCompound nbttagcompound = CompressedStreamTools.func_1141_a(datainputstream);
                datainputstream.close();
                Iterator iterator = nbttagcompound.func_28110_c().iterator();
                do
                {
                    if(!iterator.hasNext())
                    {
                        break;
                    }
                    NBTBase nbtbase = (NBTBase)iterator.next();
                    if(nbtbase instanceof NBTTagShort)
                    {
                        NBTTagShort nbttagshort = (NBTTagShort)nbtbase;
                        String s = nbttagshort.func_737_b();
                        short word0 = nbttagshort.field_1088_a;
                        field_28192_d.put(s, Short.valueOf(word0));
                    }
                } while(true);
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public int func_28186_a(String p_28186_1_)
    {
        Short short1 = (Short)field_28192_d.get(p_28186_1_);
        if(short1 == null)
        {
            short1 = Short.valueOf((short)0);
        } else
        {
            Short short2 = short1;
            Short short3 = short1 = Short.valueOf((short)(short1.shortValue() + 1));
            Short _tmp = short2;
        }
        field_28192_d.put(p_28186_1_, short1);
        if(field_28191_a == null)
        {
            return short1.shortValue();
        }
        try
        {
            File file = field_28191_a.func_28113_a("idcounts");
            if(file != null)
            {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                String s;
                short word0;
                for(Iterator iterator = field_28192_d.keySet().iterator(); iterator.hasNext(); nbttagcompound.func_749_a(s, word0))
                {
                    s = (String)iterator.next();
                    word0 = ((Short)field_28192_d.get(s)).shortValue();
                }

                DataOutputStream dataoutputstream = new DataOutputStream(new FileOutputStream(file));
                CompressedStreamTools.func_1139_a(nbttagcompound, dataoutputstream);
                dataoutputstream.close();
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return short1.shortValue();
    }
}
