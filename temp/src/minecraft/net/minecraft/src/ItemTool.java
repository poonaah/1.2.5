// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, EnumToolMaterial, ItemStack, Block, 
//            EntityLiving, Entity

public class ItemTool extends Item
{

    private Block field_325_aX[];
    protected float field_324_aY;
    private int field_323_aZ;
    protected EnumToolMaterial field_20927_a;

    protected ItemTool(int p_i278_1_, int p_i278_2_, EnumToolMaterial p_i278_3_, Block p_i278_4_[])
    {
        super(p_i278_1_);
        field_324_aY = 4F;
        field_20927_a = p_i278_3_;
        field_325_aX = p_i278_4_;
        field_290_aT = 1;
        func_21013_d(p_i278_3_.func_21207_a());
        field_324_aY = p_i278_3_.func_21206_b();
        field_323_aZ = p_i278_2_ + p_i278_3_.func_21205_c();
    }

    public float func_204_a(ItemStack p_204_1_, Block p_204_2_)
    {
        for(int i = 0; i < field_325_aX.length; i++)
        {
            if(field_325_aX[i] == p_204_2_)
            {
                return field_324_aY;
            }
        }

        return 1.0F;
    }

    public boolean func_4021_a(ItemStack p_4021_1_, EntityLiving p_4021_2_, EntityLiving p_4021_3_)
    {
        p_4021_1_.func_25190_a(2, p_4021_3_);
        return true;
    }

    public boolean func_25008_a(ItemStack p_25008_1_, int p_25008_2_, int p_25008_3_, int p_25008_4_, int p_25008_5_, EntityLiving p_25008_6_)
    {
        p_25008_1_.func_25190_a(1, p_25008_6_);
        return true;
    }

    public int func_4020_a(Entity p_4020_1_)
    {
        return field_323_aZ;
    }

    public boolean func_4017_a()
    {
        return true;
    }

    public int func_40399_b()
    {
        return field_20927_a.func_40731_e();
    }
}
