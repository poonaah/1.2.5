// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityThrowable, World, EntityXPOrb, EntityLiving, 
//            MovingObjectPosition

public class EntityExpBottle extends EntityThrowable
{

    public EntityExpBottle(World p_i1041_1_)
    {
        super(p_i1041_1_);
    }

    public EntityExpBottle(World p_i1042_1_, EntityLiving p_i1042_2_)
    {
        super(p_i1042_1_, p_i1042_2_);
    }

    public EntityExpBottle(World p_i1043_1_, double p_i1043_2_, double p_i1043_4_, double p_i1043_6_)
    {
        super(p_i1043_1_, p_i1043_2_, p_i1043_4_, p_i1043_6_);
    }

    protected float func_40075_e()
    {
        return 0.07F;
    }

    protected float func_40077_c()
    {
        return 0.7F;
    }

    protected float func_40074_d()
    {
        return -20F;
    }

    protected void func_40078_a(MovingObjectPosition p_40078_1_)
    {
        if(!field_615_ag.field_1026_y)
        {
            field_615_ag.func_28106_e(2002, (int)Math.round(field_611_ak), (int)Math.round(field_610_al), (int)Math.round(field_609_am), 0);
            for(int i = 3 + field_615_ag.field_1037_n.nextInt(5) + field_615_ag.field_1037_n.nextInt(5); i > 0;)
            {
                int j = EntityXPOrb.func_35121_b(i);
                i -= j;
                field_615_ag.func_674_a(new EntityXPOrb(field_615_ag, field_611_ak, field_610_al, field_609_am, j));
            }

            func_395_F();
        }
    }
}
