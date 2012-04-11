// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, PathNavigate, AxisAlignedBB, 
//            EntitySenses, EntityLookHelper, EntityArrow, World, 
//            EntitySnowball, MathHelper

public class EntityAIArrowAttack extends EntityAIBase
{

    World field_48373_a;
    EntityLiving field_48371_b;
    EntityLiving field_48372_c;
    int field_48369_d;
    float field_48370_e;
    int field_48367_f;
    int field_48368_g;
    int field_48374_h;

    public EntityAIArrowAttack(EntityLiving p_i1065_1_, float p_i1065_2_, int p_i1065_3_, int p_i1065_4_)
    {
        field_48369_d = 0;
        field_48367_f = 0;
        field_48371_b = p_i1065_1_;
        field_48373_a = p_i1065_1_.field_615_ag;
        field_48370_e = p_i1065_2_;
        field_48368_g = p_i1065_3_;
        field_48374_h = p_i1065_4_;
        func_46079_a(3);
    }

    public boolean func_46082_a()
    {
        EntityLiving entityliving = field_48371_b.func_48094_aS();
        if(entityliving == null)
        {
            return false;
        } else
        {
            field_48372_c = entityliving;
            return true;
        }
    }

    public boolean func_46084_g()
    {
        return func_46082_a() || !field_48371_b.func_48084_aL().func_46072_b();
    }

    public void func_46077_d()
    {
        field_48372_c = null;
    }

    public void func_46081_b()
    {
        double d = 100D;
        double d1 = field_48371_b.func_360_d(field_48372_c.field_611_ak, field_48372_c.field_601_au.field_1697_b, field_48372_c.field_609_am);
        boolean flag = field_48371_b.func_48090_aM().func_48480_a(field_48372_c);
        if(flag)
        {
            field_48367_f++;
        } else
        {
            field_48367_f = 0;
        }
        if(d1 > d || field_48367_f < 20)
        {
            field_48371_b.func_48084_aL().func_48667_a(field_48372_c, field_48370_e);
        } else
        {
            field_48371_b.func_48084_aL().func_48672_f();
        }
        field_48371_b.func_46008_aG().func_46141_a(field_48372_c, 30F, 30F);
        field_48369_d = Math.max(field_48369_d - 1, 0);
        if(field_48369_d > 0)
        {
            return;
        }
        if(d1 > d || !flag)
        {
            return;
        } else
        {
            func_48366_h();
            field_48369_d = field_48374_h;
            return;
        }
    }

    private void func_48366_h()
    {
        if(field_48368_g == 1)
        {
            EntityArrow entityarrow = new EntityArrow(field_48373_a, field_48371_b, field_48372_c, 1.6F, 12F);
            field_48373_a.func_623_a(field_48371_b, "random.bow", 1.0F, 1.0F / (field_48371_b.func_46004_aK().nextFloat() * 0.4F + 0.8F));
            field_48373_a.func_674_a(entityarrow);
        } else
        if(field_48368_g == 2)
        {
            EntitySnowball entitysnowball = new EntitySnowball(field_48373_a, field_48371_b);
            double d = field_48372_c.field_611_ak - field_48371_b.field_611_ak;
            double d1 = (field_48372_c.field_610_al + (double)field_48372_c.func_373_s()) - 1.1000000238418579D - entitysnowball.field_610_al;
            double d2 = field_48372_c.field_609_am - field_48371_b.field_609_am;
            float f = MathHelper.func_1109_a(d * d + d2 * d2) * 0.2F;
            entitysnowball.func_40076_a(d, d1 + (double)f, d2, 1.6F, 12F);
            field_48373_a.func_623_a(field_48371_b, "random.bow", 1.0F, 1.0F / (field_48371_b.func_46004_aK().nextFloat() * 0.4F + 0.8F));
            field_48373_a.func_674_a(entitysnowball);
        }
    }
}
