// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, BiomeDecorator, Block, BlockMycelium, 
//            SpawnListEntry, EntityMooshroom

public class BiomeGenMushroomIsland extends BiomeGenBase
{

    public BiomeGenMushroomIsland(int p_i343_1_)
    {
        super(p_i343_1_);
        field_35488_u.field_35911_r = -100;
        field_35488_u.field_35910_s = -100;
        field_35488_u.field_35909_t = -100;
        field_35488_u.field_35907_v = 1;
        field_35488_u.field_40718_J = 1;
        field_4242_o = (byte)Block.field_40199_bz.field_376_bc;
        field_25066_r.clear();
        field_25065_s.clear();
        field_25064_t.clear();
        field_25065_s.add(new SpawnListEntry(net.minecraft.src.EntityMooshroom.class, 8, 4, 8));
    }
}
