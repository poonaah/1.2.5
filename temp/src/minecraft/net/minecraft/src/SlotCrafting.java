// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Slot, ItemStack, EntityPlayer, Block, 
//            AchievementList, Item, ModLoader, IInventory, 
//            InventoryPlayer

public class SlotCrafting extends Slot
{

    private final IInventory field_1125_c;
    private EntityPlayer field_25015_e;
    private int field_48436_g;

    public SlotCrafting(EntityPlayer p_i226_1_, IInventory p_i226_2_, IInventory p_i226_3_, int p_i226_4_, int p_i226_5_, int p_i226_6_)
    {
        super(p_i226_3_, p_i226_4_, p_i226_5_, p_i226_6_);
        field_25015_e = p_i226_1_;
        field_1125_c = p_i226_2_;
    }

    public boolean func_4105_a(ItemStack p_4105_1_)
    {
        return false;
    }

    public ItemStack func_20004_a(int p_20004_1_)
    {
        if(func_20005_c())
        {
            field_48436_g += Math.min(p_20004_1_, func_777_b().field_1615_a);
        }
        return super.func_20004_a(p_20004_1_);
    }

    protected void func_48435_a(ItemStack p_48435_1_, int p_48435_2_)
    {
        field_48436_g += p_48435_2_;
        func_48434_c(p_48435_1_);
    }

    protected void func_48434_c(ItemStack p_48434_1_)
    {
        p_48434_1_.func_48507_a(field_25015_e.field_615_ag, field_25015_e, field_48436_g);
        field_48436_g = 0;
        if(p_48434_1_.field_1617_c == Block.field_387_az.field_376_bc)
        {
            field_25015_e.func_25058_a(AchievementList.field_25197_d, 1);
        } else
        if(p_48434_1_.field_1617_c == Item.field_218_r.field_291_aS)
        {
            field_25015_e.func_25058_a(AchievementList.field_27387_i, 1);
        } else
        if(p_48434_1_.field_1617_c == Block.field_445_aC.field_376_bc)
        {
            field_25015_e.func_25058_a(AchievementList.field_27386_j, 1);
        } else
        if(p_48434_1_.field_1617_c == Item.field_249_L.field_291_aS)
        {
            field_25015_e.func_25058_a(AchievementList.field_27384_l, 1);
        } else
        if(p_48434_1_.field_1617_c == Item.field_242_S.field_291_aS)
        {
            field_25015_e.func_25058_a(AchievementList.field_27383_m, 1);
        } else
        if(p_48434_1_.field_1617_c == Item.field_21022_aX.field_291_aS)
        {
            field_25015_e.func_25058_a(AchievementList.field_27382_n, 1);
        } else
        if(p_48434_1_.field_1617_c == Item.field_214_v.field_291_aS)
        {
            field_25015_e.func_25058_a(AchievementList.field_27381_o, 1);
        } else
        if(p_48434_1_.field_1617_c == Item.field_220_p.field_291_aS)
        {
            field_25015_e.func_25058_a(AchievementList.field_27378_r, 1);
        } else
        if(p_48434_1_.field_1617_c == Block.field_40210_bF.field_376_bc)
        {
            field_25015_e.func_25058_a(AchievementList.field_40458_D, 1);
        } else
        if(p_48434_1_.field_1617_c == Block.field_407_ao.field_376_bc)
        {
            field_25015_e.func_25058_a(AchievementList.field_40460_F, 1);
        }
        ModLoader.takenFromCrafting(field_25015_e, p_48434_1_, field_1125_c);
    }

    public void func_4103_a(ItemStack p_4103_1_)
    {
        func_48434_c(p_4103_1_);
        for(int i = 0; i < field_1125_c.func_469_c(); i++)
        {
            ItemStack itemstack = field_1125_c.func_468_c(i);
            if(itemstack != null)
            {
                field_1125_c.func_473_a(i, 1);
                if(itemstack.func_1091_a().func_21014_i())
                {
                    ItemStack itemstack1 = new ItemStack(itemstack.func_1091_a().func_21016_h());
                    if(!itemstack.func_1091_a().func_46059_i(itemstack) || !field_25015_e.field_778_b.func_504_a(itemstack1))
                    {
                        if(field_1125_c.func_468_c(i) == null)
                        {
                            field_1125_c.func_472_a(i, itemstack1);
                        } else
                        {
                            field_25015_e.func_48153_a(itemstack1);
                        }
                    }
                }
            }
        }

    }
}
