// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, PathNavigate, MathHelper, 
//            EntityLookHelper, EntitySenses, AxisAlignedBB, World, 
//            PathEntity

public class EntityAIAttackOnCollide extends EntityAIBase
{

    World field_46095_a;
    EntityLiving field_48267_b;
    EntityLiving field_46094_c;
    int field_46091_d;
    float field_48266_e;
    boolean field_48264_f;
    PathEntity field_48265_g;
    Class field_48268_h;
    private int field_48269_i;

    public EntityAIAttackOnCollide(EntityLiving p_i1024_1_, Class p_i1024_2_, float p_i1024_3_, boolean p_i1024_4_)
    {
        this(p_i1024_1_, p_i1024_3_, p_i1024_4_);
        field_48268_h = p_i1024_2_;
    }

    public EntityAIAttackOnCollide(EntityLiving p_i1025_1_, float p_i1025_2_, boolean p_i1025_3_)
    {
        field_46091_d = 0;
        field_48267_b = p_i1025_1_;
        field_46095_a = p_i1025_1_.field_615_ag;
        field_48266_e = p_i1025_2_;
        field_48264_f = p_i1025_3_;
        func_46079_a(3);
    }

    public boolean func_46082_a()
    {
        EntityLiving entityliving = field_48267_b.func_48094_aS();
        if(entityliving == null)
        {
            return false;
        }
        if(field_48268_h != null && !field_48268_h.isAssignableFrom(entityliving.getClass()))
        {
            return false;
        } else
        {
            field_46094_c = entityliving;
            field_48265_g = field_48267_b.func_48084_aL().func_48679_a(field_46094_c);
            return field_48265_g != null;
        }
    }

    public boolean func_46084_g()
    {
        EntityLiving entityliving = field_48267_b.func_48094_aS();
        if(entityliving == null)
        {
            return false;
        }
        if(!field_46094_c.func_354_B())
        {
            return false;
        }
        if(!field_48264_f)
        {
            return !field_48267_b.func_48084_aL().func_46072_b();
        }
        return field_48267_b.func_48096_f(MathHelper.func_1108_b(field_46094_c.field_611_ak), MathHelper.func_1108_b(field_46094_c.field_610_al), MathHelper.func_1108_b(field_46094_c.field_609_am));
    }

    public void func_46080_e()
    {
        field_48267_b.func_48084_aL().func_48678_a(field_48265_g, field_48266_e);
        field_48269_i = 0;
    }

    public void func_46077_d()
    {
        field_46094_c = null;
        field_48267_b.func_48084_aL().func_48672_f();
    }

    public void func_46081_b()
    {
        field_48267_b.func_46008_aG().func_46141_a(field_46094_c, 30F, 30F);
        if((field_48264_f || field_48267_b.func_48090_aM().func_48480_a(field_46094_c)) && --field_48269_i <= 0)
        {
            field_48269_i = 4 + field_48267_b.func_46004_aK().nextInt(7);
            field_48267_b.func_48084_aL().func_48667_a(field_46094_c, field_48266_e);
        }
        field_46091_d = Math.max(field_46091_d - 1, 0);
        double d = field_48267_b.field_644_aC * 2.0F * (field_48267_b.field_644_aC * 2.0F);
        if(field_48267_b.func_360_d(field_46094_c.field_611_ak, field_46094_c.field_601_au.field_1697_b, field_46094_c.field_609_am) > d)
        {
            return;
        }
        if(field_46091_d > 0)
        {
            return;
        } else
        {
            field_46091_d = 20;
            field_48267_b.func_35175_b(field_46094_c);
            return;
        }
    }
}
