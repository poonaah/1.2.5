// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IEnchantmentModifier, Enchantment, EntityLiving, Empty3

final class EnchantmentModifierLiving
    implements IEnchantmentModifier
{

    public int field_40248_a;
    public EntityLiving field_40247_b;

    private EnchantmentModifierLiving()
    {
    }

    public void func_40244_a(Enchantment p_40244_1_, int p_40244_2_)
    {
        field_40248_a += p_40244_1_.func_40490_a(p_40244_2_, field_40247_b);
    }

    EnchantmentModifierLiving(Empty3 p_i583_1_)
    {
        this();
    }
}
