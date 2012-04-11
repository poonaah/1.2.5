// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, StringTranslate, GuiButton, GuiMainMenu

public class GuiDisconnected extends GuiScreen
{

    private String field_992_a;
    private String field_993_h;

    public GuiDisconnected(String p_i292_1_, String p_i292_2_, Object p_i292_3_[])
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        field_992_a = stringtranslate.func_20163_a(p_i292_1_);
        if(p_i292_3_ != null)
        {
            field_993_h = stringtranslate.func_20160_a(p_i292_2_, p_i292_3_);
        } else
        {
            field_993_h = stringtranslate.func_20163_a(p_i292_2_);
        }
    }

    public void func_570_g()
    {
    }

    protected void func_580_a(char c, int i)
    {
    }

    public void func_6448_a()
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        field_949_e.clear();
        field_949_e.add(new GuiButton(0, field_951_c / 2 - 100, field_950_d / 4 + 120 + 12, stringtranslate.func_20163_a("gui.toMenu")));
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(p_572_1_.field_938_f == 0)
        {
            field_945_b.func_6272_a(new GuiMainMenu());
        }
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        func_578_i();
        func_548_a(field_6451_g, field_992_a, field_951_c / 2, field_950_d / 2 - 50, 0xffffff);
        func_548_a(field_6451_g, field_993_h, field_951_c / 2, field_950_d / 2 - 10, 0xffffff);
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }
}
