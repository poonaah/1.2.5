// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.IOException;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            IChunkProvider, LongHashMap, EmptyChunk, ChunkCoordIntPair, 
//            World, ChunkCoordinates, Chunk, IChunkLoader, 
//            ModLoader, IProgressUpdate, EnumCreatureType, ChunkPosition

public class ChunkProvider
    implements IChunkProvider
{

    private Set field_28065_a;
    private Chunk field_28064_b;
    private IChunkProvider field_28070_c;
    private IChunkLoader field_28069_d;
    private LongHashMap field_28068_e;
    private List field_28067_f;
    private World field_28066_g;
    private int field_35392_h;

    public ChunkProvider(World p_i415_1_, IChunkLoader p_i415_2_, IChunkProvider p_i415_3_)
    {
        field_28065_a = new HashSet();
        field_28068_e = new LongHashMap();
        field_28067_f = new ArrayList();
        field_28064_b = new EmptyChunk(p_i415_1_, 0, 0);
        field_28066_g = p_i415_1_;
        field_28069_d = p_i415_2_;
        field_28070_c = p_i415_3_;
    }

    public boolean func_537_a(int p_537_1_, int p_537_2_)
    {
        return field_28068_e.func_35575_b(ChunkCoordIntPair.func_22011_a(p_537_1_, p_537_2_));
    }

    public void func_35391_d(int p_35391_1_, int p_35391_2_)
    {
        ChunkCoordinates chunkcoordinates = field_28066_g.func_22137_s();
        int i = (p_35391_1_ * 16 + 8) - chunkcoordinates.field_22395_a;
        int j = (p_35391_2_ * 16 + 8) - chunkcoordinates.field_22396_c;
        char c = '\200';
        if(i < -c || i > c || j < -c || j > c)
        {
            field_28065_a.add(Long.valueOf(ChunkCoordIntPair.func_22011_a(p_35391_1_, p_35391_2_)));
        }
    }

    public Chunk func_538_d(int p_538_1_, int p_538_2_)
    {
        long l = ChunkCoordIntPair.func_22011_a(p_538_1_, p_538_2_);
        field_28065_a.remove(Long.valueOf(l));
        Chunk chunk = (Chunk)field_28068_e.func_35578_a(l);
        if(chunk == null)
        {
            int i = 0x1c9c3c;
            if(p_538_1_ < -i || p_538_2_ < -i || p_538_1_ >= i || p_538_2_ >= i)
            {
                return field_28064_b;
            }
            chunk = func_28061_d(p_538_1_, p_538_2_);
            if(chunk == null)
            {
                if(field_28070_c == null)
                {
                    chunk = field_28064_b;
                } else
                {
                    chunk = field_28070_c.func_533_b(p_538_1_, p_538_2_);
                }
            }
            field_28068_e.func_35577_a(l, chunk);
            field_28067_f.add(chunk);
            if(chunk != null)
            {
                chunk.func_4143_d();
                chunk.func_995_d();
            }
            chunk.func_35843_a(this, this, p_538_1_, p_538_2_);
        }
        return chunk;
    }

    public Chunk func_533_b(int p_533_1_, int p_533_2_)
    {
        Chunk chunk = (Chunk)field_28068_e.func_35578_a(ChunkCoordIntPair.func_22011_a(p_533_1_, p_533_2_));
        return chunk != null ? chunk : func_538_d(p_533_1_, p_533_2_);
    }

    private Chunk func_28061_d(int p_28061_1_, int p_28061_2_)
    {
        if(field_28069_d == null)
        {
            return null;
        }
        try
        {
            Chunk chunk = field_28069_d.func_813_a(field_28066_g, p_28061_1_, p_28061_2_);
            if(chunk != null)
            {
                chunk.field_1522_s = field_28066_g.func_22139_r();
            }
            return chunk;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return null;
    }

    private void func_28063_a(Chunk p_28063_1_)
    {
        if(field_28069_d != null)
        {
            try
            {
                field_28069_d.func_815_b(field_28066_g, p_28063_1_);
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }
        }
    }

    private void func_28062_b(Chunk p_28062_1_)
    {
        if(field_28069_d != null)
        {
            try
            {
                p_28062_1_.field_1522_s = field_28066_g.func_22139_r();
                field_28069_d.func_812_a(field_28066_g, p_28062_1_);
            }
            catch(IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
    }

    public void func_534_a(IChunkProvider p_534_1_, int p_534_2_, int p_534_3_)
    {
        Chunk chunk = func_533_b(p_534_2_, p_534_3_);
        if(!chunk.field_1527_n)
        {
            chunk.field_1527_n = true;
            if(field_28070_c != null)
            {
                field_28070_c.func_534_a(p_534_1_, p_534_2_, p_534_3_);
                ModLoader.populateChunk(field_28070_c, p_534_2_, p_534_3_, field_28066_g);
                chunk.func_1006_f();
            }
        }
    }

    public boolean func_535_a(boolean p_535_1_, IProgressUpdate p_535_2_)
    {
        int i = 0;
        for(int j = 0; j < field_28067_f.size(); j++)
        {
            Chunk chunk = (Chunk)field_28067_f.get(j);
            if(p_535_1_)
            {
                func_28063_a(chunk);
            }
            if(chunk.func_1012_a(p_535_1_))
            {
                func_28062_b(chunk);
                chunk.field_1526_o = false;
                if(++i == 24 && !p_535_1_)
                {
                    return false;
                }
            }
        }

        if(p_535_1_)
        {
            if(field_28069_d == null)
            {
                return true;
            }
            field_28069_d.func_811_b();
        }
        return true;
    }

    public boolean func_532_a()
    {
        for(int i = 0; i < 100; i++)
        {
            if(!field_28065_a.isEmpty())
            {
                Long long1 = (Long)field_28065_a.iterator().next();
                Chunk chunk1 = (Chunk)field_28068_e.func_35578_a(long1.longValue());
                chunk1.func_998_e();
                func_28062_b(chunk1);
                func_28063_a(chunk1);
                field_28065_a.remove(long1);
                field_28068_e.func_35574_d(long1.longValue());
                field_28067_f.remove(chunk1);
            }
        }

        for(int j = 0; j < 10; j++)
        {
            if(field_35392_h >= field_28067_f.size())
            {
                field_35392_h = 0;
                break;
            }
            Chunk chunk = (Chunk)field_28067_f.get(field_35392_h++);
            EntityPlayer entityplayer = field_28066_g.func_48456_a((double)(chunk.field_1531_j << 4) + 8D, (double)(chunk.field_1530_k << 4) + 8D, 288D);
            if(entityplayer == null)
            {
                func_35391_d(chunk.field_1531_j, chunk.field_1530_k);
            }
        }

        if(field_28069_d != null)
        {
            field_28069_d.func_814_a();
        }
        return field_28070_c.func_532_a();
    }

    public boolean func_536_b()
    {
        return true;
    }

    public String func_21109_c()
    {
        return (new StringBuilder("ServerChunkCache: ")).append(field_28068_e.func_35576_a()).append(" Drop: ").append(field_28065_a.size()).toString();
    }

    public List func_40377_a(EnumCreatureType p_40377_1_, int p_40377_2_, int p_40377_3_, int p_40377_4_)
    {
        return field_28070_c.func_40377_a(p_40377_1_, p_40377_2_, p_40377_3_, p_40377_4_);
    }

    public ChunkPosition func_40376_a(World p_40376_1_, String p_40376_2_, int p_40376_3_, int p_40376_4_, int p_40376_5_)
    {
        return field_28070_c.func_40376_a(p_40376_1_, p_40376_2_, p_40376_3_, p_40376_4_, p_40376_5_);
    }
}
