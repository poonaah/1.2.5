// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;

// Referenced classes of package net.minecraft.src:
//            Potion, EntityLiving

public class PotionEffect
{

    private int field_35805_a;
    private int field_35803_b;
    private int field_35804_c;

    public PotionEffect(int p_i196_1_, int p_i196_2_, int p_i196_3_)
    {
        field_35805_a = p_i196_1_;
        field_35803_b = p_i196_2_;
        field_35804_c = p_i196_3_;
    }

    public PotionEffect(PotionEffect p_i197_1_)
    {
        field_35805_a = p_i197_1_.field_35805_a;
        field_35803_b = p_i197_1_.field_35803_b;
        field_35804_c = p_i197_1_.field_35804_c;
    }

    public void func_35796_a(PotionEffect p_35796_1_)
    {
        if(field_35805_a != p_35796_1_.field_35805_a)
        {
            System.err.println("This method should only be called for matching effects!");
        }
        if(p_35796_1_.field_35804_c > field_35804_c)
        {
            field_35804_c = p_35796_1_.field_35804_c;
            field_35803_b = p_35796_1_.field_35803_b;
        } else
        if(p_35796_1_.field_35804_c == field_35804_c && field_35803_b < p_35796_1_.field_35803_b)
        {
            field_35803_b = p_35796_1_.field_35803_b;
        }
    }

    public int func_35799_a()
    {
        return field_35805_a;
    }

    public int func_35802_b()
    {
        return field_35803_b;
    }

    public int func_35801_c()
    {
        return field_35804_c;
    }

    public boolean func_35798_a(EntityLiving p_35798_1_)
    {
        if(field_35803_b > 0)
        {
            if(Potion.field_35678_a[field_35805_a].func_35660_a(field_35803_b, field_35804_c))
            {
                func_35800_b(p_35798_1_);
            }
            func_35797_d();
        }
        return field_35803_b > 0;
    }

    private int func_35797_d()
    {
        return --field_35803_b;
    }

    public void func_35800_b(EntityLiving p_35800_1_)
    {
        if(field_35803_b > 0)
        {
            Potion.field_35678_a[field_35805_a].func_35662_a(p_35800_1_, field_35804_c);
        }
    }

    public String func_40468_d()
    {
        return Potion.field_35678_a[field_35805_a].func_40623_c();
    }

    public int hashCode()
    {
        return field_35805_a;
    }

    public String toString()
    {
        String s = "";
        if(func_35801_c() > 0)
        {
            s = (new StringBuilder()).append(func_40468_d()).append(" x ").append(func_35801_c() + 1).append(", Duration: ").append(func_35802_b()).toString();
        } else
        {
            s = (new StringBuilder()).append(func_40468_d()).append(", Duration: ").append(func_35802_b()).toString();
        }
        if(Potion.field_35678_a[field_35805_a].func_40612_i())
        {
            return (new StringBuilder()).append("(").append(s).append(")").toString();
        } else
        {
            return s;
        }
    }

    public boolean equals(Object p_equals_1_)
    {
        if(!(p_equals_1_ instanceof PotionEffect))
        {
            return false;
        } else
        {
            PotionEffect potioneffect = (PotionEffect)p_equals_1_;
            return field_35805_a == potioneffect.field_35805_a && field_35804_c == potioneffect.field_35804_c && field_35803_b == potioneffect.field_35803_b;
        }
    }
}
