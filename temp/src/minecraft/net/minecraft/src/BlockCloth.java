// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material

public class BlockCloth extends Block
{

    public BlockCloth()
    {
        super(35, 64, Material.field_4264_k);
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        if(p_232_2_ == 0)
        {
            return field_378_bb;
        } else
        {
            p_232_2_ = ~(p_232_2_ & 0xf);
            return 113 + ((p_232_2_ & 8) >> 3) + (p_232_2_ & 7) * 16;
        }
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return p_21025_1_;
    }

    public static int func_21034_c(int p_21034_0_)
    {
        return ~p_21034_0_ & 0xf;
    }

    public static int func_21035_d(int p_21035_0_)
    {
        return ~p_21035_0_ & 0xf;
    }
}
