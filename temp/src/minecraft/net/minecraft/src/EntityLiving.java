// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            Entity, EntityAITasks, ChunkCoordinates, EntityLookHelper, 
//            EntityMoveHelper, EntityJumpHelper, EntityBodyHelper, PathNavigate, 
//            EntitySenses, EntityCreeper, EntityGhast, MathHelper, 
//            DataWatcher, Vec3D, World, Profiler, 
//            DamageSource, Material, Potion, EntityXPOrb, 
//            EntityPlayer, EntityWolf, PotionEffect, EnchantmentHelper, 
//            Block, StepSound, AxisAlignedBB, Reflector, 
//            NBTTagCompound, NBTTagList, ItemStack, PotionHelper, 
//            EnumCreatureAttribute, Item, MovingObjectPosition

public abstract class EntityLiving extends Entity
{

    public int field_9366_o;
    public float field_9365_p;
    public float field_9363_r;
    public float field_735_n;
    public float field_734_o;
    public float field_46015_bf;
    public float field_46016_bg;
    protected float field_9362_u;
    protected float field_9361_v;
    protected float field_9360_w;
    protected float field_9359_x;
    protected boolean field_9358_y;
    protected String field_9357_z;
    protected boolean field_9355_A;
    protected float field_9353_B;
    protected String field_9351_C;
    protected float field_9349_D;
    protected int field_9347_E;
    protected float field_9345_F;
    public float field_35169_bv;
    public float field_35168_bw;
    public float field_9341_H;
    public float field_9339_I;
    protected int field_9337_J;
    public int field_9335_K;
    public int field_40129_bA;
    private int field_4121_a;
    public int field_715_G;
    public int field_9332_M;
    public float field_9331_N;
    public int field_712_J;
    public int field_9330_P;
    public float field_9329_Q;
    public float field_9328_R;
    protected boolean field_9327_S;
    protected int field_35171_bJ;
    public int field_9326_T;
    public float field_9325_U;
    public float field_705_Q;
    public float field_704_R;
    public float field_703_S;
    protected EntityPlayer field_34904_b;
    protected int field_34905_c;
    private EntityLiving field_46020_bQ;
    private int field_48103_c;
    private EntityLiving field_48102_d;
    public int field_35172_bP;
    public int field_35173_bQ;
    protected HashMap field_35170_bR;
    private boolean field_39001_b;
    private int field_39002_c;
    private EntityLookHelper field_46017_d;
    private EntityMoveHelper field_46018_e;
    private EntityJumpHelper field_46021_am;
    private EntityBodyHelper field_48108_aq;
    private PathNavigate field_48107_ar;
    protected EntityAITasks field_46019_bU;
    protected EntityAITasks field_48105_bU;
    private EntityLiving field_48106_as;
    private EntitySenses field_48104_at;
    private float field_48111_au;
    private ChunkCoordinates field_48110_av;
    private float field_48109_aw;
    protected int field_9324_Y;
    protected double field_9323_Z;
    protected double field_9356_aa;
    protected double field_9354_ab;
    protected double field_9352_ac;
    protected double field_9350_ad;
    float field_9348_ae;
    protected int field_9346_af;
    protected int field_9344_ag;
    protected float field_9342_ah;
    protected float field_9340_ai;
    protected float field_9338_aj;
    protected boolean field_9336_ak;
    protected float field_9334_al;
    protected float field_9333_am;
    private int field_39003_d;
    private Entity field_4120_b;
    protected int field_4127_c;
    public int persistentId;

    public EntityLiving(World p_i19_1_)
    {
        super(p_i19_1_);
        persistentId = field_9312_bd.nextInt(0x7fffffff);
        field_9366_o = 20;
        field_735_n = 0.0F;
        field_734_o = 0.0F;
        field_46015_bf = 0.0F;
        field_46016_bg = 0.0F;
        field_9358_y = true;
        field_9357_z = "/mob/char.png";
        field_9355_A = true;
        field_9353_B = 0.0F;
        field_9351_C = null;
        field_9349_D = 1.0F;
        field_9347_E = 0;
        field_9345_F = 0.0F;
        field_35169_bv = 0.1F;
        field_35168_bw = 0.02F;
        field_9331_N = 0.0F;
        field_712_J = 0;
        field_9330_P = 0;
        field_9327_S = false;
        field_9326_T = -1;
        field_9325_U = (float)(Math.random() * 0.89999997615814209D + 0.10000000149011612D);
        field_34904_b = null;
        field_34905_c = 0;
        field_46020_bQ = null;
        field_48103_c = 0;
        field_48102_d = null;
        field_35172_bP = 0;
        field_35173_bQ = 0;
        field_35170_bR = new HashMap();
        field_39001_b = true;
        field_46019_bU = new EntityAITasks();
        field_48105_bU = new EntityAITasks();
        field_48110_av = new ChunkCoordinates(0, 0, 0);
        field_48109_aw = -1F;
        field_9348_ae = 0.0F;
        field_9346_af = 0;
        field_9344_ag = 0;
        field_9336_ak = false;
        field_9334_al = 0.0F;
        field_9333_am = 0.7F;
        field_39003_d = 0;
        field_4127_c = 0;
        field_9337_J = func_40117_c();
        field_618_ad = true;
        field_46017_d = new EntityLookHelper(this);
        field_46018_e = new EntityMoveHelper(this);
        field_46021_am = new EntityJumpHelper(this);
        field_48108_aq = new EntityBodyHelper(this);
        field_48107_ar = new PathNavigate(this, p_i19_1_, 16F);
        field_48104_at = new EntitySenses(this);
        field_9363_r = (float)(Math.random() + 1.0D) * 0.01F;
        func_347_a(field_611_ak, field_610_al, field_609_am);
        field_9365_p = (float)Math.random() * 12398F;
        field_605_aq = (float)(Math.random() * 3.1415926535897931D * 2D);
        field_46015_bf = field_605_aq;
        field_9286_aZ = 0.5F;
    }

    public EntityLookHelper func_46008_aG()
    {
        return field_46017_d;
    }

    public EntityMoveHelper func_46009_aH()
    {
        return field_46018_e;
    }

    public EntityJumpHelper func_46005_aI()
    {
        return field_46021_am;
    }

    public PathNavigate func_48084_aL()
    {
        return field_48107_ar;
    }

    public EntitySenses func_48090_aM()
    {
        return field_48104_at;
    }

    public Random func_46004_aK()
    {
        return field_9312_bd;
    }

    public EntityLiving func_46007_aL()
    {
        return field_46020_bQ;
    }

    public EntityLiving func_48088_aP()
    {
        return field_48102_d;
    }

    public void func_48089_l(Entity p_48089_1_)
    {
        if(p_48089_1_ instanceof EntityLiving)
        {
            field_48102_d = (EntityLiving)p_48089_1_;
        }
    }

    public int func_46011_aM()
    {
        return field_9344_ag;
    }

    public void func_48079_f(float p_48079_1_)
    {
        field_46015_bf = p_48079_1_;
    }

    public float func_48101_aR()
    {
        return field_48111_au;
    }

    public void func_48098_g(float p_48098_1_)
    {
        field_48111_au = p_48098_1_;
        func_46010_f(p_48098_1_);
    }

    public boolean func_35175_b(Entity p_35175_1_)
    {
        func_48089_l(p_35175_1_);
        return false;
    }

    public EntityLiving func_48094_aS()
    {
        return field_48106_as;
    }

    public void func_48092_c(EntityLiving p_48092_1_)
    {
        field_48106_as = p_48092_1_;
    }

    public boolean func_48100_a(Class p_48100_1_)
    {
        return (net.minecraft.src.EntityCreeper.class) != p_48100_1_ && (net.minecraft.src.EntityGhast.class) != p_48100_1_;
    }

    public void func_48095_u()
    {
    }

    public boolean func_48093_aT()
    {
        return func_48096_f(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al), MathHelper.func_1108_b(field_609_am));
    }

    public boolean func_48096_f(int p_48096_1_, int p_48096_2_, int p_48096_3_)
    {
        if(field_48109_aw == -1F)
        {
            return true;
        } else
        {
            return field_48110_av.func_48655_c(p_48096_1_, p_48096_2_, p_48096_3_) < field_48109_aw * field_48109_aw;
        }
    }

    public void func_48082_b(int p_48082_1_, int p_48082_2_, int p_48082_3_, int p_48082_4_)
    {
        field_48110_av.func_48656_a(p_48082_1_, p_48082_2_, p_48082_3_);
        field_48109_aw = p_48082_4_;
    }

    public ChunkCoordinates func_48091_aU()
    {
        return field_48110_av;
    }

    public float func_48099_aV()
    {
        return field_48109_aw;
    }

    public void func_48083_aW()
    {
        field_48109_aw = -1F;
    }

    public boolean func_48087_aX()
    {
        return field_48109_aw != -1F;
    }

    public void func_48086_a(EntityLiving p_48086_1_)
    {
        field_46020_bQ = p_48086_1_;
        field_48103_c = field_46020_bQ != null ? 60 : 0;
    }

    protected void func_21057_b()
    {
        field_21064_bx.func_21124_a(8, Integer.valueOf(field_39002_c));
    }

    public boolean func_420_c(Entity p_420_1_)
    {
        return field_615_ag.func_645_a(Vec3D.func_1248_b(field_611_ak, field_610_al + (double)func_373_s(), field_609_am), Vec3D.func_1248_b(p_420_1_.field_611_ak, p_420_1_.field_610_al + (double)p_420_1_.func_373_s(), p_420_1_.field_609_am)) == null;
    }

    public String func_6376_z()
    {
        return field_9357_z;
    }

    public boolean func_401_c_()
    {
        return !field_646_aA;
    }

    public boolean func_385_d_()
    {
        return !field_646_aA;
    }

    public float func_373_s()
    {
        return field_643_aD * 0.85F;
    }

    public int func_421_b()
    {
        return 80;
    }

    public void func_22050_O()
    {
        String s = func_6389_d();
        if(s != null)
        {
            field_615_ag.func_623_a(this, s, func_6393_h(), func_40123_ac());
        }
    }

    public void func_391_y()
    {
        field_9341_H = field_9339_I;
        super.func_391_y();
        Profiler.func_40663_a("mobBaseTick");
        if(func_354_B() && field_9312_bd.nextInt(1000) < field_4121_a++)
        {
            field_4121_a = -func_421_b();
            func_22050_O();
        }
        if(func_354_B() && func_345_I())
        {
            if(func_396_a(DamageSource.field_35538_d, 1));
        }
        if(func_40047_D() || field_615_ag.field_1026_y)
        {
            func_40045_B();
        }
        if(func_354_B() && func_393_a(Material.field_1332_f) && !func_21067_c_() && !field_35170_bR.containsKey(Integer.valueOf(Potion.field_35680_o.field_35670_H)))
        {
            func_41003_g(func_40116_f(func_41001_Z()));
            if(func_41001_Z() == -20)
            {
                func_41003_g(0);
                for(int i = 0; i < 8; i++)
                {
                    float f = field_9312_bd.nextFloat() - field_9312_bd.nextFloat();
                    float f1 = field_9312_bd.nextFloat() - field_9312_bd.nextFloat();
                    float f2 = field_9312_bd.nextFloat() - field_9312_bd.nextFloat();
                    field_615_ag.func_694_a("bubble", field_611_ak + (double)f, field_610_al + (double)f1, field_609_am + (double)f2, field_608_an, field_607_ao, field_606_ap);
                }

                func_396_a(DamageSource.field_35539_e, 2);
            }
            func_40045_B();
        } else
        {
            func_41003_g(300);
        }
        field_9329_Q = field_9328_R;
        if(field_9330_P > 0)
        {
            field_9330_P--;
        }
        if(field_715_G > 0)
        {
            field_715_G--;
        }
        if(field_9306_bj > 0)
        {
            field_9306_bj--;
        }
        if(field_9337_J <= 0)
        {
            func_40120_m_();
        }
        if(field_34905_c > 0)
        {
            field_34905_c--;
        } else
        {
            field_34904_b = null;
        }
        if(field_48102_d != null && !field_48102_d.func_354_B())
        {
            field_48102_d = null;
        }
        if(field_46020_bQ != null)
        {
            if(!field_46020_bQ.func_354_B())
            {
                func_48086_a(null);
            } else
            if(field_48103_c > 0)
            {
                field_48103_c--;
            } else
            {
                func_48086_a(null);
            }
        }
        func_36000_g();
        field_9359_x = field_9360_w;
        field_734_o = field_735_n;
        field_46016_bg = field_46015_bf;
        field_603_as = field_605_aq;
        field_602_at = field_604_ar;
        Profiler.func_40662_b();
    }

    protected void func_40120_m_()
    {
        field_712_J++;
        if(field_712_J == 20)
        {
            if(!field_615_ag.field_1026_y && (field_34905_c > 0 || func_35163_av()) && !func_40127_l())
            {
                for(int i = func_36001_a(field_34904_b); i > 0;)
                {
                    int k = EntityXPOrb.func_35121_b(i);
                    i -= k;
                    field_615_ag.func_674_a(new EntityXPOrb(field_615_ag, field_611_ak, field_610_al, field_609_am, k));
                }

            }
            func_6392_F();
            func_395_F();
            for(int j = 0; j < 20; j++)
            {
                double d = field_9312_bd.nextGaussian() * 0.02D;
                double d1 = field_9312_bd.nextGaussian() * 0.02D;
                double d2 = field_9312_bd.nextGaussian() * 0.02D;
                field_615_ag.func_694_a("explode", (field_611_ak + (double)(field_9312_bd.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC, field_610_al + (double)(field_9312_bd.nextFloat() * field_643_aD), (field_609_am + (double)(field_9312_bd.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC, d, d1, d2);
            }

        }
    }

    protected int func_40116_f(int p_40116_1_)
    {
        return p_40116_1_ - 1;
    }

    protected int func_36001_a(EntityPlayer p_36001_1_)
    {
        return field_35171_bJ;
    }

    protected boolean func_35163_av()
    {
        return false;
    }

    public void func_415_z()
    {
        for(int i = 0; i < 20; i++)
        {
            double d = field_9312_bd.nextGaussian() * 0.02D;
            double d1 = field_9312_bd.nextGaussian() * 0.02D;
            double d2 = field_9312_bd.nextGaussian() * 0.02D;
            double d3 = 10D;
            field_615_ag.func_694_a("explode", (field_611_ak + (double)(field_9312_bd.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC - d * d3, (field_610_al + (double)(field_9312_bd.nextFloat() * field_643_aD)) - d1 * d3, (field_609_am + (double)(field_9312_bd.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC - d2 * d3, d, d1, d2);
        }

    }

    public void func_350_p()
    {
        super.func_350_p();
        field_9362_u = field_9361_v;
        field_9361_v = 0.0F;
        field_9288_aU = 0.0F;
    }

    public void func_378_a(double p_378_1_, double p_378_3_, double p_378_5_, float p_378_7_, 
            float p_378_8_, int p_378_9_)
    {
        field_9292_aO = 0.0F;
        field_9323_Z = p_378_1_;
        field_9356_aa = p_378_3_;
        field_9354_ab = p_378_5_;
        field_9352_ac = p_378_7_;
        field_9350_ad = p_378_8_;
        field_9324_Y = p_378_9_;
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        if(field_35172_bP > 0)
        {
            if(field_35173_bQ <= 0)
            {
                field_35173_bQ = 60;
            }
            field_35173_bQ--;
            if(field_35173_bQ <= 0)
            {
                field_35172_bP--;
            }
        }
        func_425_j();
        double d = field_611_ak - field_9285_at;
        double d1 = field_609_am - field_9283_av;
        float f = MathHelper.func_1109_a(d * d + d1 * d1);
        float f1 = field_735_n;
        float f2 = 0.0F;
        field_9362_u = field_9361_v;
        float f3 = 0.0F;
        if(f > 0.05F)
        {
            f3 = 1.0F;
            f2 = f * 3F;
            f1 = ((float)Math.atan2(d1, d) * 180F) / 3.141593F - 90F;
        }
        if(field_9339_I > 0.0F)
        {
            f1 = field_605_aq;
        }
        if(!field_9298_aH)
        {
            f3 = 0.0F;
        }
        field_9361_v = field_9361_v + (f3 - field_9361_v) * 0.3F;
        if(func_46006_aR())
        {
            field_48108_aq.func_48650_a();
        } else
        {
            float f4;
            for(f4 = f1 - field_735_n; f4 < -180F; f4 += 360F) { }
            for(; f4 >= 180F; f4 -= 360F) { }
            field_735_n += f4 * 0.3F;
            float f5;
            for(f5 = field_605_aq - field_735_n; f5 < -180F; f5 += 360F) { }
            for(; f5 >= 180F; f5 -= 360F) { }
            boolean flag = f5 < -90F || f5 >= 90F;
            if(f5 < -75F)
            {
                f5 = -75F;
            }
            if(f5 >= 75F)
            {
                f5 = 75F;
            }
            field_735_n = field_605_aq - f5;
            if(f5 * f5 > 2500F)
            {
                field_735_n += f5 * 0.2F;
            }
            if(flag)
            {
                f2 *= -1F;
            }
        }
        for(; field_605_aq - field_603_as < -180F; field_603_as -= 360F) { }
        for(; field_605_aq - field_603_as >= 180F; field_603_as += 360F) { }
        for(; field_735_n - field_734_o < -180F; field_734_o -= 360F) { }
        for(; field_735_n - field_734_o >= 180F; field_734_o += 360F) { }
        for(; field_604_ar - field_602_at < -180F; field_602_at -= 360F) { }
        for(; field_604_ar - field_602_at >= 180F; field_602_at += 360F) { }
        for(; field_46015_bf - field_46016_bg < -180F; field_46016_bg -= 360F) { }
        for(; field_46015_bf - field_46016_bg >= 180F; field_46016_bg += 360F) { }
        field_9360_w += f2;
    }

    protected void func_371_a(float p_371_1_, float p_371_2_)
    {
        super.func_371_a(p_371_1_, p_371_2_);
    }

    public void func_432_b(int p_432_1_)
    {
        if(field_9337_J <= 0)
        {
            return;
        }
        field_9337_J += p_432_1_;
        if(field_9337_J > func_40117_c())
        {
            field_9337_J = func_40117_c();
        }
        field_9306_bj = field_9366_o / 2;
    }

    public abstract int func_40117_c();

    public int func_40114_aH()
    {
        return field_9337_J;
    }

    public void func_40121_k(int p_40121_1_)
    {
        field_9337_J = p_40121_1_;
        if(p_40121_1_ > func_40117_c())
        {
            p_40121_1_ = func_40117_c();
        }
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        if(field_615_ag.field_1026_y)
        {
            return false;
        }
        field_9344_ag = 0;
        if(field_9337_J <= 0)
        {
            return false;
        }
        if(p_396_1_.func_40543_k() && func_35160_a(Potion.field_35679_n))
        {
            return false;
        }
        field_704_R = 1.5F;
        boolean flag = true;
        if((float)field_9306_bj > (float)field_9366_o / 2.0F)
        {
            if(p_396_2_ <= field_9346_af)
            {
                return false;
            }
            func_4044_a(p_396_1_, p_396_2_ - field_9346_af);
            field_9346_af = p_396_2_;
            flag = false;
        } else
        {
            field_9346_af = p_396_2_;
            field_9335_K = field_9337_J;
            field_9306_bj = field_9366_o;
            func_4044_a(p_396_1_, p_396_2_);
            field_715_G = field_9332_M = 10;
        }
        field_9331_N = 0.0F;
        Entity entity = p_396_1_.func_35532_a();
        if(entity != null)
        {
            if(entity instanceof EntityLiving)
            {
                func_48086_a((EntityLiving)entity);
            }
            if(entity instanceof EntityPlayer)
            {
                field_34905_c = 60;
                field_34904_b = (EntityPlayer)entity;
            } else
            if(entity instanceof EntityWolf)
            {
                EntityWolf entitywolf = (EntityWolf)entity;
                if(entitywolf.func_48139_F_())
                {
                    field_34905_c = 60;
                    field_34904_b = null;
                }
            }
        }
        if(flag)
        {
            field_615_ag.func_9425_a(this, (byte)2);
            func_9281_M();
            if(entity != null)
            {
                double d = entity.field_611_ak - field_611_ak;
                double d1;
                for(d1 = entity.field_609_am - field_609_am; d * d + d1 * d1 < 0.0001D; d1 = (Math.random() - Math.random()) * 0.01D)
                {
                    d = (Math.random() - Math.random()) * 0.01D;
                }

                field_9331_N = (float)((Math.atan2(d1, d) * 180D) / 3.1415926535897931D) - field_605_aq;
                func_434_a(entity, p_396_2_, d, d1);
            } else
            {
                field_9331_N = (int)(Math.random() * 2D) * 180;
            }
        }
        if(field_9337_J <= 0)
        {
            if(flag)
            {
                field_615_ag.func_623_a(this, func_6390_f(), func_6393_h(), func_40123_ac());
            }
            func_419_b(p_396_1_);
        } else
        if(flag)
        {
            field_615_ag.func_623_a(this, func_6394_f_(), func_6393_h(), func_40123_ac());
        }
        return true;
    }

    private float func_40123_ac()
    {
        if(func_40127_l())
        {
            return (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.2F + 1.5F;
        } else
        {
            return (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.2F + 1.0F;
        }
    }

    public void func_9280_g()
    {
        field_715_G = field_9332_M = 10;
        field_9331_N = 0.0F;
    }

    public int func_40119_ar()
    {
        return 0;
    }

    protected void func_40125_g(int i)
    {
    }

    protected int func_40115_d(DamageSource p_40115_1_, int p_40115_2_)
    {
        if(!p_40115_1_.func_35534_b())
        {
            int i = 25 - func_40119_ar();
            int j = p_40115_2_ * i + field_40129_bA;
            func_40125_g(p_40115_2_);
            p_40115_2_ = j / 25;
            field_40129_bA = j % 25;
        }
        return p_40115_2_;
    }

    protected int func_40128_b(DamageSource p_40128_1_, int p_40128_2_)
    {
        if(func_35160_a(Potion.field_35682_m))
        {
            int i = (func_35167_b(Potion.field_35682_m).func_35801_c() + 1) * 5;
            int j = 25 - i;
            int k = p_40128_2_ * j + field_40129_bA;
            p_40128_2_ = k / 25;
            field_40129_bA = k % 25;
        }
        return p_40128_2_;
    }

    protected void func_4044_a(DamageSource p_4044_1_, int p_4044_2_)
    {
        p_4044_2_ = func_40115_d(p_4044_1_, p_4044_2_);
        p_4044_2_ = func_40128_b(p_4044_1_, p_4044_2_);
        field_9337_J -= p_4044_2_;
    }

    protected float func_6393_h()
    {
        return 1.0F;
    }

    protected String func_6389_d()
    {
        return null;
    }

    protected String func_6394_f_()
    {
        return "damage.hurtflesh";
    }

    protected String func_6390_f()
    {
        return "damage.hurtflesh";
    }

    public void func_434_a(Entity p_434_1_, int p_434_2_, double p_434_3_, double p_434_5_)
    {
        field_35118_ao = true;
        float f = MathHelper.func_1109_a(p_434_3_ * p_434_3_ + p_434_5_ * p_434_5_);
        float f1 = 0.4F;
        field_608_an /= 2D;
        field_607_ao /= 2D;
        field_606_ap /= 2D;
        field_608_an -= (p_434_3_ / (double)f) * (double)f1;
        field_607_ao += f1;
        field_606_ap -= (p_434_5_ / (double)f) * (double)f1;
        if(field_607_ao > 0.40000000596046448D)
        {
            field_607_ao = 0.40000000596046448D;
        }
    }

    public void func_419_b(DamageSource p_419_1_)
    {
        Entity entity = p_419_1_.func_35532_a();
        if(field_9347_E >= 0 && entity != null)
        {
            entity.func_364_b(this, field_9347_E);
        }
        if(entity != null)
        {
            entity.func_27015_a(this);
        }
        field_9327_S = true;
        if(!field_615_ag.field_1026_y)
        {
            int i = 0;
            if(entity instanceof EntityPlayer)
            {
                i = EnchantmentHelper.func_40637_f(((EntityPlayer)entity).field_778_b);
            }
            if(!func_40127_l())
            {
                func_21066_o(field_34905_c > 0, i);
                if(field_34905_c > 0)
                {
                    int j = field_9312_bd.nextInt(200) - i;
                    if(j < 5)
                    {
                        func_48085_j_(j <= 0 ? 1 : 0);
                    }
                }
            }
        }
        field_615_ag.func_9425_a(this, (byte)3);
    }

    protected void func_48085_j_(int i)
    {
    }

    protected void func_21066_o(boolean p_21066_1_, int p_21066_2_)
    {
        int i = func_422_g();
        if(i > 0)
        {
            int j = field_9312_bd.nextInt(3);
            if(p_21066_2_ > 0)
            {
                j += field_9312_bd.nextInt(p_21066_2_ + 1);
            }
            for(int k = 0; k < j; k++)
            {
                func_367_b(i, 1);
            }

        }
    }

    protected int func_422_g()
    {
        return 0;
    }

    protected void func_400_c(float p_400_1_)
    {
        super.func_400_c(p_400_1_);
        int i = (int)Math.ceil(p_400_1_ - 3F);
        if(i > 0)
        {
            if(i > 4)
            {
                field_615_ag.func_623_a(this, "damage.fallbig", 1.0F, 1.0F);
            } else
            {
                field_615_ag.func_623_a(this, "damage.fallsmall", 1.0F, 1.0F);
            }
            func_396_a(DamageSource.field_35549_h, i);
            int j = field_615_ag.func_600_a(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al - 0.20000000298023224D - (double)field_9292_aO), MathHelper.func_1108_b(field_609_am));
            if(j > 0)
            {
                StepSound stepsound = Block.field_345_n[j].field_358_bl;
                field_615_ag.func_623_a(this, stepsound.func_1145_d(), stepsound.func_1147_b() * 0.5F, stepsound.func_1144_c() * 0.75F);
            }
        }
    }

    public void func_435_b(float p_435_1_, float p_435_2_)
    {
        if(func_27013_ag())
        {
            double d = field_610_al;
            func_351_a(p_435_1_, p_435_2_, func_46006_aR() ? 0.04F : 0.02F);
            func_349_c(field_608_an, field_607_ao, field_606_ap);
            field_608_an *= 0.80000001192092896D;
            field_607_ao *= 0.80000001192092896D;
            field_606_ap *= 0.80000001192092896D;
            field_607_ao -= 0.02D;
            if(field_9297_aI && func_403_b(field_608_an, ((field_607_ao + 0.60000002384185791D) - field_610_al) + d, field_606_ap))
            {
                field_607_ao = 0.30000001192092896D;
            }
        } else
        if(func_359_G())
        {
            double d1 = field_610_al;
            func_351_a(p_435_1_, p_435_2_, 0.02F);
            func_349_c(field_608_an, field_607_ao, field_606_ap);
            field_608_an *= 0.5D;
            field_607_ao *= 0.5D;
            field_606_ap *= 0.5D;
            field_607_ao -= 0.02D;
            if(field_9297_aI && func_403_b(field_608_an, ((field_607_ao + 0.60000002384185791D) - field_610_al) + d1, field_606_ap))
            {
                field_607_ao = 0.30000001192092896D;
            }
        } else
        {
            float f = 0.91F;
            if(field_9298_aH)
            {
                f = 0.5460001F;
                int i = field_615_ag.func_600_a(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_601_au.field_1697_b) - 1, MathHelper.func_1108_b(field_609_am));
                if(i > 0)
                {
                    f = Block.field_345_n[i].field_355_bo * 0.91F;
                }
            }
            float f1 = 0.1627714F / (f * f * f);
            float f2;
            if(field_9298_aH)
            {
                if(func_46006_aR())
                {
                    f2 = func_48101_aR();
                } else
                {
                    f2 = field_35169_bv;
                }
                f2 *= f1;
            } else
            {
                f2 = field_35168_bw;
            }
            func_351_a(p_435_1_, p_435_2_, f2);
            f = 0.91F;
            if(field_9298_aH)
            {
                f = 0.5460001F;
                int j = field_615_ag.func_600_a(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_601_au.field_1697_b) - 1, MathHelper.func_1108_b(field_609_am));
                if(j > 0)
                {
                    f = Block.field_345_n[j].field_355_bo * 0.91F;
                }
            }
            if(func_429_A())
            {
                float f3 = 0.15F;
                if(field_608_an < (double)(-f3))
                {
                    field_608_an = -f3;
                }
                if(field_608_an > (double)f3)
                {
                    field_608_an = f3;
                }
                if(field_606_ap < (double)(-f3))
                {
                    field_606_ap = -f3;
                }
                if(field_606_ap > (double)f3)
                {
                    field_606_ap = f3;
                }
                field_9288_aU = 0.0F;
                if(field_607_ao < -0.14999999999999999D)
                {
                    field_607_ao = -0.14999999999999999D;
                }
                boolean flag = func_381_o() && (this instanceof EntityPlayer);
                if(flag && field_607_ao < 0.0D)
                {
                    field_607_ao = 0.0D;
                }
            }
            func_349_c(field_608_an, field_607_ao, field_606_ap);
            if(field_9297_aI && func_429_A())
            {
                field_607_ao = 0.20000000000000001D;
            }
            field_607_ao -= 0.080000000000000002D;
            field_607_ao *= 0.98000001907348633D;
            field_608_an *= f;
            field_606_ap *= f;
        }
        field_705_Q = field_704_R;
        double d2 = field_611_ak - field_9285_at;
        double d3 = field_609_am - field_9283_av;
        float f4 = MathHelper.func_1109_a(d2 * d2 + d3 * d3) * 4F;
        if(f4 > 1.0F)
        {
            f4 = 1.0F;
        }
        field_704_R += (f4 - field_704_R) * 0.4F;
        field_703_S += field_704_R;
    }

    public boolean func_429_A()
    {
        int i = MathHelper.func_1108_b(field_611_ak);
        int j = MathHelper.func_1108_b(field_601_au.field_1697_b);
        int k = MathHelper.func_1108_b(field_609_am);
        int l = field_615_ag.func_600_a(i, j, k);
        if(Reflector.hasMethod(50))
        {
            Block block = Block.field_345_n[l];
            if(block != null)
            {
                return Reflector.callBoolean(block, 50, new Object[] {
                    field_615_ag, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
                });
            }
        }
        return l == Block.field_441_aG.field_376_bc || l == Block.field_35278_bv.field_376_bc;
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        p_352_1_.func_749_a("Health", (short)field_9337_J);
        p_352_1_.func_749_a("HurtTime", (short)field_715_G);
        p_352_1_.func_749_a("DeathTime", (short)field_712_J);
        p_352_1_.func_749_a("AttackTime", (short)field_9330_P);
        if(!field_35170_bR.isEmpty())
        {
            NBTTagList nbttaglist = new NBTTagList();
            NBTTagCompound nbttagcompound;
            for(Iterator iterator = field_35170_bR.values().iterator(); iterator.hasNext(); nbttaglist.func_742_a(nbttagcompound))
            {
                PotionEffect potioneffect = (PotionEffect)iterator.next();
                nbttagcompound = new NBTTagCompound();
                nbttagcompound.func_761_a("Id", (byte)potioneffect.func_35799_a());
                nbttagcompound.func_761_a("Amplifier", (byte)potioneffect.func_35801_c());
                nbttagcompound.func_758_a("Duration", potioneffect.func_35802_b());
            }

            p_352_1_.func_762_a("ActiveEffects", nbttaglist);
        }
        p_352_1_.func_758_a("PersistentId", persistentId);
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        if(field_9337_J < -32768)
        {
            field_9337_J = -32768;
        }
        field_9337_J = p_357_1_.func_745_d("Health");
        if(!p_357_1_.func_751_b("Health"))
        {
            field_9337_J = func_40117_c();
        }
        field_715_G = p_357_1_.func_745_d("HurtTime");
        field_712_J = p_357_1_.func_745_d("DeathTime");
        field_9330_P = p_357_1_.func_745_d("AttackTime");
        if(p_357_1_.func_751_b("ActiveEffects"))
        {
            NBTTagList nbttaglist = p_357_1_.func_753_l("ActiveEffects");
            for(int i = 0; i < nbttaglist.func_740_c(); i++)
            {
                NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.func_741_a(i);
                byte byte0 = nbttagcompound.func_746_c("Id");
                byte byte1 = nbttagcompound.func_746_c("Amplifier");
                int j = nbttagcompound.func_756_e("Duration");
                field_35170_bR.put(Integer.valueOf(byte0), new PotionEffect(byte0, j, byte1));
            }

        }
        persistentId = p_357_1_.func_756_e("PersistentId");
        if(persistentId == 0)
        {
            persistentId = field_9312_bd.nextInt(0x7fffffff);
        }
    }

    public boolean func_354_B()
    {
        return !field_646_aA && field_9337_J > 0;
    }

    public boolean func_21067_c_()
    {
        return false;
    }

    public void func_46010_f(float p_46010_1_)
    {
        field_9340_ai = p_46010_1_;
    }

    public void func_46003_g(boolean p_46003_1_)
    {
        field_9336_ak = p_46003_1_;
    }

    public void func_425_j()
    {
        if(field_39003_d > 0)
        {
            field_39003_d--;
        }
        if(field_9324_Y > 0)
        {
            double d = field_611_ak + (field_9323_Z - field_611_ak) / (double)field_9324_Y;
            double d1 = field_610_al + (field_9356_aa - field_610_al) / (double)field_9324_Y;
            double d2 = field_609_am + (field_9354_ab - field_609_am) / (double)field_9324_Y;
            double d3;
            for(d3 = field_9352_ac - (double)field_605_aq; d3 < -180D; d3 += 360D) { }
            for(; d3 >= 180D; d3 -= 360D) { }
            field_605_aq += d3 / (double)field_9324_Y;
            field_604_ar += (field_9350_ad - (double)field_604_ar) / (double)field_9324_Y;
            field_9324_Y--;
            func_347_a(d, d1, d2);
            func_376_c(field_605_aq, field_604_ar);
            List list1 = field_615_ag.func_697_a(this, field_601_au.func_28195_e(0.03125D, 0.0D, 0.03125D));
            if(list1.size() > 0)
            {
                double d4 = 0.0D;
                for(int j = 0; j < list1.size(); j++)
                {
                    AxisAlignedBB axisalignedbb = (AxisAlignedBB)list1.get(j);
                    if(axisalignedbb.field_1702_e > d4)
                    {
                        d4 = axisalignedbb.field_1702_e;
                    }
                }

                d1 += d4 - field_601_au.field_1697_b;
                func_347_a(d, d1, d2);
            }
        }
        Profiler.func_40663_a("ai");
        if(func_22049_v())
        {
            field_9336_ak = false;
            field_9342_ah = 0.0F;
            field_9340_ai = 0.0F;
            field_9338_aj = 0.0F;
        } else
        if(func_44001_ad())
        {
            if(func_46006_aR())
            {
                Profiler.func_40663_a("newAi");
                func_46014_aS();
                Profiler.func_40662_b();
            } else
            {
                Profiler.func_40663_a("oldAi");
                func_418_b_();
                Profiler.func_40662_b();
                field_46015_bf = field_605_aq;
            }
        }
        Profiler.func_40662_b();
        boolean flag = func_27013_ag();
        boolean flag1 = func_359_G();
        if(field_9336_ak)
        {
            if(flag)
            {
                field_607_ao += 0.039999999105930328D;
            } else
            if(flag1)
            {
                field_607_ao += 0.039999999105930328D;
            } else
            if(field_9298_aH && field_39003_d == 0)
            {
                func_424_C();
                field_39003_d = 10;
            }
        } else
        {
            field_39003_d = 0;
        }
        field_9342_ah *= 0.98F;
        field_9340_ai *= 0.98F;
        field_9338_aj *= 0.9F;
        float f = field_35169_bv;
        field_35169_bv *= func_35166_t_();
        func_435_b(field_9342_ah, field_9340_ai);
        field_35169_bv = f;
        Profiler.func_40663_a("push");
        List list = field_615_ag.func_659_b(this, field_601_au.func_1177_b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
        if(list != null && list.size() > 0)
        {
            for(int i = 0; i < list.size(); i++)
            {
                Entity entity = (Entity)list.get(i);
                if(entity.func_385_d_())
                {
                    entity.func_380_f(this);
                }
            }

        }
        Profiler.func_40662_b();
    }

    protected boolean func_46006_aR()
    {
        return false;
    }

    protected boolean func_44001_ad()
    {
        return !field_615_ag.field_1026_y;
    }

    protected boolean func_22049_v()
    {
        return field_9337_J <= 0;
    }

    public boolean func_35162_ad()
    {
        return false;
    }

    protected void func_424_C()
    {
        field_607_ao = 0.41999998688697815D;
        if(func_35160_a(Potion.field_35683_j))
        {
            field_607_ao += (float)(func_35167_b(Potion.field_35683_j).func_35801_c() + 1) * 0.1F;
        }
        if(func_35117_Q())
        {
            float f = field_605_aq * 0.01745329F;
            field_608_an -= MathHelper.func_1106_a(f) * 0.2F;
            field_606_ap += MathHelper.func_1114_b(f) * 0.2F;
        }
        field_35118_ao = true;
    }

    protected boolean func_25023_u()
    {
        return true;
    }

    protected void func_27021_X()
    {
        EntityPlayer entityplayer = field_615_ag.func_609_a(this, -1D);
        if(entityplayer != null)
        {
            double d = ((Entity) (entityplayer)).field_611_ak - field_611_ak;
            double d1 = ((Entity) (entityplayer)).field_610_al - field_610_al;
            double d2 = ((Entity) (entityplayer)).field_609_am - field_609_am;
            double d3 = d * d + d1 * d1 + d2 * d2;
            if(func_25023_u() && d3 > 16384D)
            {
                func_395_F();
            }
            if(field_9344_ag > 600 && field_9312_bd.nextInt(800) == 0 && d3 > 1024D && func_25023_u())
            {
                func_395_F();
            } else
            if(d3 < 1024D)
            {
                field_9344_ag = 0;
            }
        }
    }

    protected void func_46014_aS()
    {
        field_9344_ag++;
        Profiler.func_40663_a("checkDespawn");
        func_27021_X();
        Profiler.func_40662_b();
        Profiler.func_40663_a("sensing");
        field_48104_at.func_48481_a();
        Profiler.func_40662_b();
        Profiler.func_40663_a("targetSelector");
        field_48105_bU.func_46115_a();
        Profiler.func_40662_b();
        Profiler.func_40663_a("goalSelector");
        field_46019_bU.func_46115_a();
        Profiler.func_40662_b();
        Profiler.func_40663_a("navigation");
        field_48107_ar.func_46069_a();
        Profiler.func_40662_b();
        Profiler.func_40663_a("mob tick");
        func_48097_s_();
        Profiler.func_40662_b();
        Profiler.func_40663_a("controls");
        field_46018_e.func_46034_a();
        field_46017_d.func_46142_a();
        field_46021_am.func_46130_b();
        Profiler.func_40662_b();
    }

    protected void func_48097_s_()
    {
    }

    protected void func_418_b_()
    {
        field_9344_ag++;
        func_27021_X();
        field_9342_ah = 0.0F;
        field_9340_ai = 0.0F;
        float f = 8F;
        if(field_9312_bd.nextFloat() < 0.02F)
        {
            EntityPlayer entityplayer = field_615_ag.func_609_a(this, f);
            if(entityplayer != null)
            {
                field_4120_b = entityplayer;
                field_4127_c = 10 + field_9312_bd.nextInt(20);
            } else
            {
                field_9338_aj = (field_9312_bd.nextFloat() - 0.5F) * 20F;
            }
        }
        if(field_4120_b != null)
        {
            func_426_b(field_4120_b, 10F, func_25026_x());
            if(field_4127_c-- <= 0 || field_4120_b.field_646_aA || field_4120_b.func_387_e(this) > (double)(f * f))
            {
                field_4120_b = null;
            }
        } else
        {
            if(field_9312_bd.nextFloat() < 0.05F)
            {
                field_9338_aj = (field_9312_bd.nextFloat() - 0.5F) * 20F;
            }
            field_605_aq += field_9338_aj;
            field_604_ar = field_9334_al;
        }
        boolean flag = func_27013_ag();
        boolean flag1 = func_359_G();
        if(flag || flag1)
        {
            field_9336_ak = field_9312_bd.nextFloat() < 0.8F;
        }
    }

    public int func_25026_x()
    {
        return 40;
    }

    public void func_426_b(Entity p_426_1_, float p_426_2_, float p_426_3_)
    {
        double d = p_426_1_.field_611_ak - field_611_ak;
        double d1 = p_426_1_.field_609_am - field_609_am;
        double d2;
        if(p_426_1_ instanceof EntityLiving)
        {
            EntityLiving entityliving = (EntityLiving)p_426_1_;
            d2 = (field_610_al + (double)func_373_s()) - (entityliving.field_610_al + (double)entityliving.func_373_s());
        } else
        {
            d2 = (p_426_1_.field_601_au.field_1697_b + p_426_1_.field_601_au.field_1702_e) / 2D - (field_610_al + (double)func_373_s());
        }
        double d3 = MathHelper.func_1109_a(d * d + d1 * d1);
        float f = (float)((Math.atan2(d1, d) * 180D) / 3.1415926535897931D) - 90F;
        float f1 = (float)(-((Math.atan2(d2, d3) * 180D) / 3.1415926535897931D));
        field_604_ar = -func_417_b(field_604_ar, f1, p_426_3_);
        field_605_aq = func_417_b(field_605_aq, f, p_426_2_);
    }

    private float func_417_b(float p_417_1_, float p_417_2_, float p_417_3_)
    {
        float f;
        for(f = p_417_2_ - p_417_1_; f < -180F; f += 360F) { }
        for(; f >= 180F; f -= 360F) { }
        if(f > p_417_3_)
        {
            f = p_417_3_;
        }
        if(f < -p_417_3_)
        {
            f = -p_417_3_;
        }
        return p_417_1_ + f;
    }

    public void func_6392_F()
    {
    }

    public boolean func_433_a()
    {
        return field_615_ag.func_604_a(field_601_au) && field_615_ag.func_697_a(this, field_601_au).size() == 0 && !field_615_ag.func_662_b(field_601_au);
    }

    protected void func_4034_G()
    {
        func_396_a(DamageSource.field_35550_i, 4);
    }

    public float func_431_d(float p_431_1_)
    {
        float f = field_9339_I - field_9341_H;
        if(f < 0.0F)
        {
            f++;
        }
        return field_9341_H + f * p_431_1_;
    }

    public Vec3D func_427_e(float p_427_1_)
    {
        if(p_427_1_ == 1.0F)
        {
            return Vec3D.func_1248_b(field_611_ak, field_610_al, field_609_am);
        } else
        {
            double d = field_9285_at + (field_611_ak - field_9285_at) * (double)p_427_1_;
            double d1 = field_9284_au + (field_610_al - field_9284_au) * (double)p_427_1_;
            double d2 = field_9283_av + (field_609_am - field_9283_av) * (double)p_427_1_;
            return Vec3D.func_1248_b(d, d1, d2);
        }
    }

    public Vec3D func_4037_H()
    {
        return func_430_f(1.0F);
    }

    public Vec3D func_430_f(float p_430_1_)
    {
        if(p_430_1_ == 1.0F)
        {
            float f = MathHelper.func_1114_b(-field_605_aq * 0.01745329F - 3.141593F);
            float f2 = MathHelper.func_1106_a(-field_605_aq * 0.01745329F - 3.141593F);
            float f4 = -MathHelper.func_1114_b(-field_604_ar * 0.01745329F);
            float f6 = MathHelper.func_1106_a(-field_604_ar * 0.01745329F);
            return Vec3D.func_1248_b(f2 * f4, f6, f * f4);
        } else
        {
            float f1 = field_602_at + (field_604_ar - field_602_at) * p_430_1_;
            float f3 = field_603_as + (field_605_aq - field_603_as) * p_430_1_;
            float f5 = MathHelper.func_1114_b(-f3 * 0.01745329F - 3.141593F);
            float f7 = MathHelper.func_1106_a(-f3 * 0.01745329F - 3.141593F);
            float f8 = -MathHelper.func_1114_b(-f1 * 0.01745329F);
            float f9 = MathHelper.func_1106_a(-f1 * 0.01745329F);
            return Vec3D.func_1248_b(f7 * f8, f9, f5 * f8);
        }
    }

    public float func_35159_aC()
    {
        return 1.0F;
    }

    public MovingObjectPosition func_416_a(double p_416_1_, float p_416_3_)
    {
        Vec3D vec3d = func_427_e(p_416_3_);
        Vec3D vec3d1 = func_430_f(p_416_3_);
        Vec3D vec3d2 = vec3d.func_1257_c(vec3d1.field_1776_a * p_416_1_, vec3d1.field_1775_b * p_416_1_, vec3d1.field_1779_c * p_416_1_);
        return field_615_ag.func_645_a(vec3d, vec3d2);
    }

    public int func_6391_i()
    {
        return 4;
    }

    public ItemStack func_4045_l()
    {
        return null;
    }

    public void func_9282_a(byte p_9282_1_)
    {
        if(p_9282_1_ == 2)
        {
            field_704_R = 1.5F;
            field_9306_bj = field_9366_o;
            field_715_G = field_9332_M = 10;
            field_9331_N = 0.0F;
            field_615_ag.func_623_a(this, func_6394_f_(), func_6393_h(), (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.2F + 1.0F);
            func_396_a(DamageSource.field_35547_j, 0);
        } else
        if(p_9282_1_ == 3)
        {
            field_615_ag.func_623_a(this, func_6390_f(), func_6393_h(), (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.2F + 1.0F);
            field_9337_J = 0;
            func_419_b(DamageSource.field_35547_j);
        } else
        {
            super.func_9282_a(p_9282_1_);
        }
    }

    public boolean func_22051_K()
    {
        return false;
    }

    public int func_28021_c(ItemStack p_28021_1_, int p_28021_2_)
    {
        return p_28021_1_.func_1088_b();
    }

    protected void func_36000_g()
    {
        Iterator iterator = field_35170_bR.keySet().iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Integer integer = (Integer)iterator.next();
            PotionEffect potioneffect = (PotionEffect)field_35170_bR.get(integer);
            if(!potioneffect.func_35798_a(this) && !field_615_ag.field_1026_y)
            {
                iterator.remove();
                func_35158_d(potioneffect);
            }
        } while(true);
        if(field_39001_b)
        {
            if(!field_615_ag.field_1026_y)
            {
                if(!field_35170_bR.isEmpty())
                {
                    int i = PotionHelper.func_40354_a(field_35170_bR.values());
                    field_21064_bx.func_21129_b(8, Integer.valueOf(i));
                } else
                {
                    field_21064_bx.func_21129_b(8, Integer.valueOf(0));
                }
            }
            field_39001_b = false;
        }
        if(field_9312_bd.nextBoolean())
        {
            int j = field_21064_bx.func_25115_b(8);
            if(j > 0)
            {
                double d = (double)(j >> 16 & 0xff) / 255D;
                double d1 = (double)(j >> 8 & 0xff) / 255D;
                double d2 = (double)(j >> 0 & 0xff) / 255D;
                field_615_ag.func_694_a("mobSpell", field_611_ak + (field_9312_bd.nextDouble() - 0.5D) * (double)field_644_aC, (field_610_al + field_9312_bd.nextDouble() * (double)field_643_aD) - (double)field_9292_aO, field_609_am + (field_9312_bd.nextDouble() - 0.5D) * (double)field_644_aC, d, d1, d2);
            }
        }
    }

    public void func_40112_aN()
    {
        Iterator iterator = field_35170_bR.keySet().iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            Integer integer = (Integer)iterator.next();
            PotionEffect potioneffect = (PotionEffect)field_35170_bR.get(integer);
            if(!field_615_ag.field_1026_y)
            {
                iterator.remove();
                func_35158_d(potioneffect);
            }
        } while(true);
    }

    public Collection func_40118_aO()
    {
        return field_35170_bR.values();
    }

    public boolean func_35160_a(Potion p_35160_1_)
    {
        return field_35170_bR.containsKey(Integer.valueOf(p_35160_1_.field_35670_H));
    }

    public PotionEffect func_35167_b(Potion p_35167_1_)
    {
        return (PotionEffect)field_35170_bR.get(Integer.valueOf(p_35167_1_.field_35670_H));
    }

    public void func_35165_a(PotionEffect p_35165_1_)
    {
        if(!func_40126_a(p_35165_1_))
        {
            return;
        }
        if(field_35170_bR.containsKey(Integer.valueOf(p_35165_1_.func_35799_a())))
        {
            ((PotionEffect)field_35170_bR.get(Integer.valueOf(p_35165_1_.func_35799_a()))).func_35796_a(p_35165_1_);
            func_35161_c((PotionEffect)field_35170_bR.get(Integer.valueOf(p_35165_1_.func_35799_a())));
        } else
        {
            field_35170_bR.put(Integer.valueOf(p_35165_1_.func_35799_a()), p_35165_1_);
            func_35164_b(p_35165_1_);
        }
    }

    public boolean func_40126_a(PotionEffect p_40126_1_)
    {
        if(func_40124_t() == EnumCreatureAttribute.UNDEAD)
        {
            int i = p_40126_1_.func_35799_a();
            if(i == Potion.field_35681_l.field_35670_H || i == Potion.field_35689_u.field_35670_H)
            {
                return false;
            }
        }
        return true;
    }

    public boolean func_40122_aP()
    {
        return func_40124_t() == EnumCreatureAttribute.UNDEAD;
    }

    public void func_36002_f(int p_36002_1_)
    {
        field_35170_bR.remove(Integer.valueOf(p_36002_1_));
    }

    protected void func_35164_b(PotionEffect p_35164_1_)
    {
        field_39001_b = true;
    }

    protected void func_35161_c(PotionEffect p_35161_1_)
    {
        field_39001_b = true;
    }

    protected void func_35158_d(PotionEffect p_35158_1_)
    {
        field_39001_b = true;
    }

    protected float func_35166_t_()
    {
        float f = 1.0F;
        if(func_35160_a(Potion.field_35677_c))
        {
            f *= 1.0F + 0.2F * (float)(func_35167_b(Potion.field_35677_c).func_35801_c() + 1);
        }
        if(func_35160_a(Potion.field_35674_d))
        {
            f *= 1.0F - 0.15F * (float)(func_35167_b(Potion.field_35674_d).func_35801_c() + 1);
        }
        return f;
    }

    public void func_40113_j(double p_40113_1_, double p_40113_3_, double p_40113_5_)
    {
        func_365_c(p_40113_1_, p_40113_3_, p_40113_5_, field_605_aq, field_604_ar);
    }

    public boolean func_40127_l()
    {
        return false;
    }

    public EnumCreatureAttribute func_40124_t()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

    public void func_41005_b(ItemStack p_41005_1_)
    {
        field_615_ag.func_623_a(this, "random.break", 0.8F, 0.8F + field_615_ag.field_1037_n.nextFloat() * 0.4F);
        for(int i = 0; i < 5; i++)
        {
            Vec3D vec3d = Vec3D.func_1248_b(((double)field_9312_bd.nextFloat() - 0.5D) * 0.10000000000000001D, Math.random() * 0.10000000000000001D + 0.10000000000000001D, 0.0D);
            vec3d.func_1258_a((-field_604_ar * 3.141593F) / 180F);
            vec3d.func_1249_b((-field_605_aq * 3.141593F) / 180F);
            Vec3D vec3d1 = Vec3D.func_1248_b(((double)field_9312_bd.nextFloat() - 0.5D) * 0.29999999999999999D, (double)(-field_9312_bd.nextFloat()) * 0.59999999999999998D - 0.29999999999999999D, 0.59999999999999998D);
            vec3d1.func_1258_a((-field_604_ar * 3.141593F) / 180F);
            vec3d1.func_1249_b((-field_605_aq * 3.141593F) / 180F);
            vec3d1 = vec3d1.func_1257_c(field_611_ak, field_610_al + (double)func_373_s(), field_609_am);
            field_615_ag.func_694_a((new StringBuilder()).append("iconcrack_").append(p_41005_1_.func_1091_a().field_291_aS).toString(), vec3d1.field_1776_a, vec3d1.field_1775_b, vec3d1.field_1779_c, vec3d.field_1776_a, vec3d.field_1775_b + 0.050000000000000003D, vec3d.field_1779_c);
        }

    }
}
