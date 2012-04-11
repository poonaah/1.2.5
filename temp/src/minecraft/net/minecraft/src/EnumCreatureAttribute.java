// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public final class EnumCreatureAttribute extends Enum
{

    public static final EnumCreatureAttribute UNDEFINED;
    public static final EnumCreatureAttribute UNDEAD;
    public static final EnumCreatureAttribute ARTHROPOD;
    private static final EnumCreatureAttribute $VALUES[]; /* synthetic field */

    public static EnumCreatureAttribute[] values()
    {
        return (EnumCreatureAttribute[])$VALUES.clone();
    }

    public static EnumCreatureAttribute valueOf(String p_valueOf_0_)
    {
        return (EnumCreatureAttribute)Enum.valueOf(net.minecraft.src.EnumCreatureAttribute.class, p_valueOf_0_);
    }

    private EnumCreatureAttribute(String p_i246_1_, int p_i246_2_)
    {
        super(p_i246_1_, p_i246_2_);
    }

    static 
    {
        UNDEFINED = new EnumCreatureAttribute("UNDEFINED", 0);
        UNDEAD = new EnumCreatureAttribute("UNDEAD", 1);
        ARTHROPOD = new EnumCreatureAttribute("ARTHROPOD", 2);
        $VALUES = (new EnumCreatureAttribute[] {
            UNDEFINED, UNDEAD, ARTHROPOD
        });
    }
}
