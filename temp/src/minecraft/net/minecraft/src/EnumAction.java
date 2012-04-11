// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public final class EnumAction extends Enum
{

    public static final EnumAction none;
    public static final EnumAction eat;
    public static final EnumAction drink;
    public static final EnumAction block;
    public static final EnumAction bow;
    private static final EnumAction $VALUES[]; /* synthetic field */

    public static EnumAction[] values()
    {
        return (EnumAction[])$VALUES.clone();
    }

    public static EnumAction valueOf(String p_valueOf_0_)
    {
        return (EnumAction)Enum.valueOf(net.minecraft.src.EnumAction.class, p_valueOf_0_);
    }

    private EnumAction(String p_i751_1_, int p_i751_2_)
    {
        super(p_i751_1_, p_i751_2_);
    }

    static 
    {
        none = new EnumAction("none", 0);
        eat = new EnumAction("eat", 1);
        drink = new EnumAction("drink", 2);
        block = new EnumAction("block", 3);
        bow = new EnumAction("bow", 4);
        $VALUES = (new EnumAction[] {
            none, eat, drink, block, bow
        });
    }
}
