// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, Block, World, 
//            IBlockAccess, TileEntityDispenser, EntityPlayer, ModLoader, 
//            ItemStack, Item, EntityArrow, EntityEgg, 
//            EntitySnowball, ItemPotion, EntityPotion, EntityExpBottle, 
//            ItemMonsterPlacer, EntitySmallFireball, EntityItem, EntityLiving, 
//            MathHelper, NBTTagCompound, TileEntity

public class BlockDispenser extends BlockContainer
{

    private Random field_28035_a;

    protected BlockDispenser(int p_i200_1_)
    {
        super(p_i200_1_, Material.field_1334_d);
        field_28035_a = new Random();
        field_378_bb = 45;
    }

    public int func_4025_d()
    {
        return 4;
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Block.field_9265_P.field_376_bc;
    }

    public void func_235_e(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_)
    {
        super.func_235_e(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
        func_21032_h(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
    }

    private void func_21032_h(World p_21032_1_, int p_21032_2_, int p_21032_3_, int p_21032_4_)
    {
        if(!p_21032_1_.field_1026_y)
        {
            int i = p_21032_1_.func_600_a(p_21032_2_, p_21032_3_, p_21032_4_ - 1);
            int j = p_21032_1_.func_600_a(p_21032_2_, p_21032_3_, p_21032_4_ + 1);
            int k = p_21032_1_.func_600_a(p_21032_2_ - 1, p_21032_3_, p_21032_4_);
            int l = p_21032_1_.func_600_a(p_21032_2_ + 1, p_21032_3_, p_21032_4_);
            byte byte0 = 3;
            if(Block.field_343_p[i] && !Block.field_343_p[j])
            {
                byte0 = 3;
            }
            if(Block.field_343_p[j] && !Block.field_343_p[i])
            {
                byte0 = 2;
            }
            if(Block.field_343_p[k] && !Block.field_343_p[l])
            {
                byte0 = 5;
            }
            if(Block.field_343_p[l] && !Block.field_343_p[k])
            {
                byte0 = 4;
            }
            p_21032_1_.func_691_b(p_21032_2_, p_21032_3_, p_21032_4_, byte0);
        }
    }

    public int func_211_a(IBlockAccess p_211_1_, int p_211_2_, int p_211_3_, int p_211_4_, int p_211_5_)
    {
        if(p_211_5_ == 1)
        {
            return field_378_bb + 17;
        }
        if(p_211_5_ == 0)
        {
            return field_378_bb + 17;
        } else
        {
            int i = p_211_1_.func_602_e(p_211_2_, p_211_3_, p_211_4_);
            return p_211_5_ == i ? field_378_bb + 1 : field_378_bb;
        }
    }

    public int func_218_a(int p_218_1_)
    {
        return p_218_1_ != 1 ? p_218_1_ != 0 ? p_218_1_ != 3 ? field_378_bb : field_378_bb + 1 : field_378_bb + 17 : field_378_bb + 17;
    }

    public boolean func_250_a(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_, EntityPlayer p_250_5_)
    {
        if(p_250_1_.field_1026_y)
        {
            return true;
        }
        TileEntityDispenser tileentitydispenser = (TileEntityDispenser)p_250_1_.func_603_b(p_250_2_, p_250_3_, p_250_4_);
        if(tileentitydispenser != null)
        {
            p_250_5_.func_21092_a(tileentitydispenser);
        }
        return true;
    }

    private void func_21033_c(World p_21033_1_, int p_21033_2_, int p_21033_3_, int p_21033_4_, Random p_21033_5_)
    {
        int i = p_21033_1_.func_602_e(p_21033_2_, p_21033_3_, p_21033_4_);
        int j = 0;
        int k = 0;
        if(i == 3)
        {
            k = 1;
        } else
        if(i == 2)
        {
            k = -1;
        } else
        if(i == 5)
        {
            j = 1;
        } else
        {
            j = -1;
        }
        TileEntityDispenser tileentitydispenser = (TileEntityDispenser)p_21033_1_.func_603_b(p_21033_2_, p_21033_3_, p_21033_4_);
        if(tileentitydispenser != null)
        {
            ItemStack itemstack = tileentitydispenser.func_21100_b();
            double d = (double)p_21033_2_ + (double)j * 0.59999999999999998D + 0.5D;
            double d1 = (double)p_21033_3_ + 0.5D;
            double d2 = (double)p_21033_4_ + (double)k * 0.59999999999999998D + 0.5D;
            if(itemstack == null)
            {
                p_21033_1_.func_28106_e(1001, p_21033_2_, p_21033_3_, p_21033_4_, 0);
            } else
            {
                boolean flag = ModLoader.dispenseEntity(p_21033_1_, d, d1, d2, j, k, itemstack);
                if(!flag)
                {
                    if(itemstack.field_1617_c == Item.field_226_j.field_291_aS)
                    {
                        EntityArrow entityarrow = new EntityArrow(p_21033_1_, d, d1, d2);
                        entityarrow.func_408_a(j, 0.10000000149011612D, k, 1.1F, 6F);
                        entityarrow.field_28020_a = true;
                        p_21033_1_.func_674_a(entityarrow);
                        p_21033_1_.func_28106_e(1002, p_21033_2_, p_21033_3_, p_21033_4_, 0);
                    } else
                    if(itemstack.field_1617_c == Item.field_296_aN.field_291_aS)
                    {
                        EntityEgg entityegg = new EntityEgg(p_21033_1_, d, d1, d2);
                        entityegg.func_40076_a(j, 0.10000000149011612D, k, 1.1F, 6F);
                        p_21033_1_.func_674_a(entityegg);
                        p_21033_1_.func_28106_e(1002, p_21033_2_, p_21033_3_, p_21033_4_, 0);
                    } else
                    if(itemstack.field_1617_c == Item.field_308_aB.field_291_aS)
                    {
                        EntitySnowball entitysnowball = new EntitySnowball(p_21033_1_, d, d1, d2);
                        entitysnowball.func_40076_a(j, 0.10000000149011612D, k, 1.1F, 6F);
                        p_21033_1_.func_674_a(entitysnowball);
                        p_21033_1_.func_28106_e(1002, p_21033_2_, p_21033_3_, p_21033_4_, 0);
                    } else
                    if(itemstack.field_1617_c == Item.field_40413_bs.field_291_aS && ItemPotion.func_40433_c(itemstack.func_21181_i()))
                    {
                        EntityPotion entitypotion = new EntityPotion(p_21033_1_, d, d1, d2, itemstack.func_21181_i());
                        entitypotion.func_40076_a(j, 0.10000000149011612D, k, 1.375F, 3F);
                        p_21033_1_.func_674_a(entitypotion);
                        p_21033_1_.func_28106_e(1002, p_21033_2_, p_21033_3_, p_21033_4_, 0);
                    } else
                    if(itemstack.field_1617_c == Item.field_48438_bD.field_291_aS)
                    {
                        EntityExpBottle entityexpbottle = new EntityExpBottle(p_21033_1_, d, d1, d2);
                        entityexpbottle.func_40076_a(j, 0.10000000149011612D, k, 1.375F, 3F);
                        p_21033_1_.func_674_a(entityexpbottle);
                        p_21033_1_.func_28106_e(1002, p_21033_2_, p_21033_3_, p_21033_4_, 0);
                    } else
                    if(itemstack.field_1617_c == Item.field_44019_bC.field_291_aS)
                    {
                        ItemMonsterPlacer.func_48440_a(p_21033_1_, itemstack.func_21181_i(), d + (double)j * 0.29999999999999999D, d1 - 0.29999999999999999D, d2 + (double)k * 0.29999999999999999D);
                        p_21033_1_.func_28106_e(1002, p_21033_2_, p_21033_3_, p_21033_4_, 0);
                    } else
                    if(itemstack.field_1617_c == Item.field_48439_bE.field_291_aS)
                    {
                        EntitySmallFireball entitysmallfireball = new EntitySmallFireball(p_21033_1_, d + (double)j * 0.29999999999999999D, d1, d2 + (double)k * 0.29999999999999999D, (double)j + p_21033_5_.nextGaussian() * 0.050000000000000003D, p_21033_5_.nextGaussian() * 0.050000000000000003D, (double)k + p_21033_5_.nextGaussian() * 0.050000000000000003D);
                        p_21033_1_.func_674_a(entitysmallfireball);
                        p_21033_1_.func_28106_e(1009, p_21033_2_, p_21033_3_, p_21033_4_, 0);
                    } else
                    {
                        EntityItem entityitem = new EntityItem(p_21033_1_, d, d1 - 0.29999999999999999D, d2, itemstack);
                        double d3 = p_21033_5_.nextDouble() * 0.10000000000000001D + 0.20000000000000001D;
                        entityitem.field_608_an = (double)j * d3;
                        entityitem.field_607_ao = 0.20000000298023224D;
                        entityitem.field_606_ap = (double)k * d3;
                        entityitem.field_608_an += p_21033_5_.nextGaussian() * 0.0074999998323619366D * 6D;
                        entityitem.field_607_ao += p_21033_5_.nextGaussian() * 0.0074999998323619366D * 6D;
                        entityitem.field_606_ap += p_21033_5_.nextGaussian() * 0.0074999998323619366D * 6D;
                        p_21033_1_.func_674_a(entityitem);
                        p_21033_1_.func_28106_e(1000, p_21033_2_, p_21033_3_, p_21033_4_, 0);
                    }
                }
                p_21033_1_.func_28106_e(2000, p_21033_2_, p_21033_3_, p_21033_4_, j + 1 + (k + 1) * 3);
            }
        }
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        if(p_226_5_ > 0 && Block.field_345_n[p_226_5_].func_209_d())
        {
            boolean flag = p_226_1_.func_625_o(p_226_2_, p_226_3_, p_226_4_) || p_226_1_.func_625_o(p_226_2_, p_226_3_ + 1, p_226_4_);
            if(flag)
            {
                p_226_1_.func_22136_c(p_226_2_, p_226_3_, p_226_4_, field_376_bc, func_4025_d());
            }
        }
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        if(!p_208_1_.field_1026_y && (p_208_1_.func_625_o(p_208_2_, p_208_3_, p_208_4_) || p_208_1_.func_625_o(p_208_2_, p_208_3_ + 1, p_208_4_)))
        {
            func_21033_c(p_208_1_, p_208_2_, p_208_3_, p_208_4_, p_208_5_);
        }
    }

    public TileEntity func_283_a_()
    {
        return new TileEntityDispenser();
    }

    public void func_4026_a(World p_4026_1_, int p_4026_2_, int p_4026_3_, int p_4026_4_, EntityLiving p_4026_5_)
    {
        int i = MathHelper.func_1108_b((double)((p_4026_5_.field_605_aq * 4F) / 360F) + 0.5D) & 3;
        if(i == 0)
        {
            p_4026_1_.func_691_b(p_4026_2_, p_4026_3_, p_4026_4_, 2);
        }
        if(i == 1)
        {
            p_4026_1_.func_691_b(p_4026_2_, p_4026_3_, p_4026_4_, 5);
        }
        if(i == 2)
        {
            p_4026_1_.func_691_b(p_4026_2_, p_4026_3_, p_4026_4_, 3);
        }
        if(i == 3)
        {
            p_4026_1_.func_691_b(p_4026_2_, p_4026_3_, p_4026_4_, 4);
        }
    }

    public void func_214_b(World p_214_1_, int p_214_2_, int p_214_3_, int p_214_4_)
    {
        TileEntityDispenser tileentitydispenser = (TileEntityDispenser)p_214_1_.func_603_b(p_214_2_, p_214_3_, p_214_4_);
        if(tileentitydispenser != null)
        {
            for(int i = 0; i < tileentitydispenser.func_469_c(); i++)
            {
                ItemStack itemstack = tileentitydispenser.func_468_c(i);
                if(itemstack != null)
                {
                    float f = field_28035_a.nextFloat() * 0.8F + 0.1F;
                    float f1 = field_28035_a.nextFloat() * 0.8F + 0.1F;
                    float f2 = field_28035_a.nextFloat() * 0.8F + 0.1F;
                    while(itemstack.field_1615_a > 0) 
                    {
                        int j = field_28035_a.nextInt(21) + 10;
                        if(j > itemstack.field_1615_a)
                        {
                            j = itemstack.field_1615_a;
                        }
                        itemstack.field_1615_a -= j;
                        EntityItem entityitem = new EntityItem(p_214_1_, (float)p_214_2_ + f, (float)p_214_3_ + f1, (float)p_214_4_ + f2, new ItemStack(itemstack.field_1617_c, j, itemstack.func_21181_i()));
                        if(itemstack.func_40710_n())
                        {
                            entityitem.field_801_a.func_40706_d((NBTTagCompound)itemstack.func_40709_o().func_40195_b());
                        }
                        float f3 = 0.05F;
                        entityitem.field_608_an = (float)field_28035_a.nextGaussian() * f3;
                        entityitem.field_607_ao = (float)field_28035_a.nextGaussian() * f3 + 0.2F;
                        entityitem.field_606_ap = (float)field_28035_a.nextGaussian() * f3;
                        p_214_1_.func_674_a(entityitem);
                    }
                }
            }

        }
        super.func_214_b(p_214_1_, p_214_2_, p_214_3_, p_214_4_);
    }
}
