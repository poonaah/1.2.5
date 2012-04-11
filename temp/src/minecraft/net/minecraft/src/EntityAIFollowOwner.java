// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityTameable, PathNavigate, EntityLookHelper, 
//            EntityLiving, MathHelper, AxisAlignedBB, World

public class EntityAIFollowOwner extends EntityAIBase
{

    private EntityTameable field_48305_d;
    private EntityLiving field_48306_e;
    World field_48309_a;
    private float field_48303_f;
    private PathNavigate field_48304_g;
    private int field_48310_h;
    float field_48307_b;
    float field_48308_c;
    private boolean field_48311_i;

    public EntityAIFollowOwner(EntityTameable p_i1054_1_, float p_i1054_2_, float p_i1054_3_, float p_i1054_4_)
    {
        field_48305_d = p_i1054_1_;
        field_48309_a = p_i1054_1_.field_615_ag;
        field_48303_f = p_i1054_2_;
        field_48304_g = p_i1054_1_.func_48084_aL();
        field_48308_c = p_i1054_3_;
        field_48307_b = p_i1054_4_;
        func_46079_a(3);
    }

    public boolean func_46082_a()
    {
        EntityLiving entityliving = field_48305_d.func_48144_ah();
        if(entityliving == null)
        {
            return false;
        }
        if(field_48305_d.func_48141_af())
        {
            return false;
        }
        if(field_48305_d.func_387_e(entityliving) < (double)(field_48308_c * field_48308_c))
        {
            return false;
        } else
        {
            field_48306_e = entityliving;
            return true;
        }
    }

    public boolean func_46084_g()
    {
        return !field_48304_g.func_46072_b() && field_48305_d.func_387_e(field_48306_e) > (double)(field_48307_b * field_48307_b) && !field_48305_d.func_48141_af();
    }

    public void func_46080_e()
    {
        field_48310_h = 0;
        field_48311_i = field_48305_d.func_48084_aL().func_48658_a();
        field_48305_d.func_48084_aL().func_48664_a(false);
    }

    public void func_46077_d()
    {
        field_48306_e = null;
        field_48304_g.func_48672_f();
        field_48305_d.func_48084_aL().func_48664_a(field_48311_i);
    }

    public void func_46081_b()
    {
        field_48305_d.func_46008_aG().func_46141_a(field_48306_e, 10F, field_48305_d.func_25026_x());
        if(field_48305_d.func_48141_af())
        {
            return;
        }
        if(--field_48310_h > 0)
        {
            return;
        }
        field_48310_h = 10;
        if(field_48304_g.func_48667_a(field_48306_e, field_48303_f))
        {
            return;
        }
        if(field_48305_d.func_387_e(field_48306_e) < 144D)
        {
            return;
        }
        int i = MathHelper.func_1108_b(field_48306_e.field_611_ak) - 2;
        int j = MathHelper.func_1108_b(field_48306_e.field_609_am) - 2;
        int k = MathHelper.func_1108_b(field_48306_e.field_601_au.field_1697_b);
        for(int l = 0; l <= 4; l++)
        {
            for(int i1 = 0; i1 <= 4; i1++)
            {
                if((l < 1 || i1 < 1 || l > 3 || i1 > 3) && field_48309_a.func_28100_h(i + l, k - 1, j + i1) && !field_48309_a.func_28100_h(i + l, k, j + i1) && !field_48309_a.func_28100_h(i + l, k + 1, j + i1))
                {
                    field_48305_d.func_365_c((float)(i + l) + 0.5F, k, (float)(j + i1) + 0.5F, field_48305_d.field_605_aq, field_48305_d.field_604_ar);
                    field_48304_g.func_48672_f();
                    return;
                }
            }

        }

    }
}
