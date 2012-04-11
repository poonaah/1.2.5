// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemColored, MovingObjectPosition, EnumMovingObjectType, World, 
//            EntityPlayer, Material, Block, PlayerCapabilities, 
//            ItemStack

public class ItemLilyPad extends ItemColored
{

    public ItemLilyPad(int p_i109_1_)
    {
        super(p_i109_1_, false);
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
            if(p_193_2_.func_599_f(i, j, k) == Material.field_1332_f && p_193_2_.func_602_e(i, j, k) == 0 && p_193_2_.func_20084_d(i, j + 1, k))
            {
                p_193_2_.func_690_d(i, j + 1, k, Block.field_40200_bA.field_376_bc);
                if(!p_193_3_.field_35212_aW.field_35756_d)
                {
                    p_193_1_.field_1615_a--;
                }
            }
        }
        return p_193_1_;
    }

    public int func_27010_f(int p_27010_1_, int p_27010_2_)
    {
        return Block.field_40200_bA.func_31030_b(p_27010_1_);
    }
}
