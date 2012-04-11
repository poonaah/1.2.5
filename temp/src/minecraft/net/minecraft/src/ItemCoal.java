// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, ItemStack

public class ItemCoal extends Item
{

    public ItemCoal(int p_i471_1_)
    {
        super(p_i471_1_);
        func_21015_a(true);
        func_21013_d(0);
    }

    public String func_21011_b(ItemStack p_21011_1_)
    {
        if(p_21011_1_.func_21181_i() == 1)
        {
            return "item.charcoal";
        } else
        {
            return "item.coal";
        }
    }
}
