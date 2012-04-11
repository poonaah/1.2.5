// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, World, EnumMobType, AxisAlignedBB, 
//            EntityLiving, EntityPlayer, IBlockAccess, Material, 
//            Entity

public class BlockPressurePlate extends Block
{

    private EnumMobType field_467_a;

    protected BlockPressurePlate(int p_i629_1_, int p_i629_2_, EnumMobType p_i629_3_, Material p_i629_4_)
    {
        super(p_i629_1_, p_i629_2_, p_i629_4_);
        field_467_a = p_i629_3_;
        func_253_b(true);
        float f = 0.0625F;
        func_213_a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
    }

    public int func_4025_d()
    {
        return 20;
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

    public boolean func_48204_b(IBlockAccess p_48204_1_, int p_48204_2_, int p_48204_3_, int i)
    {
        return true;
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        return p_243_1_.func_28100_h(p_243_2_, p_243_3_ - 1, p_243_4_) || p_243_1_.func_600_a(p_243_2_, p_243_3_ - 1, p_243_4_) == Block.field_4057_ba.field_376_bc;
    }

    public void func_235_e(World world, int i, int j, int k)
    {
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        boolean flag = false;
        if(!p_226_1_.func_28100_h(p_226_2_, p_226_3_ - 1, p_226_4_) && p_226_1_.func_600_a(p_226_2_, p_226_3_ - 1, p_226_4_) != Block.field_4057_ba.field_376_bc)
        {
            flag = true;
        }
        if(flag)
        {
            func_259_b_(p_226_1_, p_226_2_, p_226_3_, p_226_4_, p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_), 0);
            p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
        }
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        if(p_208_1_.field_1026_y)
        {
            return;
        }
        if(p_208_1_.func_602_e(p_208_2_, p_208_3_, p_208_4_) == 0)
        {
            return;
        } else
        {
            func_318_h(p_208_1_, p_208_2_, p_208_3_, p_208_4_);
            return;
        }
    }

    public void func_236_b(World p_236_1_, int p_236_2_, int p_236_3_, int p_236_4_, Entity p_236_5_)
    {
        if(p_236_1_.field_1026_y)
        {
            return;
        }
        if(p_236_1_.func_602_e(p_236_2_, p_236_3_, p_236_4_) == 1)
        {
            return;
        } else
        {
            func_318_h(p_236_1_, p_236_2_, p_236_3_, p_236_4_);
            return;
        }
    }

    private void func_318_h(World p_318_1_, int p_318_2_, int p_318_3_, int p_318_4_)
    {
        boolean flag = p_318_1_.func_602_e(p_318_2_, p_318_3_, p_318_4_) == 1;
        boolean flag1 = false;
        float f = 0.125F;
        List list = null;
        if(field_467_a == EnumMobType.everything)
        {
            list = p_318_1_.func_659_b(null, AxisAlignedBB.func_1161_b((float)p_318_2_ + f, p_318_3_, (float)p_318_4_ + f, (float)(p_318_2_ + 1) - f, (double)p_318_3_ + 0.25D, (float)(p_318_4_ + 1) - f));
        }
        if(field_467_a == EnumMobType.mobs)
        {
            list = p_318_1_.func_657_a(net.minecraft.src.EntityLiving.class, AxisAlignedBB.func_1161_b((float)p_318_2_ + f, p_318_3_, (float)p_318_4_ + f, (float)(p_318_2_ + 1) - f, (double)p_318_3_ + 0.25D, (float)(p_318_4_ + 1) - f));
        }
        if(field_467_a == EnumMobType.players)
        {
            list = p_318_1_.func_657_a(net.minecraft.src.EntityPlayer.class, AxisAlignedBB.func_1161_b((float)p_318_2_ + f, p_318_3_, (float)p_318_4_ + f, (float)(p_318_2_ + 1) - f, (double)p_318_3_ + 0.25D, (float)(p_318_4_ + 1) - f));
        }
        if(list.size() > 0)
        {
            flag1 = true;
        }
        if(flag1 && !flag)
        {
            p_318_1_.func_691_b(p_318_2_, p_318_3_, p_318_4_, 1);
            p_318_1_.func_611_g(p_318_2_, p_318_3_, p_318_4_, field_376_bc);
            p_318_1_.func_611_g(p_318_2_, p_318_3_ - 1, p_318_4_, field_376_bc);
            p_318_1_.func_701_b(p_318_2_, p_318_3_, p_318_4_, p_318_2_, p_318_3_, p_318_4_);
            p_318_1_.func_684_a((double)p_318_2_ + 0.5D, (double)p_318_3_ + 0.10000000000000001D, (double)p_318_4_ + 0.5D, "random.click", 0.3F, 0.6F);
        }
        if(!flag1 && flag)
        {
            p_318_1_.func_691_b(p_318_2_, p_318_3_, p_318_4_, 0);
            p_318_1_.func_611_g(p_318_2_, p_318_3_, p_318_4_, field_376_bc);
            p_318_1_.func_611_g(p_318_2_, p_318_3_ - 1, p_318_4_, field_376_bc);
            p_318_1_.func_701_b(p_318_2_, p_318_3_, p_318_4_, p_318_2_, p_318_3_, p_318_4_);
            p_318_1_.func_684_a((double)p_318_2_ + 0.5D, (double)p_318_3_ + 0.10000000000000001D, (double)p_318_4_ + 0.5D, "random.click", 0.3F, 0.5F);
        }
        if(flag1)
        {
            p_318_1_.func_22136_c(p_318_2_, p_318_3_, p_318_4_, field_376_bc, func_4025_d());
        }
    }

    public void func_214_b(World p_214_1_, int p_214_2_, int p_214_3_, int p_214_4_)
    {
        int i = p_214_1_.func_602_e(p_214_2_, p_214_3_, p_214_4_);
        if(i > 0)
        {
            p_214_1_.func_611_g(p_214_2_, p_214_3_, p_214_4_, field_376_bc);
            p_214_1_.func_611_g(p_214_2_, p_214_3_ - 1, p_214_4_, field_376_bc);
        }
        super.func_214_b(p_214_1_, p_214_2_, p_214_3_, p_214_4_);
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        boolean flag = p_238_1_.func_602_e(p_238_2_, p_238_3_, p_238_4_) == 1;
        float f = 0.0625F;
        if(flag)
        {
            func_213_a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
        } else
        {
            func_213_a(f, 0.0F, f, 1.0F - f, 0.0625F, 1.0F - f);
        }
    }

    public boolean func_231_b(IBlockAccess p_231_1_, int p_231_2_, int p_231_3_, int p_231_4_, int p_231_5_)
    {
        return p_231_1_.func_602_e(p_231_2_, p_231_3_, p_231_4_) > 0;
    }

    public boolean func_228_c(World p_228_1_, int p_228_2_, int p_228_3_, int p_228_4_, int p_228_5_)
    {
        if(p_228_1_.func_602_e(p_228_2_, p_228_3_, p_228_4_) == 0)
        {
            return false;
        } else
        {
            return p_228_5_ == 1;
        }
    }

    public boolean func_209_d()
    {
        return true;
    }

    public void func_237_e()
    {
        float f = 0.5F;
        float f1 = 0.125F;
        float f2 = 0.5F;
        func_213_a(0.5F - f, 0.5F - f1, 0.5F - f2, 0.5F + f, 0.5F + f1, 0.5F + f2);
    }

    public int func_31029_h()
    {
        return 1;
    }
}
