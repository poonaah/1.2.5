// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, BlockLeaves, BlockTallGrass, 
//            World, WorldProviderEnd, IBlockAccess, WorldProvider, 
//            BlockPortal, AxisAlignedBB

public class BlockFire extends Block
{

    private int field_449_a[];
    private int field_448_b[];

    protected BlockFire(int p_i217_1_, int p_i217_2_)
    {
        super(p_i217_1_, p_i217_2_, Material.field_1326_l);
        field_449_a = new int[256];
        field_448_b = new int[256];
        func_253_b(true);
    }

    public void func_28028_i()
    {
        func_264_a(Block.field_334_y.field_376_bc, 5, 20);
        func_264_a(Block.field_4057_ba.field_376_bc, 5, 20);
        func_264_a(Block.field_4059_au.field_376_bc, 5, 20);
        func_264_a(Block.field_385_K.field_376_bc, 5, 5);
        func_264_a(Block.field_384_L.field_376_bc, 30, 60);
        func_264_a(Block.field_407_ao.field_376_bc, 30, 20);
        func_264_a(Block.field_408_an.field_376_bc, 15, 100);
        func_264_a(Block.field_9257_X.field_376_bc, 60, 100);
        func_264_a(Block.field_419_ac.field_376_bc, 30, 60);
        func_264_a(Block.field_35278_bv.field_376_bc, 15, 100);
    }

    private void func_264_a(int p_264_1_, int p_264_2_, int p_264_3_)
    {
        field_449_a[p_264_1_] = p_264_2_;
        field_448_b[p_264_1_] = p_264_3_;
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int i)
    {
        return null;
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
        return 3;
    }

    public int func_229_a(Random p_229_1_)
    {
        return 0;
    }

    public int func_4025_d()
    {
        return 30;
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        boolean flag = p_208_1_.func_600_a(p_208_2_, p_208_3_ - 1, p_208_4_) == Block.field_4053_bc.field_376_bc;
        if((p_208_1_.field_4209_q instanceof WorldProviderEnd) && p_208_1_.func_600_a(p_208_2_, p_208_3_ - 1, p_208_4_) == Block.field_403_A.field_376_bc)
        {
            flag = true;
        }
        if(!func_243_a(p_208_1_, p_208_2_, p_208_3_, p_208_4_))
        {
            p_208_1_.func_690_d(p_208_2_, p_208_3_, p_208_4_, 0);
        }
        if(!flag && p_208_1_.func_27161_C() && (p_208_1_.func_27167_r(p_208_2_, p_208_3_, p_208_4_) || p_208_1_.func_27167_r(p_208_2_ - 1, p_208_3_, p_208_4_) || p_208_1_.func_27167_r(p_208_2_ + 1, p_208_3_, p_208_4_) || p_208_1_.func_27167_r(p_208_2_, p_208_3_, p_208_4_ - 1) || p_208_1_.func_27167_r(p_208_2_, p_208_3_, p_208_4_ + 1)))
        {
            p_208_1_.func_690_d(p_208_2_, p_208_3_, p_208_4_, 0);
            return;
        }
        int i = p_208_1_.func_602_e(p_208_2_, p_208_3_, p_208_4_);
        if(i < 15)
        {
            p_208_1_.func_635_c(p_208_2_, p_208_3_, p_208_4_, i + p_208_5_.nextInt(3) / 2);
        }
        p_208_1_.func_22136_c(p_208_2_, p_208_3_, p_208_4_, field_376_bc, func_4025_d() + p_208_5_.nextInt(10));
        if(!flag && !func_263_h(p_208_1_, p_208_2_, p_208_3_, p_208_4_))
        {
            if(!p_208_1_.func_28100_h(p_208_2_, p_208_3_ - 1, p_208_4_) || i > 3)
            {
                p_208_1_.func_690_d(p_208_2_, p_208_3_, p_208_4_, 0);
            }
            return;
        }
        if(!flag && !func_261_b(p_208_1_, p_208_2_, p_208_3_ - 1, p_208_4_) && i == 15 && p_208_5_.nextInt(4) == 0)
        {
            p_208_1_.func_690_d(p_208_2_, p_208_3_, p_208_4_, 0);
            return;
        }
        boolean flag1 = p_208_1_.func_48455_z(p_208_2_, p_208_3_, p_208_4_);
        byte byte0 = 0;
        if(flag1)
        {
            byte0 = -50;
        }
        func_48211_a(p_208_1_, p_208_2_ + 1, p_208_3_, p_208_4_, 300 + byte0, p_208_5_, i);
        func_48211_a(p_208_1_, p_208_2_ - 1, p_208_3_, p_208_4_, 300 + byte0, p_208_5_, i);
        func_48211_a(p_208_1_, p_208_2_, p_208_3_ - 1, p_208_4_, 250 + byte0, p_208_5_, i);
        func_48211_a(p_208_1_, p_208_2_, p_208_3_ + 1, p_208_4_, 250 + byte0, p_208_5_, i);
        func_48211_a(p_208_1_, p_208_2_, p_208_3_, p_208_4_ - 1, 300 + byte0, p_208_5_, i);
        func_48211_a(p_208_1_, p_208_2_, p_208_3_, p_208_4_ + 1, 300 + byte0, p_208_5_, i);
        for(int j = p_208_2_ - 1; j <= p_208_2_ + 1; j++)
        {
            for(int k = p_208_4_ - 1; k <= p_208_4_ + 1; k++)
            {
                for(int l = p_208_3_ - 1; l <= p_208_3_ + 4; l++)
                {
                    if(j == p_208_2_ && l == p_208_3_ && k == p_208_4_)
                    {
                        continue;
                    }
                    int i1 = 100;
                    if(l > p_208_3_ + 1)
                    {
                        i1 += (l - (p_208_3_ + 1)) * 100;
                    }
                    int j1 = func_262_i(p_208_1_, j, l, k);
                    if(j1 <= 0)
                    {
                        continue;
                    }
                    int k1 = (j1 + 40) / (i + 30);
                    if(flag1)
                    {
                        k1 /= 2;
                    }
                    if(k1 <= 0 || p_208_5_.nextInt(i1) > k1 || p_208_1_.func_27161_C() && p_208_1_.func_27167_r(j, l, k) || p_208_1_.func_27167_r(j - 1, l, p_208_4_) || p_208_1_.func_27167_r(j + 1, l, k) || p_208_1_.func_27167_r(j, l, k - 1) || p_208_1_.func_27167_r(j, l, k + 1))
                    {
                        continue;
                    }
                    int l1 = i + p_208_5_.nextInt(5) / 4;
                    if(l1 > 15)
                    {
                        l1 = 15;
                    }
                    p_208_1_.func_688_b(j, l, k, field_376_bc, l1);
                }

            }

        }

    }

    private void func_48211_a(World p_48211_1_, int p_48211_2_, int p_48211_3_, int p_48211_4_, int p_48211_5_, Random p_48211_6_, int p_48211_7_)
    {
        int i = field_448_b[p_48211_1_.func_600_a(p_48211_2_, p_48211_3_, p_48211_4_)];
        if(p_48211_6_.nextInt(p_48211_5_) < i)
        {
            boolean flag = p_48211_1_.func_600_a(p_48211_2_, p_48211_3_, p_48211_4_) == Block.field_408_an.field_376_bc;
            if(p_48211_6_.nextInt(p_48211_7_ + 10) < 5 && !p_48211_1_.func_27167_r(p_48211_2_, p_48211_3_, p_48211_4_))
            {
                int j = p_48211_7_ + p_48211_6_.nextInt(5) / 4;
                if(j > 15)
                {
                    j = 15;
                }
                p_48211_1_.func_688_b(p_48211_2_, p_48211_3_, p_48211_4_, field_376_bc, j);
            } else
            {
                p_48211_1_.func_690_d(p_48211_2_, p_48211_3_, p_48211_4_, 0);
            }
            if(flag)
            {
                Block.field_408_an.func_252_b(p_48211_1_, p_48211_2_, p_48211_3_, p_48211_4_, 1);
            }
        }
    }

    private boolean func_263_h(World p_263_1_, int p_263_2_, int p_263_3_, int p_263_4_)
    {
        if(func_261_b(p_263_1_, p_263_2_ + 1, p_263_3_, p_263_4_))
        {
            return true;
        }
        if(func_261_b(p_263_1_, p_263_2_ - 1, p_263_3_, p_263_4_))
        {
            return true;
        }
        if(func_261_b(p_263_1_, p_263_2_, p_263_3_ - 1, p_263_4_))
        {
            return true;
        }
        if(func_261_b(p_263_1_, p_263_2_, p_263_3_ + 1, p_263_4_))
        {
            return true;
        }
        if(func_261_b(p_263_1_, p_263_2_, p_263_3_, p_263_4_ - 1))
        {
            return true;
        }
        return func_261_b(p_263_1_, p_263_2_, p_263_3_, p_263_4_ + 1);
    }

    private int func_262_i(World p_262_1_, int p_262_2_, int p_262_3_, int p_262_4_)
    {
        int i = 0;
        if(!p_262_1_.func_20084_d(p_262_2_, p_262_3_, p_262_4_))
        {
            return 0;
        } else
        {
            i = func_265_g(p_262_1_, p_262_2_ + 1, p_262_3_, p_262_4_, i);
            i = func_265_g(p_262_1_, p_262_2_ - 1, p_262_3_, p_262_4_, i);
            i = func_265_g(p_262_1_, p_262_2_, p_262_3_ - 1, p_262_4_, i);
            i = func_265_g(p_262_1_, p_262_2_, p_262_3_ + 1, p_262_4_, i);
            i = func_265_g(p_262_1_, p_262_2_, p_262_3_, p_262_4_ - 1, i);
            i = func_265_g(p_262_1_, p_262_2_, p_262_3_, p_262_4_ + 1, i);
            return i;
        }
    }

    public boolean func_245_h()
    {
        return false;
    }

    public boolean func_261_b(IBlockAccess p_261_1_, int p_261_2_, int p_261_3_, int p_261_4_)
    {
        return field_449_a[p_261_1_.func_600_a(p_261_2_, p_261_3_, p_261_4_)] > 0;
    }

    public int func_265_g(World p_265_1_, int p_265_2_, int p_265_3_, int p_265_4_, int p_265_5_)
    {
        int i = field_449_a[p_265_1_.func_600_a(p_265_2_, p_265_3_, p_265_4_)];
        if(i > p_265_5_)
        {
            return i;
        } else
        {
            return p_265_5_;
        }
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        return p_243_1_.func_28100_h(p_243_2_, p_243_3_ - 1, p_243_4_) || func_263_h(p_243_1_, p_243_2_, p_243_3_, p_243_4_);
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        if(!p_226_1_.func_28100_h(p_226_2_, p_226_3_ - 1, p_226_4_) && !func_263_h(p_226_1_, p_226_2_, p_226_3_, p_226_4_))
        {
            p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
            return;
        } else
        {
            return;
        }
    }

    public void func_235_e(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_)
    {
        if(p_235_1_.field_4209_q.field_4218_e <= 0 && p_235_1_.func_600_a(p_235_2_, p_235_3_ - 1, p_235_4_) == Block.field_405_aq.field_376_bc && Block.field_4047_bf.func_4032_a_(p_235_1_, p_235_2_, p_235_3_, p_235_4_))
        {
            return;
        }
        if(!p_235_1_.func_28100_h(p_235_2_, p_235_3_ - 1, p_235_4_) && !func_263_h(p_235_1_, p_235_2_, p_235_3_, p_235_4_))
        {
            p_235_1_.func_690_d(p_235_2_, p_235_3_, p_235_4_, 0);
            return;
        } else
        {
            p_235_1_.func_22136_c(p_235_2_, p_235_3_, p_235_4_, field_376_bc, func_4025_d() + p_235_1_.field_1037_n.nextInt(10));
            return;
        }
    }

    public void func_247_b(World p_247_1_, int p_247_2_, int p_247_3_, int p_247_4_, Random p_247_5_)
    {
        if(p_247_5_.nextInt(24) == 0)
        {
            p_247_1_.func_684_a((float)p_247_2_ + 0.5F, (float)p_247_3_ + 0.5F, (float)p_247_4_ + 0.5F, "fire.fire", 1.0F + p_247_5_.nextFloat(), p_247_5_.nextFloat() * 0.7F + 0.3F);
        }
        if(p_247_1_.func_28100_h(p_247_2_, p_247_3_ - 1, p_247_4_) || Block.field_402_as.func_261_b(p_247_1_, p_247_2_, p_247_3_ - 1, p_247_4_))
        {
            for(int i = 0; i < 3; i++)
            {
                float f = (float)p_247_2_ + p_247_5_.nextFloat();
                float f6 = (float)p_247_3_ + p_247_5_.nextFloat() * 0.5F + 0.5F;
                float f12 = (float)p_247_4_ + p_247_5_.nextFloat();
                p_247_1_.func_694_a("largesmoke", f, f6, f12, 0.0D, 0.0D, 0.0D);
            }

        } else
        {
            if(Block.field_402_as.func_261_b(p_247_1_, p_247_2_ - 1, p_247_3_, p_247_4_))
            {
                for(int j = 0; j < 2; j++)
                {
                    float f1 = (float)p_247_2_ + p_247_5_.nextFloat() * 0.1F;
                    float f7 = (float)p_247_3_ + p_247_5_.nextFloat();
                    float f13 = (float)p_247_4_ + p_247_5_.nextFloat();
                    p_247_1_.func_694_a("largesmoke", f1, f7, f13, 0.0D, 0.0D, 0.0D);
                }

            }
            if(Block.field_402_as.func_261_b(p_247_1_, p_247_2_ + 1, p_247_3_, p_247_4_))
            {
                for(int k = 0; k < 2; k++)
                {
                    float f2 = (float)(p_247_2_ + 1) - p_247_5_.nextFloat() * 0.1F;
                    float f8 = (float)p_247_3_ + p_247_5_.nextFloat();
                    float f14 = (float)p_247_4_ + p_247_5_.nextFloat();
                    p_247_1_.func_694_a("largesmoke", f2, f8, f14, 0.0D, 0.0D, 0.0D);
                }

            }
            if(Block.field_402_as.func_261_b(p_247_1_, p_247_2_, p_247_3_, p_247_4_ - 1))
            {
                for(int l = 0; l < 2; l++)
                {
                    float f3 = (float)p_247_2_ + p_247_5_.nextFloat();
                    float f9 = (float)p_247_3_ + p_247_5_.nextFloat();
                    float f15 = (float)p_247_4_ + p_247_5_.nextFloat() * 0.1F;
                    p_247_1_.func_694_a("largesmoke", f3, f9, f15, 0.0D, 0.0D, 0.0D);
                }

            }
            if(Block.field_402_as.func_261_b(p_247_1_, p_247_2_, p_247_3_, p_247_4_ + 1))
            {
                for(int i1 = 0; i1 < 2; i1++)
                {
                    float f4 = (float)p_247_2_ + p_247_5_.nextFloat();
                    float f10 = (float)p_247_3_ + p_247_5_.nextFloat();
                    float f16 = (float)(p_247_4_ + 1) - p_247_5_.nextFloat() * 0.1F;
                    p_247_1_.func_694_a("largesmoke", f4, f10, f16, 0.0D, 0.0D, 0.0D);
                }

            }
            if(Block.field_402_as.func_261_b(p_247_1_, p_247_2_, p_247_3_ + 1, p_247_4_))
            {
                for(int j1 = 0; j1 < 2; j1++)
                {
                    float f5 = (float)p_247_2_ + p_247_5_.nextFloat();
                    float f11 = (float)(p_247_3_ + 1) - p_247_5_.nextFloat() * 0.1F;
                    float f17 = (float)p_247_4_ + p_247_5_.nextFloat();
                    p_247_1_.func_694_a("largesmoke", f5, f11, f17, 0.0D, 0.0D, 0.0D);
                }

            }
        }
    }
}
