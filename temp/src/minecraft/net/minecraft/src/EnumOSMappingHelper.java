// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EnumOS2

public class EnumOSMappingHelper
{

    public static final int field_1585_a[]; /* synthetic field */

    static 
    {
        field_1585_a = new int[EnumOS2.values().length];
        try
        {
            field_1585_a[EnumOS2.linux.ordinal()] = 1;
        }
        catch(NoSuchFieldError nosuchfielderror) { }
        try
        {
            field_1585_a[EnumOS2.solaris.ordinal()] = 2;
        }
        catch(NoSuchFieldError nosuchfielderror1) { }
        try
        {
            field_1585_a[EnumOS2.windows.ordinal()] = 3;
        }
        catch(NoSuchFieldError nosuchfielderror2) { }
        try
        {
            field_1585_a[EnumOS2.macos.ordinal()] = 4;
        }
        catch(NoSuchFieldError nosuchfielderror3) { }
    }
}
