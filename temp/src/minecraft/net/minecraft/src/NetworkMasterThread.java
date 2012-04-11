// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            NetworkManager

class NetworkMasterThread extends Thread
{

    final NetworkManager field_1086_a; /* synthetic field */

    NetworkMasterThread(NetworkManager p_i570_1_)
    {
        field_1086_a = p_i570_1_;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(5000L);
            if(NetworkManager.func_969_e(field_1086_a).isAlive())
            {
                try
                {
                    NetworkManager.func_969_e(field_1086_a).stop();
                }
                catch(Throwable throwable) { }
            }
            if(NetworkManager.func_963_f(field_1086_a).isAlive())
            {
                try
                {
                    NetworkManager.func_963_f(field_1086_a).stop();
                }
                catch(Throwable throwable1) { }
            }
        }
        catch(InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
    }
}
