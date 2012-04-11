// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Slot, ItemStack, EntityPlayer, ModLoader, 
//            Item, AchievementList, IInventory

public class SlotFurnace extends Slot
{

    private EntityPlayer field_27011_d;
    private int field_48437_f;

    public SlotFurnace(EntityPlayer p_i168_1_, IInventory p_i168_2_, int p_i168_3_, int p_i168_4_, int p_i168_5_)
    {
        super(p_i168_2_, p_i168_3_, p_i168_4_, p_i168_5_);
        field_27011_d = p_i168_1_;
    }

    public boolean func_4105_a(ItemStack p_4105_1_)
    {
        return false;
    }

    public ItemStack func_20004_a(int p_20004_1_)
    {
        if(func_20005_c())
        {
            field_48437_f += Math.min(p_20004_1_, func_777_b().field_1615_a);
        }
        return super.func_20004_a(p_20004_1_);
    }

    public void func_4103_a(ItemStack p_4103_1_)
    {
        func_48434_c(p_4103_1_);
        super.func_4103_a(p_4103_1_);
    }

    protected void func_48435_a(ItemStack p_48435_1_, int p_48435_2_)
    {
        field_48437_f += p_48435_2_;
        func_48434_c(p_48435_1_);
    }

    protected void func_48434_c(ItemStack p_48434_1_)
    {
        p_48434_1_.func_48507_a(field_27011_d.field_615_ag, field_27011_d, field_48437_f);
        field_48437_f = 0;
        ModLoader.takenFromFurnace(field_27011_d, p_48434_1_);
        if(p_48434_1_.field_1617_c == Item.field_223_m.field_291_aS)
        {
            field_27011_d.func_25058_a(AchievementList.field_27385_k, 1);
        }
        if(p_48434_1_.field_1617_c == Item.field_4020_aT.field_291_aS)
        {
            field_27011_d.func_25058_a(AchievementList.field_27380_p, 1);
        }
    }
}
