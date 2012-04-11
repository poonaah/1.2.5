// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            GenLayerIsland, GenLayerFuzzyZoom, GenLayerAddIsland, GenLayerZoom, 
//            GenLayerAddSnow, GenLayerAddMushroomIsland, GenLayerRiverInit, GenLayerRiver, 
//            GenLayerSmooth, GenLayerBiome, GenLayerHills, GenLayerShore, 
//            GenLayerSwampRivers, GenLayerRiverMix, GenLayerVoronoiZoom, WorldType

public abstract class GenLayer
{

    private long field_35502_b;
    protected GenLayer field_35504_a;
    private long field_35503_c;
    private long field_35501_d;

    public static GenLayer[] func_48425_a(long p_48425_0_, WorldType p_48425_2_)
    {
        Object obj = new GenLayerIsland(1L);
        obj = new GenLayerFuzzyZoom(2000L, ((GenLayer) (obj)));
        obj = new GenLayerAddIsland(1L, ((GenLayer) (obj)));
        obj = new GenLayerZoom(2001L, ((GenLayer) (obj)));
        obj = new GenLayerAddIsland(2L, ((GenLayer) (obj)));
        obj = new GenLayerAddSnow(2L, ((GenLayer) (obj)));
        obj = new GenLayerZoom(2002L, ((GenLayer) (obj)));
        obj = new GenLayerAddIsland(3L, ((GenLayer) (obj)));
        obj = new GenLayerZoom(2003L, ((GenLayer) (obj)));
        obj = new GenLayerAddIsland(4L, ((GenLayer) (obj)));
        obj = new GenLayerAddMushroomIsland(5L, ((GenLayer) (obj)));
        byte byte0 = 4;
        Object obj1 = obj;
        obj1 = GenLayerZoom.func_35515_a(1000L, ((GenLayer) (obj1)), 0);
        obj1 = new GenLayerRiverInit(100L, ((GenLayer) (obj1)));
        obj1 = GenLayerZoom.func_35515_a(1000L, ((GenLayer) (obj1)), byte0 + 2);
        obj1 = new GenLayerRiver(1L, ((GenLayer) (obj1)));
        obj1 = new GenLayerSmooth(1000L, ((GenLayer) (obj1)));
        Object obj2 = obj;
        obj2 = GenLayerZoom.func_35515_a(1000L, ((GenLayer) (obj2)), 0);
        obj2 = new GenLayerBiome(200L, ((GenLayer) (obj2)), p_48425_2_);
        obj2 = GenLayerZoom.func_35515_a(1000L, ((GenLayer) (obj2)), 2);
        obj2 = new GenLayerHills(1000L, ((GenLayer) (obj2)));
        for(int i = 0; i < byte0; i++)
        {
            obj2 = new GenLayerZoom(1000 + i, ((GenLayer) (obj2)));
            if(i == 0)
            {
                obj2 = new GenLayerAddIsland(3L, ((GenLayer) (obj2)));
            }
            if(i == 1)
            {
                obj2 = new GenLayerShore(1000L, ((GenLayer) (obj2)));
            }
            if(i == 1)
            {
                obj2 = new GenLayerSwampRivers(1000L, ((GenLayer) (obj2)));
            }
        }

        obj2 = new GenLayerSmooth(1000L, ((GenLayer) (obj2)));
        obj2 = new GenLayerRiverMix(100L, ((GenLayer) (obj2)), ((GenLayer) (obj1)));
        GenLayerRiverMix genlayerrivermix = ((GenLayerRiverMix) (obj2));
        GenLayerVoronoiZoom genlayervoronoizoom = new GenLayerVoronoiZoom(10L, ((GenLayer) (obj2)));
        ((GenLayer) (obj2)).func_35496_b(p_48425_0_);
        genlayervoronoizoom.func_35496_b(p_48425_0_);
        return (new GenLayer[] {
            obj2, genlayervoronoizoom, genlayerrivermix
        });
    }

    public GenLayer(long p_i661_1_)
    {
        field_35501_d = p_i661_1_;
        field_35501_d *= field_35501_d * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35501_d += p_i661_1_;
        field_35501_d *= field_35501_d * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35501_d += p_i661_1_;
        field_35501_d *= field_35501_d * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35501_d += p_i661_1_;
    }

    public void func_35496_b(long p_35496_1_)
    {
        field_35502_b = p_35496_1_;
        if(field_35504_a != null)
        {
            field_35504_a.func_35496_b(p_35496_1_);
        }
        field_35502_b *= field_35502_b * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35502_b += field_35501_d;
        field_35502_b *= field_35502_b * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35502_b += field_35501_d;
        field_35502_b *= field_35502_b * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35502_b += field_35501_d;
    }

    public void func_35499_a(long p_35499_1_, long p_35499_3_)
    {
        field_35503_c = field_35502_b;
        field_35503_c *= field_35503_c * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35503_c += p_35499_1_;
        field_35503_c *= field_35503_c * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35503_c += p_35499_3_;
        field_35503_c *= field_35503_c * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35503_c += p_35499_1_;
        field_35503_c *= field_35503_c * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35503_c += p_35499_3_;
    }

    protected int func_35498_a(int p_35498_1_)
    {
        int i = (int)((field_35503_c >> 24) % (long)p_35498_1_);
        if(i < 0)
        {
            i += p_35498_1_;
        }
        field_35503_c *= field_35503_c * 0x5851f42d4c957f2dL + 0x14057b7ef767814fL;
        field_35503_c += field_35502_b;
        return i;
    }

    public abstract int[] func_35500_a(int i, int j, int k, int l);
}
