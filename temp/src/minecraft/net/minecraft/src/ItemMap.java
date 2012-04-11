// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemMapBase, MapData, World, ItemStack, 
//            WorldInfo, WorldProvider, Entity, MathHelper, 
//            Block, Chunk, Material, MapColor, 
//            EntityPlayer

public class ItemMap extends ItemMapBase
{

    protected ItemMap(int p_i564_1_)
    {
        super(p_i564_1_);
        func_21009_c(1);
    }

    public static MapData func_28013_a(short p_28013_0_, World p_28013_1_)
    {
        String s = (new StringBuilder()).append("map_").append(p_28013_0_).toString();
        MapData mapdata = (MapData)p_28013_1_.func_28103_a(net.minecraft.src.MapData.class, (new StringBuilder()).append("map_").append(p_28013_0_).toString());
        if(mapdata == null)
        {
            int i = p_28013_1_.func_28101_b("map");
            String s1 = (new StringBuilder()).append("map_").append(i).toString();
            mapdata = new MapData(s1);
            p_28013_1_.func_28102_a(s1, mapdata);
        }
        return mapdata;
    }

    public MapData func_28012_a(ItemStack p_28012_1_, World p_28012_2_)
    {
        String s = (new StringBuilder()).append("map_").append(p_28012_1_.func_21181_i()).toString();
        MapData mapdata = (MapData)p_28012_2_.func_28103_a(net.minecraft.src.MapData.class, (new StringBuilder()).append("map_").append(p_28012_1_.func_21181_i()).toString());
        if(mapdata == null)
        {
            p_28012_1_.func_28156_b(p_28012_2_.func_28101_b("map"));
            String s1 = (new StringBuilder()).append("map_").append(p_28012_1_.func_21181_i()).toString();
            mapdata = new MapData(s1);
            mapdata.field_28180_b = p_28012_2_.func_22144_v().func_22293_c();
            mapdata.field_28179_c = p_28012_2_.func_22144_v().func_22300_e();
            mapdata.field_28177_e = 3;
            mapdata.field_28178_d = (byte)p_28012_2_.field_4209_q.field_4218_e;
            mapdata.func_28164_a();
            p_28012_2_.func_28102_a(s1, mapdata);
        }
        return mapdata;
    }

    public void func_28011_a(World p_28011_1_, Entity p_28011_2_, MapData p_28011_3_)
    {
        if(p_28011_1_.field_4209_q.field_4218_e != p_28011_3_.field_28178_d)
        {
            return;
        }
        char c = '\200';
        char c1 = '\200';
        int i = 1 << p_28011_3_.field_28177_e;
        int j = p_28011_3_.field_28180_b;
        int k = p_28011_3_.field_28179_c;
        int l = MathHelper.func_1108_b(p_28011_2_.field_611_ak - (double)j) / i + c / 2;
        int i1 = MathHelper.func_1108_b(p_28011_2_.field_609_am - (double)k) / i + c1 / 2;
        int j1 = 128 / i;
        if(p_28011_1_.field_4209_q.field_6478_e)
        {
            j1 /= 2;
        }
        p_28011_3_.field_28175_g++;
        for(int k1 = (l - j1) + 1; k1 < l + j1; k1++)
        {
            if((k1 & 0xf) != (p_28011_3_.field_28175_g & 0xf))
            {
                continue;
            }
            int l1 = 255;
            int i2 = 0;
            double d = 0.0D;
            for(int j2 = i1 - j1 - 1; j2 < i1 + j1; j2++)
            {
                if(k1 < 0 || j2 < -1 || k1 >= c || j2 >= c1)
                {
                    continue;
                }
                int k2 = k1 - l;
                int l2 = j2 - i1;
                boolean flag = k2 * k2 + l2 * l2 > (j1 - 2) * (j1 - 2);
                int i3 = ((j / i + k1) - c / 2) * i;
                int j3 = ((k / i + j2) - c1 / 2) * i;
                int k3 = 0;
                int l3 = 0;
                int i4 = 0;
                int ai[] = new int[256];
                Chunk chunk = p_28011_1_.func_673_a(i3, j3);
                int j4 = i3 & 0xf;
                int k4 = j3 & 0xf;
                int l4 = 0;
                double d1 = 0.0D;
                if(p_28011_1_.field_4209_q.field_6478_e)
                {
                    int i5 = i3 + j3 * 0x389bf;
                    i5 = i5 * i5 * 0x1dd6751 + i5 * 11;
                    if((i5 >> 20 & 1) == 0)
                    {
                        ai[Block.field_336_w.field_376_bc] += 10;
                    } else
                    {
                        ai[Block.field_338_u.field_376_bc] += 10;
                    }
                    d1 = 100D;
                } else
                {
                    for(int j5 = 0; j5 < i; j5++)
                    {
                        for(int l5 = 0; l5 < i; l5++)
                        {
                            int j6 = chunk.func_999_b(j5 + j4, l5 + k4) + 1;
                            int l6 = 0;
                            if(j6 > 1)
                            {
                                boolean flag1 = false;
                                do
                                {
                                    flag1 = true;
                                    l6 = chunk.func_1008_a(j5 + j4, j6 - 1, l5 + k4);
                                    if(l6 == 0)
                                    {
                                        flag1 = false;
                                    } else
                                    if(j6 > 0 && l6 > 0 && Block.field_345_n[l6].field_356_bn.field_28129_A == MapColor.field_28212_b)
                                    {
                                        flag1 = false;
                                    }
                                    if(!flag1)
                                    {
                                        j6--;
                                        l6 = chunk.func_1008_a(j5 + j4, j6 - 1, l5 + k4);
                                    }
                                } while(j6 > 0 && !flag1);
                                if(j6 > 0 && l6 != 0 && Block.field_345_n[l6].field_356_bn.func_879_d())
                                {
                                    int i7 = j6 - 1;
                                    int k7 = 0;
                                    do
                                    {
                                        k7 = chunk.func_1008_a(j5 + j4, i7--, l5 + k4);
                                        l4++;
                                    } while(i7 > 0 && k7 != 0 && Block.field_345_n[k7].field_356_bn.func_879_d());
                                }
                            }
                            d1 += (double)j6 / (double)(i * i);
                            ai[l6]++;
                        }

                    }

                }
                l4 /= i * i;
                k3 /= i * i;
                l3 /= i * i;
                i4 /= i * i;
                int k5 = 0;
                int i6 = 0;
                for(int k6 = 0; k6 < 256; k6++)
                {
                    if(ai[k6] > k5)
                    {
                        i6 = k6;
                        k5 = ai[k6];
                    }
                }

                double d2 = ((d1 - d) * 4D) / (double)(i + 4) + ((double)(k1 + j2 & 1) - 0.5D) * 0.40000000000000002D;
                byte byte0 = 1;
                if(d2 > 0.59999999999999998D)
                {
                    byte0 = 2;
                }
                if(d2 < -0.59999999999999998D)
                {
                    byte0 = 0;
                }
                int j7 = 0;
                if(i6 > 0)
                {
                    MapColor mapcolor = Block.field_345_n[i6].field_356_bn.field_28129_A;
                    if(mapcolor == MapColor.field_28200_n)
                    {
                        double d3 = (double)l4 * 0.10000000000000001D + (double)(k1 + j2 & 1) * 0.20000000000000001D;
                        byte0 = 1;
                        if(d3 < 0.5D)
                        {
                            byte0 = 2;
                        }
                        if(d3 > 0.90000000000000002D)
                        {
                            byte0 = 0;
                        }
                    }
                    j7 = mapcolor.field_28197_q;
                }
                d = d1;
                if(j2 < 0 || k2 * k2 + l2 * l2 >= j1 * j1 || flag && (k1 + j2 & 1) == 0)
                {
                    continue;
                }
                byte byte1 = p_28011_3_.field_28176_f[k1 + j2 * c];
                byte byte2 = (byte)(j7 * 4 + byte0);
                if(byte1 == byte2)
                {
                    continue;
                }
                if(l1 > j2)
                {
                    l1 = j2;
                }
                if(i2 < j2)
                {
                    i2 = j2;
                }
                p_28011_3_.field_28176_f[k1 + j2 * c] = byte2;
            }

            if(l1 <= i2)
            {
                p_28011_3_.func_28170_a(k1, l1, i2);
            }
        }

    }

    public void func_28008_a(ItemStack p_28008_1_, World p_28008_2_, Entity p_28008_3_, int p_28008_4_, boolean p_28008_5_)
    {
        if(p_28008_2_.field_1026_y)
        {
            return;
        }
        MapData mapdata = func_28012_a(p_28008_1_, p_28008_2_);
        if(p_28008_3_ instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)p_28008_3_;
            mapdata.func_28169_a(entityplayer, p_28008_1_);
        }
        if(p_28008_5_)
        {
            func_28011_a(p_28008_2_, p_28008_3_, mapdata);
        }
    }

    public void func_28009_b(ItemStack p_28009_1_, World p_28009_2_, EntityPlayer p_28009_3_)
    {
        p_28009_1_.func_28156_b(p_28009_2_.func_28101_b("map"));
        String s = (new StringBuilder()).append("map_").append(p_28009_1_.func_21181_i()).toString();
        MapData mapdata = new MapData(s);
        p_28009_2_.func_28102_a(s, mapdata);
        mapdata.field_28180_b = MathHelper.func_1108_b(p_28009_3_.field_611_ak);
        mapdata.field_28179_c = MathHelper.func_1108_b(p_28009_3_.field_609_am);
        mapdata.field_28177_e = 3;
        mapdata.field_28178_d = (byte)p_28009_2_.field_4209_q.field_4218_e;
        mapdata.func_28164_a();
    }
}
