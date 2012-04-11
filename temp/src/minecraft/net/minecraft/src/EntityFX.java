// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, MathHelper, Tessellator, World, 
//            NBTTagCompound

public class EntityFX extends Entity
{

    private int field_670_b;
    protected float field_669_c;
    protected float field_668_d;
    protected int field_20923_e;
    protected int field_666_f;
    protected float field_665_g;
    protected float field_664_h;
    protected float field_663_i;
    protected float field_662_j;
    protected float field_661_k;
    public static double field_660_l;
    public static double field_659_m;
    public static double field_658_n;

    public EntityFX(World p_i579_1_, double p_i579_2_, double p_i579_4_, double p_i579_6_, 
            double p_i579_8_, double p_i579_10_, double p_i579_12_)
    {
        super(p_i579_1_);
        field_20923_e = 0;
        field_666_f = 0;
        func_371_a(0.2F, 0.2F);
        field_9292_aO = field_643_aD / 2.0F;
        func_347_a(p_i579_2_, p_i579_4_, p_i579_6_);
        field_663_i = field_662_j = field_661_k = 1.0F;
        field_608_an = p_i579_8_ + (double)((float)(Math.random() * 2D - 1.0D) * 0.4F);
        field_607_ao = p_i579_10_ + (double)((float)(Math.random() * 2D - 1.0D) * 0.4F);
        field_606_ap = p_i579_12_ + (double)((float)(Math.random() * 2D - 1.0D) * 0.4F);
        float f = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
        float f1 = MathHelper.func_1109_a(field_608_an * field_608_an + field_607_ao * field_607_ao + field_606_ap * field_606_ap);
        field_608_an = (field_608_an / (double)f1) * (double)f * 0.40000000596046448D;
        field_607_ao = (field_607_ao / (double)f1) * (double)f * 0.40000000596046448D + 0.10000000149011612D;
        field_606_ap = (field_606_ap / (double)f1) * (double)f * 0.40000000596046448D;
        field_669_c = field_9312_bd.nextFloat() * 3F;
        field_668_d = field_9312_bd.nextFloat() * 3F;
        field_665_g = (field_9312_bd.nextFloat() * 0.5F + 0.5F) * 2.0F;
        field_666_f = (int)(4F / (field_9312_bd.nextFloat() * 0.9F + 0.1F));
        field_20923_e = 0;
    }

    public EntityFX func_407_b(float p_407_1_)
    {
        field_608_an *= p_407_1_;
        field_607_ao = (field_607_ao - 0.10000000149011612D) * (double)p_407_1_ + 0.10000000149011612D;
        field_606_ap *= p_407_1_;
        return this;
    }

    public EntityFX func_405_d(float p_405_1_)
    {
        func_371_a(0.2F * p_405_1_, 0.2F * p_405_1_);
        field_665_g *= p_405_1_;
        return this;
    }

    public void func_40097_b(float p_40097_1_, float p_40097_2_, float p_40097_3_)
    {
        field_663_i = p_40097_1_;
        field_662_j = p_40097_2_;
        field_661_k = p_40097_3_;
    }

    public float func_40098_n()
    {
        return field_663_i;
    }

    public float func_40101_o()
    {
        return field_662_j;
    }

    public float func_40102_p()
    {
        return field_661_k;
    }

    protected boolean func_25021_m()
    {
        return false;
    }

    protected void func_21057_b()
    {
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
        field_607_ao -= 0.040000000000000001D * (double)field_664_h;
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_608_an *= 0.98000001907348633D;
        field_607_ao *= 0.98000001907348633D;
        field_606_ap *= 0.98000001907348633D;
        if(field_9298_aH)
        {
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
        }
    }

    public void func_406_a(Tessellator p_406_1_, float p_406_2_, float p_406_3_, float p_406_4_, float p_406_5_, float p_406_6_, float p_406_7_)
    {
        float f = (float)(field_670_b % 16) / 16F;
        float f1 = f + 0.0624375F;
        float f2 = (float)(field_670_b / 16) / 16F;
        float f3 = f2 + 0.0624375F;
        float f4 = 0.1F * field_665_g;
        float f5 = (float)((field_9285_at + (field_611_ak - field_9285_at) * (double)p_406_2_) - field_660_l);
        float f6 = (float)((field_9284_au + (field_610_al - field_9284_au) * (double)p_406_2_) - field_659_m);
        float f7 = (float)((field_9283_av + (field_609_am - field_9283_av) * (double)p_406_2_) - field_658_n);
        float f8 = 1.0F;
        p_406_1_.func_987_a(field_663_i * f8, field_662_j * f8, field_661_k * f8);
        p_406_1_.func_983_a(f5 - p_406_3_ * f4 - p_406_6_ * f4, f6 - p_406_4_ * f4, f7 - p_406_5_ * f4 - p_406_7_ * f4, f1, f3);
        p_406_1_.func_983_a((f5 - p_406_3_ * f4) + p_406_6_ * f4, f6 + p_406_4_ * f4, (f7 - p_406_5_ * f4) + p_406_7_ * f4, f1, f2);
        p_406_1_.func_983_a(f5 + p_406_3_ * f4 + p_406_6_ * f4, f6 + p_406_4_ * f4, f7 + p_406_5_ * f4 + p_406_7_ * f4, f, f2);
        p_406_1_.func_983_a((f5 + p_406_3_ * f4) - p_406_6_ * f4, f6 - p_406_4_ * f4, (f7 + p_406_5_ * f4) - p_406_7_ * f4, f, f3);
    }

    public int func_404_c()
    {
        return 0;
    }

    public void func_352_a(NBTTagCompound nbttagcompound)
    {
    }

    public void func_357_b(NBTTagCompound nbttagcompound)
    {
    }

    public void func_40099_c(int p_40099_1_)
    {
        field_670_b = p_40099_1_;
    }

    public int func_40100_q()
    {
        return field_670_b;
    }

    public boolean func_48080_j()
    {
        return false;
    }
}
