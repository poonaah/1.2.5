// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Comparator;

// Referenced classes of package net.minecraft.src:
//            WorldRenderer, EntityLiving

public class RenderSorter
    implements Comparator
{

    private EntityLiving field_4274_a;

    public RenderSorter(EntityLiving p_i380_1_)
    {
        field_4274_a = p_i380_1_;
    }

    public int func_993_a(WorldRenderer p_993_1_, WorldRenderer p_993_2_)
    {
        if(p_993_1_.field_1749_o && !p_993_2_.field_1749_o)
        {
            return 1;
        }
        if(p_993_2_.field_1749_o && !p_993_1_.field_1749_o)
        {
            return -1;
        }
        double d = p_993_1_.func_1202_a(field_4274_a);
        double d1 = p_993_2_.func_1202_a(field_4274_a);
        if(d < d1)
        {
            return 1;
        }
        if(d > d1)
        {
            return -1;
        } else
        {
            return p_993_1_.field_1735_w >= p_993_2_.field_1735_w ? -1 : 1;
        }
    }

    public int compare(Object p_compare_1_, Object p_compare_2_)
    {
        return func_993_a((WorldRenderer)p_compare_1_, (WorldRenderer)p_compare_2_);
    }
}
