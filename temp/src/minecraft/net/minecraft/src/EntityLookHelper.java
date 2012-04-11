// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Entity, EntityLiving, AxisAlignedBB, MathHelper, 
//            PathNavigate

public class EntityLookHelper
{

    private EntityLiving field_46151_a;
    private float field_46149_b;
    private float field_46150_c;
    private boolean field_46147_d;
    private double field_46148_e;
    private double field_46145_f;
    private double field_46146_g;

    public EntityLookHelper(EntityLiving p_i655_1_)
    {
        field_46147_d = false;
        field_46151_a = p_i655_1_;
    }

    public void func_46141_a(Entity p_46141_1_, float p_46141_2_, float p_46141_3_)
    {
        field_46148_e = p_46141_1_.field_611_ak;
        if(p_46141_1_ instanceof EntityLiving)
        {
            field_46145_f = p_46141_1_.field_610_al + (double)((EntityLiving)p_46141_1_).func_373_s();
        } else
        {
            field_46145_f = (p_46141_1_.field_601_au.field_1697_b + p_46141_1_.field_601_au.field_1702_e) / 2D;
        }
        field_46146_g = p_46141_1_.field_609_am;
        field_46149_b = p_46141_2_;
        field_46150_c = p_46141_3_;
        field_46147_d = true;
    }

    public void func_46143_a(double p_46143_1_, double p_46143_3_, double p_46143_5_, float p_46143_7_, 
            float p_46143_8_)
    {
        field_46148_e = p_46143_1_;
        field_46145_f = p_46143_3_;
        field_46146_g = p_46143_5_;
        field_46149_b = p_46143_7_;
        field_46150_c = p_46143_8_;
        field_46147_d = true;
    }

    public void func_46142_a()
    {
        field_46151_a.field_604_ar = 0.0F;
        if(field_46147_d)
        {
            field_46147_d = false;
            double d = field_46148_e - field_46151_a.field_611_ak;
            double d1 = field_46145_f - (field_46151_a.field_610_al + (double)field_46151_a.func_373_s());
            double d2 = field_46146_g - field_46151_a.field_609_am;
            double d3 = MathHelper.func_1109_a(d * d + d2 * d2);
            float f1 = (float)((Math.atan2(d2, d) * 180D) / 3.1415927410125732D) - 90F;
            float f2 = (float)(-((Math.atan2(d1, d3) * 180D) / 3.1415927410125732D));
            field_46151_a.field_604_ar = func_46144_a(field_46151_a.field_604_ar, f2, field_46150_c);
            field_46151_a.field_46015_bf = func_46144_a(field_46151_a.field_46015_bf, f1, field_46149_b);
        } else
        {
            field_46151_a.field_46015_bf = func_46144_a(field_46151_a.field_46015_bf, field_46151_a.field_735_n, 10F);
        }
        float f;
        for(f = field_46151_a.field_46015_bf - field_46151_a.field_735_n; f < -180F; f += 360F) { }
        for(; f >= 180F; f -= 360F) { }
        if(!field_46151_a.func_48084_aL().func_46072_b())
        {
            if(f < -75F)
            {
                field_46151_a.field_46015_bf = field_46151_a.field_735_n - 75F;
            }
            if(f > 75F)
            {
                field_46151_a.field_46015_bf = field_46151_a.field_735_n + 75F;
            }
        }
    }

    private float func_46144_a(float p_46144_1_, float p_46144_2_, float p_46144_3_)
    {
        float f;
        for(f = p_46144_2_ - p_46144_1_; f < -180F; f += 360F) { }
        for(; f >= 180F; f -= 360F) { }
        if(f > p_46144_3_)
        {
            f = p_46144_3_;
        }
        if(f < -p_46144_3_)
        {
            f = -p_46144_3_;
        }
        return p_46144_1_ + f;
    }
}
