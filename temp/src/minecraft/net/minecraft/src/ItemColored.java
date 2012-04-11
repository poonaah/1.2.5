// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemBlock, Block, ItemStack

public class ItemColored extends ItemBlock
{

    private final Block field_35436_a;
    private String field_41034_b[];

    public ItemColored(int p_i189_1_, boolean p_i189_2_)
    {
        super(p_i189_1_);
        field_35436_a = Block.field_345_n[func_35435_b()];
        if(p_i189_2_)
        {
            func_21013_d(0);
            func_21015_a(true);
        }
    }

    public int func_27010_f(int p_27010_1_, int p_27010_2_)
    {
        return field_35436_a.func_31030_b(p_27010_1_);
    }

    public int func_27009_a(int p_27009_1_)
    {
        return field_35436_a.func_232_a(0, p_27009_1_);
    }

    public int func_21012_a(int p_21012_1_)
    {
        return p_21012_1_;
    }

    public ItemColored func_41033_a(String p_41033_1_[])
    {
        field_41034_b = p_41033_1_;
        return this;
    }

    public String func_21011_b(ItemStack p_21011_1_)
    {
        if(field_41034_b == null)
        {
            return super.func_21011_b(p_21011_1_);
        }
        int i = p_21011_1_.func_21181_i();
        if(i >= 0 && i < field_41034_b.length)
        {
            return (new StringBuilder()).append(super.func_21011_b(p_21011_1_)).append(".").append(field_41034_b[i]).toString();
        } else
        {
            return super.func_21011_b(p_21011_1_);
        }
    }
}
