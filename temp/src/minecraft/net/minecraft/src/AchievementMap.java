// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AchievementMap
{

    public static AchievementMap field_25210_a = new AchievementMap();
    private Map field_25209_b;

    private AchievementMap()
    {
        field_25209_b = new HashMap();
        try
        {
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader((net.minecraft.src.AchievementMap.class).getResourceAsStream("/achievement/map.txt")));
            String s;
            while((s = bufferedreader.readLine()) != null) 
            {
                String as[] = s.split(",");
                int i = Integer.parseInt(as[0]);
                field_25209_b.put(Integer.valueOf(i), as[1]);
            }
            bufferedreader.close();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public static String func_25208_a(int p_25208_0_)
    {
        return (String)field_25210_a.field_25209_b.get(Integer.valueOf(p_25208_0_));
    }

}
