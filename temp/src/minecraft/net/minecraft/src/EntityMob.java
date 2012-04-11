// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityCreature, IMob, World, DamageSource, 
//            Potion, PotionEffect, Entity, AxisAlignedBB, 
//            MathHelper, EnumSkyBlock, NBTTagCompound

public abstract class EntityMob extends EntityCreature
    implements IMob
{

    protected int field_762_e;

    public EntityMob(World p_i712_1_)
    {
        super(p_i712_1_);
        field_762_e = 2;
        field_35171_bJ = 5;
    }

    public void func_425_j()
    {
        float f = func_382_a(1.0F);
        if(f > 0.5F)
        {
            field_9344_ag += 2;
        }
        super.func_425_j();
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        if(!field_615_ag.field_1026_y && field_615_ag.field_1039_l == 0)
        {
            func_395_F();
        }
    }

    protected Entity func_438_i()
    {
        EntityPlayer entityplayer = field_615_ag.func_40480_b(this, 16D);
        if(entityplayer != null && func_420_c(entityplayer))
        {
            return entityplayer;
        } else
        {
            return null;
        }
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        if(super.func_396_a(p_396_1_, p_396_2_))
        {
            Entity entity = p_396_1_.func_35532_a();
            if(field_617_ae == entity || field_616_af == entity)
            {
                return true;
            }
            if(entity != this)
            {
                field_751_f = entity;
            }
            return true;
        } else
        {
            return false;
        }
    }

    public boolean func_35175_b(Entity p_35175_1_)
    {
        int i = field_762_e;
        if(func_35160_a(Potion.field_35673_g))
        {
            i += 3 << func_35167_b(Potion.field_35673_g).func_35801_c();
        }
        if(func_35160_a(Potion.field_35690_t))
        {
            i -= 2 << func_35167_b(Potion.field_35690_t).func_35801_c();
        }
        return p_35175_1_.func_396_a(DamageSource.func_35525_a(this), i);
    }

    protected void func_437_a(Entity p_437_1_, float p_437_2_)
    {
        if(field_9330_P <= 0 && p_437_2_ < 2.0F && p_437_1_.field_601_au.field_1702_e > field_601_au.field_1697_b && p_437_1_.field_601_au.field_1697_b < field_601_au.field_1702_e)
        {
            field_9330_P = 20;
            func_35175_b(p_437_1_);
        }
    }

    public float func_439_a(int p_439_1_, int p_439_2_, int p_439_3_)
    {
        return 0.5F - field_615_ag.func_598_c(p_439_1_, p_439_2_, p_439_3_);
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
    }

    protected boolean func_40147_Y()
    {
        int i = MathHelper.func_1108_b(field_611_ak);
        int j = MathHelper.func_1108_b(field_601_au.field_1697_b);
        int k = MathHelper.func_1108_b(field_609_am);
        if(field_615_ag.func_641_a(EnumSkyBlock.Sky, i, j, k) > field_9312_bd.nextInt(32))
        {
            return false;
        }
        int l = field_615_ag.func_618_j(i, j, k);
        if(field_615_ag.func_27160_B())
        {
            int i1 = field_615_ag.field_1046_e;
            field_615_ag.field_1046_e = 10;
            l = field_615_ag.func_618_j(i, j, k);
            field_615_ag.field_1046_e = i1;
        }
        return l <= field_9312_bd.nextInt(8);
    }

    public boolean func_433_a()
    {
        return func_40147_Y() && super.func_433_a();
    }
}
