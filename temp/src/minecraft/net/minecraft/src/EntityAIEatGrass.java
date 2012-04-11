// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, MathHelper, World, 
//            Block, BlockTallGrass, BlockGrass, PathNavigate

public class EntityAIEatGrass extends EntityAIBase
{

    private EntityLiving field_48397_b;
    private World field_48398_c;
    int field_48399_a;

    public EntityAIEatGrass(EntityLiving p_i1095_1_)
    {
        field_48399_a = 0;
        field_48397_b = p_i1095_1_;
        field_48398_c = p_i1095_1_.field_615_ag;
        func_46079_a(7);
    }

    public boolean func_46082_a()
    {
        if(field_48397_b.func_46004_aK().nextInt(field_48397_b.func_40127_l() ? 50 : 1000) != 0)
        {
            return false;
        }
        int i = MathHelper.func_1108_b(field_48397_b.field_611_ak);
        int j = MathHelper.func_1108_b(field_48397_b.field_610_al);
        int k = MathHelper.func_1108_b(field_48397_b.field_609_am);
        if(field_48398_c.func_600_a(i, j, k) == Block.field_9257_X.field_376_bc && field_48398_c.func_602_e(i, j, k) == 1)
        {
            return true;
        }
        return field_48398_c.func_600_a(i, j - 1, k) == Block.field_337_v.field_376_bc;
    }

    public void func_46080_e()
    {
        field_48399_a = 40;
        field_48398_c.func_9425_a(field_48397_b, (byte)10);
        field_48397_b.func_48084_aL().func_48672_f();
    }

    public void func_46077_d()
    {
        field_48399_a = 0;
    }

    public boolean func_46084_g()
    {
        return field_48399_a > 0;
    }

    public int func_48396_h()
    {
        return field_48399_a;
    }

    public void func_46081_b()
    {
        field_48399_a = Math.max(0, field_48399_a - 1);
        if(field_48399_a != 4)
        {
            return;
        }
        int i = MathHelper.func_1108_b(field_48397_b.field_611_ak);
        int j = MathHelper.func_1108_b(field_48397_b.field_610_al);
        int k = MathHelper.func_1108_b(field_48397_b.field_609_am);
        if(field_48398_c.func_600_a(i, j, k) == Block.field_9257_X.field_376_bc)
        {
            field_48398_c.func_28106_e(2001, i, j, k, Block.field_9257_X.field_376_bc + 4096);
            field_48398_c.func_690_d(i, j, k, 0);
            field_48397_b.func_48095_u();
        } else
        if(field_48398_c.func_600_a(i, j - 1, k) == Block.field_337_v.field_376_bc)
        {
            field_48398_c.func_28106_e(2001, i, j - 1, k, Block.field_337_v.field_376_bc);
            field_48398_c.func_690_d(i, j - 1, k, Block.field_336_w.field_376_bc);
            field_48397_b.func_48095_u();
        }
    }
}
