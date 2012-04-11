// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            Entity, EnumArt, AxisAlignedBB, World, 
//            EntityItem, ItemStack, Item, MathHelper, 
//            Material, NBTTagCompound, DamageSource

public class EntityPainting extends Entity
{

    private int field_695_c;
    public int field_691_a;
    public int field_9322_d;
    public int field_9321_e;
    public int field_9320_f;
    public EnumArt field_690_b;

    public EntityPainting(World p_i455_1_)
    {
        super(p_i455_1_);
        field_695_c = 0;
        field_691_a = 0;
        field_9292_aO = 0.0F;
        func_371_a(0.5F, 0.5F);
    }

    public EntityPainting(World p_i456_1_, int p_i456_2_, int p_i456_3_, int p_i456_4_, int p_i456_5_)
    {
        this(p_i456_1_);
        field_9322_d = p_i456_2_;
        field_9321_e = p_i456_3_;
        field_9320_f = p_i456_4_;
        ArrayList arraylist = new ArrayList();
        EnumArt aenumart[] = EnumArt.values();
        int i = aenumart.length;
        for(int j = 0; j < i; j++)
        {
            EnumArt enumart = aenumart[j];
            field_690_b = enumart;
            func_412_b(p_i456_5_);
            if(func_410_i())
            {
                arraylist.add(enumart);
            }
        }

        if(arraylist.size() > 0)
        {
            field_690_b = (EnumArt)arraylist.get(field_9312_bd.nextInt(arraylist.size()));
        }
        func_412_b(p_i456_5_);
    }

    public EntityPainting(World p_i457_1_, int p_i457_2_, int p_i457_3_, int p_i457_4_, int p_i457_5_, String p_i457_6_)
    {
        this(p_i457_1_);
        field_9322_d = p_i457_2_;
        field_9321_e = p_i457_3_;
        field_9320_f = p_i457_4_;
        EnumArt aenumart[] = EnumArt.values();
        int i = aenumart.length;
        int j = 0;
        do
        {
            if(j >= i)
            {
                break;
            }
            EnumArt enumart = aenumart[j];
            if(enumart.field_1624_y.equals(p_i457_6_))
            {
                field_690_b = enumart;
                break;
            }
            j++;
        } while(true);
        func_412_b(p_i457_5_);
    }

    protected void func_21057_b()
    {
    }

    public void func_412_b(int p_412_1_)
    {
        field_691_a = p_412_1_;
        field_603_as = field_605_aq = p_412_1_ * 90;
        float f = field_690_b.field_1623_z;
        float f1 = field_690_b.field_1636_A;
        float f2 = field_690_b.field_1623_z;
        if(p_412_1_ == 0 || p_412_1_ == 2)
        {
            f2 = 0.5F;
        } else
        {
            f = 0.5F;
        }
        f /= 32F;
        f1 /= 32F;
        f2 /= 32F;
        float f3 = (float)field_9322_d + 0.5F;
        float f4 = (float)field_9321_e + 0.5F;
        float f5 = (float)field_9320_f + 0.5F;
        float f6 = 0.5625F;
        if(p_412_1_ == 0)
        {
            f5 -= f6;
        }
        if(p_412_1_ == 1)
        {
            f3 -= f6;
        }
        if(p_412_1_ == 2)
        {
            f5 += f6;
        }
        if(p_412_1_ == 3)
        {
            f3 += f6;
        }
        if(p_412_1_ == 0)
        {
            f3 -= func_411_c(field_690_b.field_1623_z);
        }
        if(p_412_1_ == 1)
        {
            f5 += func_411_c(field_690_b.field_1623_z);
        }
        if(p_412_1_ == 2)
        {
            f3 += func_411_c(field_690_b.field_1623_z);
        }
        if(p_412_1_ == 3)
        {
            f5 -= func_411_c(field_690_b.field_1623_z);
        }
        f4 += func_411_c(field_690_b.field_1636_A);
        func_347_a(f3, f4, f5);
        float f7 = -0.00625F;
        field_601_au.func_1165_c(f3 - f - f7, f4 - f1 - f7, f5 - f2 - f7, f3 + f + f7, f4 + f1 + f7, f5 + f2 + f7);
    }

    private float func_411_c(int p_411_1_)
    {
        if(p_411_1_ == 32)
        {
            return 0.5F;
        }
        return p_411_1_ != 64 ? 0.0F : 0.5F;
    }

    public void func_370_e_()
    {
        if(field_695_c++ == 100 && !field_615_ag.field_1026_y)
        {
            field_695_c = 0;
            if(!field_646_aA && !func_410_i())
            {
                func_395_F();
                field_615_ag.func_674_a(new EntityItem(field_615_ag, field_611_ak, field_610_al, field_609_am, new ItemStack(Item.field_270_aq)));
            }
        }
    }

    public boolean func_410_i()
    {
        if(field_615_ag.func_697_a(this, field_601_au).size() > 0)
        {
            return false;
        }
        int i = field_690_b.field_1623_z / 16;
        int j = field_690_b.field_1636_A / 16;
        int k = field_9322_d;
        int l = field_9321_e;
        int i1 = field_9320_f;
        if(field_691_a == 0)
        {
            k = MathHelper.func_1108_b(field_611_ak - (double)((float)field_690_b.field_1623_z / 32F));
        }
        if(field_691_a == 1)
        {
            i1 = MathHelper.func_1108_b(field_609_am - (double)((float)field_690_b.field_1623_z / 32F));
        }
        if(field_691_a == 2)
        {
            k = MathHelper.func_1108_b(field_611_ak - (double)((float)field_690_b.field_1623_z / 32F));
        }
        if(field_691_a == 3)
        {
            i1 = MathHelper.func_1108_b(field_609_am - (double)((float)field_690_b.field_1623_z / 32F));
        }
        l = MathHelper.func_1108_b(field_610_al - (double)((float)field_690_b.field_1636_A / 32F));
        for(int j1 = 0; j1 < i; j1++)
        {
            for(int k1 = 0; k1 < j; k1++)
            {
                Material material;
                if(field_691_a == 0 || field_691_a == 2)
                {
                    material = field_615_ag.func_599_f(k + j1, l + k1, field_9320_f);
                } else
                {
                    material = field_615_ag.func_599_f(field_9322_d, l + k1, i1 + j1);
                }
                if(!material.func_878_a())
                {
                    return false;
                }
            }

        }

        List list = field_615_ag.func_659_b(this, field_601_au);
        for(int l1 = 0; l1 < list.size(); l1++)
        {
            if(list.get(l1) instanceof EntityPainting)
            {
                return false;
            }
        }

        return true;
    }

    public boolean func_401_c_()
    {
        return true;
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        if(!field_646_aA && !field_615_ag.field_1026_y)
        {
            func_395_F();
            func_9281_M();
            field_615_ag.func_674_a(new EntityItem(field_615_ag, field_611_ak, field_610_al, field_609_am, new ItemStack(Item.field_270_aq)));
        }
        return true;
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        p_352_1_.func_761_a("Dir", (byte)field_691_a);
        p_352_1_.func_754_a("Motive", field_690_b.field_1624_y);
        p_352_1_.func_758_a("TileX", field_9322_d);
        p_352_1_.func_758_a("TileY", field_9321_e);
        p_352_1_.func_758_a("TileZ", field_9320_f);
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        field_691_a = p_357_1_.func_746_c("Dir");
        field_9322_d = p_357_1_.func_756_e("TileX");
        field_9321_e = p_357_1_.func_756_e("TileY");
        field_9320_f = p_357_1_.func_756_e("TileZ");
        String s = p_357_1_.func_755_i("Motive");
        EnumArt aenumart[] = EnumArt.values();
        int i = aenumart.length;
        for(int j = 0; j < i; j++)
        {
            EnumArt enumart = aenumart[j];
            if(enumart.field_1624_y.equals(s))
            {
                field_690_b = enumart;
            }
        }

        if(field_690_b == null)
        {
            field_690_b = EnumArt.Kebab;
        }
        func_412_b(field_691_a);
    }

    public void func_349_c(double p_349_1_, double p_349_3_, double p_349_5_)
    {
        if(!field_615_ag.field_1026_y && !field_646_aA && p_349_1_ * p_349_1_ + p_349_3_ * p_349_3_ + p_349_5_ * p_349_5_ > 0.0D)
        {
            func_395_F();
            field_615_ag.func_674_a(new EntityItem(field_615_ag, field_611_ak, field_610_al, field_609_am, new ItemStack(Item.field_270_aq)));
        }
    }

    public void func_348_f(double p_348_1_, double p_348_3_, double p_348_5_)
    {
        if(!field_615_ag.field_1026_y && !field_646_aA && p_348_1_ * p_348_1_ + p_348_3_ * p_348_3_ + p_348_5_ * p_348_5_ > 0.0D)
        {
            func_395_F();
            field_615_ag.func_674_a(new EntityItem(field_615_ag, field_611_ak, field_610_al, field_609_am, new ItemStack(Item.field_270_aq)));
        }
    }
}
