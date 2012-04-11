// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public final class EnumMovingObjectType extends Enum
{

    public static final EnumMovingObjectType TILE;
    public static final EnumMovingObjectType ENTITY;
    private static final EnumMovingObjectType $VALUES[]; /* synthetic field */

    public static EnumMovingObjectType[] values()
    {
        return (EnumMovingObjectType[])$VALUES.clone();
    }

    public static EnumMovingObjectType valueOf(String p_valueOf_0_)
    {
        return (EnumMovingObjectType)Enum.valueOf(net.minecraft.src.EnumMovingObjectType.class, p_valueOf_0_);
    }

    private EnumMovingObjectType(String p_i753_1_, int p_i753_2_)
    {
        super(p_i753_1_, p_i753_2_);
    }

    static 
    {
        TILE = new EnumMovingObjectType("TILE", 0);
        ENTITY = new EnumMovingObjectType("ENTITY", 1);
        $VALUES = (new EnumMovingObjectType[] {
            TILE, ENTITY
        });
    }
}
