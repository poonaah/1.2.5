// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockBreakable, Material, IBlockAccess, World, 
//            Block, BlockFire, Entity, AxisAlignedBB

public class BlockPortal extends BlockBreakable
{

    public BlockPortal(int p_i203_1_, int p_i203_2_)
    {
        super(p_i203_1_, p_i203_2_, Material.field_4260_x, false);
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int i)
    {
        return null;
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        if(p_238_1_.func_600_a(p_238_2_ - 1, p_238_3_, p_238_4_) == field_376_bc || p_238_1_.func_600_a(p_238_2_ + 1, p_238_3_, p_238_4_) == field_376_bc)
        {
            float f = 0.5F;
            float f2 = 0.125F;
            func_213_a(0.5F - f, 0.0F, 0.5F - f2, 0.5F + f, 1.0F, 0.5F + f2);
        } else
        {
            float f1 = 0.125F;
            float f3 = 0.5F;
            func_213_a(0.5F - f1, 0.0F, 0.5F - f3, 0.5F + f1, 1.0F, 0.5F + f3);
        }
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public boolean func_4032_a_(World p_4032_1_, int p_4032_2_, int p_4032_3_, int p_4032_4_)
    {
        int i = 0;
        int j = 0;
        if(p_4032_1_.func_600_a(p_4032_2_ - 1, p_4032_3_, p_4032_4_) == Block.field_405_aq.field_376_bc || p_4032_1_.func_600_a(p_4032_2_ + 1, p_4032_3_, p_4032_4_) == Block.field_405_aq.field_376_bc)
        {
            i = 1;
        }
        if(p_4032_1_.func_600_a(p_4032_2_, p_4032_3_, p_4032_4_ - 1) == Block.field_405_aq.field_376_bc || p_4032_1_.func_600_a(p_4032_2_, p_4032_3_, p_4032_4_ + 1) == Block.field_405_aq.field_376_bc)
        {
            j = 1;
        }
        if(i == j)
        {
            return false;
        }
        if(p_4032_1_.func_600_a(p_4032_2_ - i, p_4032_3_, p_4032_4_ - j) == 0)
        {
            p_4032_2_ -= i;
            p_4032_4_ -= j;
        }
        for(int k = -1; k <= 2; k++)
        {
            for(int i1 = -1; i1 <= 3; i1++)
            {
                boolean flag = k == -1 || k == 2 || i1 == -1 || i1 == 3;
                if((k == -1 || k == 2) && (i1 == -1 || i1 == 3))
                {
                    continue;
                }
                int k1 = p_4032_1_.func_600_a(p_4032_2_ + i * k, p_4032_3_ + i1, p_4032_4_ + j * k);
                if(flag)
                {
                    if(k1 != Block.field_405_aq.field_376_bc)
                    {
                        return false;
                    }
                    continue;
                }
                if(k1 != 0 && k1 != Block.field_402_as.field_376_bc)
                {
                    return false;
                }
            }

        }

        p_4032_1_.field_1043_h = true;
        for(int l = 0; l < 2; l++)
        {
            for(int j1 = 0; j1 < 3; j1++)
            {
                p_4032_1_.func_690_d(p_4032_2_ + i * l, p_4032_3_ + j1, p_4032_4_ + j * l, Block.field_4047_bf.field_376_bc);
            }

        }

        p_4032_1_.field_1043_h = false;
        return true;
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        int i = 0;
        int j = 1;
        if(p_226_1_.func_600_a(p_226_2_ - 1, p_226_3_, p_226_4_) == field_376_bc || p_226_1_.func_600_a(p_226_2_ + 1, p_226_3_, p_226_4_) == field_376_bc)
        {
            i = 1;
            j = 0;
        }
        int k;
        for(k = p_226_3_; p_226_1_.func_600_a(p_226_2_, k - 1, p_226_4_) == field_376_bc; k--) { }
        if(p_226_1_.func_600_a(p_226_2_, k - 1, p_226_4_) != Block.field_405_aq.field_376_bc)
        {
            p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
            return;
        }
        int l;
        for(l = 1; l < 4 && p_226_1_.func_600_a(p_226_2_, k + l, p_226_4_) == field_376_bc; l++) { }
        if(l != 3 || p_226_1_.func_600_a(p_226_2_, k + l, p_226_4_) != Block.field_405_aq.field_376_bc)
        {
            p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
            return;
        }
        boolean flag = p_226_1_.func_600_a(p_226_2_ - 1, p_226_3_, p_226_4_) == field_376_bc || p_226_1_.func_600_a(p_226_2_ + 1, p_226_3_, p_226_4_) == field_376_bc;
        boolean flag1 = p_226_1_.func_600_a(p_226_2_, p_226_3_, p_226_4_ - 1) == field_376_bc || p_226_1_.func_600_a(p_226_2_, p_226_3_, p_226_4_ + 1) == field_376_bc;
        if(flag && flag1)
        {
            p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
            return;
        }
        if((p_226_1_.func_600_a(p_226_2_ + i, p_226_3_, p_226_4_ + j) != Block.field_405_aq.field_376_bc || p_226_1_.func_600_a(p_226_2_ - i, p_226_3_, p_226_4_ - j) != field_376_bc) && (p_226_1_.func_600_a(p_226_2_ - i, p_226_3_, p_226_4_ - j) != Block.field_405_aq.field_376_bc || p_226_1_.func_600_a(p_226_2_ + i, p_226_3_, p_226_4_ + j) != field_376_bc))
        {
            p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
            return;
        } else
        {
            return;
        }
    }

    public boolean func_260_c(IBlockAccess p_260_1_, int p_260_2_, int p_260_3_, int p_260_4_, int p_260_5_)
    {
        if(p_260_1_.func_600_a(p_260_2_, p_260_3_, p_260_4_) == field_376_bc)
        {
            return false;
        }
        boolean flag = p_260_1_.func_600_a(p_260_2_ - 1, p_260_3_, p_260_4_) == field_376_bc && p_260_1_.func_600_a(p_260_2_ - 2, p_260_3_, p_260_4_) != field_376_bc;
        boolean flag1 = p_260_1_.func_600_a(p_260_2_ + 1, p_260_3_, p_260_4_) == field_376_bc && p_260_1_.func_600_a(p_260_2_ + 2, p_260_3_, p_260_4_) != field_376_bc;
        boolean flag2 = p_260_1_.func_600_a(p_260_2_, p_260_3_, p_260_4_ - 1) == field_376_bc && p_260_1_.func_600_a(p_260_2_, p_260_3_, p_260_4_ - 2) != field_376_bc;
        boolean flag3 = p_260_1_.func_600_a(p_260_2_, p_260_3_, p_260_4_ + 1) == field_376_bc && p_260_1_.func_600_a(p_260_2_, p_260_3_, p_260_4_ + 2) != field_376_bc;
        boolean flag4 = flag || flag1;
        boolean flag5 = flag2 || flag3;
        if(flag4 && p_260_5_ == 4)
        {
            return true;
        }
        if(flag4 && p_260_5_ == 5)
        {
            return true;
        }
        if(flag5 && p_260_5_ == 2)
        {
            return true;
        }
        return flag5 && p_260_5_ == 3;
    }

    public int func_229_a(Random p_229_1_)
    {
        return 0;
    }

    public int func_234_g()
    {
        return 1;
    }

    public void func_236_b(World p_236_1_, int p_236_2_, int p_236_3_, int p_236_4_, Entity p_236_5_)
    {
        if(p_236_5_.field_616_af == null && p_236_5_.field_617_ae == null)
        {
            p_236_5_.func_4039_q();
        }
    }

    public void func_247_b(World p_247_1_, int p_247_2_, int p_247_3_, int p_247_4_, Random p_247_5_)
    {
        if(p_247_5_.nextInt(100) == 0)
        {
            p_247_1_.func_684_a((double)p_247_2_ + 0.5D, (double)p_247_3_ + 0.5D, (double)p_247_4_ + 0.5D, "portal.portal", 0.5F, p_247_5_.nextFloat() * 0.4F + 0.8F);
        }
        for(int i = 0; i < 4; i++)
        {
            double d = (float)p_247_2_ + p_247_5_.nextFloat();
            double d1 = (float)p_247_3_ + p_247_5_.nextFloat();
            double d2 = (float)p_247_4_ + p_247_5_.nextFloat();
            double d3 = 0.0D;
            double d4 = 0.0D;
            double d5 = 0.0D;
            int j = p_247_5_.nextInt(2) * 2 - 1;
            d3 = ((double)p_247_5_.nextFloat() - 0.5D) * 0.5D;
            d4 = ((double)p_247_5_.nextFloat() - 0.5D) * 0.5D;
            d5 = ((double)p_247_5_.nextFloat() - 0.5D) * 0.5D;
            if(p_247_1_.func_600_a(p_247_2_ - 1, p_247_3_, p_247_4_) == field_376_bc || p_247_1_.func_600_a(p_247_2_ + 1, p_247_3_, p_247_4_) == field_376_bc)
            {
                d2 = (double)p_247_4_ + 0.5D + 0.25D * (double)j;
                d5 = p_247_5_.nextFloat() * 2.0F * (float)j;
            } else
            {
                d = (double)p_247_2_ + 0.5D + 0.25D * (double)j;
                d3 = p_247_5_.nextFloat() * 2.0F * (float)j;
            }
            p_247_1_.func_694_a("portal", d, d1, d2, d3, d4, d5);
        }

    }
}
