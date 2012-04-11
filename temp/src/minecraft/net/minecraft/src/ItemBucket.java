// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Item, EntityPlayer, MovingObjectPosition, EnumMovingObjectType, 
//            World, Material, PlayerCapabilities, ItemStack, 
//            WorldProvider, Block, EntityCow

public class ItemBucket extends Item
{

    private int field_331_a;

    public ItemBucket(int p_i238_1_, int p_i238_2_)
    {
        super(p_i238_1_);
        field_290_aT = 1;
        field_331_a = p_i238_2_;
    }

    public ItemStack func_193_a(ItemStack p_193_1_, World p_193_2_, EntityPlayer p_193_3_)
    {
        float f = 1.0F;
        double d = p_193_3_.field_9285_at + (p_193_3_.field_611_ak - p_193_3_.field_9285_at) * (double)f;
        double d1 = (p_193_3_.field_9284_au + (p_193_3_.field_610_al - p_193_3_.field_9284_au) * (double)f + 1.6200000000000001D) - (double)p_193_3_.field_9292_aO;
        double d2 = p_193_3_.field_9283_av + (p_193_3_.field_609_am - p_193_3_.field_9283_av) * (double)f;
        boolean flag = field_331_a == 0;
        MovingObjectPosition movingobjectposition = func_40402_a(p_193_2_, p_193_3_, flag);
        if(movingobjectposition == null)
        {
            return p_193_1_;
        }
        if(movingobjectposition.field_1167_a == EnumMovingObjectType.TILE)
        {
            int i = movingobjectposition.field_1166_b;
            int j = movingobjectposition.field_1172_c;
            int k = movingobjectposition.field_1171_d;
            if(!p_193_2_.func_6466_a(p_193_3_, i, j, k))
            {
                return p_193_1_;
            }
            if(field_331_a == 0)
            {
                if(!p_193_3_.func_35190_e(i, j, k))
                {
                    return p_193_1_;
                }
                if(p_193_2_.func_599_f(i, j, k) == Material.field_1332_f && p_193_2_.func_602_e(i, j, k) == 0)
                {
                    p_193_2_.func_690_d(i, j, k, 0);
                    if(p_193_3_.field_35212_aW.field_35756_d)
                    {
                        return p_193_1_;
                    } else
                    {
                        return new ItemStack(Item.field_4016_av);
                    }
                }
                if(p_193_2_.func_599_f(i, j, k) == Material.field_1331_g && p_193_2_.func_602_e(i, j, k) == 0)
                {
                    p_193_2_.func_690_d(i, j, k, 0);
                    if(p_193_3_.field_35212_aW.field_35756_d)
                    {
                        return p_193_1_;
                    } else
                    {
                        return new ItemStack(Item.field_258_aw);
                    }
                }
            } else
            {
                if(field_331_a < 0)
                {
                    return new ItemStack(Item.field_262_au);
                }
                if(movingobjectposition.field_1170_e == 0)
                {
                    j--;
                }
                if(movingobjectposition.field_1170_e == 1)
                {
                    j++;
                }
                if(movingobjectposition.field_1170_e == 2)
                {
                    k--;
                }
                if(movingobjectposition.field_1170_e == 3)
                {
                    k++;
                }
                if(movingobjectposition.field_1170_e == 4)
                {
                    i--;
                }
                if(movingobjectposition.field_1170_e == 5)
                {
                    i++;
                }
                if(!p_193_3_.func_35190_e(i, j, k))
                {
                    return p_193_1_;
                }
                if(p_193_2_.func_20084_d(i, j, k) || !p_193_2_.func_599_f(i, j, k).func_878_a())
                {
                    if(p_193_2_.field_4209_q.field_6479_d && field_331_a == Block.field_401_B.field_376_bc)
                    {
                        p_193_2_.func_684_a(d + 0.5D, d1 + 0.5D, d2 + 0.5D, "random.fizz", 0.5F, 2.6F + (p_193_2_.field_1037_n.nextFloat() - p_193_2_.field_1037_n.nextFloat()) * 0.8F);
                        for(int l = 0; l < 8; l++)
                        {
                            p_193_2_.func_694_a("largesmoke", (double)i + Math.random(), (double)j + Math.random(), (double)k + Math.random(), 0.0D, 0.0D, 0.0D);
                        }

                    } else
                    {
                        p_193_2_.func_688_b(i, j, k, field_331_a, 0);
                    }
                    if(p_193_3_.field_35212_aW.field_35756_d)
                    {
                        return p_193_1_;
                    } else
                    {
                        return new ItemStack(Item.field_262_au);
                    }
                }
            }
        } else
        if(field_331_a == 0 && (movingobjectposition.field_1168_g instanceof EntityCow))
        {
            return new ItemStack(Item.field_305_aE);
        }
        return p_193_1_;
    }
}
