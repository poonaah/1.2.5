// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, StringTranslate, GuiSmallButton, GuiButton

public class GuiYesNo extends GuiScreen
{

    private GuiScreen field_961_a;
    private String field_964_h;
    private String field_963_i;
    protected String field_22106_k;
    protected String field_22105_l;
    private int field_962_j;

    public GuiYesNo(GuiScreen p_i1204_1_, String p_i1204_2_, String p_i1204_3_, int p_i1204_4_)
    {
        field_961_a = p_i1204_1_;
        field_964_h = p_i1204_2_;
        field_963_i = p_i1204_3_;
        field_962_j = p_i1204_4_;
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        field_22106_k = stringtranslate.func_20163_a("gui.yes");
        field_22105_l = stringtranslate.func_20163_a("gui.no");
    }

    public GuiYesNo(GuiScreen p_i453_1_, String p_i453_2_, String p_i453_3_, String p_i453_4_, String p_i453_5_, int p_i453_6_)
    {
        field_961_a = p_i453_1_;
        field_964_h = p_i453_2_;
        field_963_i = p_i453_3_;
        field_22106_k = p_i453_4_;
        field_22105_l = p_i453_5_;
        field_962_j = p_i453_6_;
    }

    public void func_6448_a()
    {
        field_949_e.add(new GuiSmallButton(0, field_951_c / 2 - 155, field_950_d / 6 + 96, field_22106_k));
        field_949_e.add(new GuiSmallButton(1, (field_951_c / 2 - 155) + 160, field_950_d / 6 + 96, field_22105_l));
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        field_961_a.func_568_a(p_572_1_.field_938_f == 0, field_962_j);
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        func_578_i();
        func_548_a(field_6451_g, field_964_h, field_951_c / 2, 70, 0xffffff);
        func_548_a(field_6451_g, field_963_i, field_951_c / 2, 90, 0xffffff);
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }
}
