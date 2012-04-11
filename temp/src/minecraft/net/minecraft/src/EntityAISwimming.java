// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityLiving, PathNavigate, EntityJumpHelper

public class EntityAISwimming extends EntityAIBase
{

    private EntityLiving field_46106_a;

    public EntityAISwimming(EntityLiving p_i154_1_)
    {
        field_46106_a = p_i154_1_;
        func_46079_a(4);
        p_i154_1_.func_48084_aL().func_48669_e(true);
    }

    public boolean func_46082_a()
    {
        return field_46106_a.func_27013_ag() || field_46106_a.func_359_G();
    }

    public void func_46081_b()
    {
        if(field_46106_a.func_46004_aK().nextFloat() < 0.8F)
        {
            field_46106_a.func_46005_aI().func_46129_a();
        }
    }
}
