// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.lang.reflect.Constructor;
import java.util.*;

// Referenced classes of package net.minecraft.src:
//            World, Chunk, ChunkPosition, EntityPlayer, 
//            MathHelper, ChunkCoordIntPair, EnumCreatureType, ChunkCoordinates, 
//            SpawnListEntry, EntityLiving, Material, Block, 
//            EntitySpider, EntitySkeleton, EntitySheep, EntityOcelot, 
//            BiomeGenBase, WeightedRandom, EntityZombie

public final class SpawnerAnimals
{

    private static HashMap field_6544_a = new HashMap();
    protected static final Class field_22391_a[];

    public SpawnerAnimals()
    {
    }

    protected static ChunkPosition func_4153_a(World p_4153_0_, int p_4153_1_, int p_4153_2_)
    {
        Chunk chunk = p_4153_0_.func_704_b(p_4153_1_, p_4153_2_);
        int i = p_4153_1_ * 16 + p_4153_0_.field_1037_n.nextInt(16);
        int j = p_4153_0_.field_1037_n.nextInt(chunk != null ? Math.max(128, chunk.func_48498_h()) : 128);
        int k = p_4153_2_ * 16 + p_4153_0_.field_1037_n.nextInt(16);
        return new ChunkPosition(i, j, k);
    }

    public static final int func_4154_a(World p_4154_0_, boolean p_4154_1_, boolean p_4154_2_)
    {
        int j;
        ChunkCoordinates chunkcoordinates;
        EnumCreatureType aenumcreaturetype[];
        int i1;
        int j1;
        if(!p_4154_1_ && !p_4154_2_)
        {
            return 0;
        }
        field_6544_a.clear();
        for(int i = 0; i < p_4154_0_.field_1040_k.size(); i++)
        {
            EntityPlayer entityplayer = (EntityPlayer)p_4154_0_.field_1040_k.get(i);
            int k = MathHelper.func_1108_b(entityplayer.field_611_ak / 16D);
            int l = MathHelper.func_1108_b(entityplayer.field_609_am / 16D);
            byte byte0 = 8;
            for(int k1 = -byte0; k1 <= byte0; k1++)
            {
                for(int l1 = -byte0; l1 <= byte0; l1++)
                {
                    boolean flag = k1 == -byte0 || k1 == byte0 || l1 == -byte0 || l1 == byte0;
                    ChunkCoordIntPair chunkcoordintpair1 = new ChunkCoordIntPair(k1 + k, l1 + l);
                    if(!flag)
                    {
                        field_6544_a.put(chunkcoordintpair1, Boolean.valueOf(false));
                        continue;
                    }
                    if(!field_6544_a.containsKey(chunkcoordintpair1))
                    {
                        field_6544_a.put(chunkcoordintpair1, Boolean.valueOf(true));
                    }
                }

            }

        }

        j = 0;
        chunkcoordinates = p_4154_0_.func_22137_s();
        aenumcreaturetype = EnumCreatureType.values();
        i1 = aenumcreaturetype.length;
        j1 = 0;
_L10:
        if(j1 >= i1) goto _L2; else goto _L1
_L1:
        EnumCreatureType enumcreaturetype;
        Iterator iterator;
        enumcreaturetype = aenumcreaturetype[j1];
        if(enumcreaturetype.func_21168_d() && !p_4154_2_ || !enumcreaturetype.func_21168_d() && !p_4154_1_ || p_4154_0_.func_621_b(enumcreaturetype.func_21170_a()) > (enumcreaturetype.func_21169_b() * field_6544_a.size()) / 256)
        {
            continue; /* Loop/switch isn't completed */
        }
        iterator = field_6544_a.keySet().iterator();
_L4:
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        do
        {
            ChunkCoordIntPair chunkcoordintpair;
            do
            {
                if(!iterator.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                chunkcoordintpair = (ChunkCoordIntPair)iterator.next();
            } while(((Boolean)field_6544_a.get(chunkcoordintpair)).booleanValue());
            ChunkPosition chunkposition = func_4153_a(p_4154_0_, chunkcoordintpair.field_189_a, chunkcoordintpair.field_188_b);
            i2 = chunkposition.field_1111_a;
            j2 = chunkposition.field_1110_b;
            k2 = chunkposition.field_1112_c;
        } while(p_4154_0_.func_28100_h(i2, j2, k2) || p_4154_0_.func_599_f(i2, j2, k2) != enumcreaturetype.func_21171_c());
        l2 = 0;
        i3 = 0;
_L9:
        if(i3 >= 3) goto _L4; else goto _L3
_L3:
        int j3;
        int k3;
        int l3;
        byte byte1;
        SpawnListEntry spawnlistentry;
        int i4;
        j3 = i2;
        k3 = j2;
        l3 = k2;
        byte1 = 6;
        spawnlistentry = null;
        i4 = 0;
_L8:
        if(i4 >= 4) goto _L6; else goto _L5
_L5:
        EntityLiving entityliving;
        j3 += p_4154_0_.field_1037_n.nextInt(byte1) - p_4154_0_.field_1037_n.nextInt(byte1);
        k3 += p_4154_0_.field_1037_n.nextInt(1) - p_4154_0_.field_1037_n.nextInt(1);
        l3 += p_4154_0_.field_1037_n.nextInt(byte1) - p_4154_0_.field_1037_n.nextInt(byte1);
        if(!func_21203_a(enumcreaturetype, p_4154_0_, j3, k3, l3))
        {
            continue; /* Loop/switch isn't completed */
        }
        float f = (float)j3 + 0.5F;
        float f1 = k3;
        float f2 = (float)l3 + 0.5F;
        if(p_4154_0_.func_683_a(f, f1, f2, 24D) != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        float f3 = f - (float)chunkcoordinates.field_22395_a;
        float f4 = f1 - (float)chunkcoordinates.field_22394_b;
        float f5 = f2 - (float)chunkcoordinates.field_22396_c;
        float f6 = f3 * f3 + f4 * f4 + f5 * f5;
        if(f6 < 576F)
        {
            continue; /* Loop/switch isn't completed */
        }
        if(spawnlistentry == null)
        {
            spawnlistentry = p_4154_0_.func_40474_a(enumcreaturetype, j3, k3, l3);
            if(spawnlistentry == null)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        try
        {
            entityliving = (EntityLiving)spawnlistentry.field_25212_a.getConstructor(new Class[] {
                net.minecraft.src.World.class
            }).newInstance(new Object[] {
                p_4154_0_
            });
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return j;
        }
        entityliving.func_365_c(f, f1, f2, p_4154_0_.field_1037_n.nextFloat() * 360F, 0.0F);
        if(!entityliving.func_433_a())
        {
            break; /* Loop/switch isn't completed */
        }
        l2++;
        p_4154_0_.func_674_a(entityliving);
        func_21204_a(entityliving, p_4154_0_, f, f1, f2);
        if(l2 < entityliving.func_6391_i()) goto _L7; else goto _L4
_L7:
        j += l2;
        i4++;
          goto _L8
_L6:
        i3++;
          goto _L9
        j1++;
          goto _L10
_L2:
        return j;
    }

    public static boolean func_21203_a(EnumCreatureType p_21203_0_, World p_21203_1_, int p_21203_2_, int p_21203_3_, int p_21203_4_)
    {
        if(p_21203_0_.func_21171_c() == Material.field_1332_f)
        {
            return p_21203_1_.func_599_f(p_21203_2_, p_21203_3_, p_21203_4_).func_879_d() && !p_21203_1_.func_28100_h(p_21203_2_, p_21203_3_ + 1, p_21203_4_);
        } else
        {
            int i = p_21203_1_.func_600_a(p_21203_2_, p_21203_3_ - 1, p_21203_4_);
            return Block.func_48206_g(i) && i != Block.field_403_A.field_376_bc && !p_21203_1_.func_28100_h(p_21203_2_, p_21203_3_, p_21203_4_) && !p_21203_1_.func_599_f(p_21203_2_, p_21203_3_, p_21203_4_).func_879_d() && !p_21203_1_.func_28100_h(p_21203_2_, p_21203_3_ + 1, p_21203_4_);
        }
    }

    private static void func_21204_a(EntityLiving p_21204_0_, World p_21204_1_, float p_21204_2_, float p_21204_3_, float p_21204_4_)
    {
        if((p_21204_0_ instanceof EntitySpider) && p_21204_1_.field_1037_n.nextInt(100) == 0)
        {
            EntitySkeleton entityskeleton = new EntitySkeleton(p_21204_1_);
            entityskeleton.func_365_c(p_21204_2_, p_21204_3_, p_21204_4_, p_21204_0_.field_605_aq, 0.0F);
            p_21204_1_.func_674_a(entityskeleton);
            entityskeleton.func_6377_h(p_21204_0_);
        } else
        if(p_21204_0_ instanceof EntitySheep)
        {
            ((EntitySheep)p_21204_0_).func_21071_b_(EntitySheep.func_21070_a(p_21204_1_.field_1037_n));
        } else
        if((p_21204_0_ instanceof EntityOcelot) && p_21204_1_.field_1037_n.nextInt(7) == 0)
        {
            for(int i = 0; i < 2; i++)
            {
                EntityOcelot entityocelot = new EntityOcelot(p_21204_1_);
                entityocelot.func_365_c(p_21204_2_, p_21204_3_, p_21204_4_, p_21204_0_.field_605_aq, 0.0F);
                entityocelot.func_48122_d(-24000);
                p_21204_1_.func_674_a(entityocelot);
            }

        }
    }

    public static void func_35957_a(World p_35957_0_, BiomeGenBase p_35957_1_, int p_35957_2_, int p_35957_3_, int p_35957_4_, int p_35957_5_, Random p_35957_6_)
    {
        List list = p_35957_1_.func_25063_a(EnumCreatureType.creature);
        if(list.isEmpty())
        {
            return;
        }
        while(p_35957_6_.nextFloat() < p_35957_1_.func_4119_a()) 
        {
            SpawnListEntry spawnlistentry = (SpawnListEntry)WeightedRandom.func_35733_a(p_35957_0_.field_1037_n, list);
            int i = spawnlistentry.field_35591_b + p_35957_6_.nextInt((1 + spawnlistentry.field_35592_c) - spawnlistentry.field_35591_b);
            int j = p_35957_2_ + p_35957_6_.nextInt(p_35957_4_);
            int k = p_35957_3_ + p_35957_6_.nextInt(p_35957_5_);
            int l = j;
            int i1 = k;
            int j1 = 0;
            while(j1 < i) 
            {
                boolean flag = false;
                for(int k1 = 0; !flag && k1 < 4; k1++)
                {
                    int l1 = p_35957_0_.func_4083_e(j, k);
                    if(func_21203_a(EnumCreatureType.creature, p_35957_0_, j, l1, k))
                    {
                        float f = (float)j + 0.5F;
                        float f1 = l1;
                        float f2 = (float)k + 0.5F;
                        EntityLiving entityliving;
                        try
                        {
                            entityliving = (EntityLiving)spawnlistentry.field_25212_a.getConstructor(new Class[] {
                                net.minecraft.src.World.class
                            }).newInstance(new Object[] {
                                p_35957_0_
                            });
                        }
                        catch(Exception exception)
                        {
                            exception.printStackTrace();
                            continue;
                        }
                        entityliving.func_365_c(f, f1, f2, p_35957_6_.nextFloat() * 360F, 0.0F);
                        p_35957_0_.func_674_a(entityliving);
                        func_21204_a(entityliving, p_35957_0_, f, f1, f2);
                        flag = true;
                    }
                    j += p_35957_6_.nextInt(5) - p_35957_6_.nextInt(5);
                    for(k += p_35957_6_.nextInt(5) - p_35957_6_.nextInt(5); j < p_35957_2_ || j >= p_35957_2_ + p_35957_4_ || k < p_35957_3_ || k >= p_35957_3_ + p_35957_4_; k = (i1 + p_35957_6_.nextInt(5)) - p_35957_6_.nextInt(5))
                    {
                        j = (l + p_35957_6_.nextInt(5)) - p_35957_6_.nextInt(5);
                    }

                }

                j1++;
            }
        }
    }

    static 
    {
        field_22391_a = (new Class[] {
            net.minecraft.src.EntitySpider.class, net.minecraft.src.EntityZombie.class, net.minecraft.src.EntitySkeleton.class
        });
    }
}
