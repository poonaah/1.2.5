// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Material, Block, 
//            TileEntityChest, TileEntityMobSpawner, ItemStack, Item

public class WorldGenDungeons extends WorldGenerator
{

    public WorldGenDungeons()
    {
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        byte byte0 = 3;
        int i = p_516_2_.nextInt(2) + 2;
        int j = p_516_2_.nextInt(2) + 2;
        int k = 0;
        for(int l = p_516_3_ - i - 1; l <= p_516_3_ + i + 1; l++)
        {
            for(int k1 = p_516_4_ - 1; k1 <= p_516_4_ + byte0 + 1; k1++)
            {
                for(int j2 = p_516_5_ - j - 1; j2 <= p_516_5_ + j + 1; j2++)
                {
                    Material material = p_516_1_.func_599_f(l, k1, j2);
                    if(k1 == p_516_4_ - 1 && !material.func_878_a())
                    {
                        return false;
                    }
                    if(k1 == p_516_4_ + byte0 + 1 && !material.func_878_a())
                    {
                        return false;
                    }
                    if((l == p_516_3_ - i - 1 || l == p_516_3_ + i + 1 || j2 == p_516_5_ - j - 1 || j2 == p_516_5_ + j + 1) && k1 == p_516_4_ && p_516_1_.func_20084_d(l, k1, j2) && p_516_1_.func_20084_d(l, k1 + 1, j2))
                    {
                        k++;
                    }
                }

            }

        }

        if(k < 1 || k > 5)
        {
            return false;
        }
        for(int i1 = p_516_3_ - i - 1; i1 <= p_516_3_ + i + 1; i1++)
        {
            for(int l1 = p_516_4_ + byte0; l1 >= p_516_4_ - 1; l1--)
            {
                for(int k2 = p_516_5_ - j - 1; k2 <= p_516_5_ + j + 1; k2++)
                {
                    if(i1 == p_516_3_ - i - 1 || l1 == p_516_4_ - 1 || k2 == p_516_5_ - j - 1 || i1 == p_516_3_ + i + 1 || l1 == p_516_4_ + byte0 + 1 || k2 == p_516_5_ + j + 1)
                    {
                        if(l1 >= 0 && !p_516_1_.func_599_f(i1, l1 - 1, k2).func_878_a())
                        {
                            p_516_1_.func_690_d(i1, l1, k2, 0);
                            continue;
                        }
                        if(!p_516_1_.func_599_f(i1, l1, k2).func_878_a())
                        {
                            continue;
                        }
                        if(l1 == p_516_4_ - 1 && p_516_2_.nextInt(4) != 0)
                        {
                            p_516_1_.func_690_d(i1, l1, k2, Block.field_406_ap.field_376_bc);
                        } else
                        {
                            p_516_1_.func_690_d(i1, l1, k2, Block.field_335_x.field_376_bc);
                        }
                    } else
                    {
                        p_516_1_.func_690_d(i1, l1, k2, 0);
                    }
                }

            }

        }

        for(int j1 = 0; j1 < 2; j1++)
        {
label0:
            for(int i2 = 0; i2 < 3; i2++)
            {
                int l2 = (p_516_3_ + p_516_2_.nextInt(i * 2 + 1)) - i;
                int i3 = p_516_4_;
                int j3 = (p_516_5_ + p_516_2_.nextInt(j * 2 + 1)) - j;
                if(!p_516_1_.func_20084_d(l2, i3, j3))
                {
                    continue;
                }
                int k3 = 0;
                if(p_516_1_.func_599_f(l2 - 1, i3, j3).func_878_a())
                {
                    k3++;
                }
                if(p_516_1_.func_599_f(l2 + 1, i3, j3).func_878_a())
                {
                    k3++;
                }
                if(p_516_1_.func_599_f(l2, i3, j3 - 1).func_878_a())
                {
                    k3++;
                }
                if(p_516_1_.func_599_f(l2, i3, j3 + 1).func_878_a())
                {
                    k3++;
                }
                if(k3 != 1)
                {
                    continue;
                }
                p_516_1_.func_690_d(l2, i3, j3, Block.field_396_av.field_376_bc);
                TileEntityChest tileentitychest = (TileEntityChest)p_516_1_.func_603_b(l2, i3, j3);
                if(tileentitychest == null)
                {
                    break;
                }
                int l3 = 0;
                do
                {
                    if(l3 >= 8)
                    {
                        break label0;
                    }
                    ItemStack itemstack = func_530_a(p_516_2_);
                    if(itemstack != null)
                    {
                        tileentitychest.func_472_a(p_516_2_.nextInt(tileentitychest.func_469_c()), itemstack);
                    }
                    l3++;
                } while(true);
            }

        }

        p_516_1_.func_690_d(p_516_3_, p_516_4_, p_516_5_, Block.field_400_at.field_376_bc);
        TileEntityMobSpawner tileentitymobspawner = (TileEntityMobSpawner)p_516_1_.func_603_b(p_516_3_, p_516_4_, p_516_5_);
        if(tileentitymobspawner != null)
        {
            tileentitymobspawner.func_21098_a(func_531_b(p_516_2_));
        } else
        {
            System.err.println((new StringBuilder()).append("Failed to fetch mob spawner entity at (").append(p_516_3_).append(", ").append(p_516_4_).append(", ").append(p_516_5_).append(")").toString());
        }
        return true;
    }

    private ItemStack func_530_a(Random p_530_1_)
    {
        int i = p_530_1_.nextInt(11);
        if(i == 0)
        {
            return new ItemStack(Item.field_254_ay);
        }
        if(i == 1)
        {
            return new ItemStack(Item.field_223_m, p_530_1_.nextInt(4) + 1);
        }
        if(i == 2)
        {
            return new ItemStack(Item.field_242_S);
        }
        if(i == 3)
        {
            return new ItemStack(Item.field_243_R, p_530_1_.nextInt(4) + 1);
        }
        if(i == 4)
        {
            return new ItemStack(Item.field_250_K, p_530_1_.nextInt(4) + 1);
        }
        if(i == 5)
        {
            return new ItemStack(Item.field_253_I, p_530_1_.nextInt(4) + 1);
        }
        if(i == 6)
        {
            return new ItemStack(Item.field_262_au);
        }
        if(i == 7 && p_530_1_.nextInt(100) == 0)
        {
            return new ItemStack(Item.field_269_ar);
        }
        if(i == 8 && p_530_1_.nextInt(2) == 0)
        {
            return new ItemStack(Item.field_309_aA, p_530_1_.nextInt(4) + 1);
        }
        if(i == 9 && p_530_1_.nextInt(10) == 0)
        {
            return new ItemStack(Item.field_233_c[Item.field_293_aQ.field_291_aS + p_530_1_.nextInt(2)]);
        }
        if(i == 10)
        {
            return new ItemStack(Item.field_21021_aU, 1, 3);
        } else
        {
            return null;
        }
    }

    private String func_531_b(Random p_531_1_)
    {
        int i = p_531_1_.nextInt(4);
        if(i == 0)
        {
            return "Skeleton";
        }
        if(i == 1)
        {
            return "Zombie";
        }
        if(i == 2)
        {
            return "Zombie";
        }
        if(i == 3)
        {
            return "Spider";
        } else
        {
            return "";
        }
    }
}
