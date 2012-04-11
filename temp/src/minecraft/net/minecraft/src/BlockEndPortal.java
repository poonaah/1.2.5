// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, TileEntityEndPortal, Entity, EntityPlayer, 
//            World, WorldProvider, Material, TileEntity, 
//            IBlockAccess, AxisAlignedBB

public class BlockEndPortal extends BlockContainer
{

    public static boolean field_41051_a = false;

    protected BlockEndPortal(int p_i603_1_, Material p_i603_2_)
    {
        super(p_i603_1_, 0, p_i603_2_);
        func_215_a(1.0F);
    }

    public TileEntity func_283_a_()
    {
        return new TileEntityEndPortal();
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        float f = 0.0625F;
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
    }

    public boolean func_260_c(IBlockAccess p_260_1_, int p_260_2_, int p_260_3_, int p_260_4_, int p_260_5_)
    {
        if(p_260_5_ != 0)
        {
            return false;
        } else
        {
            return super.func_260_c(p_260_1_, p_260_2_, p_260_3_, p_260_4_, p_260_5_);
        }
    }

    public void func_230_a(World world, int i, int j, int k, AxisAlignedBB axisalignedbb, ArrayList arraylist)
    {
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_229_a(Random p_229_1_)
    {
        return 0;
    }

    public void func_236_b(World p_236_1_, int p_236_2_, int p_236_3_, int p_236_4_, Entity p_236_5_)
    {
        if(p_236_5_.field_616_af == null && p_236_5_.field_617_ae == null && (p_236_5_ instanceof EntityPlayer) && !p_236_1_.field_1026_y)
        {
            ((EntityPlayer)p_236_5_).func_40182_b(1);
        }
    }

    public void func_247_b(World p_247_1_, int p_247_2_, int p_247_3_, int p_247_4_, Random p_247_5_)
    {
        double d = (float)p_247_2_ + p_247_5_.nextFloat();
        double d1 = (float)p_247_3_ + 0.8F;
        double d2 = (float)p_247_4_ + p_247_5_.nextFloat();
        double d3 = 0.0D;
        double d4 = 0.0D;
        double d5 = 0.0D;
        p_247_1_.func_694_a("smoke", d, d1, d2, d3, d4, d5);
    }

    public int func_210_f()
    {
        return -1;
    }

    public void func_235_e(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_)
    {
        if(field_41051_a)
        {
            return;
        }
        if(p_235_1_.field_4209_q.field_4218_e != 0)
        {
            p_235_1_.func_690_d(p_235_2_, p_235_3_, p_235_4_, 0);
            return;
        } else
        {
            return;
        }
    }

}
