// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.*;

public class StringTranslate
{

    private static StringTranslate field_20165_a = new StringTranslate();
    private Properties field_20164_b;
    private TreeMap field_44027_c;
    private String field_44026_d;
    private boolean field_46111_e;

    private StringTranslate()
    {
        field_20164_b = new Properties();
        func_44021_d();
        func_44023_a("en_US");
    }

    public static StringTranslate func_20162_a()
    {
        return field_20165_a;
    }

    private void func_44021_d()
    {
        TreeMap treemap = new TreeMap();
        try
        {
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader((net.minecraft.src.StringTranslate.class).getResourceAsStream("/lang/languages.txt"), "UTF-8"));
            for(String s = bufferedreader.readLine(); s != null; s = bufferedreader.readLine())
            {
                String as[] = s.split("=");
                if(as != null && as.length == 2)
                {
                    treemap.put(as[0], as[1]);
                }
            }

        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
            return;
        }
        field_44027_c = treemap;
    }

    public TreeMap func_44022_b()
    {
        return field_44027_c;
    }

    private void func_44025_a(Properties p_44025_1_, String p_44025_2_)
        throws IOException
    {
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader((net.minecraft.src.StringTranslate.class).getResourceAsStream((new StringBuilder()).append("/lang/").append(p_44025_2_).append(".lang").toString()), "UTF-8"));
        for(String s = bufferedreader.readLine(); s != null; s = bufferedreader.readLine())
        {
            s = s.trim();
            if(s.startsWith("#"))
            {
                continue;
            }
            String as[] = s.split("=");
            if(as != null && as.length == 2)
            {
                p_44025_1_.setProperty(as[0], as[1]);
            }
        }

    }

    public void func_44023_a(String p_44023_1_)
    {
        Properties properties;
        if(p_44023_1_.equals(field_44026_d))
        {
            return;
        }
        properties = new Properties();
        try
        {
            func_44025_a(properties, "en_US");
        }
        catch(IOException ioexception) { }
        field_46111_e = false;
        if("en_US".equals(p_44023_1_))
        {
            break MISSING_BLOCK_LABEL_152;
        }
        Enumeration enumeration;
        func_44025_a(properties, p_44023_1_);
        enumeration = properties.propertyNames();
_L2:
        String s;
        int i;
        Object obj1;
        do
        {
            if(!enumeration.hasMoreElements() || field_46111_e)
            {
                break MISSING_BLOCK_LABEL_152;
            }
            Object obj = enumeration.nextElement();
            obj1 = properties.get(obj);
        } while(obj1 == null);
        s = obj1.toString();
        i = 0;
_L5:
        if(i >= s.length()) goto _L2; else goto _L1
_L1:
        if(s.charAt(i) < '\u0100') goto _L4; else goto _L3
_L3:
        field_46111_e = true;
          goto _L2
_L4:
        i++;
          goto _L5
        IOException ioexception1;
        ioexception1;
        ioexception1.printStackTrace();
        return;
        field_44026_d = p_44023_1_;
        field_20164_b = properties;
        return;
          goto _L2
    }

    public String func_44024_c()
    {
        return field_44026_d;
    }

    public boolean func_46110_d()
    {
        return field_46111_e;
    }

    public String func_20163_a(String p_20163_1_)
    {
        return field_20164_b.getProperty(p_20163_1_, p_20163_1_);
    }

    public String func_20160_a(String p_20160_1_, Object p_20160_2_[])
    {
        String s = field_20164_b.getProperty(p_20160_1_, p_20160_1_);
        return String.format(s, p_20160_2_);
    }

    public String func_20161_b(String p_20161_1_)
    {
        return field_20164_b.getProperty((new StringBuilder()).append(p_20161_1_).append(".name").toString(), "");
    }

    public static boolean func_46109_d(String p_46109_0_)
    {
        return "ar_SA".equals(p_46109_0_) || "he_IL".equals(p_46109_0_);
    }

}
