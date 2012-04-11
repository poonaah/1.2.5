// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIDoorInteract, EntityLiving, BlockDoor, World

public class EntityAIBreakDoor extends EntityAIDoorInteract
{

    private int field_48329_i;

    public EntityAIBreakDoor(EntityLiving p_i1071_1_)
    {
        super(p_i1071_1_);
    }

    public boolean func_46082_a()
    {
        if(!super.func_46082_a())
        {
            return false;
        } else
        {
            return !field_48322_e.func_48213_h(field_48325_a.field_615_ag, field_48323_b, field_48324_c, field_48321_d);
        }
    }

    public void func_46080_e()
    {
        super.func_46080_e();
        field_48329_i = 240;
    }

    public boolean func_46084_g()
    {
        double d = field_48325_a.func_360_d(field_48323_b, field_48324_c, field_48321_d);
        return field_48329_i >= 0 && !field_48322_e.func_48213_h(field_48325_a.field_615_ag, field_48323_b, field_48324_c, field_48321_d) && d < 4D;
    }

    public void func_46081_b()
    {
        super.func_46081_b();
        if(field_48325_a.func_46004_aK().nextInt(20) == 0)
        {
            field_48325_a.field_615_ag.func_28106_e(1010, field_48323_b, field_48324_c, field_48321_d, 0);
        }
        if(--field_48329_i == 0 && field_48325_a.field_615_ag.field_1039_l == 3)
        {
            field_48325_a.field_615_ag.func_690_d(field_48323_b, field_48324_c, field_48321_d, 0);
            field_48325_a.field_615_ag.func_28106_e(1012, field_48323_b, field_48324_c, field_48321_d, 0);
            field_48325_a.field_615_ag.func_28106_e(2001, field_48323_b, field_48324_c, field_48321_d, field_48322_e.field_376_bc);
        }
    }
}
