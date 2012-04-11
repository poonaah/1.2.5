// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, World, TileEntityRecordPlayer, 
//            EntityItem, ItemStack, EntityPlayer, TileEntity

public class BlockJukeBox extends BlockContainer
{

    protected BlockJukeBox(int p_i682_1_, int p_i682_2_)
    {
        super(p_i682_1_, p_i682_2_, Material.field_1335_c);
    }

    public int func_218_a(int p_218_1_)
    {
        return field_378_bb + (p_218_1_ != 1 ? 0 : 1);
    }

    public boolean func_250_a(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_, EntityPlayer p_250_5_)
    {
        if(p_250_1_.func_602_e(p_250_2_, p_250_3_, p_250_4_) == 0)
        {
            return false;
        } else
        {
            func_28038_b_(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
            return true;
        }
    }

    public void func_317_e(World p_317_1_, int p_317_2_, int p_317_3_, int p_317_4_, int p_317_5_)
    {
        if(p_317_1_.field_1026_y)
        {
            return;
        }
        TileEntityRecordPlayer tileentityrecordplayer = (TileEntityRecordPlayer)p_317_1_.func_603_b(p_317_2_, p_317_3_, p_317_4_);
        if(tileentityrecordplayer == null)
        {
            return;
        } else
        {
            tileentityrecordplayer.field_28017_a = p_317_5_;
            tileentityrecordplayer.func_474_j_();
            p_317_1_.func_691_b(p_317_2_, p_317_3_, p_317_4_, 1);
            return;
        }
    }

    public void func_28038_b_(World p_28038_1_, int p_28038_2_, int p_28038_3_, int p_28038_4_)
    {
        if(p_28038_1_.field_1026_y)
        {
            return;
        }
        TileEntityRecordPlayer tileentityrecordplayer = (TileEntityRecordPlayer)p_28038_1_.func_603_b(p_28038_2_, p_28038_3_, p_28038_4_);
        if(tileentityrecordplayer == null)
        {
            return;
        }
        int i = tileentityrecordplayer.field_28017_a;
        if(i == 0)
        {
            return;
        } else
        {
            p_28038_1_.func_28106_e(1005, p_28038_2_, p_28038_3_, p_28038_4_, 0);
            p_28038_1_.func_670_a(null, p_28038_2_, p_28038_3_, p_28038_4_);
            tileentityrecordplayer.field_28017_a = 0;
            tileentityrecordplayer.func_474_j_();
            p_28038_1_.func_691_b(p_28038_2_, p_28038_3_, p_28038_4_, 0);
            int j = i;
            float f = 0.7F;
            double d = (double)(p_28038_1_.field_1037_n.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
            double d1 = (double)(p_28038_1_.field_1037_n.nextFloat() * f) + (double)(1.0F - f) * 0.20000000000000001D + 0.59999999999999998D;
            double d2 = (double)(p_28038_1_.field_1037_n.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
            EntityItem entityitem = new EntityItem(p_28038_1_, (double)p_28038_2_ + d, (double)p_28038_3_ + d1, (double)p_28038_4_ + d2, new ItemStack(j, 1, 0));
            entityitem.field_805_c = 10;
            p_28038_1_.func_674_a(entityitem);
            return;
        }
    }

    public void func_214_b(World p_214_1_, int p_214_2_, int p_214_3_, int p_214_4_)
    {
        func_28038_b_(p_214_1_, p_214_2_, p_214_3_, p_214_4_);
        super.func_214_b(p_214_1_, p_214_2_, p_214_3_, p_214_4_);
    }

    public void func_216_a(World p_216_1_, int p_216_2_, int p_216_3_, int p_216_4_, int p_216_5_, float p_216_6_, int p_216_7_)
    {
        if(p_216_1_.field_1026_y)
        {
            return;
        } else
        {
            super.func_216_a(p_216_1_, p_216_2_, p_216_3_, p_216_4_, p_216_5_, p_216_6_, 0);
            return;
        }
    }

    public TileEntity func_283_a_()
    {
        return new TileEntityRecordPlayer();
    }
}
