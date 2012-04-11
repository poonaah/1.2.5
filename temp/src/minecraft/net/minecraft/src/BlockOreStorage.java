// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Block, Material

public class BlockOreStorage extends Block
{

    public BlockOreStorage(int p_i601_1_, int p_i601_2_)
    {
        super(p_i601_1_, Material.field_1333_e);
        field_378_bb = p_i601_2_;
    }

    public int func_218_a(int p_218_1_)
    {
        return field_378_bb;
    }
}
