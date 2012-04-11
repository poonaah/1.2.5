// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.List;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, ThreadConnectToServer, NetClientHandler, StringTranslate, 
//            GuiButton, GuiMainMenu

public class GuiConnecting extends GuiScreen
{

    private NetClientHandler field_952_a;
    private boolean field_953_h;

    public GuiConnecting(Minecraft p_i172_1_, String p_i172_2_, int p_i172_3_)
    {
        field_953_h = false;
        System.out.println((new StringBuilder()).append("Connecting to ").append(p_i172_2_).append(", ").append(p_i172_3_).toString());
        p_i172_1_.func_6261_a(null);
        (new ThreadConnectToServer(this, p_i172_1_, p_i172_2_, p_i172_3_)).start();
    }

    public void func_570_g()
    {
        if(field_952_a != null)
        {
            field_952_a.func_848_a();
        }
    }

    protected void func_580_a(char c, int i)
    {
    }

    public void func_6448_a()
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        field_949_e.clear();
        field_949_e.add(new GuiButton(0, field_951_c / 2 - 100, field_950_d / 4 + 120 + 12, stringtranslate.func_20163_a("gui.cancel")));
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(p_572_1_.field_938_f == 0)
        {
            field_953_h = true;
            if(field_952_a != null)
            {
                field_952_a.func_849_b();
            }
            field_945_b.func_6272_a(new GuiMainMenu());
        }
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        func_578_i();
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        if(field_952_a == null)
        {
            func_548_a(field_6451_g, stringtranslate.func_20163_a("connect.connecting"), field_951_c / 2, field_950_d / 2 - 50, 0xffffff);
            func_548_a(field_6451_g, "", field_951_c / 2, field_950_d / 2 - 10, 0xffffff);
        } else
        {
            func_548_a(field_6451_g, stringtranslate.func_20163_a("connect.authorizing"), field_951_c / 2, field_950_d / 2 - 50, 0xffffff);
            func_548_a(field_6451_g, field_952_a.field_1209_a, field_951_c / 2, field_950_d / 2 - 10, 0xffffff);
        }
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }

    static NetClientHandler func_582_a(GuiConnecting p_582_0_, NetClientHandler p_582_1_)
    {
        return p_582_0_.field_952_a = p_582_1_;
    }

    static boolean func_581_a(GuiConnecting p_581_0_)
    {
        return p_581_0_.field_953_h;
    }

    static NetClientHandler func_583_b(GuiConnecting p_583_0_)
    {
        return p_583_0_.field_952_a;
    }
}
