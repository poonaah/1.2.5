// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockFlower, World, WorldGenTaiga2, WorldGenForest, 
//            WorldGenHugeTrees, WorldGenTrees, WorldGenBigTree, WorldGenerator

public class BlockSapling extends BlockFlower
{

    protected BlockSapling(int p_i714_1_, int p_i714_2_)
    {
        super(p_i714_1_, p_i714_2_);
        float f = 0.4F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        if(p_208_1_.field_1026_y)
        {
            return;
        }
        super.func_208_a(p_208_1_, p_208_2_, p_208_3_, p_208_4_, p_208_5_);
        if(p_208_1_.func_618_j(p_208_2_, p_208_3_ + 1, p_208_4_) >= 9 && p_208_5_.nextInt(7) == 0)
        {
            int i = p_208_1_.func_602_e(p_208_2_, p_208_3_, p_208_4_);
            if((i & 8) == 0)
            {
                p_208_1_.func_691_b(p_208_2_, p_208_3_, p_208_4_, i | 8);
            } else
            {
                func_21028_c(p_208_1_, p_208_2_, p_208_3_, p_208_4_, p_208_5_);
            }
        }
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        p_232_2_ &= 3;
        if(p_232_2_ == 1)
        {
            return 63;
        }
        if(p_232_2_ == 2)
        {
            return 79;
        }
        if(p_232_2_ == 3)
        {
            return 30;
        } else
        {
            return super.func_232_a(p_232_1_, p_232_2_);
        }
    }

    public void func_21028_c(World p_21028_1_, int p_21028_2_, int p_21028_3_, int p_21028_4_, Random p_21028_5_)
    {
        int i = p_21028_1_.func_602_e(p_21028_2_, p_21028_3_, p_21028_4_) & 3;
        Object obj = null;
        int j = 0;
        int k = 0;
        boolean flag = false;
        if(i == 1)
        {
            obj = new WorldGenTaiga2(true);
        } else
        if(i == 2)
        {
            obj = new WorldGenForest(true);
        } else
        if(i == 3)
        {
            j = 0;
            do
            {
                if(j < -1)
                {
                    break;
                }
                k = 0;
                do
                {
                    if(k < -1)
                    {
                        break;
                    }
                    if(func_50076_f(p_21028_1_, p_21028_2_ + j, p_21028_3_, p_21028_4_ + k, 3) && func_50076_f(p_21028_1_, p_21028_2_ + j + 1, p_21028_3_, p_21028_4_ + k, 3) && func_50076_f(p_21028_1_, p_21028_2_ + j, p_21028_3_, p_21028_4_ + k + 1, 3) && func_50076_f(p_21028_1_, p_21028_2_ + j + 1, p_21028_3_, p_21028_4_ + k + 1, 3))
                    {
                        obj = new WorldGenHugeTrees(true, 10 + p_21028_5_.nextInt(20), 3, 3);
                        flag = true;
                        break;
                    }
                    k--;
                } while(true);
                if(obj != null)
                {
                    break;
                }
                j--;
            } while(true);
            if(obj == null)
            {
                j = k = 0;
                obj = new WorldGenTrees(true, 4 + p_21028_5_.nextInt(7), 3, 3, false);
            }
        } else
        {
            obj = new WorldGenTrees(true);
            if(p_21028_5_.nextInt(10) == 0)
            {
                obj = new WorldGenBigTree(true);
            }
        }
        if(flag)
        {
            p_21028_1_.func_634_a(p_21028_2_ + j, p_21028_3_, p_21028_4_ + k, 0);
            p_21028_1_.func_634_a(p_21028_2_ + j + 1, p_21028_3_, p_21028_4_ + k, 0);
            p_21028_1_.func_634_a(p_21028_2_ + j, p_21028_3_, p_21028_4_ + k + 1, 0);
            p_21028_1_.func_634_a(p_21028_2_ + j + 1, p_21028_3_, p_21028_4_ + k + 1, 0);
        } else
        {
            p_21028_1_.func_634_a(p_21028_2_, p_21028_3_, p_21028_4_, 0);
        }
        if(!((WorldGenerator) (obj)).func_516_a(p_21028_1_, p_21028_5_, p_21028_2_ + j, p_21028_3_, p_21028_4_ + k))
        {
            if(flag)
            {
                p_21028_1_.func_643_a(p_21028_2_ + j, p_21028_3_, p_21028_4_ + k, field_376_bc, i);
                p_21028_1_.func_643_a(p_21028_2_ + j + 1, p_21028_3_, p_21028_4_ + k, field_376_bc, i);
                p_21028_1_.func_643_a(p_21028_2_ + j, p_21028_3_, p_21028_4_ + k + 1, field_376_bc, i);
                p_21028_1_.func_643_a(p_21028_2_ + j + 1, p_21028_3_, p_21028_4_ + k + 1, field_376_bc, i);
            } else
            {
                p_21028_1_.func_643_a(p_21028_2_, p_21028_3_, p_21028_4_, field_376_bc, i);
            }
        }
    }

    public boolean func_50076_f(World p_50076_1_, int p_50076_2_, int p_50076_3_, int p_50076_4_, int p_50076_5_)
    {
        return p_50076_1_.func_600_a(p_50076_2_, p_50076_3_, p_50076_4_) == field_376_bc && (p_50076_1_.func_602_e(p_50076_2_, p_50076_3_, p_50076_4_) & 3) == p_50076_5_;
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return p_21025_1_ & 3;
    }
}
