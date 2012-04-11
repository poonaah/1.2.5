// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockFluid, World, Material, WorldProvider, 
//            Block, IBlockAccess

public class BlockFlowing extends BlockFluid
{

    int field_460_a;
    boolean field_459_b[];
    int field_461_c[];

    protected BlockFlowing(int p_i419_1_, Material p_i419_2_)
    {
        super(p_i419_1_, p_i419_2_);
        field_460_a = 0;
        field_459_b = new boolean[4];
        field_461_c = new int[4];
    }

    private void func_30003_j(World p_30003_1_, int p_30003_2_, int p_30003_3_, int p_30003_4_)
    {
        int i = p_30003_1_.func_602_e(p_30003_2_, p_30003_3_, p_30003_4_);
        p_30003_1_.func_643_a(p_30003_2_, p_30003_3_, p_30003_4_, field_376_bc + 1, i);
        p_30003_1_.func_701_b(p_30003_2_, p_30003_3_, p_30003_4_, p_30003_2_, p_30003_3_, p_30003_4_);
        p_30003_1_.func_665_h(p_30003_2_, p_30003_3_, p_30003_4_);
    }

    public boolean func_48204_b(IBlockAccess p_48204_1_, int p_48204_2_, int p_48204_3_, int p_48204_4_)
    {
        return field_356_bn != Material.field_1331_g;
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        int i = func_290_h(p_208_1_, p_208_2_, p_208_3_, p_208_4_);
        byte byte0 = 1;
        if(field_356_bn == Material.field_1331_g && !p_208_1_.field_4209_q.field_6479_d)
        {
            byte0 = 2;
        }
        boolean flag = true;
        if(i > 0)
        {
            int j = -100;
            field_460_a = 0;
            j = func_296_f(p_208_1_, p_208_2_ - 1, p_208_3_, p_208_4_, j);
            j = func_296_f(p_208_1_, p_208_2_ + 1, p_208_3_, p_208_4_, j);
            j = func_296_f(p_208_1_, p_208_2_, p_208_3_, p_208_4_ - 1, j);
            j = func_296_f(p_208_1_, p_208_2_, p_208_3_, p_208_4_ + 1, j);
            int k = j + byte0;
            if(k >= 8 || j < 0)
            {
                k = -1;
            }
            if(func_290_h(p_208_1_, p_208_2_, p_208_3_ + 1, p_208_4_) >= 0)
            {
                int i1 = func_290_h(p_208_1_, p_208_2_, p_208_3_ + 1, p_208_4_);
                if(i1 >= 8)
                {
                    k = i1;
                } else
                {
                    k = i1 + 8;
                }
            }
            if(field_460_a >= 2 && field_356_bn == Material.field_1332_f)
            {
                if(p_208_1_.func_599_f(p_208_2_, p_208_3_ - 1, p_208_4_).func_878_a())
                {
                    k = 0;
                } else
                if(p_208_1_.func_599_f(p_208_2_, p_208_3_ - 1, p_208_4_) == field_356_bn && p_208_1_.func_602_e(p_208_2_, p_208_3_, p_208_4_) == 0)
                {
                    k = 0;
                }
            }
            if(field_356_bn == Material.field_1331_g && i < 8 && k < 8 && k > i && p_208_5_.nextInt(4) != 0)
            {
                k = i;
                flag = false;
            }
            if(k != i)
            {
                i = k;
                if(i < 0)
                {
                    p_208_1_.func_690_d(p_208_2_, p_208_3_, p_208_4_, 0);
                } else
                {
                    p_208_1_.func_691_b(p_208_2_, p_208_3_, p_208_4_, i);
                    p_208_1_.func_22136_c(p_208_2_, p_208_3_, p_208_4_, field_376_bc, func_4025_d());
                    p_208_1_.func_611_g(p_208_2_, p_208_3_, p_208_4_, field_376_bc);
                }
            } else
            if(flag)
            {
                func_30003_j(p_208_1_, p_208_2_, p_208_3_, p_208_4_);
            }
        } else
        {
            func_30003_j(p_208_1_, p_208_2_, p_208_3_, p_208_4_);
        }
        if(func_298_m(p_208_1_, p_208_2_, p_208_3_ - 1, p_208_4_))
        {
            if(field_356_bn == Material.field_1331_g && p_208_1_.func_599_f(p_208_2_, p_208_3_ - 1, p_208_4_) == Material.field_1332_f)
            {
                p_208_1_.func_690_d(p_208_2_, p_208_3_ - 1, p_208_4_, Block.field_338_u.field_376_bc);
                func_292_i(p_208_1_, p_208_2_, p_208_3_ - 1, p_208_4_);
                return;
            }
            if(i >= 8)
            {
                p_208_1_.func_688_b(p_208_2_, p_208_3_ - 1, p_208_4_, field_376_bc, i);
            } else
            {
                p_208_1_.func_688_b(p_208_2_, p_208_3_ - 1, p_208_4_, field_376_bc, i + 8);
            }
        } else
        if(i >= 0 && (i == 0 || func_295_l(p_208_1_, p_208_2_, p_208_3_ - 1, p_208_4_)))
        {
            boolean aflag[] = func_297_k(p_208_1_, p_208_2_, p_208_3_, p_208_4_);
            int l = i + byte0;
            if(i >= 8)
            {
                l = 1;
            }
            if(l >= 8)
            {
                return;
            }
            if(aflag[0])
            {
                func_299_g(p_208_1_, p_208_2_ - 1, p_208_3_, p_208_4_, l);
            }
            if(aflag[1])
            {
                func_299_g(p_208_1_, p_208_2_ + 1, p_208_3_, p_208_4_, l);
            }
            if(aflag[2])
            {
                func_299_g(p_208_1_, p_208_2_, p_208_3_, p_208_4_ - 1, l);
            }
            if(aflag[3])
            {
                func_299_g(p_208_1_, p_208_2_, p_208_3_, p_208_4_ + 1, l);
            }
        }
    }

    private void func_299_g(World p_299_1_, int p_299_2_, int p_299_3_, int p_299_4_, int p_299_5_)
    {
        if(func_298_m(p_299_1_, p_299_2_, p_299_3_, p_299_4_))
        {
            int i = p_299_1_.func_600_a(p_299_2_, p_299_3_, p_299_4_);
            if(i > 0)
            {
                if(field_356_bn == Material.field_1331_g)
                {
                    func_292_i(p_299_1_, p_299_2_, p_299_3_, p_299_4_);
                } else
                {
                    Block.field_345_n[i].func_259_b_(p_299_1_, p_299_2_, p_299_3_, p_299_4_, p_299_1_.func_602_e(p_299_2_, p_299_3_, p_299_4_), 0);
                }
            }
            p_299_1_.func_688_b(p_299_2_, p_299_3_, p_299_4_, field_376_bc, p_299_5_);
        }
    }

    private int func_300_a(World p_300_1_, int p_300_2_, int p_300_3_, int p_300_4_, int p_300_5_, int p_300_6_)
    {
        int i = 1000;
        for(int j = 0; j < 4; j++)
        {
            if(j == 0 && p_300_6_ == 1 || j == 1 && p_300_6_ == 0 || j == 2 && p_300_6_ == 3 || j == 3 && p_300_6_ == 2)
            {
                continue;
            }
            int k = p_300_2_;
            int l = p_300_3_;
            int i1 = p_300_4_;
            if(j == 0)
            {
                k--;
            }
            if(j == 1)
            {
                k++;
            }
            if(j == 2)
            {
                i1--;
            }
            if(j == 3)
            {
                i1++;
            }
            if(func_295_l(p_300_1_, k, l, i1) || p_300_1_.func_599_f(k, l, i1) == field_356_bn && p_300_1_.func_602_e(k, l, i1) == 0)
            {
                continue;
            }
            if(!func_295_l(p_300_1_, k, l - 1, i1))
            {
                return p_300_5_;
            }
            if(p_300_5_ >= 4)
            {
                continue;
            }
            int j1 = func_300_a(p_300_1_, k, l, i1, p_300_5_ + 1, j);
            if(j1 < i)
            {
                i = j1;
            }
        }

        return i;
    }

    private boolean[] func_297_k(World p_297_1_, int p_297_2_, int p_297_3_, int p_297_4_)
    {
        for(int i = 0; i < 4; i++)
        {
            field_461_c[i] = 1000;
            int k = p_297_2_;
            int j1 = p_297_3_;
            int k1 = p_297_4_;
            if(i == 0)
            {
                k--;
            }
            if(i == 1)
            {
                k++;
            }
            if(i == 2)
            {
                k1--;
            }
            if(i == 3)
            {
                k1++;
            }
            if(func_295_l(p_297_1_, k, j1, k1) || p_297_1_.func_599_f(k, j1, k1) == field_356_bn && p_297_1_.func_602_e(k, j1, k1) == 0)
            {
                continue;
            }
            if(!func_295_l(p_297_1_, k, j1 - 1, k1))
            {
                field_461_c[i] = 0;
            } else
            {
                field_461_c[i] = func_300_a(p_297_1_, k, j1, k1, 1, i);
            }
        }

        int j = field_461_c[0];
        for(int l = 1; l < 4; l++)
        {
            if(field_461_c[l] < j)
            {
                j = field_461_c[l];
            }
        }

        for(int i1 = 0; i1 < 4; i1++)
        {
            field_459_b[i1] = field_461_c[i1] == j;
        }

        return field_459_b;
    }

    private boolean func_295_l(World p_295_1_, int p_295_2_, int p_295_3_, int p_295_4_)
    {
        int i = p_295_1_.func_600_a(p_295_2_, p_295_3_, p_295_4_);
        if(i == Block.field_442_aF.field_376_bc || i == Block.field_435_aM.field_376_bc || i == Block.field_443_aE.field_376_bc || i == Block.field_441_aG.field_376_bc || i == Block.field_423_aY.field_376_bc)
        {
            return true;
        }
        if(i == 0)
        {
            return false;
        }
        Material material = Block.field_345_n[i].field_356_bn;
        if(material == Material.field_4260_x)
        {
            return true;
        }
        return material.func_880_c();
    }

    protected int func_296_f(World p_296_1_, int p_296_2_, int p_296_3_, int p_296_4_, int p_296_5_)
    {
        int i = func_290_h(p_296_1_, p_296_2_, p_296_3_, p_296_4_);
        if(i < 0)
        {
            return p_296_5_;
        }
        if(i == 0)
        {
            field_460_a++;
        }
        if(i >= 8)
        {
            i = 0;
        }
        return p_296_5_ >= 0 && i >= p_296_5_ ? p_296_5_ : i;
    }

    private boolean func_298_m(World p_298_1_, int p_298_2_, int p_298_3_, int p_298_4_)
    {
        Material material = p_298_1_.func_599_f(p_298_2_, p_298_3_, p_298_4_);
        if(material == field_356_bn)
        {
            return false;
        }
        if(material == Material.field_1331_g)
        {
            return false;
        } else
        {
            return !func_295_l(p_298_1_, p_298_2_, p_298_3_, p_298_4_);
        }
    }

    public void func_235_e(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_)
    {
        super.func_235_e(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
        if(p_235_1_.func_600_a(p_235_2_, p_235_3_, p_235_4_) == field_376_bc)
        {
            p_235_1_.func_22136_c(p_235_2_, p_235_3_, p_235_4_, field_376_bc, func_4025_d());
        }
    }
}
