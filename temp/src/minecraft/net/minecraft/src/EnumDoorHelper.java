// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EnumDoor

class EnumDoorHelper
{

    static final int field_35619_a[]; /* synthetic field */

    static 
    {
        field_35619_a = new int[EnumDoor.values().length];
        try
        {
            field_35619_a[EnumDoor.OPENING.ordinal()] = 1;
        }
        catch(NoSuchFieldError nosuchfielderror) { }
        try
        {
            field_35619_a[EnumDoor.WOOD_DOOR.ordinal()] = 2;
        }
        catch(NoSuchFieldError nosuchfielderror1) { }
        try
        {
            field_35619_a[EnumDoor.GRATES.ordinal()] = 3;
        }
        catch(NoSuchFieldError nosuchfielderror2) { }
        try
        {
            field_35619_a[EnumDoor.IRON_DOOR.ordinal()] = 4;
        }
        catch(NoSuchFieldError nosuchfielderror3) { }
    }
}
