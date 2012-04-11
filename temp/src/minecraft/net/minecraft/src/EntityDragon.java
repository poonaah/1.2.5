// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            EntityDragonBase, EntityDragonPart, DataWatcher, World, 
//            MathHelper, Entity, AxisAlignedBB, Vec3D, 
//            EntityEnderCrystal, DamageSource, EntityLiving, Block, 
//            EntityPlayer, EntityXPOrb, BlockEndPortal

public class EntityDragon extends EntityDragonBase
{

    public double field_40167_a;
    public double field_40165_b;
    public double field_40166_c;
    public double field_40162_d[][];
    public int field_40164_e;
    public EntityDragonPart field_40176_ao[];
    public EntityDragonPart field_40177_ap;
    public EntityDragonPart field_40171_aq;
    public EntityDragonPart field_40170_ar;
    public EntityDragonPart field_40169_as;
    public EntityDragonPart field_40168_at;
    public EntityDragonPart field_40175_au;
    public EntityDragonPart field_40174_av;
    public float field_40173_aw;
    public float field_40172_ax;
    public boolean field_40163_ay;
    public boolean field_40161_az;
    private Entity field_40179_aC;
    public int field_40178_aA;
    public EntityEnderCrystal field_41013_bH;

    public EntityDragon(World p_i499_1_)
    {
        super(p_i499_1_);
        field_40162_d = new double[64][3];
        field_40164_e = -1;
        field_40173_aw = 0.0F;
        field_40172_ax = 0.0F;
        field_40163_ay = false;
        field_40161_az = false;
        field_40178_aA = 0;
        field_41013_bH = null;
        field_40176_ao = (new EntityDragonPart[] {
            field_40177_ap = new EntityDragonPart(this, "head", 6F, 6F), field_40171_aq = new EntityDragonPart(this, "body", 8F, 8F), field_40170_ar = new EntityDragonPart(this, "tail", 4F, 4F), field_40169_as = new EntityDragonPart(this, "tail", 4F, 4F), field_40168_at = new EntityDragonPart(this, "tail", 4F, 4F), field_40175_au = new EntityDragonPart(this, "wing", 4F, 4F), field_40174_av = new EntityDragonPart(this, "wing", 4F, 4F)
        });
        field_40157_aB = 200;
        func_40121_k(field_40157_aB);
        field_9357_z = "/mob/enderdragon/ender.png";
        func_371_a(16F, 8F);
        field_9314_ba = true;
        field_9304_bm = true;
        field_40165_b = 100D;
        field_28016_bK = true;
    }

    protected void func_21057_b()
    {
        super.func_21057_b();
        field_21064_bx.func_21124_a(16, new Integer(field_40157_aB));
    }

    public double[] func_40160_a(int p_40160_1_, float p_40160_2_)
    {
        if(field_9337_J <= 0)
        {
            p_40160_2_ = 0.0F;
        }
        p_40160_2_ = 1.0F - p_40160_2_;
        int i = field_40164_e - p_40160_1_ * 1 & 0x3f;
        int j = field_40164_e - p_40160_1_ * 1 - 1 & 0x3f;
        double ad[] = new double[3];
        double d = field_40162_d[i][0];
        double d1;
        for(d1 = field_40162_d[j][0] - d; d1 < -180D; d1 += 360D) { }
        for(; d1 >= 180D; d1 -= 360D) { }
        ad[0] = d + d1 * (double)p_40160_2_;
        d = field_40162_d[i][1];
        d1 = field_40162_d[j][1] - d;
        ad[1] = d + d1 * (double)p_40160_2_;
        ad[2] = field_40162_d[i][2] + (field_40162_d[j][2] - field_40162_d[i][2]) * (double)p_40160_2_;
        return ad;
    }

    public void func_425_j()
    {
        field_40173_aw = field_40172_ax;
        if(!field_615_ag.field_1026_y)
        {
            field_21064_bx.func_21129_b(16, Integer.valueOf(field_9337_J));
        }
        if(field_9337_J <= 0)
        {
            float f = (field_9312_bd.nextFloat() - 0.5F) * 8F;
            float f2 = (field_9312_bd.nextFloat() - 0.5F) * 4F;
            float f4 = (field_9312_bd.nextFloat() - 0.5F) * 8F;
            field_615_ag.func_694_a("largeexplode", field_611_ak + (double)f, field_610_al + 2D + (double)f2, field_609_am + (double)f4, 0.0D, 0.0D, 0.0D);
            return;
        }
        func_41011_ay();
        float f1 = 0.2F / (MathHelper.func_1109_a(field_608_an * field_608_an + field_606_ap * field_606_ap) * 10F + 1.0F);
        f1 *= (float)Math.pow(2D, field_607_ao);
        if(field_40161_az)
        {
            field_40172_ax += f1 * 0.5F;
        } else
        {
            field_40172_ax += f1;
        }
        for(; field_605_aq >= 180F; field_605_aq -= 360F) { }
        for(; field_605_aq < -180F; field_605_aq += 360F) { }
        if(field_40164_e < 0)
        {
            for(int i = 0; i < field_40162_d.length; i++)
            {
                field_40162_d[i][0] = field_605_aq;
                field_40162_d[i][1] = field_610_al;
            }

        }
        if(++field_40164_e == field_40162_d.length)
        {
            field_40164_e = 0;
        }
        field_40162_d[field_40164_e][0] = field_605_aq;
        field_40162_d[field_40164_e][1] = field_610_al;
        if(field_615_ag.field_1026_y)
        {
            if(field_9324_Y > 0)
            {
                double d = field_611_ak + (field_9323_Z - field_611_ak) / (double)field_9324_Y;
                double d2 = field_610_al + (field_9356_aa - field_610_al) / (double)field_9324_Y;
                double d4 = field_609_am + (field_9354_ab - field_609_am) / (double)field_9324_Y;
                double d6;
                for(d6 = field_9352_ac - (double)field_605_aq; d6 < -180D; d6 += 360D) { }
                for(; d6 >= 180D; d6 -= 360D) { }
                field_605_aq += d6 / (double)field_9324_Y;
                field_604_ar += (field_9350_ad - (double)field_604_ar) / (double)field_9324_Y;
                field_9324_Y--;
                func_347_a(d, d2, d4);
                func_376_c(field_605_aq, field_604_ar);
            }
        } else
        {
            double d1 = field_40167_a - field_611_ak;
            double d3 = field_40165_b - field_610_al;
            double d5 = field_40166_c - field_609_am;
            double d7 = d1 * d1 + d3 * d3 + d5 * d5;
            if(field_40179_aC != null)
            {
                field_40167_a = field_40179_aC.field_611_ak;
                field_40166_c = field_40179_aC.field_609_am;
                double d8 = field_40167_a - field_611_ak;
                double d10 = field_40166_c - field_609_am;
                double d12 = Math.sqrt(d8 * d8 + d10 * d10);
                double d13 = (0.40000000596046448D + d12 / 80D) - 1.0D;
                if(d13 > 10D)
                {
                    d13 = 10D;
                }
                field_40165_b = field_40179_aC.field_601_au.field_1697_b + d13;
            } else
            {
                field_40167_a += field_9312_bd.nextGaussian() * 2D;
                field_40166_c += field_9312_bd.nextGaussian() * 2D;
            }
            if(field_40163_ay || d7 < 100D || d7 > 22500D || field_9297_aI || field_9296_aJ)
            {
                func_41006_aA();
            }
            d3 /= MathHelper.func_1109_a(d1 * d1 + d5 * d5);
            float f10 = 0.6F;
            if(d3 < (double)(-f10))
            {
                d3 = -f10;
            }
            if(d3 > (double)f10)
            {
                d3 = f10;
            }
            field_607_ao += d3 * 0.10000000149011612D;
            for(; field_605_aq < -180F; field_605_aq += 360F) { }
            for(; field_605_aq >= 180F; field_605_aq -= 360F) { }
            double d9 = 180D - (Math.atan2(d1, d5) * 180D) / 3.1415927410125732D;
            double d11;
            for(d11 = d9 - (double)field_605_aq; d11 < -180D; d11 += 360D) { }
            for(; d11 >= 180D; d11 -= 360D) { }
            if(d11 > 50D)
            {
                d11 = 50D;
            }
            if(d11 < -50D)
            {
                d11 = -50D;
            }
            Vec3D vec3d = Vec3D.func_1248_b(field_40167_a - field_611_ak, field_40165_b - field_610_al, field_40166_c - field_609_am).func_1252_b();
            Vec3D vec3d1 = Vec3D.func_1248_b(MathHelper.func_1106_a((field_605_aq * 3.141593F) / 180F), field_607_ao, -MathHelper.func_1114_b((field_605_aq * 3.141593F) / 180F)).func_1252_b();
            float f18 = (float)(vec3d1.func_35612_b(vec3d) + 0.5D) / 1.5F;
            if(f18 < 0.0F)
            {
                f18 = 0.0F;
            }
            field_9338_aj *= 0.8F;
            float f19 = MathHelper.func_1109_a(field_608_an * field_608_an + field_606_ap * field_606_ap) * 1.0F + 1.0F;
            double d14 = Math.sqrt(field_608_an * field_608_an + field_606_ap * field_606_ap) * 1.0D + 1.0D;
            if(d14 > 40D)
            {
                d14 = 40D;
            }
            field_9338_aj += d11 * (0.69999998807907104D / d14 / (double)f19);
            field_605_aq += field_9338_aj * 0.1F;
            float f20 = (float)(2D / (d14 + 1.0D));
            float f21 = 0.06F;
            func_351_a(0.0F, -1F, f21 * (f18 * f20 + (1.0F - f20)));
            if(field_40161_az)
            {
                func_349_c(field_608_an * 0.80000001192092896D, field_607_ao * 0.80000001192092896D, field_606_ap * 0.80000001192092896D);
            } else
            {
                func_349_c(field_608_an, field_607_ao, field_606_ap);
            }
            Vec3D vec3d2 = Vec3D.func_1248_b(field_608_an, field_607_ao, field_606_ap).func_1252_b();
            float f22 = (float)(vec3d2.func_35612_b(vec3d1) + 1.0D) / 2.0F;
            f22 = 0.8F + 0.15F * f22;
            field_608_an *= f22;
            field_606_ap *= f22;
            field_607_ao *= 0.9100000262260437D;
        }
        field_735_n = field_605_aq;
        field_40177_ap.field_644_aC = field_40177_ap.field_643_aD = 3F;
        field_40170_ar.field_644_aC = field_40170_ar.field_643_aD = 2.0F;
        field_40169_as.field_644_aC = field_40169_as.field_643_aD = 2.0F;
        field_40168_at.field_644_aC = field_40168_at.field_643_aD = 2.0F;
        field_40171_aq.field_643_aD = 3F;
        field_40171_aq.field_644_aC = 5F;
        field_40175_au.field_643_aD = 2.0F;
        field_40175_au.field_644_aC = 4F;
        field_40174_av.field_643_aD = 3F;
        field_40174_av.field_644_aC = 4F;
        float f3 = (((float)(func_40160_a(5, 1.0F)[1] - func_40160_a(10, 1.0F)[1]) * 10F) / 180F) * 3.141593F;
        float f5 = MathHelper.func_1114_b(f3);
        float f6 = -MathHelper.func_1106_a(f3);
        float f7 = (field_605_aq * 3.141593F) / 180F;
        float f8 = MathHelper.func_1106_a(f7);
        float f9 = MathHelper.func_1114_b(f7);
        field_40171_aq.func_370_e_();
        field_40171_aq.func_365_c(field_611_ak + (double)(f8 * 0.5F), field_610_al, field_609_am - (double)(f9 * 0.5F), 0.0F, 0.0F);
        field_40175_au.func_370_e_();
        field_40175_au.func_365_c(field_611_ak + (double)(f9 * 4.5F), field_610_al + 2D, field_609_am + (double)(f8 * 4.5F), 0.0F, 0.0F);
        field_40174_av.func_370_e_();
        field_40174_av.func_365_c(field_611_ak - (double)(f9 * 4.5F), field_610_al + 2D, field_609_am - (double)(f8 * 4.5F), 0.0F, 0.0F);
        if(!field_615_ag.field_1026_y)
        {
            func_41007_az();
        }
        if(!field_615_ag.field_1026_y && field_9332_M == 0)
        {
            func_41008_a(field_615_ag.func_659_b(this, field_40175_au.field_601_au.func_1177_b(4D, 2D, 4D).func_1174_d(0.0D, -2D, 0.0D)));
            func_41008_a(field_615_ag.func_659_b(this, field_40174_av.field_601_au.func_1177_b(4D, 2D, 4D).func_1174_d(0.0D, -2D, 0.0D)));
            func_41009_b(field_615_ag.func_659_b(this, field_40177_ap.field_601_au.func_1177_b(1.0D, 1.0D, 1.0D)));
        }
        double ad[] = func_40160_a(5, 1.0F);
        double ad1[] = func_40160_a(0, 1.0F);
        float f11 = MathHelper.func_1106_a((field_605_aq * 3.141593F) / 180F - field_9338_aj * 0.01F);
        float f12 = MathHelper.func_1114_b((field_605_aq * 3.141593F) / 180F - field_9338_aj * 0.01F);
        field_40177_ap.func_370_e_();
        field_40177_ap.func_365_c(field_611_ak + (double)(f11 * 5.5F * f5), field_610_al + (ad1[1] - ad[1]) * 1.0D + (double)(f6 * 5.5F), field_609_am - (double)(f12 * 5.5F * f5), 0.0F, 0.0F);
        for(int j = 0; j < 3; j++)
        {
            EntityDragonPart entitydragonpart = null;
            if(j == 0)
            {
                entitydragonpart = field_40170_ar;
            }
            if(j == 1)
            {
                entitydragonpart = field_40169_as;
            }
            if(j == 2)
            {
                entitydragonpart = field_40168_at;
            }
            double ad2[] = func_40160_a(12 + j * 2, 1.0F);
            float f13 = (field_605_aq * 3.141593F) / 180F + ((func_40159_b(ad2[0] - ad[0]) * 3.141593F) / 180F) * 1.0F;
            float f14 = MathHelper.func_1106_a(f13);
            float f15 = MathHelper.func_1114_b(f13);
            float f16 = 1.5F;
            float f17 = (float)(j + 1) * 2.0F;
            entitydragonpart.func_370_e_();
            entitydragonpart.func_365_c(field_611_ak - (double)((f8 * f16 + f14 * f17) * f5), ((field_610_al + (ad2[1] - ad[1]) * 1.0D) - (double)((f17 + f16) * f6)) + 1.5D, field_609_am + (double)((f9 * f16 + f15 * f17) * f5), 0.0F, 0.0F);
        }

        if(!field_615_ag.field_1026_y)
        {
            field_40161_az = func_40158_a(field_40177_ap.field_601_au) | func_40158_a(field_40171_aq.field_601_au);
        }
    }

    private void func_41011_ay()
    {
        if(field_41013_bH != null)
        {
            if(field_41013_bH.field_646_aA)
            {
                if(!field_615_ag.field_1026_y)
                {
                    func_40156_a(field_40177_ap, DamageSource.field_35548_k, 10);
                }
                field_41013_bH = null;
            } else
            if(field_9311_be % 10 == 0 && field_9337_J < field_40157_aB)
            {
                field_9337_J++;
            }
        }
        if(field_9312_bd.nextInt(10) == 0)
        {
            float f = 32F;
            List list = field_615_ag.func_657_a(net.minecraft.src.EntityEnderCrystal.class, field_601_au.func_1177_b(f, f, f));
            EntityEnderCrystal entityendercrystal = null;
            double d = 1.7976931348623157E+308D;
            Iterator iterator = list.iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    break;
                }
                Entity entity = (Entity)iterator.next();
                double d1 = entity.func_387_e(this);
                if(d1 < d)
                {
                    d = d1;
                    entityendercrystal = (EntityEnderCrystal)entity;
                }
            } while(true);
            field_41013_bH = entityendercrystal;
        }
    }

    private void func_41007_az()
    {
    }

    private void func_41008_a(List p_41008_1_)
    {
        double d = (field_40171_aq.field_601_au.field_1698_a + field_40171_aq.field_601_au.field_1703_d) / 2D;
        double d1 = (field_40171_aq.field_601_au.field_1704_c + field_40171_aq.field_601_au.field_1701_f) / 2D;
        Iterator iterator = p_41008_1_.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Entity entity = (Entity)iterator.next();
            if(entity instanceof EntityLiving)
            {
                double d2 = entity.field_611_ak - d;
                double d3 = entity.field_609_am - d1;
                double d4 = d2 * d2 + d3 * d3;
                entity.func_348_f((d2 / d4) * 4D, 0.20000000298023224D, (d3 / d4) * 4D);
            }
        } while(true);
    }

    private void func_41009_b(List p_41009_1_)
    {
        for(int i = 0; i < p_41009_1_.size(); i++)
        {
            Entity entity = (Entity)p_41009_1_.get(i);
            if(entity instanceof EntityLiving)
            {
                entity.func_396_a(DamageSource.func_35525_a(this), 10);
            }
        }

    }

    private void func_41006_aA()
    {
        field_40163_ay = false;
        if(field_9312_bd.nextInt(2) == 0 && field_615_ag.field_1040_k.size() > 0)
        {
            field_40179_aC = (Entity)field_615_ag.field_1040_k.get(field_9312_bd.nextInt(field_615_ag.field_1040_k.size()));
        } else
        {
            boolean flag = false;
            do
            {
                field_40167_a = 0.0D;
                field_40165_b = 70F + field_9312_bd.nextFloat() * 50F;
                field_40166_c = 0.0D;
                field_40167_a += field_9312_bd.nextFloat() * 120F - 60F;
                field_40166_c += field_9312_bd.nextFloat() * 120F - 60F;
                double d = field_611_ak - field_40167_a;
                double d1 = field_610_al - field_40165_b;
                double d2 = field_609_am - field_40166_c;
                flag = d * d + d1 * d1 + d2 * d2 > 100D;
            } while(!flag);
            field_40179_aC = null;
        }
    }

    private float func_40159_b(double p_40159_1_)
    {
        for(; p_40159_1_ >= 180D; p_40159_1_ -= 360D) { }
        for(; p_40159_1_ < -180D; p_40159_1_ += 360D) { }
        return (float)p_40159_1_;
    }

    private boolean func_40158_a(AxisAlignedBB p_40158_1_)
    {
        int i = MathHelper.func_1108_b(p_40158_1_.field_1698_a);
        int j = MathHelper.func_1108_b(p_40158_1_.field_1697_b);
        int k = MathHelper.func_1108_b(p_40158_1_.field_1704_c);
        int l = MathHelper.func_1108_b(p_40158_1_.field_1703_d);
        int i1 = MathHelper.func_1108_b(p_40158_1_.field_1702_e);
        int j1 = MathHelper.func_1108_b(p_40158_1_.field_1701_f);
        boolean flag = false;
        boolean flag1 = false;
        for(int k1 = i; k1 <= l; k1++)
        {
            for(int l1 = j; l1 <= i1; l1++)
            {
                for(int i2 = k; i2 <= j1; i2++)
                {
                    int j2 = field_615_ag.func_600_a(k1, l1, i2);
                    if(j2 == 0)
                    {
                        continue;
                    }
                    if(j2 == Block.field_405_aq.field_376_bc || j2 == Block.field_40203_bK.field_376_bc || j2 == Block.field_403_A.field_376_bc)
                    {
                        flag = true;
                    } else
                    {
                        flag1 = true;
                        field_615_ag.func_690_d(k1, l1, i2, 0);
                    }
                }

            }

        }

        if(flag1)
        {
            double d = p_40158_1_.field_1698_a + (p_40158_1_.field_1703_d - p_40158_1_.field_1698_a) * (double)field_9312_bd.nextFloat();
            double d1 = p_40158_1_.field_1697_b + (p_40158_1_.field_1702_e - p_40158_1_.field_1697_b) * (double)field_9312_bd.nextFloat();
            double d2 = p_40158_1_.field_1704_c + (p_40158_1_.field_1701_f - p_40158_1_.field_1704_c) * (double)field_9312_bd.nextFloat();
            field_615_ag.func_694_a("largeexplode", d, d1, d2, 0.0D, 0.0D, 0.0D);
        }
        return flag;
    }

    public boolean func_40156_a(EntityDragonPart p_40156_1_, DamageSource p_40156_2_, int p_40156_3_)
    {
        if(p_40156_1_ != field_40177_ap)
        {
            p_40156_3_ = p_40156_3_ / 4 + 1;
        }
        float f = (field_605_aq * 3.141593F) / 180F;
        float f1 = MathHelper.func_1106_a(f);
        float f2 = MathHelper.func_1114_b(f);
        field_40167_a = field_611_ak + (double)(f1 * 5F) + (double)((field_9312_bd.nextFloat() - 0.5F) * 2.0F);
        field_40165_b = field_610_al + (double)(field_9312_bd.nextFloat() * 3F) + 1.0D;
        field_40166_c = (field_609_am - (double)(f2 * 5F)) + (double)((field_9312_bd.nextFloat() - 0.5F) * 2.0F);
        field_40179_aC = null;
        if((p_40156_2_.func_35532_a() instanceof EntityPlayer) || p_40156_2_ == DamageSource.field_35548_k)
        {
            func_40155_e(p_40156_2_, p_40156_3_);
        }
        return true;
    }

    protected void func_40120_m_()
    {
        field_40178_aA++;
        if(field_40178_aA >= 180 && field_40178_aA <= 200)
        {
            float f = (field_9312_bd.nextFloat() - 0.5F) * 8F;
            float f1 = (field_9312_bd.nextFloat() - 0.5F) * 4F;
            float f2 = (field_9312_bd.nextFloat() - 0.5F) * 8F;
            field_615_ag.func_694_a("hugeexplosion", field_611_ak + (double)f, field_610_al + 2D + (double)f1, field_609_am + (double)f2, 0.0D, 0.0D, 0.0D);
        }
        if(!field_615_ag.field_1026_y && field_40178_aA > 150 && field_40178_aA % 5 == 0)
        {
            for(int i = 1000; i > 0;)
            {
                int k = EntityXPOrb.func_35121_b(i);
                i -= k;
                field_615_ag.func_674_a(new EntityXPOrb(field_615_ag, field_611_ak, field_610_al, field_609_am, k));
            }

        }
        func_349_c(0.0D, 0.10000000149011612D, 0.0D);
        field_735_n = field_605_aq += 20F;
        if(field_40178_aA == 200)
        {
            for(int j = 10000; j > 0;)
            {
                int l = EntityXPOrb.func_35121_b(j);
                j -= l;
                field_615_ag.func_674_a(new EntityXPOrb(field_615_ag, field_611_ak, field_610_al, field_609_am, l));
            }

            func_41012_a(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_609_am));
            func_6392_F();
            func_395_F();
        }
    }

    private void func_41012_a(int p_41012_1_, int p_41012_2_)
    {
        byte byte0 = 64;
        BlockEndPortal.field_41051_a = true;
        int i = 4;
        for(int j = byte0 - 1; j <= byte0 + 32; j++)
        {
            for(int k = p_41012_1_ - i; k <= p_41012_1_ + i; k++)
            {
                for(int l = p_41012_2_ - i; l <= p_41012_2_ + i; l++)
                {
                    double d = k - p_41012_1_;
                    double d1 = l - p_41012_2_;
                    double d2 = MathHelper.func_1109_a(d * d + d1 * d1);
                    if(d2 > (double)i - 0.5D)
                    {
                        continue;
                    }
                    if(j < byte0)
                    {
                        if(d2 <= (double)(i - 1) - 0.5D)
                        {
                            field_615_ag.func_690_d(k, j, l, Block.field_403_A.field_376_bc);
                        }
                        continue;
                    }
                    if(j > byte0)
                    {
                        field_615_ag.func_690_d(k, j, l, 0);
                        continue;
                    }
                    if(d2 > (double)(i - 1) - 0.5D)
                    {
                        field_615_ag.func_690_d(k, j, l, Block.field_403_A.field_376_bc);
                    } else
                    {
                        field_615_ag.func_690_d(k, j, l, Block.field_40209_bI.field_376_bc);
                    }
                }

            }

        }

        field_615_ag.func_690_d(p_41012_1_, byte0 + 0, p_41012_2_, Block.field_403_A.field_376_bc);
        field_615_ag.func_690_d(p_41012_1_, byte0 + 1, p_41012_2_, Block.field_403_A.field_376_bc);
        field_615_ag.func_690_d(p_41012_1_, byte0 + 2, p_41012_2_, Block.field_403_A.field_376_bc);
        field_615_ag.func_690_d(p_41012_1_ - 1, byte0 + 2, p_41012_2_, Block.field_404_ar.field_376_bc);
        field_615_ag.func_690_d(p_41012_1_ + 1, byte0 + 2, p_41012_2_, Block.field_404_ar.field_376_bc);
        field_615_ag.func_690_d(p_41012_1_, byte0 + 2, p_41012_2_ - 1, Block.field_404_ar.field_376_bc);
        field_615_ag.func_690_d(p_41012_1_, byte0 + 2, p_41012_2_ + 1, Block.field_404_ar.field_376_bc);
        field_615_ag.func_690_d(p_41012_1_, byte0 + 3, p_41012_2_, Block.field_403_A.field_376_bc);
        field_615_ag.func_690_d(p_41012_1_, byte0 + 4, p_41012_2_, Block.field_41050_bK.field_376_bc);
        BlockEndPortal.field_41051_a = false;
    }

    protected void func_27021_X()
    {
    }

    public Entity[] func_40048_X()
    {
        return field_40176_ao;
    }

    public boolean func_401_c_()
    {
        return false;
    }

    public int func_41010_ax()
    {
        return field_21064_bx.func_25115_b(16);
    }
}
