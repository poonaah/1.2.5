// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, EntityLookHelper

public class EntityAILookIdle extends EntityAIBase
{

    private EntityLiving field_46089_a;
    private double field_46087_b;
    private double field_46088_c;
    private int field_46086_d;

    public EntityAILookIdle(EntityLiving p_i240_1_)
    {
        field_46086_d = 0;
        field_46089_a = p_i240_1_;
        func_46079_a(3);
    }

    public boolean func_46082_a()
    {
        return field_46089_a.func_46004_aK().nextFloat() < 0.02F;
    }

    public boolean func_46084_g()
    {
        return field_46086_d >= 0;
    }

    public void func_46080_e()
    {
        double d = 6.2831853071795862D * field_46089_a.func_46004_aK().nextDouble();
        field_46087_b = Math.cos(d);
        field_46088_c = Math.sin(d);
        field_46086_d = 20 + field_46089_a.func_46004_aK().nextInt(20);
    }

    public void func_46081_b()
    {
        field_46086_d--;
        field_46089_a.func_46008_aG().func_46143_a(field_46089_a.field_611_ak + field_46087_b, field_46089_a.field_610_al + (double)field_46089_a.func_373_s(), field_46089_a.field_609_am + field_46088_c, 10F, field_46089_a.func_25026_x());
    }
}
