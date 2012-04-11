// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package net.minecraft.src:
//            EntityAITaskEntry, EntityAIBase

public class EntityAITasks
{

    private ArrayList field_46120_a;
    private ArrayList field_46119_b;

    public EntityAITasks()
    {
        field_46120_a = new ArrayList();
        field_46119_b = new ArrayList();
    }

    public void func_46118_a(int p_46118_1_, EntityAIBase p_46118_2_)
    {
        field_46120_a.add(new EntityAITaskEntry(this, p_46118_1_, p_46118_2_));
    }

    public void func_46115_a()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = field_46120_a.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            EntityAITaskEntry entityaitaskentry = (EntityAITaskEntry)iterator.next();
            boolean flag1 = field_46119_b.contains(entityaitaskentry);
            if(flag1)
            {
                if(func_46116_a(entityaitaskentry) && entityaitaskentry.field_46114_a.func_46084_g())
                {
                    continue;
                }
                entityaitaskentry.field_46114_a.func_46077_d();
                field_46119_b.remove(entityaitaskentry);
            }
            if(func_46116_a(entityaitaskentry) && entityaitaskentry.field_46114_a.func_46082_a())
            {
                arraylist.add(entityaitaskentry);
                field_46119_b.add(entityaitaskentry);
            }
        } while(true);
        boolean flag = false;
        if(flag && arraylist.size() > 0)
        {
            System.out.println("Starting: ");
        }
        EntityAITaskEntry entityaitaskentry1;
        for(Iterator iterator1 = arraylist.iterator(); iterator1.hasNext(); entityaitaskentry1.field_46114_a.func_46080_e())
        {
            entityaitaskentry1 = (EntityAITaskEntry)iterator1.next();
            if(flag)
            {
                System.out.println((new StringBuilder()).append(entityaitaskentry1.field_46114_a.toString()).append(", ").toString());
            }
        }

        if(flag && field_46119_b.size() > 0)
        {
            System.out.println("Running: ");
        }
        EntityAITaskEntry entityaitaskentry2;
        for(Iterator iterator2 = field_46119_b.iterator(); iterator2.hasNext(); entityaitaskentry2.field_46114_a.func_46081_b())
        {
            entityaitaskentry2 = (EntityAITaskEntry)iterator2.next();
            if(flag)
            {
                System.out.println(entityaitaskentry2.field_46114_a.toString());
            }
        }

    }

    private boolean func_46116_a(EntityAITaskEntry p_46116_1_)
    {
label0:
        {
            Iterator iterator = field_46120_a.iterator();
            EntityAITaskEntry entityaitaskentry;
label1:
            do
            {
                do
                {
                    do
                    {
                        if(!iterator.hasNext())
                        {
                            break label0;
                        }
                        entityaitaskentry = (EntityAITaskEntry)iterator.next();
                    } while(entityaitaskentry == p_46116_1_);
                    if(p_46116_1_.field_46112_b < entityaitaskentry.field_46112_b)
                    {
                        continue label1;
                    }
                } while(!field_46119_b.contains(entityaitaskentry) || func_46117_a(p_46116_1_, entityaitaskentry));
                return false;
            } while(!field_46119_b.contains(entityaitaskentry) || entityaitaskentry.field_46114_a.func_46078_f());
            return false;
        }
        return true;
    }

    private boolean func_46117_a(EntityAITaskEntry p_46117_1_, EntityAITaskEntry p_46117_2_)
    {
        return (p_46117_1_.field_46114_a.func_46083_c() & p_46117_2_.field_46114_a.func_46083_c()) == 0;
    }
}
