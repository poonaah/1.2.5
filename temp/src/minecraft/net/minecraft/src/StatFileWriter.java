// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import argo.jdom.*;
import argo.saj.InvalidSyntaxException;
import java.io.File;
import java.io.PrintStream;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StatsSyncher, StatBase, StatList, MD5String, 
//            Achievement, Session

public class StatFileWriter
{

    private Map field_25102_a;
    private Map field_25101_b;
    private boolean field_27189_c;
    private StatsSyncher field_27188_d;

    public StatFileWriter(Session p_i195_1_, File p_i195_2_)
    {
        field_25102_a = new HashMap();
        field_25101_b = new HashMap();
        field_27189_c = false;
        File file = new File(p_i195_2_, "stats");
        if(!file.exists())
        {
            file.mkdir();
        }
        File afile[] = p_i195_2_.listFiles();
        int i = afile.length;
        for(int j = 0; j < i; j++)
        {
            File file1 = afile[j];
            if(!file1.getName().startsWith("stats_") || !file1.getName().endsWith(".dat"))
            {
                continue;
            }
            File file2 = new File(file, file1.getName());
            if(!file2.exists())
            {
                System.out.println((new StringBuilder()).append("Relocating ").append(file1.getName()).toString());
                file1.renameTo(file2);
            }
        }

        field_27188_d = new StatsSyncher(p_i195_1_, this, file);
    }

    public void func_25100_a(StatBase p_25100_1_, int p_25100_2_)
    {
        func_27186_a(field_25101_b, p_25100_1_, p_25100_2_);
        func_27186_a(field_25102_a, p_25100_1_, p_25100_2_);
        field_27189_c = true;
    }

    private void func_27186_a(Map p_27186_1_, StatBase p_27186_2_, int p_27186_3_)
    {
        Integer integer = (Integer)p_27186_1_.get(p_27186_2_);
        int i = integer != null ? integer.intValue() : 0;
        p_27186_1_.put(p_27186_2_, Integer.valueOf(i + p_27186_3_));
    }

    public Map func_27176_a()
    {
        return new HashMap(field_25101_b);
    }

    public void func_27179_a(Map p_27179_1_)
    {
        if(p_27179_1_ == null)
        {
            return;
        }
        field_27189_c = true;
        StatBase statbase;
        for(Iterator iterator = p_27179_1_.keySet().iterator(); iterator.hasNext(); func_27186_a(field_25102_a, statbase, ((Integer)p_27179_1_.get(statbase)).intValue()))
        {
            statbase = (StatBase)iterator.next();
            func_27186_a(field_25101_b, statbase, ((Integer)p_27179_1_.get(statbase)).intValue());
        }

    }

    public void func_27180_b(Map p_27180_1_)
    {
        if(p_27180_1_ == null)
        {
            return;
        }
        StatBase statbase;
        int i;
        for(Iterator iterator = p_27180_1_.keySet().iterator(); iterator.hasNext(); field_25102_a.put(statbase, Integer.valueOf(((Integer)p_27180_1_.get(statbase)).intValue() + i)))
        {
            statbase = (StatBase)iterator.next();
            Integer integer = (Integer)field_25101_b.get(statbase);
            i = integer != null ? integer.intValue() : 0;
        }

    }

    public void func_27187_c(Map p_27187_1_)
    {
        if(p_27187_1_ == null)
        {
            return;
        }
        field_27189_c = true;
        StatBase statbase;
        for(Iterator iterator = p_27187_1_.keySet().iterator(); iterator.hasNext(); func_27186_a(field_25101_b, statbase, ((Integer)p_27187_1_.get(statbase)).intValue()))
        {
            statbase = (StatBase)iterator.next();
        }

    }

    public static Map func_27177_a(String p_27177_0_)
    {
        HashMap hashmap = new HashMap();
        try
        {
            String s = "local";
            StringBuilder stringbuilder = new StringBuilder();
            JsonRootNode jsonrootnode = (new JdomParser()).func_27367_a(p_27177_0_);
            List list = jsonrootnode.func_27217_b(new Object[] {
                "stats-change"
            });
            for(Iterator iterator = list.iterator(); iterator.hasNext();)
            {
                JsonNode jsonnode = (JsonNode)iterator.next();
                Map map = jsonnode.func_27214_c();
                java.util.Map.Entry entry = (java.util.Map.Entry)map.entrySet().iterator().next();
                int i = Integer.parseInt(((JsonStringNode)entry.getKey()).func_27216_b());
                int j = Integer.parseInt(((JsonNode)entry.getValue()).func_27216_b());
                StatBase statbase = StatList.func_27361_a(i);
                if(statbase == null)
                {
                    System.out.println((new StringBuilder()).append(i).append(" is not a valid stat").toString());
                } else
                {
                    stringbuilder.append(StatList.func_27361_a(i).field_25069_f).append(",");
                    stringbuilder.append(j).append(",");
                    hashmap.put(statbase, Integer.valueOf(j));
                }
            }

            MD5String md5string = new MD5String(s);
            String s1 = md5string.func_27369_a(stringbuilder.toString());
            if(!s1.equals(jsonrootnode.func_27213_a(new Object[] {
    "checksum"
})))
            {
                System.out.println("CHECKSUM MISMATCH");
                return null;
            }
        }
        catch(InvalidSyntaxException invalidsyntaxexception)
        {
            invalidsyntaxexception.printStackTrace();
        }
        return hashmap;
    }

    public static String func_27185_a(String p_27185_0_, String p_27185_1_, Map p_27185_2_)
    {
        StringBuilder stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1 = new StringBuilder();
        boolean flag = true;
        stringbuilder.append("{\r\n");
        if(p_27185_0_ != null && p_27185_1_ != null)
        {
            stringbuilder.append("  \"user\":{\r\n");
            stringbuilder.append("    \"name\":\"").append(p_27185_0_).append("\",\r\n");
            stringbuilder.append("    \"sessionid\":\"").append(p_27185_1_).append("\"\r\n");
            stringbuilder.append("  },\r\n");
        }
        stringbuilder.append("  \"stats-change\":[");
        StatBase statbase;
        for(Iterator iterator = p_27185_2_.keySet().iterator(); iterator.hasNext(); stringbuilder1.append(p_27185_2_.get(statbase)).append(","))
        {
            statbase = (StatBase)iterator.next();
            if(!flag)
            {
                stringbuilder.append("},");
            } else
            {
                flag = false;
            }
            stringbuilder.append("\r\n    {\"").append(statbase.field_25071_d).append("\":").append(p_27185_2_.get(statbase));
            stringbuilder1.append(statbase.field_25069_f).append(",");
        }

        if(!flag)
        {
            stringbuilder.append("}");
        }
        MD5String md5string = new MD5String(p_27185_1_);
        stringbuilder.append("\r\n  ],\r\n");
        stringbuilder.append("  \"checksum\":\"").append(md5string.func_27369_a(stringbuilder1.toString())).append("\"\r\n");
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public boolean func_27183_a(Achievement p_27183_1_)
    {
        return field_25102_a.containsKey(p_27183_1_);
    }

    public boolean func_27181_b(Achievement p_27181_1_)
    {
        return p_27181_1_.field_25076_c == null || func_27183_a(p_27181_1_.field_25076_c);
    }

    public int func_27184_a(StatBase p_27184_1_)
    {
        Integer integer = (Integer)field_25102_a.get(p_27184_1_);
        return integer != null ? integer.intValue() : 0;
    }

    public void func_27175_b()
    {
    }

    public void func_27182_c()
    {
        field_27188_d.func_27407_b(func_27176_a());
    }

    public void func_27178_d()
    {
        if(field_27189_c && field_27188_d.func_27420_b())
        {
            field_27188_d.func_27424_a(func_27176_a());
        }
        field_27188_d.func_27425_c();
    }
}
