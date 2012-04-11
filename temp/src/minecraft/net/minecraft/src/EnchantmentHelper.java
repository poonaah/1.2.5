// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            ItemStack, NBTTagList, NBTTagCompound, Enchantment, 
//            IEnchantmentModifier, EnchantmentModifierDamage, InventoryPlayer, EnchantmentModifierLiving, 
//            Item, EnchantmentData, WeightedRandom, EnumEnchantmentType, 
//            DamageSource, EntityLiving

public class EnchantmentHelper
{

    private static final Random field_40649_a = new Random();
    private static final EnchantmentModifierDamage field_40647_b = new EnchantmentModifierDamage(null);
    private static final EnchantmentModifierLiving field_40648_c = new EnchantmentModifierLiving(null);

    public EnchantmentHelper()
    {
    }

    public static int func_40634_b(int p_40634_0_, ItemStack p_40634_1_)
    {
        if(p_40634_1_ == null)
        {
            return 0;
        }
        NBTTagList nbttaglist = p_40634_1_.func_40714_p();
        if(nbttaglist == null)
        {
            return 0;
        }
        for(int i = 0; i < nbttaglist.func_740_c(); i++)
        {
            short word0 = ((NBTTagCompound)nbttaglist.func_741_a(i)).func_745_d("id");
            short word1 = ((NBTTagCompound)nbttaglist.func_741_a(i)).func_745_d("lvl");
            if(word0 == p_40634_0_)
            {
                return word1;
            }
        }

        return 0;
    }

    private static int func_40636_a(int p_40636_0_, ItemStack p_40636_1_[])
    {
        int i = 0;
        ItemStack aitemstack[] = p_40636_1_;
        int j = aitemstack.length;
        for(int k = 0; k < j; k++)
        {
            ItemStack itemstack = aitemstack[k];
            int l = func_40634_b(p_40636_0_, itemstack);
            if(l > i)
            {
                i = l;
            }
        }

        return i;
    }

    private static void func_40641_a(IEnchantmentModifier p_40641_0_, ItemStack p_40641_1_)
    {
        if(p_40641_1_ == null)
        {
            return;
        }
        NBTTagList nbttaglist = p_40641_1_.func_40714_p();
        if(nbttaglist == null)
        {
            return;
        }
        for(int i = 0; i < nbttaglist.func_740_c(); i++)
        {
            short word0 = ((NBTTagCompound)nbttaglist.func_741_a(i)).func_745_d("id");
            short word1 = ((NBTTagCompound)nbttaglist.func_741_a(i)).func_745_d("lvl");
            if(Enchantment.field_40504_a[word0] != null)
            {
                p_40641_0_.func_40244_a(Enchantment.field_40504_a[word0], word1);
            }
        }

    }

    private static void func_40639_a(IEnchantmentModifier p_40639_0_, ItemStack p_40639_1_[])
    {
        ItemStack aitemstack[] = p_40639_1_;
        int i = aitemstack.length;
        for(int j = 0; j < i; j++)
        {
            ItemStack itemstack = aitemstack[j];
            func_40641_a(p_40639_0_, itemstack);
        }

    }

    public static int func_40643_a(InventoryPlayer p_40643_0_, DamageSource p_40643_1_)
    {
        field_40647_b.field_40246_a = 0;
        field_40647_b.field_40245_b = p_40643_1_;
        func_40639_a(field_40647_b, p_40643_0_.field_842_b);
        if(field_40647_b.field_40246_a > 25)
        {
            field_40647_b.field_40246_a = 25;
        }
        return (field_40647_b.field_40246_a + 1 >> 1) + field_40649_a.nextInt((field_40647_b.field_40246_a >> 1) + 1);
    }

    public static int func_40630_a(InventoryPlayer p_40630_0_, EntityLiving p_40630_1_)
    {
        field_40648_c.field_40248_a = 0;
        field_40648_c.field_40247_b = p_40630_1_;
        func_40641_a(field_40648_c, p_40630_0_.func_494_a());
        if(field_40648_c.field_40248_a > 0)
        {
            return 1 + field_40649_a.nextInt(field_40648_c.field_40248_a);
        } else
        {
            return 0;
        }
    }

    public static int func_40645_b(InventoryPlayer p_40645_0_, EntityLiving p_40645_1_)
    {
        return func_40634_b(Enchantment.field_40507_l.field_40516_s, p_40645_0_.func_494_a());
    }

    public static int func_40631_c(InventoryPlayer p_40631_0_, EntityLiving p_40631_1_)
    {
        return func_40634_b(Enchantment.field_40508_m.field_40516_s, p_40631_0_.func_494_a());
    }

    public static int func_40632_a(InventoryPlayer p_40632_0_)
    {
        return func_40636_a(Enchantment.field_40499_g.field_40516_s, p_40632_0_.field_842_b);
    }

    public static int func_40642_b(InventoryPlayer p_40642_0_)
    {
        return func_40634_b(Enchantment.field_40506_o.field_40516_s, p_40642_0_.func_494_a());
    }

    public static int func_40640_c(InventoryPlayer p_40640_0_)
    {
        return func_40634_b(Enchantment.field_40518_q.field_40516_s, p_40640_0_.func_494_a());
    }

    public static boolean func_40646_d(InventoryPlayer p_40646_0_)
    {
        return func_40634_b(Enchantment.field_40519_p.field_40516_s, p_40646_0_.func_494_a()) > 0;
    }

    public static int func_40638_e(InventoryPlayer p_40638_0_)
    {
        return func_40634_b(Enchantment.field_40517_r.field_40516_s, p_40638_0_.func_494_a());
    }

    public static int func_40637_f(InventoryPlayer p_40637_0_)
    {
        return func_40634_b(Enchantment.field_40505_n.field_40516_s, p_40637_0_.func_494_a());
    }

    public static boolean func_40633_g(InventoryPlayer p_40633_0_)
    {
        return func_40636_a(Enchantment.field_40511_h.field_40516_s, p_40633_0_.field_842_b) > 0;
    }

    public static int func_40629_a(Random p_40629_0_, int p_40629_1_, int p_40629_2_, ItemStack p_40629_3_)
    {
        Item item = p_40629_3_.func_1091_a();
        int i = item.func_40399_b();
        if(i <= 0)
        {
            return 0;
        }
        if(p_40629_2_ > 30)
        {
            p_40629_2_ = 30;
        }
        p_40629_2_ = 1 + (p_40629_2_ >> 1) + p_40629_0_.nextInt(p_40629_2_ + 1);
        int j = p_40629_0_.nextInt(5) + p_40629_2_;
        if(p_40629_1_ == 0)
        {
            return (j >> 1) + 1;
        }
        if(p_40629_1_ == 1)
        {
            return (j * 2) / 3 + 1;
        } else
        {
            return j;
        }
    }

    public static void func_48441_a(Random p_48441_0_, ItemStack p_48441_1_, int p_48441_2_)
    {
        List list = func_40644_a(p_48441_0_, p_48441_1_, p_48441_2_);
        if(list != null)
        {
            EnchantmentData enchantmentdata;
            for(Iterator iterator = list.iterator(); iterator.hasNext(); p_48441_1_.func_40705_a(enchantmentdata.field_40264_a, enchantmentdata.field_40263_b))
            {
                enchantmentdata = (EnchantmentData)iterator.next();
            }

        }
    }

    public static List func_40644_a(Random p_40644_0_, ItemStack p_40644_1_, int p_40644_2_)
    {
        Item item = p_40644_1_.func_1091_a();
        int i = item.func_40399_b();
        if(i <= 0)
        {
            return null;
        }
        i = 1 + p_40644_0_.nextInt((i >> 1) + 1) + p_40644_0_.nextInt((i >> 1) + 1);
        int j = i + p_40644_2_;
        float f = ((p_40644_0_.nextFloat() + p_40644_0_.nextFloat()) - 1.0F) * 0.25F;
        int k = (int)((float)j * (1.0F + f) + 0.5F);
        ArrayList arraylist = null;
        Map map = func_40635_a(k, p_40644_1_);
        if(map != null && !map.isEmpty())
        {
            EnchantmentData enchantmentdata = (EnchantmentData)WeightedRandom.func_35733_a(p_40644_0_, map.values());
            if(enchantmentdata != null)
            {
                arraylist = new ArrayList();
                arraylist.add(enchantmentdata);
                for(int l = k >> 1; p_40644_0_.nextInt(50) <= l; l >>= 1)
                {
                    Iterator iterator = map.keySet().iterator();
                    do
                    {
                        if(!iterator.hasNext())
                        {
                            break;
                        }
                        Integer integer = (Integer)iterator.next();
                        boolean flag = true;
                        Iterator iterator1 = arraylist.iterator();
                        do
                        {
                            if(!iterator1.hasNext())
                            {
                                break;
                            }
                            EnchantmentData enchantmentdata2 = (EnchantmentData)iterator1.next();
                            if(enchantmentdata2.field_40264_a.func_40496_a(Enchantment.field_40504_a[integer.intValue()]))
                            {
                                continue;
                            }
                            flag = false;
                            break;
                        } while(true);
                        if(!flag)
                        {
                            iterator.remove();
                        }
                    } while(true);
                    if(!map.isEmpty())
                    {
                        EnchantmentData enchantmentdata1 = (EnchantmentData)WeightedRandom.func_35733_a(p_40644_0_, map.values());
                        arraylist.add(enchantmentdata1);
                    }
                }

            }
        }
        return arraylist;
    }

    public static Map func_40635_a(int p_40635_0_, ItemStack p_40635_1_)
    {
        Item item = p_40635_1_.func_1091_a();
        HashMap hashmap = null;
        Enchantment aenchantment[] = Enchantment.field_40504_a;
        int i = aenchantment.length;
        for(int j = 0; j < i; j++)
        {
            Enchantment enchantment = aenchantment[j];
            if(enchantment == null || !enchantment.field_40515_t.func_40650_a(item))
            {
                continue;
            }
            for(int k = enchantment.func_40493_c(); k <= enchantment.func_40491_a(); k++)
            {
                if(p_40635_0_ < enchantment.func_40492_a(k) || p_40635_0_ > enchantment.func_40489_b(k))
                {
                    continue;
                }
                if(hashmap == null)
                {
                    hashmap = new HashMap();
                }
                hashmap.put(Integer.valueOf(enchantment.field_40516_s), new EnchantmentData(enchantment, k));
            }

        }

        return hashmap;
    }

}
