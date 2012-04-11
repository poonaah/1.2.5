// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, Material, Block, EntityPlayer, 
//            MathHelper, ItemStack, World

public class ItemDoor extends Item
{

    private Material field_321_a;

    public ItemDoor(int p_i723_1_, Material p_i723_2_)
    {
        super(p_i723_1_);
        field_321_a = p_i723_2_;
        field_290_aT = 1;
    }

    public boolean func_192_a(ItemStack p_192_1_, EntityPlayer p_192_2_, World p_192_3_, int p_192_4_, int p_192_5_, int p_192_6_, int p_192_7_)
    {
        if(p_192_7_ != 1)
        {
            return false;
        }
        p_192_5_++;
        Block block;
        if(field_321_a == Material.field_1335_c)
        {
            block = Block.field_442_aF;
        } else
        {
            block = Block.field_435_aM;
        }
        if(!p_192_2_.func_35190_e(p_192_4_, p_192_5_, p_192_6_) || !p_192_2_.func_35190_e(p_192_4_, p_192_5_ + 1, p_192_6_))
        {
            return false;
        }
        if(!block.func_243_a(p_192_3_, p_192_4_, p_192_5_, p_192_6_))
        {
            return false;
        } else
        {
            int i = MathHelper.func_1108_b((double)(((p_192_2_.field_605_aq + 180F) * 4F) / 360F) - 0.5D) & 3;
            func_35434_a(p_192_3_, p_192_4_, p_192_5_, p_192_6_, i, block);
            p_192_1_.field_1615_a--;
            return true;
        }
    }

    public static void func_35434_a(World p_35434_0_, int p_35434_1_, int p_35434_2_, int p_35434_3_, int p_35434_4_, Block p_35434_5_)
    {
        byte byte0 = 0;
        byte byte1 = 0;
        if(p_35434_4_ == 0)
        {
            byte1 = 1;
        }
        if(p_35434_4_ == 1)
        {
            byte0 = -1;
        }
        if(p_35434_4_ == 2)
        {
            byte1 = -1;
        }
        if(p_35434_4_ == 3)
        {
            byte0 = 1;
        }
        int i = (p_35434_0_.func_28100_h(p_35434_1_ - byte0, p_35434_2_, p_35434_3_ - byte1) ? 1 : 0) + (p_35434_0_.func_28100_h(p_35434_1_ - byte0, p_35434_2_ + 1, p_35434_3_ - byte1) ? 1 : 0);
        int j = (p_35434_0_.func_28100_h(p_35434_1_ + byte0, p_35434_2_, p_35434_3_ + byte1) ? 1 : 0) + (p_35434_0_.func_28100_h(p_35434_1_ + byte0, p_35434_2_ + 1, p_35434_3_ + byte1) ? 1 : 0);
        boolean flag = p_35434_0_.func_600_a(p_35434_1_ - byte0, p_35434_2_, p_35434_3_ - byte1) == p_35434_5_.field_376_bc || p_35434_0_.func_600_a(p_35434_1_ - byte0, p_35434_2_ + 1, p_35434_3_ - byte1) == p_35434_5_.field_376_bc;
        boolean flag1 = p_35434_0_.func_600_a(p_35434_1_ + byte0, p_35434_2_, p_35434_3_ + byte1) == p_35434_5_.field_376_bc || p_35434_0_.func_600_a(p_35434_1_ + byte0, p_35434_2_ + 1, p_35434_3_ + byte1) == p_35434_5_.field_376_bc;
        boolean flag2 = false;
        if(flag && !flag1)
        {
            flag2 = true;
        } else
        if(j > i)
        {
            flag2 = true;
        }
        p_35434_0_.field_1043_h = true;
        p_35434_0_.func_688_b(p_35434_1_, p_35434_2_, p_35434_3_, p_35434_5_.field_376_bc, p_35434_4_);
        p_35434_0_.func_688_b(p_35434_1_, p_35434_2_ + 1, p_35434_3_, p_35434_5_.field_376_bc, 8 | (flag2 ? 1 : 0));
        p_35434_0_.field_1043_h = false;
        p_35434_0_.func_611_g(p_35434_1_, p_35434_2_, p_35434_3_, p_35434_5_.field_376_bc);
        p_35434_0_.func_611_g(p_35434_1_, p_35434_2_ + 1, p_35434_3_, p_35434_5_.field_376_bc);
    }
}
