// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BiomeDecorator, WorldGenSpikes, Block, World, 
//            WorldGenerator, EntityDragon, BiomeGenBase

public class BiomeEndDecorator extends BiomeDecorator
{

    protected WorldGenerator field_40723_L;

    public BiomeEndDecorator(BiomeGenBase p_i29_1_)
    {
        super(p_i29_1_);
        field_40723_L = new WorldGenSpikes(Block.field_40203_bK.field_376_bc);
    }

    protected void func_35882_b()
    {
        func_35880_a();
        if(field_35890_C.nextInt(5) == 0)
        {
            int i = field_35885_D + field_35890_C.nextInt(16) + 8;
            int j = field_35886_E + field_35890_C.nextInt(16) + 8;
            int k = field_35889_B.func_4083_e(i, j);
            if(k <= 0);
            field_40723_L.func_516_a(field_35889_B, field_35890_C, i, k, j);
        }
        if(field_35885_D == 0 && field_35886_E == 0)
        {
            EntityDragon entitydragon = new EntityDragon(field_35889_B);
            entitydragon.func_365_c(0.0D, 128D, 0.0D, field_35890_C.nextFloat() * 360F, 0.0F);
            field_35889_B.func_674_a(entitydragon);
        }
    }
}
