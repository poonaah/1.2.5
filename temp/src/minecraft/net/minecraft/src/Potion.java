// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityLiving, DamageSource, EntityPlayer, PotionEffect, 
//            PotionHealth

public class Potion
{

    public static final Potion field_35678_a[] = new Potion[32];
    public static final Potion field_35676_b = null;
    public static final Potion field_35677_c = (new Potion(1, false, 0x7cafc6)).func_35661_a("potion.moveSpeed").func_40618_a(0, 0);
    public static final Potion field_35674_d = (new Potion(2, true, 0x5a6c81)).func_35661_a("potion.moveSlowdown").func_40618_a(1, 0);
    public static final Potion field_35675_e = (new Potion(3, false, 0xd9c043)).func_35661_a("potion.digSpeed").func_40618_a(2, 0).func_40614_a(1.5D);
    public static final Potion field_35672_f = (new Potion(4, true, 0x4a4217)).func_35661_a("potion.digSlowDown").func_40618_a(3, 0);
    public static final Potion field_35673_g = (new Potion(5, false, 0x932423)).func_35661_a("potion.damageBoost").func_40618_a(4, 0);
    public static final Potion field_35685_h = (new PotionHealth(6, false, 0xf82423)).func_35661_a("potion.heal");
    public static final Potion field_35686_i = (new PotionHealth(7, true, 0x430a09)).func_35661_a("potion.harm");
    public static final Potion field_35683_j = (new Potion(8, false, 0x786297)).func_35661_a("potion.jump").func_40618_a(2, 1);
    public static final Potion field_35684_k = (new Potion(9, true, 0x551d4a)).func_35661_a("potion.confusion").func_40618_a(3, 1).func_40614_a(0.25D);
    public static final Potion field_35681_l = (new Potion(10, false, 0xcd5cab)).func_35661_a("potion.regeneration").func_40618_a(7, 0).func_40614_a(0.25D);
    public static final Potion field_35682_m = (new Potion(11, false, 0x99453a)).func_35661_a("potion.resistance").func_40618_a(6, 1);
    public static final Potion field_35679_n = (new Potion(12, false, 0xe49a3a)).func_35661_a("potion.fireResistance").func_40618_a(7, 1);
    public static final Potion field_35680_o = (new Potion(13, false, 0x2e5299)).func_35661_a("potion.waterBreathing").func_40618_a(0, 2);
    public static final Potion field_35694_p = (new Potion(14, false, 0x7f8392)).func_35661_a("potion.invisibility").func_40618_a(0, 1).func_40616_h();
    public static final Potion field_35693_q = (new Potion(15, true, 0x1f1f23)).func_35661_a("potion.blindness").func_40618_a(5, 1).func_40614_a(0.25D);
    public static final Potion field_35692_r = (new Potion(16, false, 0x1f1fa1)).func_35661_a("potion.nightVision").func_40618_a(4, 1).func_40616_h();
    public static final Potion field_35691_s = (new Potion(17, true, 0x587653)).func_35661_a("potion.hunger").func_40618_a(1, 1);
    public static final Potion field_35690_t = (new Potion(18, true, 0x484d48)).func_35661_a("potion.weakness").func_40618_a(5, 0);
    public static final Potion field_35689_u = (new Potion(19, true, 0x4e9331)).func_35661_a("potion.poison").func_40618_a(6, 0).func_40614_a(0.25D);
    public static final Potion field_35688_v = null;
    public static final Potion field_35687_w = null;
    public static final Potion field_35697_x = null;
    public static final Potion field_35696_y = null;
    public static final Potion field_35695_z = null;
    public static final Potion field_35667_A = null;
    public static final Potion field_35668_B = null;
    public static final Potion field_35669_C = null;
    public static final Potion field_35663_D = null;
    public static final Potion field_35664_E = null;
    public static final Potion field_35665_F = null;
    public static final Potion field_35666_G = null;
    public final int field_35670_H;
    private String field_35671_I;
    private int field_40627_J;
    private final boolean field_40628_K;
    private double field_40624_L;
    private boolean field_40625_M;
    private final int field_40626_N;

    protected Potion(int p_i734_1_, boolean p_i734_2_, int p_i734_3_)
    {
        field_35671_I = "";
        field_40627_J = -1;
        field_35670_H = p_i734_1_;
        field_35678_a[p_i734_1_] = this;
        field_40628_K = p_i734_2_;
        if(p_i734_2_)
        {
            field_40624_L = 0.5D;
        } else
        {
            field_40624_L = 1.0D;
        }
        field_40626_N = p_i734_3_;
    }

    protected Potion func_40618_a(int p_40618_1_, int p_40618_2_)
    {
        field_40627_J = p_40618_1_ + p_40618_2_ * 8;
        return this;
    }

    public int func_40619_a()
    {
        return field_35670_H;
    }

    public void func_35662_a(EntityLiving p_35662_1_, int p_35662_2_)
    {
        if(field_35670_H == field_35681_l.field_35670_H)
        {
            if(p_35662_1_.func_40114_aH() < p_35662_1_.func_40117_c())
            {
                p_35662_1_.func_432_b(1);
            }
        } else
        if(field_35670_H == field_35689_u.field_35670_H)
        {
            if(p_35662_1_.func_40114_aH() > 1)
            {
                p_35662_1_.func_396_a(DamageSource.field_35545_l, 1);
            }
        } else
        if(field_35670_H == field_35691_s.field_35670_H && (p_35662_1_ instanceof EntityPlayer))
        {
            ((EntityPlayer)p_35662_1_).func_35198_d(0.025F * (float)(p_35662_2_ + 1));
        } else
        if(field_35670_H == field_35685_h.field_35670_H && !p_35662_1_.func_40122_aP() || field_35670_H == field_35686_i.field_35670_H && p_35662_1_.func_40122_aP())
        {
            p_35662_1_.func_432_b(6 << p_35662_2_);
        } else
        if(field_35670_H == field_35686_i.field_35670_H && !p_35662_1_.func_40122_aP() || field_35670_H == field_35685_h.field_35670_H && p_35662_1_.func_40122_aP())
        {
            p_35662_1_.func_396_a(DamageSource.field_35545_l, 6 << p_35662_2_);
        }
    }

    public void func_40613_a(EntityLiving p_40613_1_, EntityLiving p_40613_2_, int p_40613_3_, double p_40613_4_)
    {
        if(field_35670_H == field_35685_h.field_35670_H && !p_40613_2_.func_40122_aP() || field_35670_H == field_35686_i.field_35670_H && p_40613_2_.func_40122_aP())
        {
            int i = (int)(p_40613_4_ * (double)(6 << p_40613_3_) + 0.5D);
            p_40613_2_.func_432_b(i);
        } else
        if(field_35670_H == field_35686_i.field_35670_H && !p_40613_2_.func_40122_aP() || field_35670_H == field_35685_h.field_35670_H && p_40613_2_.func_40122_aP())
        {
            int j = (int)(p_40613_4_ * (double)(6 << p_40613_3_) + 0.5D);
            if(p_40613_1_ == null)
            {
                p_40613_2_.func_396_a(DamageSource.field_35545_l, j);
            } else
            {
                p_40613_2_.func_396_a(DamageSource.func_40542_b(p_40613_2_, p_40613_1_), j);
            }
        }
    }

    public boolean func_40622_b()
    {
        return false;
    }

    public boolean func_35660_a(int p_35660_1_, int p_35660_2_)
    {
        if(field_35670_H == field_35681_l.field_35670_H || field_35670_H == field_35689_u.field_35670_H)
        {
            int i = 25 >> p_35660_2_;
            if(i > 0)
            {
                return p_35660_1_ % i == 0;
            } else
            {
                return true;
            }
        }
        return field_35670_H == field_35691_s.field_35670_H;
    }

    public Potion func_35661_a(String p_35661_1_)
    {
        field_35671_I = p_35661_1_;
        return this;
    }

    public String func_40623_c()
    {
        return field_35671_I;
    }

    public boolean func_40617_d()
    {
        return field_40627_J >= 0;
    }

    public int func_40611_e()
    {
        return field_40627_J;
    }

    public boolean func_40615_f()
    {
        return field_40628_K;
    }

    public static String func_40620_a(PotionEffect p_40620_0_)
    {
        int i = p_40620_0_.func_35802_b();
        int j = i / 20;
        int k = j / 60;
        j %= 60;
        if(j < 10)
        {
            return (new StringBuilder()).append(k).append(":0").append(j).toString();
        } else
        {
            return (new StringBuilder()).append(k).append(":").append(j).toString();
        }
    }

    protected Potion func_40614_a(double p_40614_1_)
    {
        field_40624_L = p_40614_1_;
        return this;
    }

    public double func_40610_g()
    {
        return field_40624_L;
    }

    public Potion func_40616_h()
    {
        field_40625_M = true;
        return this;
    }

    public boolean func_40612_i()
    {
        return field_40625_M;
    }

    public int func_40621_j()
    {
        return field_40626_N;
    }

}
