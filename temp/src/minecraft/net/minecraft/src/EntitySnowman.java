// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityGolem, PathNavigate, EntityAIArrowAttack, EntityAITasks, 
//            EntityAIWander, EntityAIWatchClosest, EntityPlayer, EntityAILookIdle, 
//            EntityAINearestAttackableTarget, EntityMob, DamageSource, MathHelper, 
//            World, BiomeGenBase, Block, Item, 
//            NBTTagCompound

public class EntitySnowman extends EntityGolem
{

    public EntitySnowman(World p_i561_1_)
    {
        super(p_i561_1_);
        field_9357_z = "/mob/snowman.png";
        func_371_a(0.4F, 1.8F);
        func_48084_aL().func_48664_a(true);
        field_46019_bU.func_46118_a(1, new EntityAIArrowAttack(this, 0.25F, 2, 20));
        field_46019_bU.func_46118_a(2, new EntityAIWander(this, 0.2F));
        field_46019_bU.func_46118_a(3, new EntityAIWatchClosest(this, net.minecraft.src.EntityPlayer.class, 6F));
        field_46019_bU.func_46118_a(4, new EntityAILookIdle(this));
        field_48105_bU.func_46118_a(1, new EntityAINearestAttackableTarget(this, net.minecraft.src.EntityMob.class, 16F, 0, true));
    }

    public boolean func_46006_aR()
    {
        return true;
    }

    public int func_40117_c()
    {
        return 4;
    }

    public void func_425_j()
    {
        super.func_425_j();
        if(func_27012_af())
        {
            func_396_a(DamageSource.field_35539_e, 1);
        }
        int i = MathHelper.func_1108_b(field_611_ak);
        int k = MathHelper.func_1108_b(field_609_am);
        if(field_615_ag.func_48454_a(i, k).func_48411_i() > 1.0F)
        {
            func_396_a(DamageSource.field_35540_b, 1);
        }
        for(int j = 0; j < 4; j++)
        {
            int l = MathHelper.func_1108_b(field_611_ak + (double)((float)((j % 2) * 2 - 1) * 0.25F));
            int i1 = MathHelper.func_1108_b(field_610_al);
            int j1 = MathHelper.func_1108_b(field_609_am + (double)((float)(((j / 2) % 2) * 2 - 1) * 0.25F));
            if(field_615_ag.func_600_a(l, i1, j1) == 0 && field_615_ag.func_48454_a(l, j1).func_48411_i() < 0.8F && Block.field_428_aT.func_243_a(field_615_ag, l, i1, j1))
            {
                field_615_ag.func_690_d(l, i1, j1, Block.field_428_aT.field_376_bc);
            }
        }

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
        return Item.field_308_aB.field_291_aS;
    }

    protected void func_21066_o(boolean p_21066_1_, int p_21066_2_)
    {
        int i = field_9312_bd.nextInt(16);
        for(int j = 0; j < i; j++)
        {
            func_367_b(Item.field_308_aB.field_291_aS, 1);
        }

    }
}
