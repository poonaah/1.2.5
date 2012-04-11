// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, RandomPositionGenerator, Vec3D, 
//            PathNavigate

public class EntityAIWander extends EntityAIBase
{

    private EntityCreature field_46100_a;
    private double field_46098_b;
    private double field_46099_c;
    private double field_46097_d;
    private float field_48317_e;

    public EntityAIWander(EntityCreature p_i1002_1_, float p_i1002_2_)
    {
        field_46100_a = p_i1002_1_;
        field_48317_e = p_i1002_2_;
        func_46079_a(1);
    }

    public boolean func_46082_a()
    {
        if(field_46100_a.func_46011_aM() >= 100)
        {
            return false;
        }
        if(field_46100_a.func_46004_aK().nextInt(120) != 0)
        {
            return false;
        }
        Vec3D vec3d = RandomPositionGenerator.func_48622_a(field_46100_a, 10, 7);
        if(vec3d == null)
        {
            return false;
        } else
        {
            field_46098_b = vec3d.field_1776_a;
            field_46099_c = vec3d.field_1775_b;
            field_46097_d = vec3d.field_1779_c;
            return true;
        }
    }

    public boolean func_46084_g()
    {
        return !field_46100_a.func_48084_aL().func_46072_b();
    }

    public void func_46080_e()
    {
        field_46100_a.func_48084_aL().func_48666_a(field_46098_b, field_46099_c, field_46097_d, field_48317_e);
    }
}
