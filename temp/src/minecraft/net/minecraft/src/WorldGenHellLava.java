// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block

public class WorldGenHellLava extends WorldGenerator
{

    private int field_4158_a;

    public WorldGenHellLava(int p_i440_1_)
    {
        field_4158_a = p_i440_1_;
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        if(p_516_1_.func_600_a(p_516_3_, p_516_4_ + 1, p_516_5_) != Block.field_4053_bc.field_376_bc)
        {
            return false;
        }
        if(p_516_1_.func_600_a(p_516_3_, p_516_4_, p_516_5_) != 0 && p_516_1_.func_600_a(p_516_3_, p_516_4_, p_516_5_) != Block.field_4053_bc.field_376_bc)
        {
            return false;
        }
        int i = 0;
        if(p_516_1_.func_600_a(p_516_3_ - 1, p_516_4_, p_516_5_) == Block.field_4053_bc.field_376_bc)
        {
            i++;
        }
        if(p_516_1_.func_600_a(p_516_3_ + 1, p_516_4_, p_516_5_) == Block.field_4053_bc.field_376_bc)
        {
            i++;
        }
        if(p_516_1_.func_600_a(p_516_3_, p_516_4_, p_516_5_ - 1) == Block.field_4053_bc.field_376_bc)
        {
            i++;
        }
        if(p_516_1_.func_600_a(p_516_3_, p_516_4_, p_516_5_ + 1) == Block.field_4053_bc.field_376_bc)
        {
            i++;
        }
        if(p_516_1_.func_600_a(p_516_3_, p_516_4_ - 1, p_516_5_) == Block.field_4053_bc.field_376_bc)
        {
            i++;
        }
        int j = 0;
        if(p_516_1_.func_20084_d(p_516_3_ - 1, p_516_4_, p_516_5_))
        {
            j++;
        }
        if(p_516_1_.func_20084_d(p_516_3_ + 1, p_516_4_, p_516_5_))
        {
            j++;
        }
        if(p_516_1_.func_20084_d(p_516_3_, p_516_4_, p_516_5_ - 1))
        {
            j++;
        }
        if(p_516_1_.func_20084_d(p_516_3_, p_516_4_, p_516_5_ + 1))
        {
            j++;
        }
        if(p_516_1_.func_20084_d(p_516_3_, p_516_4_ - 1, p_516_5_))
        {
            j++;
        }
        if(i == 4 && j == 1)
        {
            p_516_1_.func_690_d(p_516_3_, p_516_4_, p_516_5_, field_4158_a);
            p_516_1_.field_4214_a = true;
            Block.field_345_n[field_4158_a].func_208_a(p_516_1_, p_516_3_, p_516_4_, p_516_5_, p_516_2_);
            p_516_1_.field_4214_a = false;
        }
        return true;
    }
}
