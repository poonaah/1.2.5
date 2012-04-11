// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, BlockLeaves, 
//            EntityPlayer

public class BlockLog extends Block
{

    protected BlockLog(int p_i521_1_)
    {
        super(p_i521_1_, Material.field_1335_c);
        field_378_bb = 20;
    }

    public int func_229_a(Random p_229_1_)
    {
        return 1;
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Block.field_385_K.field_376_bc;
    }

    public void func_220_a_(World p_220_1_, EntityPlayer p_220_2_, int p_220_3_, int p_220_4_, int p_220_5_, int p_220_6_)
    {
        super.func_220_a_(p_220_1_, p_220_2_, p_220_3_, p_220_4_, p_220_5_, p_220_6_);
    }

    public void func_214_b(World p_214_1_, int p_214_2_, int p_214_3_, int p_214_4_)
    {
        byte byte0 = 4;
        int i = byte0 + 1;
        if(p_214_1_.func_640_a(p_214_2_ - i, p_214_3_ - i, p_214_4_ - i, p_214_2_ + i, p_214_3_ + i, p_214_4_ + i))
        {
            for(int j = -byte0; j <= byte0; j++)
            {
                for(int k = -byte0; k <= byte0; k++)
                {
                    for(int l = -byte0; l <= byte0; l++)
                    {
                        int i1 = p_214_1_.func_600_a(p_214_2_ + j, p_214_3_ + k, p_214_4_ + l);
                        if(i1 != Block.field_384_L.field_376_bc)
                        {
                            continue;
                        }
                        int j1 = p_214_1_.func_602_e(p_214_2_ + j, p_214_3_ + k, p_214_4_ + l);
                        if((j1 & 8) == 0)
                        {
                            p_214_1_.func_635_c(p_214_2_ + j, p_214_3_ + k, p_214_4_ + l, j1 | 8);
                        }
                    }

                }

            }

        }
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        if(p_232_1_ == 1)
        {
            return 21;
        }
        if(p_232_1_ == 0)
        {
            return 21;
        }
        if(p_232_2_ == 1)
        {
            return 116;
        }
        if(p_232_2_ == 2)
        {
            return 117;
        }
        return p_232_2_ != 3 ? 20 : 153;
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return p_21025_1_;
    }
}
