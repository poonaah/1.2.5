// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            IMob, Material, EntityAnimal, EntityWaterMob

public final class EnumCreatureType extends Enum
{

    public static final EnumCreatureType monster;
    public static final EnumCreatureType creature;
    public static final EnumCreatureType waterCreature;
    private final Class field_4278_c;
    private final int field_4277_d;
    private final Material field_21173_f;
    private final boolean field_21172_g;
    private static final EnumCreatureType $VALUES[]; /* synthetic field */

    public static EnumCreatureType[] values()
    {
        return (EnumCreatureType[])$VALUES.clone();
    }

    public static EnumCreatureType valueOf(String p_valueOf_0_)
    {
        return (EnumCreatureType)Enum.valueOf(net.minecraft.src.EnumCreatureType.class, p_valueOf_0_);
    }

    private EnumCreatureType(String p_i10_1_, int p_i10_2_, Class p_i10_3_, int p_i10_4_, Material p_i10_5_, boolean p_i10_6_)
    {
        super(p_i10_1_, p_i10_2_);
        field_4278_c = p_i10_3_;
        field_4277_d = p_i10_4_;
        field_21173_f = p_i10_5_;
        field_21172_g = p_i10_6_;
    }

    public Class func_21170_a()
    {
        return field_4278_c;
    }

    public int func_21169_b()
    {
        return field_4277_d;
    }

    public Material func_21171_c()
    {
        return field_21173_f;
    }

    public boolean func_21168_d()
    {
        return field_21172_g;
    }

    static 
    {
        monster = new EnumCreatureType("monster", 0, net.minecraft.src.IMob.class, 70, Material.field_1337_a, false);
        creature = new EnumCreatureType("creature", 1, net.minecraft.src.EntityAnimal.class, 15, Material.field_1337_a, true);
        waterCreature = new EnumCreatureType("waterCreature", 2, net.minecraft.src.EntityWaterMob.class, 5, Material.field_1332_f, true);
        $VALUES = (new EnumCreatureType[] {
            monster, creature, waterCreature
        });
    }
}
