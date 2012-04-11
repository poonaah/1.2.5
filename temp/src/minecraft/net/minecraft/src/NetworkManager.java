// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.net.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            NetworkReaderThread, NetworkWriterThread, Packet, NetHandler, 
//            NetworkMasterThread, ThreadMonitorConnection

public class NetworkManager
{

    public static final Object field_1478_a = new Object();
    public static int field_1477_b;
    public static int field_1476_c;
    private Object field_1475_d;
    private Socket field_12258_e;
    private final SocketAddress field_1474_e;
    private DataInputStream field_1473_f;
    private DataOutputStream field_1472_g;
    private boolean field_1471_h;
    private List field_1470_i;
    private List field_1469_j;
    private List field_1468_k;
    private NetHandler field_1467_l;
    private boolean field_1466_m;
    private Thread field_1465_n;
    private Thread field_1464_o;
    private boolean field_1463_p;
    private String field_1462_q;
    private Object field_20101_t[];
    private int field_1461_r;
    private int field_1460_s;
    public static int field_28145_d[] = new int[256];
    public static int field_28144_e[] = new int[256];
    public int field_1459_t;
    private int field_20100_w;

    public NetworkManager(Socket p_i430_1_, String p_i430_2_, NetHandler p_i430_3_)
        throws IOException
    {
        field_1475_d = new Object();
        field_1471_h = true;
        field_1470_i = Collections.synchronizedList(new ArrayList());
        field_1469_j = Collections.synchronizedList(new ArrayList());
        field_1468_k = Collections.synchronizedList(new ArrayList());
        field_1466_m = false;
        field_1463_p = false;
        field_1462_q = "";
        field_1461_r = 0;
        field_1460_s = 0;
        field_1459_t = 0;
        field_20100_w = 50;
        field_12258_e = p_i430_1_;
        field_1474_e = p_i430_1_.getRemoteSocketAddress();
        field_1467_l = p_i430_3_;
        try
        {
            p_i430_1_.setSoTimeout(30000);
            p_i430_1_.setTrafficClass(24);
        }
        catch(SocketException socketexception)
        {
            System.err.println(socketexception.getMessage());
        }
        field_1473_f = new DataInputStream(p_i430_1_.getInputStream());
        field_1472_g = new DataOutputStream(new BufferedOutputStream(p_i430_1_.getOutputStream(), 5120));
        field_1464_o = new NetworkReaderThread(this, (new StringBuilder()).append(p_i430_2_).append(" read thread").toString());
        field_1465_n = new NetworkWriterThread(this, (new StringBuilder()).append(p_i430_2_).append(" write thread").toString());
        field_1464_o.start();
        field_1465_n.start();
    }

    public void func_972_a(Packet p_972_1_)
    {
        if(field_1466_m)
        {
            return;
        }
        synchronized(field_1475_d)
        {
            field_1460_s += p_972_1_.func_329_a() + 1;
            if(p_972_1_.field_472_j)
            {
                field_1468_k.add(p_972_1_);
            } else
            {
                field_1469_j.add(p_972_1_);
            }
        }
    }

    private boolean func_964_b()
    {
        boolean flag = false;
        try
        {
            if(!field_1469_j.isEmpty() && (field_1459_t == 0 || System.currentTimeMillis() - ((Packet)field_1469_j.get(0)).field_20018_j >= (long)field_1459_t))
            {
                Packet packet;
                synchronized(field_1475_d)
                {
                    packet = (Packet)field_1469_j.remove(0);
                    field_1460_s -= packet.func_329_a() + 1;
                }
                Packet.func_328_a(packet, field_1472_g);
                field_28144_e[packet.func_326_b()] += packet.func_329_a() + 1;
                flag = true;
            }
            if(field_20100_w-- <= 0 && !field_1468_k.isEmpty() && (field_1459_t == 0 || System.currentTimeMillis() - ((Packet)field_1468_k.get(0)).field_20018_j >= (long)field_1459_t))
            {
                Packet packet1;
                synchronized(field_1475_d)
                {
                    packet1 = (Packet)field_1468_k.remove(0);
                    field_1460_s -= packet1.func_329_a() + 1;
                }
                Packet.func_328_a(packet1, field_1472_g);
                field_28144_e[packet1.func_326_b()] += packet1.func_329_a() + 1;
                field_20100_w = 0;
                flag = true;
            }
        }
        catch(Exception exception)
        {
            if(!field_1463_p)
            {
                func_970_a(exception);
            }
            return false;
        }
        return flag;
    }

    public void func_28139_a()
    {
        field_1464_o.interrupt();
        field_1465_n.interrupt();
    }

    private boolean func_973_c()
    {
        boolean flag = false;
        try
        {
            Packet packet = Packet.func_324_b(field_1473_f, field_1467_l.func_27247_c());
            if(packet != null)
            {
                field_28145_d[packet.func_326_b()] += packet.func_329_a() + 1;
                if(!field_1466_m)
                {
                    field_1470_i.add(packet);
                }
                flag = true;
            } else
            {
                func_974_a("disconnect.endOfStream", new Object[0]);
            }
        }
        catch(Exception exception)
        {
            if(!field_1463_p)
            {
                func_970_a(exception);
            }
            return false;
        }
        return flag;
    }

    private void func_970_a(Exception p_970_1_)
    {
        p_970_1_.printStackTrace();
        func_974_a("disconnect.genericReason", new Object[] {
            (new StringBuilder()).append("Internal exception: ").append(p_970_1_.toString()).toString()
        });
    }

    public void func_974_a(String p_974_1_, Object p_974_2_[])
    {
        if(!field_1471_h)
        {
            return;
        }
        field_1463_p = true;
        field_1462_q = p_974_1_;
        field_20101_t = p_974_2_;
        (new NetworkMasterThread(this)).start();
        field_1471_h = false;
        try
        {
            field_1473_f.close();
            field_1473_f = null;
        }
        catch(Throwable throwable) { }
        try
        {
            field_1472_g.close();
            field_1472_g = null;
        }
        catch(Throwable throwable1) { }
        try
        {
            field_12258_e.close();
            field_12258_e = null;
        }
        catch(Throwable throwable2) { }
    }

    public void func_967_a()
    {
        if(field_1460_s > 0x100000)
        {
            func_974_a("disconnect.overflow", new Object[0]);
        }
        if(field_1470_i.isEmpty())
        {
            if(field_1461_r++ == 1200)
            {
                func_974_a("disconnect.timeout", new Object[0]);
            }
        } else
        {
            field_1461_r = 0;
        }
        Packet packet;
        for(int i = 1000; !field_1470_i.isEmpty() && i-- >= 0; packet.func_323_a(field_1467_l))
        {
            packet = (Packet)field_1470_i.remove(0);
        }

        func_28139_a();
        if(field_1463_p && field_1470_i.isEmpty())
        {
            field_1467_l.func_823_a(field_1462_q, field_20101_t);
        }
    }

    public void func_28142_c()
    {
        if(field_1466_m)
        {
            return;
        } else
        {
            func_28139_a();
            field_1466_m = true;
            field_1464_o.interrupt();
            (new ThreadMonitorConnection(this)).start();
            return;
        }
    }

    static boolean func_971_a(NetworkManager p_971_0_)
    {
        return p_971_0_.field_1471_h;
    }

    static boolean func_968_b(NetworkManager p_968_0_)
    {
        return p_968_0_.field_1466_m;
    }

    static boolean func_966_c(NetworkManager p_966_0_)
    {
        return p_966_0_.func_973_c();
    }

    static boolean func_965_d(NetworkManager p_965_0_)
    {
        return p_965_0_.func_964_b();
    }

    static DataOutputStream func_28140_f(NetworkManager p_28140_0_)
    {
        return p_28140_0_.field_1472_g;
    }

    static boolean func_28138_e(NetworkManager p_28138_0_)
    {
        return p_28138_0_.field_1463_p;
    }

    static void func_30005_a(NetworkManager p_30005_0_, Exception p_30005_1_)
    {
        p_30005_0_.func_970_a(p_30005_1_);
    }

    static Thread func_969_e(NetworkManager p_969_0_)
    {
        return p_969_0_.field_1464_o;
    }

    static Thread func_963_f(NetworkManager p_963_0_)
    {
        return p_963_0_.field_1465_n;
    }

}
