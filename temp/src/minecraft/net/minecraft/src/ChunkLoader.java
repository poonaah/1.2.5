// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            NBTTagCompound, AnvilConverterData, NibbleArrayReader, NBTTagList, 
//            NibbleArray, WorldChunkManager, BiomeGenBase

public class ChunkLoader
{

    public ChunkLoader()
    {
    }

    public static AnvilConverterData func_48485_a(NBTTagCompound p_48485_0_)
    {
        int i = p_48485_0_.func_756_e("xPos");
        int j = p_48485_0_.func_756_e("zPos");
        AnvilConverterData anvilconverterdata = new AnvilConverterData(i, j);
        anvilconverterdata.field_48603_g = p_48485_0_.func_759_j("Blocks");
        anvilconverterdata.field_48602_f = new NibbleArrayReader(p_48485_0_.func_759_j("Data"), 7);
        anvilconverterdata.field_48605_e = new NibbleArrayReader(p_48485_0_.func_759_j("SkyLight"), 7);
        anvilconverterdata.field_48604_d = new NibbleArrayReader(p_48485_0_.func_759_j("BlockLight"), 7);
        anvilconverterdata.field_48607_c = p_48485_0_.func_759_j("HeightMap");
        anvilconverterdata.field_48606_b = p_48485_0_.func_760_m("TerrainPopulated");
        anvilconverterdata.field_48612_h = p_48485_0_.func_753_l("Entities");
        anvilconverterdata.field_48613_i = p_48485_0_.func_753_l("TileEntities");
        anvilconverterdata.field_48610_j = p_48485_0_.func_753_l("TileTicks");
        try
        {
            anvilconverterdata.field_48608_a = p_48485_0_.func_764_f("LastUpdate");
        }
        catch(ClassCastException classcastexception)
        {
            anvilconverterdata.field_48608_a = p_48485_0_.func_756_e("LastUpdate");
        }
        return anvilconverterdata;
    }

    public static void func_48486_a(AnvilConverterData p_48486_0_, NBTTagCompound p_48486_1_, WorldChunkManager p_48486_2_)
    {
        p_48486_1_.func_758_a("xPos", p_48486_0_.field_48611_k);
        p_48486_1_.func_758_a("zPos", p_48486_0_.field_48609_l);
        p_48486_1_.func_750_a("LastUpdate", p_48486_0_.field_48608_a);
        int ai[] = new int[p_48486_0_.field_48607_c.length];
        for(int i = 0; i < p_48486_0_.field_48607_c.length; i++)
        {
            ai[i] = p_48486_0_.field_48607_c[i];
        }

        p_48486_1_.func_48183_a("HeightMap", ai);
        p_48486_1_.func_748_a("TerrainPopulated", p_48486_0_.field_48606_b);
        NBTTagList nbttaglist = new NBTTagList("Sections");
        for(int j = 0; j < 8; j++)
        {
            boolean flag = true;
            for(int l = 0; l < 16 && flag; l++)
            {
label0:
                for(int j1 = 0; j1 < 16 && flag; j1++)
                {
                    int k1 = 0;
                    do
                    {
                        if(k1 >= 16)
                        {
                            continue label0;
                        }
                        int l1 = l << 11 | k1 << 7 | j1 + (j << 4);
                        byte byte0 = p_48486_0_.field_48603_g[l1];
                        if(byte0 != 0)
                        {
                            flag = false;
                            continue label0;
                        }
                        k1++;
                    } while(true);
                }

            }

            if(flag)
            {
                continue;
            }
            byte abyte1[] = new byte[4096];
            NibbleArray nibblearray = new NibbleArray(abyte1.length, 4);
            NibbleArray nibblearray1 = new NibbleArray(abyte1.length, 4);
            NibbleArray nibblearray2 = new NibbleArray(abyte1.length, 4);
            for(int i2 = 0; i2 < 16; i2++)
            {
                for(int j2 = 0; j2 < 16; j2++)
                {
                    for(int k2 = 0; k2 < 16; k2++)
                    {
                        int l2 = i2 << 11 | k2 << 7 | j2 + (j << 4);
                        byte byte1 = p_48486_0_.field_48603_g[l2];
                        abyte1[j2 << 8 | k2 << 4 | i2] = (byte)(byte1 & 0xff);
                        nibblearray.func_770_a(i2, j2, k2, p_48486_0_.field_48602_f.func_48508_a(i2, j2 + (j << 4), k2));
                        nibblearray1.func_770_a(i2, j2, k2, p_48486_0_.field_48605_e.func_48508_a(i2, j2 + (j << 4), k2));
                        nibblearray2.func_770_a(i2, j2, k2, p_48486_0_.field_48604_d.func_48508_a(i2, j2 + (j << 4), k2));
                    }

                }

            }

            NBTTagCompound nbttagcompound = new NBTTagCompound();
            nbttagcompound.func_761_a("Y", (byte)(j & 0xff));
            nbttagcompound.func_747_a("Blocks", abyte1);
            nbttagcompound.func_747_a("Data", nibblearray.field_1109_a);
            nbttagcompound.func_747_a("SkyLight", nibblearray1.field_1109_a);
            nbttagcompound.func_747_a("BlockLight", nibblearray2.field_1109_a);
            nbttaglist.func_742_a(nbttagcompound);
        }

        p_48486_1_.func_762_a("Sections", nbttaglist);
        byte abyte0[] = new byte[256];
        for(int k = 0; k < 16; k++)
        {
            for(int i1 = 0; i1 < 16; i1++)
            {
                abyte0[i1 << 4 | k] = (byte)(p_48486_2_.func_4073_a(p_48486_0_.field_48611_k << 4 | k, p_48486_0_.field_48609_l << 4 | i1).field_35494_y & 0xff);
            }

        }

        p_48486_1_.func_747_a("Biomes", abyte0);
        p_48486_1_.func_762_a("Entities", p_48486_0_.field_48612_h);
        p_48486_1_.func_762_a("TileEntities", p_48486_0_.field_48613_i);
        if(p_48486_0_.field_48610_j != null)
        {
            p_48486_1_.func_762_a("TileTicks", p_48486_0_.field_48610_j);
        }
    }
}
