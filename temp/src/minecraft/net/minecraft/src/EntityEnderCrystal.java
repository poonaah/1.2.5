// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Entity, DataWatcher, MathHelper, World, 
//            Block, BlockFire, NBTTagCompound, DamageSource

public class EntityEnderCrystal extends Entity
{

    public int field_41032_a;
    public int field_41031_b;

    public EntityEnderCrystal(World p_i302_1_)
    {
        super(p_i302_1_);
        field_41032_a = 0;
        field_618_ad = true;
        func_371_a(2.0F, 2.0F);
        field_9292_aO = field_643_aD / 2.0F;
        field_41031_b = 5;
        field_41032_a = field_9312_bd.nextInt(0x186a0);
    }

    public EntityEnderCrystal(World p_i303_1_, double p_i303_2_, double p_i303_4_, double p_i303_6_)
    {
        this(p_i303_1_);
        func_347_a(p_i303_2_, p_i303_4_, p_i303_6_);
    }

    protected boolean func_25021_m()
    {
        return false;
    }

    protected void func_21057_b()
    {
        field_21064_bx.func_21124_a(8, Integer.valueOf(field_41031_b));
    }

    public void func_370_e_()
    {
        field_9285_at = field_611_ak;
        field_9284_au = field_610_al;
        field_9283_av = field_609_am;
        field_41032_a++;
        field_21064_bx.func_21129_b(8, Integer.valueOf(field_41031_b));
        int i = MathHelper.func_1108_b(field_611_ak);
        int j = MathHelper.func_1108_b(field_610_al);
        int k = MathHelper.func_1108_b(field_609_am);
        if(field_615_ag.func_600_a(i, j, k) != Block.field_402_as.field_376_bc)
        {
            field_615_ag.func_690_d(i, j, k, Block.field_402_as.field_376_bc);
        }
    }

    protected void func_352_a(NBTTagCompound nbttagcompound)
    {
    }

    protected void func_357_b(NBTTagCompound nbttagcompound)
    {
    }

    public float func_392_h_()
    {
        return 0.0F;
    }

    public boolean func_401_c_()
    {
        return true;
    }

    public boolean func_396_a(DamageSource p_396_1_, int p_396_2_)
    {
        if(!field_646_aA && !field_615_ag.field_1026_y)
        {
            field_41031_b = 0;
            if(field_41031_b <= 0)
            {
                if(!field_615_ag.field_1026_y)
                {
                    func_395_F();
                    field_615_ag.func_12243_a(null, field_611_ak, field_610_al, field_609_am, 6F);
                } else
                {
                    func_395_F();
                }
            }
        }
        return true;
    }
}
