// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityFlying, IMob, DamageSource, EntityPlayer, 
//            AchievementList, DataWatcher, World, MathHelper, 
//            Entity, AxisAlignedBB, EntityFireball, Vec3D, 
//            Item

public class EntityGhast extends EntityFlying
    implements IMob
{

    public int field_20901_a;
    public double field_20900_b;
    public double field_20902_c;
    public double field_4126_d;
    private Entity field_4123_g;
    private int field_4122_h;
    public int field_4125_e;
    public int field_4124_f;

    public EntityGhast(World p_i626_1_)
    {
        super(p_i626_1_);
        field_20901_a = 0;
        field_4123_g = null;
        field_4122_h = 0;
        field_4125_e = 0;
        field_4124_f = 0;
        field_9357_z = "/mob/ghast.png";
        func_371_a(4F, 4F);
        field_9304_bm = true;
        field_35171_bJ = 5;
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        if("fireball".equals(p_396_1_.func_40545_l()) && (p_396_1_.func_35532_a() instanceof EntityPlayer))
        {
            super.func_396_a(p_396_1_, 1000);
            ((EntityPlayer)p_396_1_.func_35532_a()).func_27026_a(AchievementList.field_40466_y);
            return true;
        } else
        {
            return super.func_396_a(p_396_1_, p_396_2_);
        }
    }

    protected void func_21057_b()
    {
        super.func_21057_b();
        field_21064_bx.func_21124_a(16, Byte.valueOf((byte)0));
    }

    public int func_40117_c()
    {
        return 10;
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        byte byte0 = field_21064_bx.func_21130_a(16);
        field_9357_z = byte0 != 1 ? "/mob/ghast.png" : "/mob/ghast_fire.png";
    }

    protected void func_418_b_()
    {
        if(!field_615_ag.field_1026_y && field_615_ag.field_1039_l == 0)
        {
            func_395_F();
        }
        func_27021_X();
        field_4125_e = field_4124_f;
        double d = field_20900_b - field_611_ak;
        double d1 = field_20902_c - field_610_al;
        double d2 = field_4126_d - field_609_am;
        double d3 = MathHelper.func_1109_a(d * d + d1 * d1 + d2 * d2);
        if(d3 < 1.0D || d3 > 60D)
        {
            field_20900_b = field_611_ak + (double)((field_9312_bd.nextFloat() * 2.0F - 1.0F) * 16F);
            field_20902_c = field_610_al + (double)((field_9312_bd.nextFloat() * 2.0F - 1.0F) * 16F);
            field_4126_d = field_609_am + (double)((field_9312_bd.nextFloat() * 2.0F - 1.0F) * 16F);
        }
        if(field_20901_a-- <= 0)
        {
            field_20901_a += field_9312_bd.nextInt(5) + 2;
            if(func_27023_a(field_20900_b, field_20902_c, field_4126_d, d3))
            {
                field_608_an += (d / d3) * 0.10000000000000001D;
                field_607_ao += (d1 / d3) * 0.10000000000000001D;
                field_606_ap += (d2 / d3) * 0.10000000000000001D;
            } else
            {
                field_20900_b = field_611_ak;
                field_20902_c = field_610_al;
                field_4126_d = field_609_am;
            }
        }
        if(field_4123_g != null && field_4123_g.field_646_aA)
        {
            field_4123_g = null;
        }
        if(field_4123_g == null || field_4122_h-- <= 0)
        {
            field_4123_g = field_615_ag.func_40480_b(this, 100D);
            if(field_4123_g != null)
            {
                field_4122_h = 20;
            }
        }
        double d4 = 64D;
        if(field_4123_g != null && field_4123_g.func_387_e(this) < d4 * d4)
        {
            double d5 = field_4123_g.field_611_ak - field_611_ak;
            double d6 = (field_4123_g.field_601_au.field_1697_b + (double)(field_4123_g.field_643_aD / 2.0F)) - (field_610_al + (double)(field_643_aD / 2.0F));
            double d7 = field_4123_g.field_609_am - field_609_am;
            field_735_n = field_605_aq = (-(float)Math.atan2(d5, d7) * 180F) / 3.141593F;
            if(func_420_c(field_4123_g))
            {
                if(field_4124_f == 10)
                {
                    field_615_ag.func_28107_a(null, 1007, (int)field_611_ak, (int)field_610_al, (int)field_609_am, 0);
                }
                field_4124_f++;
                if(field_4124_f == 20)
                {
                    field_615_ag.func_28107_a(null, 1008, (int)field_611_ak, (int)field_610_al, (int)field_609_am, 0);
                    EntityFireball entityfireball = new EntityFireball(field_615_ag, this, d5, d6, d7);
                    double d8 = 4D;
                    Vec3D vec3d = func_430_f(1.0F);
                    entityfireball.field_611_ak = field_611_ak + vec3d.field_1776_a * d8;
                    entityfireball.field_610_al = field_610_al + (double)(field_643_aD / 2.0F) + 0.5D;
                    entityfireball.field_609_am = field_609_am + vec3d.field_1779_c * d8;
                    field_615_ag.func_674_a(entityfireball);
                    field_4124_f = -40;
                }
            } else
            if(field_4124_f > 0)
            {
                field_4124_f--;
            }
        } else
        {
            field_735_n = field_605_aq = (-(float)Math.atan2(field_608_an, field_606_ap) * 180F) / 3.141593F;
            if(field_4124_f > 0)
            {
                field_4124_f--;
            }
        }
        if(!field_615_ag.field_1026_y)
        {
            byte byte0 = field_21064_bx.func_21130_a(16);
            byte byte1 = (byte)(field_4124_f <= 10 ? 0 : 1);
            if(byte0 != byte1)
            {
                field_21064_bx.func_21129_b(16, Byte.valueOf(byte1));
            }
        }
    }

    private boolean func_27023_a(double p_27023_1_, double p_27023_3_, double p_27023_5_, double p_27023_7_)
    {
        double d = (field_20900_b - field_611_ak) / p_27023_7_;
        double d1 = (field_20902_c - field_610_al) / p_27023_7_;
        double d2 = (field_4126_d - field_609_am) / p_27023_7_;
        AxisAlignedBB axisalignedbb = field_601_au.func_1160_c();
        for(int i = 1; (double)i < p_27023_7_; i++)
        {
            axisalignedbb.func_1174_d(d, d1, d2);
            if(field_615_ag.func_697_a(this, axisalignedbb).size() > 0)
            {
                return false;
            }
        }

        return true;
    }

    protected String func_6389_d()
    {
        return "mob.ghast.moan";
    }

    protected String func_6394_f_()
    {
        return "mob.ghast.scream";
    }

    protected String func_6390_f()
    {
        return "mob.ghast.death";
    }

    protected int func_422_g()
    {
        return Item.field_250_K.field_291_aS;
    }

    protected void func_21066_o(boolean p_21066_1_, int p_21066_2_)
    {
        int i = field_9312_bd.nextInt(2) + field_9312_bd.nextInt(1 + p_21066_2_);
        for(int j = 0; j < i; j++)
        {
            func_367_b(Item.field_40418_bp.field_291_aS, 1);
        }

        i = field_9312_bd.nextInt(3) + field_9312_bd.nextInt(1 + p_21066_2_);
        for(int k = 0; k < i; k++)
        {
            func_367_b(Item.field_250_K.field_291_aS, 1);
        }

    }

    protected float func_6393_h()
    {
        return 10F;
    }

    public boolean func_433_a()
    {
        return field_9312_bd.nextInt(20) == 0 && super.func_433_a() && field_615_ag.field_1039_l > 0;
    }

    public int func_6391_i()
    {
        return 1;
    }
}
