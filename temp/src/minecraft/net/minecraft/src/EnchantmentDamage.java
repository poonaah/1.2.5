// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Enchantment, EnumEnchantmentType, EntityLiving, EnumCreatureAttribute

public class EnchantmentDamage extends Enchantment
{

    private static final String field_40525_w[] = {
        "all", "undead", "arthropods"
    };
    private static final int field_40529_x[] = {
        1, 5, 5
    };
    private static final int field_40528_y[] = {
        16, 8, 8
    };
    private static final int field_40527_z[] = {
        20, 20, 20
    };
    public final int field_40526_v;

    public EnchantmentDamage(int p_i5_1_, int p_i5_2_, int p_i5_3_)
    {
        super(p_i5_1_, p_i5_2_, EnumEnchantmentType.weapon);
        field_40526_v = p_i5_3_;
    }

    public int func_40492_a(int p_40492_1_)
    {
        return field_40529_x[field_40526_v] + (p_40492_1_ - 1) * field_40528_y[field_40526_v];
    }

    public int func_40489_b(int p_40489_1_)
    {
        return func_40492_a(p_40489_1_) + field_40527_z[field_40526_v];
    }

    public int func_40491_a()
    {
        return 5;
    }

    public int func_40490_a(int p_40490_1_, EntityLiving p_40490_2_)
    {
        if(field_40526_v == 0)
        {
            return p_40490_1_ * 3;
        }
        if(field_40526_v == 1 && p_40490_2_.func_40124_t() == EnumCreatureAttribute.UNDEAD)
        {
            return p_40490_1_ * 4;
        }
        if(field_40526_v == 2 && p_40490_2_.func_40124_t() == EnumCreatureAttribute.ARTHROPOD)
        {
            return p_40490_1_ * 4;
        } else
        {
            return 0;
        }
    }

    public String func_40488_d()
    {
        return (new StringBuilder()).append("enchantment.damage.").append(field_40525_w[field_40526_v]).toString();
    }

    public boolean func_40496_a(Enchantment p_40496_1_)
    {
        return !(p_40496_1_ instanceof EnchantmentDamage);
    }

}
