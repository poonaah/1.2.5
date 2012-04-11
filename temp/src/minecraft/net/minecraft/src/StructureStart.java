// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            StructureComponent, StructureBoundingBox, World

public abstract class StructureStart
{

    protected LinkedList field_35717_a;
    protected StructureBoundingBox field_35716_b;

    protected StructureStart()
    {
        field_35717_a = new LinkedList();
    }

    public StructureBoundingBox func_35712_a()
    {
        return field_35716_b;
    }

    public LinkedList func_40560_b()
    {
        return field_35717_a;
    }

    public void func_35711_a(World p_35711_1_, Random p_35711_2_, StructureBoundingBox p_35711_3_)
    {
        Iterator iterator = field_35717_a.iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            StructureComponent structurecomponent = (StructureComponent)iterator.next();
            if(structurecomponent.func_35021_b().func_35740_a(p_35711_3_) && !structurecomponent.func_35023_a(p_35711_1_, p_35711_2_, p_35711_3_))
            {
                iterator.remove();
            }
        } while(true);
    }

    protected void func_35714_b()
    {
        field_35716_b = StructureBoundingBox.func_35741_a();
        StructureComponent structurecomponent;
        for(Iterator iterator = field_35717_a.iterator(); iterator.hasNext(); field_35716_b.func_35738_b(structurecomponent.func_35021_b()))
        {
            structurecomponent = (StructureComponent)iterator.next();
        }

    }

    protected void func_35713_a(World p_35713_1_, Random p_35713_2_, int p_35713_3_)
    {
        int i = 63 - p_35713_3_;
        int j = field_35716_b.func_35743_c() + 1;
        if(j < i)
        {
            j += p_35713_2_.nextInt(i - j);
        }
        int k = j - field_35716_b.field_35750_e;
        field_35716_b.func_35745_a(0, k, 0);
        StructureComponent structurecomponent;
        for(Iterator iterator = field_35717_a.iterator(); iterator.hasNext(); structurecomponent.func_35021_b().func_35745_a(0, k, 0))
        {
            structurecomponent = (StructureComponent)iterator.next();
        }

    }

    protected void func_40559_a(World p_40559_1_, Random p_40559_2_, int p_40559_3_, int p_40559_4_)
    {
        int i = ((p_40559_4_ - p_40559_3_) + 1) - field_35716_b.func_35743_c();
        int j = 1;
        if(i > 1)
        {
            j = p_40559_3_ + p_40559_2_.nextInt(i);
        } else
        {
            j = p_40559_3_;
        }
        int k = j - field_35716_b.field_35751_b;
        field_35716_b.func_35745_a(0, k, 0);
        StructureComponent structurecomponent;
        for(Iterator iterator = field_35717_a.iterator(); iterator.hasNext(); structurecomponent.func_35021_b().func_35745_a(0, k, 0))
        {
            structurecomponent = (StructureComponent)iterator.next();
        }

    }

    public boolean func_35715_c()
    {
        return true;
    }
}
