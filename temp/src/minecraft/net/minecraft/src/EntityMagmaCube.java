// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntitySlime, World, Item

public class EntityMagmaCube extends EntitySlime
{

    public EntityMagmaCube(World p_i137_1_)
    {
        super(p_i137_1_);
        field_9357_z = "/mob/lava.png";
        field_9304_bm = true;
        field_35169_bv = 0.2F;
    }

    public boolean func_433_a()
    {
        return field_615_ag.field_1039_l > 0 && field_615_ag.func_604_a(field_601_au) && field_615_ag.func_697_a(this, field_601_au).size() == 0 && !field_615_ag.func_662_b(field_601_au);
    }

    public int func_40119_ar()
    {
        return func_25027_v() * 3;
    }

    public int func_35115_a(float p_35115_1_)
    {
        return 0xf000f0;
    }

    public float func_382_a(float p_382_1_)
    {
        return 1.0F;
    }

    protected String func_40135_ac()
    {
        return "flame";
    }

    protected EntitySlime func_40132_ae()
    {
        return new EntityMagmaCube(field_615_ag);
    }

    protected int func_422_g()
    {
        return Item.field_40412_bx.field_291_aS;
    }

    protected void func_21066_o(boolean p_21066_1_, int p_21066_2_)
    {
        int i = func_422_g();
        if(i > 0 && func_25027_v() > 1)
        {
            int j = field_9312_bd.nextInt(4) - 2;
            if(p_21066_2_ > 0)
            {
                j += field_9312_bd.nextInt(p_21066_2_ + 1);
            }
            for(int k = 0; k < j; k++)
            {
                func_367_b(i, 1);
            }

        }
    }

    public boolean func_21062_U()
    {
        return false;
    }

    protected int func_40131_af()
    {
        return super.func_40131_af() * 4;
    }

    protected void func_40136_ag()
    {
        field_40139_a = field_40139_a * 0.9F;
    }

    protected void func_424_C()
    {
        field_607_ao = 0.42F + (float)func_25027_v() * 0.1F;
        field_35118_ao = true;
    }

    protected void func_400_c(float f)
    {
    }

    protected boolean func_40137_ah()
    {
        return true;
    }

    protected int func_40130_ai()
    {
        return super.func_40130_ai() + 2;
    }

    protected String func_6394_f_()
    {
        return "mob.slime";
    }

    protected String func_6390_f()
    {
        return "mob.slime";
    }

    protected String func_40138_aj()
    {
        if(func_25027_v() > 1)
        {
            return "mob.magmacube.big";
        } else
        {
            return "mob.magmacube.small";
        }
    }

    public boolean func_359_G()
    {
        return false;
    }

    protected boolean func_40134_ak()
    {
        return true;
    }
}
