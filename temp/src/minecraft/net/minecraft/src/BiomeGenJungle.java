// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, BiomeDecorator, SpawnListEntry, EntityOcelot, 
//            EntityChicken, WorldGenShrub, WorldGenHugeTrees, WorldGenTrees, 
//            WorldGenTallGrass, Block, BlockTallGrass, WorldGenVines, 
//            WorldGenerator, World

public class BiomeGenJungle extends BiomeGenBase
{

    public BiomeGenJungle(int p_i1026_1_)
    {
        super(p_i1026_1_);
        field_35488_u.field_35911_r = 50;
        field_35488_u.field_35909_t = 25;
        field_35488_u.field_35910_s = 4;
        field_25066_r.add(new SpawnListEntry(net.minecraft.src.EntityOcelot.class, 2, 1, 1));
        field_25065_s.add(new SpawnListEntry(net.minecraft.src.EntityChicken.class, 10, 4, 4));
    }

    public WorldGenerator func_21107_a(Random p_21107_1_)
    {
        if(p_21107_1_.nextInt(10) == 0)
        {
            return field_35480_A;
        }
        if(p_21107_1_.nextInt(2) == 0)
        {
            return new WorldGenShrub(3, 0);
        }
        if(p_21107_1_.nextInt(3) == 0)
        {
            return new WorldGenHugeTrees(false, 10 + p_21107_1_.nextInt(20), 3, 3);
        } else
        {
            return new WorldGenTrees(false, 4 + p_21107_1_.nextInt(7), 3, 3, true);
        }
    }

    public WorldGenerator func_48410_b(Random p_48410_1_)
    {
        if(p_48410_1_.nextInt(4) == 0)
        {
            return new WorldGenTallGrass(Block.field_9257_X.field_376_bc, 2);
        } else
        {
            return new WorldGenTallGrass(Block.field_9257_X.field_376_bc, 1);
        }
    }

    public void func_35477_a(World p_35477_1_, Random p_35477_2_, int p_35477_3_, int p_35477_4_)
    {
        super.func_35477_a(p_35477_1_, p_35477_2_, p_35477_3_, p_35477_4_);
        WorldGenVines worldgenvines = new WorldGenVines();
        for(int i = 0; i < 50; i++)
        {
            int j = p_35477_3_ + p_35477_2_.nextInt(16) + 8;
            byte byte0 = 64;
            int k = p_35477_4_ + p_35477_2_.nextInt(16) + 8;
            worldgenvines.func_516_a(p_35477_1_, p_35477_2_, j, byte0, k);
        }

    }
}
