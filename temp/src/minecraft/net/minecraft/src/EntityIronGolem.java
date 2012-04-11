// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityGolem, PathNavigate, EntityAIAttackOnCollide, EntityAITasks, 
//            EntityAIMoveTowardsTarget, EntityAIMoveThroughVillage, EntityAIMoveTwardsRestriction, EntityAILookAtVillager, 
//            EntityAIWander, EntityAIWatchClosest, EntityPlayer, EntityAILookIdle, 
//            EntityAIDefendVillage, EntityAIHurtByTarget, EntityAINearestAttackableTarget, EntityMob, 
//            DataWatcher, World, MathHelper, VillageCollection, 
//            Village, ChunkCoordinates, AxisAlignedBB, NBTTagCompound, 
//            DamageSource, Entity, Block, BlockFlower, 
//            Item

public class EntityIronGolem extends EntityGolem
{

    private int field_48119_b;
    Village field_48121_a;
    private int field_48120_c;
    private int field_48118_d;

    public EntityIronGolem(World p_i1069_1_)
    {
        super(p_i1069_1_);
        field_48119_b = 0;
        field_48121_a = null;
        field_9357_z = "/mob/villager_golem.png";
        func_371_a(1.4F, 2.9F);
        func_48084_aL().func_48664_a(true);
        field_46019_bU.func_46118_a(1, new EntityAIAttackOnCollide(this, 0.25F, true));
        field_46019_bU.func_46118_a(2, new EntityAIMoveTowardsTarget(this, 0.22F, 32F));
        field_46019_bU.func_46118_a(3, new EntityAIMoveThroughVillage(this, 0.16F, true));
        field_46019_bU.func_46118_a(4, new EntityAIMoveTwardsRestriction(this, 0.16F));
        field_46019_bU.func_46118_a(5, new EntityAILookAtVillager(this));
        field_46019_bU.func_46118_a(6, new EntityAIWander(this, 0.16F));
        field_46019_bU.func_46118_a(7, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 6F));
        field_46019_bU.func_46118_a(8, new EntityAILookIdle(this));
        field_48105_bU.func_46118_a(1, new EntityAIDefendVillage(this));
        field_48105_bU.func_46118_a(2, new EntityAIHurtByTarget(this, false));
        field_48105_bU.func_46118_a(3, new EntityAINearestAttackableTarget(this, net.minecraft.src.EntityMob.class, 16F, 0, false, true));
    }

    protected void func_21057_b()
    {
        super.func_21057_b();
        field_21064_bx.func_21124_a(16, Byte.valueOf((byte)0));
    }

    public boolean func_46006_aR()
    {
        return true;
    }

    protected void func_48097_s_()
    {
        if(--field_48119_b <= 0)
        {
            field_48119_b = 70 + field_9312_bd.nextInt(50);
            field_48121_a = field_615_ag.field_48465_A.func_48564_a(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al), MathHelper.func_1108_b(field_609_am), 32);
            if(field_48121_a == null)
            {
                func_48083_aW();
            } else
            {
                ChunkCoordinates chunkcoordinates = field_48121_a.func_48539_a();
                func_48082_b(chunkcoordinates.field_22395_a, chunkcoordinates.field_22394_b, chunkcoordinates.field_22396_c, field_48121_a.func_48531_b());
            }
        }
        super.func_48097_s_();
    }

    public int func_40117_c()
    {
        return 100;
    }

    protected int func_40116_f(int p_40116_1_)
    {
        return p_40116_1_;
    }

    public void func_425_j()
    {
        super.func_425_j();
        if(field_48120_c > 0)
        {
            field_48120_c--;
        }
        if(field_48118_d > 0)
        {
            field_48118_d--;
        }
        if(field_608_an * field_608_an + field_606_ap * field_606_ap > 2.5000002779052011E-007D && field_9312_bd.nextInt(5) == 0)
        {
            int i = MathHelper.func_1108_b(field_611_ak);
            int j = MathHelper.func_1108_b(field_610_al - 0.20000000298023224D - (double)field_9292_aO);
            int k = MathHelper.func_1108_b(field_609_am);
            int l = field_615_ag.func_600_a(i, j, k);
            if(l > 0)
            {
                field_615_ag.func_694_a((new StringBuilder()).append("tilecrack_").append(l).toString(), field_611_ak + ((double)field_9312_bd.nextFloat() - 0.5D) * (double)field_644_aC, field_601_au.field_1697_b + 0.10000000000000001D, field_609_am + ((double)field_9312_bd.nextFloat() - 0.5D) * (double)field_644_aC, 4D * ((double)field_9312_bd.nextFloat() - 0.5D), 0.5D, ((double)field_9312_bd.nextFloat() - 0.5D) * 4D);
            }
        }
    }

    public boolean func_48100_a(Class p_48100_1_)
    {
        if(func_48112_E_() && (net.minecraft.src.EntityPlayer.class).isAssignableFrom(p_48100_1_))
        {
            return false;
        } else
        {
            return super.func_48100_a(p_48100_1_);
        }
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
        p_352_1_.func_748_a("PlayerCreated", func_48112_E_());
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
        func_48115_b(p_357_1_.func_760_m("PlayerCreated"));
    }

    public boolean func_35175_b(Entity p_35175_1_)
    {
        field_48120_c = 10;
        field_615_ag.func_9425_a(this, (byte)4);
        boolean flag = p_35175_1_.func_396_a(DamageSource.func_35525_a(this), 7 + field_9312_bd.nextInt(15));
        if(flag)
        {
            p_35175_1_.field_607_ao += 0.40000000596046448D;
        }
        field_615_ag.func_623_a(this, "mob.irongolem.throw", 1.0F, 1.0F);
        return flag;
    }

    public void func_9282_a(byte p_9282_1_)
    {
        if(p_9282_1_ == 4)
        {
            field_48120_c = 10;
            field_615_ag.func_623_a(this, "mob.irongolem.throw", 1.0F, 1.0F);
        } else
        if(p_9282_1_ == 11)
        {
            field_48118_d = 400;
        } else
        {
            super.func_9282_a(p_9282_1_);
        }
    }

    public Village func_48113_aa()
    {
        return field_48121_a;
    }

    public int func_48114_ab()
    {
        return field_48120_c;
    }

    public void func_48116_a(boolean p_48116_1_)
    {
        field_48118_d = p_48116_1_ ? 400 : 0;
        field_615_ag.func_9425_a(this, (byte)11);
    }

    protected String func_6389_d()
    {
        return "none";
    }

    protected String func_6394_f_()
    {
        return "mob.irongolem.hit";
    }

    protected String func_6390_f()
    {
        return "mob.irongolem.death";
    }

    protected void func_41002_a(int p_41002_1_, int p_41002_2_, int p_41002_3_, int p_41002_4_)
    {
        field_615_ag.func_623_a(this, "mob.irongolem.walk", 1.0F, 1.0F);
    }

    protected void func_21066_o(boolean p_21066_1_, int p_21066_2_)
    {
        int i = field_9312_bd.nextInt(3);
        for(int j = 0; j < i; j++)
        {
            func_367_b(Block.field_416_af.field_376_bc, 1);
        }

        int k = 3 + field_9312_bd.nextInt(3);
        for(int l = 0; l < k; l++)
        {
            func_367_b(Item.field_223_m.field_291_aS, 1);
        }

    }

    public int func_48117_D_()
    {
        return field_48118_d;
    }

    public boolean func_48112_E_()
    {
        return (field_21064_bx.func_21130_a(16) & 1) != 0;
    }

    public void func_48115_b(boolean p_48115_1_)
    {
        byte byte0 = field_21064_bx.func_21130_a(16);
        if(p_48115_1_)
        {
            field_21064_bx.func_21129_b(16, Byte.valueOf((byte)(byte0 | 1)));
        } else
        {
            field_21064_bx.func_21129_b(16, Byte.valueOf((byte)(byte0 & -2)));
        }
    }
}
