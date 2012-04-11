// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, SpawnListEntry, EntityEnderman, Block, 
//            BiomeEndDecorator

public class BiomeGenEnd extends BiomeGenBase
{

    public BiomeGenEnd(int p_i333_1_)
    {
        super(p_i333_1_);
        field_25066_r.clear();
        field_25065_s.clear();
        field_25064_t.clear();
        field_25066_r.add(new SpawnListEntry(net.minecraft.src.EntityEnderman.class, 10, 4, 4));
        field_4242_o = (byte)Block.field_336_w.field_376_bc;
        field_4241_p = (byte)Block.field_336_w.field_376_bc;
        field_35488_u = new BiomeEndDecorator(this);
    }

    public int func_4126_a(float p_4126_1_)
    {
        return 0;
    }
}
