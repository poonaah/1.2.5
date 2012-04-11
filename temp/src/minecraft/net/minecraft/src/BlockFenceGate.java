// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            BlockDirectional, Material, World, AxisAlignedBB, 
//            IBlockAccess, EntityLiving, MathHelper, EntityPlayer, 
//            Block

public class BlockFenceGate extends BlockDirectional
{

    public BlockFenceGate(int p_i155_1_, int p_i155_2_)
    {
        super(p_i155_1_, p_i155_2_, Material.field_1335_c);
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        if(!p_243_1_.func_599_f(p_243_2_, p_243_3_ - 1, p_243_4_).func_878_a())
        {
            return false;
        } else
        {
            return super.func_243_a(p_243_1_, p_243_2_, p_243_3_, p_243_4_);
        }
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_)
    {
        int i = p_221_1_.func_602_e(p_221_2_, p_221_3_, p_221_4_);
        if(func_35291_d(i))
        {
            return null;
        }
        if(i == 2 || i == 0)
        {
            return AxisAlignedBB.func_1161_b(p_221_2_, p_221_3_, (float)p_221_4_ + 0.375F, p_221_2_ + 1, (float)p_221_3_ + 1.5F, (float)p_221_4_ + 0.625F);
        } else
        {
            return AxisAlignedBB.func_1161_b((float)p_221_2_ + 0.375F, p_221_3_, p_221_4_, (float)p_221_2_ + 0.625F, (float)p_221_3_ + 1.5F, p_221_4_ + 1);
        }
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        int i = func_48216_a(p_238_1_.func_602_e(p_238_2_, p_238_3_, p_238_4_));
        if(i == 2 || i == 0)
        {
            func_213_a(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
        } else
        {
            func_213_a(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
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

    public boolean func_48204_b(IBlockAccess p_48204_1_, int p_48204_2_, int p_48204_3_, int p_48204_4_)
    {
        return func_35291_d(p_48204_1_.func_602_e(p_48204_2_, p_48204_3_, p_48204_4_));
    }

    public int func_210_f()
    {
        return 21;
    }

    public void func_4026_a(World p_4026_1_, int p_4026_2_, int p_4026_3_, int p_4026_4_, EntityLiving p_4026_5_)
    {
        int i = (MathHelper.func_1108_b((double)((p_4026_5_.field_605_aq * 4F) / 360F) + 0.5D) & 3) % 4;
        p_4026_1_.func_691_b(p_4026_2_, p_4026_3_, p_4026_4_, i);
    }

    public boolean func_250_a(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_, EntityPlayer p_250_5_)
    {
        int i = p_250_1_.func_602_e(p_250_2_, p_250_3_, p_250_4_);
        if(func_35291_d(i))
        {
            p_250_1_.func_691_b(p_250_2_, p_250_3_, p_250_4_, i & -5);
        } else
        {
            int j = (MathHelper.func_1108_b((double)((p_250_5_.field_605_aq * 4F) / 360F) + 0.5D) & 3) % 4;
            int k = func_48216_a(i);
            if(k == (j + 2) % 4)
            {
                i = j;
            }
            p_250_1_.func_691_b(p_250_2_, p_250_3_, p_250_4_, i | 4);
        }
        p_250_1_.func_28107_a(p_250_5_, 1003, p_250_2_, p_250_3_, p_250_4_, 0);
        return true;
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        if(p_226_1_.field_1026_y)
        {
            return;
        }
        int i = p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_);
        boolean flag = p_226_1_.func_625_o(p_226_2_, p_226_3_, p_226_4_);
        if(flag || p_226_5_ > 0 && Block.field_345_n[p_226_5_].func_209_d() || p_226_5_ == 0)
        {
            if(flag && !func_35291_d(i))
            {
                p_226_1_.func_691_b(p_226_2_, p_226_3_, p_226_4_, i | 4);
                p_226_1_.func_28107_a(null, 1003, p_226_2_, p_226_3_, p_226_4_, 0);
            } else
            if(!flag && func_35291_d(i))
            {
                p_226_1_.func_691_b(p_226_2_, p_226_3_, p_226_4_, i & -5);
                p_226_1_.func_28107_a(null, 1003, p_226_2_, p_226_3_, p_226_4_, 0);
            }
        }
    }

    public static boolean func_35291_d(int p_35291_0_)
    {
        return (p_35291_0_ & 4) != 0;
    }
}
