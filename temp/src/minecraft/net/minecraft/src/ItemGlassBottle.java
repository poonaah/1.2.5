// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, MovingObjectPosition, EnumMovingObjectType, World, 
//            EntityPlayer, Material, ItemStack, InventoryPlayer, 
//            ItemPotion

public class ItemGlassBottle extends Item
{

    public ItemGlassBottle(int p_i145_1_)
    {
        super(p_i145_1_);
    }

    public ItemStack func_193_a(ItemStack p_193_1_, World p_193_2_, EntityPlayer p_193_3_)
    {
        MovingObjectPosition movingobjectposition = func_40402_a(p_193_2_, p_193_3_, true);
        if(movingobjectposition == null)
        {
            return p_193_1_;
        }
        if(movingobjectposition.field_1167_a == EnumMovingObjectType.TILE)
        {
            int i = movingobjectposition.field_1166_b;
            int j = movingobjectposition.field_1172_c;
            int k = movingobjectposition.field_1171_d;
            if(!p_193_2_.func_6466_a(p_193_3_, i, j, k))
            {
                return p_193_1_;
            }
            if(!p_193_3_.func_35190_e(i, j, k))
            {
                return p_193_1_;
            }
            if(p_193_2_.func_599_f(i, j, k) == Material.field_1332_f)
            {
                p_193_1_.field_1615_a--;
                if(p_193_1_.field_1615_a <= 0)
                {
                    return new ItemStack(Item.field_40413_bs);
                }
                if(!p_193_3_.field_778_b.func_504_a(new ItemStack(Item.field_40413_bs)))
                {
                    p_193_3_.func_48153_a(new ItemStack(Item.field_40413_bs.field_291_aS, 1, 0));
                }
            }
        }
        return p_193_1_;
    }
}
