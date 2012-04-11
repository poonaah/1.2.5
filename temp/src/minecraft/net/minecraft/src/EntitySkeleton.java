// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityMob, EntityAISwimming, EntityAITasks, EntityAIRestrictSun, 
//            EntityAIFleeSun, EntityAIArrowAttack, EntityAIWander, EntityAIWatchClosest, 
//            EntityPlayer, EntityAILookIdle, EntityAIHurtByTarget, EntityAINearestAttackableTarget, 
//            EnumCreatureAttribute, World, MathHelper, DamageSource, 
//            EntityArrow, AchievementList, Item, ItemStack, 
//            EnchantmentHelper

public class EntitySkeleton extends EntityMob
{

    private static final ItemStack field_4119_a;

    public EntitySkeleton(World p_i687_1_)
    {
        super(p_i687_1_);
        field_9357_z = "/mob/skeleton.png";
        field_9333_am = 0.25F;
        field_46019_bU.func_46118_a(1, new EntityAISwimming(this));
        field_46019_bU.func_46118_a(2, new EntityAIRestrictSun(this));
        field_46019_bU.func_46118_a(3, new EntityAIFleeSun(this, field_9333_am));
        field_46019_bU.func_46118_a(4, new EntityAIArrowAttack(this, field_9333_am, 1, 60));
        field_46019_bU.func_46118_a(5, new EntityAIWander(this, field_9333_am));
        field_46019_bU.func_46118_a(6, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 8F));
        field_46019_bU.func_46118_a(6, new EntityAILookIdle(this));
        field_48105_bU.func_46118_a(1, new EntityAIHurtByTarget(this, false));
        field_48105_bU.func_46118_a(2, new EntityAINearestAttackableTarget(this, net.minecraft.src.EntityPlayer.class, 16F, 0, true));
    }

    public boolean func_46006_aR()
    {
        return true;
    }

    public int func_40117_c()
    {
        return 20;
    }

    protected String func_6389_d()
    {
        return "mob.skeleton";
    }

    protected String func_6394_f_()
    {
        return "mob.skeletonhurt";
    }

    protected String func_6390_f()
    {
        return "mob.skeletonhurt";
    }

    public ItemStack func_4045_l()
    {
        return field_4119_a;
    }

    public EnumCreatureAttribute func_40124_t()
    {
        return EnumCreatureAttribute.UNDEAD;
    }

    public void func_425_j()
    {
        if(field_615_ag.func_624_b() && !field_615_ag.field_1026_y)
        {
            float f = func_382_a(1.0F);
            if(f > 0.5F && field_615_ag.func_647_i(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al), MathHelper.func_1108_b(field_609_am)) && field_9312_bd.nextFloat() * 30F < (f - 0.4F) * 2.0F)
            {
                func_40046_d(8);
            }
        }
        super.func_425_j();
    }

    public void func_419_b(DamageSource p_419_1_)
    {
        super.func_419_b(p_419_1_);
        if((p_419_1_.func_35526_e() instanceof EntityArrow) && (p_419_1_.func_35532_a() instanceof EntityPlayer))
        {
            EntityPlayer entityplayer = (EntityPlayer)p_419_1_.func_35532_a();
            double d = entityplayer.field_611_ak - field_611_ak;
            double d1 = entityplayer.field_609_am - field_609_am;
            if(d * d + d1 * d1 >= 2500D)
            {
                entityplayer.func_27026_a(AchievementList.field_35608_v);
            }
        }
    }

    protected int func_422_g()
    {
        return Item.field_226_j.field_291_aS;
    }

    protected void func_21066_o(boolean p_21066_1_, int p_21066_2_)
    {
        int i = field_9312_bd.nextInt(3 + p_21066_2_);
        for(int j = 0; j < i; j++)
        {
            func_367_b(Item.field_226_j.field_291_aS, 1);
        }

        i = field_9312_bd.nextInt(3 + p_21066_2_);
        for(int k = 0; k < i; k++)
        {
            func_367_b(Item.field_21020_aV.field_291_aS, 1);
        }

    }

    protected void func_48085_j_(int p_48085_1_)
    {
        if(p_48085_1_ > 0)
        {
            ItemStack itemstack = new ItemStack(Item.field_227_i);
            EnchantmentHelper.func_48441_a(field_9312_bd, itemstack, 5);
            func_21058_a(itemstack, 0.0F);
        } else
        {
            func_367_b(Item.field_227_i.field_291_aS, 1);
        }
    }

    static 
    {
        field_4119_a = new ItemStack(Item.field_227_i, 1);
    }
}
