// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Comparator;

// Referenced classes of package net.minecraft.src:
//            Entity, EntityAINearestAttackableTarget

public class EntityAINearestAttackableTargetSorter
    implements Comparator
{

    private Entity field_48470_b;
    final EntityAINearestAttackableTarget field_48471_a; /* synthetic field */

    public EntityAINearestAttackableTargetSorter(EntityAINearestAttackableTarget p_i1028_1_, Entity p_i1028_2_)
    {
        field_48471_a = p_i1028_1_;
        super();
        field_48470_b = p_i1028_2_;
    }

    public int func_48469_a(Entity p_48469_1_, Entity p_48469_2_)
    {
        double d = field_48470_b.func_387_e(p_48469_1_);
        double d1 = field_48470_b.func_387_e(p_48469_2_);
        if(d < d1)
        {
            return -1;
        }
        return d <= d1 ? 0 : 1;
    }

    public int compare(Object p_compare_1_, Object p_compare_2_)
    {
        return func_48469_a((Entity)p_compare_1_, (Entity)p_compare_2_);
    }
}
