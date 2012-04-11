// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            GuiYesNo, StringTranslate, GuiButton, GuiScreen

public abstract class GuiConfirmOpenLink extends GuiYesNo
{

    private String field_50054_a;
    private String field_50053_b;

    public GuiConfirmOpenLink(GuiScreen p_i1200_1_, String p_i1200_2_, int p_i1200_3_)
    {
        super(p_i1200_1_, StringTranslate.func_20162_a().func_20163_a("chat.link.confirm"), p_i1200_2_, p_i1200_3_);
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        field_22106_k = stringtranslate.func_20163_a("gui.yes");
        field_22105_l = stringtranslate.func_20163_a("gui.no");
        field_50053_b = stringtranslate.func_20163_a("chat.copy");
        field_50054_a = stringtranslate.func_20163_a("chat.link.warning");
    }

    public void func_6448_a()
    {
        field_949_e.add(new GuiButton(0, (field_951_c / 3 - 83) + 0, field_950_d / 6 + 96, 100, 20, field_22106_k));
        field_949_e.add(new GuiButton(2, (field_951_c / 3 - 83) + 105, field_950_d / 6 + 96, 100, 20, field_50053_b));
        field_949_e.add(new GuiButton(1, (field_951_c / 3 - 83) + 210, field_950_d / 6 + 96, 100, 20, field_22105_l));
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(p_572_1_.field_938_f == 2)
        {
            func_50052_d();
            super.func_572_a((GuiButton)field_949_e.get(1));
        } else
        {
            super.func_572_a(p_572_1_);
        }
    }

    public abstract void func_50052_d();

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
        func_548_a(field_6451_g, field_50054_a, field_951_c / 2, 110, 0xffcccc);
    }
}
