// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, EnumArmorMaterial

public class ItemArmor extends Item
{

    private static final int field_314_bb[] = {
        11, 16, 15, 13
    };
    public final int field_313_aX;
    public final int field_312_aY;
    public final int field_311_aZ;
    private final EnumArmorMaterial field_40437_bT;

    public ItemArmor(int p_i549_1_, EnumArmorMaterial p_i549_2_, int p_i549_3_, int p_i549_4_)
    {
        super(p_i549_1_);
        field_40437_bT = p_i549_2_;
        field_313_aX = p_i549_4_;
        field_311_aZ = p_i549_3_;
        field_312_aY = p_i549_2_.func_40574_b(p_i549_4_);
        func_21013_d(p_i549_2_.func_40576_a(p_i549_4_));
        field_290_aT = 1;
    }

    public int func_40399_b()
    {
        return field_40437_bT.func_40575_a();
    }

    static int[] func_40436_c()
    {
        return field_314_bb;
    }

}
