// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class GuiPlayerInfo
{

    public final String field_35624_a;
    private final String field_50099_c;
    public int field_35623_b;

    public GuiPlayerInfo(String p_i119_1_)
    {
        field_35624_a = p_i119_1_;
        field_50099_c = p_i119_1_.toLowerCase();
    }

    public boolean func_50098_a(String p_50098_1_)
    {
        return field_50099_c.startsWith(p_50098_1_);
    }
}
