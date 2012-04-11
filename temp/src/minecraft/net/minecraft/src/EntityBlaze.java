// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityMob, DataWatcher, World, DamageSource, 
//            Entity, AxisAlignedBB, MathHelper, EntitySmallFireball, 
//            Item, NBTTagCompound

public class EntityBlaze extends EntityMob
{

    private float field_40154_a;
    private int field_40153_b;
    private int field_40152_d;

    public EntityBlaze(World p_i36_1_)
    {
        super(p_i36_1_);
        field_40154_a = 0.5F;
        field_9357_z = "/mob/fire.png";
        field_9304_bm = true;
        field_762_e = 6;
        field_35171_bJ = 10;
    }

    public int func_40117_c()
    {
        return 20;
    }

    protected void func_21057_b()
    {
        super.func_21057_b();
        field_21064_bx.func_21124_a(16, new Byte((byte)0));
    }

    protected String func_6389_d()
    {
        return "mob.blaze.breathe";
    }

    protected String func_6394_f_()
    {
        return "mob.blaze.hit";
    }

    protected String func_6390_f()
    {
        return "mob.blaze.death";
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        return super.func_396_a(p_396_1_, p_396_2_);
    }

    public void func_419_b(DamageSource p_419_1_)
    {
        super.func_419_b(p_419_1_);
    }

    public int func_35115_a(float p_35115_1_)
    {
        return 0xf000f0;
    }

    public float func_382_a(float p_382_1_)
    {
        return 1.0F;
    }

    public void func_425_j()
    {
        if(!field_615_ag.field_1026_y)
        {
            if(func_27012_af())
            {
                func_396_a(DamageSource.field_35539_e, 1);
            }
            field_40153_b--;
            if(field_40153_b <= 0)
            {
                field_40153_b = 100;
                field_40154_a = 0.5F + (float)field_9312_bd.nextGaussian() * 3F;
            }
            if(func_25030_F() != null && func_25030_F().field_610_al + (double)func_25030_F().func_373_s() > field_610_al + (double)func_373_s() + (double)field_40154_a)
            {
                field_607_ao = field_607_ao + (0.30000001192092896D - field_607_ao) * 0.30000001192092896D;
            }
        }
        if(field_9312_bd.nextInt(24) == 0)
        {
            field_615_ag.func_684_a(field_611_ak + 0.5D, field_610_al + 0.5D, field_609_am + 0.5D, "fire.fire", 1.0F + field_9312_bd.nextFloat(), field_9312_bd.nextFloat() * 0.7F + 0.3F);
        }
        if(!field_9298_aH && field_607_ao < 0.0D)
        {
            field_607_ao *= 0.59999999999999998D;
        }
        for(int i = 0; i < 2; i++)
        {
            field_615_ag.func_694_a("largesmoke", field_611_ak + (field_9312_bd.nextDouble() - 0.5D) * (double)field_644_aC, field_610_al + field_9312_bd.nextDouble() * (double)field_643_aD, field_609_am + (field_9312_bd.nextDouble() - 0.5D) * (double)field_644_aC, 0.0D, 0.0D, 0.0D);
        }

        super.func_425_j();
    }

    protected void func_437_a(Entity p_437_1_, float p_437_2_)
    {
        if(field_9330_P <= 0 && p_437_2_ < 2.0F && p_437_1_.field_601_au.field_1702_e > field_601_au.field_1697_b && p_437_1_.field_601_au.field_1697_b < field_601_au.field_1702_e)
        {
            field_9330_P = 20;
            func_35175_b(p_437_1_);
        } else
        if(p_437_2_ < 30F)
        {
            double d = p_437_1_.field_611_ak - field_611_ak;
            double d1 = (p_437_1_.field_601_au.field_1697_b + (double)(p_437_1_.field_643_aD / 2.0F)) - (field_610_al + (double)(field_643_aD / 2.0F));
            double d2 = p_437_1_.field_609_am - field_609_am;
            if(field_9330_P == 0)
            {
                field_40152_d++;
                if(field_40152_d == 1)
                {
                    field_9330_P = 60;
                    func_40150_a(true);
                } else
                if(field_40152_d <= 4)
                {
                    field_9330_P = 6;
                } else
                {
                    field_9330_P = 100;
                    field_40152_d = 0;
                    func_40150_a(false);
                }
                if(field_40152_d > 1)
                {
                    float f = MathHelper.func_1113_c(p_437_2_) * 0.5F;
                    field_615_ag.func_28107_a(null, 1009, (int)field_611_ak, (int)field_610_al, (int)field_609_am, 0);
                    for(int i = 0; i < 1; i++)
                    {
                        EntitySmallFireball entitysmallfireball = new EntitySmallFireball(field_615_ag, this, d + field_9312_bd.nextGaussian() * (double)f, d1, d2 + field_9312_bd.nextGaussian() * (double)f);
                        entitysmallfireball.field_610_al = field_610_al + (double)(field_643_aD / 2.0F) + 0.5D;
                        field_615_ag.func_674_a(entitysmallfireball);
                    }

                }
            }
            field_605_aq = (float)((Math.atan2(d2, d) * 180D) / 3.1415927410125732D) - 90F;
            field_750_g = true;
        }
    }

    protected void func_400_c(float f)
    {
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
        return Item.field_40417_bo.field_291_aS;
    }

    public boolean func_21062_U()
    {
        return func_40151_ac();
    }

    protected void func_21066_o(boolean p_21066_1_, int p_21066_2_)
    {
        if(p_21066_1_)
        {
            int i = field_9312_bd.nextInt(2 + p_21066_2_);
            for(int j = 0; j < i; j++)
            {
                func_367_b(Item.field_40417_bo.field_291_aS, 1);
            }

        }
    }

    public boolean func_40151_ac()
    {
        return (field_21064_bx.func_21130_a(16) & 1) != 0;
    }

    public void func_40150_a(boolean p_40150_1_)
    {
        byte byte0 = field_21064_bx.func_21130_a(16);
        if(p_40150_1_)
        {
            byte0 |= 1;
        } else
        {
            byte0 &= 0xfe;
        }
        field_21064_bx.func_21129_b(16, Byte.valueOf(byte0));
    }

    protected boolean func_40147_Y()
    {
        return true;
    }
}
