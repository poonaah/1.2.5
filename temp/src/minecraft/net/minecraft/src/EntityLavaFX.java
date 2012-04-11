// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityFX, World, Tessellator

public class EntityLavaFX extends EntityFX
{

    private float field_674_a;

    public EntityLavaFX(World p_i294_1_, double p_i294_2_, double p_i294_4_, double p_i294_6_)
    {
        super(p_i294_1_, p_i294_2_, p_i294_4_, p_i294_6_, 0.0D, 0.0D, 0.0D);
        field_608_an *= 0.80000001192092896D;
        field_607_ao *= 0.80000001192092896D;
        field_606_ap *= 0.80000001192092896D;
        field_607_ao = field_9312_bd.nextFloat() * 0.4F + 0.05F;
        field_663_i = field_662_j = field_661_k = 1.0F;
        field_665_g *= field_9312_bd.nextFloat() * 2.0F + 0.2F;
        field_674_a = field_665_g;
        field_666_f = (int)(16D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D));
        field_9314_ba = false;
        func_40099_c(49);
    }

    public int func_35115_a(float p_35115_1_)
    {
        float f = ((float)field_20923_e + p_35115_1_) / (float)field_666_f;
        if(f < 0.0F)
        {
            f = 0.0F;
        }
        if(f > 1.0F)
        {
            f = 1.0F;
        }
        int i = super.func_35115_a(p_35115_1_);
        char c = '\360';
        int j = i >> 16 & 0xff;
        return c | j << 16;
    }

    public float func_382_a(float p_382_1_)
    {
        return 1.0F;
    }

    public void func_406_a(Tessellator p_406_1_, float p_406_2_, float p_406_3_, float p_406_4_, float p_406_5_, float p_406_6_, float p_406_7_)
    {
        float f = ((float)field_20923_e + p_406_2_) / (float)field_666_f;
        field_665_g = field_674_a * (1.0F - f * f);
        super.func_406_a(p_406_1_, p_406_2_, p_406_3_, p_406_4_, p_406_5_, p_406_6_, p_406_7_);
    }

    public void func_370_e_()
    {
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        if(field_20923_e++ >= field_666_f)
        {
            func_395_F();
        }
        float f = (float)field_20923_e / (float)field_666_f;
        if(field_9312_bd.nextFloat() > f)
        {
            field_615_ag.func_694_a("smoke", field_611_ak, field_610_al, field_609_am, field_608_an, field_607_ao, field_606_ap);
        }
        field_607_ao -= 0.029999999999999999D;
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_608_an *= 0.99900001287460327D;
        field_607_ao *= 0.99900001287460327D;
        field_606_ap *= 0.99900001287460327D;
        if(field_9298_aH)
        {
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
        }
    }
}
