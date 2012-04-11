// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityLiving

public class EntityBodyHelper
{

    private EntityLiving field_48654_a;
    private int field_48652_b;
    private float field_48653_c;

    public EntityBodyHelper(EntityLiving p_i1075_1_)
    {
        field_48652_b = 0;
        field_48653_c = 0.0F;
        field_48654_a = p_i1075_1_;
    }

    public void func_48650_a()
    {
        double d = field_48654_a.field_611_ak - field_48654_a.field_9285_at;
        double d1 = field_48654_a.field_609_am - field_48654_a.field_9283_av;
        if(d * d + d1 * d1 > 2.5000002779052011E-007D)
        {
            field_48654_a.field_735_n = field_48654_a.field_605_aq;
            field_48654_a.field_46015_bf = func_48651_a(field_48654_a.field_735_n, field_48654_a.field_46015_bf, 75F);
            field_48653_c = field_48654_a.field_46015_bf;
            field_48652_b = 0;
            return;
        }
        float f = 75F;
        if(Math.abs(field_48654_a.field_46015_bf - field_48653_c) > 15F)
        {
            field_48652_b = 0;
            field_48653_c = field_48654_a.field_46015_bf;
        } else
        {
            field_48652_b++;
            if(field_48652_b > 10)
            {
                f = Math.max(1.0F - (float)(field_48652_b - 10) / 10F, 0.0F) * 75F;
            }
        }
        field_48654_a.field_735_n = func_48651_a(field_48654_a.field_46015_bf, field_48654_a.field_735_n, f);
    }

    private float func_48651_a(float p_48651_1_, float p_48651_2_, float p_48651_3_)
    {
        float f;
        for(f = p_48651_1_ - p_48651_2_; f < -180F; f += 360F) { }
        for(; f >= 180F; f -= 360F) { }
        if(f < -p_48651_3_)
        {
            f = -p_48651_3_;
        }
        if(f >= p_48651_3_)
        {
            f = p_48651_3_;
        }
        return p_48651_1_ - f;
    }
}
