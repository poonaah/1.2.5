// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, EntityPlayer, World, 
//            AxisAlignedBB, Entity, EntityLookHelper

public class EntityAIWatchClosest extends EntityAIBase
{

    private EntityLiving field_46105_a;
    private Entity field_48295_b;
    private float field_46101_d;
    private int field_46102_e;
    private float field_48294_e;
    private Class field_48293_f;

    public EntityAIWatchClosest(EntityLiving p_i1056_1_, Class p_i1056_2_, float p_i1056_3_)
    {
        field_46105_a = p_i1056_1_;
        field_48293_f = p_i1056_2_;
        field_46101_d = p_i1056_3_;
        field_48294_e = 0.02F;
        func_46079_a(2);
    }

    public EntityAIWatchClosest(EntityLiving p_i1057_1_, Class p_i1057_2_, float p_i1057_3_, float p_i1057_4_)
    {
        field_46105_a = p_i1057_1_;
        field_48293_f = p_i1057_2_;
        field_46101_d = p_i1057_3_;
        field_48294_e = p_i1057_4_;
        func_46079_a(2);
    }

    public boolean func_46082_a()
    {
        if(field_46105_a.func_46004_aK().nextFloat() >= field_48294_e)
        {
            return false;
        }
        if(field_48293_f == (net.minecraft.src.EntityPlayer.class))
        {
            field_48295_b = field_46105_a.field_615_ag.func_609_a(field_46105_a, field_46101_d);
        } else
        {
            field_48295_b = field_46105_a.field_615_ag.func_48459_a(field_48293_f, field_46105_a.field_601_au.func_1177_b(field_46101_d, 3D, field_46101_d), field_46105_a);
        }
        return field_48295_b != null;
    }

    public boolean func_46084_g()
    {
        if(!field_48295_b.func_354_B())
        {
            return false;
        }
        if(field_46105_a.func_387_e(field_48295_b) > (double)(field_46101_d * field_46101_d))
        {
            return false;
        } else
        {
            return field_46102_e > 0;
        }
    }

    public void func_46080_e()
    {
        field_46102_e = 40 + field_46105_a.func_46004_aK().nextInt(40);
    }

    public void func_46077_d()
    {
        field_48295_b = null;
    }

    public void func_46081_b()
    {
        field_46105_a.func_46008_aG().func_46143_a(field_48295_b.field_611_ak, field_48295_b.field_610_al + (double)field_48295_b.func_373_s(), field_48295_b.field_609_am, 10F, field_46105_a.func_25026_x());
        field_46102_e--;
    }
}
