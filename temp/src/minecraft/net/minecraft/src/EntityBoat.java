// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, DataWatcher, World, Block, 
//            Item, AxisAlignedBB, Material, MathHelper, 
//            EntityPlayer, DamageSource, NBTTagCompound

public class EntityBoat extends Entity
{

    private int field_9394_d;
    private double field_9393_e;
    private double field_9392_f;
    private double field_9391_g;
    private double field_9390_h;
    private double field_9389_i;
    private double field_9388_j;
    private double field_9387_k;
    private double field_9386_l;

    public EntityBoat(World p_i305_1_)
    {
        super(p_i305_1_);
        field_618_ad = true;
        func_371_a(1.5F, 0.6F);
        field_9292_aO = field_643_aD / 2.0F;
    }

    protected boolean func_25021_m()
    {
        return false;
    }

    protected void func_21057_b()
    {
        field_21064_bx.func_21124_a(17, new Integer(0));
        field_21064_bx.func_21124_a(18, new Integer(1));
        field_21064_bx.func_21124_a(19, new Integer(0));
    }

    public AxisAlignedBB func_383_b_(Entity p_383_1_)
    {
        return p_383_1_.field_601_au;
    }

    public AxisAlignedBB func_372_f_()
    {
        return field_601_au;
    }

    public boolean func_385_d_()
    {
        return true;
    }

    public EntityBoat(World p_i306_1_, double p_i306_2_, double p_i306_4_, double p_i306_6_)
    {
        this(p_i306_1_);
        func_347_a(p_i306_2_, p_i306_4_ + (double)field_9292_aO, p_i306_6_);
        field_608_an = 0.0D;
        field_607_ao = 0.0D;
        field_606_ap = 0.0D;
        field_9285_at = p_i306_2_;
        field_9284_au = p_i306_4_;
        field_9283_av = p_i306_6_;
    }

    public double func_402_h()
    {
        return (double)field_643_aD * 0.0D - 0.30000001192092896D;
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        if(field_615_ag.field_1026_y || field_646_aA)
        {
            return true;
        }
        func_41017_d(-func_41016_i());
        func_41019_c(10);
        func_41015_b(func_41020_g() + p_396_2_ * 10);
        func_9281_M();
        if(func_41020_g() > 40)
        {
            if(field_617_ae != null)
            {
                field_617_ae.func_6377_h(this);
            }
            for(int i = 0; i < 3; i++)
            {
                func_394_a(Block.field_334_y.field_376_bc, 1, 0.0F);
            }

            for(int j = 0; j < 2; j++)
            {
                func_394_a(Item.field_266_B.field_291_aS, 1, 0.0F);
            }

            func_395_F();
        }
        return true;
    }

    public void func_9280_g()
    {
        func_41017_d(-func_41016_i());
        func_41019_c(10);
        func_41015_b(func_41020_g() * 11);
    }

    public boolean func_401_c_()
    {
        return !field_646_aA;
    }

    public void func_378_a(double p_378_1_, double p_378_3_, double p_378_5_, float p_378_7_, 
            float p_378_8_, int p_378_9_)
    {
        field_9393_e = p_378_1_;
        field_9392_f = p_378_3_;
        field_9391_g = p_378_5_;
        field_9390_h = p_378_7_;
        field_9389_i = p_378_8_;
        field_9394_d = p_378_9_ + 4;
        field_608_an = field_9388_j;
        field_607_ao = field_9387_k;
        field_606_ap = field_9386_l;
    }

    public void func_6375_a(double p_6375_1_, double p_6375_3_, double p_6375_5_)
    {
        field_9388_j = field_608_an = p_6375_1_;
        field_9387_k = field_607_ao = p_6375_3_;
        field_9386_l = field_606_ap = p_6375_5_;
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        if(func_41018_h() > 0)
        {
            func_41019_c(func_41018_h() - 1);
        }
        if(func_41020_g() > 0)
        {
            func_41015_b(func_41020_g() - 1);
        }
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        int i = 5;
        double d = 0.0D;
        for(int j = 0; j < i; j++)
        {
            double d2 = (field_601_au.field_1697_b + ((field_601_au.field_1702_e - field_601_au.field_1697_b) * (double)(j + 0)) / (double)i) - 0.125D;
            double d8 = (field_601_au.field_1697_b + ((field_601_au.field_1702_e - field_601_au.field_1697_b) * (double)(j + 1)) / (double)i) - 0.125D;
            AxisAlignedBB axisalignedbb = AxisAlignedBB.func_1161_b(field_601_au.field_1698_a, d2, field_601_au.field_1704_c, field_601_au.field_1703_d, d8, field_601_au.field_1701_f);
            if(field_615_ag.func_707_b(axisalignedbb, Material.field_1332_f))
            {
                d += 1.0D / (double)i;
            }
        }

        double d1 = Math.sqrt(field_608_an * field_608_an + field_606_ap * field_606_ap);
        if(d1 > 0.14999999999999999D)
        {
            double d3 = Math.cos(((double)field_605_aq * 3.1415926535897931D) / 180D);
            double d9 = Math.sin(((double)field_605_aq * 3.1415926535897931D) / 180D);
            for(int i1 = 0; (double)i1 < 1.0D + d1 * 60D; i1++)
            {
                double d16 = field_9312_bd.nextFloat() * 2.0F - 1.0F;
                double d19 = (double)(field_9312_bd.nextInt(2) * 2 - 1) * 0.69999999999999996D;
                if(field_9312_bd.nextBoolean())
                {
                    double d21 = (field_611_ak - d3 * d16 * 0.80000000000000004D) + d9 * d19;
                    double d23 = field_609_am - d9 * d16 * 0.80000000000000004D - d3 * d19;
                    field_615_ag.func_694_a("splash", d21, field_610_al - 0.125D, d23, field_608_an, field_607_ao, field_606_ap);
                } else
                {
                    double d22 = field_611_ak + d3 + d9 * d16 * 0.69999999999999996D;
                    double d24 = (field_609_am + d9) - d3 * d16 * 0.69999999999999996D;
                    field_615_ag.func_694_a("splash", d22, field_610_al - 0.125D, d24, field_608_an, field_607_ao, field_606_ap);
                }
            }

        }
        if(field_615_ag.field_1026_y)
        {
            if(field_9394_d > 0)
            {
                double d4 = field_611_ak + (field_9393_e - field_611_ak) / (double)field_9394_d;
                double d10 = field_610_al + (field_9392_f - field_610_al) / (double)field_9394_d;
                double d13 = field_609_am + (field_9391_g - field_609_am) / (double)field_9394_d;
                double d17;
                for(d17 = field_9390_h - (double)field_605_aq; d17 < -180D; d17 += 360D) { }
                for(; d17 >= 180D; d17 -= 360D) { }
                field_605_aq += d17 / (double)field_9394_d;
                field_604_ar += (field_9389_i - (double)field_604_ar) / (double)field_9394_d;
                field_9394_d--;
                func_347_a(d4, d10, d13);
                func_376_c(field_605_aq, field_604_ar);
            } else
            {
                double d5 = field_611_ak + field_608_an;
                double d11 = field_610_al + field_607_ao;
                double d14 = field_609_am + field_606_ap;
                func_347_a(d5, d11, d14);
                if(field_9298_aH)
                {
                    field_608_an *= 0.5D;
                    field_607_ao *= 0.5D;
                    field_606_ap *= 0.5D;
                }
                field_608_an *= 0.99000000953674316D;
                field_607_ao *= 0.94999998807907104D;
                field_606_ap *= 0.99000000953674316D;
            }
            return;
        }
        if(d < 1.0D)
        {
            double d6 = d * 2D - 1.0D;
            field_607_ao += 0.039999999105930328D * d6;
        } else
        {
            if(field_607_ao < 0.0D)
            {
                field_607_ao /= 2D;
            }
            field_607_ao += 0.0070000002160668373D;
        }
        if(field_617_ae != null)
        {
            field_608_an += field_617_ae.field_608_an * 0.20000000000000001D;
            field_606_ap += field_617_ae.field_606_ap * 0.20000000000000001D;
        }
        double d7 = 0.40000000000000002D;
        if(field_608_an < -d7)
        {
            field_608_an = -d7;
        }
        if(field_608_an > d7)
        {
            field_608_an = d7;
        }
        if(field_606_ap < -d7)
        {
            field_606_ap = -d7;
        }
        if(field_606_ap > d7)
        {
            field_606_ap = d7;
        }
        if(field_9298_aH)
        {
            field_608_an *= 0.5D;
            field_607_ao *= 0.5D;
            field_606_ap *= 0.5D;
        }
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        if(field_9297_aI && d1 > 0.20000000000000001D)
        {
            if(!field_615_ag.field_1026_y)
            {
                func_395_F();
                for(int k = 0; k < 3; k++)
                {
                    func_394_a(Block.field_334_y.field_376_bc, 1, 0.0F);
                }

                for(int l = 0; l < 2; l++)
                {
                    func_394_a(Item.field_266_B.field_291_aS, 1, 0.0F);
                }

            }
        } else
        {
            field_608_an *= 0.99000000953674316D;
            field_607_ao *= 0.94999998807907104D;
            field_606_ap *= 0.99000000953674316D;
        }
        field_604_ar = 0.0F;
        double d12 = field_605_aq;
        double d15 = field_9285_at - field_611_ak;
        double d18 = field_9283_av - field_609_am;
        if(d15 * d15 + d18 * d18 > 0.001D)
        {
            d12 = (float)((Math.atan2(d18, d15) * 180D) / 3.1415926535897931D);
        }
        double d20;
        for(d20 = d12 - (double)field_605_aq; d20 >= 180D; d20 -= 360D) { }
        for(; d20 < -180D; d20 += 360D) { }
        if(d20 > 20D)
        {
            d20 = 20D;
        }
        if(d20 < -20D)
        {
            d20 = -20D;
        }
        field_605_aq += d20;
        func_376_c(field_605_aq, field_604_ar);
        List list = field_615_ag.func_659_b(this, field_601_au.func_1177_b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
        if(list != null && list.size() > 0)
        {
            for(int j1 = 0; j1 < list.size(); j1++)
            {
                Entity entity = (Entity)list.get(j1);
                if(entity != field_617_ae && entity.func_385_d_() && (entity instanceof EntityBoat))
                {
                    entity.func_380_f(this);
                }
            }

        }
        for(int k1 = 0; k1 < 4; k1++)
        {
            int l1 = MathHelper.func_1108_b(field_611_ak + ((double)(k1 % 2) - 0.5D) * 0.80000000000000004D);
            int i2 = MathHelper.func_1108_b(field_610_al);
            int j2 = MathHelper.func_1108_b(field_609_am + ((double)(k1 / 2) - 0.5D) * 0.80000000000000004D);
            if(field_615_ag.func_600_a(l1, i2, j2) == Block.field_428_aT.field_376_bc)
            {
                field_615_ag.func_690_d(l1, i2, j2, 0);
            }
        }

        if(field_617_ae != null && field_617_ae.field_646_aA)
        {
            field_617_ae = null;
        }
    }

    public void func_366_i_()
    {
        if(field_617_ae == null)
        {
            return;
        } else
        {
            double d = Math.cos(((double)field_605_aq * 3.1415926535897931D) / 180D) * 0.40000000000000002D;
            double d1 = Math.sin(((double)field_605_aq * 3.1415926535897931D) / 180D) * 0.40000000000000002D;
            field_617_ae.func_347_a(field_611_ak + d, field_610_al + func_402_h() + field_617_ae.func_388_v(), field_609_am + d1);
            return;
        }
    }

    protected void func_352_a(NBTTagCompound nbttagcompound)
    {
    }

    protected void func_357_b(NBTTagCompound nbttagcompound)
    {
    }

    public float func_392_h_()
    {
        return 0.0F;
    }

    public boolean func_353_a(EntityPlayer p_353_1_)
    {
        if(field_617_ae != null && (field_617_ae instanceof EntityPlayer) && field_617_ae != p_353_1_)
        {
            return true;
        }
        if(!field_615_ag.field_1026_y)
        {
            p_353_1_.func_6377_h(this);
        }
        return true;
    }

    public void func_41015_b(int p_41015_1_)
    {
        field_21064_bx.func_21129_b(19, Integer.valueOf(p_41015_1_));
    }

    public int func_41020_g()
    {
        return field_21064_bx.func_25115_b(19);
    }

    public void func_41019_c(int p_41019_1_)
    {
        field_21064_bx.func_21129_b(17, Integer.valueOf(p_41019_1_));
    }

    public int func_41018_h()
    {
        return field_21064_bx.func_25115_b(17);
    }

    public void func_41017_d(int p_41017_1_)
    {
        field_21064_bx.func_21129_b(18, Integer.valueOf(p_41017_1_));
    }

    public int func_41016_i()
    {
        return field_21064_bx.func_25115_b(18);
    }
}
