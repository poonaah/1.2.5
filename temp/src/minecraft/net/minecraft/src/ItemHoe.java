// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Item, EnumToolMaterial, EntityPlayer, World, 
//            Block, BlockGrass, StepSound, ItemStack

public class ItemHoe extends Item
{

    public ItemHoe(int p_i369_1_, EnumToolMaterial p_i369_2_)
    {
        super(p_i369_1_);
        field_290_aT = 1;
        func_21013_d(p_i369_2_.func_21207_a());
    }

    public boolean func_192_a(ItemStack p_192_1_, EntityPlayer p_192_2_, World p_192_3_, int p_192_4_, int p_192_5_, int p_192_6_, int p_192_7_)
    {
        if(!p_192_2_.func_35190_e(p_192_4_, p_192_5_, p_192_6_))
        {
            return false;
        }
        int i = p_192_3_.func_600_a(p_192_4_, p_192_5_, p_192_6_);
        int j = p_192_3_.func_600_a(p_192_4_, p_192_5_ + 1, p_192_6_);
        if(p_192_7_ != 0 && j == 0 && i == Block.field_337_v.field_376_bc || i == Block.field_336_w.field_376_bc)
        {
            Block block = Block.field_446_aB;
            p_192_3_.func_684_a((float)p_192_4_ + 0.5F, (float)p_192_5_ + 0.5F, (float)p_192_6_ + 0.5F, block.field_358_bl.func_1145_d(), (block.field_358_bl.func_1147_b() + 1.0F) / 2.0F, block.field_358_bl.func_1144_c() * 0.8F);
            if(p_192_3_.field_1026_y)
            {
                return true;
            } else
            {
                p_192_3_.func_690_d(p_192_4_, p_192_5_, p_192_6_, block.field_376_bc);
                p_192_1_.func_25190_a(1, p_192_2_);
                return true;
            }
        } else
        {
            return false;
        }
    }

    public boolean func_4017_a()
    {
        return true;
    }
}
