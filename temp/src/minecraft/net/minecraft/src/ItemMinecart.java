// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, World, BlockRail, EntityMinecart, 
//            ItemStack, EntityPlayer

public class ItemMinecart extends Item
{

    public int field_317_a;

    public ItemMinecart(int p_i110_1_, int p_i110_2_)
    {
        super(p_i110_1_);
        field_290_aT = 1;
        field_317_a = p_i110_2_;
    }

    public boolean func_192_a(ItemStack p_192_1_, EntityPlayer p_192_2_, World p_192_3_, int p_192_4_, int p_192_5_, int p_192_6_, int p_192_7_)
    {
        int i = p_192_3_.func_600_a(p_192_4_, p_192_5_, p_192_6_);
        if(BlockRail.func_27041_c(i))
        {
            if(!p_192_3_.field_1026_y)
            {
                p_192_3_.func_674_a(new EntityMinecart(p_192_3_, (float)p_192_4_ + 0.5F, (float)p_192_5_ + 0.5F, (float)p_192_6_ + 0.5F, field_317_a));
            }
            p_192_1_.field_1615_a--;
            return true;
        } else
        {
            return false;
        }
    }
}
