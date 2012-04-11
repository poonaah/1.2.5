// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, RandomPositionGenerator, Vec3D, 
//            PathNavigate

public class EntityAIPanic extends EntityAIBase
{

    private EntityCreature field_48316_a;
    private float field_48314_b;
    private double field_48315_c;
    private double field_48312_d;
    private double field_48313_e;

    public EntityAIPanic(EntityCreature p_i1049_1_, float p_i1049_2_)
    {
        field_48316_a = p_i1049_1_;
        field_48314_b = p_i1049_2_;
        func_46079_a(1);
    }

    public boolean func_46082_a()
    {
        if(field_48316_a.func_46007_aL() == null)
        {
            return false;
        }
        Vec3D vec3d = RandomPositionGenerator.func_48622_a(field_48316_a, 5, 4);
        if(vec3d == null)
        {
            return false;
        } else
        {
            field_48315_c = vec3d.field_1776_a;
            field_48312_d = vec3d.field_1775_b;
            field_48313_e = vec3d.field_1779_c;
            return true;
        }
    }

    public void func_46080_e()
    {
        field_48316_a.func_48084_aL().func_48666_a(field_48315_c, field_48312_d, field_48313_e, field_48314_b);
    }

    public boolean func_46084_g()
    {
        return !field_48316_a.func_48084_aL().func_46072_b();
    }
}
