// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package net.minecraft.src:
//            PlayerUsageSnooperThread

public class PlayerUsageSnooper
{

    private Map field_52025_a;
    private final URL field_52024_b;

    public PlayerUsageSnooper(String p_i1300_1_)
    {
        field_52025_a = new HashMap();
        try
        {
            field_52024_b = new URL((new StringBuilder()).append("http://snoop.minecraft.net/").append(p_i1300_1_).toString());
        }
        catch(MalformedURLException malformedurlexception)
        {
            throw new IllegalArgumentException();
        }
    }

    public void func_52022_a(String p_52022_1_, Object p_52022_2_)
    {
        field_52025_a.put(p_52022_1_, p_52022_2_);
    }

    public void func_52021_a()
    {
        PlayerUsageSnooperThread playerusagesnooperthread = new PlayerUsageSnooperThread(this, "reporter");
        playerusagesnooperthread.setDaemon(true);
        playerusagesnooperthread.start();
    }

    static URL func_52023_a(PlayerUsageSnooper p_52023_0_)
    {
        return p_52023_0_.field_52024_b;
    }

    static Map func_52020_b(PlayerUsageSnooper p_52020_0_)
    {
        return p_52020_0_.field_52025_a;
    }
}
