// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;

// Referenced classes of package net.minecraft.src:
//            Profiler, EntityLiving, Entity

public class EntitySenses
{

    EntityLiving field_48484_a;
    ArrayList field_48482_b;
    ArrayList field_48483_c;

    public EntitySenses(EntityLiving p_i1000_1_)
    {
        field_48482_b = new ArrayList();
        field_48483_c = new ArrayList();
        field_48484_a = p_i1000_1_;
    }

    public void func_48481_a()
    {
        field_48482_b.clear();
        field_48483_c.clear();
    }

    public boolean func_48480_a(Entity p_48480_1_)
    {
        if(field_48482_b.contains(p_48480_1_))
        {
            return true;
        }
        if(field_48483_c.contains(p_48480_1_))
        {
            return false;
        }
        Profiler.func_40663_a("canSee");
        boolean flag = field_48484_a.func_420_c(p_48480_1_);
        Profiler.func_40662_b();
        if(flag)
        {
            field_48482_b.add(p_48480_1_);
        } else
        {
            field_48483_c.add(p_48480_1_);
        }
        return flag;
    }
}
