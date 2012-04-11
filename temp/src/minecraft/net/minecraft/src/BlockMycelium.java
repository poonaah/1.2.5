// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, IBlockAccess, World

public class BlockMycelium extends Block
{

    protected BlockMycelium(int p_i207_1_)
    {
        super(p_i207_1_, Material.field_28130_b);
        field_378_bb = 77;
        func_253_b(true);
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        if(p_232_1_ == 1)
        {
            return 78;
        }
        return p_232_1_ != 0 ? 77 : 2;
    }

    public int func_211_a(IBlockAccess p_211_1_, int p_211_2_, int p_211_3_, int p_211_4_, int p_211_5_)
    {
        if(p_211_5_ == 1)
        {
            return 78;
        }
        if(p_211_5_ == 0)
        {
            return 2;
        }
        Material material = p_211_1_.func_599_f(p_211_2_, p_211_3_ + 1, p_211_4_);
        return material != Material.field_1319_s && material != Material.field_1318_t ? 77 : 68;
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        if(p_208_1_.field_1026_y)
        {
            return;
        }
        if(p_208_1_.func_618_j(p_208_2_, p_208_3_ + 1, p_208_4_) < 4 && Block.field_341_r[p_208_1_.func_600_a(p_208_2_, p_208_3_ + 1, p_208_4_)] > 2)
        {
            p_208_1_.func_690_d(p_208_2_, p_208_3_, p_208_4_, Block.field_336_w.field_376_bc);
        } else
        if(p_208_1_.func_618_j(p_208_2_, p_208_3_ + 1, p_208_4_) >= 9)
        {
            for(int i = 0; i < 4; i++)
            {
                int j = (p_208_2_ + p_208_5_.nextInt(3)) - 1;
                int k = (p_208_3_ + p_208_5_.nextInt(5)) - 3;
                int l = (p_208_4_ + p_208_5_.nextInt(3)) - 1;
                int i1 = p_208_1_.func_600_a(j, k + 1, l);
                if(p_208_1_.func_600_a(j, k, l) == Block.field_336_w.field_376_bc && p_208_1_.func_618_j(j, k + 1, l) >= 4 && Block.field_341_r[i1] <= 2)
                {
                    p_208_1_.func_690_d(j, k, l, field_376_bc);
                }
            }

        }
    }

    public void func_247_b(World p_247_1_, int p_247_2_, int p_247_3_, int p_247_4_, Random p_247_5_)
    {
        super.func_247_b(p_247_1_, p_247_2_, p_247_3_, p_247_4_, p_247_5_);
        if(p_247_5_.nextInt(10) == 0)
        {
            p_247_1_.func_694_a("townaura", (float)p_247_2_ + p_247_5_.nextFloat(), (float)p_247_3_ + 1.1F, (float)p_247_4_ + p_247_5_.nextFloat(), 0.0D, 0.0D, 0.0D);
        }
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Block.field_336_w.func_240_a(0, p_240_2_, p_240_3_);
    }
}
