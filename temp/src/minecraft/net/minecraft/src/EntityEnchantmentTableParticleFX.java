// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityFX, World

public class EntityEnchantmentTableParticleFX extends EntityFX
{

    private float field_40107_a;
    private double field_40109_aw;
    private double field_40108_ax;
    private double field_40106_ay;

    public EntityEnchantmentTableParticleFX(World p_i80_1_, double p_i80_2_, double p_i80_4_, double p_i80_6_, 
            double p_i80_8_, double p_i80_10_, double p_i80_12_)
    {
        super(p_i80_1_, p_i80_2_, p_i80_4_, p_i80_6_, p_i80_8_, p_i80_10_, p_i80_12_);
        field_608_an = p_i80_8_;
        field_607_ao = p_i80_10_;
        field_606_ap = p_i80_12_;
        field_40109_aw = field_611_ak = p_i80_2_;
        field_40108_ax = field_610_al = p_i80_4_;
        field_40106_ay = field_609_am = p_i80_6_;
        float f = field_9312_bd.nextFloat() * 0.6F + 0.4F;
        field_40107_a = field_665_g = field_9312_bd.nextFloat() * 0.5F + 0.2F;
        field_663_i = field_662_j = field_661_k = 1.0F * f;
        field_662_j *= 0.9F;
        field_663_i *= 0.9F;
        field_666_f = (int)(Math.random() * 10D) + 30;
        field_9314_ba = true;
        func_40099_c((int)(Math.random() * 26D + 1.0D + 224D));
    }

    public int func_35115_a(float p_35115_1_)
    {
        int i = super.func_35115_a(p_35115_1_);
        float f = (float)field_20923_e / (float)field_666_f;
        f *= f;
        f *= f;
        int j = i & 0xff;
        int k = i >> 16 & 0xff;
        k += (int)(f * 15F * 16F);
        if(k > 240)
        {
            k = 240;
        }
        return j | k << 16;
    }

    public float func_382_a(float p_382_1_)
    {
        float f = super.func_382_a(p_382_1_);
        float f1 = (float)field_20923_e / (float)field_666_f;
        f1 *= f1;
        f1 *= f1;
        return f * (1.0F - f1) + f1;
    }

    public void func_370_e_()
    {
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        float f = (float)field_20923_e / (float)field_666_f;
        f = 1.0F - f;
        float f1 = 1.0F - f;
        f1 *= f1;
        f1 *= f1;
        field_611_ak = field_40109_aw + field_608_an * (double)f;
        field_610_al = (field_40108_ax + field_607_ao * (double)f) - (double)(f1 * 1.2F);
        field_609_am = field_40106_ay + field_606_ap * (double)f;
        if(field_20923_e++ >= field_666_f)
        {
            func_395_F();
        }
    }
}
