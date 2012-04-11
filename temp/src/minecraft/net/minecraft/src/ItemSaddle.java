// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, EntityPig, ItemStack, EntityLiving

public class ItemSaddle extends Item
{

    public ItemSaddle(int p_i472_1_)
    {
        super(p_i472_1_);
        field_290_aT = 1;
    }

    public void func_4019_b(ItemStack p_4019_1_, EntityLiving p_4019_2_)
    {
        if(p_4019_2_ instanceof EntityPig)
        {
            EntityPig entitypig = (EntityPig)p_4019_2_;
            if(!entitypig.func_21068_q() && !entitypig.func_40127_l())
            {
                entitypig.func_21069_a(true);
                p_4019_1_.field_1615_a--;
            }
        }
    }

    public boolean func_4021_a(ItemStack p_4021_1_, EntityLiving p_4021_2_, EntityLiving p_4021_3_)
    {
        func_4019_b(p_4021_1_, p_4021_2_);
        return true;
    }
}
