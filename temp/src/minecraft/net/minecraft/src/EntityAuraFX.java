// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityFX, World

public class EntityAuraFX extends EntityFX
{

    public EntityAuraFX(World p_i691_1_, double p_i691_2_, double p_i691_4_, double p_i691_6_, 
            double p_i691_8_, double p_i691_10_, double p_i691_12_)
    {
        super(p_i691_1_, p_i691_2_, p_i691_4_, p_i691_6_, p_i691_8_, p_i691_10_, p_i691_12_);
        float f = field_9312_bd.nextFloat() * 0.1F + 0.2F;
        field_663_i = f;
        field_662_j = f;
        field_661_k = f;
        func_40099_c(0);
        func_371_a(0.02F, 0.02F);
        field_665_g = field_665_g * (field_9312_bd.nextFloat() * 0.6F + 0.5F);
        field_608_an *= 0.019999999552965164D;
        field_607_ao *= 0.019999999552965164D;
        field_606_ap *= 0.019999999552965164D;
        field_666_f = (int)(20D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D));
        field_9314_ba = true;
    }

    public void func_370_e_()
    {
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_608_an *= 0.98999999999999999D;
        field_607_ao *= 0.98999999999999999D;
        field_606_ap *= 0.98999999999999999D;
        if(field_666_f-- <= 0)
        {
            func_395_F();
        }
    }
}
