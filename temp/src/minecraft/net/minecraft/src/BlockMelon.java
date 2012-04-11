// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, Item

public class BlockMelon extends Block
{

    protected BlockMelon(int p_i293_1_)
    {
        super(p_i293_1_, Material.field_4261_w);
        field_378_bb = 136;
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        return p_232_1_ != 1 && p_232_1_ != 0 ? 136 : 137;
    }

    public int func_218_a(int p_218_1_)
    {
        return p_218_1_ != 1 && p_218_1_ != 0 ? 136 : 137;
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Item.field_35421_bg.field_291_aS;
    }

    public int func_229_a(Random p_229_1_)
    {
        return 3 + p_229_1_.nextInt(5);
    }

    public int func_40198_a(int p_40198_1_, Random p_40198_2_)
    {
        int i = func_229_a(p_40198_2_) + p_40198_2_.nextInt(1 + p_40198_1_);
        if(i > 9)
        {
            i = 9;
        }
        return i;
    }
}
