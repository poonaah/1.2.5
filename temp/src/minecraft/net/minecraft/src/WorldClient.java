// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            World, SaveHandlerMP, WorldProvider, IntHashMap, 
//            ChunkCoordinates, NetClientHandler, Entity, WorldBlockPositionType, 
//            ChunkProviderClient, ChunkCoordIntPair, Profiler, Packet255KickDisconnect, 
//            WorldInfo, WorldSettings, IChunkProvider

public class WorldClient extends World
{

    private LinkedList field_1057_z;
    private NetClientHandler field_1052_A;
    private ChunkProviderClient field_20915_C;
    private IntHashMap field_1055_D;
    private Set field_20914_E;
    private Set field_1053_F;

    public WorldClient(NetClientHandler p_i387_1_, WorldSettings p_i387_2_, int p_i387_3_, int p_i387_4_)
    {
        super(new SaveHandlerMP(), "MpServer", WorldProvider.func_4101_a(p_i387_3_), p_i387_2_);
        field_1057_z = new LinkedList();
        field_1055_D = new IntHashMap();
        field_20914_E = new HashSet();
        field_1053_F = new HashSet();
        field_1052_A = p_i387_1_;
        field_1039_l = p_i387_4_;
        func_22143_a(new ChunkCoordinates(8, 64, 8));
        field_28108_z = p_i387_1_.field_28118_b;
    }

    public void func_649_g()
    {
        func_648_a(func_22139_r() + 1L);
        for(int i = 0; i < 10 && !field_1053_F.isEmpty(); i++)
        {
            Entity entity = (Entity)field_1053_F.iterator().next();
            field_1053_F.remove(entity);
            if(!field_1050_a.contains(entity))
            {
                func_674_a(entity);
            }
        }

        field_1052_A.func_848_a();
        for(int j = 0; j < field_1057_z.size(); j++)
        {
            WorldBlockPositionType worldblockpositiontype = (WorldBlockPositionType)field_1057_z.get(j);
            if(--worldblockpositiontype.field_1206_d == 0)
            {
                super.func_643_a(worldblockpositiontype.field_1202_a, worldblockpositiontype.field_1201_b, worldblockpositiontype.field_1207_c, worldblockpositiontype.field_1205_e, worldblockpositiontype.field_1204_f);
                super.func_665_h(worldblockpositiontype.field_1202_a, worldblockpositiontype.field_1201_b, worldblockpositiontype.field_1207_c);
                field_1057_z.remove(j--);
            }
        }

        field_20915_C.func_532_a();
        func_4080_j();
    }

    public void func_711_c(int p_711_1_, int p_711_2_, int p_711_3_, int p_711_4_, int p_711_5_, int p_711_6_)
    {
        for(int i = 0; i < field_1057_z.size(); i++)
        {
            WorldBlockPositionType worldblockpositiontype = (WorldBlockPositionType)field_1057_z.get(i);
            if(worldblockpositiontype.field_1202_a >= p_711_1_ && worldblockpositiontype.field_1201_b >= p_711_2_ && worldblockpositiontype.field_1207_c >= p_711_3_ && worldblockpositiontype.field_1202_a <= p_711_4_ && worldblockpositiontype.field_1201_b <= p_711_5_ && worldblockpositiontype.field_1207_c <= p_711_6_)
            {
                field_1057_z.remove(i--);
            }
        }

    }

    protected IChunkProvider func_4081_a()
    {
        field_20915_C = new ChunkProviderClient(this);
        return field_20915_C;
    }

    public void func_4076_b()
    {
        func_22143_a(new ChunkCoordinates(8, 64, 8));
    }

    protected void func_4080_j()
    {
        func_48461_r();
        for(Iterator iterator = field_9427_K.iterator(); iterator.hasNext(); Profiler.func_40662_b())
        {
            ChunkCoordIntPair chunkcoordintpair = (ChunkCoordIntPair)iterator.next();
            int i = chunkcoordintpair.field_189_a * 16;
            int j = chunkcoordintpair.field_188_b * 16;
            Profiler.func_40663_a("getChunk");
            Chunk chunk = func_704_b(chunkcoordintpair.field_189_a, chunkcoordintpair.field_188_b);
            func_48458_a(i, j, chunk);
        }

    }

    public void func_22136_c(int i, int j, int k, int l, int i1)
    {
    }

    public boolean func_700_a(boolean p_700_1_)
    {
        return false;
    }

    public void func_713_a(int p_713_1_, int p_713_2_, boolean p_713_3_)
    {
        if(p_713_3_)
        {
            field_20915_C.func_538_d(p_713_1_, p_713_2_);
        } else
        {
            field_20915_C.func_539_c(p_713_1_, p_713_2_);
        }
        if(!p_713_3_)
        {
            func_701_b(p_713_1_ * 16, 0, p_713_2_ * 16, p_713_1_ * 16 + 15, 256, p_713_2_ * 16 + 15);
        }
    }

    public boolean func_674_a(Entity p_674_1_)
    {
        boolean flag = super.func_674_a(p_674_1_);
        field_20914_E.add(p_674_1_);
        if(!flag)
        {
            field_1053_F.add(p_674_1_);
        }
        return flag;
    }

    public void func_607_d(Entity p_607_1_)
    {
        super.func_607_d(p_607_1_);
        field_20914_E.remove(p_607_1_);
    }

    protected void func_606_b(Entity p_606_1_)
    {
        super.func_606_b(p_606_1_);
        if(field_1053_F.contains(p_606_1_))
        {
            field_1053_F.remove(p_606_1_);
        }
    }

    protected void func_678_c(Entity p_678_1_)
    {
        super.func_678_c(p_678_1_);
        if(field_20914_E.contains(p_678_1_))
        {
            if(p_678_1_.func_354_B())
            {
                field_1053_F.add(p_678_1_);
            } else
            {
                field_20914_E.remove(p_678_1_);
            }
        }
    }

    public void func_712_a(int p_712_1_, Entity p_712_2_)
    {
        Entity entity = func_709_b(p_712_1_);
        if(entity != null)
        {
            func_607_d(entity);
        }
        field_20914_E.add(p_712_2_);
        p_712_2_.field_620_ab = p_712_1_;
        if(!func_674_a(p_712_2_))
        {
            field_1053_F.add(p_712_2_);
        }
        field_1055_D.func_1061_a(p_712_1_, p_712_2_);
    }

    public Entity func_709_b(int p_709_1_)
    {
        return (Entity)field_1055_D.func_1057_a(p_709_1_);
    }

    public Entity func_710_c(int p_710_1_)
    {
        Entity entity = (Entity)field_1055_D.func_1052_b(p_710_1_);
        if(entity != null)
        {
            field_20914_E.remove(entity);
            func_607_d(entity);
        }
        return entity;
    }

    public boolean func_714_c(int p_714_1_, int p_714_2_, int p_714_3_, int p_714_4_, int p_714_5_)
    {
        func_711_c(p_714_1_, p_714_2_, p_714_3_, p_714_1_, p_714_2_, p_714_3_);
        return super.func_688_b(p_714_1_, p_714_2_, p_714_3_, p_714_4_, p_714_5_);
    }

    public void func_660_k()
    {
        field_1052_A.func_28117_a(new Packet255KickDisconnect("Quitting"));
    }

    protected void func_27165_m()
    {
        if(field_4209_q.field_6478_e)
        {
            return;
        }
        if(field_27168_F > 0)
        {
            field_27168_F--;
        }
        field_26901_B = field_27171_C;
        if(field_22145_q.func_27397_o())
        {
            field_27171_C += 0.01D;
        } else
        {
            field_27171_C -= 0.01D;
        }
        if(field_27171_C < 0.0F)
        {
            field_27171_C = 0.0F;
        }
        if(field_27171_C > 1.0F)
        {
            field_27171_C = 1.0F;
        }
        field_27170_D = field_27169_E;
        if(field_22145_q.func_27396_m())
        {
            field_27169_E += 0.01D;
        } else
        {
            field_27169_E -= 0.01D;
        }
        if(field_27169_E < 0.0F)
        {
            field_27169_E = 0.0F;
        }
        if(field_27169_E > 1.0F)
        {
            field_27169_E = 1.0F;
        }
    }
}
