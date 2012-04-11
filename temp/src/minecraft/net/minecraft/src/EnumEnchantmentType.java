// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemArmor, ItemSword, ItemTool, ItemBow, 
//            Item

public final class EnumEnchantmentType extends Enum
{

    public static final EnumEnchantmentType all;
    public static final EnumEnchantmentType armor;
    public static final EnumEnchantmentType armor_feet;
    public static final EnumEnchantmentType armor_legs;
    public static final EnumEnchantmentType armor_torso;
    public static final EnumEnchantmentType armor_head;
    public static final EnumEnchantmentType weapon;
    public static final EnumEnchantmentType digger;
    public static final EnumEnchantmentType bow;
    private static final EnumEnchantmentType $VALUES[]; /* synthetic field */

    public static EnumEnchantmentType[] values()
    {
        return (EnumEnchantmentType[])$VALUES.clone();
    }

    public static EnumEnchantmentType valueOf(String p_valueOf_0_)
    {
        return (EnumEnchantmentType)Enum.valueOf(net.minecraft.src.EnumEnchantmentType.class, p_valueOf_0_);
    }

    private EnumEnchantmentType(String p_i445_1_, int p_i445_2_)
    {
        super(p_i445_1_, p_i445_2_);
    }

    public boolean func_40650_a(Item p_40650_1_)
    {
        if(this == all)
        {
            return true;
        }
        if(p_40650_1_ instanceof ItemArmor)
        {
            if(this == armor)
            {
                return true;
            }
            ItemArmor itemarmor = (ItemArmor)p_40650_1_;
            if(itemarmor.field_313_aX == 0)
            {
                return this == armor_head;
            }
            if(itemarmor.field_313_aX == 2)
            {
                return this == armor_legs;
            }
            if(itemarmor.field_313_aX == 1)
            {
                return this == armor_torso;
            }
            if(itemarmor.field_313_aX == 3)
            {
                return this == armor_feet;
            } else
            {
                return false;
            }
        }
        if(p_40650_1_ instanceof ItemSword)
        {
            return this == weapon;
        }
        if(p_40650_1_ instanceof ItemTool)
        {
            return this == digger;
        }
        if(p_40650_1_ instanceof ItemBow)
        {
            return this == bow;
        } else
        {
            return false;
        }
    }

    static 
    {
        all = new EnumEnchantmentType("all", 0);
        armor = new EnumEnchantmentType("armor", 1);
        armor_feet = new EnumEnchantmentType("armor_feet", 2);
        armor_legs = new EnumEnchantmentType("armor_legs", 3);
        armor_torso = new EnumEnchantmentType("armor_torso", 4);
        armor_head = new EnumEnchantmentType("armor_head", 5);
        weapon = new EnumEnchantmentType("weapon", 6);
        digger = new EnumEnchantmentType("digger", 7);
        bow = new EnumEnchantmentType("bow", 8);
        $VALUES = (new EnumEnchantmentType[] {
            all, armor, armor_feet, armor_legs, armor_torso, armor_head, weapon, digger, bow
        });
    }
}
