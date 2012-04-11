// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockLeaves, 
//            BlockGrass, BlockMycelium, BlockFlower

public class WorldGenBigMushroom extends WorldGenerator
{

    private int field_35266_a;

    public WorldGenBigMushroom(int p_i550_1_)
    {
        super(true);
        field_35266_a = -1;
        field_35266_a = p_i550_1_;
    }

    public WorldGenBigMushroom()
    {
        super(false);
        field_35266_a = -1;
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        int i = p_516_2_.nextInt(2);
        if(field_35266_a >= 0)
        {
            i = field_35266_a;
        }
        int j = p_516_2_.nextInt(3) + 4;
        boolean flag = true;
        if(p_516_4_ < 1 || p_516_4_ + j + 1 >= 256)
        {
            return false;
        }
        for(int k = p_516_4_; k <= p_516_4_ + 1 + j; k++)
        {
            byte byte0 = 3;
            if(k == p_516_4_)
            {
                byte0 = 0;
            }
            for(int j1 = p_516_3_ - byte0; j1 <= p_516_3_ + byte0 && flag; j1++)
            {
                for(int i2 = p_516_5_ - byte0; i2 <= p_516_5_ + byte0 && flag; i2++)
                {
                    if(k >= 0 && k < 256)
                    {
                        int l2 = p_516_1_.func_600_a(j1, k, i2);
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
        int l = p_516_1_.func_600_a(p_516_3_, p_516_4_ - 1, p_516_5_);
        if(l != Block.field_336_w.field_376_bc && l != Block.field_337_v.field_376_bc && l != Block.field_40199_bz.field_376_bc)
        {
            return false;
        }
        if(!Block.field_415_ag.func_243_a(p_516_1_, p_516_3_, p_516_4_, p_516_5_))
        {
            return false;
        }
        func_41060_a(p_516_1_, p_516_3_, p_516_4_ - 1, p_516_5_, Block.field_336_w.field_376_bc, 0);
        int i1 = p_516_4_ + j;
        if(i == 1)
        {
            i1 = (p_516_4_ + j) - 3;
        }
        for(int k1 = i1; k1 <= p_516_4_ + j; k1++)
        {
            int j2 = 1;
            if(k1 < p_516_4_ + j)
            {
                j2++;
            }
            if(i == 0)
            {
                j2 = 3;
            }
            for(int i3 = p_516_3_ - j2; i3 <= p_516_3_ + j2; i3++)
            {
                for(int j3 = p_516_5_ - j2; j3 <= p_516_5_ + j2; j3++)
                {
                    int k3 = 5;
                    if(i3 == p_516_3_ - j2)
                    {
                        k3--;
                    }
                    if(i3 == p_516_3_ + j2)
                    {
                        k3++;
                    }
                    if(j3 == p_516_5_ - j2)
                    {
                        k3 -= 3;
                    }
                    if(j3 == p_516_5_ + j2)
                    {
                        k3 += 3;
                    }
                    if(i == 0 || k1 < p_516_4_ + j)
                    {
                        if((i3 == p_516_3_ - j2 || i3 == p_516_3_ + j2) && (j3 == p_516_5_ - j2 || j3 == p_516_5_ + j2))
                        {
                            continue;
                        }
                        if(i3 == p_516_3_ - (j2 - 1) && j3 == p_516_5_ - j2)
                        {
                            k3 = 1;
                        }
                        if(i3 == p_516_3_ - j2 && j3 == p_516_5_ - (j2 - 1))
                        {
                            k3 = 1;
                        }
                        if(i3 == p_516_3_ + (j2 - 1) && j3 == p_516_5_ - j2)
                        {
                            k3 = 3;
                        }
                        if(i3 == p_516_3_ + j2 && j3 == p_516_5_ - (j2 - 1))
                        {
                            k3 = 3;
                        }
                        if(i3 == p_516_3_ - (j2 - 1) && j3 == p_516_5_ + j2)
                        {
                            k3 = 7;
                        }
                        if(i3 == p_516_3_ - j2 && j3 == p_516_5_ + (j2 - 1))
                        {
                            k3 = 7;
                        }
                        if(i3 == p_516_3_ + (j2 - 1) && j3 == p_516_5_ + j2)
                        {
                            k3 = 9;
                        }
                        if(i3 == p_516_3_ + j2 && j3 == p_516_5_ + (j2 - 1))
                        {
                            k3 = 9;
                        }
                    }
                    if(k3 == 5 && k1 < p_516_4_ + j)
                    {
                        k3 = 0;
                    }
                    if((k3 != 0 || p_516_4_ >= (p_516_4_ + j) - 1) && !Block.field_343_p[p_516_1_.func_600_a(i3, k1, j3)])
                    {
                        func_41060_a(p_516_1_, i3, k1, j3, Block.field_35286_bo.field_376_bc + i, k3);
                    }
                }

            }

        }

        for(int l1 = 0; l1 < j; l1++)
        {
            int k2 = p_516_1_.func_600_a(p_516_3_, p_516_4_ + l1, p_516_5_);
            if(!Block.field_343_p[k2])
            {
                func_41060_a(p_516_1_, p_516_3_, p_516_4_ + l1, p_516_5_, Block.field_35286_bo.field_376_bc + i, 10);
            }
        }

        return true;
    }
}
