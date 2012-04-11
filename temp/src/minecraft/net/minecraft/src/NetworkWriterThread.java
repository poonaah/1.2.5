// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.DataOutputStream;
import java.io.IOException;

// Referenced classes of package net.minecraft.src:
//            NetworkManager

class NetworkWriterThread extends Thread
{

    final NetworkManager field_1063_a; /* synthetic field */

    NetworkWriterThread(NetworkManager p_i574_1_, String p_i574_2_)
    {
        field_1063_a = p_i574_1_;
        super(p_i574_2_);
    }

    public void run()
    {
        synchronized(NetworkManager.field_1478_a)
        {
            NetworkManager.field_1476_c++;
        }
        while(NetworkManager.func_971_a(field_1063_a)) 
        {
            while(NetworkManager.func_965_d(field_1063_a)) ;
            try
            {
                if(NetworkManager.func_28140_f(field_1063_a) != null)
                {
                    NetworkManager.func_28140_f(field_1063_a).flush();
                }
            }
            catch(IOException ioexception)
            {
                if(!NetworkManager.func_28138_e(field_1063_a))
                {
                    NetworkManager.func_30005_a(field_1063_a, ioexception);
                }
                ioexception.printStackTrace();
            }
            try
            {
                sleep(2L);
            }
            catch(InterruptedException interruptedexception) { }
        }
        synchronized(NetworkManager.field_1478_a)
        {
            NetworkManager.field_1476_c--;
        }
        break MISSING_BLOCK_LABEL_167;
        Exception exception2;
        exception2;
        synchronized(NetworkManager.field_1478_a)
        {
            NetworkManager.field_1476_c--;
        }
        throw exception2;
    }
}
