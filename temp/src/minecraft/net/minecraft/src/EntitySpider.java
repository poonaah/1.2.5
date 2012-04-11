// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityMob, DataWatcher, World, Entity, 
//            MathHelper, Item, EnumCreatureAttribute, PotionEffect, 
//            Potion, NBTTagCompound

public class EntitySpider extends EntityMob
{

    public EntitySpider(World p_i258_1_)
    {
        super(p_i258_1_);
        field_9357_z = "/mob/spider.png";
        func_371_a(1.4F, 0.9F);
        field_9333_am = 0.8F;
    }

    protected void func_21057_b()
    {
        super.func_21057_b();
        field_21064_bx.func_21124_a(16, new Byte((byte)0));
    }

    public void func_425_j()
    {
        super.func_425_j();
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        if(!field_615_ag.field_1026_y)
        {
            func_40148_a(field_9297_aI);
        }
    }

    public int func_40117_c()
    {
        return 16;
    }

    public double func_402_h()
    {
        return (double)field_643_aD * 0.75D - 0.5D;
    }

    protected boolean func_25021_m()
    {
        return false;
    }

    protected Entity func_438_i()
    {
        float f = func_382_a(1.0F);
        if(f < 0.5F)
        {
            double d = 16D;
            return field_615_ag.func_40480_b(this, d);
        } else
        {
            return null;
        }
    }

    protected String func_6389_d()
    {
        return "mob.spider";
    }

    protected String func_6394_f_()
    {
        return "mob.spider";
    }

    protected String func_6390_f()
    {
        return "mob.spiderdeath";
    }

    protected void func_437_a(Entity p_437_1_, float p_437_2_)
    {
        float f = func_382_a(1.0F);
        if(f > 0.5F && field_9312_bd.nextInt(100) == 0)
        {
            field_751_f = null;
            return;
        }
        if(p_437_2_ > 2.0F && p_437_2_ < 6F && field_9312_bd.nextInt(10) == 0)
        {
            if(field_9298_aH)
            {
                double d = p_437_1_.field_611_ak - field_611_ak;
                double d1 = p_437_1_.field_609_am - field_609_am;
                float f1 = MathHelper.func_1109_a(d * d + d1 * d1);
                field_608_an = (d / (double)f1) * 0.5D * 0.80000001192092896D + field_608_an * 0.20000000298023224D;
                field_606_ap = (d1 / (double)f1) * 0.5D * 0.80000001192092896D + field_606_ap * 0.20000000298023224D;
                field_607_ao = 0.40000000596046448D;
            }
        } else
        {
            super.func_437_a(p_437_1_, p_437_2_);
        }
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
    }

    protected int func_422_g()
    {
        return Item.field_253_I.field_291_aS;
    }

    protected void func_21066_o(boolean p_21066_1_, int p_21066_2_)
    {
        super.func_21066_o(p_21066_1_, p_21066_2_);
        if(p_21066_1_ && (field_9312_bd.nextInt(3) == 0 || field_9312_bd.nextInt(1 + p_21066_2_) > 0))
        {
            func_367_b(Item.field_40415_bu.field_291_aS, 1);
        }
    }

    public boolean func_429_A()
    {
        return func_40149_l_();
    }

    public void func_35112_o()
    {
    }

    public float func_35188_k_()
    {
        return 1.0F;
    }

    public EnumCreatureAttribute func_40124_t()
    {
        return EnumCreatureAttribute.ARTHROPOD;
    }

    public boolean func_40126_a(PotionEffect p_40126_1_)
    {
        if(p_40126_1_.func_35799_a() == Potion.field_35689_u.field_35670_H)
        {
            return false;
        } else
        {
            return super.func_40126_a(p_40126_1_);
        }
    }

    public boolean func_40149_l_()
    {
        return (field_21064_bx.func_21130_a(16) & 1) != 0;
    }

    public void func_40148_a(boolean p_40148_1_)
    {
        byte byte0 = field_21064_bx.func_21130_a(16);
        if(p_40148_1_)
        {
            byte0 |= 1;
        } else
        {
            byte0 &= 0xfe;
        }
        field_21064_bx.func_21129_b(16, Byte.valueOf(byte0));
    }
}
