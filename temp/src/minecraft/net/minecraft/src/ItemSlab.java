// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemBlock, Block, ItemStack, BlockStep, 
//            EntityPlayer, World, StepSound

public class ItemSlab extends ItemBlock
{

    public ItemSlab(int p_i666_1_)
    {
        super(p_i666_1_);
        func_21013_d(0);
        func_21015_a(true);
    }

    public int func_27009_a(int p_27009_1_)
    {
        return Block.field_410_al.func_232_a(2, p_27009_1_);
    }

    public int func_21012_a(int p_21012_1_)
    {
        return p_21012_1_;
    }

    public String func_21011_b(ItemStack p_21011_1_)
    {
        int i = p_21011_1_.func_21181_i();
        if(i < 0 || i >= BlockStep.field_22037_a.length)
        {
            i = 0;
        }
        return (new StringBuilder()).append(super.func_20009_a()).append(".").append(BlockStep.field_22037_a[i]).toString();
    }

    public boolean func_192_a(ItemStack p_192_1_, EntityPlayer p_192_2_, World p_192_3_, int p_192_4_, int p_192_5_, int p_192_6_, int p_192_7_)
    {
        if(p_192_1_.field_1615_a == 0)
        {
            return false;
        }
        if(!p_192_2_.func_35190_e(p_192_4_, p_192_5_, p_192_6_))
        {
            return false;
        }
        int i = p_192_3_.func_600_a(p_192_4_, p_192_5_, p_192_6_);
        int j = p_192_3_.func_602_e(p_192_4_, p_192_5_, p_192_6_);
        int k = j & 7;
        boolean flag = (j & 8) != 0;
        if((p_192_7_ == 1 && !flag || p_192_7_ == 0 && flag) && i == Block.field_410_al.field_376_bc && k == p_192_1_.func_21181_i())
        {
            if(p_192_3_.func_604_a(Block.field_411_ak.func_221_d(p_192_3_, p_192_4_, p_192_5_, p_192_6_)) && p_192_3_.func_688_b(p_192_4_, p_192_5_, p_192_6_, Block.field_411_ak.field_376_bc, k))
            {
                p_192_3_.func_684_a((float)p_192_4_ + 0.5F, (float)p_192_5_ + 0.5F, (float)p_192_6_ + 0.5F, Block.field_411_ak.field_358_bl.func_1145_d(), (Block.field_411_ak.field_358_bl.func_1147_b() + 1.0F) / 2.0F, Block.field_411_ak.field_358_bl.func_1144_c() * 0.8F);
                p_192_1_.field_1615_a--;
            }
            return true;
        }
        if(func_50087_b(p_192_1_, p_192_2_, p_192_3_, p_192_4_, p_192_5_, p_192_6_, p_192_7_))
        {
            return true;
        } else
        {
            return super.func_192_a(p_192_1_, p_192_2_, p_192_3_, p_192_4_, p_192_5_, p_192_6_, p_192_7_);
        }
    }

    private static boolean func_50087_b(ItemStack p_50087_0_, EntityPlayer p_50087_1_, World p_50087_2_, int p_50087_3_, int p_50087_4_, int p_50087_5_, int p_50087_6_)
    {
        if(p_50087_6_ == 0)
        {
            p_50087_4_--;
        }
        if(p_50087_6_ == 1)
        {
            p_50087_4_++;
        }
        if(p_50087_6_ == 2)
        {
            p_50087_5_--;
        }
        if(p_50087_6_ == 3)
        {
            p_50087_5_++;
        }
        if(p_50087_6_ == 4)
        {
            p_50087_3_--;
        }
        if(p_50087_6_ == 5)
        {
            p_50087_3_++;
        }
        int i = p_50087_2_.func_600_a(p_50087_3_, p_50087_4_, p_50087_5_);
        int j = p_50087_2_.func_602_e(p_50087_3_, p_50087_4_, p_50087_5_);
        int k = j & 7;
        if(i == Block.field_410_al.field_376_bc && k == p_50087_0_.func_21181_i())
        {
            if(p_50087_2_.func_604_a(Block.field_411_ak.func_221_d(p_50087_2_, p_50087_3_, p_50087_4_, p_50087_5_)) && p_50087_2_.func_688_b(p_50087_3_, p_50087_4_, p_50087_5_, Block.field_411_ak.field_376_bc, k))
            {
                p_50087_2_.func_684_a((float)p_50087_3_ + 0.5F, (float)p_50087_4_ + 0.5F, (float)p_50087_5_ + 0.5F, Block.field_411_ak.field_358_bl.func_1145_d(), (Block.field_411_ak.field_358_bl.func_1147_b() + 1.0F) / 2.0F, Block.field_411_ak.field_358_bl.func_1144_c() * 0.8F);
                p_50087_0_.field_1615_a--;
            }
            return true;
        } else
        {
            return false;
        }
    }
}
