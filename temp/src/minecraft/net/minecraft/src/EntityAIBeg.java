// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityAIBase, EntityWolf, World, EntityPlayer, 
//            EntityLookHelper, InventoryPlayer, ItemStack, Item

public class EntityAIBeg extends EntityAIBase
{

    private EntityWolf field_48350_a;
    private EntityPlayer field_48348_b;
    private World field_48349_c;
    private float field_48346_d;
    private int field_48347_e;

    public EntityAIBeg(EntityWolf p_i1085_1_, float p_i1085_2_)
    {
        field_48350_a = p_i1085_1_;
        field_48349_c = p_i1085_1_.field_615_ag;
        field_48346_d = p_i1085_2_;
        func_46079_a(2);
    }

    public boolean func_46082_a()
    {
        field_48348_b = field_48349_c.func_609_a(field_48350_a, field_48346_d);
        if(field_48348_b == null)
        {
            return false;
        } else
        {
            return func_48345_a(field_48348_b);
        }
    }

    public boolean func_46084_g()
    {
        if(!field_48348_b.func_354_B())
        {
            return false;
        }
        if(field_48350_a.func_387_e(field_48348_b) > (double)(field_48346_d * field_48346_d))
        {
            return false;
        } else
        {
            return field_48347_e > 0 && func_48345_a(field_48348_b);
        }
    }

    public void func_46080_e()
    {
        field_48350_a.func_48150_h(true);
        field_48347_e = 40 + field_48350_a.func_46004_aK().nextInt(40);
    }

    public void func_46077_d()
    {
        field_48350_a.func_48150_h(false);
        field_48348_b = null;
    }

    public void func_46081_b()
    {
        field_48350_a.func_46008_aG().func_46143_a(field_48348_b.field_611_ak, field_48348_b.field_610_al + (double)field_48348_b.func_373_s(), field_48348_b.field_609_am, 10F, field_48350_a.func_25026_x());
        field_48347_e--;
    }

    private boolean func_48345_a(EntityPlayer p_48345_1_)
    {
        ItemStack itemstack = p_48345_1_.field_778_b.func_494_a();
        if(itemstack == null)
        {
            return false;
        }
        if(!field_48350_a.func_48139_F_() && itemstack.field_1617_c == Item.field_21020_aV.field_291_aS)
        {
            return true;
        } else
        {
            return field_48350_a.func_40143_a(itemstack);
        }
    }
}
