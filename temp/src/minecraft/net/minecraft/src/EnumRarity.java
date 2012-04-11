// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public final class EnumRarity extends Enum
{

    public static final EnumRarity common;
    public static final EnumRarity uncommon;
    public static final EnumRarity rare;
    public static final EnumRarity epic;
    public final int field_40535_e;
    public final String field_40532_f;
    private static final EnumRarity $VALUES[]; /* synthetic field */

    public static EnumRarity[] values()
    {
        return (EnumRarity[])$VALUES.clone();
    }

    public static EnumRarity valueOf(String p_valueOf_0_)
    {
        return (EnumRarity)Enum.valueOf(net.minecraft.src.EnumRarity.class, p_valueOf_0_);
    }

    private EnumRarity(String p_i325_1_, int p_i325_2_, int p_i325_3_, String p_i325_4_)
    {
        super(p_i325_1_, p_i325_2_);
        field_40535_e = p_i325_3_;
        field_40532_f = p_i325_4_;
    }

    static 
    {
        common = new EnumRarity("common", 0, 15, "Common");
        uncommon = new EnumRarity("uncommon", 1, 14, "Uncommon");
        rare = new EnumRarity("rare", 2, 11, "Rare");
        epic = new EnumRarity("epic", 3, 13, "Epic");
        $VALUES = (new EnumRarity[] {
            common, uncommon, rare, epic
        });
    }
}
