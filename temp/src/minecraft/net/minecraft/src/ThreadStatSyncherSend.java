// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Map;

// Referenced classes of package net.minecraft.src:
//            StatsSyncher

class ThreadStatSyncherSend extends Thread
{

    final Map field_27233_a; /* synthetic field */
    final StatsSyncher field_27232_b; /* synthetic field */

    ThreadStatSyncherSend(StatsSyncher p_i523_1_, Map p_i523_2_)
    {
        field_27232_b = p_i523_1_;
        field_27233_a = p_i523_2_;
        super();
    }

    public void run()
    {
        try
        {
            StatsSyncher.func_27412_a(field_27232_b, field_27233_a, StatsSyncher.func_27414_e(field_27232_b), StatsSyncher.func_27417_f(field_27232_b), StatsSyncher.func_27419_g(field_27232_b));
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        finally
        {
            StatsSyncher.func_27416_a(field_27232_b, false);
        }
    }
}
