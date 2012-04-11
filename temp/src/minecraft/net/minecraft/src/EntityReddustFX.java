// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityFX, World, Tessellator

public class EntityReddustFX extends EntityFX
{

    float field_673_a;

    public EntityReddustFX(World p_i732_1_, double p_i732_2_, double p_i732_4_, double p_i732_6_, 
            float p_i732_8_, float p_i732_9_, float p_i732_10_)
    {
        this(p_i732_1_, p_i732_2_, p_i732_4_, p_i732_6_, 1.0F, p_i732_8_, p_i732_9_, p_i732_10_);
    }

    public EntityReddustFX(World p_i733_1_, double p_i733_2_, double p_i733_4_, double p_i733_6_, 
            float p_i733_8_, float p_i733_9_, float p_i733_10_, float p_i733_11_)
    {
        super(p_i733_1_, p_i733_2_, p_i733_4_, p_i733_6_, 0.0D, 0.0D, 0.0D);
        field_608_an *= 0.10000000149011612D;
        field_607_ao *= 0.10000000149011612D;
        field_606_ap *= 0.10000000149011612D;
        if(p_i733_9_ == 0.0F)
        {
            p_i733_9_ = 1.0F;
        }
        float f = (float)Math.random() * 0.4F + 0.6F;
        field_663_i = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * p_i733_9_ * f;
        field_662_j = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * p_i733_10_ * f;
        field_661_k = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * p_i733_11_ * f;
        field_665_g *= 0.75F;
        field_665_g *= p_i733_8_;
        field_673_a = field_665_g;
        field_666_f = (int)(8D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D));
        field_666_f *= p_i733_8_;
        field_9314_ba = false;
    }

    public void func_406_a(Tessellator p_406_1_, float p_406_2_, float p_406_3_, float p_406_4_, float p_406_5_, float p_406_6_, float p_406_7_)
    {
        float f = (((float)field_20923_e + p_406_2_) / (float)field_666_f) * 32F;
        if(f < 0.0F)
        {
            f = 0.0F;
        }
        if(f > 1.0F)
        {
            f = 1.0F;
        }
        field_665_g = field_673_a * f;
        super.func_406_a(p_406_1_, p_406_2_, p_406_3_, p_406_4_, p_406_5_, p_406_6_, p_406_7_);
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
        func_40099_c(7 - (field_20923_e * 8) / field_666_f);
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        if(field_610_al == field_9284_au)
        {
            field_608_an *= 1.1000000000000001D;
            field_606_ap *= 1.1000000000000001D;
        }
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
