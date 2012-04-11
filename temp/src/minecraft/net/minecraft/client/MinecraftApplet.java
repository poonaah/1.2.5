// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.client;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.io.PrintStream;
import java.net.URL;
import net.minecraft.src.*;

// Referenced classes of package net.minecraft.client:
//            Minecraft

public class MinecraftApplet extends Applet
{

    private Canvas field_6235_a;
    private Minecraft field_6234_b;
    private Thread field_6236_c;

    public MinecraftApplet()
    {
        field_6236_c = null;
    }

    public void init()
    {
        field_6235_a = new CanvasMinecraftApplet(this);
        boolean flag = false;
        if(getParameter("fullscreen") != null)
        {
            flag = getParameter("fullscreen").equalsIgnoreCase("true");
        }
        field_6234_b = new MinecraftAppletImpl(this, this, field_6235_a, this, getWidth(), getHeight(), flag);
        field_6234_b.field_6319_j = getDocumentBase().getHost();
        if(getDocumentBase().getPort() <= 0) goto _L2; else goto _L1
_L1:
        new StringBuilder();
        field_6234_b;
        JVM INSTR dup_x1 ;
        field_6319_j;
        append();
        ":";
        append();
        getDocumentBase().getPort();
        append();
        toString();
        field_6319_j;
_L2:
        if(getParameter("username") != null && getParameter("sessionid") != null)
        {
            field_6234_b.field_6320_i = new Session(getParameter("username"), getParameter("sessionid"));
            System.out.println((new StringBuilder()).append("Setting user: ").append(field_6234_b.field_6320_i.field_1666_b).append(", ").append(field_6234_b.field_6320_i.field_6543_c).toString());
            if(getParameter("mppass") != null)
            {
                field_6234_b.field_6320_i.field_6542_d = getParameter("mppass");
            }
        } else
        {
            field_6234_b.field_6320_i = new Session("Player", "");
        }
        if(getParameter("server") != null && getParameter("port") != null)
        {
            field_6234_b.func_6258_a(getParameter("server"), Integer.parseInt(getParameter("port")));
        }
        field_6234_b.field_6317_l = true;
        if("true".equals(getParameter("stand-alone")))
        {
            field_6234_b.field_6317_l = false;
        }
        setLayout(new BorderLayout());
        add(field_6235_a, "Center");
        field_6235_a.setFocusable(true);
        validate();
        return;
    }

    public void func_6233_a()
    {
        if(field_6236_c != null)
        {
            return;
        } else
        {
            field_6236_c = new Thread(field_6234_b, "Minecraft main thread");
            field_6236_c.start();
            return;
        }
    }

    public void start()
    {
        if(field_6234_b != null)
        {
            field_6234_b.field_6316_m = false;
        }
    }

    public void stop()
    {
        if(field_6234_b != null)
        {
            field_6234_b.field_6316_m = true;
        }
    }

    public void destroy()
    {
        func_6232_b();
    }

    public void func_6232_b()
    {
        if(field_6236_c == null)
        {
            return;
        }
        field_6234_b.func_6244_d();
        try
        {
            field_6236_c.join(10000L);
        }
        catch(InterruptedException interruptedexception)
        {
            try
            {
                field_6234_b.func_6266_c();
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }
        }
        field_6236_c = null;
    }

    public void func_6231_c()
    {
        field_6235_a = null;
        field_6234_b = null;
        field_6236_c = null;
        try
        {
            removeAll();
            validate();
        }
        catch(Exception exception) { }
    }
}
