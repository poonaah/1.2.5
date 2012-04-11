// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import org.lwjgl.input.Keyboard;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, GuiTextField, StringTranslate, GuiButton, 
//            ServerNBTStorage

public class GuiScreenAddServer extends GuiScreen
{

    private GuiScreen field_35362_a;
    private GuiTextField field_35360_b;
    private GuiTextField field_35361_c;
    private ServerNBTStorage field_35359_d;

    public GuiScreenAddServer(GuiScreen p_i688_1_, ServerNBTStorage p_i688_2_)
    {
        field_35362_a = p_i688_1_;
        field_35359_d = p_i688_2_;
    }

    public void func_570_g()
    {
        field_35361_c.func_22070_b();
        field_35360_b.func_22070_b();
    }

    public void func_6448_a()
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        Keyboard.enableRepeatEvents(true);
        field_949_e.clear();
        field_949_e.add(new GuiButton(0, field_951_c / 2 - 100, field_950_d / 4 + 96 + 12, stringtranslate.func_20163_a("addServer.add")));
        field_949_e.add(new GuiButton(1, field_951_c / 2 - 100, field_950_d / 4 + 120 + 12, stringtranslate.func_20163_a("gui.cancel")));
        field_35361_c = new GuiTextField(field_6451_g, field_951_c / 2 - 100, 76, 200, 20);
        field_35361_c.func_50033_b(true);
        field_35361_c.func_22068_a(field_35359_d.field_35795_a);
        field_35360_b = new GuiTextField(field_6451_g, field_951_c / 2 - 100, 116, 200, 20);
        field_35360_b.func_22066_a(128);
        field_35360_b.func_22068_a(field_35359_d.field_35793_b);
        ((GuiButton)field_949_e.get(0)).field_937_g = field_35360_b.func_22071_a().length() > 0 && field_35360_b.func_22071_a().split(":").length > 0 && field_35361_c.func_22071_a().length() > 0;
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
        if(p_572_1_.field_938_f == 1)
        {
            field_35362_a.func_568_a(false, 0);
        } else
        if(p_572_1_.field_938_f == 0)
        {
            field_35359_d.field_35795_a = field_35361_c.func_22071_a();
            field_35359_d.field_35793_b = field_35360_b.func_22071_a();
            field_35362_a.func_568_a(true, 0);
        }
    }

    protected void func_580_a(char p_580_1_, int p_580_2_)
    {
        field_35361_c.func_50037_a(p_580_1_, p_580_2_);
        field_35360_b.func_50037_a(p_580_1_, p_580_2_);
        if(p_580_1_ == '\t')
        {
            if(field_35361_c.func_50025_j())
            {
                field_35361_c.func_50033_b(false);
                field_35360_b.func_50033_b(true);
            } else
            {
                field_35361_c.func_50033_b(true);
                field_35360_b.func_50033_b(false);
            }
        }
        if(p_580_1_ == '\r')
        {
            func_572_a((GuiButton)field_949_e.get(0));
        }
        ((GuiButton)field_949_e.get(0)).field_937_g = field_35360_b.func_22071_a().length() > 0 && field_35360_b.func_22071_a().split(":").length > 0 && field_35361_c.func_22071_a().length() > 0;
        if(((GuiButton)field_949_e.get(0)).field_937_g)
        {
            String s = field_35360_b.func_22071_a().trim();
            String as[] = s.split(":");
            if(as.length > 2)
            {
                ((GuiButton)field_949_e.get(0)).field_937_g = false;
            }
        }
    }

    protected void func_565_a(int p_565_1_, int p_565_2_, int p_565_3_)
    {
        super.func_565_a(p_565_1_, p_565_2_, p_565_3_);
        field_35360_b.func_22069_a(p_565_1_, p_565_2_, p_565_3_);
        field_35361_c.func_22069_a(p_565_1_, p_565_2_, p_565_3_);
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        func_578_i();
        func_548_a(field_6451_g, stringtranslate.func_20163_a("addServer.title"), field_951_c / 2, (field_950_d / 4 - 60) + 20, 0xffffff);
        func_547_b(field_6451_g, stringtranslate.func_20163_a("addServer.enterName"), field_951_c / 2 - 100, 63, 0xa0a0a0);
        func_547_b(field_6451_g, stringtranslate.func_20163_a("addServer.enterIp"), field_951_c / 2 - 100, 104, 0xa0a0a0);
        field_35361_c.func_22067_c();
        field_35360_b.func_22067_c();
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }
}
