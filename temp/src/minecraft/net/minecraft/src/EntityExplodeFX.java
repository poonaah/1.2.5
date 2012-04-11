// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityFX, World

public class EntityExplodeFX extends EntityFX
{

    public EntityExplodeFX(World p_i711_1_, double p_i711_2_, double p_i711_4_, double p_i711_6_, 
            double p_i711_8_, double p_i711_10_, double p_i711_12_)
    {
        super(p_i711_1_, p_i711_2_, p_i711_4_, p_i711_6_, p_i711_8_, p_i711_10_, p_i711_12_);
        field_608_an = p_i711_8_ + (double)((float)(Math.random() * 2D - 1.0D) * 0.05F);
        field_607_ao = p_i711_10_ + (double)((float)(Math.random() * 2D - 1.0D) * 0.05F);
        field_606_ap = p_i711_12_ + (double)((float)(Math.random() * 2D - 1.0D) * 0.05F);
        field_663_i = field_662_j = field_661_k = field_9312_bd.nextFloat() * 0.3F + 0.7F;
        field_665_g = field_9312_bd.nextFloat() * field_9312_bd.nextFloat() * 6F + 1.0F;
        field_666_f = (int)(16D / ((double)field_9312_bd.nextFloat() * 0.80000000000000004D + 0.20000000000000001D)) + 2;
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
        func_40099_c(7 - (field_20923_e * 8) / field_666_f);
        field_607_ao += 0.0040000000000000001D;
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_608_an *= 0.89999997615814209D;
        field_607_ao *= 0.89999997615814209D;
        field_606_ap *= 0.89999997615814209D;
        if(field_9298_aH)
        {
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
        }
    }
}
