// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, EntityLiving, Vec3D, 
//            RandomPositionGenerator, PathNavigate

public class EntityAIMoveTowardsTarget extends EntityAIBase
{

    private EntityCreature field_48336_a;
    private EntityLiving field_48334_b;
    private double field_48335_c;
    private double field_48332_d;
    private double field_48333_e;
    private float field_48330_f;
    private float field_48331_g;

    public EntityAIMoveTowardsTarget(EntityCreature p_i1090_1_, float p_i1090_2_, float p_i1090_3_)
    {
        field_48336_a = p_i1090_1_;
        field_48330_f = p_i1090_2_;
        field_48331_g = p_i1090_3_;
        func_46079_a(1);
    }

    public boolean func_46082_a()
    {
        field_48334_b = field_48336_a.func_48094_aS();
        if(field_48334_b == null)
        {
            return false;
        }
        if(field_48334_b.func_387_e(field_48336_a) > (double)(field_48331_g * field_48331_g))
        {
            return false;
        }
        Vec3D vec3d = RandomPositionGenerator.func_48620_a(field_48336_a, 16, 7, Vec3D.func_1248_b(field_48334_b.field_611_ak, field_48334_b.field_610_al, field_48334_b.field_609_am));
        if(vec3d == null)
        {
            return false;
        } else
        {
            field_48335_c = vec3d.field_1776_a;
            field_48332_d = vec3d.field_1775_b;
            field_48333_e = vec3d.field_1779_c;
            return true;
        }
    }

    public boolean func_46084_g()
    {
        return !field_48336_a.func_48084_aL().func_46072_b() && field_48334_b.func_354_B() && field_48334_b.func_387_e(field_48336_a) < (double)(field_48331_g * field_48331_g);
    }

    public void func_46077_d()
    {
        field_48334_b = null;
    }

    public void func_46080_e()
    {
        field_48336_a.func_48084_aL().func_48666_a(field_48335_c, field_48332_d, field_48333_e, field_48330_f);
    }
}
