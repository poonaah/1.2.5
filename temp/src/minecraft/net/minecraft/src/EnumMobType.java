// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public final class EnumMobType extends Enum
{

    public static final EnumMobType everything;
    public static final EnumMobType mobs;
    public static final EnumMobType players;
    private static final EnumMobType $VALUES[]; /* synthetic field */

    public static EnumMobType[] values()
    {
        return (EnumMobType[])$VALUES.clone();
    }

    public static EnumMobType valueOf(String p_valueOf_0_)
    {
        return (EnumMobType)Enum.valueOf(net.minecraft.src.EnumMobType.class, p_valueOf_0_);
    }

    private EnumMobType(String p_i114_1_, int p_i114_2_)
    {
        super(p_i114_1_, p_i114_2_);
    }

    static 
    {
        everything = new EnumMobType("everything", 0);
        mobs = new EnumMobType("mobs", 1);
        players = new EnumMobType("players", 2);
        $VALUES = (new EnumMobType[] {
            everything, mobs, players
        });
    }
}
