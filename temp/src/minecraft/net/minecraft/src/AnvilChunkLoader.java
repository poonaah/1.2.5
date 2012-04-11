// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.*;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            IThreadedFileIO, IChunkLoader, ChunkCoordIntPair, AnvilChunkLoaderPending, 
//            RegionFileCache, CompressedStreamTools, NBTTagCompound, Chunk, 
//            World, ThreadedFileIOBase, NBTTagList, ExtendedBlockStorage, 
//            NibbleArray, Entity, TileEntity, NextTickListEntry, 
//            EntityList

public class AnvilChunkLoader
    implements IThreadedFileIO, IChunkLoader
{

    private List field_48451_a;
    private Set field_48449_b;
    private Object field_48450_c;
    private final File field_48448_d;

    public AnvilChunkLoader(File p_i1014_1_)
    {
        field_48451_a = new ArrayList();
        field_48449_b = new HashSet();
        field_48450_c = new Object();
        field_48448_d = p_i1014_1_;
    }

    public Chunk func_813_a(World p_813_1_, int p_813_2_, int p_813_3_)
        throws IOException
    {
        NBTTagCompound nbttagcompound = null;
        ChunkCoordIntPair chunkcoordintpair = new ChunkCoordIntPair(p_813_2_, p_813_3_);
        synchronized(field_48450_c)
        {
            if(field_48449_b.contains(chunkcoordintpair))
            {
                int i = 0;
                do
                {
                    if(i >= field_48451_a.size())
                    {
                        break;
                    }
                    if(((AnvilChunkLoaderPending)field_48451_a.get(i)).field_48427_a.equals(chunkcoordintpair))
                    {
                        nbttagcompound = ((AnvilChunkLoaderPending)field_48451_a.get(i)).field_48426_b;
                        break;
                    }
                    i++;
                } while(true);
            }
        }
        if(nbttagcompound == null)
        {
            java.io.DataInputStream datainputstream = RegionFileCache.func_22194_c(field_48448_d, p_813_2_, p_813_3_);
            if(datainputstream != null)
            {
                nbttagcompound = CompressedStreamTools.func_1141_a(datainputstream);
            } else
            {
                return null;
            }
        }
        return func_48443_a(p_813_1_, p_813_2_, p_813_3_, nbttagcompound);
    }

    protected Chunk func_48443_a(World p_48443_1_, int p_48443_2_, int p_48443_3_, NBTTagCompound p_48443_4_)
    {
        if(!p_48443_4_.func_751_b("Level"))
        {
            System.out.println((new StringBuilder()).append("Chunk file at ").append(p_48443_2_).append(",").append(p_48443_3_).append(" is missing level data, skipping").toString());
            return null;
        }
        if(!p_48443_4_.func_743_k("Level").func_751_b("Sections"))
        {
            System.out.println((new StringBuilder()).append("Chunk file at ").append(p_48443_2_).append(",").append(p_48443_3_).append(" is missing block data, skipping").toString());
            return null;
        }
        Chunk chunk = func_48444_a(p_48443_1_, p_48443_4_.func_743_k("Level"));
        if(!chunk.func_1017_a(p_48443_2_, p_48443_3_))
        {
            System.out.println((new StringBuilder()).append("Chunk file at ").append(p_48443_2_).append(",").append(p_48443_3_).append(" is in the wrong location; relocating. (Expected ").append(p_48443_2_).append(", ").append(p_48443_3_).append(", got ").append(chunk.field_1531_j).append(", ").append(chunk.field_1530_k).append(")").toString());
            p_48443_4_.func_758_a("xPos", p_48443_2_);
            p_48443_4_.func_758_a("zPos", p_48443_3_);
            chunk = func_48444_a(p_48443_1_, p_48443_4_.func_743_k("Level"));
        }
        chunk.func_25124_i();
        return chunk;
    }

    public void func_812_a(World p_812_1_, Chunk p_812_2_)
        throws IOException
    {
        p_812_1_.func_663_l();
        try
        {
            NBTTagCompound nbttagcompound = new NBTTagCompound();
            NBTTagCompound nbttagcompound1 = new NBTTagCompound();
            nbttagcompound.func_762_a("Level", nbttagcompound1);
            func_48445_a(p_812_2_, p_812_1_, nbttagcompound1);
            func_48446_a(p_812_2_.func_40740_k(), nbttagcompound);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    protected void func_48446_a(ChunkCoordIntPair p_48446_1_, NBTTagCompound p_48446_2_)
    {
        synchronized(field_48450_c)
        {
            if(field_48449_b.contains(p_48446_1_))
            {
                for(int i = 0; i < field_48451_a.size(); i++)
                {
                    if(((AnvilChunkLoaderPending)field_48451_a.get(i)).field_48427_a.equals(p_48446_1_))
                    {
                        field_48451_a.set(i, new AnvilChunkLoaderPending(p_48446_1_, p_48446_2_));
                        return;
                    }
                }

            }
            field_48451_a.add(new AnvilChunkLoaderPending(p_48446_1_, p_48446_2_));
            field_48449_b.add(p_48446_1_);
            ThreadedFileIOBase.field_40573_a.func_40567_a(this);
            return;
        }
    }

    public boolean func_40550_A_()
    {
        AnvilChunkLoaderPending anvilchunkloaderpending = null;
        synchronized(field_48450_c)
        {
            if(field_48451_a.size() > 0)
            {
                anvilchunkloaderpending = (AnvilChunkLoaderPending)field_48451_a.remove(0);
                field_48449_b.remove(anvilchunkloaderpending.field_48427_a);
            } else
            {
                return false;
            }
        }
        if(anvilchunkloaderpending != null)
        {
            try
            {
                func_48447_a(anvilchunkloaderpending);
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }
        }
        return true;
    }

    private void func_48447_a(AnvilChunkLoaderPending p_48447_1_)
        throws IOException
    {
        DataOutputStream dataoutputstream = RegionFileCache.func_22190_d(field_48448_d, p_48447_1_.field_48427_a.field_189_a, p_48447_1_.field_48427_a.field_188_b);
        CompressedStreamTools.func_1139_a(p_48447_1_.field_48426_b, dataoutputstream);
        dataoutputstream.close();
    }

    public void func_815_b(World world, Chunk chunk)
        throws IOException
    {
    }

    public void func_814_a()
    {
    }

    public void func_811_b()
    {
    }

    private void func_48445_a(Chunk p_48445_1_, World p_48445_2_, NBTTagCompound p_48445_3_)
    {
        p_48445_2_.func_663_l();
        p_48445_3_.func_758_a("xPos", p_48445_1_.field_1531_j);
        p_48445_3_.func_758_a("zPos", p_48445_1_.field_1530_k);
        p_48445_3_.func_750_a("LastUpdate", p_48445_2_.func_22139_r());
        p_48445_3_.func_48183_a("HeightMap", p_48445_1_.field_48501_f);
        p_48445_3_.func_748_a("TerrainPopulated", p_48445_1_.field_1527_n);
        ExtendedBlockStorage aextendedblockstorage[] = p_48445_1_.func_48495_i();
        NBTTagList nbttaglist = new NBTTagList("Sections");
        ExtendedBlockStorage aextendedblockstorage1[] = aextendedblockstorage;
        int i = aextendedblockstorage1.length;
        for(int k = 0; k < i; k++)
        {
            ExtendedBlockStorage extendedblockstorage = aextendedblockstorage1[k];
            if(extendedblockstorage == null || extendedblockstorage.func_48700_f() == 0)
            {
                continue;
            }
            NBTTagCompound nbttagcompound = new NBTTagCompound();
            nbttagcompound.func_761_a("Y", (byte)(extendedblockstorage.func_48707_c() >> 4 & 0xff));
            nbttagcompound.func_747_a("Blocks", extendedblockstorage.func_48692_g());
            if(extendedblockstorage.func_48704_i() != null)
            {
                nbttagcompound.func_747_a("Add", extendedblockstorage.func_48704_i().field_1109_a);
            }
            nbttagcompound.func_747_a("Data", extendedblockstorage.func_48697_j().field_1109_a);
            nbttagcompound.func_747_a("SkyLight", extendedblockstorage.func_48714_l().field_1109_a);
            nbttagcompound.func_747_a("BlockLight", extendedblockstorage.func_48705_k().field_1109_a);
            nbttaglist.func_742_a(nbttagcompound);
        }

        p_48445_3_.func_762_a("Sections", nbttaglist);
        p_48445_3_.func_747_a("Biomes", p_48445_1_.func_48493_m());
        p_48445_1_.field_1523_r = false;
        NBTTagList nbttaglist1 = new NBTTagList();
label0:
        for(int j = 0; j < p_48445_1_.field_48502_j.length; j++)
        {
            Iterator iterator = p_48445_1_.field_48502_j[j].iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    continue label0;
                }
                Entity entity = (Entity)iterator.next();
                p_48445_1_.field_1523_r = true;
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                if(entity.func_358_c(nbttagcompound1))
                {
                    nbttaglist1.func_742_a(nbttagcompound1);
                }
            } while(true);
        }

        p_48445_3_.func_762_a("Entities", nbttaglist1);
        NBTTagList nbttaglist2 = new NBTTagList();
        NBTTagCompound nbttagcompound2;
        for(Iterator iterator1 = p_48445_1_.field_1529_l.values().iterator(); iterator1.hasNext(); nbttaglist2.func_742_a(nbttagcompound2))
        {
            TileEntity tileentity = (TileEntity)iterator1.next();
            nbttagcompound2 = new NBTTagCompound();
            tileentity.func_481_b(nbttagcompound2);
        }

        p_48445_3_.func_762_a("TileEntities", nbttaglist2);
        List list = p_48445_2_.func_41081_a(p_48445_1_, false);
        if(list != null)
        {
            long l = p_48445_2_.func_22139_r();
            NBTTagList nbttaglist3 = new NBTTagList();
            NBTTagCompound nbttagcompound3;
            for(Iterator iterator2 = list.iterator(); iterator2.hasNext(); nbttaglist3.func_742_a(nbttagcompound3))
            {
                NextTickListEntry nextticklistentry = (NextTickListEntry)iterator2.next();
                nbttagcompound3 = new NBTTagCompound();
                nbttagcompound3.func_758_a("i", nextticklistentry.field_1365_d);
                nbttagcompound3.func_758_a("x", nextticklistentry.field_1361_a);
                nbttagcompound3.func_758_a("y", nextticklistentry.field_1360_b);
                nbttagcompound3.func_758_a("z", nextticklistentry.field_1366_c);
                nbttagcompound3.func_758_a("t", (int)(nextticklistentry.field_1364_e - l));
            }

            p_48445_3_.func_762_a("TileTicks", nbttaglist3);
        }
    }

    private Chunk func_48444_a(World p_48444_1_, NBTTagCompound p_48444_2_)
    {
        int i = p_48444_2_.func_756_e("xPos");
        int j = p_48444_2_.func_756_e("zPos");
        Chunk chunk = new Chunk(p_48444_1_, i, j);
        chunk.field_48501_f = p_48444_2_.func_48182_l("HeightMap");
        chunk.field_1527_n = p_48444_2_.func_760_m("TerrainPopulated");
        NBTTagList nbttaglist = p_48444_2_.func_753_l("Sections");
        byte byte0 = 16;
        ExtendedBlockStorage aextendedblockstorage[] = new ExtendedBlockStorage[byte0];
        for(int k = 0; k < nbttaglist.func_740_c(); k++)
        {
            NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.func_741_a(k);
            byte byte1 = nbttagcompound.func_746_c("Y");
            ExtendedBlockStorage extendedblockstorage = new ExtendedBlockStorage(byte1 << 4);
            extendedblockstorage.func_48706_a(nbttagcompound.func_759_j("Blocks"));
            if(nbttagcompound.func_751_b("Add"))
            {
                extendedblockstorage.func_48710_a(new NibbleArray(nbttagcompound.func_759_j("Add"), 4));
            }
            extendedblockstorage.func_48701_b(new NibbleArray(nbttagcompound.func_759_j("Data"), 4));
            extendedblockstorage.func_48713_d(new NibbleArray(nbttagcompound.func_759_j("SkyLight"), 4));
            extendedblockstorage.func_48695_c(new NibbleArray(nbttagcompound.func_759_j("BlockLight"), 4));
            extendedblockstorage.func_48708_d();
            aextendedblockstorage[byte1] = extendedblockstorage;
        }

        chunk.func_48500_a(aextendedblockstorage);
        if(p_48444_2_.func_751_b("Biomes"))
        {
            chunk.func_48497_a(p_48444_2_.func_759_j("Biomes"));
        }
        NBTTagList nbttaglist1 = p_48444_2_.func_753_l("Entities");
        if(nbttaglist1 != null)
        {
            for(int l = 0; l < nbttaglist1.func_740_c(); l++)
            {
                NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist1.func_741_a(l);
                Entity entity = EntityList.func_1081_a(nbttagcompound1, p_48444_1_);
                chunk.field_1523_r = true;
                if(entity != null)
                {
                    chunk.func_1000_a(entity);
                }
            }

        }
        NBTTagList nbttaglist2 = p_48444_2_.func_753_l("TileEntities");
        if(nbttaglist2 != null)
        {
            for(int i1 = 0; i1 < nbttaglist2.func_740_c(); i1++)
            {
                NBTTagCompound nbttagcompound2 = (NBTTagCompound)nbttaglist2.func_741_a(i1);
                TileEntity tileentity = TileEntity.func_477_c(nbttagcompound2);
                if(tileentity != null)
                {
                    chunk.func_1001_a(tileentity);
                }
            }

        }
        if(p_48444_2_.func_751_b("TileTicks"))
        {
            NBTTagList nbttaglist3 = p_48444_2_.func_753_l("TileTicks");
            if(nbttaglist3 != null)
            {
                for(int j1 = 0; j1 < nbttaglist3.func_740_c(); j1++)
                {
                    NBTTagCompound nbttagcompound3 = (NBTTagCompound)nbttaglist3.func_741_a(j1);
                    p_48444_1_.func_41083_e(nbttagcompound3.func_756_e("x"), nbttagcompound3.func_756_e("y"), nbttagcompound3.func_756_e("z"), nbttagcompound3.func_756_e("i"), nbttagcompound3.func_756_e("t"));
                }

            }
        }
        return chunk;
    }
}
