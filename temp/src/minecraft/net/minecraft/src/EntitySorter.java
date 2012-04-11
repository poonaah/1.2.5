// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Comparator;

// Referenced classes of package net.minecraft.src:
//            Entity, WorldRenderer

public class EntitySorter
    implements Comparator
{

    private double field_30008_a;
    private double field_30007_b;
    private double field_30009_c;

    public EntitySorter(Entity p_i349_1_)
    {
        field_30008_a = -p_i349_1_.field_611_ak;
        field_30007_b = -p_i349_1_.field_610_al;
        field_30009_c = -p_i349_1_.field_609_am;
    }

    public int func_1063_a(WorldRenderer p_1063_1_, WorldRenderer p_1063_2_)
    {
        double d = (double)p_1063_1_.field_1746_q + field_30008_a;
        double d1 = (double)p_1063_1_.field_1743_r + field_30007_b;
        double d2 = (double)p_1063_1_.field_1741_s + field_30009_c;
        double d3 = (double)p_1063_2_.field_1746_q + field_30008_a;
        double d4 = (double)p_1063_2_.field_1743_r + field_30007_b;
        double d5 = (double)p_1063_2_.field_1741_s + field_30009_c;
        return (int)(((d * d + d1 * d1 + d2 * d2) - (d3 * d3 + d4 * d4 + d5 * d5)) * 1024D);
    }

    public int compare(Object p_compare_1_, Object p_compare_2_)
    {
        return func_1063_a((WorldRenderer)p_compare_1_, (WorldRenderer)p_compare_2_);
    }
}
