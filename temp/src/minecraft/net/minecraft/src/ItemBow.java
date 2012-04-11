// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Item, EntityPlayer, PlayerCapabilities, Enchantment, 
//            EnchantmentHelper, InventoryPlayer, EntityArrow, ItemStack, 
//            World, EnumAction

public class ItemBow extends Item
{

    public ItemBow(int p_i459_1_)
    {
        super(p_i459_1_);
        field_290_aT = 1;
        func_21013_d(384);
    }

    public void func_35414_a(ItemStack p_35414_1_, World p_35414_2_, EntityPlayer p_35414_3_, int p_35414_4_)
    {
        boolean flag = p_35414_3_.field_35212_aW.field_35756_d || EnchantmentHelper.func_40634_b(Enchantment.field_46042_v.field_40516_s, p_35414_1_) > 0;
        if(flag || p_35414_3_.field_778_b.func_35157_d(Item.field_226_j.field_291_aS))
        {
            int i = func_35411_c(p_35414_1_) - p_35414_4_;
            float f = (float)i / 20F;
            f = (f * f + f * 2.0F) / 3F;
            if((double)f < 0.10000000000000001D)
            {
                return;
            }
            if(f > 1.0F)
            {
                f = 1.0F;
            }
            EntityArrow entityarrow = new EntityArrow(p_35414_2_, p_35414_3_, f * 2.0F);
            if(f == 1.0F)
            {
                entityarrow.field_35140_d = true;
            }
            int j = EnchantmentHelper.func_40634_b(Enchantment.field_46045_s.field_40516_s, p_35414_1_);
            if(j > 0)
            {
                entityarrow.func_46024_b(entityarrow.func_46025_l() + (double)j * 0.5D + 0.5D);
            }
            int k = EnchantmentHelper.func_40634_b(Enchantment.field_46044_t.field_40516_s, p_35414_1_);
            if(k > 0)
            {
                entityarrow.func_46023_b(k);
            }
            if(EnchantmentHelper.func_40634_b(Enchantment.field_46043_u.field_40516_s, p_35414_1_) > 0)
            {
                entityarrow.func_40046_d(100);
            }
            p_35414_1_.func_25190_a(1, p_35414_3_);
            p_35414_2_.func_623_a(p_35414_3_, "random.bow", 1.0F, 1.0F / (field_4015_b.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
            if(!flag)
            {
                p_35414_3_.field_778_b.func_510_b(Item.field_226_j.field_291_aS);
            } else
            {
                entityarrow.field_28020_a = false;
            }
            if(!p_35414_2_.field_1026_y)
            {
                p_35414_2_.func_674_a(entityarrow);
            }
        }
    }

    public ItemStack func_35413_b(ItemStack p_35413_1_, World p_35413_2_, EntityPlayer p_35413_3_)
    {
        return p_35413_1_;
    }

    public int func_35411_c(ItemStack p_35411_1_)
    {
        return 0x11940;
    }

    public EnumAction func_35412_b(ItemStack p_35412_1_)
    {
        return EnumAction.bow;
    }

    public ItemStack func_193_a(ItemStack p_193_1_, World p_193_2_, EntityPlayer p_193_3_)
    {
        if(p_193_3_.field_35212_aW.field_35756_d || p_193_3_.field_778_b.func_35157_d(Item.field_226_j.field_291_aS))
        {
            p_193_3_.func_35199_b(p_193_1_, func_35411_c(p_193_1_));
        }
        return p_193_1_;
    }

    public int func_40399_b()
    {
        return 1;
    }
}
