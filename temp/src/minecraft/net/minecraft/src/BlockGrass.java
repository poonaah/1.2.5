// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, IBlockAccess, ColorizerGrass, 
//            BiomeGenBase, World

public class BlockGrass extends Block
{

    protected BlockGrass(int p_i563_1_)
    {
        super(p_i563_1_, Material.field_28130_b);
        field_378_bb = 3;
        func_253_b(true);
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        if(p_232_1_ == 1)
        {
            return 0;
        }
        return p_232_1_ != 0 ? 3 : 2;
    }

    public int func_211_a(IBlockAccess p_211_1_, int p_211_2_, int p_211_3_, int p_211_4_, int p_211_5_)
    {
        if(p_211_5_ == 1)
        {
            return 0;
        }
        if(p_211_5_ == 0)
        {
            return 2;
        }
        Material material = p_211_1_.func_599_f(p_211_2_, p_211_3_ + 1, p_211_4_);
        return material != Material.field_1319_s && material != Material.field_1318_t ? 3 : 68;
    }

    public int func_35274_i()
    {
        double d = 0.5D;
        double d1 = 1.0D;
        return ColorizerGrass.func_4147_a(d, d1);
    }

    public int func_31030_b(int p_31030_1_)
    {
        return func_35274_i();
    }

    public int func_207_d(IBlockAccess p_207_1_, int p_207_2_, int p_207_3_, int p_207_4_)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        for(int l = -1; l <= 1; l++)
        {
            for(int i1 = -1; i1 <= 1; i1++)
            {
                int j1 = p_207_1_.func_48454_a(p_207_2_ + i1, p_207_4_ + l).func_48415_j();
                i += (j1 & 0xff0000) >> 16;
                j += (j1 & 0xff00) >> 8;
                k += j1 & 0xff;
            }

        }

        return (i / 9 & 0xff) << 16 | (j / 9 & 0xff) << 8 | k / 9 & 0xff;
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
                    p_208_1_.func_690_d(j, k, l, Block.field_337_v.field_376_bc);
                }
            }

        }
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Block.field_336_w.func_240_a(0, p_240_2_, p_240_3_);
    }
}
