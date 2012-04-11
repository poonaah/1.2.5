// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, IBlockAccess, World

public class BlockLockedChest extends Block
{

    protected BlockLockedChest(int p_i775_1_)
    {
        super(p_i775_1_, Material.field_1335_c);
        field_378_bb = 26;
    }

    public int func_211_a(IBlockAccess p_211_1_, int p_211_2_, int p_211_3_, int p_211_4_, int p_211_5_)
    {
        if(p_211_5_ == 1)
        {
            return field_378_bb - 1;
        }
        if(p_211_5_ == 0)
        {
            return field_378_bb - 1;
        }
        int i = p_211_1_.func_600_a(p_211_2_, p_211_3_, p_211_4_ - 1);
        int j = p_211_1_.func_600_a(p_211_2_, p_211_3_, p_211_4_ + 1);
        int k = p_211_1_.func_600_a(p_211_2_ - 1, p_211_3_, p_211_4_);
        int l = p_211_1_.func_600_a(p_211_2_ + 1, p_211_3_, p_211_4_);
        byte byte0 = 3;
        if(Block.field_343_p[i] && !Block.field_343_p[j])
        {
            byte0 = 3;
        }
        if(Block.field_343_p[j] && !Block.field_343_p[i])
        {
            byte0 = 2;
        }
        if(Block.field_343_p[k] && !Block.field_343_p[l])
        {
            byte0 = 5;
        }
        if(Block.field_343_p[l] && !Block.field_343_p[k])
        {
            byte0 = 4;
        }
        return p_211_5_ != byte0 ? field_378_bb : field_378_bb + 1;
    }

    public int func_218_a(int p_218_1_)
    {
        if(p_218_1_ == 1)
        {
            return field_378_bb - 1;
        }
        if(p_218_1_ == 0)
        {
            return field_378_bb - 1;
        }
        if(p_218_1_ == 3)
        {
            return field_378_bb + 1;
        } else
        {
            return field_378_bb;
        }
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int i)
    {
        return true;
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        p_208_1_.func_690_d(p_208_2_, p_208_3_, p_208_4_, 0);
    }
}
