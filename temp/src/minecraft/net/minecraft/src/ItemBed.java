// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, Block, BlockBed, EntityPlayer, 
//            MathHelper, World, ItemStack

public class ItemBed extends Item
{

    public ItemBed(int p_i18_1_)
    {
        super(p_i18_1_);
    }

    public boolean func_192_a(ItemStack p_192_1_, EntityPlayer p_192_2_, World p_192_3_, int p_192_4_, int p_192_5_, int p_192_6_, int p_192_7_)
    {
        if(p_192_7_ != 1)
        {
            return false;
        }
        p_192_5_++;
        BlockBed blockbed = (BlockBed)Block.field_9262_S;
        int i = MathHelper.func_1108_b((double)((p_192_2_.field_605_aq * 4F) / 360F) + 0.5D) & 3;
        byte byte0 = 0;
        byte byte1 = 0;
        if(i == 0)
        {
            byte1 = 1;
        }
        if(i == 1)
        {
            byte0 = -1;
        }
        if(i == 2)
        {
            byte1 = -1;
        }
        if(i == 3)
        {
            byte0 = 1;
        }
        if(!p_192_2_.func_35190_e(p_192_4_, p_192_5_, p_192_6_) || !p_192_2_.func_35190_e(p_192_4_ + byte0, p_192_5_, p_192_6_ + byte1))
        {
            return false;
        }
        if(p_192_3_.func_20084_d(p_192_4_, p_192_5_, p_192_6_) && p_192_3_.func_20084_d(p_192_4_ + byte0, p_192_5_, p_192_6_ + byte1) && p_192_3_.func_28100_h(p_192_4_, p_192_5_ - 1, p_192_6_) && p_192_3_.func_28100_h(p_192_4_ + byte0, p_192_5_ - 1, p_192_6_ + byte1))
        {
            p_192_3_.func_688_b(p_192_4_, p_192_5_, p_192_6_, blockbed.field_376_bc, i);
            if(p_192_3_.func_600_a(p_192_4_, p_192_5_, p_192_6_) == blockbed.field_376_bc)
            {
                p_192_3_.func_688_b(p_192_4_ + byte0, p_192_5_, p_192_6_ + byte1, blockbed.field_376_bc, i + 8);
            }
            p_192_1_.field_1615_a--;
            return true;
        } else
        {
            return false;
        }
    }
}
