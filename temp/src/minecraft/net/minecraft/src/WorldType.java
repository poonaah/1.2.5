// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            WorldChunkManagerHell, BiomeGenBase, WorldChunkManager, ChunkProviderFlat, 
//            World, WorldInfo, ChunkProviderGenerate, IChunkProvider

public class WorldType
{

    public static final WorldType field_48637_a[] = new WorldType[16];
    public static final WorldType field_48635_b = (new WorldType(0, "default", 1)).func_48631_f();
    public static final WorldType field_48636_c = new WorldType(1, "flat");
    public static final WorldType field_48634_d = (new WorldType(8, "default_1_1", 0)).func_48625_a(false);
    private final String field_46139_c;
    private final int field_48632_f;
    private boolean field_48633_g;
    private boolean field_48638_h;

    public WorldType(int p_i1080_1_, String p_i1080_2_)
    {
        this(p_i1080_1_, p_i1080_2_, 0);
    }

    private WorldType(int p_i1081_1_, String p_i1081_2_, int p_i1081_3_)
    {
        field_46139_c = p_i1081_2_;
        field_48632_f = p_i1081_3_;
        field_48633_g = true;
        field_48637_a[p_i1081_1_] = this;
    }

    public String func_48628_a()
    {
        return field_46139_c;
    }

    public String func_46136_a()
    {
        return (new StringBuilder("generator.")).append(field_46139_c).toString();
    }

    public int func_48630_c()
    {
        return field_48632_f;
    }

    public WorldType func_48629_a(int p_48629_1_)
    {
        return this != field_48635_b || p_48629_1_ != 0 ? this : field_48634_d;
    }

    private WorldType func_48625_a(boolean p_48625_1_)
    {
        field_48633_g = p_48625_1_;
        return this;
    }

    public boolean func_48627_d()
    {
        return field_48633_g;
    }

    private WorldType func_48631_f()
    {
        field_48638_h = true;
        return this;
    }

    public boolean func_48626_e()
    {
        return field_48638_h;
    }

    public static WorldType func_46135_a(String p_46135_0_)
    {
        for(int i = 0; i < field_48637_a.length; i++)
        {
            if(field_48637_a[i] != null && field_48637_a[i].field_46139_c.equalsIgnoreCase(p_46135_0_))
            {
                return field_48637_a[i];
            }
        }

        return null;
    }

    public WorldChunkManager getChunkManager(World world)
    {
        if(this == field_48636_c)
        {
            return new WorldChunkManagerHell(BiomeGenBase.field_35485_c, 0.5F, 0.5F);
        } else
        {
            return new WorldChunkManager(world);
        }
    }

    public IChunkProvider getChunkGenerator(World world)
    {
        if(this == field_48636_c)
        {
            return new ChunkProviderFlat(world, world.func_22138_q(), world.func_22144_v().func_35917_r());
        } else
        {
            return new ChunkProviderGenerate(world, world.func_22138_q(), world.func_22144_v().func_35917_r());
        }
    }

    public int getSeaLevel(World world)
    {
        return this != field_48636_c ? 64 : 4;
    }

    public boolean hasVoidParticles(boolean flag)
    {
        return this != field_48636_c && !flag;
    }

    public double voidFadeMagnitude()
    {
        return this != field_48636_c ? 0.03125D : 1.0D;
    }

}
