// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, Item

public class BlockOre extends Block
{

    public BlockOre(int p_i392_1_, int p_i392_2_)
    {
        super(p_i392_1_, p_i392_2_, Material.field_1334_d);
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        if(field_376_bc == Block.field_386_J.field_376_bc)
        {
            return Item.field_225_k.field_291_aS;
        }
        if(field_376_bc == Block.field_391_ax.field_376_bc)
        {
            return Item.field_224_l.field_291_aS;
        }
        if(field_376_bc == Block.field_9267_N.field_376_bc)
        {
            return Item.field_21021_aU.field_291_aS;
        } else
        {
            return field_376_bc;
        }
    }

    public int func_229_a(Random p_229_1_)
    {
        if(field_376_bc == Block.field_9267_N.field_376_bc)
        {
            return 4 + p_229_1_.nextInt(5);
        } else
        {
            return 1;
        }
    }

    public int func_40198_a(int p_40198_1_, Random p_40198_2_)
    {
        if(p_40198_1_ > 0 && field_376_bc != func_240_a(0, p_40198_2_, p_40198_1_))
        {
            int i = p_40198_2_.nextInt(p_40198_1_ + 2) - 1;
            if(i < 0)
            {
                i = 0;
            }
            return func_229_a(p_40198_2_) * (i + 1);
        } else
        {
            return func_229_a(p_40198_2_);
        }
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return field_376_bc != Block.field_9267_N.field_376_bc ? 0 : 4;
    }
}
