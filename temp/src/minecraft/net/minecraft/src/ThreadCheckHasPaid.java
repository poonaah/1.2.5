// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.net.HttpURLConnection;
import java.net.URL;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            Session

public class ThreadCheckHasPaid extends Thread
{

    final Minecraft field_28146_a; /* synthetic field */

    public ThreadCheckHasPaid(Minecraft p_i360_1_)
    {
        field_28146_a = p_i360_1_;
        super();
    }

    public void run()
    {
        try
        {
            HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL((new StringBuilder()).append("https://login.minecraft.net/session?name=").append(field_28146_a.field_6320_i.field_1666_b).append("&session=").append(field_28146_a.field_6320_i.field_6543_c).toString())).openConnection();
            httpurlconnection.connect();
            if(httpurlconnection.getResponseCode() == 400 && this == null)
            {
                Minecraft.field_28005_H = System.currentTimeMillis();
            }
            httpurlconnection.disconnect();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
