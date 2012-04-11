// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAgeable, PathNavigate, EntityAISwimming, EntityAITasks, 
//            EntityAIAvoidEntity, EntityZombie, EntityAIMoveIndoors, EntityAIRestrictOpenDoor, 
//            EntityAIOpenDoor, EntityAIMoveTwardsRestriction, EntityAIVillagerMate, EntityAIFollowGolem, 
//            EntityAIPlay, EntityAIWatchClosest2, EntityPlayer, EntityAIWander, 
//            EntityAIWatchClosest, EntityLiving, World, MathHelper, 
//            VillageCollection, Village, ChunkCoordinates, DataWatcher, 
//            NBTTagCompound

public class EntityVillager extends EntityAgeable
{

    private int field_48131_b;
    private boolean field_48132_c;
    private boolean field_48130_d;
    Village field_48133_a;

    public EntityVillager(World p_i295_1_)
    {
        this(p_i295_1_, 0);
    }

    public EntityVillager(World p_i296_1_, int p_i296_2_)
    {
        super(p_i296_1_);
        field_48131_b = 0;
        field_48132_c = false;
        field_48130_d = false;
        field_48133_a = null;
        func_48124_d_(p_i296_2_);
        field_9357_z = "/mob/villager/villager.png";
        field_9333_am = 0.5F;
        func_48084_aL().func_48673_b(true);
        func_48084_aL().func_48664_a(true);
        field_46019_bU.func_46118_a(0, new EntityAISwimming(this));
        field_46019_bU.func_46118_a(1, new EntityAIAvoidEntity(this, net.minecraft.src.EntityZombie.class, 8F, 0.3F, 0.35F));
        field_46019_bU.func_46118_a(2, new EntityAIMoveIndoors(this));
        field_46019_bU.func_46118_a(3, new EntityAIRestrictOpenDoor(this));
        field_46019_bU.func_46118_a(4, new EntityAIOpenDoor(this, true));
        field_46019_bU.func_46118_a(5, new EntityAIMoveTwardsRestriction(this, 0.3F));
        field_46019_bU.func_46118_a(6, new EntityAIVillagerMate(this));
        field_46019_bU.func_46118_a(7, new EntityAIFollowGolem(this));
        field_46019_bU.func_46118_a(8, new EntityAIPlay(this, 0.32F));
        field_46019_bU.func_46118_a(9, new EntityAIWatchClosest2(this, net.minecraft.src.EntityPlayer.class, 3F, 1.0F));
        field_46019_bU.func_46118_a(9, new EntityAIWatchClosest2(this, net.minecraft.src.EntityVillager.class, 5F, 0.02F));
        field_46019_bU.func_46118_a(9, new EntityAIWander(this, 0.3F));
        field_46019_bU.func_46118_a(10, new EntityAIWatchClosest(this, net.minecraft.src.EntityLiving.class, 8F));
    }

    public boolean func_46006_aR()
    {
        return true;
    }

    protected void func_48097_s_()
    {
        if(--field_48131_b <= 0)
        {
            field_615_ag.field_48465_A.func_48565_a(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al), MathHelper.func_1108_b(field_609_am));
            field_48131_b = 70 + field_9312_bd.nextInt(50);
            field_48133_a = field_615_ag.field_48465_A.func_48564_a(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al), MathHelper.func_1108_b(field_609_am), 32);
            if(field_48133_a == null)
            {
                func_48083_aW();
            } else
            {
                ChunkCoordinates chunkcoordinates = field_48133_a.func_48539_a();
                func_48082_b(chunkcoordinates.field_22395_a, chunkcoordinates.field_22394_b, chunkcoordinates.field_22396_c, field_48133_a.func_48531_b());
            }
        }
        super.func_48097_s_();
    }

    protected void func_21057_b()
    {
        super.func_21057_b();
        field_21064_bx.func_21124_a(16, Integer.valueOf(0));
    }

    public int func_40117_c()
    {
        return 20;
    }

    public void func_425_j()
    {
        super.func_425_j();
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
        p_352_1_.func_758_a("Profession", func_48129_t());
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
        func_48124_d_(p_357_1_.func_756_e("Profession"));
    }

    public String func_6376_z()
    {
        switch(func_48129_t())
        {
        case 0: // '\0'
            return "/mob/villager/farmer.png";

        case 1: // '\001'
            return "/mob/villager/librarian.png";

        case 2: // '\002'
            return "/mob/villager/priest.png";

        case 3: // '\003'
            return "/mob/villager/smith.png";

        case 4: // '\004'
            return "/mob/villager/butcher.png";
        }
        return super.func_6376_z();
    }

    protected boolean func_25023_u()
    {
        return false;
    }

    protected String func_6389_d()
    {
        return "mob.villager.default";
    }

    protected String func_6394_f_()
    {
        return "mob.villager.defaulthurt";
    }

    protected String func_6390_f()
    {
        return "mob.villager.defaultdeath";
    }

    public void func_48124_d_(int p_48124_1_)
    {
        field_21064_bx.func_21129_b(16, Integer.valueOf(p_48124_1_));
    }

    public int func_48129_t()
    {
        return field_21064_bx.func_25115_b(16);
    }

    public boolean func_48126_w_()
    {
        return field_48132_c;
    }

    public void func_48128_a(boolean p_48128_1_)
    {
        field_48132_c = p_48128_1_;
    }

    public void func_48127_b(boolean p_48127_1_)
    {
        field_48130_d = p_48127_1_;
    }

    public boolean func_48125_w()
    {
        return field_48130_d;
    }

    public void func_48086_a(EntityLiving p_48086_1_)
    {
        super.func_48086_a(p_48086_1_);
        if(field_48133_a != null && p_48086_1_ != null)
        {
            field_48133_a.func_48534_a(p_48086_1_);
        }
    }
}
