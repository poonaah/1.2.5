// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, MathHelper, World, Material, 
//            AxisAlignedBB, Block, DamageSource, NBTTagCompound, 
//            ItemStack, EntityPlayer, InventoryPlayer, AchievementList, 
//            Item, ModLoader

public class EntityItem extends Entity
{

    public ItemStack field_801_a;
    public int field_800_b;
    public int field_805_c;
    private int field_802_f;
    public float field_804_d;

    public EntityItem(World p_i327_1_, double p_i327_2_, double p_i327_4_, double p_i327_6_, 
            ItemStack p_i327_8_)
    {
        super(p_i327_1_);
        field_800_b = 0;
        field_802_f = 5;
        field_804_d = (float)(Math.random() * 3.1415926535897931D * 2D);
        func_371_a(0.25F, 0.25F);
        field_9292_aO = field_643_aD / 2.0F;
        func_347_a(p_i327_2_, p_i327_4_, p_i327_6_);
        field_801_a = p_i327_8_;
        field_605_aq = (float)(Math.random() * 360D);
        field_608_an = (float)(Math.random() * 0.20000000298023221D - 0.10000000149011611D);
        field_607_ao = 0.20000000298023221D;
        field_606_ap = (float)(Math.random() * 0.20000000298023221D - 0.10000000149011611D);
    }

    protected boolean func_25021_m()
    {
        return false;
    }

    public EntityItem(World p_i328_1_)
    {
        super(p_i328_1_);
        field_800_b = 0;
        field_802_f = 5;
        field_804_d = (float)(Math.random() * 3.1415926535897931D * 2D);
        func_371_a(0.25F, 0.25F);
        field_9292_aO = field_643_aD / 2.0F;
    }

    protected void func_21057_b()
    {
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        if(field_805_c > 0)
        {
            field_805_c--;
        }
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        field_607_ao -= 0.039999999105930328D;
        if(field_615_ag.func_599_f(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_610_al), MathHelper.func_1108_b(field_609_am)) == Material.field_1331_g)
        {
            field_607_ao = 0.20000000298023221D;
            field_608_an = (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.2F;
            field_606_ap = (field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.2F;
            field_615_ag.func_623_a(this, "random.fizz", 0.4F, 2.0F + field_9312_bd.nextFloat() * 0.4F);
        }
        func_28014_c(field_611_ak, (field_601_au.field_1697_b + field_601_au.field_1702_e) / 2D, field_609_am);
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        float f = 0.98F;
        if(field_9298_aH)
        {
            f = 0.5880001F;
            int i = field_615_ag.func_600_a(MathHelper.func_1108_b(field_611_ak), MathHelper.func_1108_b(field_601_au.field_1697_b) - 1, MathHelper.func_1108_b(field_609_am));
            if(i > 0)
            {
                f = Block.field_345_n[i].field_355_bo * 0.98F;
            }
        }
        field_608_an *= f;
        field_607_ao *= 0.98000001907348633D;
        field_606_ap *= f;
        if(field_9298_aH)
        {
            field_607_ao *= -0.5D;
        }
        field_800_b++;
        if(field_800_b >= 6000)
        {
            func_395_F();
        }
    }

    public boolean func_397_g_()
    {
        return field_615_ag.func_682_a(field_601_au, Material.field_1332_f, this);
    }

    protected void func_355_a(int p_355_1_)
    {
        func_396_a(DamageSource.field_35542_a, p_355_1_);
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        func_9281_M();
        field_802_f -= p_396_2_;
        if(field_802_f <= 0)
        {
            func_395_F();
        }
        return false;
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        p_352_1_.func_749_a("Health", (byte)field_802_f);
        p_352_1_.func_749_a("Age", (short)field_800_b);
        p_352_1_.func_763_a("Item", field_801_a.func_1086_a(new NBTTagCompound()));
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        field_802_f = p_357_1_.func_745_d("Health") & 0xff;
        field_800_b = p_357_1_.func_745_d("Age");
        NBTTagCompound nbttagcompound = p_357_1_.func_743_k("Item");
        field_801_a = ItemStack.func_35864_a(nbttagcompound);
        if(field_801_a == null)
        {
            func_395_F();
        }
    }

    public void func_6378_b(EntityPlayer p_6378_1_)
    {
        if(field_615_ag.field_1026_y)
        {
            return;
        }
        int i = field_801_a.field_1615_a;
        if(field_805_c == 0 && p_6378_1_.field_778_b.func_504_a(field_801_a))
        {
            if(field_801_a.field_1617_c == Block.field_385_K.field_376_bc)
            {
                p_6378_1_.func_27026_a(AchievementList.field_25198_c);
            }
            if(field_801_a.field_1617_c == Item.field_306_aD.field_291_aS)
            {
                p_6378_1_.func_27026_a(AchievementList.field_27376_t);
            }
            if(field_801_a.field_1617_c == Item.field_224_l.field_291_aS)
            {
                p_6378_1_.func_27026_a(AchievementList.field_40464_w);
            }
            if(field_801_a.field_1617_c == Item.field_40417_bo.field_291_aS)
            {
                p_6378_1_.func_27026_a(AchievementList.field_40465_z);
            }
            ModLoader.onItemPickup(p_6378_1_, field_801_a);
            field_615_ag.func_623_a(this, "random.pop", 0.2F, ((field_9312_bd.nextFloat() - field_9312_bd.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            p_6378_1_.func_443_a_(this, i);
            if(field_801_a.field_1615_a <= 0)
            {
                func_395_F();
            }
        }
    }

    public boolean func_48080_j()
    {
        return false;
    }
}
