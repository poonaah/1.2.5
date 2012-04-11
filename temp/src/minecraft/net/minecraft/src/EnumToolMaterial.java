// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public final class EnumToolMaterial extends Enum
{

    public static final EnumToolMaterial WOOD;
    public static final EnumToolMaterial STONE;
    public static final EnumToolMaterial IRON;
    public static final EnumToolMaterial EMERALD;
    public static final EnumToolMaterial GOLD;
    private final int field_21213_f;
    private final int field_21212_g;
    private final float field_21211_h;
    private final int field_21210_i;
    private final int field_40732_j;
    private static final EnumToolMaterial $VALUES[]; /* synthetic field */

    public static EnumToolMaterial[] values()
    {
        return (EnumToolMaterial[])$VALUES.clone();
    }

    public static EnumToolMaterial valueOf(String p_valueOf_0_)
    {
        return (EnumToolMaterial)Enum.valueOf(net.minecraft.src.EnumToolMaterial.class, p_valueOf_0_);
    }

    private EnumToolMaterial(String p_i628_1_, int p_i628_2_, int p_i628_3_, int p_i628_4_, float p_i628_5_, int p_i628_6_, int p_i628_7_)
    {
        super(p_i628_1_, p_i628_2_);
        field_21213_f = p_i628_3_;
        field_21212_g = p_i628_4_;
        field_21211_h = p_i628_5_;
        field_21210_i = p_i628_6_;
        field_40732_j = p_i628_7_;
    }

    public int func_21207_a()
    {
        return field_21212_g;
    }

    public float func_21206_b()
    {
        return field_21211_h;
    }

    public int func_21205_c()
    {
        return field_21210_i;
    }

    public int func_21208_d()
    {
        return field_21213_f;
    }

    public int func_40731_e()
    {
        return field_40732_j;
    }

    static 
    {
        WOOD = new EnumToolMaterial("WOOD", 0, 0, 59, 2.0F, 0, 15);
        STONE = new EnumToolMaterial("STONE", 1, 1, 131, 4F, 1, 5);
        IRON = new EnumToolMaterial("IRON", 2, 2, 250, 6F, 2, 14);
        EMERALD = new EnumToolMaterial("EMERALD", 3, 3, 1561, 8F, 3, 10);
        GOLD = new EnumToolMaterial("GOLD", 4, 0, 32, 12F, 0, 22);
        $VALUES = (new EnumToolMaterial[] {
            WOOD, STONE, IRON, EMERALD, GOLD
        });
    }
}
