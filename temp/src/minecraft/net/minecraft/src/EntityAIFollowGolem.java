// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityVillager, World, EntityIronGolem, 
//            AxisAlignedBB, Entity, PathNavigate, EntityLookHelper

public class EntityAIFollowGolem extends EntityAIBase
{

    private EntityVillager field_48403_a;
    private EntityIronGolem field_48401_b;
    private int field_48402_c;
    private boolean field_48400_d;

    public EntityAIFollowGolem(EntityVillager p_i1093_1_)
    {
        field_48400_d = false;
        field_48403_a = p_i1093_1_;
        func_46079_a(3);
    }

    public boolean func_46082_a()
    {
        if(field_48403_a.func_48123_at() >= 0)
        {
            return false;
        }
        if(!field_48403_a.field_615_ag.func_624_b())
        {
            return false;
        }
        List list = field_48403_a.field_615_ag.func_657_a(net.minecraft.src.EntityIronGolem.class, field_48403_a.field_601_au.func_1177_b(6D, 2D, 6D));
        if(list.size() == 0)
        {
            return false;
        }
        Iterator iterator = list.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Entity entity = (Entity)iterator.next();
            EntityIronGolem entityirongolem = (EntityIronGolem)entity;
            if(entityirongolem.func_48117_D_() <= 0)
            {
                continue;
            }
            field_48401_b = entityirongolem;
            break;
        } while(true);
        return field_48401_b != null;
    }

    public boolean func_46084_g()
    {
        return field_48401_b.func_48117_D_() > 0;
    }

    public void func_46080_e()
    {
        field_48402_c = field_48403_a.func_46004_aK().nextInt(320);
        field_48400_d = false;
        field_48401_b.func_48084_aL().func_48672_f();
    }

    public void func_46077_d()
    {
        field_48401_b = null;
        field_48403_a.func_48084_aL().func_48672_f();
    }

    public void func_46081_b()
    {
        field_48403_a.func_46008_aG().func_46141_a(field_48401_b, 30F, 30F);
        if(field_48401_b.func_48117_D_() == field_48402_c)
        {
            field_48403_a.func_48084_aL().func_48667_a(field_48401_b, 0.15F);
            field_48400_d = true;
        }
        if(field_48400_d && field_48403_a.func_387_e(field_48401_b) < 4D)
        {
            field_48401_b.func_48116_a(false);
            field_48403_a.func_48084_aL().func_48672_f();
        }
    }
}
