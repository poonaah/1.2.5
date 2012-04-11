// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material

public class BlockSandStone extends Block
{

    public BlockSandStone(int p_i461_1_)
    {
        super(p_i461_1_, 192, Material.field_1334_d);
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        if(p_232_1_ == 1 || p_232_1_ == 0 && (p_232_2_ == 1 || p_232_2_ == 2))
        {
            return 176;
        }
        if(p_232_1_ == 0)
        {
            return 208;
        }
        if(p_232_2_ == 1)
        {
            return 229;
        }
        return p_232_2_ != 2 ? 192 : 230;
    }

    public int func_218_a(int p_218_1_)
    {
        if(p_218_1_ == 1)
        {
            return field_378_bb - 16;
        }
        if(p_218_1_ == 0)
        {
            return field_378_bb + 16;
        } else
        {
            return field_378_bb;
        }
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return p_21025_1_;
    }
}
