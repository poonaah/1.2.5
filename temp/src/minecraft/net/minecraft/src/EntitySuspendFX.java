// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityFX, MathHelper, World, Material

public class EntitySuspendFX extends EntityFX
{

    public EntitySuspendFX(World p_i424_1_, double p_i424_2_, double p_i424_4_, double p_i424_6_, 
            double p_i424_8_, double p_i424_10_, double p_i424_12_)
    {
        super(p_i424_1_, p_i424_2_, p_i424_4_ - 0.125D, p_i424_6_, p_i424_8_, p_i424_10_, p_i424_12_);
        field_663_i = 0.4F;
        field_662_j = 0.4F;
        field_661_k = 0.7F;
        func_40099_c(0);
        func_371_a(0.01F, 0.01F);
        field_665_g = field_665_g * (field_9312_bd.nextFloat() * 0.6F + 0.2F);
        field_608_an = p_i424_8_ * 0.0D;
        field_607_ao = p_i424_10_ * 0.0D;
        field_606_ap = p_i424_12_ * 0.0D;
        field_666_f = (int)(16D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D));
    }

    public void func_370_e_()
    {
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        if(field_615_ag.func_599_f(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al), MathHelper.func_1108_b(field_609_am)) != Material.field_1332_f)
        {
            func_395_F();
        }
        if(field_666_f-- <= 0)
        {
            func_395_F();
        }
    }
}
