// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemBlock, Block, BlockLeaves, ColorizerFoliage

public class ItemLeaves extends ItemBlock
{

    public ItemLeaves(int p_i513_1_)
    {
        super(p_i513_1_);
        func_21013_d(0);
        func_21015_a(true);
    }

    public int func_21012_a(int p_21012_1_)
    {
        return p_21012_1_ | 4;
    }

    public int func_27009_a(int p_27009_1_)
    {
        return Block.field_384_L.func_232_a(0, p_27009_1_);
    }

    public int func_27010_f(int p_27010_1_, int p_27010_2_)
    {
        if((p_27010_1_ & 1) == 1)
        {
            return ColorizerFoliage.func_21175_a();
        }
        if((p_27010_1_ & 2) == 2)
        {
            return ColorizerFoliage.func_21174_b();
        } else
        {
            return ColorizerFoliage.func_31073_c();
        }
    }
}
