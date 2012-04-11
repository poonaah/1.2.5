// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityLiving, AxisAlignedBB, MathHelper, EntityJumpHelper

public class EntityMoveHelper
{

    private EntityLiving field_46041_a;
    private double field_46039_b;
    private double field_46040_c;
    private double field_46037_d;
    private float field_46038_e;
    private boolean field_46036_f;

    public EntityMoveHelper(EntityLiving p_i1046_1_)
    {
        field_46036_f = false;
        field_46041_a = p_i1046_1_;
        field_46039_b = p_i1046_1_.field_611_ak;
        field_46040_c = p_i1046_1_.field_610_al;
        field_46037_d = p_i1046_1_.field_609_am;
    }

    public boolean func_48186_a()
    {
        return field_46036_f;
    }

    public float func_48184_b()
    {
        return field_46038_e;
    }

    public void func_48187_a(double p_48187_1_, double p_48187_3_, double p_48187_5_, float p_48187_7_)
    {
        field_46039_b = p_48187_1_;
        field_46040_c = p_48187_3_;
        field_46037_d = p_48187_5_;
        field_46038_e = p_48187_7_;
        field_46036_f = true;
    }

    public void func_46034_a()
    {
        field_46041_a.func_46010_f(0.0F);
        if(!field_46036_f)
        {
            return;
        }
        field_46036_f = false;
        int i = MathHelper.func_1108_b(field_46041_a.field_601_au.field_1697_b + 0.5D);
        double d = field_46039_b - field_46041_a.field_611_ak;
        double d1 = field_46037_d - field_46041_a.field_609_am;
        double d2 = field_46040_c - (double)i;
        double d3 = d * d + d2 * d2 + d1 * d1;
        if(d3 < 2.5000002779052011E-007D)
        {
            return;
        }
        float f = (float)((Math.atan2(d1, d) * 180D) / 3.1415927410125732D) - 90F;
        field_46041_a.field_605_aq = func_48185_a(field_46041_a.field_605_aq, f, 30F);
        field_46041_a.func_48098_g(field_46038_e);
        if(d2 > 0.0D && d * d + d1 * d1 < 1.0D)
        {
            field_46041_a.func_46005_aI().func_46129_a();
        }
    }

    private float func_48185_a(float p_48185_1_, float p_48185_2_, float p_48185_3_)
    {
        float f;
        for(f = p_48185_2_ - p_48185_1_; f < -180F; f += 360F) { }
        for(; f >= 180F; f -= 360F) { }
        if(f > p_48185_3_)
        {
            f = p_48185_3_;
        }
        if(f < -p_48185_3_)
        {
            f = -p_48185_3_;
        }
        return p_48185_1_ + f;
    }
}
