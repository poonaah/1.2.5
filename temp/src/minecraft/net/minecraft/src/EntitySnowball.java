// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityThrowable, MovingObjectPosition, EntityBlaze, DamageSource, 
//            Entity, World, EntityLiving

public class EntitySnowball extends EntityThrowable
{

    public EntitySnowball(World p_i631_1_)
    {
        super(p_i631_1_);
    }

    public EntitySnowball(World p_i632_1_, EntityLiving p_i632_2_)
    {
        super(p_i632_1_, p_i632_2_);
    }

    public EntitySnowball(World p_i633_1_, double p_i633_2_, double p_i633_4_, double p_i633_6_)
    {
        super(p_i633_1_, p_i633_2_, p_i633_4_, p_i633_6_);
    }

    protected void func_40078_a(MovingObjectPosition p_40078_1_)
    {
        if(p_40078_1_.field_1168_g != null)
        {
            byte byte0 = 0;
            if(p_40078_1_.field_1168_g instanceof EntityBlaze)
            {
                byte0 = 3;
            }
            if(!p_40078_1_.field_1168_g.func_396_a(DamageSource.func_35524_a(this, field_40083_c), byte0));
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
