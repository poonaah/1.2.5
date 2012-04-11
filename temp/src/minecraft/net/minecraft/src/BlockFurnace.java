// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, Block, World, 
//            IBlockAccess, TileEntityFurnace, EntityPlayer, TileEntity, 
//            EntityLiving, MathHelper, IInventory, ItemStack, 
//            EntityItem, NBTTagCompound

public class BlockFurnace extends BlockContainer
{

    private Random field_28036_a;
    private final boolean field_456_a;
    private static boolean field_28037_c = false;

    protected BlockFurnace(int p_i129_1_, boolean p_i129_2_)
    {
        super(p_i129_1_, Material.field_1334_d);
        field_28036_a = new Random();
        field_456_a = p_i129_2_;
        field_378_bb = 45;
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Block.field_445_aC.field_376_bc;
    }

    public void func_235_e(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_)
    {
        super.func_235_e(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
        func_284_h(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
    }

    private void func_284_h(World p_284_1_, int p_284_2_, int p_284_3_, int p_284_4_)
    {
        if(p_284_1_.field_1026_y)
        {
            return;
        }
        int i = p_284_1_.func_600_a(p_284_2_, p_284_3_, p_284_4_ - 1);
        int j = p_284_1_.func_600_a(p_284_2_, p_284_3_, p_284_4_ + 1);
        int k = p_284_1_.func_600_a(p_284_2_ - 1, p_284_3_, p_284_4_);
        int l = p_284_1_.func_600_a(p_284_2_ + 1, p_284_3_, p_284_4_);
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
        p_284_1_.func_691_b(p_284_2_, p_284_3_, p_284_4_, byte0);
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
        }
        int i = p_211_1_.func_602_e(p_211_2_, p_211_3_, p_211_4_);
        if(p_211_5_ != i)
        {
            return field_378_bb;
        }
        if(field_456_a)
        {
            return field_378_bb + 16;
        } else
        {
            return field_378_bb - 1;
        }
    }

    public void func_247_b(World p_247_1_, int p_247_2_, int p_247_3_, int p_247_4_, Random p_247_5_)
    {
        if(!field_456_a)
        {
            return;
        }
        int i = p_247_1_.func_602_e(p_247_2_, p_247_3_, p_247_4_);
        float f = (float)p_247_2_ + 0.5F;
        float f1 = (float)p_247_3_ + 0.0F + (p_247_5_.nextFloat() * 6F) / 16F;
        float f2 = (float)p_247_4_ + 0.5F;
        float f3 = 0.52F;
        float f4 = p_247_5_.nextFloat() * 0.6F - 0.3F;
        if(i == 4)
        {
            p_247_1_.func_694_a("smoke", f - f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
            p_247_1_.func_694_a("flame", f - f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
        } else
        if(i == 5)
        {
            p_247_1_.func_694_a("smoke", f + f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
            p_247_1_.func_694_a("flame", f + f3, f1, f2 + f4, 0.0D, 0.0D, 0.0D);
        } else
        if(i == 2)
        {
            p_247_1_.func_694_a("smoke", f + f4, f1, f2 - f3, 0.0D, 0.0D, 0.0D);
            p_247_1_.func_694_a("flame", f + f4, f1, f2 - f3, 0.0D, 0.0D, 0.0D);
        } else
        if(i == 3)
        {
            p_247_1_.func_694_a("smoke", f + f4, f1, f2 + f3, 0.0D, 0.0D, 0.0D);
            p_247_1_.func_694_a("flame", f + f4, f1, f2 + f3, 0.0D, 0.0D, 0.0D);
        }
    }

    public int func_218_a(int p_218_1_)
    {
        if(p_218_1_ == 1)
        {
            return field_378_bb + 17;
        }
        if(p_218_1_ == 0)
        {
            return field_378_bb + 17;
        }
        if(p_218_1_ == 3)
        {
            return field_378_bb - 1;
        } else
        {
            return field_378_bb;
        }
    }

    public boolean func_250_a(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_, EntityPlayer p_250_5_)
    {
        if(p_250_1_.field_1026_y)
        {
            return true;
        }
        TileEntityFurnace tileentityfurnace = (TileEntityFurnace)p_250_1_.func_603_b(p_250_2_, p_250_3_, p_250_4_);
        if(tileentityfurnace != null)
        {
            p_250_5_.func_453_a(tileentityfurnace);
        }
        return true;
    }

    public static void func_285_a(boolean p_285_0_, World p_285_1_, int p_285_2_, int p_285_3_, int p_285_4_)
    {
        int i = p_285_1_.func_602_e(p_285_2_, p_285_3_, p_285_4_);
        TileEntity tileentity = p_285_1_.func_603_b(p_285_2_, p_285_3_, p_285_4_);
        field_28037_c = true;
        if(p_285_0_)
        {
            p_285_1_.func_690_d(p_285_2_, p_285_3_, p_285_4_, Block.field_444_aD.field_376_bc);
        } else
        {
            p_285_1_.func_690_d(p_285_2_, p_285_3_, p_285_4_, Block.field_445_aC.field_376_bc);
        }
        field_28037_c = false;
        p_285_1_.func_691_b(p_285_2_, p_285_3_, p_285_4_, i);
        if(tileentity != null)
        {
            tileentity.func_31004_j();
            p_285_1_.func_654_a(p_285_2_, p_285_3_, p_285_4_, tileentity);
        }
    }

    public TileEntity func_283_a_()
    {
        return new TileEntityFurnace();
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
        if(!field_28037_c)
        {
            TileEntityFurnace tileentityfurnace = (TileEntityFurnace)p_214_1_.func_603_b(p_214_2_, p_214_3_, p_214_4_);
            if(tileentityfurnace != null)
            {
label0:
                for(int i = 0; i < tileentityfurnace.func_469_c(); i++)
                {
                    ItemStack itemstack = tileentityfurnace.func_468_c(i);
                    if(itemstack == null)
                    {
                        continue;
                    }
                    float f = field_28036_a.nextFloat() * 0.8F + 0.1F;
                    float f1 = field_28036_a.nextFloat() * 0.8F + 0.1F;
                    float f2 = field_28036_a.nextFloat() * 0.8F + 0.1F;
                    do
                    {
                        if(itemstack.field_1615_a <= 0)
                        {
                            continue label0;
                        }
                        int j = field_28036_a.nextInt(21) + 10;
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
                        entityitem.field_608_an = (float)field_28036_a.nextGaussian() * f3;
                        entityitem.field_607_ao = (float)field_28036_a.nextGaussian() * f3 + 0.2F;
                        entityitem.field_606_ap = (float)field_28036_a.nextGaussian() * f3;
                        p_214_1_.func_674_a(entityitem);
                    } while(true);
                }

            }
        }
        super.func_214_b(p_214_1_, p_214_2_, p_214_3_, p_214_4_);
    }

}
