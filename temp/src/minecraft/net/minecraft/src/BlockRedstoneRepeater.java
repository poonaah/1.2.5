// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockDirectional, Material, World, Block, 
//            IBlockAccess, EntityLiving, MathHelper, Item, 
//            EntityPlayer

public class BlockRedstoneRepeater extends BlockDirectional
{

    public static final double field_22024_a[] = {
        -0.0625D, 0.0625D, 0.1875D, 0.3125D
    };
    private static final int field_22023_b[] = {
        1, 2, 3, 4
    };
    private final boolean field_22025_c;

    protected BlockRedstoneRepeater(int p_i562_1_, boolean p_i562_2_)
    {
        super(p_i562_1_, 6, Material.field_1324_n);
        field_22025_c = p_i562_2_;
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    }

    public boolean func_242_c()
    {
        return false;
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        if(!p_243_1_.func_28100_h(p_243_2_, p_243_3_ - 1, p_243_4_))
        {
            return false;
        } else
        {
            return super.func_243_a(p_243_1_, p_243_2_, p_243_3_, p_243_4_);
        }
    }

    public boolean func_223_g(World p_223_1_, int p_223_2_, int p_223_3_, int p_223_4_)
    {
        if(!p_223_1_.func_28100_h(p_223_2_, p_223_3_ - 1, p_223_4_))
        {
            return false;
        } else
        {
            return super.func_223_g(p_223_1_, p_223_2_, p_223_3_, p_223_4_);
        }
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        int i = p_208_1_.func_602_e(p_208_2_, p_208_3_, p_208_4_);
        boolean flag = func_22022_g(p_208_1_, p_208_2_, p_208_3_, p_208_4_, i);
        if(field_22025_c && !flag)
        {
            p_208_1_.func_688_b(p_208_2_, p_208_3_, p_208_4_, Block.field_22021_bh.field_376_bc, i);
        } else
        if(!field_22025_c)
        {
            p_208_1_.func_688_b(p_208_2_, p_208_3_, p_208_4_, Block.field_22020_bi.field_376_bc, i);
            if(!flag)
            {
                int j = (i & 0xc) >> 2;
                p_208_1_.func_22136_c(p_208_2_, p_208_3_, p_208_4_, Block.field_22020_bi.field_376_bc, field_22023_b[j] * 2);
            }
        }
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        if(p_232_1_ == 0)
        {
            return !field_22025_c ? 115 : 99;
        }
        if(p_232_1_ == 1)
        {
            return !field_22025_c ? 131 : 147;
        } else
        {
            return 5;
        }
    }

    public boolean func_260_c(IBlockAccess p_260_1_, int p_260_2_, int p_260_3_, int p_260_4_, int p_260_5_)
    {
        return p_260_5_ != 0 && p_260_5_ != 1;
    }

    public int func_210_f()
    {
        return 15;
    }

    public int func_218_a(int p_218_1_)
    {
        return func_232_a(p_218_1_, 0);
    }

    public boolean func_228_c(World p_228_1_, int p_228_2_, int p_228_3_, int p_228_4_, int p_228_5_)
    {
        return func_231_b(p_228_1_, p_228_2_, p_228_3_, p_228_4_, p_228_5_);
    }

    public boolean func_231_b(IBlockAccess p_231_1_, int p_231_2_, int p_231_3_, int p_231_4_, int p_231_5_)
    {
        if(!field_22025_c)
        {
            return false;
        }
        int i = func_48216_a(p_231_1_.func_602_e(p_231_2_, p_231_3_, p_231_4_));
        if(i == 0 && p_231_5_ == 3)
        {
            return true;
        }
        if(i == 1 && p_231_5_ == 4)
        {
            return true;
        }
        if(i == 2 && p_231_5_ == 2)
        {
            return true;
        }
        return i == 3 && p_231_5_ == 5;
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        if(!func_223_g(p_226_1_, p_226_2_, p_226_3_, p_226_4_))
        {
            func_259_b_(p_226_1_, p_226_2_, p_226_3_, p_226_4_, p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_), 0);
            p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
            p_226_1_.func_611_g(p_226_2_ + 1, p_226_3_, p_226_4_, field_376_bc);
            p_226_1_.func_611_g(p_226_2_ - 1, p_226_3_, p_226_4_, field_376_bc);
            p_226_1_.func_611_g(p_226_2_, p_226_3_, p_226_4_ + 1, field_376_bc);
            p_226_1_.func_611_g(p_226_2_, p_226_3_, p_226_4_ - 1, field_376_bc);
            p_226_1_.func_611_g(p_226_2_, p_226_3_ - 1, p_226_4_, field_376_bc);
            p_226_1_.func_611_g(p_226_2_, p_226_3_ + 1, p_226_4_, field_376_bc);
            return;
        }
        int i = p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_);
        boolean flag = func_22022_g(p_226_1_, p_226_2_, p_226_3_, p_226_4_, i);
        int j = (i & 0xc) >> 2;
        if(field_22025_c && !flag)
        {
            p_226_1_.func_22136_c(p_226_2_, p_226_3_, p_226_4_, field_376_bc, field_22023_b[j] * 2);
        } else
        if(!field_22025_c && flag)
        {
            p_226_1_.func_22136_c(p_226_2_, p_226_3_, p_226_4_, field_376_bc, field_22023_b[j] * 2);
        }
    }

    private boolean func_22022_g(World p_22022_1_, int p_22022_2_, int p_22022_3_, int p_22022_4_, int p_22022_5_)
    {
        int i = func_48216_a(p_22022_5_);
        switch(i)
        {
        case 0: // '\0'
            return p_22022_1_.func_706_k(p_22022_2_, p_22022_3_, p_22022_4_ + 1, 3) || p_22022_1_.func_600_a(p_22022_2_, p_22022_3_, p_22022_4_ + 1) == Block.field_394_aw.field_376_bc && p_22022_1_.func_602_e(p_22022_2_, p_22022_3_, p_22022_4_ + 1) > 0;

        case 2: // '\002'
            return p_22022_1_.func_706_k(p_22022_2_, p_22022_3_, p_22022_4_ - 1, 2) || p_22022_1_.func_600_a(p_22022_2_, p_22022_3_, p_22022_4_ - 1) == Block.field_394_aw.field_376_bc && p_22022_1_.func_602_e(p_22022_2_, p_22022_3_, p_22022_4_ - 1) > 0;

        case 3: // '\003'
            return p_22022_1_.func_706_k(p_22022_2_ + 1, p_22022_3_, p_22022_4_, 5) || p_22022_1_.func_600_a(p_22022_2_ + 1, p_22022_3_, p_22022_4_) == Block.field_394_aw.field_376_bc && p_22022_1_.func_602_e(p_22022_2_ + 1, p_22022_3_, p_22022_4_) > 0;

        case 1: // '\001'
            return p_22022_1_.func_706_k(p_22022_2_ - 1, p_22022_3_, p_22022_4_, 4) || p_22022_1_.func_600_a(p_22022_2_ - 1, p_22022_3_, p_22022_4_) == Block.field_394_aw.field_376_bc && p_22022_1_.func_602_e(p_22022_2_ - 1, p_22022_3_, p_22022_4_) > 0;
        }
        return false;
    }

    public boolean func_250_a(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_, EntityPlayer p_250_5_)
    {
        int i = p_250_1_.func_602_e(p_250_2_, p_250_3_, p_250_4_);
        int j = (i & 0xc) >> 2;
        j = j + 1 << 2 & 0xc;
        p_250_1_.func_691_b(p_250_2_, p_250_3_, p_250_4_, j | i & 3);
        return true;
    }

    public boolean func_209_d()
    {
        return true;
    }

    public void func_4026_a(World p_4026_1_, int p_4026_2_, int p_4026_3_, int p_4026_4_, EntityLiving p_4026_5_)
    {
        int i = ((MathHelper.func_1108_b((double)((p_4026_5_.field_605_aq * 4F) / 360F) + 0.5D) & 3) + 2) % 4;
        p_4026_1_.func_691_b(p_4026_2_, p_4026_3_, p_4026_4_, i);
        boolean flag = func_22022_g(p_4026_1_, p_4026_2_, p_4026_3_, p_4026_4_, i);
        if(flag)
        {
            p_4026_1_.func_22136_c(p_4026_2_, p_4026_3_, p_4026_4_, field_376_bc, 1);
        }
    }

    public void func_235_e(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_)
    {
        p_235_1_.func_611_g(p_235_2_ + 1, p_235_3_, p_235_4_, field_376_bc);
        p_235_1_.func_611_g(p_235_2_ - 1, p_235_3_, p_235_4_, field_376_bc);
        p_235_1_.func_611_g(p_235_2_, p_235_3_, p_235_4_ + 1, field_376_bc);
        p_235_1_.func_611_g(p_235_2_, p_235_3_, p_235_4_ - 1, field_376_bc);
        p_235_1_.func_611_g(p_235_2_, p_235_3_ - 1, p_235_4_, field_376_bc);
        p_235_1_.func_611_g(p_235_2_, p_235_3_ + 1, p_235_4_, field_376_bc);
    }

    public void func_252_b(World p_252_1_, int p_252_2_, int p_252_3_, int p_252_4_, int p_252_5_)
    {
        if(field_22025_c)
        {
            p_252_1_.func_611_g(p_252_2_ + 1, p_252_3_, p_252_4_, field_376_bc);
            p_252_1_.func_611_g(p_252_2_ - 1, p_252_3_, p_252_4_, field_376_bc);
            p_252_1_.func_611_g(p_252_2_, p_252_3_, p_252_4_ + 1, field_376_bc);
            p_252_1_.func_611_g(p_252_2_, p_252_3_, p_252_4_ - 1, field_376_bc);
            p_252_1_.func_611_g(p_252_2_, p_252_3_ - 1, p_252_4_, field_376_bc);
            p_252_1_.func_611_g(p_252_2_, p_252_3_ + 1, p_252_4_, field_376_bc);
        }
        super.func_252_b(p_252_1_, p_252_2_, p_252_3_, p_252_4_, p_252_5_);
    }

    public boolean func_217_b()
    {
        return false;
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Item.field_22018_aZ.field_291_aS;
    }

    public void func_247_b(World p_247_1_, int p_247_2_, int p_247_3_, int p_247_4_, Random p_247_5_)
    {
        if(!field_22025_c)
        {
            return;
        }
        int i = p_247_1_.func_602_e(p_247_2_, p_247_3_, p_247_4_);
        int j = func_48216_a(i);
        double d = (double)((float)p_247_2_ + 0.5F) + (double)(p_247_5_.nextFloat() - 0.5F) * 0.20000000000000001D;
        double d1 = (double)((float)p_247_3_ + 0.4F) + (double)(p_247_5_.nextFloat() - 0.5F) * 0.20000000000000001D;
        double d2 = (double)((float)p_247_4_ + 0.5F) + (double)(p_247_5_.nextFloat() - 0.5F) * 0.20000000000000001D;
        double d3 = 0.0D;
        double d4 = 0.0D;
        if(p_247_5_.nextInt(2) == 0)
        {
            switch(j)
            {
            case 0: // '\0'
                d4 = -0.3125D;
                break;

            case 2: // '\002'
                d4 = 0.3125D;
                break;

            case 3: // '\003'
                d3 = -0.3125D;
                break;

            case 1: // '\001'
                d3 = 0.3125D;
                break;
            }
        } else
        {
            int k = (i & 0xc) >> 2;
            switch(j)
            {
            case 0: // '\0'
                d4 = field_22024_a[k];
                break;

            case 2: // '\002'
                d4 = -field_22024_a[k];
                break;

            case 3: // '\003'
                d3 = field_22024_a[k];
                break;

            case 1: // '\001'
                d3 = -field_22024_a[k];
                break;
            }
        }
        p_247_1_.func_694_a("reddust", d + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
    }

}
