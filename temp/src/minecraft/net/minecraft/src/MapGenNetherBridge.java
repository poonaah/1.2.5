// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            MapGenStructure, SpawnListEntry, EntityBlaze, EntityPigZombie, 
//            EntityMagmaCube, World, StructureNetherBridgeStart, StructureStart

public class MapGenNetherBridge extends MapGenStructure
{

    private List field_40486_a;

    public MapGenNetherBridge()
    {
        field_40486_a = new ArrayList();
        field_40486_a.add(new SpawnListEntry(net.minecraft.src.EntityBlaze.class, 10, 2, 3));
        field_40486_a.add(new SpawnListEntry(net.minecraft.src.EntityPigZombie.class, 10, 4, 4));
        field_40486_a.add(new SpawnListEntry(net.minecraft.src.EntityMagmaCube.class, 3, 4, 4));
    }

    public List func_40485_b()
    {
        return field_40486_a;
    }

    protected boolean func_35628_a(int p_35628_1_, int p_35628_2_)
    {
        int i = p_35628_1_ >> 4;
        int j = p_35628_2_ >> 4;
        field_1305_b.setSeed((long)(i ^ j << 4) ^ field_35625_d.func_22138_q());
        field_1305_b.nextInt();
        if(field_1305_b.nextInt(3) != 0)
        {
            return false;
        }
        if(p_35628_1_ != (i << 4) + 4 + field_1305_b.nextInt(8))
        {
            return false;
        }
        return p_35628_2_ == (j << 4) + 4 + field_1305_b.nextInt(8);
    }

    protected StructureStart func_35630_b(int p_35630_1_, int p_35630_2_)
    {
        return new StructureNetherBridgeStart(field_35625_d, field_1305_b, p_35630_1_, p_35630_2_);
    }
}
