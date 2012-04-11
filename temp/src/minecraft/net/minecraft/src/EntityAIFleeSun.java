// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, World, MathHelper, 
//            AxisAlignedBB, Vec3D, PathNavigate

public class EntityAIFleeSun extends EntityAIBase
{

    private EntityCreature field_48302_a;
    private double field_48300_b;
    private double field_48301_c;
    private double field_48298_d;
    private float field_48299_e;
    private World field_48297_f;

    public EntityAIFleeSun(EntityCreature p_i1053_1_, float p_i1053_2_)
    {
        field_48302_a = p_i1053_1_;
        field_48299_e = p_i1053_2_;
        field_48297_f = p_i1053_1_.field_615_ag;
        func_46079_a(1);
    }

    public boolean func_46082_a()
    {
        if(!field_48297_f.func_624_b())
        {
            return false;
        }
        if(!field_48302_a.func_21062_U())
        {
            return false;
        }
        if(!field_48297_f.func_647_i(MathHelper.func_1108_b(field_48302_a.field_611_ak), (int)field_48302_a.field_601_au.field_1697_b, MathHelper.func_1108_b(field_48302_a.field_609_am)))
        {
            return false;
        }
        Vec3D vec3d = func_48296_h();
        if(vec3d == null)
        {
            return false;
        } else
        {
            field_48300_b = vec3d.field_1776_a;
            field_48301_c = vec3d.field_1775_b;
            field_48298_d = vec3d.field_1779_c;
            return true;
        }
    }

    public boolean func_46084_g()
    {
        return !field_48302_a.func_48084_aL().func_46072_b();
    }

    public void func_46080_e()
    {
        field_48302_a.func_48084_aL().func_48666_a(field_48300_b, field_48301_c, field_48298_d, field_48299_e);
    }

    private Vec3D func_48296_h()
    {
        Random random = field_48302_a.func_46004_aK();
        for(int i = 0; i < 10; i++)
        {
            int j = MathHelper.func_1108_b((field_48302_a.field_611_ak + (double)random.nextInt(20)) - 10D);
            int k = MathHelper.func_1108_b((field_48302_a.field_601_au.field_1697_b + (double)random.nextInt(6)) - 3D);
            int l = MathHelper.func_1108_b((field_48302_a.field_609_am + (double)random.nextInt(20)) - 10D);
            if(!field_48297_f.func_647_i(j, k, l) && field_48302_a.func_439_a(j, k, l) < 0.0F)
            {
                return Vec3D.func_1248_b(j, k, l);
            }
        }

        return null;
    }
}
