// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GuiScreen

public class GuiErrorScreen extends GuiScreen
{

    private String field_997_a;
    private String field_998_h;

    public void func_6448_a()
    {
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        func_549_a(0, 0, field_951_c, field_950_d, 0xff402020, 0xff501010);
        func_548_a(field_6451_g, field_997_a, field_951_c / 2, 90, 0xffffff);
        func_548_a(field_6451_g, field_998_h, field_951_c / 2, 110, 0xffffff);
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }

    protected void func_580_a(char c, int i)
    {
    }
}
