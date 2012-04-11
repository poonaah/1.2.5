// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityCreature, World, EntityPlayer, 
//            ItemStack, PathNavigate, EntityLookHelper

public class EntityAITempt extends EntityAIBase
{

    private EntityCreature field_48277_a;
    private float field_48275_b;
    private double field_48276_c;
    private double field_48273_d;
    private double field_48274_e;
    private double field_48271_f;
    private double field_48272_g;
    private EntityPlayer field_48282_h;
    private int field_48283_i;
    private boolean field_48280_j;
    private int field_48281_k;
    private boolean field_48278_l;
    private boolean field_48279_m;

    public EntityAITempt(EntityCreature p_i1020_1_, float p_i1020_2_, int p_i1020_3_, boolean p_i1020_4_)
    {
        field_48283_i = 0;
        field_48277_a = p_i1020_1_;
        field_48275_b = p_i1020_2_;
        field_48281_k = p_i1020_3_;
        field_48278_l = p_i1020_4_;
        func_46079_a(3);
    }

    public boolean func_46082_a()
    {
        if(field_48283_i > 0)
        {
            field_48283_i--;
            return false;
        }
        field_48282_h = field_48277_a.field_615_ag.func_609_a(field_48277_a, 10D);
        if(field_48282_h == null)
        {
            return false;
        }
        ItemStack itemstack = field_48282_h.func_6416_v();
        if(itemstack == null)
        {
            return false;
        }
        return itemstack.field_1617_c == field_48281_k;
    }

    public boolean func_46084_g()
    {
        if(field_48278_l)
        {
            if(field_48277_a.func_387_e(field_48282_h) < 36D)
            {
                if(field_48282_h.func_360_d(field_48276_c, field_48273_d, field_48274_e) > 0.010000000000000002D)
                {
                    return false;
                }
                if(Math.abs((double)field_48282_h.field_604_ar - field_48271_f) > 5D || Math.abs((double)field_48282_h.field_605_aq - field_48272_g) > 5D)
                {
                    return false;
                }
            } else
            {
                field_48276_c = field_48282_h.field_611_ak;
                field_48273_d = field_48282_h.field_610_al;
                field_48274_e = field_48282_h.field_609_am;
            }
            field_48271_f = field_48282_h.field_604_ar;
            field_48272_g = field_48282_h.field_605_aq;
        }
        return func_46082_a();
    }

    public void func_46080_e()
    {
        field_48276_c = field_48282_h.field_611_ak;
        field_48273_d = field_48282_h.field_610_al;
        field_48274_e = field_48282_h.field_609_am;
        field_48280_j = true;
        field_48279_m = field_48277_a.func_48084_aL().func_48658_a();
        field_48277_a.func_48084_aL().func_48664_a(false);
    }

    public void func_46077_d()
    {
        field_48282_h = null;
        field_48277_a.func_48084_aL().func_48672_f();
        field_48283_i = 100;
        field_48280_j = false;
        field_48277_a.func_48084_aL().func_48664_a(field_48279_m);
    }

    public void func_46081_b()
    {
        field_48277_a.func_46008_aG().func_46141_a(field_48282_h, 30F, field_48277_a.func_25026_x());
        if(field_48277_a.func_387_e(field_48282_h) < 6.25D)
        {
            field_48277_a.func_48084_aL().func_48672_f();
        } else
        {
            field_48277_a.func_48084_aL().func_48667_a(field_48282_h, field_48275_b);
        }
    }

    public boolean func_48270_h()
    {
        return field_48280_j;
    }
}
