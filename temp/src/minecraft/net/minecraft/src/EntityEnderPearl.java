// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityThrowable, MovingObjectPosition, DamageSource, Entity, 
//            World, EntityLiving

public class EntityEnderPearl extends EntityThrowable
{

    public EntityEnderPearl(World p_i47_1_)
    {
        super(p_i47_1_);
    }

    public EntityEnderPearl(World p_i48_1_, EntityLiving p_i48_2_)
    {
        super(p_i48_1_, p_i48_2_);
    }

    public EntityEnderPearl(World p_i49_1_, double p_i49_2_, double p_i49_4_, double p_i49_6_)
    {
        super(p_i49_1_, p_i49_2_, p_i49_4_, p_i49_6_);
    }

    protected void func_40078_a(MovingObjectPosition p_40078_1_)
    {
        if(p_40078_1_.field_1168_g != null)
        {
            if(!p_40078_1_.field_1168_g.func_396_a(DamageSource.func_35524_a(this, field_40083_c), 0));
        }
        for(int i = 0; i < 32; i++)
        {
            field_615_ag.func_694_a("portal", field_611_ak, field_610_al + field_9312_bd.nextDouble() * 2D, field_609_am, field_9312_bd.nextGaussian(), 0.0D, field_9312_bd.nextGaussian());
        }

        if(!field_615_ag.field_1026_y)
        {
            if(field_40083_c != null)
            {
                field_40083_c.func_40113_j(field_611_ak, field_610_al, field_609_am);
                field_40083_c.field_9288_aU = 0.0F;
                field_40083_c.func_396_a(DamageSource.field_35549_h, 5);
            }
            func_395_F();
        }
    }
}
