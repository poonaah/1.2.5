// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityFX, World, Tessellator

public class EntitySmokeFX extends EntityFX
{

    float field_671_a;

    public EntitySmokeFX(World p_i198_1_, double p_i198_2_, double p_i198_4_, double p_i198_6_, 
            double p_i198_8_, double p_i198_10_, double p_i198_12_)
    {
        this(p_i198_1_, p_i198_2_, p_i198_4_, p_i198_6_, p_i198_8_, p_i198_10_, p_i198_12_, 1.0F);
    }

    public EntitySmokeFX(World p_i199_1_, double p_i199_2_, double p_i199_4_, double p_i199_6_, 
            double p_i199_8_, double p_i199_10_, double p_i199_12_, float p_i199_14_)
    {
        super(p_i199_1_, p_i199_2_, p_i199_4_, p_i199_6_, 0.0D, 0.0D, 0.0D);
        field_608_an *= 0.10000000149011612D;
        field_607_ao *= 0.10000000149011612D;
        field_606_ap *= 0.10000000149011612D;
        field_608_an += p_i199_8_;
        field_607_ao += p_i199_10_;
        field_606_ap += p_i199_12_;
        field_663_i = field_662_j = field_661_k = (float)(Math.random() * 0.30000001192092896D);
        field_665_g *= 0.75F;
        field_665_g *= p_i199_14_;
        field_671_a = field_665_g;
        field_666_f = (int)(8D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D));
        field_666_f *= p_i199_14_;
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
        field_665_g = field_671_a * f;
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
        field_607_ao += 0.0040000000000000001D;
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
