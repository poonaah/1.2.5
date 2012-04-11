// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            EntityAITarget, EntityAINearestAttackableTargetSorter, EntityLiving, EntityPlayer, 
//            World, AxisAlignedBB, Entity

public class EntityAINearestAttackableTarget extends EntityAITarget
{

    EntityLiving field_48389_a;
    Class field_48388_b;
    int field_48386_f;
    private EntityAINearestAttackableTargetSorter field_48387_g;

    public EntityAINearestAttackableTarget(EntityLiving p_i1022_1_, Class p_i1022_2_, float p_i1022_3_, int p_i1022_4_, boolean p_i1022_5_)
    {
        this(p_i1022_1_, p_i1022_2_, p_i1022_3_, p_i1022_4_, p_i1022_5_, false);
    }

    public EntityAINearestAttackableTarget(EntityLiving p_i1023_1_, Class p_i1023_2_, float p_i1023_3_, int p_i1023_4_, boolean p_i1023_5_, boolean p_i1023_6_)
    {
        super(p_i1023_1_, p_i1023_3_, p_i1023_5_, p_i1023_6_);
        field_48388_b = p_i1023_2_;
        field_48379_d = p_i1023_3_;
        field_48386_f = p_i1023_4_;
        field_48387_g = new EntityAINearestAttackableTargetSorter(this, p_i1023_1_);
        func_46079_a(1);
    }

    public boolean func_46082_a()
    {
label0:
        {
            if(field_48386_f > 0 && field_48382_c.func_46004_aK().nextInt(field_48386_f) != 0)
            {
                return false;
            }
            if(field_48388_b == (net.minecraft.src.EntityPlayer.class))
            {
                EntityPlayer entityplayer = field_48382_c.field_615_ag.func_40480_b(field_48382_c, field_48379_d);
                if(func_48376_a(entityplayer, false))
                {
                    field_48389_a = entityplayer;
                    return true;
                }
                break label0;
            }
            List list = field_48382_c.field_615_ag.func_657_a(field_48388_b, field_48382_c.field_601_au.func_1177_b(field_48379_d, 4D, field_48379_d));
            Collections.sort(list, field_48387_g);
            Iterator iterator = list.iterator();
            EntityLiving entityliving;
            do
            {
                if(!iterator.hasNext())
                {
                    break label0;
                }
                Entity entity = (Entity)iterator.next();
                entityliving = (EntityLiving)entity;
            } while(!func_48376_a(entityliving, false));
            field_48389_a = entityliving;
            return true;
        }
        return false;
    }

    public void func_46080_e()
    {
        field_48382_c.func_48092_c(field_48389_a);
        super.func_46080_e();
    }
}
