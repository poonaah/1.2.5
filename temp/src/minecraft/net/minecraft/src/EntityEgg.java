// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityThrowable, MovingObjectPosition, DamageSource, Entity, 
//            World, EntityChicken, EntityLiving

public class EntityEgg extends EntityThrowable
{

    public EntityEgg(World p_i539_1_)
    {
        super(p_i539_1_);
    }

    public EntityEgg(World p_i540_1_, EntityLiving p_i540_2_)
    {
        super(p_i540_1_, p_i540_2_);
    }

    public EntityEgg(World p_i541_1_, double p_i541_2_, double p_i541_4_, double p_i541_6_)
    {
        super(p_i541_1_, p_i541_2_, p_i541_4_, p_i541_6_);
    }

    protected void func_40078_a(MovingObjectPosition p_40078_1_)
    {
        if(p_40078_1_.field_1168_g != null)
        {
            if(!p_40078_1_.field_1168_g.func_396_a(DamageSource.func_35524_a(this, field_40083_c), 0));
        }
        if(!field_615_ag.field_1026_y && field_9312_bd.nextInt(8) == 0)
        {
            byte byte0 = 1;
            if(field_9312_bd.nextInt(32) == 0)
            {
                byte0 = 4;
            }
            for(int j = 0; j < byte0; j++)
            {
                EntityChicken entitychicken = new EntityChicken(field_615_ag);
                entitychicken.func_48122_d(-24000);
                entitychicken.func_365_c(field_611_ak, field_610_al, field_609_am, field_605_aq, 0.0F);
                field_615_ag.func_674_a(entitychicken);
            }

        }
        for(int i = 0; i < 8; i++)
        {
            field_615_ag.func_694_a("snowballpoof", field_611_ak, field_610_al, field_609_am, 0.0D, 0.0D, 0.0D);
        }

        if(!field_615_ag.field_1026_y)
        {
            func_395_F();
        }
    }
}
