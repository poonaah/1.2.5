// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockLeavesBase, Material, ColorizerFoliage, IBlockAccess, 
//            BiomeGenBase, World, Block, ItemStack, 
//            Item, EntityPlayer, ItemShears, StatList, 
//            Entity

public class BlockLeaves extends BlockLeavesBase
{

    private int field_463_b;
    int field_20017_a[];

    protected BlockLeaves(int p_i622_1_, int p_i622_2_)
    {
        super(p_i622_1_, p_i622_2_, Material.field_4265_h, false);
        field_463_b = p_i622_2_;
        func_253_b(true);
    }

    public int func_35274_i()
    {
        double d = 0.5D;
        double d1 = 1.0D;
        return ColorizerFoliage.func_4146_a(d, d1);
    }

    public int func_31030_b(int p_31030_1_)
    {
        if((p_31030_1_ & 3) == 1)
        {
            return ColorizerFoliage.func_21175_a();
        }
        if((p_31030_1_ & 3) == 2)
        {
            return ColorizerFoliage.func_21174_b();
        } else
        {
            return ColorizerFoliage.func_31073_c();
        }
    }

    public int func_207_d(IBlockAccess p_207_1_, int p_207_2_, int p_207_3_, int p_207_4_)
    {
        int i = p_207_1_.func_602_e(p_207_2_, p_207_3_, p_207_4_);
        if((i & 3) == 1)
        {
            return ColorizerFoliage.func_21175_a();
        }
        if((i & 3) == 2)
        {
            return ColorizerFoliage.func_21174_b();
        }
        int j = 0;
        int k = 0;
        int l = 0;
        for(int i1 = -1; i1 <= 1; i1++)
        {
            for(int j1 = -1; j1 <= 1; j1++)
            {
                int k1 = p_207_1_.func_48454_a(p_207_2_ + j1, p_207_4_ + i1).func_48412_k();
                j += (k1 & 0xff0000) >> 16;
                k += (k1 & 0xff00) >> 8;
                l += k1 & 0xff;
            }

        }

        return (j / 9 & 0xff) << 16 | (k / 9 & 0xff) << 8 | l / 9 & 0xff;
    }

    public void func_214_b(World p_214_1_, int p_214_2_, int p_214_3_, int p_214_4_)
    {
        int i = 1;
        int j = i + 1;
        if(p_214_1_.func_640_a(p_214_2_ - j, p_214_3_ - j, p_214_4_ - j, p_214_2_ + j, p_214_3_ + j, p_214_4_ + j))
        {
            for(int k = -i; k <= i; k++)
            {
                for(int l = -i; l <= i; l++)
                {
                    for(int i1 = -i; i1 <= i; i1++)
                    {
                        int j1 = p_214_1_.func_600_a(p_214_2_ + k, p_214_3_ + l, p_214_4_ + i1);
                        if(j1 == Block.field_384_L.field_376_bc)
                        {
                            int k1 = p_214_1_.func_602_e(p_214_2_ + k, p_214_3_ + l, p_214_4_ + i1);
                            p_214_1_.func_635_c(p_214_2_ + k, p_214_3_ + l, p_214_4_ + i1, k1 | 8);
                        }
                    }

                }

            }

        }
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        if(p_208_1_.field_1026_y)
        {
            return;
        }
        int i = p_208_1_.func_602_e(p_208_2_, p_208_3_, p_208_4_);
        if((i & 8) != 0 && (i & 4) == 0)
        {
            byte byte0 = 4;
            int j = byte0 + 1;
            byte byte1 = 32;
            int k = byte1 * byte1;
            int l = byte1 / 2;
            if(field_20017_a == null)
            {
                field_20017_a = new int[byte1 * byte1 * byte1];
            }
            if(p_208_1_.func_640_a(p_208_2_ - j, p_208_3_ - j, p_208_4_ - j, p_208_2_ + j, p_208_3_ + j, p_208_4_ + j))
            {
                for(int i1 = -byte0; i1 <= byte0; i1++)
                {
                    for(int l1 = -byte0; l1 <= byte0; l1++)
                    {
                        for(int j2 = -byte0; j2 <= byte0; j2++)
                        {
                            int l2 = p_208_1_.func_600_a(p_208_2_ + i1, p_208_3_ + l1, p_208_4_ + j2);
                            if(l2 == Block.field_385_K.field_376_bc)
                            {
                                field_20017_a[(i1 + l) * k + (l1 + l) * byte1 + (j2 + l)] = 0;
                                continue;
                            }
                            if(l2 == Block.field_384_L.field_376_bc)
                            {
                                field_20017_a[(i1 + l) * k + (l1 + l) * byte1 + (j2 + l)] = -2;
                            } else
                            {
                                field_20017_a[(i1 + l) * k + (l1 + l) * byte1 + (j2 + l)] = -1;
                            }
                        }

                    }

                }

                for(int j1 = 1; j1 <= 4; j1++)
                {
                    for(int i2 = -byte0; i2 <= byte0; i2++)
                    {
                        for(int k2 = -byte0; k2 <= byte0; k2++)
                        {
                            for(int i3 = -byte0; i3 <= byte0; i3++)
                            {
                                if(field_20017_a[(i2 + l) * k + (k2 + l) * byte1 + (i3 + l)] != j1 - 1)
                                {
                                    continue;
                                }
                                if(field_20017_a[((i2 + l) - 1) * k + (k2 + l) * byte1 + (i3 + l)] == -2)
                                {
                                    field_20017_a[((i2 + l) - 1) * k + (k2 + l) * byte1 + (i3 + l)] = j1;
                                }
                                if(field_20017_a[(i2 + l + 1) * k + (k2 + l) * byte1 + (i3 + l)] == -2)
                                {
                                    field_20017_a[(i2 + l + 1) * k + (k2 + l) * byte1 + (i3 + l)] = j1;
                                }
                                if(field_20017_a[(i2 + l) * k + ((k2 + l) - 1) * byte1 + (i3 + l)] == -2)
                                {
                                    field_20017_a[(i2 + l) * k + ((k2 + l) - 1) * byte1 + (i3 + l)] = j1;
                                }
                                if(field_20017_a[(i2 + l) * k + (k2 + l + 1) * byte1 + (i3 + l)] == -2)
                                {
                                    field_20017_a[(i2 + l) * k + (k2 + l + 1) * byte1 + (i3 + l)] = j1;
                                }
                                if(field_20017_a[(i2 + l) * k + (k2 + l) * byte1 + ((i3 + l) - 1)] == -2)
                                {
                                    field_20017_a[(i2 + l) * k + (k2 + l) * byte1 + ((i3 + l) - 1)] = j1;
                                }
                                if(field_20017_a[(i2 + l) * k + (k2 + l) * byte1 + (i3 + l + 1)] == -2)
                                {
                                    field_20017_a[(i2 + l) * k + (k2 + l) * byte1 + (i3 + l + 1)] = j1;
                                }
                            }

                        }

                    }

                }

            }
            int k1 = field_20017_a[l * k + l * byte1 + l];
            if(k1 >= 0)
            {
                p_208_1_.func_635_c(p_208_2_, p_208_3_, p_208_4_, i & -9);
            } else
            {
                func_6360_i(p_208_1_, p_208_2_, p_208_3_, p_208_4_);
            }
        }
    }

    private void func_6360_i(World p_6360_1_, int p_6360_2_, int p_6360_3_, int p_6360_4_)
    {
        func_259_b_(p_6360_1_, p_6360_2_, p_6360_3_, p_6360_4_, p_6360_1_.func_602_e(p_6360_2_, p_6360_3_, p_6360_4_), 0);
        p_6360_1_.func_690_d(p_6360_2_, p_6360_3_, p_6360_4_, 0);
    }

    public int func_229_a(Random p_229_1_)
    {
        return p_229_1_.nextInt(20) != 0 ? 0 : 1;
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Block.field_333_z.field_376_bc;
    }

    public void func_216_a(World p_216_1_, int p_216_2_, int p_216_3_, int p_216_4_, int p_216_5_, float p_216_6_, int p_216_7_)
    {
        if(!p_216_1_.field_1026_y)
        {
            byte byte0 = 20;
            if((p_216_5_ & 3) == 3)
            {
                byte0 = 40;
            }
            if(p_216_1_.field_1037_n.nextInt(byte0) == 0)
            {
                int i = func_240_a(p_216_5_, p_216_1_.field_1037_n, p_216_7_);
                func_31027_a(p_216_1_, p_216_2_, p_216_3_, p_216_4_, new ItemStack(i, 1, func_21025_b(p_216_5_)));
            }
            if((p_216_5_ & 3) == 0 && p_216_1_.field_1037_n.nextInt(200) == 0)
            {
                func_31027_a(p_216_1_, p_216_2_, p_216_3_, p_216_4_, new ItemStack(Item.field_228_h, 1, 0));
            }
        }
    }

    public void func_220_a_(World p_220_1_, EntityPlayer p_220_2_, int p_220_3_, int p_220_4_, int p_220_5_, int p_220_6_)
    {
        if(!p_220_1_.field_1026_y && p_220_2_.func_6416_v() != null && p_220_2_.func_6416_v().field_1617_c == Item.field_31001_bc.field_291_aS)
        {
            p_220_2_.func_25058_a(StatList.field_25159_y[field_376_bc], 1);
            func_31027_a(p_220_1_, p_220_3_, p_220_4_, p_220_5_, new ItemStack(Block.field_384_L.field_376_bc, 1, p_220_6_ & 3));
        } else
        {
            super.func_220_a_(p_220_1_, p_220_2_, p_220_3_, p_220_4_, p_220_5_, p_220_6_);
        }
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return p_21025_1_ & 3;
    }

    public boolean func_217_b()
    {
        return !field_6359_a;
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        if((p_232_2_ & 3) == 1)
        {
            return field_378_bb + 80;
        }
        if((p_232_2_ & 3) == 3)
        {
            return field_378_bb + 144;
        } else
        {
            return field_378_bb;
        }
    }

    public void func_310_a(boolean p_310_1_)
    {
        field_6359_a = p_310_1_;
        field_378_bb = field_463_b + (p_310_1_ ? 0 : 1);
    }

    public void func_254_a(World p_254_1_, int p_254_2_, int p_254_3_, int p_254_4_, Entity p_254_5_)
    {
        super.func_254_a(p_254_1_, p_254_2_, p_254_3_, p_254_4_, p_254_5_);
    }
}
