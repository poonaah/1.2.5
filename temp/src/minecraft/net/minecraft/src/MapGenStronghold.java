// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            MapGenStructure, BiomeGenBase, ChunkCoordIntPair, World, 
//            WorldChunkManager, ChunkPosition, StructureStrongholdStart, ComponentStrongholdStairs2, 
//            StructureStart

public class MapGenStronghold extends MapGenStructure
{

    private BiomeGenBase field_35634_a[];
    private boolean field_35632_f;
    private ChunkCoordIntPair field_35633_g[];

    public MapGenStronghold()
    {
        field_35634_a = (new BiomeGenBase[] {
            BiomeGenBase.field_4249_h, BiomeGenBase.field_4253_d, BiomeGenBase.field_35483_e, BiomeGenBase.field_4255_b, BiomeGenBase.field_4250_g, BiomeGenBase.field_40257_n, BiomeGenBase.field_40258_o, BiomeGenBase.field_46049_s, BiomeGenBase.field_46048_t, BiomeGenBase.field_46046_v, 
            BiomeGenBase.field_48416_w, BiomeGenBase.field_48417_x
        });
        field_35633_g = new ChunkCoordIntPair[3];
    }

    protected boolean func_35628_a(int p_35628_1_, int p_35628_2_)
    {
        if(!field_35632_f)
        {
            Random random = new Random();
            random.setSeed(field_35625_d.func_22138_q());
            double d = random.nextDouble() * 3.1415926535897931D * 2D;
            for(int k = 0; k < field_35633_g.length; k++)
            {
                double d1 = (1.25D + random.nextDouble()) * 32D;
                int l = (int)Math.round(Math.cos(d) * d1);
                int i1 = (int)Math.round(Math.sin(d) * d1);
                ArrayList arraylist = new ArrayList();
                BiomeGenBase abiomegenbase[] = field_35634_a;
                int j1 = abiomegenbase.length;
                for(int k1 = 0; k1 < j1; k1++)
                {
                    BiomeGenBase biomegenbase = abiomegenbase[k1];
                    arraylist.add(biomegenbase);
                }

                ChunkPosition chunkposition = field_35625_d.func_4075_a().func_35556_a((l << 4) + 8, (i1 << 4) + 8, 112, arraylist, random);
                if(chunkposition != null)
                {
                    l = chunkposition.field_1111_a >> 4;
                    i1 = chunkposition.field_1112_c >> 4;
                } else
                {
                    System.out.println((new StringBuilder()).append("Placed stronghold in INVALID biome at (").append(l).append(", ").append(i1).append(")").toString());
                }
                field_35633_g[k] = new ChunkCoordIntPair(l, i1);
                d += 6.2831853071795862D / (double)field_35633_g.length;
            }

            field_35632_f = true;
        }
        ChunkCoordIntPair achunkcoordintpair[] = field_35633_g;
        int i = achunkcoordintpair.length;
        for(int j = 0; j < i; j++)
        {
            ChunkCoordIntPair chunkcoordintpair = achunkcoordintpair[j];
            if(p_35628_1_ == chunkcoordintpair.field_189_a && p_35628_2_ == chunkcoordintpair.field_188_b)
            {
                System.out.println((new StringBuilder()).append(p_35628_1_).append(", ").append(p_35628_2_).toString());
                return true;
            }
        }

        return false;
    }

    protected List func_40482_a()
    {
        ArrayList arraylist = new ArrayList();
        ChunkCoordIntPair achunkcoordintpair[] = field_35633_g;
        int i = achunkcoordintpair.length;
        for(int j = 0; j < i; j++)
        {
            ChunkCoordIntPair chunkcoordintpair = achunkcoordintpair[j];
            if(chunkcoordintpair != null)
            {
                arraylist.add(chunkcoordintpair.func_40737_a(64));
            }
        }

        return arraylist;
    }

    protected StructureStart func_35630_b(int p_35630_1_, int p_35630_2_)
    {
        StructureStrongholdStart structurestrongholdstart;
        for(structurestrongholdstart = new StructureStrongholdStart(field_35625_d, field_1305_b, p_35630_1_, p_35630_2_); structurestrongholdstart.func_40560_b().isEmpty() || ((ComponentStrongholdStairs2)structurestrongholdstart.func_40560_b().get(0)).field_40009_b == null; structurestrongholdstart = new StructureStrongholdStart(field_35625_d, field_1305_b, p_35630_1_, p_35630_2_)) { }
        return structurestrongholdstart;
    }
}
