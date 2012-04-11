// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockLeaves, 
//            BlockGrass

public class WorldGenTaiga2 extends WorldGenerator
{

    public WorldGenTaiga2(boolean p_i565_1_)
    {
        super(p_i565_1_);
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        int i = p_516_2_.nextInt(4) + 6;
        int j = 1 + p_516_2_.nextInt(2);
        int k = i - j;
        int l = 2 + p_516_2_.nextInt(2);
        boolean flag = true;
        if(p_516_4_ < 1 || p_516_4_ + i + 1 > 256)
        {
            return false;
        }
        for(int i1 = p_516_4_; i1 <= p_516_4_ + 1 + i && flag; i1++)
        {
            int k1 = 1;
            if(i1 - p_516_4_ < j)
            {
                k1 = 0;
            } else
            {
                k1 = l;
            }
            for(int i2 = p_516_3_ - k1; i2 <= p_516_3_ + k1 && flag; i2++)
            {
                for(int k2 = p_516_5_ - k1; k2 <= p_516_5_ + k1 && flag; k2++)
                {
                    if(i1 >= 0 && i1 < 256)
                    {
                        int l2 = p_516_1_.func_600_a(i2, i1, k2);
                        if(l2 != 0 && l2 != Block.field_384_L.field_376_bc)
                        {
                            flag = false;
                        }
                    } else
                    {
                        flag = false;
                    }
                }

            }

        }

        if(!flag)
        {
            return false;
        }
        int j1 = p_516_1_.func_600_a(p_516_3_, p_516_4_ - 1, p_516_5_);
        if(j1 != Block.field_337_v.field_376_bc && j1 != Block.field_336_w.field_376_bc || p_516_4_ >= 256 - i - 1)
        {
            return false;
        }
        func_50073_a(p_516_1_, p_516_3_, p_516_4_ - 1, p_516_5_, Block.field_336_w.field_376_bc);
        int l1 = p_516_2_.nextInt(2);
        int j2 = 1;
        boolean flag1 = false;
        for(int i3 = 0; i3 <= k; i3++)
        {
            int k3 = (p_516_4_ + i) - i3;
            for(int i4 = p_516_3_ - l1; i4 <= p_516_3_ + l1; i4++)
            {
                int k4 = i4 - p_516_3_;
                for(int l4 = p_516_5_ - l1; l4 <= p_516_5_ + l1; l4++)
                {
                    int i5 = l4 - p_516_5_;
                    if((Math.abs(k4) != l1 || Math.abs(i5) != l1 || l1 <= 0) && !Block.field_343_p[p_516_1_.func_600_a(i4, k3, l4)])
                    {
                        func_41060_a(p_516_1_, i4, k3, l4, Block.field_384_L.field_376_bc, 1);
                    }
                }

            }

            if(l1 >= j2)
            {
                l1 = ((flag1) ? 1 : 0);
                flag1 = true;
                if(++j2 > l)
                {
                    j2 = l;
                }
            } else
            {
                l1++;
            }
        }

        int j3 = p_516_2_.nextInt(3);
        for(int l3 = 0; l3 < i - j3; l3++)
        {
            int j4 = p_516_1_.func_600_a(p_516_3_, p_516_4_ + l3, p_516_5_);
            if(j4 == 0 || j4 == Block.field_384_L.field_376_bc)
            {
                func_41060_a(p_516_1_, p_516_3_, p_516_4_ + l3, p_516_5_, Block.field_385_K.field_376_bc, 1);
            }
        }

        return true;
    }
}
