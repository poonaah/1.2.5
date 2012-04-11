// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityMob, PathNavigate, EntityAISwimming, EntityAITasks, 
//            EntityAIBreakDoor, EntityAIAttackOnCollide, EntityPlayer, EntityVillager, 
//            EntityAIMoveTwardsRestriction, EntityAIMoveThroughVillage, EntityAIWander, EntityAIWatchClosest, 
//            EntityAILookIdle, EntityAIHurtByTarget, EntityAINearestAttackableTarget, World, 
//            MathHelper, Item, EnumCreatureAttribute

public class EntityZombie extends EntityMob
{

    public EntityZombie(World p_i156_1_)
    {
        super(p_i156_1_);
        field_9357_z = "/mob/zombie.png";
        field_9333_am = 0.23F;
        field_762_e = 4;
        func_48084_aL().func_48673_b(true);
        field_46019_bU.func_46118_a(0, new EntityAISwimming(this));
        field_46019_bU.func_46118_a(1, new EntityAIBreakDoor(this));
        field_46019_bU.func_46118_a(2, new EntityAIAttackOnCollide(this, net.minecraft.src.EntityPlayer.class, field_9333_am, false));
        field_46019_bU.func_46118_a(3, new EntityAIAttackOnCollide(this, net.minecraft.src.EntityVillager.class, field_9333_am, true));
        field_46019_bU.func_46118_a(4, new EntityAIMoveTwardsRestriction(this, field_9333_am));
        field_46019_bU.func_46118_a(5, new EntityAIMoveThroughVillage(this, field_9333_am, false));
        field_46019_bU.func_46118_a(6, new EntityAIWander(this, field_9333_am));
        field_46019_bU.func_46118_a(7, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 8F));
        field_46019_bU.func_46118_a(7, new EntityAILookIdle(this));
        field_48105_bU.func_46118_a(1, new EntityAIHurtByTarget(this, false));
        field_48105_bU.func_46118_a(2, new EntityAINearestAttackableTarget(this, net.minecraft.src.EntityPlayer.class, 16F, 0, true));
        field_48105_bU.func_46118_a(2, new EntityAINearestAttackableTarget(this, net.minecraft.src.EntityVillager.class, 16F, 0, false));
    }

    public int func_40117_c()
    {
        return 20;
    }

    public int func_40119_ar()
    {
        return 2;
    }

    protected boolean func_46006_aR()
    {
        return true;
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

    protected String func_6389_d()
    {
        return "mob.zombie";
    }

    protected String func_6394_f_()
    {
        return "mob.zombiehurt";
    }

    protected String func_6390_f()
    {
        return "mob.zombiedeath";
    }

    protected int func_422_g()
    {
        return Item.field_35415_bn.field_291_aS;
    }

    public EnumCreatureAttribute func_40124_t()
    {
        return EnumCreatureAttribute.UNDEAD;
    }

    protected void func_48085_j_(int p_48085_1_)
    {
        switch(field_9312_bd.nextInt(4))
        {
        case 0: // '\0'
            func_367_b(Item.field_221_o.field_291_aS, 1);
            break;

        case 1: // '\001'
            func_367_b(Item.field_285_ab.field_291_aS, 1);
            break;

        case 2: // '\002'
            func_367_b(Item.field_223_m.field_291_aS, 1);
            break;

        case 3: // '\003'
            func_367_b(Item.field_232_d.field_291_aS, 1);
            break;
        }
    }
}
