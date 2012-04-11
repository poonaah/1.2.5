// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, EntityPlayer, EntityPainting, World, 
//            ItemStack

public class ItemPainting extends Item
{

    public ItemPainting(int p_i216_1_)
    {
        super(p_i216_1_);
    }

    public boolean func_192_a(ItemStack p_192_1_, EntityPlayer p_192_2_, World p_192_3_, int p_192_4_, int p_192_5_, int p_192_6_, int p_192_7_)
    {
        if(p_192_7_ == 0)
        {
            return false;
        }
        if(p_192_7_ == 1)
        {
            return false;
        }
        byte byte0 = 0;
        if(p_192_7_ == 4)
        {
            byte0 = 1;
        }
        if(p_192_7_ == 3)
        {
            byte0 = 2;
        }
        if(p_192_7_ == 5)
        {
            byte0 = 3;
        }
        if(!p_192_2_.func_35190_e(p_192_4_, p_192_5_, p_192_6_))
        {
            return false;
        }
        EntityPainting entitypainting = new EntityPainting(p_192_3_, p_192_4_, p_192_5_, p_192_6_, byte0);
        if(entitypainting.func_410_i())
        {
            if(!p_192_3_.field_1026_y)
            {
                p_192_3_.func_674_a(entitypainting);
            }
            p_192_1_.field_1615_a--;
        }
        return true;
    }
}
