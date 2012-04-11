// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, GuiSlotServer, CompressedStreamTools, NBTTagCompound, 
//            NBTTagList, ServerNBTStorage, StringTranslate, GuiButton, 
//            GuiYesNo, GuiScreenServerList, StatCollector, GuiScreenAddServer, 
//            GuiConnecting, Packet, ChatAllowedCharacters, FontRenderer

public class GuiMultiplayer extends GuiScreen
{

    private static int field_35344_a = 0;
    private static Object field_35343_b = new Object();
    private GuiScreen field_968_a;
    private GuiSlotServer field_35342_d;
    private List field_35340_f;
    private int field_35341_g;
    private GuiButton field_35347_h;
    private GuiButton field_35348_i;
    private GuiButton field_35345_j;
    private boolean field_35346_k;
    private boolean field_35353_s;
    private boolean field_35352_t;
    private boolean field_35351_u;
    private String field_35350_v;
    private ServerNBTStorage field_35349_w;

    public GuiMultiplayer(GuiScreen p_i17_1_)
    {
        field_35340_f = new ArrayList();
        field_35341_g = -1;
        field_35346_k = false;
        field_35353_s = false;
        field_35352_t = false;
        field_35351_u = false;
        field_35350_v = null;
        field_35349_w = null;
        field_968_a = p_i17_1_;
    }

    public void func_570_g()
    {
    }

    public void func_6448_a()
    {
        func_35324_p();
        Keyboard.enableRepeatEvents(true);
        field_949_e.clear();
        field_35342_d = new GuiSlotServer(this);
        func_35337_c();
    }

    private void func_35324_p()
    {
        try
        {
            NBTTagCompound nbttagcompound = CompressedStreamTools.func_35622_a(new File(field_945_b.field_6297_D, "servers.dat"));
            NBTTagList nbttaglist = nbttagcompound.func_753_l("servers");
            field_35340_f.clear();
            for(int i = 0; i < nbttaglist.func_740_c(); i++)
            {
                field_35340_f.add(ServerNBTStorage.func_35788_a((NBTTagCompound)nbttaglist.func_741_a(i)));
            }

        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void func_35323_q()
    {
        try
        {
            NBTTagList nbttaglist = new NBTTagList();
            for(int i = 0; i < field_35340_f.size(); i++)
            {
                nbttaglist.func_742_a(((ServerNBTStorage)field_35340_f.get(i)).func_35789_a());
            }

            NBTTagCompound nbttagcompound = new NBTTagCompound();
            nbttagcompound.func_762_a("servers", nbttaglist);
            CompressedStreamTools.func_35621_a(nbttagcompound, new File(field_945_b.field_6297_D, "servers.dat"));
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void func_35337_c()
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        field_949_e.add(field_35347_h = new GuiButton(7, field_951_c / 2 - 154, field_950_d - 28, 70, 20, stringtranslate.func_20163_a("selectServer.edit")));
        field_949_e.add(field_35345_j = new GuiButton(2, field_951_c / 2 - 74, field_950_d - 28, 70, 20, stringtranslate.func_20163_a("selectServer.delete")));
        field_949_e.add(field_35348_i = new GuiButton(1, field_951_c / 2 - 154, field_950_d - 52, 100, 20, stringtranslate.func_20163_a("selectServer.select")));
        field_949_e.add(new GuiButton(4, field_951_c / 2 - 50, field_950_d - 52, 100, 20, stringtranslate.func_20163_a("selectServer.direct")));
        field_949_e.add(new GuiButton(3, field_951_c / 2 + 4 + 50, field_950_d - 52, 100, 20, stringtranslate.func_20163_a("selectServer.add")));
        field_949_e.add(new GuiButton(8, field_951_c / 2 + 4, field_950_d - 28, 70, 20, stringtranslate.func_20163_a("selectServer.refresh")));
        field_949_e.add(new GuiButton(0, field_951_c / 2 + 4 + 76, field_950_d - 28, 75, 20, stringtranslate.func_20163_a("gui.cancel")));
        boolean flag = field_35341_g >= 0 && field_35341_g < field_35342_d.func_22249_a();
        field_35348_i.field_937_g = flag;
        field_35347_h.field_937_g = flag;
        field_35345_j.field_937_g = flag;
    }

    public void func_6449_h()
    {
        Keyboard.enableRepeatEvents(false);
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(!p_572_1_.field_937_g)
        {
            return;
        }
        if(p_572_1_.field_938_f == 2)
        {
            String s = ((ServerNBTStorage)field_35340_f.get(field_35341_g)).field_35795_a;
            if(s != null)
            {
                field_35346_k = true;
                StringTranslate stringtranslate = StringTranslate.func_20162_a();
                String s1 = stringtranslate.func_20163_a("selectServer.deleteQuestion");
                String s2 = (new StringBuilder()).append("'").append(s).append("' ").append(stringtranslate.func_20163_a("selectServer.deleteWarning")).toString();
                String s3 = stringtranslate.func_20163_a("selectServer.deleteButton");
                String s4 = stringtranslate.func_20163_a("gui.cancel");
                GuiYesNo guiyesno = new GuiYesNo(this, s1, s2, s3, s4, field_35341_g);
                field_945_b.func_6272_a(guiyesno);
            }
        } else
        if(p_572_1_.field_938_f == 1)
        {
            func_35322_a(field_35341_g);
        } else
        if(p_572_1_.field_938_f == 4)
        {
            field_35351_u = true;
            field_945_b.func_6272_a(new GuiScreenServerList(this, field_35349_w = new ServerNBTStorage(StatCollector.func_25200_a("selectServer.defaultName"), "")));
        } else
        if(p_572_1_.field_938_f == 3)
        {
            field_35353_s = true;
            field_945_b.func_6272_a(new GuiScreenAddServer(this, field_35349_w = new ServerNBTStorage(StatCollector.func_25200_a("selectServer.defaultName"), "")));
        } else
        if(p_572_1_.field_938_f == 7)
        {
            field_35352_t = true;
            ServerNBTStorage servernbtstorage = (ServerNBTStorage)field_35340_f.get(field_35341_g);
            field_945_b.func_6272_a(new GuiScreenAddServer(this, field_35349_w = new ServerNBTStorage(servernbtstorage.field_35795_a, servernbtstorage.field_35793_b)));
        } else
        if(p_572_1_.field_938_f == 0)
        {
            field_945_b.func_6272_a(field_968_a);
        } else
        if(p_572_1_.field_938_f == 8)
        {
            field_945_b.func_6272_a(new GuiMultiplayer(field_968_a));
        } else
        {
            field_35342_d.func_22241_a(p_572_1_);
        }
    }

    public void func_568_a(boolean p_568_1_, int p_568_2_)
    {
        if(field_35346_k)
        {
            field_35346_k = false;
            if(p_568_1_)
            {
                field_35340_f.remove(p_568_2_);
                func_35323_q();
            }
            field_945_b.func_6272_a(this);
        } else
        if(field_35351_u)
        {
            field_35351_u = false;
            if(p_568_1_)
            {
                func_35330_a(field_35349_w);
            } else
            {
                field_945_b.func_6272_a(this);
            }
        } else
        if(field_35353_s)
        {
            field_35353_s = false;
            if(p_568_1_)
            {
                field_35340_f.add(field_35349_w);
                func_35323_q();
            }
            field_945_b.func_6272_a(this);
        } else
        if(field_35352_t)
        {
            field_35352_t = false;
            if(p_568_1_)
            {
                ServerNBTStorage servernbtstorage = (ServerNBTStorage)field_35340_f.get(field_35341_g);
                servernbtstorage.field_35795_a = field_35349_w.field_35795_a;
                servernbtstorage.field_35793_b = field_35349_w.field_35793_b;
                func_35323_q();
            }
            field_945_b.func_6272_a(this);
        }
    }

    private int func_4067_a(String p_4067_1_, int p_4067_2_)
    {
        try
        {
            return Integer.parseInt(p_4067_1_.trim());
        }
        catch(Exception exception)
        {
            return p_4067_2_;
        }
    }

    protected void func_580_a(char p_580_1_, int p_580_2_)
    {
        if(p_580_1_ == '\r')
        {
            func_572_a((GuiButton)field_949_e.get(2));
        }
    }

    protected void func_565_a(int p_565_1_, int p_565_2_, int p_565_3_)
    {
        super.func_565_a(p_565_1_, p_565_2_, p_565_3_);
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        field_35350_v = null;
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        func_578_i();
        field_35342_d.func_22243_a(p_571_1_, p_571_2_, p_571_3_);
        func_548_a(field_6451_g, stringtranslate.func_20163_a("multiplayer.title"), field_951_c / 2, 20, 0xffffff);
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
        if(field_35350_v != null)
        {
            func_35325_a(field_35350_v, p_571_1_, p_571_2_);
        }
    }

    private void func_35322_a(int p_35322_1_)
    {
        func_35330_a((ServerNBTStorage)field_35340_f.get(p_35322_1_));
    }

    private void func_35330_a(ServerNBTStorage p_35330_1_)
    {
        String s = p_35330_1_.field_35793_b;
        String as[] = s.split(":");
        if(s.startsWith("["))
        {
            int i = s.indexOf("]");
            if(i > 0)
            {
                String s1 = s.substring(1, i);
                String s2 = s.substring(i + 1).trim();
                if(s2.startsWith(":") && s2.length() > 0)
                {
                    s2 = s2.substring(1);
                    as = new String[2];
                    as[0] = s1;
                    as[1] = s2;
                } else
                {
                    as = new String[1];
                    as[0] = s1;
                }
            }
        }
        if(as.length > 2)
        {
            as = new String[1];
            as[0] = s;
        }
        field_945_b.func_6272_a(new GuiConnecting(field_945_b, as[0], as.length <= 1 ? 25565 : func_4067_a(as[1], 25565)));
    }

    private void func_35328_b(ServerNBTStorage p_35328_1_)
        throws IOException
    {
        String s = p_35328_1_.field_35793_b;
        String as[] = s.split(":");
        if(s.startsWith("["))
        {
            int i = s.indexOf("]");
            if(i > 0)
            {
                String s2 = s.substring(1, i);
                String s3 = s.substring(i + 1).trim();
                if(s3.startsWith(":") && s3.length() > 0)
                {
                    s3 = s3.substring(1);
                    as = new String[2];
                    as[0] = s2;
                    as[1] = s3;
                } else
                {
                    as = new String[1];
                    as[0] = s2;
                }
            }
        }
        if(as.length > 2)
        {
            as = new String[1];
            as[0] = s;
        }
        String s1 = as[0];
        int j = as.length <= 1 ? 25565 : func_4067_a(as[1], 25565);
        Socket socket = null;
        DataInputStream datainputstream = null;
        DataOutputStream dataoutputstream = null;
        try
        {
            socket = new Socket();
            socket.setSoTimeout(3000);
            socket.setTcpNoDelay(true);
            socket.setTrafficClass(18);
            socket.connect(new InetSocketAddress(s1, j), 3000);
            datainputstream = new DataInputStream(socket.getInputStream());
            dataoutputstream = new DataOutputStream(socket.getOutputStream());
            dataoutputstream.write(254);
            if(datainputstream.read() != 255)
            {
                throw new IOException("Bad message");
            }
            String s4 = Packet.func_27048_a(datainputstream, 256);
            char ac[] = s4.toCharArray();
            for(int k = 0; k < ac.length; k++)
            {
                if(ac[k] != '\247' && ChatAllowedCharacters.field_20157_a.indexOf(ac[k]) < 0)
                {
                    ac[k] = '?';
                }
            }

            s4 = new String(ac);
            String as1[] = s4.split("\247");
            s4 = as1[0];
            int l = -1;
            int i1 = -1;
            try
            {
                l = Integer.parseInt(as1[1]);
                i1 = Integer.parseInt(as1[2]);
            }
            catch(Exception exception) { }
            p_35328_1_.field_35791_d = (new StringBuilder()).append("\2477").append(s4).toString();
            if(l >= 0 && i1 > 0)
            {
                p_35328_1_.field_35794_c = (new StringBuilder()).append("\2477").append(l).append("\2478/\2477").append(i1).toString();
            } else
            {
                p_35328_1_.field_35794_c = "\2478???";
            }
        }
        finally
        {
            try
            {
                if(datainputstream != null)
                {
                    datainputstream.close();
                }
            }
            catch(Throwable throwable) { }
            try
            {
                if(dataoutputstream != null)
                {
                    dataoutputstream.close();
                }
            }
            catch(Throwable throwable1) { }
            try
            {
                if(socket != null)
                {
                    socket.close();
                }
            }
            catch(Throwable throwable2) { }
        }
    }

    protected void func_35325_a(String p_35325_1_, int p_35325_2_, int p_35325_3_)
    {
        if(p_35325_1_ == null)
        {
            return;
        } else
        {
            int i = p_35325_2_ + 12;
            int j = p_35325_3_ - 12;
            int k = field_6451_g.func_871_a(p_35325_1_);
            func_549_a(i - 3, j - 3, i + k + 3, j + 8 + 3, 0xc0000000, 0xc0000000);
            field_6451_g.func_50103_a(p_35325_1_, i, j, -1);
            return;
        }
    }

    static List func_35320_a(GuiMultiplayer p_35320_0_)
    {
        return p_35320_0_.field_35340_f;
    }

    static int func_35326_a(GuiMultiplayer p_35326_0_, int p_35326_1_)
    {
        return p_35326_0_.field_35341_g = p_35326_1_;
    }

    static int func_35333_b(GuiMultiplayer p_35333_0_)
    {
        return p_35333_0_.field_35341_g;
    }

    static GuiButton func_35329_c(GuiMultiplayer p_35329_0_)
    {
        return p_35329_0_.field_35348_i;
    }

    static GuiButton func_35334_d(GuiMultiplayer p_35334_0_)
    {
        return p_35334_0_.field_35347_h;
    }

    static GuiButton func_35339_e(GuiMultiplayer p_35339_0_)
    {
        return p_35339_0_.field_35345_j;
    }

    static void func_35332_b(GuiMultiplayer p_35332_0_, int p_35332_1_)
    {
        p_35332_0_.func_35322_a(p_35332_1_);
    }

    static Object func_35321_g()
    {
        return field_35343_b;
    }

    static int func_35338_m()
    {
        return field_35344_a;
    }

    static int func_35331_n()
    {
        return field_35344_a++;
    }

    static void func_35336_a(GuiMultiplayer p_35336_0_, ServerNBTStorage p_35336_1_)
        throws IOException
    {
        p_35336_0_.func_35328_b(p_35336_1_);
    }

    static int func_35335_o()
    {
        return field_35344_a--;
    }

    static String func_35327_a(GuiMultiplayer p_35327_0_, String p_35327_1_)
    {
        return p_35327_0_.field_35350_v = p_35327_1_;
    }

}
