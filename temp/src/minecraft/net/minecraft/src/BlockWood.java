// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material

public class BlockWood extends Block
{

    public BlockWood(int p_i1205_1_)
    {
        super(p_i1205_1_, 4, Material.field_1335_c);
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        switch(p_232_2_)
        {
        default:
            return 4;

        case 1: // '\001'
            return 198;

        case 2: // '\002'
            return 214;

        case 3: // '\003'
            return 199;
        }
    }

    protected int func_21025_b(int p_21025_1_)
    {
        return p_21025_1_;
    }
}
