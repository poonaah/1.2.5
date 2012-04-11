// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            Item, ItemStack, PotionHelper, World, 
//            PotionEffect, EntityPlayer, InventoryPlayer, EnumAction, 
//            EntityPotion, Potion, StatCollector

public class ItemPotion extends Item
{

    private HashMap field_40435_a;

    public ItemPotion(int p_i301_1_)
    {
        super(p_i301_1_);
        field_40435_a = new HashMap();
        func_21009_c(1);
        func_21015_a(true);
        func_21013_d(0);
    }

    public List func_40434_a_(ItemStack p_40434_1_)
    {
        return func_40431_c_(p_40434_1_.func_21181_i());
    }

    public List func_40431_c_(int p_40431_1_)
    {
        List list = (List)field_40435_a.get(Integer.valueOf(p_40431_1_));
        if(list == null)
        {
            list = PotionHelper.func_40360_b(p_40431_1_, false);
            field_40435_a.put(Integer.valueOf(p_40431_1_), list);
        }
        return list;
    }

    public ItemStack func_35413_b(ItemStack p_35413_1_, World p_35413_2_, EntityPlayer p_35413_3_)
    {
        p_35413_1_.field_1615_a--;
        if(!p_35413_2_.field_1026_y)
        {
            List list = func_40434_a_(p_35413_1_);
            if(list != null)
            {
                PotionEffect potioneffect;
                for(Iterator iterator = list.iterator(); iterator.hasNext(); p_35413_3_.func_35165_a(new PotionEffect(potioneffect)))
                {
                    potioneffect = (PotionEffect)iterator.next();
                }

            }
        }
        if(p_35413_1_.field_1615_a <= 0)
        {
            return new ItemStack(Item.field_40416_bt);
        } else
        {
            p_35413_3_.field_778_b.func_504_a(new ItemStack(Item.field_40416_bt));
            return p_35413_1_;
        }
    }

    public int func_35411_c(ItemStack p_35411_1_)
    {
        return 32;
    }

    public EnumAction func_35412_b(ItemStack p_35412_1_)
    {
        return EnumAction.drink;
    }

    public ItemStack func_193_a(ItemStack p_193_1_, World p_193_2_, EntityPlayer p_193_3_)
    {
        if(func_40433_c(p_193_1_.func_21181_i()))
        {
            p_193_1_.field_1615_a--;
            p_193_2_.func_623_a(p_193_3_, "random.bow", 0.5F, 0.4F / (field_4015_b.nextFloat() * 0.4F + 0.8F));
            if(!p_193_2_.field_1026_y)
            {
                p_193_2_.func_674_a(new EntityPotion(p_193_2_, p_193_3_, p_193_1_.func_21181_i()));
            }
            return p_193_1_;
        } else
        {
            p_193_3_.func_35199_b(p_193_1_, func_35411_c(p_193_1_));
            return p_193_1_;
        }
    }

    public boolean func_192_a(ItemStack p_192_1_, EntityPlayer p_192_2_, World p_192_3_, int i, int j, int k, int l)
    {
        return false;
    }

    public int func_27009_a(int p_27009_1_)
    {
        return !func_40433_c(p_27009_1_) ? 140 : 154;
    }

    public int func_46057_a(int p_46057_1_, int p_46057_2_)
    {
        if(p_46057_2_ == 0)
        {
            return 141;
        } else
        {
            return super.func_46057_a(p_46057_1_, p_46057_2_);
        }
    }

    public static boolean func_40433_c(int p_40433_0_)
    {
        return (p_40433_0_ & 0x4000) != 0;
    }

    public int func_27010_f(int p_27010_1_, int p_27010_2_)
    {
        if(p_27010_2_ > 0)
        {
            return 0xffffff;
        } else
        {
            return PotionHelper.func_40358_a(p_27010_1_, false);
        }
    }

    public boolean func_46058_c()
    {
        return true;
    }

    public boolean func_40432_e(int p_40432_1_)
    {
        List list = func_40431_c_(p_40432_1_);
        if(list == null || list.isEmpty())
        {
            return false;
        }
        for(Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            PotionEffect potioneffect = (PotionEffect)iterator.next();
            if(Potion.field_35678_a[potioneffect.func_35799_a()].func_40622_b())
            {
                return true;
            }
        }

        return false;
    }

    public String func_40397_d(ItemStack p_40397_1_)
    {
        if(p_40397_1_.func_21181_i() == 0)
        {
            return StatCollector.func_25200_a("item.emptyPotion.name").trim();
        }
        String s = "";
        if(func_40433_c(p_40397_1_.func_21181_i()))
        {
            s = (new StringBuilder()).append(StatCollector.func_25200_a("potion.prefix.grenade").trim()).append(" ").toString();
        }
        List list = Item.field_40413_bs.func_40434_a_(p_40397_1_);
        if(list != null && !list.isEmpty())
        {
            String s1 = ((PotionEffect)list.get(0)).func_40468_d();
            s1 = (new StringBuilder()).append(s1).append(".postfix").toString();
            return (new StringBuilder()).append(s).append(StatCollector.func_25200_a(s1).trim()).toString();
        } else
        {
            String s2 = PotionHelper.func_40359_b(p_40397_1_.func_21181_i());
            return (new StringBuilder()).append(StatCollector.func_25200_a(s2).trim()).append(" ").append(super.func_40397_d(p_40397_1_)).toString();
        }
    }

    public void func_40404_a(ItemStack p_40404_1_, List p_40404_2_)
    {
        if(p_40404_1_.func_21181_i() == 0)
        {
            return;
        }
        List list = Item.field_40413_bs.func_40434_a_(p_40404_1_);
        if(list != null && !list.isEmpty())
        {
            for(Iterator iterator = list.iterator(); iterator.hasNext();)
            {
                PotionEffect potioneffect = (PotionEffect)iterator.next();
                String s1 = StatCollector.func_25200_a(potioneffect.func_40468_d()).trim();
                if(potioneffect.func_35801_c() > 0)
                {
                    s1 = (new StringBuilder()).append(s1).append(" ").append(StatCollector.func_25200_a((new StringBuilder()).append("potion.potency.").append(potioneffect.func_35801_c()).toString()).trim()).toString();
                }
                if(potioneffect.func_35802_b() > 20)
                {
                    s1 = (new StringBuilder()).append(s1).append(" (").append(Potion.func_40620_a(potioneffect)).append(")").toString();
                }
                if(Potion.field_35678_a[potioneffect.func_35799_a()].func_40615_f())
                {
                    p_40404_2_.add((new StringBuilder()).append("\247c").append(s1).toString());
                } else
                {
                    p_40404_2_.add((new StringBuilder()).append("\2477").append(s1).toString());
                }
            }

        } else
        {
            String s = StatCollector.func_25200_a("potion.empty").trim();
            p_40404_2_.add((new StringBuilder()).append("\2477").append(s).toString());
        }
    }

    public boolean func_40403_e(ItemStack p_40403_1_)
    {
        List list = func_40434_a_(p_40403_1_);
        return list != null && !list.isEmpty();
    }
}
