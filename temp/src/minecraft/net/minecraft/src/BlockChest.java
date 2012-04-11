// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, World, EntityLiving, 
//            MathHelper, Block, IBlockAccess, TileEntityChest, 
//            IInventory, ItemStack, EntityItem, NBTTagCompound, 
//            InventoryLargeChest, EntityPlayer, EntityOcelot, AxisAlignedBB, 
//            Entity, TileEntity

public class BlockChest extends BlockContainer
{

    private Random field_457_a;

    protected BlockChest(int p_i595_1_)
    {
        super(p_i595_1_, Material.field_1335_c);
        field_457_a = new Random();
        field_378_bb = 26;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_210_f()
    {
        return 22;
    }

    public void func_235_e(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_)
    {
        super.func_235_e(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
        func_35306_h(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
        int i = p_235_1_.func_600_a(p_235_2_, p_235_3_, p_235_4_ - 1);
        int j = p_235_1_.func_600_a(p_235_2_, p_235_3_, p_235_4_ + 1);
        int k = p_235_1_.func_600_a(p_235_2_ - 1, p_235_3_, p_235_4_);
        int l = p_235_1_.func_600_a(p_235_2_ + 1, p_235_3_, p_235_4_);
        if(i == field_376_bc)
        {
            func_35306_h(p_235_1_, p_235_2_, p_235_3_, p_235_4_ - 1);
        }
        if(j == field_376_bc)
        {
            func_35306_h(p_235_1_, p_235_2_, p_235_3_, p_235_4_ + 1);
        }
        if(k == field_376_bc)
        {
            func_35306_h(p_235_1_, p_235_2_ - 1, p_235_3_, p_235_4_);
        }
        if(l == field_376_bc)
        {
            func_35306_h(p_235_1_, p_235_2_ + 1, p_235_3_, p_235_4_);
        }
    }

    public void func_4026_a(World p_4026_1_, int p_4026_2_, int p_4026_3_, int p_4026_4_, EntityLiving p_4026_5_)
    {
        int i = p_4026_1_.func_600_a(p_4026_2_, p_4026_3_, p_4026_4_ - 1);
        int j = p_4026_1_.func_600_a(p_4026_2_, p_4026_3_, p_4026_4_ + 1);
        int k = p_4026_1_.func_600_a(p_4026_2_ - 1, p_4026_3_, p_4026_4_);
        int l = p_4026_1_.func_600_a(p_4026_2_ + 1, p_4026_3_, p_4026_4_);
        byte byte0 = 0;
        int i1 = MathHelper.func_1108_b((double)((p_4026_5_.field_605_aq * 4F) / 360F) + 0.5D) & 3;
        if(i1 == 0)
        {
            byte0 = 2;
        }
        if(i1 == 1)
        {
            byte0 = 5;
        }
        if(i1 == 2)
        {
            byte0 = 3;
        }
        if(i1 == 3)
        {
            byte0 = 4;
        }
        if(i != field_376_bc && j != field_376_bc && k != field_376_bc && l != field_376_bc)
        {
            p_4026_1_.func_691_b(p_4026_2_, p_4026_3_, p_4026_4_, byte0);
        } else
        {
            if((i == field_376_bc || j == field_376_bc) && (byte0 == 4 || byte0 == 5))
            {
                if(i == field_376_bc)
                {
                    p_4026_1_.func_691_b(p_4026_2_, p_4026_3_, p_4026_4_ - 1, byte0);
                } else
                {
                    p_4026_1_.func_691_b(p_4026_2_, p_4026_3_, p_4026_4_ + 1, byte0);
                }
                p_4026_1_.func_691_b(p_4026_2_, p_4026_3_, p_4026_4_, byte0);
            }
            if((k == field_376_bc || l == field_376_bc) && (byte0 == 2 || byte0 == 3))
            {
                if(k == field_376_bc)
                {
                    p_4026_1_.func_691_b(p_4026_2_ - 1, p_4026_3_, p_4026_4_, byte0);
                } else
                {
                    p_4026_1_.func_691_b(p_4026_2_ + 1, p_4026_3_, p_4026_4_, byte0);
                }
                p_4026_1_.func_691_b(p_4026_2_, p_4026_3_, p_4026_4_, byte0);
            }
        }
    }

    public void func_35306_h(World p_35306_1_, int p_35306_2_, int p_35306_3_, int p_35306_4_)
    {
        if(p_35306_1_.field_1026_y)
        {
            return;
        }
        int i = p_35306_1_.func_600_a(p_35306_2_, p_35306_3_, p_35306_4_ - 1);
        int j = p_35306_1_.func_600_a(p_35306_2_, p_35306_3_, p_35306_4_ + 1);
        int k = p_35306_1_.func_600_a(p_35306_2_ - 1, p_35306_3_, p_35306_4_);
        int l = p_35306_1_.func_600_a(p_35306_2_ + 1, p_35306_3_, p_35306_4_);
        byte byte0 = 4;
        if(i == field_376_bc || j == field_376_bc)
        {
            int i1 = p_35306_1_.func_600_a(p_35306_2_ - 1, p_35306_3_, i != field_376_bc ? p_35306_4_ + 1 : p_35306_4_ - 1);
            int k1 = p_35306_1_.func_600_a(p_35306_2_ + 1, p_35306_3_, i != field_376_bc ? p_35306_4_ + 1 : p_35306_4_ - 1);
            byte0 = 5;
            int i2 = -1;
            if(i == field_376_bc)
            {
                i2 = p_35306_1_.func_602_e(p_35306_2_, p_35306_3_, p_35306_4_ - 1);
            } else
            {
                i2 = p_35306_1_.func_602_e(p_35306_2_, p_35306_3_, p_35306_4_ + 1);
            }
            if(i2 == 4)
            {
                byte0 = 4;
            }
            if((Block.field_343_p[k] || Block.field_343_p[i1]) && !Block.field_343_p[l] && !Block.field_343_p[k1])
            {
                byte0 = 5;
            }
            if((Block.field_343_p[l] || Block.field_343_p[k1]) && !Block.field_343_p[k] && !Block.field_343_p[i1])
            {
                byte0 = 4;
            }
        } else
        if(k == field_376_bc || l == field_376_bc)
        {
            int j1 = p_35306_1_.func_600_a(k != field_376_bc ? p_35306_2_ + 1 : p_35306_2_ - 1, p_35306_3_, p_35306_4_ - 1);
            int l1 = p_35306_1_.func_600_a(k != field_376_bc ? p_35306_2_ + 1 : p_35306_2_ - 1, p_35306_3_, p_35306_4_ + 1);
            byte0 = 3;
            int j2 = -1;
            if(k == field_376_bc)
            {
                j2 = p_35306_1_.func_602_e(p_35306_2_ - 1, p_35306_3_, p_35306_4_);
            } else
            {
                j2 = p_35306_1_.func_602_e(p_35306_2_ + 1, p_35306_3_, p_35306_4_);
            }
            if(j2 == 2)
            {
                byte0 = 2;
            }
            if((Block.field_343_p[i] || Block.field_343_p[j1]) && !Block.field_343_p[j] && !Block.field_343_p[l1])
            {
                byte0 = 3;
            }
            if((Block.field_343_p[j] || Block.field_343_p[l1]) && !Block.field_343_p[i] && !Block.field_343_p[j1])
            {
                byte0 = 2;
            }
        } else
        {
            byte0 = 3;
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
        }
        p_35306_1_.func_691_b(p_35306_2_, p_35306_3_, p_35306_4_, byte0);
    }

    public int func_211_a(IBlockAccess p_211_1_, int p_211_2_, int p_211_3_, int p_211_4_, int p_211_5_)
    {
        if(p_211_5_ == 1)
        {
            return field_378_bb - 1;
        }
        if(p_211_5_ == 0)
        {
            return field_378_bb - 1;
        }
        int i = p_211_1_.func_600_a(p_211_2_, p_211_3_, p_211_4_ - 1);
        int j = p_211_1_.func_600_a(p_211_2_, p_211_3_, p_211_4_ + 1);
        int k = p_211_1_.func_600_a(p_211_2_ - 1, p_211_3_, p_211_4_);
        int l = p_211_1_.func_600_a(p_211_2_ + 1, p_211_3_, p_211_4_);
        if(i == field_376_bc || j == field_376_bc)
        {
            if(p_211_5_ == 2 || p_211_5_ == 3)
            {
                return field_378_bb;
            }
            int i1 = 0;
            if(i == field_376_bc)
            {
                i1 = -1;
            }
            int k1 = p_211_1_.func_600_a(p_211_2_ - 1, p_211_3_, i != field_376_bc ? p_211_4_ + 1 : p_211_4_ - 1);
            int i2 = p_211_1_.func_600_a(p_211_2_ + 1, p_211_3_, i != field_376_bc ? p_211_4_ + 1 : p_211_4_ - 1);
            if(p_211_5_ == 4)
            {
                i1 = -1 - i1;
            }
            byte byte1 = 5;
            if((Block.field_343_p[k] || Block.field_343_p[k1]) && !Block.field_343_p[l] && !Block.field_343_p[i2])
            {
                byte1 = 5;
            }
            if((Block.field_343_p[l] || Block.field_343_p[i2]) && !Block.field_343_p[k] && !Block.field_343_p[k1])
            {
                byte1 = 4;
            }
            return (p_211_5_ != byte1 ? field_378_bb + 32 : field_378_bb + 16) + i1;
        }
        if(k == field_376_bc || l == field_376_bc)
        {
            if(p_211_5_ == 4 || p_211_5_ == 5)
            {
                return field_378_bb;
            }
            int j1 = 0;
            if(k == field_376_bc)
            {
                j1 = -1;
            }
            int l1 = p_211_1_.func_600_a(k != field_376_bc ? p_211_2_ + 1 : p_211_2_ - 1, p_211_3_, p_211_4_ - 1);
            int j2 = p_211_1_.func_600_a(k != field_376_bc ? p_211_2_ + 1 : p_211_2_ - 1, p_211_3_, p_211_4_ + 1);
            if(p_211_5_ == 3)
            {
                j1 = -1 - j1;
            }
            byte byte2 = 3;
            if((Block.field_343_p[i] || Block.field_343_p[l1]) && !Block.field_343_p[j] && !Block.field_343_p[j2])
            {
                byte2 = 3;
            }
            if((Block.field_343_p[j] || Block.field_343_p[j2]) && !Block.field_343_p[i] && !Block.field_343_p[l1])
            {
                byte2 = 2;
            }
            return (p_211_5_ != byte2 ? field_378_bb + 32 : field_378_bb + 16) + j1;
        }
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
        return p_211_5_ != byte0 ? field_378_bb : field_378_bb + 1;
    }

    public int func_218_a(int p_218_1_)
    {
        if(p_218_1_ == 1)
        {
            return field_378_bb - 1;
        }
        if(p_218_1_ == 0)
        {
            return field_378_bb - 1;
        }
        if(p_218_1_ == 3)
        {
            return field_378_bb + 1;
        } else
        {
            return field_378_bb;
        }
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        int i = 0;
        if(p_243_1_.func_600_a(p_243_2_ - 1, p_243_3_, p_243_4_) == field_376_bc)
        {
            i++;
        }
        if(p_243_1_.func_600_a(p_243_2_ + 1, p_243_3_, p_243_4_) == field_376_bc)
        {
            i++;
        }
        if(p_243_1_.func_600_a(p_243_2_, p_243_3_, p_243_4_ - 1) == field_376_bc)
        {
            i++;
        }
        if(p_243_1_.func_600_a(p_243_2_, p_243_3_, p_243_4_ + 1) == field_376_bc)
        {
            i++;
        }
        if(i > 1)
        {
            return false;
        }
        if(func_286_h(p_243_1_, p_243_2_ - 1, p_243_3_, p_243_4_))
        {
            return false;
        }
        if(func_286_h(p_243_1_, p_243_2_ + 1, p_243_3_, p_243_4_))
        {
            return false;
        }
        if(func_286_h(p_243_1_, p_243_2_, p_243_3_, p_243_4_ - 1))
        {
            return false;
        }
        return !func_286_h(p_243_1_, p_243_2_, p_243_3_, p_243_4_ + 1);
    }

    private boolean func_286_h(World p_286_1_, int p_286_2_, int p_286_3_, int p_286_4_)
    {
        if(p_286_1_.func_600_a(p_286_2_, p_286_3_, p_286_4_) != field_376_bc)
        {
            return false;
        }
        if(p_286_1_.func_600_a(p_286_2_ - 1, p_286_3_, p_286_4_) == field_376_bc)
        {
            return true;
        }
        if(p_286_1_.func_600_a(p_286_2_ + 1, p_286_3_, p_286_4_) == field_376_bc)
        {
            return true;
        }
        if(p_286_1_.func_600_a(p_286_2_, p_286_3_, p_286_4_ - 1) == field_376_bc)
        {
            return true;
        }
        return p_286_1_.func_600_a(p_286_2_, p_286_3_, p_286_4_ + 1) == field_376_bc;
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        super.func_226_a(p_226_1_, p_226_2_, p_226_3_, p_226_4_, p_226_5_);
        TileEntityChest tileentitychest = (TileEntityChest)p_226_1_.func_603_b(p_226_2_, p_226_3_, p_226_4_);
        if(tileentitychest != null)
        {
            tileentitychest.func_35144_b();
        }
    }

    public void func_214_b(World p_214_1_, int p_214_2_, int p_214_3_, int p_214_4_)
    {
        TileEntityChest tileentitychest = (TileEntityChest)p_214_1_.func_603_b(p_214_2_, p_214_3_, p_214_4_);
        if(tileentitychest != null)
        {
            for(int i = 0; i < tileentitychest.func_469_c(); i++)
            {
                ItemStack itemstack = tileentitychest.func_468_c(i);
                if(itemstack == null)
                {
                    continue;
                }
                float f = field_457_a.nextFloat() * 0.8F + 0.1F;
                float f1 = field_457_a.nextFloat() * 0.8F + 0.1F;
                float f2 = field_457_a.nextFloat() * 0.8F + 0.1F;
                while(itemstack.field_1615_a > 0) 
                {
                    int j = field_457_a.nextInt(21) + 10;
                    if(j > itemstack.field_1615_a)
                    {
                        j = itemstack.field_1615_a;
                    }
                    itemstack.field_1615_a -= j;
                    EntityItem entityitem = new EntityItem(p_214_1_, (float)p_214_2_ + f, (float)p_214_3_ + f1, (float)p_214_4_ + f2, new ItemStack(itemstack.field_1617_c, j, itemstack.func_21181_i()));
                    float f3 = 0.05F;
                    entityitem.field_608_an = (float)field_457_a.nextGaussian() * f3;
                    entityitem.field_607_ao = (float)field_457_a.nextGaussian() * f3 + 0.2F;
                    entityitem.field_606_ap = (float)field_457_a.nextGaussian() * f3;
                    if(itemstack.func_40710_n())
                    {
                        entityitem.field_801_a.func_40706_d((NBTTagCompound)itemstack.func_40709_o().func_40195_b());
                    }
                    p_214_1_.func_674_a(entityitem);
                }
            }

        }
        super.func_214_b(p_214_1_, p_214_2_, p_214_3_, p_214_4_);
    }

    public boolean func_250_a(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_, EntityPlayer p_250_5_)
    {
        Object obj = (TileEntityChest)p_250_1_.func_603_b(p_250_2_, p_250_3_, p_250_4_);
        if(obj == null)
        {
            return true;
        }
        if(p_250_1_.func_28100_h(p_250_2_, p_250_3_ + 1, p_250_4_))
        {
            return true;
        }
        if(func_50075_j(p_250_1_, p_250_2_, p_250_3_, p_250_4_))
        {
            return true;
        }
        if(p_250_1_.func_600_a(p_250_2_ - 1, p_250_3_, p_250_4_) == field_376_bc && (p_250_1_.func_28100_h(p_250_2_ - 1, p_250_3_ + 1, p_250_4_) || func_50075_j(p_250_1_, p_250_2_ - 1, p_250_3_, p_250_4_)))
        {
            return true;
        }
        if(p_250_1_.func_600_a(p_250_2_ + 1, p_250_3_, p_250_4_) == field_376_bc && (p_250_1_.func_28100_h(p_250_2_ + 1, p_250_3_ + 1, p_250_4_) || func_50075_j(p_250_1_, p_250_2_ + 1, p_250_3_, p_250_4_)))
        {
            return true;
        }
        if(p_250_1_.func_600_a(p_250_2_, p_250_3_, p_250_4_ - 1) == field_376_bc && (p_250_1_.func_28100_h(p_250_2_, p_250_3_ + 1, p_250_4_ - 1) || func_50075_j(p_250_1_, p_250_2_, p_250_3_, p_250_4_ - 1)))
        {
            return true;
        }
        if(p_250_1_.func_600_a(p_250_2_, p_250_3_, p_250_4_ + 1) == field_376_bc && (p_250_1_.func_28100_h(p_250_2_, p_250_3_ + 1, p_250_4_ + 1) || func_50075_j(p_250_1_, p_250_2_, p_250_3_, p_250_4_ + 1)))
        {
            return true;
        }
        if(p_250_1_.func_600_a(p_250_2_ - 1, p_250_3_, p_250_4_) == field_376_bc)
        {
            obj = new InventoryLargeChest("Large chest", (TileEntityChest)p_250_1_.func_603_b(p_250_2_ - 1, p_250_3_, p_250_4_), ((IInventory) (obj)));
        }
        if(p_250_1_.func_600_a(p_250_2_ + 1, p_250_3_, p_250_4_) == field_376_bc)
        {
            obj = new InventoryLargeChest("Large chest", ((IInventory) (obj)), (TileEntityChest)p_250_1_.func_603_b(p_250_2_ + 1, p_250_3_, p_250_4_));
        }
        if(p_250_1_.func_600_a(p_250_2_, p_250_3_, p_250_4_ - 1) == field_376_bc)
        {
            obj = new InventoryLargeChest("Large chest", (TileEntityChest)p_250_1_.func_603_b(p_250_2_, p_250_3_, p_250_4_ - 1), ((IInventory) (obj)));
        }
        if(p_250_1_.func_600_a(p_250_2_, p_250_3_, p_250_4_ + 1) == field_376_bc)
        {
            obj = new InventoryLargeChest("Large chest", ((IInventory) (obj)), (TileEntityChest)p_250_1_.func_603_b(p_250_2_, p_250_3_, p_250_4_ + 1));
        }
        if(p_250_1_.field_1026_y)
        {
            return true;
        } else
        {
            p_250_5_.func_452_a(((IInventory) (obj)));
            return true;
        }
    }

    public TileEntity func_283_a_()
    {
        return new TileEntityChest();
    }

    private static boolean func_50075_j(World p_50075_0_, int p_50075_1_, int p_50075_2_, int p_50075_3_)
    {
        for(Iterator iterator = p_50075_0_.func_657_a(net.minecraft.src.EntityOcelot.class, AxisAlignedBB.func_1161_b(p_50075_1_, p_50075_2_ + 1, p_50075_3_, p_50075_1_ + 1, p_50075_2_ + 2, p_50075_3_ + 1)).iterator(); iterator.hasNext();)
        {
            Entity entity = (Entity)iterator.next();
            EntityOcelot entityocelot = (EntityOcelot)entity;
            if(entityocelot.func_48141_af())
            {
                return true;
            }
        }

        return false;
    }
}
