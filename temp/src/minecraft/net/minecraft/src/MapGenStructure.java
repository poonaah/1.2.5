// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            MapGenBase, ChunkCoordIntPair, StructureStart, StructureBoundingBox, 
//            StructureComponent, World, ChunkPosition, IChunkProvider

public abstract class MapGenStructure extends MapGenBase
{

    protected HashMap field_35631_e;

    public MapGenStructure()
    {
        field_35631_e = new HashMap();
    }

    public void func_867_a(IChunkProvider p_867_1_, World p_867_2_, int p_867_3_, int p_867_4_, byte p_867_5_[])
    {
        super.func_867_a(p_867_1_, p_867_2_, p_867_3_, p_867_4_, p_867_5_);
    }

    protected void func_868_a(World p_868_1_, int p_868_2_, int p_868_3_, int p_868_4_, int p_868_5_, byte p_868_6_[])
    {
        if(field_35631_e.containsKey(Long.valueOf(ChunkCoordIntPair.func_22011_a(p_868_2_, p_868_3_))))
        {
            return;
        }
        field_1305_b.nextInt();
        if(func_35628_a(p_868_2_, p_868_3_))
        {
            StructureStart structurestart = func_35630_b(p_868_2_, p_868_3_);
            field_35631_e.put(Long.valueOf(ChunkCoordIntPair.func_22011_a(p_868_2_, p_868_3_)), structurestart);
        }
    }

    public boolean func_35629_a(World p_35629_1_, Random p_35629_2_, int p_35629_3_, int p_35629_4_)
    {
        int i = (p_35629_3_ << 4) + 8;
        int j = (p_35629_4_ << 4) + 8;
        boolean flag = false;
        Iterator iterator = field_35631_e.values().iterator();
        do
        {
            if(!iterator.hasNext())
            {
                break;
            }
            StructureStart structurestart = (StructureStart)iterator.next();
            if(structurestart.func_35715_c() && structurestart.func_35712_a().func_35746_a(i, j, i + 15, j + 15))
            {
                structurestart.func_35711_a(p_35629_1_, p_35629_2_, new StructureBoundingBox(i, j, i + 15, j + 15));
                flag = true;
            }
        } while(true);
        return flag;
    }

    public boolean func_40483_a(int p_40483_1_, int p_40483_2_, int p_40483_3_)
    {
        Iterator iterator = field_35631_e.values().iterator();
label0:
        do
        {
            if(iterator.hasNext())
            {
                StructureStart structurestart = (StructureStart)iterator.next();
                if(!structurestart.func_35715_c() || !structurestart.func_35712_a().func_35746_a(p_40483_1_, p_40483_3_, p_40483_1_, p_40483_3_))
                {
                    continue;
                }
                Iterator iterator1 = structurestart.func_40560_b().iterator();
                StructureComponent structurecomponent;
                do
                {
                    if(!iterator1.hasNext())
                    {
                        continue label0;
                    }
                    structurecomponent = (StructureComponent)iterator1.next();
                } while(!structurecomponent.func_35021_b().func_35742_b(p_40483_1_, p_40483_2_, p_40483_3_));
                break;
            } else
            {
                return false;
            }
        } while(true);
        return true;
    }

    public ChunkPosition func_40484_a(World p_40484_1_, int p_40484_2_, int p_40484_3_, int p_40484_4_)
    {
        field_35625_d = p_40484_1_;
        field_1305_b.setSeed(p_40484_1_.func_22138_q());
        long l = field_1305_b.nextLong();
        long l1 = field_1305_b.nextLong();
        long l2 = (long)(p_40484_2_ >> 4) * l;
        long l3 = (long)(p_40484_4_ >> 4) * l1;
        field_1305_b.setSeed(l2 ^ l3 ^ p_40484_1_.func_22138_q());
        func_868_a(p_40484_1_, p_40484_2_ >> 4, p_40484_4_ >> 4, 0, 0, null);
        double d = 1.7976931348623157E+308D;
        ChunkPosition chunkposition = null;
        Object obj = field_35631_e.values().iterator();
        do
        {
            if(!((Iterator) (obj)).hasNext())
            {
                break;
            }
            StructureStart structurestart = (StructureStart)((Iterator) (obj)).next();
            if(structurestart.func_35715_c())
            {
                StructureComponent structurecomponent = (StructureComponent)structurestart.func_40560_b().get(0);
                ChunkPosition chunkposition2 = structurecomponent.func_40008_a_();
                int i = chunkposition2.field_1111_a - p_40484_2_;
                int k = chunkposition2.field_1110_b - p_40484_3_;
                int j1 = chunkposition2.field_1112_c - p_40484_4_;
                double d1 = i + i * k * k + j1 * j1;
                if(d1 < d)
                {
                    d = d1;
                    chunkposition = chunkposition2;
                }
            }
        } while(true);
        if(chunkposition != null)
        {
            return chunkposition;
        }
        obj = func_40482_a();
        if(obj != null)
        {
            ChunkPosition chunkposition1 = null;
            Iterator iterator = ((List) (obj)).iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    break;
                }
                ChunkPosition chunkposition3 = (ChunkPosition)iterator.next();
                int j = chunkposition3.field_1111_a - p_40484_2_;
                int i1 = chunkposition3.field_1110_b - p_40484_3_;
                int k1 = chunkposition3.field_1112_c - p_40484_4_;
                double d2 = j + j * i1 * i1 + k1 * k1;
                if(d2 < d)
                {
                    d = d2;
                    chunkposition1 = chunkposition3;
                }
            } while(true);
            return chunkposition1;
        } else
        {
            return null;
        }
    }

    protected List func_40482_a()
    {
        return null;
    }

    protected abstract boolean func_35628_a(int i, int j);

    protected abstract StructureStart func_35630_b(int i, int j);
}
