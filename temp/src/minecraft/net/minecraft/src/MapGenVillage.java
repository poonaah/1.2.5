// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            MapGenStructure, World, WorldChunkManager, StructureVillageStart, 
//            BiomeGenBase, StructureStart

public class MapGenVillage extends MapGenStructure
{

    public static List field_35635_a;
    private final int field_46060_f;

    public MapGenVillage(int p_i228_1_)
    {
        field_46060_f = p_i228_1_;
    }

    protected boolean func_35628_a(int p_35628_1_, int p_35628_2_)
    {
        byte byte0 = 32;
        byte byte1 = 8;
        int i = p_35628_1_;
        int j = p_35628_2_;
        if(p_35628_1_ < 0)
        {
            p_35628_1_ -= byte0 - 1;
        }
        if(p_35628_2_ < 0)
        {
            p_35628_2_ -= byte0 - 1;
        }
        int k = p_35628_1_ / byte0;
        int l = p_35628_2_ / byte0;
        Random random = field_35625_d.func_35462_u(k, l, 0x9e7f70);
        k *= byte0;
        l *= byte0;
        k += random.nextInt(byte0 - byte1);
        l += random.nextInt(byte0 - byte1);
        p_35628_1_ = i;
        p_35628_2_ = j;
        if(p_35628_1_ == k && p_35628_2_ == l)
        {
            boolean flag = field_35625_d.func_4075_a().func_35562_a(p_35628_1_ * 16 + 8, p_35628_2_ * 16 + 8, 0, field_35635_a);
            if(flag)
            {
                return true;
            }
        }
        return false;
    }

    protected StructureStart func_35630_b(int p_35630_1_, int p_35630_2_)
    {
        return new StructureVillageStart(field_35625_d, field_1305_b, p_35630_1_, p_35630_2_, field_46060_f);
    }

    static 
    {
        field_35635_a = Arrays.asList(new BiomeGenBase[] {
            BiomeGenBase.field_35485_c, BiomeGenBase.field_4249_h
        });
    }
}
