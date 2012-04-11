// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityFX, MathHelper, World, Material, 
//            BlockFluid

public class EntityRainFX extends EntityFX
{

    public EntityRainFX(World p_i568_1_, double p_i568_2_, double p_i568_4_, double p_i568_6_)
    {
        super(p_i568_1_, p_i568_2_, p_i568_4_, p_i568_6_, 0.0D, 0.0D, 0.0D);
        field_608_an *= 0.30000001192092896D;
        field_607_ao = (float)Math.random() * 0.2F + 0.1F;
        field_606_ap *= 0.30000001192092896D;
        field_663_i = 1.0F;
        field_662_j = 1.0F;
        field_661_k = 1.0F;
        func_40099_c(19 + field_9312_bd.nextInt(4));
        func_371_a(0.01F, 0.01F);
        field_664_h = 0.06F;
        field_666_f = (int)(8D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D));
    }

    public void func_370_e_()
    {
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        field_607_ao -= field_664_h;
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_608_an *= 0.98000001907348633D;
        field_607_ao *= 0.98000001907348633D;
        field_606_ap *= 0.98000001907348633D;
        if(field_666_f-- <= 0)
        {
            func_395_F();
        }
        if(field_9298_aH)
        {
            if(Math.random() < 0.5D)
            {
                func_395_F();
            }
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
        }
        Material material = field_615_ag.func_599_f(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al), MathHelper.func_1108_b(field_609_am));
        if(material.func_879_d() || material.func_878_a())
        {
            double d = (float)(MathHelper.func_1108_b(field_610_al) + 1) - BlockFluid.func_288_b(field_615_ag.func_602_e(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al), MathHelper.func_1108_b(field_609_am)));
            if(field_610_al < d)
            {
                func_395_F();
            }
        }
    }
}
