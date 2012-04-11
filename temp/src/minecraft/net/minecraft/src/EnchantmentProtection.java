// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Enchantment, EnumEnchantmentType, DamageSource

public class EnchantmentProtection extends Enchantment
{

    private static final String field_40520_w[] = {
        "all", "fire", "fall", "explosion", "projectile"
    };
    private static final int field_40524_x[] = {
        1, 10, 5, 5, 3
    };
    private static final int field_40523_y[] = {
        16, 8, 6, 8, 6
    };
    private static final int field_40522_z[] = {
        20, 12, 10, 12, 15
    };
    public final int field_40521_v;

    public EnchantmentProtection(int p_i463_1_, int p_i463_2_, int p_i463_3_)
    {
        super(p_i463_1_, p_i463_2_, EnumEnchantmentType.armor);
        field_40521_v = p_i463_3_;
        if(p_i463_3_ == 2)
        {
            field_40515_t = EnumEnchantmentType.armor_feet;
        }
    }

    public int func_40492_a(int p_40492_1_)
    {
        return field_40524_x[field_40521_v] + (p_40492_1_ - 1) * field_40523_y[field_40521_v];
    }

    public int func_40489_b(int p_40489_1_)
    {
        return func_40492_a(p_40489_1_) + field_40522_z[field_40521_v];
    }

    public int func_40491_a()
    {
        return 4;
    }

    public int func_40497_a(int p_40497_1_, DamageSource p_40497_2_)
    {
        if(p_40497_2_.func_35529_d())
        {
            return 0;
        }
        int i = (6 + p_40497_1_ * p_40497_1_) / 2;
        if(field_40521_v == 0)
        {
            return i;
        }
        if(field_40521_v == 1 && p_40497_2_.func_40543_k())
        {
            return i;
        }
        if(field_40521_v == 2 && p_40497_2_ == DamageSource.field_35549_h)
        {
            return i * 2;
        }
        if(field_40521_v == 3 && p_40497_2_ == DamageSource.field_35548_k)
        {
            return i;
        }
        if(field_40521_v == 4 && p_40497_2_.func_40547_b())
        {
            return i;
        } else
        {
            return 0;
        }
    }

    public String func_40488_d()
    {
        return (new StringBuilder()).append("enchantment.protect.").append(field_40520_w[field_40521_v]).toString();
    }

    public boolean func_40496_a(Enchantment p_40496_1_)
    {
        if(p_40496_1_ instanceof EnchantmentProtection)
        {
            EnchantmentProtection enchantmentprotection = (EnchantmentProtection)p_40496_1_;
            if(enchantmentprotection.field_40521_v == field_40521_v)
            {
                return false;
            }
            return field_40521_v == 2 || enchantmentprotection.field_40521_v == 2;
        } else
        {
            return super.func_40496_a(p_40496_1_);
        }
    }

}
