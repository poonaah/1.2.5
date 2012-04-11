// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            NetworkManager

class ThreadMonitorConnection extends Thread
{

    final NetworkManager field_28109_a; /* synthetic field */

    ThreadMonitorConnection(NetworkManager p_i571_1_)
    {
        field_28109_a = p_i571_1_;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(2000L);
            if(NetworkManager.func_971_a(field_28109_a))
            {
                NetworkManager.func_963_f(field_28109_a).interrupt();
                field_28109_a.func_974_a("disconnect.closed", new Object[0]);
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
