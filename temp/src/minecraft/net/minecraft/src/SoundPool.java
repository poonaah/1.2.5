// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            SoundPoolEntry

public class SoundPool
{

    private Random field_1661_c;
    private Map field_1660_d;
    private List field_1659_e;
    public int field_1658_a;
    public boolean field_1657_b;

    public SoundPool()
    {
        field_1661_c = new Random();
        field_1660_d = new HashMap();
        field_1659_e = new ArrayList();
        field_1658_a = 0;
        field_1657_b = true;
    }

    public SoundPoolEntry func_1117_a(String p_1117_1_, File p_1117_2_)
    {
        try
        {
            String s = p_1117_1_;
            p_1117_1_ = p_1117_1_.substring(0, p_1117_1_.indexOf("."));
            if(field_1657_b)
            {
                for(; Character.isDigit(p_1117_1_.charAt(p_1117_1_.length() - 1)); p_1117_1_ = p_1117_1_.substring(0, p_1117_1_.length() - 1)) { }
            }
            p_1117_1_ = p_1117_1_.replaceAll("/", ".");
            if(!field_1660_d.containsKey(p_1117_1_))
            {
                field_1660_d.put(p_1117_1_, new ArrayList());
            }
            SoundPoolEntry soundpoolentry = new SoundPoolEntry(s, p_1117_2_.toURI().toURL());
            ((List)field_1660_d.get(p_1117_1_)).add(soundpoolentry);
            field_1659_e.add(soundpoolentry);
            field_1658_a++;
            return soundpoolentry;
        }
        catch(MalformedURLException malformedurlexception)
        {
            malformedurlexception.printStackTrace();
            throw new RuntimeException(malformedurlexception);
        }
    }

    public SoundPoolEntry func_1118_a(String p_1118_1_)
    {
        List list = (List)field_1660_d.get(p_1118_1_);
        if(list == null)
        {
            return null;
        } else
        {
            return (SoundPoolEntry)list.get(field_1661_c.nextInt(list.size()));
        }
    }

    public SoundPoolEntry func_1116_a()
    {
        if(field_1659_e.size() == 0)
        {
            return null;
        } else
        {
            return (SoundPoolEntry)field_1659_e.get(field_1661_c.nextInt(field_1659_e.size()));
        }
    }
}
