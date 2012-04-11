// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            ProfilerResult

public class Profiler
{

    public static boolean field_40669_a = false;
    private static List field_40667_b = new ArrayList();
    private static List field_40668_c = new ArrayList();
    private static String field_40665_d = "";
    private static Map field_40666_e = new HashMap();
    public static boolean profilerGlobalEnabled;
    private static boolean profilerLocalEnabled;

    public Profiler()
    {
    }

    public static void func_40660_a()
    {
        field_40666_e.clear();
        profilerLocalEnabled = profilerGlobalEnabled;
    }

    public static void func_40663_a(String p_40663_0_)
    {
        if(!profilerLocalEnabled)
        {
            return;
        }
        if(!field_40669_a)
        {
            return;
        }
        if(field_40665_d.length() > 0)
        {
            field_40665_d = (new StringBuilder()).append(field_40665_d).append(".").toString();
        }
        field_40665_d = (new StringBuilder()).append(field_40665_d).append(p_40663_0_).toString();
        field_40667_b.add(field_40665_d);
        field_40668_c.add(Long.valueOf(System.nanoTime()));
    }

    public static void func_40662_b()
    {
        if(!profilerLocalEnabled)
        {
            return;
        }
        if(!field_40669_a)
        {
            return;
        }
        long l = System.nanoTime();
        long l1 = ((Long)field_40668_c.remove(field_40668_c.size() - 1)).longValue();
        field_40667_b.remove(field_40667_b.size() - 1);
        long l2 = l - l1;
        if(field_40666_e.containsKey(field_40665_d))
        {
            field_40666_e.put(field_40665_d, Long.valueOf(((Long)field_40666_e.get(field_40665_d)).longValue() + l2));
        } else
        {
            field_40666_e.put(field_40665_d, Long.valueOf(l2));
        }
        field_40665_d = field_40667_b.size() > 0 ? (String)field_40667_b.get(field_40667_b.size() - 1) : "";
        if(l2 <= 0x5f5e100L);
    }

    public static List func_40664_b(String p_40664_0_)
    {
        profilerLocalEnabled = profilerGlobalEnabled;
        if(!profilerLocalEnabled)
        {
            return new ArrayList(Arrays.asList(new ProfilerResult[] {
                new ProfilerResult("root", 0.0D, 0.0D)
            }));
        }
        if(!field_40669_a)
        {
            return null;
        }
        String s = p_40664_0_;
        long l = field_40666_e.containsKey("root") ? ((Long)field_40666_e.get("root")).longValue() : 0L;
        long l1 = field_40666_e.containsKey(p_40664_0_) ? ((Long)field_40666_e.get(p_40664_0_)).longValue() : -1L;
        ArrayList arraylist = new ArrayList();
        if(p_40664_0_.length() > 0)
        {
            p_40664_0_ = (new StringBuilder()).append(p_40664_0_).append(".").toString();
        }
        long l2 = 0L;
        Iterator iterator = field_40666_e.keySet().iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if(s1.length() > p_40664_0_.length() && s1.startsWith(p_40664_0_) && s1.indexOf(".", p_40664_0_.length() + 1) < 0)
            {
                l2 += ((Long)field_40666_e.get(s1)).longValue();
            }
        } while(true);
        float f = l2;
        if(l2 < l1)
        {
            l2 = l1;
        }
        if(l < l2)
        {
            l = l2;
        }
        Iterator iterator1 = field_40666_e.keySet().iterator();
        do
        {
            if(!iterator1.hasNext())
            {
                break;
            }
            String s2 = (String)iterator1.next();
            if(s2.length() > p_40664_0_.length() && s2.startsWith(p_40664_0_) && s2.indexOf(".", p_40664_0_.length() + 1) < 0)
            {
                long l3 = ((Long)field_40666_e.get(s2)).longValue();
                double d = ((double)l3 * 100D) / (double)l2;
                double d1 = ((double)l3 * 100D) / (double)l;
                String s4 = s2.substring(p_40664_0_.length());
                arraylist.add(new ProfilerResult(s4, d, d1));
            }
        } while(true);
        String s3;
        for(Iterator iterator2 = field_40666_e.keySet().iterator(); iterator2.hasNext(); field_40666_e.put(s3, Long.valueOf((((Long)field_40666_e.get(s3)).longValue() * 999L) / 1000L)))
        {
            s3 = (String)iterator2.next();
        }

        if((float)l2 > f)
        {
            arraylist.add(new ProfilerResult("unspecified", ((double)((float)l2 - f) * 100D) / (double)l2, ((double)((float)l2 - f) * 100D) / (double)l));
        }
        Collections.sort(arraylist);
        arraylist.add(0, new ProfilerResult(s, 100D, ((double)l2 * 100D) / (double)l));
        return arraylist;
    }

    public static void func_40661_c(String p_40661_0_)
    {
        if(!profilerLocalEnabled)
        {
            return;
        } else
        {
            func_40662_b();
            func_40663_a(p_40661_0_);
            return;
        }
    }

    static 
    {
        profilerGlobalEnabled = true;
        profilerLocalEnabled = profilerGlobalEnabled;
    }
}
