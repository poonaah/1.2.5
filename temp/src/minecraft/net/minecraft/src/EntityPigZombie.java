// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityZombie, World, NBTTagCompound, DamageSource, 
//            EntityPlayer, AxisAlignedBB, Entity, Item, 
//            ItemStack, EnchantmentHelper

public class EntityPigZombie extends EntityZombie
{

    private int field_4117_a;
    private int field_4116_b;
    private static final ItemStack field_4118_c;

    public EntityPigZombie(World p_i208_1_)
    {
        super(p_i208_1_);
        field_4117_a = 0;
        field_4116_b = 0;
        field_9357_z = "/mob/pigzombie.png";
        field_9333_am = 0.5F;
        field_762_e = 5;
        field_9304_bm = true;
    }

    protected boolean func_46006_aR()
    {
        return false;
    }

    public void func_370_e_()
    {
        field_9333_am = field_751_f == null ? 0.5F : 0.95F;
        if(field_4116_b > 0 && --field_4116_b == 0)
        {
            field_615_ag.func_623_a(this, "mob.zombiepig.zpigangry", func_6393_h() * 2.0F, ((field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.2F + 1.0F) * 1.8F);
        }
        super.func_370_e_();
    }

    public boolean func_433_a()
    {
        return field_615_ag.field_1039_l > 0 && field_615_ag.func_604_a(field_601_au) && field_615_ag.func_697_a(this, field_601_au).size() == 0 && !field_615_ag.func_662_b(field_601_au);
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
        p_352_1_.func_749_a("Anger", (short)field_4117_a);
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
        field_4117_a = p_357_1_.func_745_d("Anger");
    }

    protected Entity func_438_i()
    {
        if(field_4117_a == 0)
        {
            return null;
        } else
        {
            return super.func_438_i();
        }
    }

    public void func_425_j()
    {
        super.func_425_j();
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        Entity entity = p_396_1_.func_35532_a();
        if(entity instanceof EntityPlayer)
        {
            List list = field_615_ag.func_659_b(this, field_601_au.func_1177_b(32D, 32D, 32D));
            for(int i = 0; i < list.size(); i++)
            {
                Entity entity1 = (Entity)list.get(i);
                if(entity1 instanceof EntityPigZombie)
                {
                    EntityPigZombie entitypigzombie = (EntityPigZombie)entity1;
                    entitypigzombie.func_4049_h(entity);
                }
            }

            func_4049_h(entity);
        }
        return super.func_396_a(p_396_1_, p_396_2_);
    }

    private void func_4049_h(Entity p_4049_1_)
    {
        field_751_f = p_4049_1_;
        field_4117_a = 400 + field_9312_bd.nextInt(400);
        field_4116_b = field_9312_bd.nextInt(40);
    }

    protected String func_6389_d()
    {
        return "mob.zombiepig.zpig";
    }

    protected String func_6394_f_()
    {
        return "mob.zombiepig.zpighurt";
    }

    protected String func_6390_f()
    {
        return "mob.zombiepig.zpigdeath";
    }

    protected void func_21066_o(boolean p_21066_1_, int p_21066_2_)
    {
        int i = field_9312_bd.nextInt(2 + p_21066_2_);
        for(int j = 0; j < i; j++)
        {
            func_367_b(Item.field_35415_bn.field_291_aS, 1);
        }

        i = field_9312_bd.nextInt(2 + p_21066_2_);
        for(int k = 0; k < i; k++)
        {
            func_367_b(Item.field_40419_bq.field_291_aS, 1);
        }

    }

    protected void func_48085_j_(int p_48085_1_)
    {
        if(p_48085_1_ > 0)
        {
            ItemStack itemstack = new ItemStack(Item.field_261_E);
            EnchantmentHelper.func_48441_a(field_9312_bd, itemstack, 5);
            func_21058_a(itemstack, 0.0F);
        } else
        {
            int i = field_9312_bd.nextInt(3);
            if(i == 0)
            {
                func_367_b(Item.field_222_n.field_291_aS, 1);
            } else
            if(i == 1)
            {
                func_367_b(Item.field_261_E.field_291_aS, 1);
            } else
            if(i == 2)
            {
                func_367_b(Item.field_277_aj.field_291_aS, 1);
            }
        }
    }

    protected int func_422_g()
    {
        return Item.field_35415_bn.field_291_aS;
    }

    public ItemStack func_4045_l()
    {
        return field_4118_c;
    }

    static 
    {
        field_4118_c = new ItemStack(Item.field_261_E, 1);
    }
}
