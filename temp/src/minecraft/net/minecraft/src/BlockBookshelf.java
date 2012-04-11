// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, Item

public class BlockBookshelf extends Block
{

    public BlockBookshelf(int p_i319_1_, int p_i319_2_)
    {
        super(p_i319_1_, p_i319_2_, Material.field_1335_c);
    }

    public int func_218_a(int p_218_1_)
    {
        if(p_218_1_ <= 1)
        {
            return 4;
        } else
        {
            return field_378_bb;
        }
    }

    public int func_229_a(Random p_229_1_)
    {
        return 3;
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Item.field_4028_aJ.field_291_aS;
    }
}
