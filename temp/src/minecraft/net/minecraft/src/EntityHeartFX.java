// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityFX, World, Tessellator

public class EntityHeartFX extends EntityFX
{

    float field_25022_a;

    public EntityHeartFX(World p_i767_1_, double p_i767_2_, double p_i767_4_, double p_i767_6_, 
            double p_i767_8_, double p_i767_10_, double p_i767_12_)
    {
        this(p_i767_1_, p_i767_2_, p_i767_4_, p_i767_6_, p_i767_8_, p_i767_10_, p_i767_12_, 2.0F);
    }

    public EntityHeartFX(World p_i768_1_, double p_i768_2_, double p_i768_4_, double p_i768_6_, 
            double p_i768_8_, double p_i768_10_, double p_i768_12_, float p_i768_14_)
    {
        super(p_i768_1_, p_i768_2_, p_i768_4_, p_i768_6_, 0.0D, 0.0D, 0.0D);
        field_608_an *= 0.0099999997764825821D;
        field_607_ao *= 0.0099999997764825821D;
        field_606_ap *= 0.0099999997764825821D;
        field_607_ao += 0.10000000000000001D;
        field_665_g *= 0.75F;
        field_665_g *= p_i768_14_;
        field_25022_a = field_665_g;
        field_666_f = 16;
        field_9314_ba = false;
        func_40099_c(80);
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
        field_665_g = field_25022_a * f;
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
        if(field_610_al == field_9284_au)
        {
            field_608_an *= 1.1000000000000001D;
            field_606_ap *= 1.1000000000000001D;
        }
        field_608_an *= 0.86000001430511475D;
        field_607_ao *= 0.86000001430511475D;
        field_606_ap *= 0.86000001430511475D;
        if(field_9298_aH)
        {
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
        }
    }
}
