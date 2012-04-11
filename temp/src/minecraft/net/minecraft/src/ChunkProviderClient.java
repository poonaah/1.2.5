// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            IChunkProvider, LongHashMap, EmptyChunk, Chunk, 
//            ChunkCoordIntPair, World, IProgressUpdate, EnumCreatureType, 
//            ChunkPosition

public class ChunkProviderClient
    implements IChunkProvider
{

    private Chunk field_887_a;
    private LongHashMap field_886_b;
    private List field_889_c;
    private World field_888_d;

    public ChunkProviderClient(World p_i511_1_)
    {
        field_886_b = new LongHashMap();
        field_889_c = new ArrayList();
        field_887_a = new EmptyChunk(p_i511_1_, 0, 0);
        field_888_d = p_i511_1_;
    }

    public boolean func_537_a(int p_537_1_, int p_537_2_)
    {
        return true;
    }

    public void func_539_c(int p_539_1_, int p_539_2_)
    {
        Chunk chunk = func_533_b(p_539_1_, p_539_2_);
        if(!chunk.func_21167_h())
        {
            chunk.func_998_e();
        }
        field_886_b.func_35574_d(ChunkCoordIntPair.func_22011_a(p_539_1_, p_539_2_));
        field_889_c.remove(chunk);
    }

    public Chunk func_538_d(int p_538_1_, int p_538_2_)
    {
        Chunk chunk = new Chunk(field_888_d, p_538_1_, p_538_2_);
        field_886_b.func_35577_a(ChunkCoordIntPair.func_22011_a(p_538_1_, p_538_2_), chunk);
        chunk.field_1538_c = true;
        return chunk;
    }

    public Chunk func_533_b(int p_533_1_, int p_533_2_)
    {
        Chunk chunk = (Chunk)field_886_b.func_35578_a(ChunkCoordIntPair.func_22011_a(p_533_1_, p_533_2_));
        if(chunk == null)
        {
            return field_887_a;
        } else
        {
            return chunk;
        }
    }

    public boolean func_535_a(boolean p_535_1_, IProgressUpdate p_535_2_)
    {
        return true;
    }

    public boolean func_532_a()
    {
        return false;
    }

    public boolean func_536_b()
    {
        return false;
    }

    public void func_534_a(IChunkProvider ichunkprovider, int i, int j)
    {
    }

    public String func_21109_c()
    {
        return (new StringBuilder()).append("MultiplayerChunkCache: ").append(field_886_b.func_35576_a()).toString();
    }

    public List func_40377_a(EnumCreatureType p_40377_1_, int p_40377_2_, int p_40377_3_, int i)
    {
        return null;
    }

    public ChunkPosition func_40376_a(World p_40376_1_, String p_40376_2_, int p_40376_3_, int i, int j)
    {
        return null;
    }
}
