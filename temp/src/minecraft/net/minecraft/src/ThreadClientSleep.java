// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;

public class ThreadClientSleep extends Thread
{

    final Minecraft field_1588_a; /* synthetic field */

    public ThreadClientSleep(Minecraft p_i356_1_, String p_i356_2_)
    {
        field_1588_a = p_i356_1_;
        super(p_i356_2_);
        setDaemon(true);
        start();
    }

    public void run()
    {
        while(field_1588_a.field_6293_H) 
        {
            try
            {
                Thread.sleep(0x7fffffffL);
            }
            catch(InterruptedException interruptedexception) { }
        }
    }
}
