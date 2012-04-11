// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, PathNavigate, EntityLookHelper, 
//            AxisAlignedBB, World

public class EntityAIOcelotAttack extends EntityAIBase
{

    World field_48363_a;
    EntityLiving field_48361_b;
    EntityLiving field_48362_c;
    int field_48360_d;

    public EntityAIOcelotAttack(EntityLiving p_i1073_1_)
    {
        field_48360_d = 0;
        field_48361_b = p_i1073_1_;
        field_48363_a = p_i1073_1_.field_615_ag;
        func_46079_a(3);
    }

    public boolean func_46082_a()
    {
        EntityLiving entityliving = field_48361_b.func_48094_aS();
        if(entityliving == null)
        {
            return false;
        } else
        {
            field_48362_c = entityliving;
            return true;
        }
    }

    public boolean func_46084_g()
    {
        if(!field_48362_c.func_354_B())
        {
            return false;
        }
        if(field_48361_b.func_387_e(field_48362_c) > 225D)
        {
            return false;
        } else
        {
            return !field_48361_b.func_48084_aL().func_46072_b() || func_46082_a();
        }
    }

    public void func_46077_d()
    {
        field_48362_c = null;
        field_48361_b.func_48084_aL().func_48672_f();
    }

    public void func_46081_b()
    {
        field_48361_b.func_46008_aG().func_46141_a(field_48362_c, 30F, 30F);
        double d = field_48361_b.field_644_aC * 2.0F * (field_48361_b.field_644_aC * 2.0F);
        double d1 = field_48361_b.func_360_d(field_48362_c.field_611_ak, field_48362_c.field_601_au.field_1697_b, field_48362_c.field_609_am);
        float f = 0.23F;
        if(d1 > d && d1 < 16D)
        {
            f = 0.4F;
        } else
        if(d1 < 225D)
        {
            f = 0.18F;
        }
        field_48361_b.func_48084_aL().func_48667_a(field_48362_c, f);
        field_48360_d = Math.max(field_48360_d - 1, 0);
        if(d1 > d)
        {
            return;
        }
        if(field_48360_d > 0)
        {
            return;
        } else
        {
            field_48360_d = 20;
            field_48361_b.func_35175_b(field_48362_c);
            return;
        }
    }
}
