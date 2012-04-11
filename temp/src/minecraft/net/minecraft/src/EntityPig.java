// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAnimal, PathNavigate, EntityAISwimming, EntityAITasks, 
//            EntityAIPanic, EntityAIMate, EntityAITempt, Item, 
//            EntityAIFollowParent, EntityAIWander, EntityAIWatchClosest, EntityPlayer, 
//            EntityAILookIdle, DataWatcher, NBTTagCompound, World, 
//            EntityPigZombie, AchievementList, EntityLightningBolt

public class EntityPig extends EntityAnimal
{

    public EntityPig(World p_i557_1_)
    {
        super(p_i557_1_);
        field_9357_z = "/mob/pig.png";
        func_371_a(0.9F, 0.9F);
        func_48084_aL().func_48664_a(true);
        float f = 0.25F;
        field_46019_bU.func_46118_a(0, new EntityAISwimming(this));
        field_46019_bU.func_46118_a(1, new EntityAIPanic(this, 0.38F));
        field_46019_bU.func_46118_a(2, new EntityAIMate(this, f));
        field_46019_bU.func_46118_a(3, new EntityAITempt(this, 0.25F, Item.field_243_R.field_291_aS, false));
        field_46019_bU.func_46118_a(4, new EntityAIFollowParent(this, 0.28F));
        field_46019_bU.func_46118_a(5, new EntityAIWander(this, f));
        field_46019_bU.func_46118_a(6, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 6F));
        field_46019_bU.func_46118_a(7, new EntityAILookIdle(this));
    }

    public boolean func_46006_aR()
    {
        return true;
    }

    public int func_40117_c()
    {
        return 10;
    }

    protected void func_21057_b()
    {
        super.func_21057_b();
        field_21064_bx.func_21124_a(16, Byte.valueOf((byte)0));
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
        p_352_1_.func_748_a("Saddle", func_21068_q());
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
        func_21069_a(p_357_1_.func_760_m("Saddle"));
    }

    protected String func_6389_d()
    {
        return "mob.pig";
    }

    protected String func_6394_f_()
    {
        return "mob.pig";
    }

    protected String func_6390_f()
    {
        return "mob.pigdeath";
    }

    public boolean func_353_a(EntityPlayer p_353_1_)
    {
        if(!super.func_353_a(p_353_1_))
        {
            if(func_21068_q() && !field_615_ag.field_1026_y && (field_617_ae == null || field_617_ae == p_353_1_))
            {
                p_353_1_.func_6377_h(this);
                return true;
            } else
            {
                return false;
            }
        } else
        {
            return true;
        }
    }

    protected int func_422_g()
    {
        if(func_21062_U())
        {
            return Item.field_4017_ap.field_291_aS;
        } else
        {
            return Item.field_272_ao.field_291_aS;
        }
    }

    public boolean func_21068_q()
    {
        return (field_21064_bx.func_21130_a(16) & 1) != 0;
    }

    public void func_21069_a(boolean p_21069_1_)
    {
        if(p_21069_1_)
        {
            field_21064_bx.func_21129_b(16, Byte.valueOf((byte)1));
        } else
        {
            field_21064_bx.func_21129_b(16, Byte.valueOf((byte)0));
        }
    }

    public void func_27014_a(EntityLightningBolt p_27014_1_)
    {
        if(field_615_ag.field_1026_y)
        {
            return;
        } else
        {
            EntityPigZombie entitypigzombie = new EntityPigZombie(field_615_ag);
            entitypigzombie.func_365_c(field_611_ak, field_610_al, field_609_am, field_605_aq, field_604_ar);
            field_615_ag.func_674_a(entitypigzombie);
            func_395_F();
            return;
        }
    }

    protected void func_400_c(float p_400_1_)
    {
        super.func_400_c(p_400_1_);
        if(p_400_1_ > 5F && (field_617_ae instanceof EntityPlayer))
        {
            ((EntityPlayer)field_617_ae).func_27026_a(AchievementList.field_27375_u);
        }
    }

    public EntityAnimal func_40145_a(EntityAnimal p_40145_1_)
    {
        return new EntityPig(field_615_ag);
    }
}
