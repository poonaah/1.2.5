// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityAnimal, EntityLookHelper, PathNavigate, 
//            AxisAlignedBB, World, Entity

public class EntityAIMate extends EntityAIBase
{

    private EntityAnimal field_48259_d;
    World field_48263_a;
    private EntityAnimal field_48260_e;
    int field_48261_b;
    float field_48262_c;

    public EntityAIMate(EntityAnimal p_i1021_1_, float p_i1021_2_)
    {
        field_48261_b = 0;
        field_48259_d = p_i1021_1_;
        field_48263_a = p_i1021_1_.field_615_ag;
        field_48262_c = p_i1021_2_;
        func_46079_a(3);
    }

    public boolean func_46082_a()
    {
        if(!field_48259_d.func_48136_o_())
        {
            return false;
        } else
        {
            field_48260_e = func_48258_h();
            return field_48260_e != null;
        }
    }

    public boolean func_46084_g()
    {
        return field_48260_e.func_354_B() && field_48260_e.func_48136_o_() && field_48261_b < 60;
    }

    public void func_46077_d()
    {
        field_48260_e = null;
        field_48261_b = 0;
    }

    public void func_46081_b()
    {
        field_48259_d.func_46008_aG().func_46141_a(field_48260_e, 10F, field_48259_d.func_25026_x());
        field_48259_d.func_48084_aL().func_48667_a(field_48260_e, field_48262_c);
        field_48261_b++;
        if(field_48261_b == 60)
        {
            func_48257_i();
        }
    }

    private EntityAnimal func_48258_h()
    {
        float f = 8F;
        List list = field_48263_a.func_657_a(field_48259_d.getClass(), field_48259_d.field_601_au.func_1177_b(f, f, f));
        for(Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            Entity entity = (Entity)iterator.next();
            EntityAnimal entityanimal = (EntityAnimal)entity;
            if(field_48259_d.func_48135_b(entityanimal))
            {
                return entityanimal;
            }
        }

        return null;
    }

    private void func_48257_i()
    {
        EntityAnimal entityanimal = field_48259_d.func_40145_a(field_48260_e);
        if(entityanimal == null)
        {
            return;
        }
        field_48259_d.func_48122_d(6000);
        field_48260_e.func_48122_d(6000);
        field_48259_d.func_48134_p_();
        field_48260_e.func_48134_p_();
        entityanimal.func_48122_d(-24000);
        entityanimal.func_365_c(field_48259_d.field_611_ak, field_48259_d.field_610_al, field_48259_d.field_609_am, 0.0F, 0.0F);
        field_48263_a.func_674_a(entityanimal);
        Random random = field_48259_d.func_46004_aK();
        for(int i = 0; i < 7; i++)
        {
            double d = random.nextGaussian() * 0.02D;
            double d1 = random.nextGaussian() * 0.02D;
            double d2 = random.nextGaussian() * 0.02D;
            field_48263_a.func_694_a("heart", (field_48259_d.field_611_ak + (double)(random.nextFloat() * field_48259_d.field_644_aC * 2.0F)) - (double)field_48259_d.field_644_aC, field_48259_d.field_610_al + 0.5D + (double)(random.nextFloat() * field_48259_d.field_643_aD), (field_48259_d.field_609_am + (double)(random.nextFloat() * field_48259_d.field_644_aC * 2.0F)) - (double)field_48259_d.field_644_aC, d, d1, d2);
        }

    }
}
