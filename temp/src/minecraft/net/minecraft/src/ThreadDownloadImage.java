// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;

// Referenced classes of package net.minecraft.src:
//            ThreadDownloadImageData, ImageBuffer

class ThreadDownloadImage extends Thread
{

    final String field_1216_a; /* synthetic field */
    final ImageBuffer field_1215_b; /* synthetic field */
    final ThreadDownloadImageData field_1217_c; /* synthetic field */

    ThreadDownloadImage(ThreadDownloadImageData p_i133_1_, String p_i133_2_, ImageBuffer p_i133_3_)
    {
        field_1217_c = p_i133_1_;
        field_1216_a = p_i133_2_;
        field_1215_b = p_i133_3_;
        super();
    }

    public void run()
    {
        HttpURLConnection httpurlconnection = null;
        try
        {
            URL url = new URL(field_1216_a);
            httpurlconnection = (HttpURLConnection)url.openConnection();
            httpurlconnection.setDoInput(true);
            httpurlconnection.setDoOutput(false);
            httpurlconnection.connect();
            if(httpurlconnection.getResponseCode() / 100 == 4)
            {
                return;
            }
            if(field_1215_b == null)
            {
                field_1217_c.field_1706_a = ImageIO.read(httpurlconnection.getInputStream());
            } else
            {
                field_1217_c.field_1706_a = field_1215_b.func_883_a(ImageIO.read(httpurlconnection.getInputStream()));
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        finally
        {
            httpurlconnection.disconnect();
        }
    }
}
