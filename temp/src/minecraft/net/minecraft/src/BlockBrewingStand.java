// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, TileEntityBrewingStand, World, 
//            EntityPlayer, ItemStack, EntityItem, Item, 
//            TileEntity, AxisAlignedBB

public class BlockBrewingStand extends BlockContainer
{

    private Random field_40214_a;

    public BlockBrewingStand(int p_i673_1_)
    {
        super(p_i673_1_, Material.field_1333_e);
        field_40214_a = new Random();
        field_378_bb = 157;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public int func_210_f()
    {
        return 25;
    }

    public TileEntity func_283_a_()
    {
        return new TileEntityBrewingStand();
    }

    public boolean func_242_c()
    {
        return false;
    }

    public void func_230_a(World p_230_1_, int p_230_2_, int p_230_3_, int p_230_4_, AxisAlignedBB p_230_5_, ArrayList p_230_6_)
    {
        func_213_a(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
        super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
        func_237_e();
        super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
    }

    public void func_237_e()
    {
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    }

    public boolean func_250_a(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_, EntityPlayer p_250_5_)
    {
        if(p_250_1_.field_1026_y)
        {
            return true;
        }
        TileEntityBrewingStand tileentitybrewingstand = (TileEntityBrewingStand)p_250_1_.func_603_b(p_250_2_, p_250_3_, p_250_4_);
        if(tileentitybrewingstand != null)
        {
            p_250_5_.func_40180_a(tileentitybrewingstand);
        }
        return true;
    }

    public void func_247_b(World p_247_1_, int p_247_2_, int p_247_3_, int p_247_4_, Random p_247_5_)
    {
        double d = (float)p_247_2_ + 0.4F + p_247_5_.nextFloat() * 0.2F;
        double d1 = (float)p_247_3_ + 0.7F + p_247_5_.nextFloat() * 0.3F;
        double d2 = (float)p_247_4_ + 0.4F + p_247_5_.nextFloat() * 0.2F;
        p_247_1_.func_694_a("smoke", d, d1, d2, 0.0D, 0.0D, 0.0D);
    }

    public void func_214_b(World p_214_1_, int p_214_2_, int p_214_3_, int p_214_4_)
    {
        TileEntity tileentity = p_214_1_.func_603_b(p_214_2_, p_214_3_, p_214_4_);
        if(tileentity != null && (tileentity instanceof TileEntityBrewingStand))
        {
            TileEntityBrewingStand tileentitybrewingstand = (TileEntityBrewingStand)tileentity;
label0:
            for(int i = 0; i < tileentitybrewingstand.func_469_c(); i++)
            {
                ItemStack itemstack = tileentitybrewingstand.func_468_c(i);
                if(itemstack == null)
                {
                    continue;
                }
                float f = field_40214_a.nextFloat() * 0.8F + 0.1F;
                float f1 = field_40214_a.nextFloat() * 0.8F + 0.1F;
                float f2 = field_40214_a.nextFloat() * 0.8F + 0.1F;
                do
                {
                    if(itemstack.field_1615_a <= 0)
                    {
                        continue label0;
                    }
                    int j = field_40214_a.nextInt(21) + 10;
                    if(j > itemstack.field_1615_a)
                    {
                        j = itemstack.field_1615_a;
                    }
                    itemstack.field_1615_a -= j;
                    EntityItem entityitem = new EntityItem(p_214_1_, (float)p_214_2_ + f, (float)p_214_3_ + f1, (float)p_214_4_ + f2, new ItemStack(itemstack.field_1617_c, j, itemstack.func_21181_i()));
                    float f3 = 0.05F;
                    entityitem.field_608_an = (float)field_40214_a.nextGaussian() * f3;
                    entityitem.field_607_ao = (float)field_40214_a.nextGaussian() * f3 + 0.2F;
                    entityitem.field_606_ap = (float)field_40214_a.nextGaussian() * f3;
                    p_214_1_.func_674_a(entityitem);
                } while(true);
            }

        }
        super.func_214_b(p_214_1_, p_214_2_, p_214_3_, p_214_4_);
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Item.field_40411_by.field_291_aS;
    }
}
