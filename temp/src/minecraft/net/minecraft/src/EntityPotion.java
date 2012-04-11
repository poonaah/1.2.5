// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            EntityThrowable, World, Item, ItemPotion, 
//            AxisAlignedBB, EntityLiving, Entity, MovingObjectPosition, 
//            PotionEffect, Potion

public class EntityPotion extends EntityThrowable
{

    private int field_40089_d;

    public EntityPotion(World p_i243_1_)
    {
        super(p_i243_1_);
    }

    public EntityPotion(World p_i244_1_, EntityLiving p_i244_2_, int p_i244_3_)
    {
        super(p_i244_1_, p_i244_2_);
        field_40089_d = p_i244_3_;
    }

    public EntityPotion(World p_i245_1_, double p_i245_2_, double p_i245_4_, double p_i245_6_, 
            int p_i245_8_)
    {
        super(p_i245_1_, p_i245_2_, p_i245_4_, p_i245_6_);
        field_40089_d = p_i245_8_;
    }

    protected float func_40075_e()
    {
        return 0.05F;
    }

    protected float func_40077_c()
    {
        return 0.5F;
    }

    protected float func_40074_d()
    {
        return -20F;
    }

    public int func_40088_g()
    {
        return field_40089_d;
    }

    protected void func_40078_a(MovingObjectPosition p_40078_1_)
    {
        if(!field_615_ag.field_1026_y)
        {
            List list = Item.field_40413_bs.func_40431_c_(field_40089_d);
            if(list != null && !list.isEmpty())
            {
                AxisAlignedBB axisalignedbb = field_601_au.func_1177_b(4D, 2D, 4D);
                List list1 = field_615_ag.func_657_a(net.minecraft.src.EntityLiving.class, axisalignedbb);
                if(list1 != null && !list1.isEmpty())
                {
                    for(Iterator iterator = list1.iterator(); iterator.hasNext();)
                    {
                        Entity entity = (Entity)iterator.next();
                        double d = func_387_e(entity);
                        if(d < 16D)
                        {
                            double d1 = 1.0D - Math.sqrt(d) / 4D;
                            if(entity == p_40078_1_.field_1168_g)
                            {
                                d1 = 1.0D;
                            }
                            Iterator iterator1 = list.iterator();
                            while(iterator1.hasNext()) 
                            {
                                PotionEffect potioneffect = (PotionEffect)iterator1.next();
                                int i = potioneffect.func_35799_a();
                                if(Potion.field_35678_a[i].func_40622_b())
                                {
                                    Potion.field_35678_a[i].func_40613_a(field_40083_c, (EntityLiving)entity, potioneffect.func_35801_c(), d1);
                                } else
                                {
                                    int j = (int)(d1 * (double)potioneffect.func_35802_b() + 0.5D);
                                    if(j > 20)
                                    {
                                        ((EntityLiving)entity).func_35165_a(new PotionEffect(i, j, potioneffect.func_35801_c()));
                                    }
                                }
                            }
                        }
                    }

                }
            }
            field_615_ag.func_28106_e(2002, (int)Math.round(field_611_ak), (int)Math.round(field_610_al), (int)Math.round(field_609_am), field_40089_d);
            func_395_F();
        }
    }
}
