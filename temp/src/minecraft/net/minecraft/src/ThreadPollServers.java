// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.IOException;
import java.net.*;

// Referenced classes of package net.minecraft.src:
//            ServerNBTStorage, GuiSlotServer, GuiMultiplayer

class ThreadPollServers extends Thread
{

    final ServerNBTStorage field_35601_a; /* synthetic field */
    final GuiSlotServer field_35600_b; /* synthetic field */

    ThreadPollServers(GuiSlotServer p_i254_1_, ServerNBTStorage p_i254_2_)
    {
        field_35600_b = p_i254_1_;
        field_35601_a = p_i254_2_;
        super();
    }

    public void run()
    {
        try
        {
            field_35601_a.field_35791_d = "\2478Polling..";
            long l = System.nanoTime();
            GuiMultiplayer.func_35336_a(field_35600_b.field_35410_a, field_35601_a);
            long l1 = System.nanoTime();
            field_35601_a.field_35792_e = (l1 - l) / 0xf4240L;
        }
        catch(UnknownHostException unknownhostexception)
        {
            field_35601_a.field_35792_e = -1L;
            field_35601_a.field_35791_d = "\2474Can't resolve hostname";
            synchronized(GuiMultiplayer.func_35321_g())
            {
                GuiMultiplayer.func_35335_o();
            }
            break MISSING_BLOCK_LABEL_345;
        }
        catch(SocketTimeoutException sockettimeoutexception)
        {
            field_35601_a.field_35792_e = -1L;
            field_35601_a.field_35791_d = "\2474Can't reach server";
            synchronized(GuiMultiplayer.func_35321_g())
            {
                GuiMultiplayer.func_35335_o();
            }
            break MISSING_BLOCK_LABEL_345;
        }
        catch(ConnectException connectexception)
        {
            field_35601_a.field_35792_e = -1L;
            field_35601_a.field_35791_d = "\2474Can't reach server";
            synchronized(GuiMultiplayer.func_35321_g())
            {
                GuiMultiplayer.func_35335_o();
            }
            break MISSING_BLOCK_LABEL_345;
        }
        catch(IOException ioexception)
        {
            field_35601_a.field_35792_e = -1L;
            field_35601_a.field_35791_d = "\2474Communication error";
            synchronized(GuiMultiplayer.func_35321_g())
            {
                GuiMultiplayer.func_35335_o();
            }
            break MISSING_BLOCK_LABEL_345;
        }
        catch(Exception exception)
        {
            field_35601_a.field_35792_e = -1L;
            field_35601_a.field_35791_d = (new StringBuilder()).append("ERROR: ").append(exception.getClass()).toString();
            synchronized(GuiMultiplayer.func_35321_g())
            {
                GuiMultiplayer.func_35335_o();
            }
            break MISSING_BLOCK_LABEL_345;
        }
        synchronized(GuiMultiplayer.func_35321_g())
        {
            GuiMultiplayer.func_35335_o();
        }
        break MISSING_BLOCK_LABEL_345;
        Exception exception7;
        exception7;
        synchronized(GuiMultiplayer.func_35321_g())
        {
            GuiMultiplayer.func_35335_o();
        }
        throw exception7;
    }
}
