// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Item, MathHelper, ItemStack, EntityPlayer, 
//            World, Block, BlockSapling, BlockFlower, 
//            BlockMushroom, BlockStem, BlockCrops, BlockGrass, 
//            BlockTallGrass, EntitySheep, BlockCloth, EntityLiving

public class ItemDye extends Item
{

    public static final String field_21023_a[] = {
        "black", "red", "green", "brown", "blue", "purple", "cyan", "silver", "gray", "pink", 
        "lime", "yellow", "lightBlue", "magenta", "orange", "white"
    };
    public static final int field_31002_bk[] = {
        0x1e1b1b, 0xb3312c, 0x3b511a, 0x51301a, 0x253192, 0x7b2fbe, 0x287697, 0x287697, 0x434343, 0xd88198, 
        0x41cd34, 0xdecf2a, 0x6689d3, 0xc354cd, 0xeb8844, 0xf0f0f0
    };

    public ItemDye(int p_i359_1_)
    {
        super(p_i359_1_);
        func_21015_a(true);
        func_21013_d(0);
    }

    public int func_27009_a(int p_27009_1_)
    {
        int i = MathHelper.func_41084_a(p_27009_1_, 0, 15);
        return field_4018_aZ + (i % 8) * 16 + i / 8;
    }

    public String func_21011_b(ItemStack p_21011_1_)
    {
        int i = MathHelper.func_41084_a(p_21011_1_.func_21181_i(), 0, 15);
        return (new StringBuilder()).append(super.func_20009_a()).append(".").append(field_21023_a[i]).toString();
    }

    public boolean func_192_a(ItemStack p_192_1_, EntityPlayer p_192_2_, World p_192_3_, int p_192_4_, int p_192_5_, int p_192_6_, int p_192_7_)
    {
        if(!p_192_2_.func_35190_e(p_192_4_, p_192_5_, p_192_6_))
        {
            return false;
        }
        if(p_192_1_.func_21181_i() == 15)
        {
            int i = p_192_3_.func_600_a(p_192_4_, p_192_5_, p_192_6_);
            if(i == Block.field_333_z.field_376_bc)
            {
                if(!p_192_3_.field_1026_y)
                {
                    ((BlockSapling)Block.field_333_z).func_21028_c(p_192_3_, p_192_4_, p_192_5_, p_192_6_, p_192_3_.field_1037_n);
                    p_192_1_.field_1615_a--;
                }
                return true;
            }
            if(i == Block.field_415_ag.field_376_bc || i == Block.field_414_ah.field_376_bc)
            {
                if(!p_192_3_.field_1026_y && ((BlockMushroom)Block.field_345_n[i]).func_35293_c(p_192_3_, p_192_4_, p_192_5_, p_192_6_, p_192_3_.field_1037_n))
                {
                    p_192_1_.field_1615_a--;
                }
                return true;
            }
            if(i == Block.field_35283_bu.field_376_bc || i == Block.field_35284_bt.field_376_bc)
            {
                if(!p_192_3_.field_1026_y)
                {
                    ((BlockStem)Block.field_345_n[i]).func_35294_i(p_192_3_, p_192_4_, p_192_5_, p_192_6_);
                    p_192_1_.field_1615_a--;
                }
                return true;
            }
            if(i == Block.field_447_aA.field_376_bc)
            {
                if(!p_192_3_.field_1026_y)
                {
                    ((BlockCrops)Block.field_447_aA).func_21027_c_(p_192_3_, p_192_4_, p_192_5_, p_192_6_);
                    p_192_1_.field_1615_a--;
                }
                return true;
            }
            if(i == Block.field_337_v.field_376_bc)
            {
                if(!p_192_3_.field_1026_y)
                {
                    p_192_1_.field_1615_a--;
label0:
                    for(int j = 0; j < 128; j++)
                    {
                        int k = p_192_4_;
                        int l = p_192_5_ + 1;
                        int i1 = p_192_6_;
                        for(int j1 = 0; j1 < j / 16; j1++)
                        {
                            k += field_4015_b.nextInt(3) - 1;
                            l += ((field_4015_b.nextInt(3) - 1) * field_4015_b.nextInt(3)) / 2;
                            i1 += field_4015_b.nextInt(3) - 1;
                            if(p_192_3_.func_600_a(k, l - 1, i1) != Block.field_337_v.field_376_bc || p_192_3_.func_28100_h(k, l, i1))
                            {
                                continue label0;
                            }
                        }

                        if(p_192_3_.func_600_a(k, l, i1) != 0)
                        {
                            continue;
                        }
                        if(field_4015_b.nextInt(10) != 0)
                        {
                            p_192_3_.func_688_b(k, l, i1, Block.field_9257_X.field_376_bc, 1);
                            continue;
                        }
                        if(field_4015_b.nextInt(3) != 0)
                        {
                            p_192_3_.func_690_d(k, l, i1, Block.field_417_ae.field_376_bc);
                        } else
                        {
                            p_192_3_.func_690_d(k, l, i1, Block.field_416_af.field_376_bc);
                        }
                    }

                }
                return true;
            }
        }
        return false;
    }

    public void func_4019_b(ItemStack p_4019_1_, EntityLiving p_4019_2_)
    {
        if(p_4019_2_ instanceof EntitySheep)
        {
            EntitySheep entitysheep = (EntitySheep)p_4019_2_;
            int i = BlockCloth.func_21034_c(p_4019_1_.func_21181_i());
            if(!entitysheep.func_21072_p() && entitysheep.func_21074_p_() != i)
            {
                entitysheep.func_21071_b_(i);
                p_4019_1_.field_1615_a--;
            }
        }
    }

}
