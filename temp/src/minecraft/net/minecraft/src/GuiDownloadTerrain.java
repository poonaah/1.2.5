// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, Packet0KeepAlive, NetClientHandler, StringTranslate, 
//            GuiButton

public class GuiDownloadTerrain extends GuiScreen
{

    private NetClientHandler field_983_a;
    private int field_984_h;

    public GuiDownloadTerrain(NetClientHandler p_i311_1_)
    {
        field_984_h = 0;
        field_983_a = p_i311_1_;
    }

    protected void func_580_a(char c, int i)
    {
    }

    public void func_6448_a()
    {
        field_949_e.clear();
    }

    public void func_570_g()
    {
        field_984_h++;
        if(field_984_h % 20 == 0)
        {
            field_983_a.func_847_a(new Packet0KeepAlive());
        }
        if(field_983_a != null)
        {
            field_983_a.func_848_a();
        }
    }

    protected void func_572_a(GuiButton guibutton)
    {
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        func_579_b(0);
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        func_548_a(field_6451_g, stringtranslate.func_20163_a("multiplayer.downloadingTerrain"), field_951_c / 2, field_950_d / 2 - 50, 0xffffff);
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }
}
