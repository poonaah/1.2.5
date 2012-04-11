// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Material, Block, 
//            BlockLeaves, BlockGrass

public class WorldGenSwamp extends WorldGenerator
{

    public WorldGenSwamp()
    {
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        int i = p_516_2_.nextInt(4) + 5;
        for(; p_516_1_.func_599_f(p_516_3_, p_516_4_ - 1, p_516_5_) == Material.field_1332_f; p_516_4_--) { }
        boolean flag = true;
        if(p_516_4_ < 1 || p_516_4_ + i + 1 > 128)
        {
            return false;
        }
        for(int j = p_516_4_; j <= p_516_4_ + 1 + i; j++)
        {
            byte byte0 = 1;
            if(j == p_516_4_)
            {
                byte0 = 0;
            }
            if(j >= (p_516_4_ + 1 + i) - 2)
            {
                byte0 = 3;
            }
            for(int k1 = p_516_3_ - byte0; k1 <= p_516_3_ + byte0 && flag; k1++)
            {
                for(int k2 = p_516_5_ - byte0; k2 <= p_516_5_ + byte0 && flag; k2++)
                {
                    if(j >= 0 && j < 128)
                    {
                        int j3 = p_516_1_.func_600_a(k1, j, k2);
                        if(j3 == 0 || j3 == Block.field_384_L.field_376_bc)
                        {
                            continue;
                        }
                        if(j3 == Block.field_399_C.field_376_bc || j3 == Block.field_401_B.field_376_bc)
                        {
                            if(j > p_516_4_)
                            {
                                flag = false;
                            }
                        } else
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
        int k = p_516_1_.func_600_a(p_516_3_, p_516_4_ - 1, p_516_5_);
        if(k != Block.field_337_v.field_376_bc && k != Block.field_336_w.field_376_bc || p_516_4_ >= 128 - i - 1)
        {
            return false;
        }
        func_50073_a(p_516_1_, p_516_3_, p_516_4_ - 1, p_516_5_, Block.field_336_w.field_376_bc);
        for(int l = (p_516_4_ - 3) + i; l <= p_516_4_ + i; l++)
        {
            int l1 = l - (p_516_4_ + i);
            int l2 = 2 - l1 / 2;
            for(int k3 = p_516_3_ - l2; k3 <= p_516_3_ + l2; k3++)
            {
                int i4 = k3 - p_516_3_;
                for(int k4 = p_516_5_ - l2; k4 <= p_516_5_ + l2; k4++)
                {
                    int l4 = k4 - p_516_5_;
                    if((Math.abs(i4) != l2 || Math.abs(l4) != l2 || p_516_2_.nextInt(2) != 0 && l1 != 0) && !Block.field_343_p[p_516_1_.func_600_a(k3, l, k4)])
                    {
                        func_50073_a(p_516_1_, k3, l, k4, Block.field_384_L.field_376_bc);
                    }
                }

            }

        }

        for(int i1 = 0; i1 < i; i1++)
        {
            int i2 = p_516_1_.func_600_a(p_516_3_, p_516_4_ + i1, p_516_5_);
            if(i2 == 0 || i2 == Block.field_384_L.field_376_bc || i2 == Block.field_401_B.field_376_bc || i2 == Block.field_399_C.field_376_bc)
            {
                func_50073_a(p_516_1_, p_516_3_, p_516_4_ + i1, p_516_5_, Block.field_385_K.field_376_bc);
            }
        }

        for(int j1 = (p_516_4_ - 3) + i; j1 <= p_516_4_ + i; j1++)
        {
            int j2 = j1 - (p_516_4_ + i);
            int i3 = 2 - j2 / 2;
            for(int l3 = p_516_3_ - i3; l3 <= p_516_3_ + i3; l3++)
            {
                for(int j4 = p_516_5_ - i3; j4 <= p_516_5_ + i3; j4++)
                {
                    if(p_516_1_.func_600_a(l3, j1, j4) != Block.field_384_L.field_376_bc)
                    {
                        continue;
                    }
                    if(p_516_2_.nextInt(4) == 0 && p_516_1_.func_600_a(l3 - 1, j1, j4) == 0)
                    {
                        func_35265_a(p_516_1_, l3 - 1, j1, j4, 8);
                    }
                    if(p_516_2_.nextInt(4) == 0 && p_516_1_.func_600_a(l3 + 1, j1, j4) == 0)
                    {
                        func_35265_a(p_516_1_, l3 + 1, j1, j4, 2);
                    }
                    if(p_516_2_.nextInt(4) == 0 && p_516_1_.func_600_a(l3, j1, j4 - 1) == 0)
                    {
                        func_35265_a(p_516_1_, l3, j1, j4 - 1, 1);
                    }
                    if(p_516_2_.nextInt(4) == 0 && p_516_1_.func_600_a(l3, j1, j4 + 1) == 0)
                    {
                        func_35265_a(p_516_1_, l3, j1, j4 + 1, 4);
                    }
                }

            }

        }

        return true;
    }

    private void func_35265_a(World p_35265_1_, int p_35265_2_, int p_35265_3_, int p_35265_4_, int p_35265_5_)
    {
        func_41060_a(p_35265_1_, p_35265_2_, p_35265_3_, p_35265_4_, Block.field_35278_bv.field_376_bc, p_35265_5_);
        for(int i = 4; p_35265_1_.func_600_a(p_35265_2_, --p_35265_3_, p_35265_4_) == 0 && i > 0; i--)
        {
            func_41060_a(p_35265_1_, p_35265_2_, p_35265_3_, p_35265_4_, Block.field_35278_bv.field_376_bc, p_35265_5_);
        }

    }
}
