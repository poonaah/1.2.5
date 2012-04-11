// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public final class EnumStatus extends Enum
{

    public static final EnumStatus OK;
    public static final EnumStatus NOT_POSSIBLE_HERE;
    public static final EnumStatus NOT_POSSIBLE_NOW;
    public static final EnumStatus TOO_FAR_AWAY;
    public static final EnumStatus OTHER_PROBLEM;
    public static final EnumStatus NOT_SAFE;
    private static final EnumStatus $VALUES[]; /* synthetic field */

    public static EnumStatus[] values()
    {
        return (EnumStatus[])$VALUES.clone();
    }

    public static EnumStatus valueOf(String p_valueOf_0_)
    {
        return (EnumStatus)Enum.valueOf(net.minecraft.src.EnumStatus.class, p_valueOf_0_);
    }

    private EnumStatus(String p_i263_1_, int p_i263_2_)
    {
        super(p_i263_1_, p_i263_2_);
    }

    static 
    {
        OK = new EnumStatus("OK", 0);
        NOT_POSSIBLE_HERE = new EnumStatus("NOT_POSSIBLE_HERE", 1);
        NOT_POSSIBLE_NOW = new EnumStatus("NOT_POSSIBLE_NOW", 2);
        TOO_FAR_AWAY = new EnumStatus("TOO_FAR_AWAY", 3);
        OTHER_PROBLEM = new EnumStatus("OTHER_PROBLEM", 4);
        NOT_SAFE = new EnumStatus("NOT_SAFE", 5);
        $VALUES = (new EnumStatus[] {
            OK, NOT_POSSIBLE_HERE, NOT_POSSIBLE_NOW, TOO_FAR_AWAY, OTHER_PROBLEM, NOT_SAFE
        });
    }
}
