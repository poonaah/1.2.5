// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityWeatherEffect, World, MathHelper, Block, 
//            BlockFire, AxisAlignedBB, Entity, NBTTagCompound, 
//            Vec3D

public class EntityLightningBolt extends EntityWeatherEffect
{

    private int field_27028_b;
    public long field_27029_a;
    private int field_27030_c;

    public EntityLightningBolt(World p_i282_1_, double p_i282_2_, double p_i282_4_, double p_i282_6_)
    {
        super(p_i282_1_);
        field_27029_a = 0L;
        func_365_c(p_i282_2_, p_i282_4_, p_i282_6_, 0.0F, 0.0F);
        field_27028_b = 2;
        field_27029_a = field_9312_bd.nextLong();
        field_27030_c = field_9312_bd.nextInt(3) + 1;
        if(p_i282_1_.field_1039_l >= 2 && p_i282_1_.func_21117_a(MathHelper.func_1108_b(p_i282_2_), MathHelper.func_1108_b(p_i282_4_), MathHelper.func_1108_b(p_i282_6_), 10))
        {
            int i = MathHelper.func_1108_b(p_i282_2_);
            int k = MathHelper.func_1108_b(p_i282_4_);
            int i1 = MathHelper.func_1108_b(p_i282_6_);
            if(p_i282_1_.func_600_a(i, k, i1) == 0 && Block.field_402_as.func_243_a(p_i282_1_, i, k, i1))
            {
                p_i282_1_.func_690_d(i, k, i1, Block.field_402_as.field_376_bc);
            }
            for(int j = 0; j < 4; j++)
            {
                int l = (MathHelper.func_1108_b(p_i282_2_) + field_9312_bd.nextInt(3)) - 1;
                int j1 = (MathHelper.func_1108_b(p_i282_4_) + field_9312_bd.nextInt(3)) - 1;
                int k1 = (MathHelper.func_1108_b(p_i282_6_) + field_9312_bd.nextInt(3)) - 1;
                if(p_i282_1_.func_600_a(l, j1, k1) == 0 && Block.field_402_as.func_243_a(p_i282_1_, l, j1, k1))
                {
                    p_i282_1_.func_690_d(l, j1, k1, Block.field_402_as.field_376_bc);
                }
            }

        }
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        if(field_27028_b == 2)
        {
            field_615_ag.func_684_a(field_611_ak, field_610_al, field_609_am, "ambient.weather.thunder", 10000F, 0.8F + field_9312_bd.nextFloat() * 0.2F);
            field_615_ag.func_684_a(field_611_ak, field_610_al, field_609_am, "random.explode", 2.0F, 0.5F + field_9312_bd.nextFloat() * 0.2F);
        }
        field_27028_b--;
        if(field_27028_b < 0)
        {
            if(field_27030_c == 0)
            {
                func_395_F();
            } else
            if(field_27028_b < -field_9312_bd.nextInt(10))
            {
                field_27030_c--;
                field_27028_b = 1;
                field_27029_a = field_9312_bd.nextLong();
                if(field_615_ag.func_21117_a(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al), MathHelper.func_1108_b(field_609_am), 10))
                {
                    int i = MathHelper.func_1108_b(field_611_ak);
                    int j = MathHelper.func_1108_b(field_610_al);
                    int k = MathHelper.func_1108_b(field_609_am);
                    if(field_615_ag.func_600_a(i, j, k) == 0 && Block.field_402_as.func_243_a(field_615_ag, i, j, k))
                    {
                        field_615_ag.func_690_d(i, j, k, Block.field_402_as.field_376_bc);
                    }
                }
            }
        }
        if(field_27028_b >= 0)
        {
            double d = 3D;
            List list = field_615_ag.func_659_b(this, AxisAlignedBB.func_1161_b(field_611_ak - d, field_610_al - d, field_609_am - d, field_611_ak + d, field_610_al + 6D + d, field_609_am + d));
            for(int l = 0; l < list.size(); l++)
            {
                Entity entity = (Entity)list.get(l);
                entity.func_27014_a(this);
            }

            field_615_ag.field_27172_i = 2;
        }
    }

    protected void func_21057_b()
    {
    }

    protected void func_357_b(NBTTagCompound nbttagcompound)
    {
    }

    protected void func_352_a(NBTTagCompound nbttagcompound)
    {
    }

    public boolean func_390_a(Vec3D p_390_1_)
    {
        return field_27028_b >= 0;
    }
}
