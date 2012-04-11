// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityFX, MathHelper, World, Tessellator

public class EntityNoteFX extends EntityFX
{

    float field_21065_a;

    public EntityNoteFX(World p_i2_1_, double p_i2_2_, double p_i2_4_, double p_i2_6_, 
            double p_i2_8_, double p_i2_10_, double p_i2_12_)
    {
        this(p_i2_1_, p_i2_2_, p_i2_4_, p_i2_6_, p_i2_8_, p_i2_10_, p_i2_12_, 2.0F);
    }

    public EntityNoteFX(World p_i3_1_, double p_i3_2_, double p_i3_4_, double p_i3_6_, 
            double p_i3_8_, double p_i3_10_, double p_i3_12_, float p_i3_14_)
    {
        super(p_i3_1_, p_i3_2_, p_i3_4_, p_i3_6_, 0.0D, 0.0D, 0.0D);
        field_608_an *= 0.0099999997764825821D;
        field_607_ao *= 0.0099999997764825821D;
        field_606_ap *= 0.0099999997764825821D;
        field_607_ao += 0.20000000000000001D;
        field_663_i = MathHelper.func_1106_a(((float)p_i3_8_ + 0.0F) * 3.141593F * 2.0F) * 0.65F + 0.35F;
        field_662_j = MathHelper.func_1106_a(((float)p_i3_8_ + 0.3333333F) * 3.141593F * 2.0F) * 0.65F + 0.35F;
        field_661_k = MathHelper.func_1106_a(((float)p_i3_8_ + 0.6666667F) * 3.141593F * 2.0F) * 0.65F + 0.35F;
        field_665_g *= 0.75F;
        field_665_g *= p_i3_14_;
        field_21065_a = field_665_g;
        field_666_f = 6;
        field_9314_ba = false;
        func_40099_c(64);
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
        field_665_g = field_21065_a * f;
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
        field_608_an *= 0.6600000262260437D;
        field_607_ao *= 0.6600000262260437D;
        field_606_ap *= 0.6600000262260437D;
        if(field_9298_aH)
        {
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
        }
    }
}
