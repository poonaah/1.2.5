// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


final class EnumOS1 extends Enum
{

    public static final EnumOS1 linux;
    public static final EnumOS1 solaris;
    public static final EnumOS1 windows;
    public static final EnumOS1 macos;
    public static final EnumOS1 unknown;
    private static final EnumOS1 $VALUES[]; /* synthetic field */

    public static EnumOS1[] values()
    {
        return (EnumOS1[])$VALUES.clone();
    }

    public static EnumOS1 valueOf(String p_valueOf_0_)
    {
        return (EnumOS1)Enum.valueOf(net.minecraft.src.EnumOS1.class, p_valueOf_0_);
    }

    private EnumOS1(String p_i758_1_, int p_i758_2_)
    {
        super(p_i758_1_, p_i758_2_);
    }

    static 
    {
        linux = new EnumOS1("linux", 0);
        solaris = new EnumOS1("solaris", 1);
        windows = new EnumOS1("windows", 2);
        macos = new EnumOS1("macos", 3);
        unknown = new EnumOS1("unknown", 4);
        $VALUES = (new EnumOS1[] {
            linux, solaris, windows, macos, unknown
        });
    }
}
