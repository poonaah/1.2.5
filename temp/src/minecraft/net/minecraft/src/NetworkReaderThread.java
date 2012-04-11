// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            NetworkManager

class NetworkReaderThread extends Thread
{

    final NetworkManager field_1085_a; /* synthetic field */

    NetworkReaderThread(NetworkManager p_i573_1_, String p_i573_2_)
    {
        field_1085_a = p_i573_1_;
        super(p_i573_2_);
    }

    public void run()
    {
        synchronized(NetworkManager.field_1478_a)
        {
            NetworkManager.field_1477_b++;
        }
        while(NetworkManager.func_971_a(field_1085_a) && !NetworkManager.func_968_b(field_1085_a)) 
        {
            while(NetworkManager.func_966_c(field_1085_a)) ;
            try
            {
                sleep(2L);
            }
            catch(InterruptedException interruptedexception) { }
        }
        synchronized(NetworkManager.field_1478_a)
        {
            NetworkManager.field_1477_b--;
        }
        break MISSING_BLOCK_LABEL_131;
        Exception exception2;
        exception2;
        synchronized(NetworkManager.field_1478_a)
        {
            NetworkManager.field_1477_b--;
        }
        throw exception2;
    }
}
