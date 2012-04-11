// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            AxisAlignedBB, DataWatcher, World, Profiler, 
//            MathHelper, DamageSource, EntityPlayer, Block, 
//            StepSound, Material, EntityLiving, BlockFluid, 
//            Vec3D, NBTTagCompound, NBTTagList, NBTTagDouble, 
//            NBTTagFloat, EntityList, ItemStack, EntityItem, 
//            EntityLightningBolt

public abstract class Entity
{

    private static int field_864_a = 0;
    public int field_620_ab;
    public double field_619_ac;
    public boolean field_618_ad;
    public Entity field_617_ae;
    public Entity field_616_af;
    public World field_615_ag;
    public double field_9285_at;
    public double field_9284_au;
    public double field_9283_av;
    public double field_611_ak;
    public double field_610_al;
    public double field_609_am;
    public double field_608_an;
    public double field_607_ao;
    public double field_606_ap;
    public float field_605_aq;
    public float field_604_ar;
    public float field_603_as;
    public float field_602_at;
    public final AxisAlignedBB field_601_au = AxisAlignedBB.func_1168_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
    public boolean field_9298_aH;
    public boolean field_9297_aI;
    public boolean field_9296_aJ;
    public boolean field_9295_aK;
    public boolean field_9294_aL;
    protected boolean field_27016_ba;
    public boolean field_9293_aM;
    public boolean field_646_aA;
    public float field_9292_aO;
    public float field_644_aC;
    public float field_643_aD;
    public float field_9291_aR;
    public float field_9290_aS;
    public float field_9288_aU;
    private int field_863_b;
    public double field_638_aI;
    public double field_637_aJ;
    public double field_636_aK;
    public float field_9287_aY;
    public float field_9286_aZ;
    public boolean field_9314_ba;
    public float field_632_aO;
    protected Random field_9312_bd;
    public int field_9311_be;
    public int field_9310_bf;
    private int field_9309_bg;
    protected boolean field_9307_bi;
    public int field_9306_bj;
    private boolean field_862_c;
    public String field_20047_bv;
    public String field_622_aY;
    protected boolean field_9304_bm;
    protected DataWatcher field_21064_bx;
    private double field_861_d;
    private double field_667_e;
    public boolean field_621_aZ;
    public int field_657_ba;
    public int field_656_bb;
    public int field_654_bc;
    public int field_9303_br;
    public int field_9302_bs;
    public int field_9301_bt;
    public boolean field_28016_bK;
    public boolean field_35118_ao;

    public Entity(World p_i480_1_)
    {
        field_620_ab = field_864_a++;
        field_619_ac = 1.0D;
        field_618_ad = false;
        field_9298_aH = false;
        field_9295_aK = false;
        field_9294_aL = false;
        field_9293_aM = true;
        field_646_aA = false;
        field_9292_aO = 0.0F;
        field_644_aC = 0.6F;
        field_643_aD = 1.8F;
        field_9291_aR = 0.0F;
        field_9290_aS = 0.0F;
        field_9288_aU = 0.0F;
        field_863_b = 1;
        field_9287_aY = 0.0F;
        field_9286_aZ = 0.0F;
        field_9314_ba = false;
        field_632_aO = 0.0F;
        field_9312_bd = new Random();
        field_9311_be = 0;
        field_9310_bf = 1;
        field_9309_bg = 0;
        field_9307_bi = false;
        field_9306_bj = 0;
        field_862_c = true;
        field_9304_bm = false;
        field_21064_bx = new DataWatcher();
        field_621_aZ = false;
        field_615_ag = p_i480_1_;
        func_347_a(0.0D, 0.0D, 0.0D);
        field_21064_bx.func_21124_a(0, Byte.valueOf((byte)0));
        field_21064_bx.func_21124_a(1, Short.valueOf((short)300));
        func_21057_b();
    }

    protected abstract void func_21057_b();

    public DataWatcher func_21061_O()
    {
        return field_21064_bx;
    }

    public boolean equals(Object p_equals_1_)
    {
        if(p_equals_1_ instanceof Entity)
        {
            return ((Entity)p_equals_1_).field_620_ab == field_620_ab;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return field_620_ab;
    }

    protected void func_374_q()
    {
        if(field_615_ag == null)
        {
            return;
        }
        do
        {
            if(field_610_al <= 0.0D)
            {
                break;
            }
            func_347_a(field_611_ak, field_610_al, field_609_am);
            if(field_615_ag.func_697_a(this, field_601_au).size() == 0)
            {
                break;
            }
            field_610_al++;
        } while(true);
        field_608_an = field_607_ao = field_606_ap = 0.0D;
        field_604_ar = 0.0F;
    }

    public void func_395_F()
    {
        field_646_aA = true;
    }

    protected void func_371_a(float p_371_1_, float p_371_2_)
    {
        field_644_aC = p_371_1_;
        field_643_aD = p_371_2_;
    }

    protected void func_376_c(float p_376_1_, float p_376_2_)
    {
        field_605_aq = p_376_1_ % 360F;
        field_604_ar = p_376_2_ % 360F;
    }

    public void func_347_a(double p_347_1_, double p_347_3_, double p_347_5_)
    {
        field_611_ak = p_347_1_;
        field_610_al = p_347_3_;
        field_609_am = p_347_5_;
        float f = field_644_aC / 2.0F;
        float f1 = field_643_aD;
        field_601_au.func_1165_c(p_347_1_ - (double)f, (p_347_3_ - (double)field_9292_aO) + (double)field_9287_aY, p_347_5_ - (double)f, p_347_1_ + (double)f, (p_347_3_ - (double)field_9292_aO) + (double)field_9287_aY + (double)f1, p_347_5_ + (double)f);
    }

    public void func_346_d(float p_346_1_, float p_346_2_)
    {
        float f = field_604_ar;
        float f1 = field_605_aq;
        field_605_aq += (double)p_346_1_ * 0.14999999999999999D;
        field_604_ar -= (double)p_346_2_ * 0.14999999999999999D;
        if(field_604_ar < -90F)
        {
            field_604_ar = -90F;
        }
        if(field_604_ar > 90F)
        {
            field_604_ar = 90F;
        }
        field_602_at += field_604_ar - f;
        field_603_as += field_605_aq - f1;
    }

    public void func_370_e_()
    {
        func_391_y();
    }

    public void func_391_y()
    {
        Profiler.func_40663_a("entityBaseTick");
        if(field_616_af != null && field_616_af.field_646_aA)
        {
            field_616_af = null;
        }
        field_9311_be++;
        field_9291_aR = field_9290_aS;
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        field_602_at = field_604_ar;
        field_603_as = field_605_aq;
        if(func_35117_Q() && !func_27013_ag())
        {
            int i = MathHelper.func_1108_b(field_611_ak);
            int j = MathHelper.func_1108_b(field_610_al - 0.20000000298023224D - (double)field_9292_aO);
            int k = MathHelper.func_1108_b(field_609_am);
            int j1 = field_615_ag.func_600_a(i, j, k);
            if(j1 > 0)
            {
                field_615_ag.func_694_a((new StringBuilder()).append("tilecrack_").append(j1).toString(), field_611_ak + ((double)field_9312_bd.nextFloat() - 0.5D) * (double)field_644_aC, field_601_au.field_1697_b + 0.10000000000000001D, field_609_am + ((double)field_9312_bd.nextFloat() - 0.5D) * (double)field_644_aC, -field_608_an * 4D, 1.5D, -field_606_ap * 4D);
            }
        }
        if(func_397_g_())
        {
            if(!field_9307_bi && !field_862_c)
            {
                float f = MathHelper.func_1109_a(field_608_an * field_608_an * 0.20000000298023224D + field_607_ao * field_607_ao + field_606_ap * field_606_ap * 0.20000000298023224D) * 0.2F;
                if(f > 1.0F)
                {
                    f = 1.0F;
                }
                field_615_ag.func_623_a(this, "random.splash", f, 1.0F + (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.4F);
                float f1 = MathHelper.func_1108_b(field_601_au.field_1697_b);
                for(int l = 0; (float)l < 1.0F + field_644_aC * 20F; l++)
                {
                    float f2 = (field_9312_bd.nextFloat() * 2.0F - 1.0F) * field_644_aC;
                    float f4 = (field_9312_bd.nextFloat() * 2.0F - 1.0F) * field_644_aC;
                    field_615_ag.func_694_a("bubble", field_611_ak + (double)f2, f1 + 1.0F, field_609_am + (double)f4, field_608_an, field_607_ao - (double)(field_9312_bd.nextFloat() * 0.2F), field_606_ap);
                }

                for(int i1 = 0; (float)i1 < 1.0F + field_644_aC * 20F; i1++)
                {
                    float f3 = (field_9312_bd.nextFloat() * 2.0F - 1.0F) * field_644_aC;
                    float f5 = (field_9312_bd.nextFloat() * 2.0F - 1.0F) * field_644_aC;
                    field_615_ag.func_694_a("splash", field_611_ak + (double)f3, f1 + 1.0F, field_609_am + (double)f5, field_608_an, field_607_ao, field_606_ap);
                }

            }
            field_9288_aU = 0.0F;
            field_9307_bi = true;
            field_9309_bg = 0;
        } else
        {
            field_9307_bi = false;
        }
        if(field_615_ag.field_1026_y)
        {
            field_9309_bg = 0;
        } else
        if(field_9309_bg > 0)
        {
            if(field_9304_bm)
            {
                field_9309_bg -= 4;
                if(field_9309_bg < 0)
                {
                    field_9309_bg = 0;
                }
            } else
            {
                if(field_9309_bg % 20 == 0)
                {
                    func_396_a(DamageSource.field_35540_b, 1);
                }
                field_9309_bg--;
            }
        }
        if(func_359_G())
        {
            func_4038_J();
            field_9288_aU *= 0.5F;
        }
        if(field_610_al < -64D)
        {
            func_4034_G();
        }
        if(!field_615_ag.field_1026_y)
        {
            func_21059_b(0, field_9309_bg > 0);
            func_21059_b(2, field_616_af != null);
        }
        field_862_c = false;
        Profiler.func_40662_b();
    }

    protected void func_4038_J()
    {
        if(!field_9304_bm)
        {
            func_396_a(DamageSource.field_35541_c, 4);
            func_40046_d(15);
        }
    }

    public void func_40046_d(int p_40046_1_)
    {
        int i = p_40046_1_ * 20;
        if(field_9309_bg < i)
        {
            field_9309_bg = i;
        }
    }

    public void func_40045_B()
    {
        field_9309_bg = 0;
    }

    protected void func_4034_G()
    {
        func_395_F();
    }

    public boolean func_403_b(double p_403_1_, double p_403_3_, double p_403_5_)
    {
        AxisAlignedBB axisalignedbb = field_601_au.func_1166_c(p_403_1_, p_403_3_, p_403_5_);
        List list = field_615_ag.func_697_a(this, axisalignedbb);
        if(list.size() > 0)
        {
            return false;
        }
        return !field_615_ag.func_662_b(axisalignedbb);
    }

    public void func_349_c(double p_349_1_, double p_349_3_, double p_349_5_)
    {
        if(field_9314_ba)
        {
            field_601_au.func_1174_d(p_349_1_, p_349_3_, p_349_5_);
            field_611_ak = (field_601_au.field_1698_a + field_601_au.field_1703_d) / 2D;
            field_610_al = (field_601_au.field_1697_b + (double)field_9292_aO) - (double)field_9287_aY;
            field_609_am = (field_601_au.field_1704_c + field_601_au.field_1701_f) / 2D;
            return;
        }
        Profiler.func_40663_a("move");
        field_9287_aY *= 0.4F;
        double d = field_611_ak;
        double d1 = field_609_am;
        if(field_27016_ba)
        {
            field_27016_ba = false;
            p_349_1_ *= 0.25D;
            p_349_3_ *= 0.05000000074505806D;
            p_349_5_ *= 0.25D;
            field_608_an = 0.0D;
            field_607_ao = 0.0D;
            field_606_ap = 0.0D;
        }
        double d2 = p_349_1_;
        double d3 = p_349_3_;
        double d4 = p_349_5_;
        AxisAlignedBB axisalignedbb = field_601_au.func_1160_c();
        boolean flag = field_9298_aH && func_381_o() && (this instanceof EntityPlayer);
        if(flag)
        {
            double d5 = 0.050000000000000003D;
            for(; p_349_1_ != 0.0D && field_615_ag.func_697_a(this, field_601_au.func_1166_c(p_349_1_, -1D, 0.0D)).size() == 0; d2 = p_349_1_)
            {
                if(p_349_1_ < d5 && p_349_1_ >= -d5)
                {
                    p_349_1_ = 0.0D;
                    continue;
                }
                if(p_349_1_ > 0.0D)
                {
                    p_349_1_ -= d5;
                } else
                {
                    p_349_1_ += d5;
                }
            }

            for(; p_349_5_ != 0.0D && field_615_ag.func_697_a(this, field_601_au.func_1166_c(0.0D, -1D, p_349_5_)).size() == 0; d4 = p_349_5_)
            {
                if(p_349_5_ < d5 && p_349_5_ >= -d5)
                {
                    p_349_5_ = 0.0D;
                    continue;
                }
                if(p_349_5_ > 0.0D)
                {
                    p_349_5_ -= d5;
                } else
                {
                    p_349_5_ += d5;
                }
            }

            while(p_349_1_ != 0.0D && p_349_5_ != 0.0D && field_615_ag.func_697_a(this, field_601_au.func_1166_c(p_349_1_, -1D, p_349_5_)).size() == 0) 
            {
                if(p_349_1_ < d5 && p_349_1_ >= -d5)
                {
                    p_349_1_ = 0.0D;
                } else
                if(p_349_1_ > 0.0D)
                {
                    p_349_1_ -= d5;
                } else
                {
                    p_349_1_ += d5;
                }
                if(p_349_5_ < d5 && p_349_5_ >= -d5)
                {
                    p_349_5_ = 0.0D;
                } else
                if(p_349_5_ > 0.0D)
                {
                    p_349_5_ -= d5;
                } else
                {
                    p_349_5_ += d5;
                }
                d2 = p_349_1_;
                d4 = p_349_5_;
            }
        }
        List list = field_615_ag.func_697_a(this, field_601_au.func_1170_a(p_349_1_, p_349_3_, p_349_5_));
        for(int i = 0; i < list.size(); i++)
        {
            p_349_3_ = ((AxisAlignedBB)list.get(i)).func_1172_b(field_601_au, p_349_3_);
        }

        field_601_au.func_1174_d(0.0D, p_349_3_, 0.0D);
        if(!field_9293_aM && d3 != p_349_3_)
        {
            p_349_1_ = p_349_3_ = p_349_5_ = 0.0D;
        }
        boolean flag1 = field_9298_aH || d3 != p_349_3_ && d3 < 0.0D;
        for(int j = 0; j < list.size(); j++)
        {
            p_349_1_ = ((AxisAlignedBB)list.get(j)).func_1163_a(field_601_au, p_349_1_);
        }

        field_601_au.func_1174_d(p_349_1_, 0.0D, 0.0D);
        if(!field_9293_aM && d2 != p_349_1_)
        {
            p_349_1_ = p_349_3_ = p_349_5_ = 0.0D;
        }
        for(int k = 0; k < list.size(); k++)
        {
            p_349_5_ = ((AxisAlignedBB)list.get(k)).func_1162_c(field_601_au, p_349_5_);
        }

        field_601_au.func_1174_d(0.0D, 0.0D, p_349_5_);
        if(!field_9293_aM && d4 != p_349_5_)
        {
            p_349_1_ = p_349_3_ = p_349_5_ = 0.0D;
        }
        if(field_9286_aZ > 0.0F && flag1 && (flag || field_9287_aY < 0.05F) && (d2 != p_349_1_ || d4 != p_349_5_))
        {
            double d6 = p_349_1_;
            double d8 = p_349_3_;
            double d10 = p_349_5_;
            p_349_1_ = d2;
            p_349_3_ = field_9286_aZ;
            p_349_5_ = d4;
            AxisAlignedBB axisalignedbb1 = field_601_au.func_1160_c();
            field_601_au.func_1171_b(axisalignedbb);
            List list1 = field_615_ag.func_697_a(this, field_601_au.func_1170_a(p_349_1_, p_349_3_, p_349_5_));
            for(int j2 = 0; j2 < list1.size(); j2++)
            {
                p_349_3_ = ((AxisAlignedBB)list1.get(j2)).func_1172_b(field_601_au, p_349_3_);
            }

            field_601_au.func_1174_d(0.0D, p_349_3_, 0.0D);
            if(!field_9293_aM && d3 != p_349_3_)
            {
                p_349_1_ = p_349_3_ = p_349_5_ = 0.0D;
            }
            for(int k2 = 0; k2 < list1.size(); k2++)
            {
                p_349_1_ = ((AxisAlignedBB)list1.get(k2)).func_1163_a(field_601_au, p_349_1_);
            }

            field_601_au.func_1174_d(p_349_1_, 0.0D, 0.0D);
            if(!field_9293_aM && d2 != p_349_1_)
            {
                p_349_1_ = p_349_3_ = p_349_5_ = 0.0D;
            }
            for(int l2 = 0; l2 < list1.size(); l2++)
            {
                p_349_5_ = ((AxisAlignedBB)list1.get(l2)).func_1162_c(field_601_au, p_349_5_);
            }

            field_601_au.func_1174_d(0.0D, 0.0D, p_349_5_);
            if(!field_9293_aM && d4 != p_349_5_)
            {
                p_349_1_ = p_349_3_ = p_349_5_ = 0.0D;
            }
            if(!field_9293_aM && d3 != p_349_3_)
            {
                p_349_1_ = p_349_3_ = p_349_5_ = 0.0D;
            } else
            {
                p_349_3_ = -field_9286_aZ;
                for(int i3 = 0; i3 < list1.size(); i3++)
                {
                    p_349_3_ = ((AxisAlignedBB)list1.get(i3)).func_1172_b(field_601_au, p_349_3_);
                }

                field_601_au.func_1174_d(0.0D, p_349_3_, 0.0D);
            }
            if(d6 * d6 + d10 * d10 >= p_349_1_ * p_349_1_ + p_349_5_ * p_349_5_)
            {
                p_349_1_ = d6;
                p_349_3_ = d8;
                p_349_5_ = d10;
                field_601_au.func_1171_b(axisalignedbb1);
            } else
            {
                double d11 = field_601_au.field_1697_b - (double)(int)field_601_au.field_1697_b;
                if(d11 > 0.0D)
                {
                    field_9287_aY += d11 + 0.01D;
                }
            }
        }
        Profiler.func_40662_b();
        Profiler.func_40663_a("rest");
        field_611_ak = (field_601_au.field_1698_a + field_601_au.field_1703_d) / 2D;
        field_610_al = (field_601_au.field_1697_b + (double)field_9292_aO) - (double)field_9287_aY;
        field_609_am = (field_601_au.field_1704_c + field_601_au.field_1701_f) / 2D;
        field_9297_aI = d2 != p_349_1_ || d4 != p_349_5_;
        field_9296_aJ = d3 != p_349_3_;
        field_9298_aH = d3 != p_349_3_ && d3 < 0.0D;
        field_9295_aK = field_9297_aI || field_9296_aJ;
        func_9279_a(p_349_3_, field_9298_aH);
        if(d2 != p_349_1_)
        {
            field_608_an = 0.0D;
        }
        if(d3 != p_349_3_)
        {
            field_607_ao = 0.0D;
        }
        if(d4 != p_349_5_)
        {
            field_606_ap = 0.0D;
        }
        double d7 = field_611_ak - d;
        double d9 = field_609_am - d1;
        if(func_25021_m() && !flag && field_616_af == null)
        {
            field_9290_aS += (double)MathHelper.func_1109_a(d7 * d7 + d9 * d9) * 0.59999999999999998D;
            int l = MathHelper.func_1108_b(field_611_ak);
            int j1 = MathHelper.func_1108_b(field_610_al - 0.20000000298023224D - (double)field_9292_aO);
            int l1 = MathHelper.func_1108_b(field_609_am);
            int j3 = field_615_ag.func_600_a(l, j1, l1);
            if(j3 == 0 && field_615_ag.func_600_a(l, j1 - 1, l1) == Block.field_4057_ba.field_376_bc)
            {
                j3 = field_615_ag.func_600_a(l, j1 - 1, l1);
            }
            if(field_9290_aS > (float)field_863_b && j3 > 0)
            {
                field_863_b = (int)field_9290_aS + 1;
                func_41002_a(l, j1, l1, j3);
                Block.field_345_n[j3].func_254_a(field_615_ag, l, j1, l1, this);
            }
        }
        int i1 = MathHelper.func_1108_b(field_601_au.field_1698_a + 0.001D);
        int k1 = MathHelper.func_1108_b(field_601_au.field_1697_b + 0.001D);
        int i2 = MathHelper.func_1108_b(field_601_au.field_1704_c + 0.001D);
        int k3 = MathHelper.func_1108_b(field_601_au.field_1703_d - 0.001D);
        int l3 = MathHelper.func_1108_b(field_601_au.field_1702_e - 0.001D);
        int i4 = MathHelper.func_1108_b(field_601_au.field_1701_f - 0.001D);
        if(field_615_ag.func_640_a(i1, k1, i2, k3, l3, i4))
        {
            for(int j4 = i1; j4 <= k3; j4++)
            {
                for(int k4 = k1; k4 <= l3; k4++)
                {
                    for(int l4 = i2; l4 <= i4; l4++)
                    {
                        int i5 = field_615_ag.func_600_a(j4, k4, l4);
                        if(i5 > 0)
                        {
                            Block.field_345_n[i5].func_236_b(field_615_ag, j4, k4, l4, this);
                        }
                    }

                }

            }

        }
        boolean flag2 = func_27012_af();
        if(field_615_ag.func_605_c(field_601_au.func_28195_e(0.001D, 0.001D, 0.001D)))
        {
            func_355_a(1);
            if(!flag2)
            {
                field_9309_bg++;
                if(field_9309_bg == 0)
                {
                    func_40046_d(8);
                }
            }
        } else
        if(field_9309_bg <= 0)
        {
            field_9309_bg = -field_9310_bf;
        }
        if(flag2 && field_9309_bg > 0)
        {
            field_615_ag.func_623_a(this, "random.fizz", 0.7F, 1.6F + (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.4F);
            field_9309_bg = -field_9310_bf;
        }
        Profiler.func_40662_b();
    }

    protected void func_41002_a(int p_41002_1_, int p_41002_2_, int p_41002_3_, int p_41002_4_)
    {
        StepSound stepsound = Block.field_345_n[p_41002_4_].field_358_bl;
        if(field_615_ag.func_600_a(p_41002_1_, p_41002_2_ + 1, p_41002_3_) == Block.field_428_aT.field_376_bc)
        {
            stepsound = Block.field_428_aT.field_358_bl;
            field_615_ag.func_623_a(this, stepsound.func_1145_d(), stepsound.func_1147_b() * 0.15F, stepsound.func_1144_c());
        } else
        if(!Block.field_345_n[p_41002_4_].field_356_bn.func_879_d())
        {
            field_615_ag.func_623_a(this, stepsound.func_1145_d(), stepsound.func_1147_b() * 0.15F, stepsound.func_1144_c());
        }
    }

    protected boolean func_25021_m()
    {
        return true;
    }

    protected void func_9279_a(double p_9279_1_, boolean p_9279_3_)
    {
        if(p_9279_3_)
        {
            if(field_9288_aU > 0.0F)
            {
                if(this instanceof EntityLiving)
                {
                    int i = MathHelper.func_1108_b(field_611_ak);
                    int j = MathHelper.func_1108_b(field_610_al - 0.20000000298023224D - (double)field_9292_aO);
                    int k = MathHelper.func_1108_b(field_609_am);
                    int l = field_615_ag.func_600_a(i, j, k);
                    if(l == 0 && field_615_ag.func_600_a(i, j - 1, k) == Block.field_4057_ba.field_376_bc)
                    {
                        l = field_615_ag.func_600_a(i, j - 1, k);
                    }
                    if(l > 0)
                    {
                        Block.field_345_n[l].func_43001_a(field_615_ag, i, j, k, this, field_9288_aU);
                    }
                }
                func_400_c(field_9288_aU);
                field_9288_aU = 0.0F;
            }
        } else
        if(p_9279_1_ < 0.0D)
        {
            field_9288_aU -= p_9279_1_;
        }
    }

    public AxisAlignedBB func_372_f_()
    {
        return null;
    }

    protected void func_355_a(int p_355_1_)
    {
        if(!field_9304_bm)
        {
            func_396_a(DamageSource.field_35542_a, p_355_1_);
        }
    }

    public final boolean func_40047_D()
    {
        return field_9304_bm;
    }

    protected void func_400_c(float p_400_1_)
    {
        if(field_617_ae != null)
        {
            field_617_ae.func_400_c(p_400_1_);
        }
    }

    public boolean func_27012_af()
    {
        return field_9307_bi || field_615_ag.func_27167_r(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al), MathHelper.func_1108_b(field_609_am));
    }

    public boolean func_27013_ag()
    {
        return field_9307_bi;
    }

    public boolean func_397_g_()
    {
        return field_615_ag.func_682_a(field_601_au.func_1177_b(0.0D, -0.40000000596046448D, 0.0D).func_28195_e(0.001D, 0.001D, 0.001D), Material.field_1332_f, this);
    }

    public boolean func_393_a(Material p_393_1_)
    {
        double d = field_610_al + (double)func_373_s();
        int i = MathHelper.func_1108_b(field_611_ak);
        int j = MathHelper.func_1110_d(MathHelper.func_1108_b(d));
        int k = MathHelper.func_1108_b(field_609_am);
        int l = field_615_ag.func_600_a(i, j, k);
        if(l != 0 && Block.field_345_n[l].field_356_bn == p_393_1_)
        {
            float f = BlockFluid.func_288_b(field_615_ag.func_602_e(i, j, k)) - 0.1111111F;
            float f1 = (float)(j + 1) - f;
            return d < (double)f1;
        } else
        {
            return false;
        }
    }

    public float func_373_s()
    {
        return 0.0F;
    }

    public boolean func_359_G()
    {
        return field_615_ag.func_689_a(field_601_au.func_1177_b(-0.10000000149011612D, -0.40000000596046448D, -0.10000000149011612D), Material.field_1331_g);
    }

    public void func_351_a(float p_351_1_, float p_351_2_, float p_351_3_)
    {
        float f = MathHelper.func_1113_c(p_351_1_ * p_351_1_ + p_351_2_ * p_351_2_);
        if(f < 0.01F)
        {
            return;
        }
        if(f < 1.0F)
        {
            f = 1.0F;
        }
        f = p_351_3_ / f;
        p_351_1_ *= f;
        p_351_2_ *= f;
        float f1 = MathHelper.func_1106_a((field_605_aq * 3.141593F) / 180F);
        float f2 = MathHelper.func_1114_b((field_605_aq * 3.141593F) / 180F);
        field_608_an += p_351_1_ * f2 - p_351_2_ * f1;
        field_606_ap += p_351_2_ * f2 + p_351_1_ * f1;
    }

    public int func_35115_a(float p_35115_1_)
    {
        int i = MathHelper.func_1108_b(field_611_ak);
        int j = MathHelper.func_1108_b(field_609_am);
        if(field_615_ag.func_630_d(i, 0, j))
        {
            double d = (field_601_au.field_1702_e - field_601_au.field_1697_b) * 0.66000000000000003D;
            int k = MathHelper.func_1108_b((field_610_al - (double)field_9292_aO) + d);
            return field_615_ag.func_35451_b(i, k, j, 0);
        } else
        {
            return 0;
        }
    }

    public float func_382_a(float p_382_1_)
    {
        int i = MathHelper.func_1108_b(field_611_ak);
        int j = MathHelper.func_1108_b(field_609_am);
        if(field_615_ag.func_630_d(i, 0, j))
        {
            double d = (field_601_au.field_1702_e - field_601_au.field_1697_b) * 0.66000000000000003D;
            int k = MathHelper.func_1108_b((field_610_al - (double)field_9292_aO) + d);
            return field_615_ag.func_598_c(i, k, j);
        } else
        {
            return 0.0F;
        }
    }

    public void func_398_a(World p_398_1_)
    {
        field_615_ag = p_398_1_;
    }

    public void func_399_b(double p_399_1_, double p_399_3_, double p_399_5_, float p_399_7_, 
            float p_399_8_)
    {
        field_9285_at = field_611_ak = p_399_1_;
        field_9284_au = field_610_al = p_399_3_;
        field_9283_av = field_609_am = p_399_5_;
        field_603_as = field_605_aq = p_399_7_;
        field_602_at = field_604_ar = p_399_8_;
        field_9287_aY = 0.0F;
        double d = field_603_as - p_399_7_;
        if(d < -180D)
        {
            field_603_as += 360F;
        }
        if(d >= 180D)
        {
            field_603_as -= 360F;
        }
        func_347_a(field_611_ak, field_610_al, field_609_am);
        func_376_c(p_399_7_, p_399_8_);
    }

    public void func_365_c(double p_365_1_, double p_365_3_, double p_365_5_, float p_365_7_, 
            float p_365_8_)
    {
        field_638_aI = field_9285_at = field_611_ak = p_365_1_;
        field_637_aJ = field_9284_au = field_610_al = p_365_3_ + (double)field_9292_aO;
        field_636_aK = field_9283_av = field_609_am = p_365_5_;
        field_605_aq = p_365_7_;
        field_604_ar = p_365_8_;
        func_347_a(field_611_ak, field_610_al, field_609_am);
    }

    public float func_379_d(Entity p_379_1_)
    {
        float f = (float)(field_611_ak - p_379_1_.field_611_ak);
        float f1 = (float)(field_610_al - p_379_1_.field_610_al);
        float f2 = (float)(field_609_am - p_379_1_.field_609_am);
        return MathHelper.func_1113_c(f * f + f1 * f1 + f2 * f2);
    }

    public double func_360_d(double p_360_1_, double p_360_3_, double p_360_5_)
    {
        double d = field_611_ak - p_360_1_;
        double d1 = field_610_al - p_360_3_;
        double d2 = field_609_am - p_360_5_;
        return d * d + d1 * d1 + d2 * d2;
    }

    public double func_361_e(double p_361_1_, double p_361_3_, double p_361_5_)
    {
        double d = field_611_ak - p_361_1_;
        double d1 = field_610_al - p_361_3_;
        double d2 = field_609_am - p_361_5_;
        return (double)MathHelper.func_1109_a(d * d + d1 * d1 + d2 * d2);
    }

    public double func_387_e(Entity p_387_1_)
    {
        double d = field_611_ak - p_387_1_.field_611_ak;
        double d1 = field_610_al - p_387_1_.field_610_al;
        double d2 = field_609_am - p_387_1_.field_609_am;
        return d * d + d1 * d1 + d2 * d2;
    }

    public void func_6378_b(EntityPlayer entityplayer)
    {
    }

    public void func_380_f(Entity p_380_1_)
    {
        if(p_380_1_.field_617_ae == this || p_380_1_.field_616_af == this)
        {
            return;
        }
        double d = p_380_1_.field_611_ak - field_611_ak;
        double d1 = p_380_1_.field_609_am - field_609_am;
        double d2 = MathHelper.func_1107_a(d, d1);
        if(d2 >= 0.0099999997764825821D)
        {
            d2 = MathHelper.func_1109_a(d2);
            d /= d2;
            d1 /= d2;
            double d3 = 1.0D / d2;
            if(d3 > 1.0D)
            {
                d3 = 1.0D;
            }
            d *= d3;
            d1 *= d3;
            d *= 0.05000000074505806D;
            d1 *= 0.05000000074505806D;
            d *= 1.0F - field_632_aO;
            d1 *= 1.0F - field_632_aO;
            func_348_f(-d, 0.0D, -d1);
            p_380_1_.func_348_f(d, 0.0D, d1);
        }
    }

    public void func_348_f(double p_348_1_, double p_348_3_, double p_348_5_)
    {
        field_608_an += p_348_1_;
        field_607_ao += p_348_3_;
        field_606_ap += p_348_5_;
        field_35118_ao = true;
    }

    protected void func_9281_M()
    {
        field_9294_aL = true;
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        func_9281_M();
        return false;
    }

    public boolean func_401_c_()
    {
        return false;
    }

    public boolean func_385_d_()
    {
        return false;
    }

    public void func_364_b(Entity entity, int i)
    {
    }

    public boolean func_390_a(Vec3D p_390_1_)
    {
        double d = field_611_ak - p_390_1_.field_1776_a;
        double d1 = field_610_al - p_390_1_.field_1775_b;
        double d2 = field_609_am - p_390_1_.field_1779_c;
        double d3 = d * d + d1 * d1 + d2 * d2;
        return func_384_a(d3);
    }

    public boolean func_384_a(double p_384_1_)
    {
        double d = field_601_au.func_1164_b();
        d *= 64D * field_619_ac;
        return p_384_1_ < d * d;
    }

    public String func_6376_z()
    {
        return null;
    }

    public boolean func_358_c(NBTTagCompound p_358_1_)
    {
        String s = func_389_H();
        if(field_646_aA || s == null)
        {
            return false;
        } else
        {
            p_358_1_.func_754_a("id", s);
            func_363_d(p_358_1_);
            return true;
        }
    }

    public void func_363_d(NBTTagCompound p_363_1_)
    {
        p_363_1_.func_762_a("Pos", func_375_a(new double[] {
            field_611_ak, field_610_al + (double)field_9287_aY, field_609_am
        }));
        p_363_1_.func_762_a("Motion", func_375_a(new double[] {
            field_608_an, field_607_ao, field_606_ap
        }));
        p_363_1_.func_762_a("Rotation", func_377_a(new float[] {
            field_605_aq, field_604_ar
        }));
        p_363_1_.func_744_a("FallDistance", field_9288_aU);
        p_363_1_.func_749_a("Fire", (short)field_9309_bg);
        p_363_1_.func_749_a("Air", (short)func_41001_Z());
        p_363_1_.func_748_a("OnGround", field_9298_aH);
        func_352_a(p_363_1_);
    }

    public void func_368_e(NBTTagCompound p_368_1_)
    {
        NBTTagList nbttaglist = p_368_1_.func_753_l("Pos");
        NBTTagList nbttaglist1 = p_368_1_.func_753_l("Motion");
        NBTTagList nbttaglist2 = p_368_1_.func_753_l("Rotation");
        field_608_an = ((NBTTagDouble)nbttaglist1.func_741_a(0)).field_1089_a;
        field_607_ao = ((NBTTagDouble)nbttaglist1.func_741_a(1)).field_1089_a;
        field_606_ap = ((NBTTagDouble)nbttaglist1.func_741_a(2)).field_1089_a;
        if(Math.abs(field_608_an) > 10D)
        {
            field_608_an = 0.0D;
        }
        if(Math.abs(field_607_ao) > 10D)
        {
            field_607_ao = 0.0D;
        }
        if(Math.abs(field_606_ap) > 10D)
        {
            field_606_ap = 0.0D;
        }
        field_9285_at = field_638_aI = field_611_ak = ((NBTTagDouble)nbttaglist.func_741_a(0)).field_1089_a;
        field_9284_au = field_637_aJ = field_610_al = ((NBTTagDouble)nbttaglist.func_741_a(1)).field_1089_a;
        field_9283_av = field_636_aK = field_609_am = ((NBTTagDouble)nbttaglist.func_741_a(2)).field_1089_a;
        field_603_as = field_605_aq = ((NBTTagFloat)nbttaglist2.func_741_a(0)).field_1097_a;
        field_602_at = field_604_ar = ((NBTTagFloat)nbttaglist2.func_741_a(1)).field_1097_a;
        field_9288_aU = p_368_1_.func_752_g("FallDistance");
        field_9309_bg = p_368_1_.func_745_d("Fire");
        func_41003_g(p_368_1_.func_745_d("Air"));
        field_9298_aH = p_368_1_.func_760_m("OnGround");
        func_347_a(field_611_ak, field_610_al, field_609_am);
        func_376_c(field_605_aq, field_604_ar);
        func_357_b(p_368_1_);
    }

    protected final String func_389_H()
    {
        return EntityList.func_1083_b(this);
    }

    protected abstract void func_357_b(NBTTagCompound nbttagcompound);

    protected abstract void func_352_a(NBTTagCompound nbttagcompound);

    protected NBTTagList func_375_a(double p_375_1_[])
    {
        NBTTagList nbttaglist = new NBTTagList();
        double ad[] = p_375_1_;
        int i = ad.length;
        for(int j = 0; j < i; j++)
        {
            double d = ad[j];
            nbttaglist.func_742_a(new NBTTagDouble(null, d));
        }

        return nbttaglist;
    }

    protected NBTTagList func_377_a(float p_377_1_[])
    {
        NBTTagList nbttaglist = new NBTTagList();
        float af[] = p_377_1_;
        int i = af.length;
        for(int j = 0; j < i; j++)
        {
            float f = af[j];
            nbttaglist.func_742_a(new NBTTagFloat(null, f));
        }

        return nbttaglist;
    }

    public float func_392_h_()
    {
        return field_643_aD / 2.0F;
    }

    public EntityItem func_367_b(int p_367_1_, int p_367_2_)
    {
        return func_394_a(p_367_1_, p_367_2_, 0.0F);
    }

    public EntityItem func_394_a(int p_394_1_, int p_394_2_, float p_394_3_)
    {
        return func_21058_a(new ItemStack(p_394_1_, p_394_2_, 0), p_394_3_);
    }

    public EntityItem func_21058_a(ItemStack p_21058_1_, float p_21058_2_)
    {
        EntityItem entityitem = new EntityItem(field_615_ag, field_611_ak, field_610_al + (double)p_21058_2_, field_609_am, p_21058_1_);
        entityitem.field_805_c = 10;
        field_615_ag.func_674_a(entityitem);
        return entityitem;
    }

    public boolean func_354_B()
    {
        return !field_646_aA;
    }

    public boolean func_345_I()
    {
        for(int i = 0; i < 8; i++)
        {
            float f = ((float)((i >> 0) % 2) - 0.5F) * field_644_aC * 0.8F;
            float f1 = ((float)((i >> 1) % 2) - 0.5F) * 0.1F;
            float f2 = ((float)((i >> 2) % 2) - 0.5F) * field_644_aC * 0.8F;
            int j = MathHelper.func_1108_b(field_611_ak + (double)f);
            int k = MathHelper.func_1108_b(field_610_al + (double)func_373_s() + (double)f1);
            int l = MathHelper.func_1108_b(field_609_am + (double)f2);
            if(field_615_ag.func_28100_h(j, k, l))
            {
                return true;
            }
        }

        return false;
    }

    public boolean func_353_a(EntityPlayer p_353_1_)
    {
        return false;
    }

    public AxisAlignedBB func_383_b_(Entity p_383_1_)
    {
        return null;
    }

    public void func_350_p()
    {
        if(field_616_af.field_646_aA)
        {
            field_616_af = null;
            return;
        }
        field_608_an = 0.0D;
        field_607_ao = 0.0D;
        field_606_ap = 0.0D;
        func_370_e_();
        if(field_616_af == null)
        {
            return;
        }
        field_616_af.func_366_i_();
        field_667_e += field_616_af.field_605_aq - field_616_af.field_603_as;
        field_861_d += field_616_af.field_604_ar - field_616_af.field_602_at;
        for(; field_667_e >= 180D; field_667_e -= 360D) { }
        for(; field_667_e < -180D; field_667_e += 360D) { }
        for(; field_861_d >= 180D; field_861_d -= 360D) { }
        for(; field_861_d < -180D; field_861_d += 360D) { }
        double d = field_667_e * 0.5D;
        double d1 = field_861_d * 0.5D;
        float f = 10F;
        if(d > (double)f)
        {
            d = f;
        }
        if(d < (double)(-f))
        {
            d = -f;
        }
        if(d1 > (double)f)
        {
            d1 = f;
        }
        if(d1 < (double)(-f))
        {
            d1 = -f;
        }
        field_667_e -= d;
        field_861_d -= d1;
        field_605_aq += d;
        field_604_ar += d1;
    }

    public void func_366_i_()
    {
        field_617_ae.func_347_a(field_611_ak, field_610_al + func_402_h() + field_617_ae.func_388_v(), field_609_am);
    }

    public double func_388_v()
    {
        return (double)field_9292_aO;
    }

    public double func_402_h()
    {
        return (double)field_643_aD * 0.75D;
    }

    public void func_6377_h(Entity p_6377_1_)
    {
        field_861_d = 0.0D;
        field_667_e = 0.0D;
        if(p_6377_1_ == null)
        {
            if(field_616_af != null)
            {
                func_365_c(field_616_af.field_611_ak, field_616_af.field_601_au.field_1697_b + (double)field_616_af.field_643_aD, field_616_af.field_609_am, field_605_aq, field_604_ar);
                field_616_af.field_617_ae = null;
            }
            field_616_af = null;
            return;
        }
        if(field_616_af == p_6377_1_)
        {
            field_616_af.field_617_ae = null;
            field_616_af = null;
            func_365_c(p_6377_1_.field_611_ak, p_6377_1_.field_601_au.field_1697_b + (double)p_6377_1_.field_643_aD, p_6377_1_.field_609_am, field_605_aq, field_604_ar);
            return;
        }
        if(field_616_af != null)
        {
            field_616_af.field_617_ae = null;
        }
        if(p_6377_1_.field_617_ae != null)
        {
            p_6377_1_.field_617_ae.field_616_af = null;
        }
        field_616_af = p_6377_1_;
        p_6377_1_.field_617_ae = this;
    }

    public void func_378_a(double p_378_1_, double p_378_3_, double p_378_5_, float p_378_7_, 
            float p_378_8_, int p_378_9_)
    {
        func_347_a(p_378_1_, p_378_3_, p_378_5_);
        func_376_c(p_378_7_, p_378_8_);
        List list = field_615_ag.func_697_a(this, field_601_au.func_28195_e(0.03125D, 0.0D, 0.03125D));
        if(list.size() > 0)
        {
            double d = 0.0D;
            for(int i = 0; i < list.size(); i++)
            {
                AxisAlignedBB axisalignedbb = (AxisAlignedBB)list.get(i);
                if(axisalignedbb.field_1702_e > d)
                {
                    d = axisalignedbb.field_1702_e;
                }
            }

            p_378_3_ += d - field_601_au.field_1697_b;
            func_347_a(p_378_1_, p_378_3_, p_378_5_);
        }
    }

    public float func_4035_j_()
    {
        return 0.1F;
    }

    public Vec3D func_4037_H()
    {
        return null;
    }

    public void func_4039_q()
    {
    }

    public void func_6375_a(double p_6375_1_, double p_6375_3_, double p_6375_5_)
    {
        field_608_an = p_6375_1_;
        field_607_ao = p_6375_3_;
        field_606_ap = p_6375_5_;
    }

    public void func_9282_a(byte byte0)
    {
    }

    public void func_9280_g()
    {
    }

    public void func_20046_s()
    {
    }

    public void func_20045_c(int i, int j, int k)
    {
    }

    public boolean func_21062_U()
    {
        return field_9309_bg > 0 || func_21060_d(0);
    }

    public boolean func_21063_V()
    {
        return field_616_af != null || func_21060_d(2);
    }

    public boolean func_381_o()
    {
        return func_21060_d(1);
    }

    public void func_48078_c(boolean p_48078_1_)
    {
        func_21059_b(1, p_48078_1_);
    }

    public boolean func_35117_Q()
    {
        return func_21060_d(3);
    }

    public void func_35113_c(boolean p_35113_1_)
    {
        func_21059_b(3, p_35113_1_);
    }

    public boolean func_35114_R()
    {
        return func_21060_d(4);
    }

    public void func_35116_d(boolean p_35116_1_)
    {
        func_21059_b(4, p_35116_1_);
    }

    protected boolean func_21060_d(int p_21060_1_)
    {
        return (field_21064_bx.func_21130_a(0) & 1 << p_21060_1_) != 0;
    }

    protected void func_21059_b(int p_21059_1_, boolean p_21059_2_)
    {
        byte byte0 = field_21064_bx.func_21130_a(0);
        if(p_21059_2_)
        {
            field_21064_bx.func_21129_b(0, Byte.valueOf((byte)(byte0 | 1 << p_21059_1_)));
        } else
        {
            field_21064_bx.func_21129_b(0, Byte.valueOf((byte)(byte0 & ~(1 << p_21059_1_))));
        }
    }

    public int func_41001_Z()
    {
        return field_21064_bx.func_41062_b(1);
    }

    public void func_41003_g(int p_41003_1_)
    {
        field_21064_bx.func_21129_b(1, Short.valueOf((short)p_41003_1_));
    }

    public void func_27014_a(EntityLightningBolt p_27014_1_)
    {
        func_355_a(5);
        field_9309_bg++;
        if(field_9309_bg == 0)
        {
            func_40046_d(8);
        }
    }

    public void func_27015_a(EntityLiving entityliving)
    {
    }

    protected boolean func_28014_c(double p_28014_1_, double p_28014_3_, double p_28014_5_)
    {
        int i = MathHelper.func_1108_b(p_28014_1_);
        int j = MathHelper.func_1108_b(p_28014_3_);
        int k = MathHelper.func_1108_b(p_28014_5_);
        double d = p_28014_1_ - (double)i;
        double d1 = p_28014_3_ - (double)j;
        double d2 = p_28014_5_ - (double)k;
        if(field_615_ag.func_28100_h(i, j, k))
        {
            boolean flag = !field_615_ag.func_28100_h(i - 1, j, k);
            boolean flag1 = !field_615_ag.func_28100_h(i + 1, j, k);
            boolean flag2 = !field_615_ag.func_28100_h(i, j - 1, k);
            boolean flag3 = !field_615_ag.func_28100_h(i, j + 1, k);
            boolean flag4 = !field_615_ag.func_28100_h(i, j, k - 1);
            boolean flag5 = !field_615_ag.func_28100_h(i, j, k + 1);
            byte byte0 = -1;
            double d3 = 9999D;
            if(flag && d < d3)
            {
                d3 = d;
                byte0 = 0;
            }
            if(flag1 && 1.0D - d < d3)
            {
                d3 = 1.0D - d;
                byte0 = 1;
            }
            if(flag2 && d1 < d3)
            {
                d3 = d1;
                byte0 = 2;
            }
            if(flag3 && 1.0D - d1 < d3)
            {
                d3 = 1.0D - d1;
                byte0 = 3;
            }
            if(flag4 && d2 < d3)
            {
                d3 = d2;
                byte0 = 4;
            }
            if(flag5 && 1.0D - d2 < d3)
            {
                double d4 = 1.0D - d2;
                byte0 = 5;
            }
            float f = field_9312_bd.nextFloat() * 0.2F + 0.1F;
            if(byte0 == 0)
            {
                field_608_an = -f;
            }
            if(byte0 == 1)
            {
                field_608_an = f;
            }
            if(byte0 == 2)
            {
                field_607_ao = -f;
            }
            if(byte0 == 3)
            {
                field_607_ao = f;
            }
            if(byte0 == 4)
            {
                field_606_ap = -f;
            }
            if(byte0 == 5)
            {
                field_606_ap = f;
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void func_35112_o()
    {
        field_27016_ba = true;
        field_9288_aU = 0.0F;
    }

    public Entity[] func_40048_X()
    {
        return null;
    }

    public boolean func_41004_h(Entity p_41004_1_)
    {
        return this == p_41004_1_;
    }

    public void func_48079_f(float f)
    {
    }

    public boolean func_48080_j()
    {
        return true;
    }

}
