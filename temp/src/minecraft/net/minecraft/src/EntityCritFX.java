// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityFX, World, Tessellator

public class EntityCritFX extends EntityFX
{

    float field_35137_a;

    public EntityCritFX(World p_i591_1_, double p_i591_2_, double p_i591_4_, double p_i591_6_, 
            double p_i591_8_, double p_i591_10_, double p_i591_12_)
    {
        this(p_i591_1_, p_i591_2_, p_i591_4_, p_i591_6_, p_i591_8_, p_i591_10_, p_i591_12_, 1.0F);
    }

    public EntityCritFX(World p_i592_1_, double p_i592_2_, double p_i592_4_, double p_i592_6_, 
            double p_i592_8_, double p_i592_10_, double p_i592_12_, float p_i592_14_)
    {
        super(p_i592_1_, p_i592_2_, p_i592_4_, p_i592_6_, 0.0D, 0.0D, 0.0D);
        field_608_an *= 0.10000000149011612D;
        field_607_ao *= 0.10000000149011612D;
        field_606_ap *= 0.10000000149011612D;
        field_608_an += p_i592_8_ * 0.40000000000000002D;
        field_607_ao += p_i592_10_ * 0.40000000000000002D;
        field_606_ap += p_i592_12_ * 0.40000000000000002D;
        field_663_i = field_662_j = field_661_k = (float)(Math.random() * 0.30000001192092896D + 0.60000002384185791D);
        field_665_g *= 0.75F;
        field_665_g *= p_i592_14_;
        field_35137_a = field_665_g;
        field_666_f = (int)(6D / (Math.random() * 0.80000000000000004D + 0.59999999999999998D));
        field_666_f *= p_i592_14_;
        field_9314_ba = false;
        func_40099_c(65);
        func_370_e_();
    }

    public void func_406_a(Tessellator p_406_1_, float p_406_2_, float p_406_3_, float p_406_4_, float p_406_5_, float p_406_6_, float p_406_7_)
    {
        float f = (((float)field_20923_e + p_406_2_) / (float)field_666_f) * 32F;
        if(f < 0.0F)
        {
            f = 0.0F;
        }
        if(f > 1.0F)
        {
            f = 1.0F;
        }
        field_665_g = field_35137_a * f;
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
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_662_j *= 0.95999999999999996D;
        field_661_k *= 0.90000000000000002D;
        field_608_an *= 0.69999998807907104D;
        field_607_ao *= 0.69999998807907104D;
        field_606_ap *= 0.69999998807907104D;
        field_607_ao -= 0.019999999552965164D;
        if(field_9298_aH)
        {
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
        }
    }
}
