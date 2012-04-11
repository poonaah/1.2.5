// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityFX, World, Tessellator

public class EntityFlameFX extends EntityFX
{

    private float field_672_a;

    public EntityFlameFX(World p_i454_1_, double p_i454_2_, double p_i454_4_, double p_i454_6_, 
            double p_i454_8_, double p_i454_10_, double p_i454_12_)
    {
        super(p_i454_1_, p_i454_2_, p_i454_4_, p_i454_6_, p_i454_8_, p_i454_10_, p_i454_12_);
        field_608_an = field_608_an * 0.0099999997764825821D + p_i454_8_;
        field_607_ao = field_607_ao * 0.0099999997764825821D + p_i454_10_;
        field_606_ap = field_606_ap * 0.0099999997764825821D + p_i454_12_;
        p_i454_2_ += (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.05F;
        p_i454_4_ += (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.05F;
        p_i454_6_ += (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.05F;
        field_672_a = field_665_g;
        field_663_i = field_662_j = field_661_k = 1.0F;
        field_666_f = (int)(8D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D)) + 4;
        field_9314_ba = true;
        func_40099_c(48);
    }

    public void func_406_a(Tessellator p_406_1_, float p_406_2_, float p_406_3_, float p_406_4_, float p_406_5_, float p_406_6_, float p_406_7_)
    {
        float f = ((float)field_20923_e + p_406_2_) / (float)field_666_f;
        field_665_g = field_672_a * (1.0F - f * f * 0.5F);
        super.func_406_a(p_406_1_, p_406_2_, p_406_3_, p_406_4_, p_406_5_, p_406_6_, p_406_7_);
    }

    public int func_35115_a(float p_35115_1_)
    {
        float f = ((float)field_20923_e + p_35115_1_) / (float)field_666_f;
        if(f < 0.0F)
        {
            f = 0.0F;
        }
        if(f > 1.0F)
        {
            f = 1.0F;
        }
        int i = super.func_35115_a(p_35115_1_);
        int j = i & 0xff;
        int k = i >> 16 & 0xff;
        j += (int)(f * 15F * 16F);
        if(j > 240)
        {
            j = 240;
        }
        return j | k << 16;
    }

    public float func_382_a(float p_382_1_)
    {
        float f = ((float)field_20923_e + p_382_1_) / (float)field_666_f;
        if(f < 0.0F)
        {
            f = 0.0F;
        }
        if(f > 1.0F)
        {
            f = 1.0F;
        }
        float f1 = super.func_382_a(p_382_1_);
        return f1 * f + (1.0F - f);
    }

    public void func_370_e_()
    {
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        if(field_20923_e++ >= field_666_f)
        {
            func_395_F();
        }
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_608_an *= 0.95999997854232788D;
        field_607_ao *= 0.95999997854232788D;
        field_606_ap *= 0.95999997854232788D;
        if(field_9298_aH)
        {
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
        }
    }
}
