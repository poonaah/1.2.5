// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAnimal, PathNavigate, EntityAISwimming, EntityAITasks, 
//            EntityAIPanic, EntityAIMate, EntityAITempt, Item, 
//            EntityAIFollowParent, EntityAIWander, EntityAIWatchClosest, EntityPlayer, 
//            EntityAILookIdle, InventoryPlayer, ItemStack, World, 
//            NBTTagCompound

public class EntityCow extends EntityAnimal
{

    public EntityCow(World p_i630_1_)
    {
        super(p_i630_1_);
        field_9357_z = "/mob/cow.png";
        func_371_a(0.9F, 1.3F);
        func_48084_aL().func_48664_a(true);
        field_46019_bU.func_46118_a(0, new EntityAISwimming(this));
        field_46019_bU.func_46118_a(1, new EntityAIPanic(this, 0.38F));
        field_46019_bU.func_46118_a(2, new EntityAIMate(this, 0.2F));
        field_46019_bU.func_46118_a(3, new EntityAITempt(this, 0.25F, Item.field_243_R.field_291_aS, false));
        field_46019_bU.func_46118_a(4, new EntityAIFollowParent(this, 0.25F));
        field_46019_bU.func_46118_a(5, new EntityAIWander(this, 0.2F));
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

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
    }

    protected String func_6389_d()
    {
        return "mob.cow";
    }

    protected String func_6394_f_()
    {
        return "mob.cowhurt";
    }

    protected String func_6390_f()
    {
        return "mob.cowhurt";
    }

    protected float func_6393_h()
    {
        return 0.4F;
    }

    protected int func_422_g()
    {
        return Item.field_306_aD.field_291_aS;
    }

    protected void func_21066_o(boolean p_21066_1_, int p_21066_2_)
    {
        int i = field_9312_bd.nextInt(3) + field_9312_bd.nextInt(1 + p_21066_2_);
        for(int j = 0; j < i; j++)
        {
            func_367_b(Item.field_306_aD.field_291_aS, 1);
        }

        i = field_9312_bd.nextInt(3) + 1 + field_9312_bd.nextInt(1 + p_21066_2_);
        for(int k = 0; k < i; k++)
        {
            if(func_21062_U())
            {
                func_367_b(Item.field_35418_bk.field_291_aS, 1);
            } else
            {
                func_367_b(Item.field_35417_bj.field_291_aS, 1);
            }
        }

    }

    public boolean func_353_a(EntityPlayer p_353_1_)
    {
        ItemStack itemstack = p_353_1_.field_778_b.func_494_a();
        if(itemstack != null && itemstack.field_1617_c == Item.field_262_au.field_291_aS)
        {
            p_353_1_.field_778_b.func_472_a(p_353_1_.field_778_b.field_847_d, new ItemStack(Item.field_305_aE));
            return true;
        } else
        {
            return super.func_353_a(p_353_1_);
        }
    }

    public EntityAnimal func_40145_a(EntityAnimal p_40145_1_)
    {
        return new EntityCow(field_615_ag);
    }
}
