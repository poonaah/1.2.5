// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemFood, EntityPlayer, World, DamageSource, 
//            NBTTagCompound

public class FoodStats
{

    private int field_35776_a;
    private float field_35774_b;
    private float field_35775_c;
    private int field_35772_d;
    private int field_35773_e;

    public FoodStats()
    {
        field_35772_d = 0;
        field_35776_a = 20;
        field_35773_e = 20;
        field_35774_b = 5F;
    }

    public void func_35771_a(int p_35771_1_, float p_35771_2_)
    {
        field_35776_a = Math.min(p_35771_1_ + field_35776_a, 20);
        field_35774_b = Math.min(field_35774_b + (float)p_35771_1_ * p_35771_2_ * 2.0F, field_35776_a);
    }

    public void func_35761_a(ItemFood p_35761_1_)
    {
        func_35771_a(p_35761_1_.func_25011_l(), p_35761_1_.func_35426_m());
    }

    public void func_35768_a(EntityPlayer p_35768_1_)
    {
        int i = p_35768_1_.field_615_ag.field_1039_l;
        field_35773_e = field_35776_a;
        if(field_35775_c > 4F)
        {
            field_35775_c -= 4F;
            if(field_35774_b > 0.0F)
            {
                field_35774_b = Math.max(field_35774_b - 1.0F, 0.0F);
            } else
            if(i > 0)
            {
                field_35776_a = Math.max(field_35776_a - 1, 0);
            }
        }
        if(field_35776_a >= 18 && p_35768_1_.func_35194_au())
        {
            field_35772_d++;
            if(field_35772_d >= 80)
            {
                p_35768_1_.func_432_b(1);
                field_35772_d = 0;
            }
        } else
        if(field_35776_a <= 0)
        {
            field_35772_d++;
            if(field_35772_d >= 80)
            {
                if(p_35768_1_.func_40114_aH() > 10 || i >= 3 || p_35768_1_.func_40114_aH() > 1 && i >= 2)
                {
                    p_35768_1_.func_396_a(DamageSource.field_35536_f, 1);
                }
                field_35772_d = 0;
            }
        } else
        {
            field_35772_d = 0;
        }
    }

    public void func_35766_a(NBTTagCompound p_35766_1_)
    {
        if(p_35766_1_.func_751_b("foodLevel"))
        {
            field_35776_a = p_35766_1_.func_756_e("foodLevel");
            field_35772_d = p_35766_1_.func_756_e("foodTickTimer");
            field_35774_b = p_35766_1_.func_752_g("foodSaturationLevel");
            field_35775_c = p_35766_1_.func_752_g("foodExhaustionLevel");
        }
    }

    public void func_35763_b(NBTTagCompound p_35763_1_)
    {
        p_35763_1_.func_758_a("foodLevel", field_35776_a);
        p_35763_1_.func_758_a("foodTickTimer", field_35772_d);
        p_35763_1_.func_744_a("foodSaturationLevel", field_35774_b);
        p_35763_1_.func_744_a("foodExhaustionLevel", field_35775_c);
    }

    public int func_35765_a()
    {
        return field_35776_a;
    }

    public int func_35769_b()
    {
        return field_35773_e;
    }

    public boolean func_35770_c()
    {
        return field_35776_a < 20;
    }

    public void func_35762_a(float p_35762_1_)
    {
        field_35775_c = Math.min(field_35775_c + p_35762_1_, 40F);
    }

    public float func_35760_d()
    {
        return field_35774_b;
    }

    public void func_35764_a(int p_35764_1_)
    {
        field_35776_a = p_35764_1_;
    }

    public void func_35767_b(float p_35767_1_)
    {
        field_35774_b = p_35767_1_;
    }
}
