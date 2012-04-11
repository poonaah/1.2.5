// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Material, Block, 
//            EnumSkyBlock, BiomeGenBase, BlockMycelium, BlockGrass

public class WorldGenLakes extends WorldGenerator
{

    private int field_15235_a;

    public WorldGenLakes(int p_i270_1_)
    {
        field_15235_a = p_i270_1_;
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        p_516_3_ -= 8;
        for(p_516_5_ -= 8; p_516_4_ > 5 && p_516_1_.func_20084_d(p_516_3_, p_516_4_, p_516_5_); p_516_4_--) { }
        if(p_516_4_ <= 4)
        {
            return false;
        }
        p_516_4_ -= 4;
        boolean aflag[] = new boolean[2048];
        int i = p_516_2_.nextInt(4) + 4;
        for(int j = 0; j < i; j++)
        {
            double d = p_516_2_.nextDouble() * 6D + 3D;
            double d1 = p_516_2_.nextDouble() * 4D + 2D;
            double d2 = p_516_2_.nextDouble() * 6D + 3D;
            double d3 = p_516_2_.nextDouble() * (16D - d - 2D) + 1.0D + d / 2D;
            double d4 = p_516_2_.nextDouble() * (8D - d1 - 4D) + 2D + d1 / 2D;
            double d5 = p_516_2_.nextDouble() * (16D - d2 - 2D) + 1.0D + d2 / 2D;
            for(int i4 = 1; i4 < 15; i4++)
            {
                for(int j4 = 1; j4 < 15; j4++)
                {
                    for(int k4 = 1; k4 < 7; k4++)
                    {
                        double d6 = ((double)i4 - d3) / (d / 2D);
                        double d7 = ((double)k4 - d4) / (d1 / 2D);
                        double d8 = ((double)j4 - d5) / (d2 / 2D);
                        double d9 = d6 * d6 + d7 * d7 + d8 * d8;
                        if(d9 < 1.0D)
                        {
                            aflag[(i4 * 16 + j4) * 8 + k4] = true;
                        }
                    }

                }

            }

        }

        for(int k = 0; k < 16; k++)
        {
            for(int l1 = 0; l1 < 16; l1++)
            {
                for(int i3 = 0; i3 < 8; i3++)
                {
                    boolean flag = !aflag[(k * 16 + l1) * 8 + i3] && (k < 15 && aflag[((k + 1) * 16 + l1) * 8 + i3] || k > 0 && aflag[((k - 1) * 16 + l1) * 8 + i3] || l1 < 15 && aflag[(k * 16 + (l1 + 1)) * 8 + i3] || l1 > 0 && aflag[(k * 16 + (l1 - 1)) * 8 + i3] || i3 < 7 && aflag[(k * 16 + l1) * 8 + (i3 + 1)] || i3 > 0 && aflag[(k * 16 + l1) * 8 + (i3 - 1)]);
                    if(!flag)
                    {
                        continue;
                    }
                    Material material = p_516_1_.func_599_f(p_516_3_ + k, p_516_4_ + i3, p_516_5_ + l1);
                    if(i3 >= 4 && material.func_879_d())
                    {
                        return false;
                    }
                    if(i3 < 4 && !material.func_878_a() && p_516_1_.func_600_a(p_516_3_ + k, p_516_4_ + i3, p_516_5_ + l1) != field_15235_a)
                    {
                        return false;
                    }
                }

            }

        }

        for(int l = 0; l < 16; l++)
        {
            for(int i2 = 0; i2 < 16; i2++)
            {
                for(int j3 = 0; j3 < 8; j3++)
                {
                    if(aflag[(l * 16 + i2) * 8 + j3])
                    {
                        p_516_1_.func_634_a(p_516_3_ + l, p_516_4_ + j3, p_516_5_ + i2, j3 < 4 ? field_15235_a : 0);
                    }
                }

            }

        }

        for(int i1 = 0; i1 < 16; i1++)
        {
            for(int j2 = 0; j2 < 16; j2++)
            {
                for(int k3 = 4; k3 < 8; k3++)
                {
                    if(!aflag[(i1 * 16 + j2) * 8 + k3] || p_516_1_.func_600_a(p_516_3_ + i1, (p_516_4_ + k3) - 1, p_516_5_ + j2) != Block.field_336_w.field_376_bc || p_516_1_.func_641_a(EnumSkyBlock.Sky, p_516_3_ + i1, p_516_4_ + k3, p_516_5_ + j2) <= 0)
                    {
                        continue;
                    }
                    BiomeGenBase biomegenbase = p_516_1_.func_48454_a(p_516_3_ + i1, p_516_5_ + j2);
                    if(biomegenbase.field_4242_o == Block.field_40199_bz.field_376_bc)
                    {
                        p_516_1_.func_634_a(p_516_3_ + i1, (p_516_4_ + k3) - 1, p_516_5_ + j2, Block.field_40199_bz.field_376_bc);
                    } else
                    {
                        p_516_1_.func_634_a(p_516_3_ + i1, (p_516_4_ + k3) - 1, p_516_5_ + j2, Block.field_337_v.field_376_bc);
                    }
                }

            }

        }

        if(Block.field_345_n[field_15235_a].field_356_bn == Material.field_1331_g)
        {
            for(int j1 = 0; j1 < 16; j1++)
            {
                for(int k2 = 0; k2 < 16; k2++)
                {
                    for(int l3 = 0; l3 < 8; l3++)
                    {
                        boolean flag1 = !aflag[(j1 * 16 + k2) * 8 + l3] && (j1 < 15 && aflag[((j1 + 1) * 16 + k2) * 8 + l3] || j1 > 0 && aflag[((j1 - 1) * 16 + k2) * 8 + l3] || k2 < 15 && aflag[(j1 * 16 + (k2 + 1)) * 8 + l3] || k2 > 0 && aflag[(j1 * 16 + (k2 - 1)) * 8 + l3] || l3 < 7 && aflag[(j1 * 16 + k2) * 8 + (l3 + 1)] || l3 > 0 && aflag[(j1 * 16 + k2) * 8 + (l3 - 1)]);
                        if(flag1 && (l3 < 4 || p_516_2_.nextInt(2) != 0) && p_516_1_.func_599_f(p_516_3_ + j1, p_516_4_ + l3, p_516_5_ + k2).func_878_a())
                        {
                            p_516_1_.func_634_a(p_516_3_ + j1, p_516_4_ + l3, p_516_5_ + k2, Block.field_338_u.field_376_bc);
                        }
                    }

                }

            }

        }
        if(Block.field_345_n[field_15235_a].field_356_bn == Material.field_1332_f)
        {
            for(int k1 = 0; k1 < 16; k1++)
            {
                for(int l2 = 0; l2 < 16; l2++)
                {
                    byte byte0 = 4;
                    if(p_516_1_.func_40471_p(p_516_3_ + k1, p_516_4_ + byte0, p_516_5_ + l2))
                    {
                        p_516_1_.func_634_a(p_516_3_ + k1, p_516_4_ + byte0, p_516_5_ + l2, Block.field_4063_aU.field_376_bc);
                    }
                }

            }

        }
        return true;
    }
}
