// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Enchantment, EnumEnchantmentType

public class EnchantmentUntouching extends Enchantment
{

    protected EnchantmentUntouching(int p_i12_1_, int p_i12_2_)
    {
        super(p_i12_1_, p_i12_2_, EnumEnchantmentType.digger);
        func_40494_a("untouching");
    }

    public int func_40492_a(int p_40492_1_)
    {
        return 25;
    }

    public int func_40489_b(int p_40489_1_)
    {
        return super.func_40492_a(p_40489_1_) + 50;
    }

    public int func_40491_a()
    {
        return 1;
    }

    public boolean func_40496_a(Enchantment p_40496_1_)
    {
        return super.func_40496_a(p_40496_1_) && p_40496_1_.field_40516_s != field_40517_r.field_40516_s;
    }
}
