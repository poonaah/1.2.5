// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            IThreadedFileIO

public class ThreadedFileIOBase
    implements Runnable
{

    public static final ThreadedFileIOBase field_40573_a = new ThreadedFileIOBase();
    private List field_40571_b;
    private volatile long field_40572_c;
    private volatile long field_40569_d;
    private volatile boolean field_40570_e;

    private ThreadedFileIOBase()
    {
        field_40571_b = Collections.synchronizedList(new ArrayList());
        field_40572_c = 0L;
        field_40569_d = 0L;
        field_40570_e = false;
        Thread thread = new Thread(this, "File IO Thread");
        thread.setPriority(1);
        thread.start();
    }

    public void run()
    {
        do
        {
            func_40568_b();
        } while(true);
    }

    private void func_40568_b()
    {
        for(int i = 0; i < field_40571_b.size(); i++)
        {
            IThreadedFileIO ithreadedfileio = (IThreadedFileIO)field_40571_b.get(i);
            boolean flag = ithreadedfileio.func_40550_A_();
            if(!flag)
            {
                field_40571_b.remove(i--);
                field_40569_d++;
            }
            try
            {
                if(!field_40570_e)
                {
                    Thread.sleep(10L);
                } else
                {
                    Thread.sleep(0L);
                }
            }
            catch(InterruptedException interruptedexception1)
            {
                interruptedexception1.printStackTrace();
            }
        }

        if(field_40571_b.isEmpty())
        {
            try
            {
                Thread.sleep(25L);
            }
            catch(InterruptedException interruptedexception)
            {
                interruptedexception.printStackTrace();
            }
        }
    }

    public void func_40567_a(IThreadedFileIO p_40567_1_)
    {
        if(field_40571_b.contains(p_40567_1_))
        {
            return;
        } else
        {
            field_40572_c++;
            field_40571_b.add(p_40567_1_);
            return;
        }
    }

    public void func_40566_a()
        throws InterruptedException
    {
        field_40570_e = true;
        while(field_40572_c != field_40569_d) 
        {
            Thread.sleep(10L);
        }
        field_40570_e = false;
    }

}
