// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityFX, World, Tessellator

public class EntitySpellParticleFX extends EntityFX
{

    private int field_40111_a;

    public EntitySpellParticleFX(World p_i531_1_, double p_i531_2_, double p_i531_4_, double p_i531_6_, 
            double p_i531_8_, double p_i531_10_, double p_i531_12_)
    {
        super(p_i531_1_, p_i531_2_, p_i531_4_, p_i531_6_, p_i531_8_, p_i531_10_, p_i531_12_);
        field_40111_a = 128;
        field_607_ao *= 0.20000000298023224D;
        if(p_i531_8_ == 0.0D && p_i531_12_ == 0.0D)
        {
            field_608_an *= 0.10000000149011612D;
            field_606_ap *= 0.10000000149011612D;
        }
        field_665_g *= 0.75F;
        field_666_f = (int)(8D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D));
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
        func_40099_c(field_40111_a + (7 - (field_20923_e * 8) / field_666_f));
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

    public void func_40110_b(int p_40110_1_)
    {
        field_40111_a = p_40110_1_;
    }
}
