// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            PotionEffect, Potion

public class PotionHelper
{

    public static final String field_40367_a = null;
    public static final String field_40365_b = "-0+1-2-3&4-4+13";
    public static final String field_40366_c = "+0-1-2-3&4-4+13";
    public static final String field_40363_d = "-0-1+2-3&4-4+13";
    public static final String field_40364_e = "-0+3-4+13";
    public static final String field_40361_f = "+0-1+2-3&4-4+13";
    public static final String field_40362_g = "+0-1-2+3&4-4+13";
    public static final String field_40374_h = "+0+1-2-3&4-4+13";
    public static final String field_40375_i = "-5+6-7";
    public static final String field_40372_j = "+5-6-7";
    public static final String field_40373_k = "+14&13-13";
    private static final HashMap field_40370_l;
    private static final HashMap field_40371_m;
    private static final HashMap field_40368_n = new HashMap();
    private static final String field_40369_o[] = {
        "potion.prefix.mundane", "potion.prefix.uninteresting", "potion.prefix.bland", "potion.prefix.clear", "potion.prefix.milky", "potion.prefix.diffuse", "potion.prefix.artless", "potion.prefix.thin", "potion.prefix.awkward", "potion.prefix.flat", 
        "potion.prefix.bulky", "potion.prefix.bungling", "potion.prefix.buttered", "potion.prefix.smooth", "potion.prefix.suave", "potion.prefix.debonair", "potion.prefix.thick", "potion.prefix.elegant", "potion.prefix.fancy", "potion.prefix.charming", 
        "potion.prefix.dashing", "potion.prefix.refined", "potion.prefix.cordial", "potion.prefix.sparkling", "potion.prefix.potent", "potion.prefix.foul", "potion.prefix.odorless", "potion.prefix.rank", "potion.prefix.harsh", "potion.prefix.acrid", 
        "potion.prefix.gross", "potion.prefix.stinky"
    };

    public PotionHelper()
    {
    }

    public static boolean func_40357_a(int p_40357_0_, int p_40357_1_)
    {
        return (p_40357_0_ & 1 << p_40357_1_) != 0;
    }

    private static int func_40349_b(int p_40349_0_, int p_40349_1_)
    {
        return func_40357_a(p_40349_0_, p_40349_1_) ? 1 : 0;
    }

    private static int func_40353_c(int p_40353_0_, int p_40353_1_)
    {
        return func_40357_a(p_40353_0_, p_40353_1_) ? 0 : 1;
    }

    public static int func_40352_a(int p_40352_0_)
    {
        return func_40351_a(p_40352_0_, 5, 4, 3, 2, 1);
    }

    public static int func_40354_a(Collection p_40354_0_)
    {
        int i = 0x385dc6;
        if(p_40354_0_ == null || p_40354_0_.isEmpty())
        {
            return i;
        }
        float f = 0.0F;
        float f1 = 0.0F;
        float f2 = 0.0F;
        float f3 = 0.0F;
        for(Iterator iterator = p_40354_0_.iterator(); iterator.hasNext();)
        {
            PotionEffect potioneffect = (PotionEffect)iterator.next();
            int j = Potion.field_35678_a[potioneffect.func_35799_a()].func_40621_j();
            int k = 0;
            while(k <= potioneffect.func_35801_c()) 
            {
                f += (float)(j >> 16 & 0xff) / 255F;
                f1 += (float)(j >> 8 & 0xff) / 255F;
                f2 += (float)(j >> 0 & 0xff) / 255F;
                f3++;
                k++;
            }
        }

        f = (f / f3) * 255F;
        f1 = (f1 / f3) * 255F;
        f2 = (f2 / f3) * 255F;
        return (int)f << 16 | (int)f1 << 8 | (int)f2;
    }

    public static int func_40358_a(int p_40358_0_, boolean p_40358_1_)
    {
        if(!p_40358_1_)
        {
            if(field_40368_n.containsKey(Integer.valueOf(p_40358_0_)))
            {
                return ((Integer)field_40368_n.get(Integer.valueOf(p_40358_0_))).intValue();
            } else
            {
                int i = func_40354_a(func_40360_b(p_40358_0_, false));
                field_40368_n.put(Integer.valueOf(p_40358_0_), Integer.valueOf(i));
                return i;
            }
        } else
        {
            return func_40354_a(func_40360_b(p_40358_0_, p_40358_1_));
        }
    }

    public static String func_40359_b(int p_40359_0_)
    {
        int i = func_40352_a(p_40359_0_);
        return field_40369_o[i];
    }

    private static int func_40347_a(boolean p_40347_0_, boolean p_40347_1_, boolean p_40347_2_, int p_40347_3_, int p_40347_4_, int p_40347_5_, int p_40347_6_)
    {
        int i = 0;
        if(p_40347_0_)
        {
            i = func_40353_c(p_40347_6_, p_40347_4_);
        } else
        if(p_40347_3_ != -1)
        {
            if(p_40347_3_ == 0 && func_40348_c(p_40347_6_) == p_40347_4_)
            {
                i = 1;
            } else
            if(p_40347_3_ == 1 && func_40348_c(p_40347_6_) > p_40347_4_)
            {
                i = 1;
            } else
            if(p_40347_3_ == 2 && func_40348_c(p_40347_6_) < p_40347_4_)
            {
                i = 1;
            }
        } else
        {
            i = func_40349_b(p_40347_6_, p_40347_4_);
        }
        if(p_40347_1_)
        {
            i *= p_40347_5_;
        }
        if(p_40347_2_)
        {
            i *= -1;
        }
        return i;
    }

    private static int func_40348_c(int p_40348_0_)
    {
        int i;
        for(i = 0; p_40348_0_ > 0; i++)
        {
            p_40348_0_ &= p_40348_0_ - 1;
        }

        return i;
    }

    private static int func_40355_a(String p_40355_0_, int p_40355_1_, int p_40355_2_, int p_40355_3_)
    {
        if(p_40355_1_ >= p_40355_0_.length() || p_40355_2_ < 0 || p_40355_1_ >= p_40355_2_)
        {
            return 0;
        }
        int i = p_40355_0_.indexOf('|', p_40355_1_);
        if(i >= 0 && i < p_40355_2_)
        {
            int j = func_40355_a(p_40355_0_, p_40355_1_, i - 1, p_40355_3_);
            if(j > 0)
            {
                return j;
            }
            int l = func_40355_a(p_40355_0_, i + 1, p_40355_2_, p_40355_3_);
            if(l > 0)
            {
                return l;
            } else
            {
                return 0;
            }
        }
        int k = p_40355_0_.indexOf('&', p_40355_1_);
        if(k >= 0 && k < p_40355_2_)
        {
            int i1 = func_40355_a(p_40355_0_, p_40355_1_, k - 1, p_40355_3_);
            if(i1 <= 0)
            {
                return 0;
            }
            int j1 = func_40355_a(p_40355_0_, k + 1, p_40355_2_, p_40355_3_);
            if(j1 <= 0)
            {
                return 0;
            }
            if(i1 > j1)
            {
                return i1;
            } else
            {
                return j1;
            }
        }
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        byte byte0 = -1;
        int k1 = 0;
        int l1 = 0;
        int i2 = 0;
        for(int j2 = p_40355_1_; j2 < p_40355_2_; j2++)
        {
            char c = p_40355_0_.charAt(j2);
            if(c >= '0' && c <= '9')
            {
                if(flag)
                {
                    l1 = c - 48;
                    flag1 = true;
                } else
                {
                    k1 *= 10;
                    k1 += c - 48;
                    flag2 = true;
                }
                continue;
            }
            if(c == '*')
            {
                flag = true;
                continue;
            }
            if(c == '!')
            {
                if(flag2)
                {
                    i2 += func_40347_a(flag3, flag1, flag4, byte0, k1, l1, p_40355_3_);
                    flag2 = flag1 = flag = flag4 = flag3 = false;
                    k1 = l1 = 0;
                    byte0 = -1;
                }
                flag3 = true;
                continue;
            }
            if(c == '-')
            {
                if(flag2)
                {
                    i2 += func_40347_a(flag3, flag1, flag4, byte0, k1, l1, p_40355_3_);
                    flag2 = flag1 = flag = flag4 = flag3 = false;
                    k1 = l1 = 0;
                    byte0 = -1;
                }
                flag4 = true;
                continue;
            }
            if(c == '=' || c == '<' || c == '>')
            {
                if(flag2)
                {
                    i2 += func_40347_a(flag3, flag1, flag4, byte0, k1, l1, p_40355_3_);
                    flag2 = flag1 = flag = flag4 = flag3 = false;
                    k1 = l1 = 0;
                    byte0 = -1;
                }
                if(c == '=')
                {
                    byte0 = 0;
                    continue;
                }
                if(c == '<')
                {
                    byte0 = 2;
                    continue;
                }
                if(c == '>')
                {
                    byte0 = 1;
                }
                continue;
            }
            if(c == '+' && flag2)
            {
                i2 += func_40347_a(flag3, flag1, flag4, byte0, k1, l1, p_40355_3_);
                flag2 = flag1 = flag = flag4 = flag3 = false;
                k1 = l1 = 0;
                byte0 = -1;
            }
        }

        if(flag2)
        {
            i2 += func_40347_a(flag3, flag1, flag4, byte0, k1, l1, p_40355_3_);
        }
        return i2;
    }

    public static List func_40360_b(int p_40360_0_, boolean p_40360_1_)
    {
        ArrayList arraylist = null;
        Potion apotion[] = Potion.field_35678_a;
        int i = apotion.length;
        for(int j = 0; j < i; j++)
        {
            Potion potion = apotion[j];
            if(potion == null || potion.func_40612_i() && !p_40360_1_)
            {
                continue;
            }
            String s = (String)field_40370_l.get(Integer.valueOf(potion.func_40619_a()));
            if(s == null)
            {
                continue;
            }
            int k = func_40355_a(s, 0, s.length(), p_40360_0_);
            if(k <= 0)
            {
                continue;
            }
            int l = 0;
            String s1 = (String)field_40371_m.get(Integer.valueOf(potion.func_40619_a()));
            if(s1 != null)
            {
                l = func_40355_a(s1, 0, s1.length(), p_40360_0_);
                if(l < 0)
                {
                    l = 0;
                }
            }
            if(potion.func_40622_b())
            {
                k = 1;
            } else
            {
                k = 1200 * (k * 3 + (k - 1) * 2);
                k >>= l;
                k = (int)Math.round((double)k * potion.func_40610_g());
                if((p_40360_0_ & 0x4000) != 0)
                {
                    k = (int)Math.round((double)k * 0.75D + 0.5D);
                }
            }
            if(arraylist == null)
            {
                arraylist = new ArrayList();
            }
            arraylist.add(new PotionEffect(potion.func_40619_a(), k, l));
        }

        return arraylist;
    }

    private static int func_40350_a(int p_40350_0_, int p_40350_1_, boolean p_40350_2_, boolean p_40350_3_, boolean p_40350_4_)
    {
        if(p_40350_4_)
        {
            if(!func_40357_a(p_40350_0_, p_40350_1_))
            {
                return 0;
            }
        } else
        if(p_40350_2_)
        {
            p_40350_0_ &= ~(1 << p_40350_1_);
        } else
        if(p_40350_3_)
        {
            if((p_40350_0_ & 1 << p_40350_1_) != 0)
            {
                p_40350_0_ &= ~(1 << p_40350_1_);
            } else
            {
                p_40350_0_ |= 1 << p_40350_1_;
            }
        } else
        {
            p_40350_0_ |= 1 << p_40350_1_;
        }
        return p_40350_0_;
    }

    public static int func_40356_a(int p_40356_0_, String p_40356_1_)
    {
        boolean flag = false;
        int i = p_40356_1_.length();
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        int j = 0;
        for(int k = ((flag) ? 1 : 0); k < i; k++)
        {
            char c = p_40356_1_.charAt(k);
            if(c >= '0' && c <= '9')
            {
                j *= 10;
                j += c - 48;
                flag1 = true;
                continue;
            }
            if(c == '!')
            {
                if(flag1)
                {
                    p_40356_0_ = func_40350_a(p_40356_0_, j, flag3, flag2, flag4);
                    flag1 = flag3 = flag2 = flag4 = false;
                    j = 0;
                }
                flag2 = true;
                continue;
            }
            if(c == '-')
            {
                if(flag1)
                {
                    p_40356_0_ = func_40350_a(p_40356_0_, j, flag3, flag2, flag4);
                    flag1 = flag3 = flag2 = flag4 = false;
                    j = 0;
                }
                flag3 = true;
                continue;
            }
            if(c == '+')
            {
                if(flag1)
                {
                    p_40356_0_ = func_40350_a(p_40356_0_, j, flag3, flag2, flag4);
                    flag1 = flag3 = flag2 = flag4 = false;
                    j = 0;
                }
                continue;
            }
            if(c != '&')
            {
                continue;
            }
            if(flag1)
            {
                p_40356_0_ = func_40350_a(p_40356_0_, j, flag3, flag2, flag4);
                flag1 = flag3 = flag2 = flag4 = false;
                j = 0;
            }
            flag4 = true;
        }

        if(flag1)
        {
            p_40356_0_ = func_40350_a(p_40356_0_, j, flag3, flag2, flag4);
        }
        return p_40356_0_ & 0x7fff;
    }

    public static int func_40351_a(int p_40351_0_, int p_40351_1_, int p_40351_2_, int p_40351_3_, int p_40351_4_, int p_40351_5_)
    {
        return (func_40357_a(p_40351_0_, p_40351_1_) ? 0x10 : 0) | (func_40357_a(p_40351_0_, p_40351_2_) ? 8 : 0) | (func_40357_a(p_40351_0_, p_40351_3_) ? 4 : 0) | (func_40357_a(p_40351_0_, p_40351_4_) ? 2 : 0) | (func_40357_a(p_40351_0_, p_40351_5_) ? 1 : 0);
    }

    static 
    {
        field_40370_l = new HashMap();
        field_40371_m = new HashMap();
        field_40370_l.put(Integer.valueOf(Potion.field_35681_l.func_40619_a()), "0 & !1 & !2 & !3 & 0+6");
        field_40370_l.put(Integer.valueOf(Potion.field_35677_c.func_40619_a()), "!0 & 1 & !2 & !3 & 1+6");
        field_40370_l.put(Integer.valueOf(Potion.field_35679_n.func_40619_a()), "0 & 1 & !2 & !3 & 0+6");
        field_40370_l.put(Integer.valueOf(Potion.field_35685_h.func_40619_a()), "0 & !1 & 2 & !3");
        field_40370_l.put(Integer.valueOf(Potion.field_35689_u.func_40619_a()), "!0 & !1 & 2 & !3 & 2+6");
        field_40370_l.put(Integer.valueOf(Potion.field_35690_t.func_40619_a()), "!0 & !1 & !2 & 3 & 3+6");
        field_40370_l.put(Integer.valueOf(Potion.field_35686_i.func_40619_a()), "!0 & !1 & 2 & 3");
        field_40370_l.put(Integer.valueOf(Potion.field_35674_d.func_40619_a()), "!0 & 1 & !2 & 3 & 3+6");
        field_40370_l.put(Integer.valueOf(Potion.field_35673_g.func_40619_a()), "0 & !1 & !2 & 3 & 3+6");
        field_40371_m.put(Integer.valueOf(Potion.field_35677_c.func_40619_a()), "5");
        field_40371_m.put(Integer.valueOf(Potion.field_35675_e.func_40619_a()), "5");
        field_40371_m.put(Integer.valueOf(Potion.field_35673_g.func_40619_a()), "5");
        field_40371_m.put(Integer.valueOf(Potion.field_35681_l.func_40619_a()), "5");
        field_40371_m.put(Integer.valueOf(Potion.field_35686_i.func_40619_a()), "5");
        field_40371_m.put(Integer.valueOf(Potion.field_35685_h.func_40619_a()), "5");
        field_40371_m.put(Integer.valueOf(Potion.field_35682_m.func_40619_a()), "5");
        field_40371_m.put(Integer.valueOf(Potion.field_35689_u.func_40619_a()), "5");
    }
}
