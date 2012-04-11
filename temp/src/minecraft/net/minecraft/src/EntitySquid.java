// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityWaterMob, ItemStack, Item, AxisAlignedBB, 
//            Material, World, MathHelper, NBTTagCompound, 
//            EntityPlayer

public class EntitySquid extends EntityWaterMob
{

    public float field_21089_a;
    public float field_21088_b;
    public float field_21087_c;
    public float field_21086_f;
    public float field_21085_g;
    public float field_21084_h;
    public float field_21083_i;
    public float field_21082_j;
    private float field_21081_k;
    private float field_21080_l;
    private float field_21079_m;
    private float field_21078_n;
    private float field_21077_o;
    private float field_21076_p;

    public EntitySquid(World p_i202_1_)
    {
        super(p_i202_1_);
        field_21089_a = 0.0F;
        field_21088_b = 0.0F;
        field_21087_c = 0.0F;
        field_21086_f = 0.0F;
        field_21085_g = 0.0F;
        field_21084_h = 0.0F;
        field_21083_i = 0.0F;
        field_21082_j = 0.0F;
        field_21081_k = 0.0F;
        field_21080_l = 0.0F;
        field_21079_m = 0.0F;
        field_21078_n = 0.0F;
        field_21077_o = 0.0F;
        field_21076_p = 0.0F;
        field_9357_z = "/mob/squid.png";
        func_371_a(0.95F, 0.95F);
        field_21080_l = (1.0F / (field_9312_bd.nextFloat() + 1.0F)) * 0.2F;
    }

    public int func_40117_c()
    {
        return 10;
    }

    public void func_352_a(NBTTagCompound p_352_1_)
    {
        super.func_352_a(p_352_1_);
    }

    public void func_357_b(NBTTagCompound p_357_1_)
    {
        super.func_357_b(p_357_1_);
    }

    protected String func_6389_d()
    {
        return null;
    }

    protected String func_6394_f_()
    {
        return null;
    }

    protected String func_6390_f()
    {
        return null;
    }

    protected float func_6393_h()
    {
        return 0.4F;
    }

    protected int func_422_g()
    {
        return 0;
    }

    protected void func_21066_o(boolean p_21066_1_, int p_21066_2_)
    {
        int i = field_9312_bd.nextInt(3 + p_21066_2_) + 1;
        for(int j = 0; j < i; j++)
        {
            func_21058_a(new ItemStack(Item.field_21021_aU, 1, 0), 0.0F);
        }

    }

    public boolean func_353_a(EntityPlayer p_353_1_)
    {
        return super.func_353_a(p_353_1_);
    }

    public boolean func_27013_ag()
    {
        return field_615_ag.func_682_a(field_601_au.func_1177_b(0.0D, -0.60000002384185791D, 0.0D), Material.field_1332_f, this);
    }

    public void func_425_j()
    {
        super.func_425_j();
        field_21088_b = field_21089_a;
        field_21086_f = field_21087_c;
        field_21084_h = field_21085_g;
        field_21082_j = field_21083_i;
        field_21085_g += field_21080_l;
        if(field_21085_g > 6.283185F)
        {
            field_21085_g -= 6.283185F;
            if(field_9312_bd.nextInt(10) == 0)
            {
                field_21080_l = (1.0F / (field_9312_bd.nextFloat() + 1.0F)) * 0.2F;
            }
        }
        if(func_27013_ag())
        {
            if(field_21085_g < 3.141593F)
            {
                float f = field_21085_g / 3.141593F;
                field_21083_i = MathHelper.func_1106_a(f * f * 3.141593F) * 3.141593F * 0.25F;
                if((double)f > 0.75D)
                {
                    field_21081_k = 1.0F;
                    field_21079_m = 1.0F;
                } else
                {
                    field_21079_m = field_21079_m * 0.8F;
                }
            } else
            {
                field_21083_i = 0.0F;
                field_21081_k = field_21081_k * 0.9F;
                field_21079_m = field_21079_m * 0.99F;
            }
            if(!field_615_ag.field_1026_y)
            {
                field_608_an = field_21078_n * field_21081_k;
                field_607_ao = field_21077_o * field_21081_k;
                field_606_ap = field_21076_p * field_21081_k;
            }
            float f1 = MathHelper.func_1109_a(field_608_an * field_608_an + field_606_ap * field_606_ap);
            field_735_n += ((-(float)Math.atan2(field_608_an, field_606_ap) * 180F) / 3.141593F - field_735_n) * 0.1F;
            field_605_aq = field_735_n;
            field_21087_c = field_21087_c + 3.141593F * field_21079_m * 1.5F;
            field_21089_a += ((-(float)Math.atan2(f1, field_607_ao) * 180F) / 3.141593F - field_21089_a) * 0.1F;
        } else
        {
            field_21083_i = MathHelper.func_1112_e(MathHelper.func_1106_a(field_21085_g)) * 3.141593F * 0.25F;
            if(!field_615_ag.field_1026_y)
            {
                field_608_an = 0.0D;
                field_607_ao -= 0.080000000000000002D;
                field_607_ao *= 0.98000001907348633D;
                field_606_ap = 0.0D;
            }
            field_21089_a += (double)(-90F - field_21089_a) * 0.02D;
        }
    }

    public void func_435_b(float p_435_1_, float p_435_2_)
    {
        func_349_c(field_608_an, field_607_ao, field_606_ap);
    }

    protected void func_418_b_()
    {
        field_9344_ag++;
        if(field_9344_ag > 100)
        {
            field_21078_n = field_21077_o = field_21076_p = 0.0F;
        } else
        if(field_9312_bd.nextInt(50) == 0 || !field_9307_bi || field_21078_n == 0.0F && field_21077_o == 0.0F && field_21076_p == 0.0F)
        {
            float f = field_9312_bd.nextFloat() * 3.141593F * 2.0F;
            field_21078_n = MathHelper.func_1114_b(f) * 0.2F;
            field_21077_o = -0.1F + field_9312_bd.nextFloat() * 0.2F;
            field_21076_p = MathHelper.func_1106_a(f) * 0.2F;
        }
        func_27021_X();
    }

    public boolean func_433_a()
    {
        return field_610_al > 45D && field_610_al < 63D && super.func_433_a();
    }
}
