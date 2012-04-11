// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemBlock, Block

public class ItemMetadata extends ItemBlock
{

    private Block field_35437_a;

    public ItemMetadata(int p_i759_1_, Block p_i759_2_)
    {
        super(p_i759_1_);
        field_35437_a = p_i759_2_;
        func_21013_d(0);
        func_21015_a(true);
    }

    public int func_27009_a(int p_27009_1_)
    {
        return field_35437_a.func_232_a(2, p_27009_1_);
    }

    public int func_21012_a(int p_21012_1_)
    {
        return p_21012_1_;
    }
}
