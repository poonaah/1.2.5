// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityIronGolem, World, EntityVillager, 
//            AxisAlignedBB, EntityLookHelper

public class EntityAILookAtVillager extends EntityAIBase
{

    private EntityIronGolem field_48406_a;
    private EntityVillager field_48404_b;
    private int field_48405_c;

    public EntityAILookAtVillager(EntityIronGolem p_i1092_1_)
    {
        field_48406_a = p_i1092_1_;
        func_46079_a(3);
    }

    public boolean func_46082_a()
    {
        if(!field_48406_a.field_615_ag.func_624_b())
        {
            return false;
        }
        if(field_48406_a.func_46004_aK().nextInt(8000) != 0)
        {
            return false;
        } else
        {
            field_48404_b = (EntityVillager)field_48406_a.field_615_ag.func_48459_a(net.minecraft.src.EntityVillager.class, field_48406_a.field_601_au.func_1177_b(6D, 2D, 6D), field_48406_a);
            return field_48404_b != null;
        }
    }

    public boolean func_46084_g()
    {
        return field_48405_c > 0;
    }

    public void func_46080_e()
    {
        field_48405_c = 400;
        field_48406_a.func_48116_a(true);
    }

    public void func_46077_d()
    {
        field_48406_a.func_48116_a(false);
        field_48404_b = null;
    }

    public void func_46081_b()
    {
        field_48406_a.func_46008_aG().func_46141_a(field_48404_b, 30F, 30F);
        field_48405_c--;
    }
}
