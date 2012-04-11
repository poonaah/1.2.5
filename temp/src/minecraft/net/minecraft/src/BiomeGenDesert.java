// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, Block, BiomeDecorator, WorldGenDesertWells, 
//            World, WorldGenerator

public class BiomeGenDesert extends BiomeGenBase
{

    public BiomeGenDesert(int p_i128_1_)
    {
        super(p_i128_1_);
        field_25065_s.clear();
        field_4242_o = (byte)Block.field_393_F.field_376_bc;
        field_4241_p = (byte)Block.field_393_F.field_376_bc;
        field_35488_u.field_35911_r = -999;
        field_35488_u.field_35908_u = 2;
        field_35488_u.field_35906_w = 50;
        field_35488_u.field_35916_x = 10;
    }

    public void func_35477_a(World p_35477_1_, Random p_35477_2_, int p_35477_3_, int p_35477_4_)
    {
        super.func_35477_a(p_35477_1_, p_35477_2_, p_35477_3_, p_35477_4_);
        if(p_35477_2_.nextInt(1000) == 0)
        {
            int i = p_35477_3_ + p_35477_2_.nextInt(16) + 8;
            int j = p_35477_4_ + p_35477_2_.nextInt(16) + 8;
            WorldGenDesertWells worldgendesertwells = new WorldGenDesertWells();
            worldgendesertwells.func_516_a(p_35477_1_, p_35477_2_, i, p_35477_1_.func_666_c(i, j) + 1, j);
        }
    }
}
