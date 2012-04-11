// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public final class EnumSkyBlock extends Enum
{

    public static final EnumSkyBlock Sky;
    public static final EnumSkyBlock Block;
    public final int field_1722_c;
    private static final EnumSkyBlock $VALUES[]; /* synthetic field */

    public static EnumSkyBlock[] values()
    {
        return (EnumSkyBlock[])$VALUES.clone();
    }

    public static EnumSkyBlock valueOf(String p_valueOf_0_)
    {
        return (EnumSkyBlock)Enum.valueOf(net.minecraft.src.EnumSkyBlock.class, p_valueOf_0_);
    }

    private EnumSkyBlock(String p_i659_1_, int p_i659_2_, int p_i659_3_)
    {
        super(p_i659_1_, p_i659_2_);
        field_1722_c = p_i659_3_;
    }

    static 
    {
        Sky = new EnumSkyBlock("Sky", 0, 15);
        Block = new EnumSkyBlock("Block", 1, 0);
        $VALUES = (new EnumSkyBlock[] {
            Sky, Block
        });
    }
}
