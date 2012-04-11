// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityAnimal, AxisAlignedBB, World, 
//            Entity, PathNavigate

public class EntityAIFollowParent extends EntityAIBase
{

    EntityAnimal field_48249_a;
    EntityAnimal field_48247_b;
    float field_48248_c;
    private int field_48246_d;

    public EntityAIFollowParent(EntityAnimal p_i1031_1_, float p_i1031_2_)
    {
        field_48249_a = p_i1031_1_;
        field_48248_c = p_i1031_2_;
    }

    public boolean func_46082_a()
    {
        if(field_48249_a.func_48123_at() >= 0)
        {
            return false;
        }
        List list = field_48249_a.field_615_ag.func_657_a(field_48249_a.getClass(), field_48249_a.field_601_au.func_1177_b(8D, 4D, 8D));
        EntityAnimal entityanimal = null;
        double d = 1.7976931348623157E+308D;
        Iterator iterator = list.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Entity entity = (Entity)iterator.next();
            EntityAnimal entityanimal1 = (EntityAnimal)entity;
            if(entityanimal1.func_48123_at() >= 0)
            {
                double d1 = field_48249_a.func_387_e(entityanimal1);
                if(d1 <= d)
                {
                    d = d1;
                    entityanimal = entityanimal1;
                }
            }
        } while(true);
        if(entityanimal == null)
        {
            return false;
        }
        if(d < 9D)
        {
            return false;
        } else
        {
            field_48247_b = entityanimal;
            return true;
        }
    }

    public boolean func_46084_g()
    {
        if(!field_48247_b.func_354_B())
        {
            return false;
        }
        double d = field_48249_a.func_387_e(field_48247_b);
        return d >= 9D && d <= 256D;
    }

    public void func_46080_e()
    {
        field_48246_d = 0;
    }

    public void func_46077_d()
    {
        field_48247_b = null;
    }

    public void func_46081_b()
    {
        if(--field_48246_d > 0)
        {
            return;
        } else
        {
            field_48246_d = 10;
            field_48249_a.func_48084_aL().func_48667_a(field_48247_b, field_48248_c);
            return;
        }
    }
}
