// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.Map;

// Referenced classes of package net.minecraft.src:
//            Session, StatFileWriter, ThreadStatSyncherReceive, ThreadStatSyncherSend

public class StatsSyncher
{

    private volatile boolean field_27438_a;
    private volatile Map field_27437_b;
    private volatile Map field_27436_c;
    private StatFileWriter field_27435_d;
    private File field_27434_e;
    private File field_27433_f;
    private File field_27432_g;
    private File field_27431_h;
    private File field_27430_i;
    private File field_27429_j;
    private Session field_27428_k;
    private int field_27427_l;
    private int field_27426_m;

    public StatsSyncher(Session p_i640_1_, StatFileWriter p_i640_2_, File p_i640_3_)
    {
        field_27438_a = false;
        field_27437_b = null;
        field_27436_c = null;
        field_27427_l = 0;
        field_27426_m = 0;
        field_27434_e = new File(p_i640_3_, (new StringBuilder()).append("stats_").append(p_i640_1_.field_1666_b.toLowerCase()).append("_unsent.dat").toString());
        field_27433_f = new File(p_i640_3_, (new StringBuilder()).append("stats_").append(p_i640_1_.field_1666_b.toLowerCase()).append(".dat").toString());
        field_27430_i = new File(p_i640_3_, (new StringBuilder()).append("stats_").append(p_i640_1_.field_1666_b.toLowerCase()).append("_unsent.old").toString());
        field_27429_j = new File(p_i640_3_, (new StringBuilder()).append("stats_").append(p_i640_1_.field_1666_b.toLowerCase()).append(".old").toString());
        field_27432_g = new File(p_i640_3_, (new StringBuilder()).append("stats_").append(p_i640_1_.field_1666_b.toLowerCase()).append("_unsent.tmp").toString());
        field_27431_h = new File(p_i640_3_, (new StringBuilder()).append("stats_").append(p_i640_1_.field_1666_b.toLowerCase()).append(".tmp").toString());
        if(!p_i640_1_.field_1666_b.toLowerCase().equals(p_i640_1_.field_1666_b))
        {
            func_28214_a(p_i640_3_, (new StringBuilder()).append("stats_").append(p_i640_1_.field_1666_b).append("_unsent.dat").toString(), field_27434_e);
            func_28214_a(p_i640_3_, (new StringBuilder()).append("stats_").append(p_i640_1_.field_1666_b).append(".dat").toString(), field_27433_f);
            func_28214_a(p_i640_3_, (new StringBuilder()).append("stats_").append(p_i640_1_.field_1666_b).append("_unsent.old").toString(), field_27430_i);
            func_28214_a(p_i640_3_, (new StringBuilder()).append("stats_").append(p_i640_1_.field_1666_b).append(".old").toString(), field_27429_j);
            func_28214_a(p_i640_3_, (new StringBuilder()).append("stats_").append(p_i640_1_.field_1666_b).append("_unsent.tmp").toString(), field_27432_g);
            func_28214_a(p_i640_3_, (new StringBuilder()).append("stats_").append(p_i640_1_.field_1666_b).append(".tmp").toString(), field_27431_h);
        }
        field_27435_d = p_i640_2_;
        field_27428_k = p_i640_1_;
        if(field_27434_e.exists())
        {
            p_i640_2_.func_27179_a(func_27415_a(field_27434_e, field_27432_g, field_27430_i));
        }
        func_27418_a();
    }

    private void func_28214_a(File p_28214_1_, String p_28214_2_, File p_28214_3_)
    {
        File file = new File(p_28214_1_, p_28214_2_);
        if(file.exists() && !file.isDirectory() && !p_28214_3_.exists())
        {
            file.renameTo(p_28214_3_);
        }
    }

    private Map func_27415_a(File p_27415_1_, File p_27415_2_, File p_27415_3_)
    {
        if(p_27415_1_.exists())
        {
            return func_27408_a(p_27415_1_);
        }
        if(p_27415_3_.exists())
        {
            return func_27408_a(p_27415_3_);
        }
        if(p_27415_2_.exists())
        {
            return func_27408_a(p_27415_2_);
        } else
        {
            return null;
        }
    }

    private Map func_27408_a(File p_27408_1_)
    {
        BufferedReader bufferedreader = null;
        try
        {
            bufferedreader = new BufferedReader(new FileReader(p_27408_1_));
            String s = "";
            StringBuilder stringbuilder = new StringBuilder();
            while((s = bufferedreader.readLine()) != null) 
            {
                stringbuilder.append(s);
            }
            Map map = StatFileWriter.func_27177_a(stringbuilder.toString());
            return map;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        finally
        {
            if(bufferedreader != null)
            {
                try
                {
                    bufferedreader.close();
                }
                catch(Exception exception2)
                {
                    exception2.printStackTrace();
                }
            }
        }
        return null;
    }

    private void func_27410_a(Map p_27410_1_, File p_27410_2_, File p_27410_3_, File p_27410_4_)
        throws IOException
    {
        PrintWriter printwriter = new PrintWriter(new FileWriter(p_27410_3_, false));
        try
        {
            printwriter.print(StatFileWriter.func_27185_a(field_27428_k.field_1666_b, "local", p_27410_1_));
        }
        finally
        {
            printwriter.close();
        }
        if(p_27410_4_.exists())
        {
            p_27410_4_.delete();
        }
        if(p_27410_2_.exists())
        {
            p_27410_2_.renameTo(p_27410_4_);
        }
        p_27410_3_.renameTo(p_27410_2_);
    }

    public void func_27418_a()
    {
        if(field_27438_a)
        {
            throw new IllegalStateException("Can't get stats from server while StatsSyncher is busy!");
        } else
        {
            field_27427_l = 100;
            field_27438_a = true;
            (new ThreadStatSyncherReceive(this)).start();
            return;
        }
    }

    public void func_27424_a(Map p_27424_1_)
    {
        if(field_27438_a)
        {
            throw new IllegalStateException("Can't save stats while StatsSyncher is busy!");
        } else
        {
            field_27427_l = 100;
            field_27438_a = true;
            (new ThreadStatSyncherSend(this, p_27424_1_)).start();
            return;
        }
    }

    public void func_27407_b(Map p_27407_1_)
    {
        for(int i = 30; field_27438_a && --i > 0;)
        {
            try
            {
                Thread.sleep(100L);
            }
            catch(InterruptedException interruptedexception)
            {
                interruptedexception.printStackTrace();
            }
        }

        field_27438_a = true;
        try
        {
            func_27410_a(p_27407_1_, field_27434_e, field_27432_g, field_27430_i);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        finally
        {
            field_27438_a = false;
        }
    }

    public boolean func_27420_b()
    {
        return field_27427_l <= 0 && !field_27438_a && field_27436_c == null;
    }

    public void func_27425_c()
    {
        if(field_27427_l > 0)
        {
            field_27427_l--;
        }
        if(field_27426_m > 0)
        {
            field_27426_m--;
        }
        if(field_27436_c != null)
        {
            field_27435_d.func_27187_c(field_27436_c);
            field_27436_c = null;
        }
        if(field_27437_b != null)
        {
            field_27435_d.func_27180_b(field_27437_b);
            field_27437_b = null;
        }
    }

    static Map func_27422_a(StatsSyncher p_27422_0_)
    {
        return p_27422_0_.field_27437_b;
    }

    static File func_27423_b(StatsSyncher p_27423_0_)
    {
        return p_27423_0_.field_27433_f;
    }

    static File func_27411_c(StatsSyncher p_27411_0_)
    {
        return p_27411_0_.field_27431_h;
    }

    static File func_27413_d(StatsSyncher p_27413_0_)
    {
        return p_27413_0_.field_27429_j;
    }

    static void func_27412_a(StatsSyncher p_27412_0_, Map p_27412_1_, File p_27412_2_, File p_27412_3_, File p_27412_4_)
        throws IOException
    {
        p_27412_0_.func_27410_a(p_27412_1_, p_27412_2_, p_27412_3_, p_27412_4_);
    }

    static Map func_27421_a(StatsSyncher p_27421_0_, Map p_27421_1_)
    {
        return p_27421_0_.field_27437_b = p_27421_1_;
    }

    static Map func_27409_a(StatsSyncher p_27409_0_, File p_27409_1_, File p_27409_2_, File p_27409_3_)
    {
        return p_27409_0_.func_27415_a(p_27409_1_, p_27409_2_, p_27409_3_);
    }

    static boolean func_27416_a(StatsSyncher p_27416_0_, boolean p_27416_1_)
    {
        return p_27416_0_.field_27438_a = p_27416_1_;
    }

    static File func_27414_e(StatsSyncher p_27414_0_)
    {
        return p_27414_0_.field_27434_e;
    }

    static File func_27417_f(StatsSyncher p_27417_0_)
    {
        return p_27417_0_.field_27432_g;
    }

    static File func_27419_g(StatsSyncher p_27419_0_)
    {
        return p_27419_0_.field_27430_i;
    }
}
