// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, EntityLiving, 
//            MathHelper, AxisAlignedBB

public class BlockEndPortalFrame extends Block
{

    public BlockEndPortalFrame(int p_i221_1_)
    {
        super(p_i221_1_, 159, Material.field_4263_o);
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        if(p_232_1_ == 1)
        {
            return field_378_bb - 1;
        }
        if(p_232_1_ == 0)
        {
            return field_378_bb + 16;
        } else
        {
            return field_378_bb;
        }
    }

    public boolean func_217_b()
    {
        return false;
    }

    public int func_210_f()
    {
        return 26;
    }

    public void func_237_e()
    {
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
    }

    public void func_230_a(World p_230_1_, int p_230_2_, int p_230_3_, int p_230_4_, AxisAlignedBB p_230_5_, ArrayList p_230_6_)
    {
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
        super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
        int i = p_230_1_.func_602_e(p_230_2_, p_230_3_, p_230_4_);
        if(func_40212_d(i))
        {
            func_213_a(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
            super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
        }
        func_237_e();
    }

    public static boolean func_40212_d(int p_40212_0_)
    {
        return (p_40212_0_ & 4) != 0;
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return 0;
    }

    public void func_4026_a(World p_4026_1_, int p_4026_2_, int p_4026_3_, int p_4026_4_, EntityLiving p_4026_5_)
    {
        int i = ((MathHelper.func_1108_b((double)((p_4026_5_.field_605_aq * 4F) / 360F) + 0.5D) & 3) + 2) % 4;
        p_4026_1_.func_691_b(p_4026_2_, p_4026_3_, p_4026_4_, i);
    }
}
