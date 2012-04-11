// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityVillager, World, MathHelper, 
//            VillageCollection, AxisAlignedBB, EntityLookHelper, PathNavigate, 
//            Village, EntityLiving

public class EntityAIVillagerMate extends EntityAIBase
{

    private EntityVillager field_48342_b;
    private EntityVillager field_48343_c;
    private World field_48340_d;
    private int field_48341_e;
    Village field_48344_a;

    public EntityAIVillagerMate(EntityVillager p_i1086_1_)
    {
        field_48341_e = 0;
        field_48342_b = p_i1086_1_;
        field_48340_d = p_i1086_1_.field_615_ag;
        func_46079_a(3);
    }

    public boolean func_46082_a()
    {
        if(field_48342_b.func_48123_at() != 0)
        {
            return false;
        }
        if(field_48342_b.func_46004_aK().nextInt(500) != 0)
        {
            return false;
        }
        field_48344_a = field_48340_d.field_48465_A.func_48564_a(MathHelper.func_1108_b(field_48342_b.field_611_ak), MathHelper.func_1108_b(field_48342_b.field_610_al), MathHelper.func_1108_b(field_48342_b.field_609_am), 0);
        if(field_48344_a == null)
        {
            return false;
        }
        if(!func_48337_h())
        {
            return false;
        }
        Entity entity = field_48340_d.func_48459_a(net.minecraft.src.EntityVillager.class, field_48342_b.field_601_au.func_1177_b(8D, 3D, 8D), field_48342_b);
        if(entity == null)
        {
            return false;
        }
        field_48343_c = (EntityVillager)entity;
        return field_48343_c.func_48123_at() == 0;
    }

    public void func_46080_e()
    {
        field_48341_e = 300;
        field_48342_b.func_48128_a(true);
    }

    public void func_46077_d()
    {
        field_48344_a = null;
        field_48343_c = null;
        field_48342_b.func_48128_a(false);
    }

    public boolean func_46084_g()
    {
        return field_48341_e >= 0 && func_48337_h() && field_48342_b.func_48123_at() == 0;
    }

    public void func_46081_b()
    {
        field_48341_e--;
        field_48342_b.func_46008_aG().func_46141_a(field_48343_c, 10F, 30F);
        if(field_48342_b.func_387_e(field_48343_c) > 2.25D)
        {
            field_48342_b.func_48084_aL().func_48667_a(field_48343_c, 0.25F);
        } else
        if(field_48341_e == 0 && field_48343_c.func_48126_w_())
        {
            func_48339_i();
        }
        if(field_48342_b.func_46004_aK().nextInt(35) == 0)
        {
            func_48338_a(field_48342_b);
        }
    }

    private boolean func_48337_h()
    {
        int i = (int)((double)(float)field_48344_a.func_48530_c() * 0.34999999999999998D);
        return field_48344_a.func_48524_e() < i;
    }

    private void func_48339_i()
    {
        EntityVillager entityvillager = new EntityVillager(field_48340_d);
        field_48343_c.func_48122_d(6000);
        field_48342_b.func_48122_d(6000);
        entityvillager.func_48122_d(-24000);
        entityvillager.func_48124_d_(field_48342_b.func_46004_aK().nextInt(5));
        entityvillager.func_365_c(field_48342_b.field_611_ak, field_48342_b.field_610_al, field_48342_b.field_609_am, 0.0F, 0.0F);
        field_48340_d.func_674_a(entityvillager);
        func_48338_a(entityvillager);
    }

    private void func_48338_a(EntityLiving p_48338_1_)
    {
        Random random = p_48338_1_.func_46004_aK();
        for(int i = 0; i < 5; i++)
        {
            double d = random.nextGaussian() * 0.02D;
            double d1 = random.nextGaussian() * 0.02D;
            double d2 = random.nextGaussian() * 0.02D;
            field_48340_d.func_694_a("heart", (p_48338_1_.field_611_ak + (double)(random.nextFloat() * p_48338_1_.field_644_aC * 2.0F)) - (double)p_48338_1_.field_644_aC, p_48338_1_.field_610_al + 1.0D + (double)(random.nextFloat() * p_48338_1_.field_643_aD), (p_48338_1_.field_609_am + (double)(random.nextFloat() * p_48338_1_.field_644_aC * 2.0F)) - (double)p_48338_1_.field_644_aC, d, d1, d2);
        }

    }
}
