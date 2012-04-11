// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Enchantment, EnumEnchantmentType

public class EnchantmentOxygen extends Enchantment
{

    public EnchantmentOxygen(int p_i532_1_, int p_i532_2_)
    {
        super(p_i532_1_, p_i532_2_, EnumEnchantmentType.armor_head);
        func_40494_a("oxygen");
    }

    public int func_40492_a(int p_40492_1_)
    {
        return 10 * p_40492_1_;
    }

    public int func_40489_b(int p_40489_1_)
    {
        return func_40492_a(p_40489_1_) + 30;
    }

    public int func_40491_a()
    {
        return 3;
    }
}
