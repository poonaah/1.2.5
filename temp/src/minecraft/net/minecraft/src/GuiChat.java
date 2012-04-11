// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.lang.reflect.Method;
import java.net.URI;
import java.util.*;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, GuiIngame, GuiTextField, EntityPlayerSP, 
//            ChatClickData, GuiChatConfirmLink, EntityClientPlayerMP, NetClientHandler, 
//            GuiPlayerInfo

public class GuiChat extends GuiScreen
{

    private String field_50062_b;
    private int field_50063_c;
    private boolean field_50060_d;
    private String field_50061_e;
    private String field_50059_f;
    private int field_50067_h;
    private List field_50068_i;
    private URI field_50065_j;
    protected GuiTextField field_50064_a;
    private String field_50066_k;

    public GuiChat()
    {
        field_50062_b = "";
        field_50063_c = -1;
        field_50060_d = false;
        field_50061_e = "";
        field_50059_f = "";
        field_50067_h = 0;
        field_50068_i = new ArrayList();
        field_50065_j = null;
        field_50066_k = "";
    }

    public GuiChat(String p_i1207_1_)
    {
        field_50062_b = "";
        field_50063_c = -1;
        field_50060_d = false;
        field_50061_e = "";
        field_50059_f = "";
        field_50067_h = 0;
        field_50068_i = new ArrayList();
        field_50065_j = null;
        field_50066_k = "";
        field_50066_k = p_i1207_1_;
    }

    public void func_6448_a()
    {
        Keyboard.enableRepeatEvents(true);
        field_50063_c = field_945_b.field_6308_u.func_50013_c().size();
        field_50064_a = new GuiTextField(field_6451_g, 4, field_950_d - 12, field_951_c - 4, 12);
        field_50064_a.func_22066_a(100);
        field_50064_a.func_50027_a(false);
        field_50064_a.func_50033_b(true);
        field_50064_a.func_22068_a(field_50066_k);
        field_50064_a.func_50026_c(false);
    }

    public void func_6449_h()
    {
        Keyboard.enableRepeatEvents(false);
        field_945_b.field_6308_u.func_50014_d();
    }

    public void func_570_g()
    {
        field_50064_a.func_22070_b();
    }

    protected void func_580_a(char p_580_1_, int p_580_2_)
    {
        if(p_580_2_ == 15)
        {
            func_50057_d();
        } else
        {
            field_50060_d = false;
        }
        if(p_580_2_ == 1)
        {
            field_945_b.func_6272_a(null);
        } else
        if(p_580_2_ == 28)
        {
            String s = field_50064_a.func_22071_a().trim();
            if(s.length() > 0 && !field_945_b.func_22003_b(s))
            {
                field_945_b.field_6322_g.func_461_a(s);
            }
            field_945_b.func_6272_a(null);
        } else
        if(p_580_2_ == 200)
        {
            func_50058_a(-1);
        } else
        if(p_580_2_ == 208)
        {
            func_50058_a(1);
        } else
        if(p_580_2_ == 201)
        {
            field_945_b.field_6308_u.func_50011_a(19);
        } else
        if(p_580_2_ == 209)
        {
            field_945_b.field_6308_u.func_50011_a(-19);
        } else
        {
            field_50064_a.func_50037_a(p_580_1_, p_580_2_);
        }
    }

    public void func_566_e()
    {
        super.func_566_e();
        int i = Mouse.getEventDWheel();
        if(i != 0)
        {
            if(i > 1)
            {
                i = 1;
            }
            if(i < -1)
            {
                i = -1;
            }
            if(!func_50049_m())
            {
                i *= 7;
            }
            field_945_b.field_6308_u.func_50011_a(i);
        }
    }

    protected void func_565_a(int p_565_1_, int p_565_2_, int p_565_3_)
    {
        if(p_565_3_ == 0)
        {
            ChatClickData chatclickdata = field_945_b.field_6308_u.func_50012_a(Mouse.getX(), Mouse.getY());
            if(chatclickdata != null)
            {
                URI uri = chatclickdata.func_50089_b();
                if(uri != null)
                {
                    field_50065_j = uri;
                    field_945_b.func_6272_a(new GuiChatConfirmLink(this, this, chatclickdata.func_50088_a(), 0, chatclickdata));
                    return;
                }
            }
        }
        field_50064_a.func_22069_a(p_565_1_, p_565_2_, p_565_3_);
        super.func_565_a(p_565_1_, p_565_2_, p_565_3_);
    }

    public void func_568_a(boolean p_568_1_, int p_568_2_)
    {
        if(p_568_2_ == 0)
        {
            if(p_568_1_)
            {
                try
                {
                    Class class1 = Class.forName("java.awt.Desktop");
                    Object obj = class1.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    class1.getMethod("browse", new Class[] {
                        java.net.URI.class
                    }).invoke(obj, new Object[] {
                        field_50065_j
                    });
                }
                catch(Throwable throwable)
                {
                    throwable.printStackTrace();
                }
            }
            field_50065_j = null;
            field_945_b.func_6272_a(this);
        }
    }

    public void func_50057_d()
    {
        if(field_50060_d)
        {
            field_50064_a.func_50021_a(-1);
            if(field_50067_h >= field_50068_i.size())
            {
                field_50067_h = 0;
            }
        } else
        {
            int i = field_50064_a.func_50028_c(-1);
            if(field_50064_a.func_50035_h() - i < 1)
            {
                return;
            }
            field_50068_i.clear();
            field_50061_e = field_50064_a.func_22071_a().substring(i);
            field_50059_f = field_50061_e.toLowerCase();
            Iterator iterator = ((EntityClientPlayerMP)field_945_b.field_6322_g).field_797_bg.field_35786_c.iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    break;
                }
                GuiPlayerInfo guiplayerinfo = (GuiPlayerInfo)iterator.next();
                if(guiplayerinfo.func_50098_a(field_50059_f))
                {
                    field_50068_i.add(guiplayerinfo);
                }
            } while(true);
            if(field_50068_i.size() == 0)
            {
                return;
            }
            field_50060_d = true;
            field_50067_h = 0;
            field_50064_a.func_50020_b(i - field_50064_a.func_50035_h());
        }
        if(field_50068_i.size() > 1)
        {
            StringBuilder stringbuilder = new StringBuilder();
            GuiPlayerInfo guiplayerinfo1;
            for(Iterator iterator1 = field_50068_i.iterator(); iterator1.hasNext(); stringbuilder.append(guiplayerinfo1.field_35624_a))
            {
                guiplayerinfo1 = (GuiPlayerInfo)iterator1.next();
                if(stringbuilder.length() > 0)
                {
                    stringbuilder.append(", ");
                }
            }

            field_945_b.field_6308_u.func_552_a(stringbuilder.toString());
        }
        field_50064_a.func_50031_b(((GuiPlayerInfo)field_50068_i.get(field_50067_h++)).field_35624_a);
    }

    public void func_50058_a(int p_50058_1_)
    {
        int i = field_50063_c + p_50058_1_;
        int j = field_945_b.field_6308_u.func_50013_c().size();
        if(i < 0)
        {
            i = 0;
        }
        if(i > j)
        {
            i = j;
        }
        if(i == field_50063_c)
        {
            return;
        }
        if(i == j)
        {
            field_50063_c = j;
            field_50064_a.func_22068_a(field_50062_b);
            return;
        }
        if(field_50063_c == j)
        {
            field_50062_b = field_50064_a.func_22071_a();
        }
        field_50064_a.func_22068_a((String)field_945_b.field_6308_u.func_50013_c().get(i));
        field_50063_c = i;
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        func_551_a(2, field_950_d - 14, field_951_c - 2, field_950_d - 2, 0x80000000);
        field_50064_a.func_22067_c();
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }
}
