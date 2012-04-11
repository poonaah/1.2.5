// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityVillager, AxisAlignedBB, World, 
//            Entity, RandomPositionGenerator, PathNavigate, Vec3D, 
//            EntityLiving

public class EntityAIPlay extends EntityAIBase
{

    private EntityVillager field_48359_a;
    private EntityLiving field_48357_b;
    private float field_48358_c;
    private int field_48356_d;

    public EntityAIPlay(EntityVillager p_i1074_1_, float p_i1074_2_)
    {
        field_48359_a = p_i1074_1_;
        field_48358_c = p_i1074_2_;
        func_46079_a(1);
    }

    public boolean func_46082_a()
    {
        if(field_48359_a.func_48123_at() >= 0)
        {
            return false;
        }
        if(field_48359_a.func_46004_aK().nextInt(400) != 0)
        {
            return false;
        }
        List list = field_48359_a.field_615_ag.func_657_a(net.minecraft.src.EntityVillager.class, field_48359_a.field_601_au.func_1177_b(6D, 3D, 6D));
        double d = 1.7976931348623157E+308D;
        Iterator iterator = list.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Entity entity = (Entity)iterator.next();
            if(entity != field_48359_a)
            {
                EntityVillager entityvillager = (EntityVillager)entity;
                if(!entityvillager.func_48125_w() && entityvillager.func_48123_at() < 0)
                {
                    double d1 = entityvillager.func_387_e(field_48359_a);
                    if(d1 <= d)
                    {
                        d = d1;
                        field_48357_b = entityvillager;
                    }
                }
            }
        } while(true);
        if(field_48357_b == null)
        {
            Vec3D vec3d = RandomPositionGenerator.func_48622_a(field_48359_a, 16, 3);
            if(vec3d == null)
            {
                return false;
            }
        }
        return true;
    }

    public boolean func_46084_g()
    {
        return field_48356_d > 0;
    }

    public void func_46080_e()
    {
        if(field_48357_b != null)
        {
            field_48359_a.func_48127_b(true);
        }
        field_48356_d = 1000;
    }

    public void func_46077_d()
    {
        field_48359_a.func_48127_b(false);
        field_48357_b = null;
    }

    public void func_46081_b()
    {
        field_48356_d--;
        if(field_48357_b != null)
        {
            if(field_48359_a.func_387_e(field_48357_b) > 4D)
            {
                field_48359_a.func_48084_aL().func_48667_a(field_48357_b, field_48358_c);
            }
        } else
        if(field_48359_a.func_48084_aL().func_46072_b())
        {
            Vec3D vec3d = RandomPositionGenerator.func_48622_a(field_48359_a, 16, 3);
            if(vec3d == null)
            {
                return;
            }
            field_48359_a.func_48084_aL().func_48666_a(vec3d.field_1776_a, vec3d.field_1775_b, vec3d.field_1779_c, field_48358_c);
        }
    }
}
