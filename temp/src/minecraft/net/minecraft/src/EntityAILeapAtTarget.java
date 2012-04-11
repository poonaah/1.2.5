// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, MathHelper

public class EntityAILeapAtTarget extends EntityAIBase
{

    EntityLiving field_48252_a;
    EntityLiving field_48250_b;
    float field_48251_c;

    public EntityAILeapAtTarget(EntityLiving p_i1029_1_, float p_i1029_2_)
    {
        field_48252_a = p_i1029_1_;
        field_48251_c = p_i1029_2_;
        func_46079_a(5);
    }

    public boolean func_46082_a()
    {
        field_48250_b = field_48252_a.func_48094_aS();
        if(field_48250_b == null)
        {
            return false;
        }
        double d = field_48252_a.func_387_e(field_48250_b);
        if(d < 4D || d > 16D)
        {
            return false;
        }
        if(!field_48252_a.field_9298_aH)
        {
            return false;
        }
        return field_48252_a.func_46004_aK().nextInt(5) == 0;
    }

    public boolean func_46084_g()
    {
        return !field_48252_a.field_9298_aH;
    }

    public void func_46080_e()
    {
        double d = field_48250_b.field_611_ak - field_48252_a.field_611_ak;
        double d1 = field_48250_b.field_609_am - field_48252_a.field_609_am;
        float f = MathHelper.func_1109_a(d * d + d1 * d1);
        field_48252_a.field_608_an += (d / (double)f) * 0.5D * 0.80000001192092896D + field_48252_a.field_608_an * 0.20000000298023224D;
        field_48252_a.field_606_ap += (d1 / (double)f) * 0.5D * 0.80000001192092896D + field_48252_a.field_606_ap * 0.20000000298023224D;
        field_48252_a.field_607_ao = field_48251_c;
    }
}
