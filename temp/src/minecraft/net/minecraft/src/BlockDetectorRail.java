// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockRail, World, IBlockAccess, EntityMinecart, 
//            AxisAlignedBB, Entity

public class BlockDetectorRail extends BlockRail
{

    public BlockDetectorRail(int p_i82_1_, int p_i82_2_)
    {
        super(p_i82_1_, p_i82_2_, true);
        func_253_b(true);
    }

    public int func_4025_d()
    {
        return 20;
    }

    public boolean func_209_d()
    {
        return true;
    }

    public void func_236_b(World p_236_1_, int p_236_2_, int p_236_3_, int p_236_4_, Entity p_236_5_)
    {
        if(p_236_1_.field_1026_y)
        {
            return;
        }
        int i = p_236_1_.func_602_e(p_236_2_, p_236_3_, p_236_4_);
        if((i & 8) != 0)
        {
            return;
        } else
        {
            func_27046_f(p_236_1_, p_236_2_, p_236_3_, p_236_4_, i);
            return;
        }
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        if(p_208_1_.field_1026_y)
        {
            return;
        }
        int i = p_208_1_.func_602_e(p_208_2_, p_208_3_, p_208_4_);
        if((i & 8) == 0)
        {
            return;
        } else
        {
            func_27046_f(p_208_1_, p_208_2_, p_208_3_, p_208_4_, i);
            return;
        }
    }

    public boolean func_231_b(IBlockAccess p_231_1_, int p_231_2_, int p_231_3_, int p_231_4_, int p_231_5_)
    {
        return (p_231_1_.func_602_e(p_231_2_, p_231_3_, p_231_4_) & 8) != 0;
    }

    public boolean func_228_c(World p_228_1_, int p_228_2_, int p_228_3_, int p_228_4_, int p_228_5_)
    {
        if((p_228_1_.func_602_e(p_228_2_, p_228_3_, p_228_4_) & 8) == 0)
        {
            return false;
        } else
        {
            return p_228_5_ == 1;
        }
    }

    private void func_27046_f(World p_27046_1_, int p_27046_2_, int p_27046_3_, int p_27046_4_, int p_27046_5_)
    {
        boolean flag = (p_27046_5_ & 8) != 0;
        boolean flag1 = false;
        float f = 0.125F;
        List list = p_27046_1_.func_657_a(net.minecraft.src.EntityMinecart.class, AxisAlignedBB.func_1161_b((float)p_27046_2_ + f, p_27046_3_, (float)p_27046_4_ + f, (float)(p_27046_2_ + 1) - f, (float)(p_27046_3_ + 1) - f, (float)(p_27046_4_ + 1) - f));
        if(list.size() > 0)
        {
            flag1 = true;
        }
        if(flag1 && !flag)
        {
            p_27046_1_.func_691_b(p_27046_2_, p_27046_3_, p_27046_4_, p_27046_5_ | 8);
            p_27046_1_.func_611_g(p_27046_2_, p_27046_3_, p_27046_4_, field_376_bc);
            p_27046_1_.func_611_g(p_27046_2_, p_27046_3_ - 1, p_27046_4_, field_376_bc);
            p_27046_1_.func_701_b(p_27046_2_, p_27046_3_, p_27046_4_, p_27046_2_, p_27046_3_, p_27046_4_);
        }
        if(!flag1 && flag)
        {
            p_27046_1_.func_691_b(p_27046_2_, p_27046_3_, p_27046_4_, p_27046_5_ & 7);
            p_27046_1_.func_611_g(p_27046_2_, p_27046_3_, p_27046_4_, field_376_bc);
            p_27046_1_.func_611_g(p_27046_2_, p_27046_3_ - 1, p_27046_4_, field_376_bc);
            p_27046_1_.func_701_b(p_27046_2_, p_27046_3_, p_27046_4_, p_27046_2_, p_27046_3_, p_27046_4_);
        }
        if(flag1)
        {
            p_27046_1_.func_22136_c(p_27046_2_, p_27046_3_, p_27046_4_, field_376_bc, func_4025_d());
        }
    }
}
