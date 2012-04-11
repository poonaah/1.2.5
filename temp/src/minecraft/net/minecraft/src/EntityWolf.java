// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityTameable, PathNavigate, EntityAISwimming, EntityAITasks, 
//            EntityAILeapAtTarget, EntityAIAttackOnCollide, EntityAIFollowOwner, EntityAIMate, 
//            EntityAIWander, EntityAIBeg, EntityAIWatchClosest, EntityPlayer, 
//            EntityAILookIdle, EntityAIOwnerHurtByTarget, EntityAIOwnerHurtTarget, EntityAIHurtByTarget, 
//            EntityAITargetNonTamed, EntitySheep, DataWatcher, NBTTagCompound, 
//            World, AxisAlignedBB, MathHelper, DamageSource, 
//            EntityAISit, EntityArrow, Entity, InventoryPlayer, 
//            ItemStack, Item, PlayerCapabilities, ItemFood, 
//            EntityLiving, EntityAnimal

public class EntityWolf extends EntityTameable
{

    private boolean field_25049_a;
    private float field_25048_b;
    private float field_25054_c;
    private boolean field_25053_f;
    private boolean field_25052_g;
    private float field_25051_h;
    private float field_25050_i;

    public EntityWolf(World p_i701_1_)
    {
        super(p_i701_1_);
        field_25049_a = false;
        field_9357_z = "/mob/wolf.png";
        func_371_a(0.6F, 0.8F);
        field_9333_am = 0.3F;
        func_48084_aL().func_48664_a(true);
        field_46019_bU.func_46118_a(1, new EntityAISwimming(this));
        field_46019_bU.func_46118_a(2, field_48146_a);
        field_46019_bU.func_46118_a(3, new EntityAILeapAtTarget(this, 0.4F));
        field_46019_bU.func_46118_a(4, new EntityAIAttackOnCollide(this, field_9333_am, true));
        field_46019_bU.func_46118_a(5, new EntityAIFollowOwner(this, field_9333_am, 10F, 2.0F));
        field_46019_bU.func_46118_a(6, new EntityAIMate(this, field_9333_am));
        field_46019_bU.func_46118_a(7, new EntityAIWander(this, field_9333_am));
        field_46019_bU.func_46118_a(8, new EntityAIBeg(this, 8F));
        field_46019_bU.func_46118_a(9, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 8F));
        field_46019_bU.func_46118_a(9, new EntityAILookIdle(this));
        field_48105_bU.func_46118_a(1, new EntityAIOwnerHurtByTarget(this));
        field_48105_bU.func_46118_a(2, new EntityAIOwnerHurtTarget(this));
        field_48105_bU.func_46118_a(3, new EntityAIHurtByTarget(this, true));
        field_48105_bU.func_46118_a(4, new EntityAITargetNonTamed(this, net.minecraft.src.EntitySheep.class, 16F, 200, false));
    }

    public boolean func_46006_aR()
    {
        return true;
    }

    public void func_48092_c(EntityLiving p_48092_1_)
    {
        super.func_48092_c(p_48092_1_);
        if(p_48092_1_ instanceof EntityPlayer)
        {
            func_25041_c(true);
        }
    }

    protected void func_48097_s_()
    {
        field_21064_bx.func_21129_b(18, Integer.valueOf(func_40114_aH()));
    }

    public int func_40117_c()
    {
        return !func_48139_F_() ? 8 : 20;
    }

    protected void func_21057_b()
    {
        super.func_21057_b();
        field_21064_bx.func_21124_a(18, new Integer(func_40114_aH()));
    }

    protected boolean func_25021_m()
    {
        return false;
    }

    public String func_6376_z()
    {
        if(func_48139_F_())
        {
            return "/mob/wolf_tame.png";
        }
        if(func_25040_C())
        {
            return "/mob/wolf_angry.png";
        } else
        {
            return super.func_6376_z();
        }
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
        p_352_1_.func_748_a("Angry", func_25040_C());
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
        func_25041_c(p_357_1_.func_760_m("Angry"));
    }

    protected boolean func_25023_u()
    {
        return func_25040_C();
    }

    protected String func_6389_d()
    {
        if(func_25040_C())
        {
            return "mob.wolf.growl";
        }
        if(field_9312_bd.nextInt(3) == 0)
        {
            if(func_48139_F_() && field_21064_bx.func_25115_b(18) < 10)
            {
                return "mob.wolf.whine";
            } else
            {
                return "mob.wolf.panting";
            }
        } else
        {
            return "mob.wolf.bark";
        }
    }

    protected String func_6394_f_()
    {
        return "mob.wolf.hurt";
    }

    protected String func_6390_f()
    {
        return "mob.wolf.death";
    }

    protected float func_6393_h()
    {
        return 0.4F;
    }

    protected int func_422_g()
    {
        return -1;
    }

    public void func_425_j()
    {
        super.func_425_j();
        if(!field_615_ag.field_1026_y && field_25053_f && !field_25052_g && !func_25031_E() && field_9298_aH)
        {
            field_25052_g = true;
            field_25051_h = 0.0F;
            field_25050_i = 0.0F;
            field_615_ag.func_9425_a(this, (byte)8);
        }
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        field_25054_c = field_25048_b;
        if(field_25049_a)
        {
            field_25048_b = field_25048_b + (1.0F - field_25048_b) * 0.4F;
        } else
        {
            field_25048_b = field_25048_b + (0.0F - field_25048_b) * 0.4F;
        }
        if(field_25049_a)
        {
            field_4127_c = 10;
        }
        if(func_27012_af())
        {
            field_25053_f = true;
            field_25052_g = false;
            field_25051_h = 0.0F;
            field_25050_i = 0.0F;
        } else
        if((field_25053_f || field_25052_g) && field_25052_g)
        {
            if(field_25051_h == 0.0F)
            {
                field_615_ag.func_623_a(this, "mob.wolf.shake", func_6393_h(), (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.2F + 1.0F);
            }
            field_25050_i = field_25051_h;
            field_25051_h += 0.05F;
            if(field_25050_i >= 2.0F)
            {
                field_25053_f = false;
                field_25052_g = false;
                field_25050_i = 0.0F;
                field_25051_h = 0.0F;
            }
            if(field_25051_h > 0.4F)
            {
                float f = (float)field_601_au.field_1697_b;
                int i = (int)(MathHelper.func_1106_a((field_25051_h - 0.4F) * 3.141593F) * 7F);
                for(int j = 0; j < i; j++)
                {
                    float f1 = (field_9312_bd.nextFloat() * 2.0F - 1.0F) * field_644_aC * 0.5F;
                    float f2 = (field_9312_bd.nextFloat() * 2.0F - 1.0F) * field_644_aC * 0.5F;
                    field_615_ag.func_694_a("splash", field_611_ak + (double)f1, f + 0.8F, field_609_am + (double)f2, field_608_an, field_607_ao, field_606_ap);
                }

            }
        }
    }

    public boolean func_25039_v()
    {
        return field_25053_f;
    }

    public float func_25043_b_(float p_25043_1_)
    {
        return 0.75F + ((field_25050_i + (field_25051_h - field_25050_i) * p_25043_1_) / 2.0F) * 0.25F;
    }

    public float func_25042_a(float p_25042_1_, float p_25042_2_)
    {
        float f = (field_25050_i + (field_25051_h - field_25050_i) * p_25042_1_ + p_25042_2_) / 1.8F;
        if(f < 0.0F)
        {
            f = 0.0F;
        } else
        if(f > 1.0F)
        {
            f = 1.0F;
        }
        return MathHelper.func_1106_a(f * 3.141593F) * MathHelper.func_1106_a(f * 3.141593F * 11F) * 0.15F * 3.141593F;
    }

    public float func_25033_c(float p_25033_1_)
    {
        return (field_25054_c + (field_25048_b - field_25054_c) * p_25033_1_) * 0.15F * 3.141593F;
    }

    public float func_373_s()
    {
        return field_643_aD * 0.8F;
    }

    public int func_25026_x()
    {
        if(func_48141_af())
        {
            return 20;
        } else
        {
            return super.func_25026_x();
        }
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        Entity entity = p_396_1_.func_35532_a();
        field_48146_a.func_48407_a(false);
        if(entity != null && !(entity instanceof EntityPlayer) && !(entity instanceof EntityArrow))
        {
            p_396_2_ = (p_396_2_ + 1) / 2;
        }
        return super.func_396_a(p_396_1_, p_396_2_);
    }

    public boolean func_35175_b(Entity p_35175_1_)
    {
        byte byte0 = ((byte)(func_48139_F_() ? 4 : 2));
        return p_35175_1_.func_396_a(DamageSource.func_35525_a(this), byte0);
    }

    public boolean func_353_a(EntityPlayer p_353_1_)
    {
        ItemStack itemstack = p_353_1_.field_778_b.func_494_a();
        if(!func_48139_F_())
        {
            if(itemstack != null && itemstack.field_1617_c == Item.field_21020_aV.field_291_aS && !func_25040_C())
            {
                if(!p_353_1_.field_35212_aW.field_35756_d)
                {
                    itemstack.field_1615_a--;
                }
                if(itemstack.field_1615_a <= 0)
                {
                    p_353_1_.field_778_b.func_472_a(p_353_1_.field_778_b.field_847_d, null);
                }
                if(!field_615_ag.field_1026_y)
                {
                    if(field_9312_bd.nextInt(3) == 0)
                    {
                        func_48138_b(true);
                        func_25029_a(null);
                        func_48092_c(null);
                        field_48146_a.func_48407_a(true);
                        func_40121_k(20);
                        func_48143_a(p_353_1_.field_771_i);
                        func_48142_a(true);
                        field_615_ag.func_9425_a(this, (byte)7);
                    } else
                    {
                        func_48142_a(false);
                        field_615_ag.func_9425_a(this, (byte)6);
                    }
                }
                return true;
            }
        } else
        {
            if(itemstack != null && (Item.field_233_c[itemstack.field_1617_c] instanceof ItemFood))
            {
                ItemFood itemfood = (ItemFood)Item.field_233_c[itemstack.field_1617_c];
                if(itemfood.func_25012_m() && field_21064_bx.func_25115_b(18) < 20)
                {
                    if(!p_353_1_.field_35212_aW.field_35756_d)
                    {
                        itemstack.field_1615_a--;
                    }
                    func_432_b(itemfood.func_25011_l());
                    if(itemstack.field_1615_a <= 0)
                    {
                        p_353_1_.field_778_b.func_472_a(p_353_1_.field_778_b.field_847_d, null);
                    }
                    return true;
                }
            }
            if(p_353_1_.field_771_i.equalsIgnoreCase(func_48145_ag()) && !field_615_ag.field_1026_y && !func_40143_a(itemstack))
            {
                field_48146_a.func_48407_a(!func_48141_af());
                field_9336_ak = false;
                func_25029_a(null);
            }
        }
        return super.func_353_a(p_353_1_);
    }

    public void func_9282_a(byte p_9282_1_)
    {
        if(p_9282_1_ == 8)
        {
            field_25052_g = true;
            field_25051_h = 0.0F;
            field_25050_i = 0.0F;
        } else
        {
            super.func_9282_a(p_9282_1_);
        }
    }

    public float func_25037_z()
    {
        if(func_25040_C())
        {
            return 1.53938F;
        }
        if(func_48139_F_())
        {
            return (0.55F - (float)(20 - field_21064_bx.func_25115_b(18)) * 0.02F) * 3.141593F;
        } else
        {
            return 0.6283185F;
        }
    }

    public boolean func_40143_a(ItemStack p_40143_1_)
    {
        if(p_40143_1_ == null)
        {
            return false;
        }
        if(!(Item.field_233_c[p_40143_1_.field_1617_c] instanceof ItemFood))
        {
            return false;
        } else
        {
            return ((ItemFood)Item.field_233_c[p_40143_1_.field_1617_c]).func_25012_m();
        }
    }

    public int func_6391_i()
    {
        return 8;
    }

    public boolean func_25040_C()
    {
        return (field_21064_bx.func_21130_a(16) & 2) != 0;
    }

    public void func_25041_c(boolean p_25041_1_)
    {
        byte byte0 = field_21064_bx.func_21130_a(16);
        if(p_25041_1_)
        {
            field_21064_bx.func_21129_b(16, Byte.valueOf((byte)(byte0 | 2)));
        } else
        {
            field_21064_bx.func_21129_b(16, Byte.valueOf((byte)(byte0 & -3)));
        }
    }

    public EntityAnimal func_40145_a(EntityAnimal p_40145_1_)
    {
        EntityWolf entitywolf = new EntityWolf(field_615_ag);
        entitywolf.func_48143_a(func_48145_ag());
        entitywolf.func_48138_b(true);
        return entitywolf;
    }

    public void func_48150_h(boolean p_48150_1_)
    {
        field_25049_a = p_48150_1_;
    }

    public boolean func_48135_b(EntityAnimal p_48135_1_)
    {
        if(p_48135_1_ == this)
        {
            return false;
        }
        if(!func_48139_F_())
        {
            return false;
        }
        if(!(p_48135_1_ instanceof EntityWolf))
        {
            return false;
        }
        EntityWolf entitywolf = (EntityWolf)p_48135_1_;
        if(!entitywolf.func_48139_F_())
        {
            return false;
        }
        if(entitywolf.func_48141_af())
        {
            return false;
        } else
        {
            return func_48136_o_() && entitywolf.func_48136_o_();
        }
    }
}
