// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, SpawnListEntry, EntityGhast, EntityPigZombie, 
//            EntityMagmaCube

public class BiomeGenHell extends BiomeGenBase
{

    public BiomeGenHell(int p_i604_1_)
    {
        super(p_i604_1_);
        field_25066_r.clear();
        field_25065_s.clear();
        field_25064_t.clear();
        field_25066_r.add(new SpawnListEntry(net.minecraft.src.EntityGhast.class, 50, 4, 4));
        field_25066_r.add(new SpawnListEntry(net.minecraft.src.EntityPigZombie.class, 100, 4, 4));
        field_25066_r.add(new SpawnListEntry(net.minecraft.src.EntityMagmaCube.class, 1, 4, 4));
    }
}
