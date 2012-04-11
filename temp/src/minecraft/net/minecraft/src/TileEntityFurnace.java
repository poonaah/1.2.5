// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            TileEntity, IInventory, ItemStack, NBTTagCompound, 
//            NBTTagList, World, Item, BlockFurnace, 
//            FurnaceRecipes, Block, Material, ModLoader, 
//            EntityPlayer

public class TileEntityFurnace extends TileEntity
    implements IInventory
{

    private ItemStack field_833_a[];
    public int field_832_b;
    public int field_835_c;
    public int field_834_d;

    public TileEntityFurnace()
    {
        field_833_a = new ItemStack[3];
        field_832_b = 0;
        field_835_c = 0;
        field_834_d = 0;
    }

    public int func_469_c()
    {
        return field_833_a.length;
    }

    public ItemStack func_468_c(int p_468_1_)
    {
        return field_833_a[p_468_1_];
    }

    public ItemStack func_473_a(int p_473_1_, int p_473_2_)
    {
        if(field_833_a[p_473_1_] != null)
        {
            if(field_833_a[p_473_1_].field_1615_a <= p_473_2_)
            {
                ItemStack itemstack = field_833_a[p_473_1_];
                field_833_a[p_473_1_] = null;
                return itemstack;
            }
            ItemStack itemstack1 = field_833_a[p_473_1_].func_1085_a(p_473_2_);
            if(field_833_a[p_473_1_].field_1615_a == 0)
            {
                field_833_a[p_473_1_] = null;
            }
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public ItemStack func_48081_b(int p_48081_1_)
    {
        if(field_833_a[p_48081_1_] != null)
        {
            ItemStack itemstack = field_833_a[p_48081_1_];
            field_833_a[p_48081_1_] = null;
            return itemstack;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int p_472_1_, ItemStack p_472_2_)
    {
        field_833_a[p_472_1_] = p_472_2_;
        if(p_472_2_ != null && p_472_2_.field_1615_a > func_470_e())
        {
            p_472_2_.field_1615_a = func_470_e();
        }
    }

    public String func_471_d()
    {
        return "container.furnace";
    }

    public void func_482_a(NBTTagCompound p_482_1_)
    {
        super.func_482_a(p_482_1_);
        NBTTagList nbttaglist = p_482_1_.func_753_l("Items");
        field_833_a = new ItemStack[func_469_c()];
        for(int i = 0; i < nbttaglist.func_740_c(); i++)
        {
            NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.func_741_a(i);
            byte byte0 = nbttagcompound.func_746_c("Slot");
            if(byte0 >= 0 && byte0 < field_833_a.length)
            {
                field_833_a[byte0] = ItemStack.func_35864_a(nbttagcompound);
            }
        }

        field_832_b = p_482_1_.func_745_d("BurnTime");
        field_834_d = p_482_1_.func_745_d("CookTime");
        field_835_c = func_488_a(field_833_a[1]);
    }

    public void func_481_b(NBTTagCompound p_481_1_)
    {
        super.func_481_b(p_481_1_);
        p_481_1_.func_749_a("BurnTime", (short)field_832_b);
        p_481_1_.func_749_a("CookTime", (short)field_834_d);
        NBTTagList nbttaglist = new NBTTagList();
        for(int i = 0; i < field_833_a.length; i++)
        {
            if(field_833_a[i] != null)
            {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                nbttagcompound.func_761_a("Slot", (byte)i);
                field_833_a[i].func_1086_a(nbttagcompound);
                nbttaglist.func_742_a(nbttagcompound);
            }
        }

        p_481_1_.func_762_a("Items", nbttaglist);
    }

    public int func_470_e()
    {
        return 64;
    }

    public int func_490_a(int p_490_1_)
    {
        return (field_834_d * p_490_1_) / 200;
    }

    public int func_489_b(int p_489_1_)
    {
        if(field_835_c == 0)
        {
            field_835_c = 200;
        }
        return (field_832_b * p_489_1_) / field_835_c;
    }

    public boolean func_485_a()
    {
        return field_832_b > 0;
    }

    public void func_475_b()
    {
        boolean flag = field_832_b > 0;
        boolean flag1 = false;
        if(field_832_b > 0)
        {
            field_832_b--;
        }
        if(!field_824_e.field_1026_y)
        {
            if(field_832_b == 0 && func_491_j())
            {
                field_835_c = field_832_b = func_488_a(field_833_a[1]);
                if(field_832_b > 0)
                {
                    flag1 = true;
                    if(field_833_a[1] != null)
                    {
                        if(field_833_a[1].func_1091_a().func_46056_k())
                        {
                            field_833_a[1] = new ItemStack(field_833_a[1].func_1091_a().func_4016_e());
                        } else
                        {
                            field_833_a[1].field_1615_a--;
                        }
                        if(field_833_a[1].field_1615_a == 0)
                        {
                            field_833_a[1] = null;
                        }
                    }
                }
            }
            if(func_485_a() && func_491_j())
            {
                field_834_d++;
                if(field_834_d == 200)
                {
                    field_834_d = 0;
                    func_487_i();
                    flag1 = true;
                }
            } else
            {
                field_834_d = 0;
            }
            if(flag != (field_832_b > 0))
            {
                flag1 = true;
                BlockFurnace.func_285_a(field_832_b > 0, field_824_e, field_823_f, field_822_g, field_821_h);
            }
        }
        if(flag1)
        {
            func_474_j_();
        }
    }

    private boolean func_491_j()
    {
        if(field_833_a[0] == null)
        {
            return false;
        }
        ItemStack itemstack = FurnaceRecipes.func_21200_a().func_21198_a(field_833_a[0].func_1091_a().field_291_aS);
        if(itemstack == null)
        {
            return false;
        }
        if(field_833_a[2] == null)
        {
            return true;
        }
        if(!field_833_a[2].func_21184_a(itemstack))
        {
            return false;
        }
        if(field_833_a[2].field_1615_a < func_470_e() && field_833_a[2].field_1615_a < field_833_a[2].func_1089_c())
        {
            return true;
        }
        return field_833_a[2].field_1615_a < itemstack.func_1089_c();
    }

    public void func_487_i()
    {
        if(!func_491_j())
        {
            return;
        }
        ItemStack itemstack = FurnaceRecipes.func_21200_a().func_21198_a(field_833_a[0].func_1091_a().field_291_aS);
        if(field_833_a[2] == null)
        {
            field_833_a[2] = itemstack.func_1102_e();
        } else
        if(field_833_a[2].field_1617_c == itemstack.field_1617_c)
        {
            field_833_a[2].field_1615_a += itemstack.field_1615_a;
        }
        if(field_833_a[0].func_1091_a().func_46056_k())
        {
            field_833_a[0] = new ItemStack(field_833_a[0].func_1091_a().func_4016_e());
        } else
        {
            field_833_a[0].field_1615_a--;
        }
        if(field_833_a[0].field_1615_a <= 0)
        {
            field_833_a[0] = null;
        }
    }

    public static int func_488_a(ItemStack p_488_1_)
    {
        if(p_488_1_ == null)
        {
            return 0;
        }
        int i = p_488_1_.func_1091_a().field_291_aS;
        if(i < 256 && Block.field_345_n[i].field_356_bn == Material.field_1335_c)
        {
            return 300;
        }
        if(i == Item.field_266_B.field_291_aS)
        {
            return 100;
        }
        if(i == Item.field_225_k.field_291_aS)
        {
            return 1600;
        }
        if(i == Item.field_258_aw.field_291_aS)
        {
            return 20000;
        }
        if(i == Block.field_333_z.field_376_bc)
        {
            return 100;
        }
        if(i == Item.field_40417_bo.field_291_aS)
        {
            return 2400;
        } else
        {
            return ModLoader.addAllFuel(p_488_1_.field_1617_c, p_488_1_.func_21181_i());
        }
    }

    public static boolean func_52005_b(ItemStack p_52005_0_)
    {
        return func_488_a(p_52005_0_) > 0;
    }

    public boolean func_20070_a_(EntityPlayer p_20070_1_)
    {
        if(field_824_e.func_603_b(field_823_f, field_822_g, field_821_h) != this)
        {
            return false;
        }
        return p_20070_1_.func_360_d((double)field_823_f + 0.5D, (double)field_822_g + 0.5D, (double)field_821_h + 0.5D) <= 64D;
    }

    public void func_35142_x_()
    {
    }

    public void func_35141_y_()
    {
    }
}
