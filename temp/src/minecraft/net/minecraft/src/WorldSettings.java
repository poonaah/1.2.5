// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            WorldType

public final class WorldSettings
{

    private final long field_35523_a;
    private final int field_35521_b;
    private final boolean field_35522_c;
    private final boolean field_40558_d;
    private final WorldType field_46108_e;

    public WorldSettings(long p_i1033_1_, int p_i1033_3_, boolean p_i1033_4_, boolean p_i1033_5_, WorldType p_i1033_6_)
    {
        field_35523_a = p_i1033_1_;
        field_35521_b = p_i1033_3_;
        field_35522_c = p_i1033_4_;
        field_40558_d = p_i1033_5_;
        field_46108_e = p_i1033_6_;
    }

    public long func_35518_a()
    {
        return field_35523_a;
    }

    public int func_35519_b()
    {
        return field_35521_b;
    }

    public boolean func_40557_c()
    {
        return field_40558_d;
    }

    public boolean func_35520_c()
    {
        return field_35522_c;
    }

    public WorldType func_46107_e()
    {
        return field_46108_e;
    }
}
