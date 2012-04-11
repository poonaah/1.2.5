// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            EntityAITarget, EntityLiving, AxisAlignedBB, World, 
//            Entity

public class EntityAIHurtByTarget extends EntityAITarget
{

    boolean field_48395_a;

    public EntityAIHurtByTarget(EntityLiving p_i1096_1_, boolean p_i1096_2_)
    {
        super(p_i1096_1_, 16F, false);
        field_48395_a = p_i1096_2_;
        func_46079_a(1);
    }

    public boolean func_46082_a()
    {
        return func_48376_a(field_48382_c.func_46007_aL(), true);
    }

    public void func_46080_e()
    {
        field_48382_c.func_48092_c(field_48382_c.func_46007_aL());
        if(field_48395_a)
        {
            List list = field_48382_c.field_615_ag.func_657_a(field_48382_c.getClass(), AxisAlignedBB.func_1161_b(field_48382_c.field_611_ak, field_48382_c.field_610_al, field_48382_c.field_609_am, field_48382_c.field_611_ak + 1.0D, field_48382_c.field_610_al + 1.0D, field_48382_c.field_609_am + 1.0D).func_1177_b(field_48379_d, 4D, field_48379_d));
            Iterator iterator = list.iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    break;
                }
                Entity entity = (Entity)iterator.next();
                EntityLiving entityliving = (EntityLiving)entity;
                if(field_48382_c != entityliving && entityliving.func_48094_aS() == null)
                {
                    entityliving.func_48092_c(field_48382_c.func_46007_aL());
                }
            } while(true);
        }
        super.func_46080_e();
    }
}
