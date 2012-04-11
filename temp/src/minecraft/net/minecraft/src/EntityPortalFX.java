// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityFX, World, Tessellator

public class EntityPortalFX extends EntityFX
{

    private float field_4083_a;
    private double field_4086_p;
    private double field_4085_q;
    private double field_4084_r;

    public EntityPortalFX(World p_i68_1_, double p_i68_2_, double p_i68_4_, double p_i68_6_, 
            double p_i68_8_, double p_i68_10_, double p_i68_12_)
    {
        super(p_i68_1_, p_i68_2_, p_i68_4_, p_i68_6_, p_i68_8_, p_i68_10_, p_i68_12_);
        field_608_an = p_i68_8_;
        field_607_ao = p_i68_10_;
        field_606_ap = p_i68_12_;
        field_4086_p = field_611_ak = p_i68_2_;
        field_4085_q = field_610_al = p_i68_4_;
        field_4084_r = field_609_am = p_i68_6_;
        float f = field_9312_bd.nextFloat() * 0.6F + 0.4F;
        field_4083_a = field_665_g = field_9312_bd.nextFloat() * 0.2F + 0.5F;
        field_663_i = field_662_j = field_661_k = 1.0F * f;
        field_662_j *= 0.3F;
        field_663_i *= 0.9F;
        field_666_f = (int)(Math.random() * 10D) + 40;
        field_9314_ba = true;
        func_40099_c((int)(Math.random() * 8D));
    }

    public void func_406_a(Tessellator p_406_1_, float p_406_2_, float p_406_3_, float p_406_4_, float p_406_5_, float p_406_6_, float p_406_7_)
    {
        float f = ((float)field_20923_e + p_406_2_) / (float)field_666_f;
        f = 1.0F - f;
        f *= f;
        f = 1.0F - f;
        field_665_g = field_4083_a * f;
        super.func_406_a(p_406_1_, p_406_2_, p_406_3_, p_406_4_, p_406_5_, p_406_6_, p_406_7_);
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
        f1 = f1 * f1 * f1 * f1;
        return f * (1.0F - f1) + f1;
    }

    public void func_370_e_()
    {
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        float f = (float)field_20923_e / (float)field_666_f;
        float f1 = f;
        f = -f + f * f * 2.0F;
        f = 1.0F - f;
        field_611_ak = field_4086_p + field_608_an * (double)f;
        field_610_al = field_4085_q + field_607_ao * (double)f + (double)(1.0F - f1);
        field_609_am = field_4084_r + field_606_ap * (double)f;
        if(field_20923_e++ >= field_666_f)
        {
            func_395_F();
        }
    }
}
