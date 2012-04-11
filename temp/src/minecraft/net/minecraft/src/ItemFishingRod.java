// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Item, EntityPlayer, EntityFishHook, ItemStack, 
//            World

public class ItemFishingRod extends Item
{

    public ItemFishingRod(int p_i646_1_)
    {
        super(p_i646_1_);
        func_21013_d(64);
        func_21009_c(1);
    }

    public boolean func_4017_a()
    {
        return true;
    }

    public boolean func_4023_b()
    {
        return true;
    }

    public ItemStack func_193_a(ItemStack p_193_1_, World p_193_2_, EntityPlayer p_193_3_)
    {
        if(p_193_3_.field_4128_n != null)
        {
            int i = p_193_3_.field_4128_n.func_4043_i();
            p_193_1_.func_25190_a(i, p_193_3_);
            p_193_3_.func_457_w();
        } else
        {
            p_193_2_.func_623_a(p_193_3_, "random.bow", 0.5F, 0.4F / (field_4015_b.nextFloat() * 0.4F + 0.8F));
            if(!p_193_2_.field_1026_y)
            {
                p_193_2_.func_674_a(new EntityFishHook(p_193_2_, p_193_3_));
            }
            p_193_3_.func_457_w();
        }
        return p_193_1_;
    }
}
