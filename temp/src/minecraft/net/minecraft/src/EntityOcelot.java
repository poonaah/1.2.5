// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityTameable, PathNavigate, EntityAISwimming, EntityAITasks, 
//            EntityAITempt, Item, EntityAIAvoidEntity, EntityPlayer, 
//            EntityAIFollowOwner, EntityAIOcelotSit, EntityAILeapAtTarget, EntityAIOcelotAttack, 
//            EntityAIMate, EntityAIWander, EntityAIWatchClosest, EntityAITargetNonTamed, 
//            EntityChicken, DataWatcher, EntityMoveHelper, NBTTagCompound, 
//            DamageSource, Entity, EntityAISit, InventoryPlayer, 
//            ItemStack, World, MathHelper, AxisAlignedBB, 
//            Block, BlockGrass, BlockLeaves, EntityAnimal

public class EntityOcelot extends EntityTameable
{

    private EntityAITempt field_48149_b;

    public EntityOcelot(World p_i1072_1_)
    {
        super(p_i1072_1_);
        field_9357_z = "/mob/ozelot.png";
        func_371_a(0.6F, 0.8F);
        func_48084_aL().func_48664_a(true);
        field_46019_bU.func_46118_a(1, new EntityAISwimming(this));
        field_46019_bU.func_46118_a(2, field_48146_a);
        field_46019_bU.func_46118_a(3, field_48149_b = new EntityAITempt(this, 0.18F, Item.field_4021_aS.field_291_aS, true));
        field_46019_bU.func_46118_a(4, new EntityAIAvoidEntity(this, net.minecraft.src.EntityPlayer.class, 16F, 0.23F, 0.4F));
        field_46019_bU.func_46118_a(5, new EntityAIFollowOwner(this, 0.3F, 10F, 5F));
        field_46019_bU.func_46118_a(6, new EntityAIOcelotSit(this, 0.4F));
        field_46019_bU.func_46118_a(7, new EntityAILeapAtTarget(this, 0.3F));
        field_46019_bU.func_46118_a(8, new EntityAIOcelotAttack(this));
        field_46019_bU.func_46118_a(9, new EntityAIMate(this, 0.23F));
        field_46019_bU.func_46118_a(10, new EntityAIWander(this, 0.23F));
        field_46019_bU.func_46118_a(11, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 10F));
        field_48105_bU.func_46118_a(1, new EntityAITargetNonTamed(this, net.minecraft.src.EntityChicken.class, 14F, 750, false));
    }

    protected void func_21057_b()
    {
        super.func_21057_b();
        field_21064_bx.func_21124_a(18, Byte.valueOf((byte)0));
    }

    public void func_48097_s_()
    {
        if(!func_46009_aH().func_48186_a())
        {
            func_48078_c(false);
            func_35113_c(false);
        } else
        {
            float f = func_46009_aH().func_48184_b();
            if(f == 0.18F)
            {
                func_48078_c(true);
                func_35113_c(false);
            } else
            if(f == 0.4F)
            {
                func_48078_c(false);
                func_35113_c(true);
            } else
            {
                func_48078_c(false);
                func_35113_c(false);
            }
        }
    }

    protected boolean func_25023_u()
    {
        return !func_48139_F_();
    }

    public String func_6376_z()
    {
        switch(func_48148_ad())
        {
        case 0: // '\0'
            return "/mob/ozelot.png";

        case 1: // '\001'
            return "/mob/cat_black.png";

        case 2: // '\002'
            return "/mob/cat_red.png";

        case 3: // '\003'
            return "/mob/cat_siamese.png";
        }
        return super.func_6376_z();
    }

    public boolean func_46006_aR()
    {
        return true;
    }

    public int func_40117_c()
    {
        return 10;
    }

    protected void func_400_c(float f)
    {
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
        p_352_1_.func_758_a("CatType", func_48148_ad());
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
        func_48147_c(p_357_1_.func_756_e("CatType"));
    }

    protected String func_6389_d()
    {
        if(func_48139_F_())
        {
            if(func_48136_o_())
            {
                return "mob.cat.purr";
            }
            if(field_9312_bd.nextInt(4) == 0)
            {
                return "mob.cat.purreow";
            } else
            {
                return "mob.cat.meow";
            }
        } else
        {
            return "";
        }
    }

    protected String func_6394_f_()
    {
        return "mob.cat.hitt";
    }

    protected String func_6390_f()
    {
        return "mob.cat.hitt";
    }

    protected float func_6393_h()
    {
        return 0.4F;
    }

    protected int func_422_g()
    {
        return Item.field_306_aD.field_291_aS;
    }

    public boolean func_35175_b(Entity p_35175_1_)
    {
        return p_35175_1_.func_396_a(DamageSource.func_35525_a(this), 3);
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        field_48146_a.func_48407_a(false);
        return super.func_396_a(p_396_1_, p_396_2_);
    }

    protected void func_21066_o(boolean flag, int i)
    {
    }

    public boolean func_353_a(EntityPlayer p_353_1_)
    {
        ItemStack itemstack = p_353_1_.field_778_b.func_494_a();
        if(!func_48139_F_())
        {
            if(field_48149_b.func_48270_h() && itemstack != null && itemstack.field_1617_c == Item.field_4021_aS.field_291_aS && p_353_1_.func_387_e(this) < 9D)
            {
                itemstack.field_1615_a--;
                if(itemstack.field_1615_a <= 0)
                {
                    p_353_1_.field_778_b.func_472_a(p_353_1_.field_778_b.field_847_d, null);
                }
                if(!field_615_ag.field_1026_y)
                {
                    if(field_9312_bd.nextInt(3) == 0)
                    {
                        func_48138_b(true);
                        func_48147_c(1 + field_615_ag.field_1037_n.nextInt(3));
                        func_48143_a(p_353_1_.field_771_i);
                        func_48142_a(true);
                        field_48146_a.func_48407_a(true);
                        field_615_ag.func_9425_a(this, (byte)7);
                    } else
                    {
                        func_48142_a(false);
                        field_615_ag.func_9425_a(this, (byte)6);
                    }
                }
            }
            return true;
        }
        if(p_353_1_.field_771_i.equalsIgnoreCase(func_48145_ag()) && !field_615_ag.field_1026_y && !func_40143_a(itemstack))
        {
            field_48146_a.func_48407_a(!func_48141_af());
        }
        return super.func_353_a(p_353_1_);
    }

    public EntityAnimal func_40145_a(EntityAnimal p_40145_1_)
    {
        EntityOcelot entityocelot = new EntityOcelot(field_615_ag);
        if(func_48139_F_())
        {
            entityocelot.func_48143_a(func_48145_ag());
            entityocelot.func_48138_b(true);
            entityocelot.func_48147_c(func_48148_ad());
        }
        return entityocelot;
    }

    public boolean func_40143_a(ItemStack p_40143_1_)
    {
        return p_40143_1_ != null && p_40143_1_.field_1617_c == Item.field_4021_aS.field_291_aS;
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
        if(!(p_48135_1_ instanceof EntityOcelot))
        {
            return false;
        }
        EntityOcelot entityocelot = (EntityOcelot)p_48135_1_;
        if(!entityocelot.func_48139_F_())
        {
            return false;
        } else
        {
            return func_48136_o_() && entityocelot.func_48136_o_();
        }
    }

    public int func_48148_ad()
    {
        return field_21064_bx.func_21130_a(18);
    }

    public void func_48147_c(int p_48147_1_)
    {
        field_21064_bx.func_21129_b(18, Byte.valueOf((byte)p_48147_1_));
    }

    public boolean func_433_a()
    {
        if(field_615_ag.field_1037_n.nextInt(3) == 0)
        {
            return false;
        }
        if(field_615_ag.func_604_a(field_601_au) && field_615_ag.func_697_a(this, field_601_au).size() == 0 && !field_615_ag.func_662_b(field_601_au))
        {
            int i = MathHelper.func_1108_b(field_611_ak);
            int j = MathHelper.func_1108_b(field_601_au.field_1697_b);
            int k = MathHelper.func_1108_b(field_609_am);
            if(j < 63)
            {
                return false;
            }
            int l = field_615_ag.func_600_a(i, j - 1, k);
            if(l == Block.field_337_v.field_376_bc || l == Block.field_384_L.field_376_bc)
            {
                return true;
            }
        }
        return false;
    }
}
