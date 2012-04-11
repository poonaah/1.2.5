// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityFX, Entity, AxisAlignedBB, World, 
//            Tessellator

public class EntityCrit2FX extends EntityFX
{

    private Entity field_35134_a;
    private int field_35133_ay;
    private int field_35132_az;
    private String field_40105_ay;

    public EntityCrit2FX(World p_i329_1_, Entity p_i329_2_)
    {
        this(p_i329_1_, p_i329_2_, "crit");
    }

    public EntityCrit2FX(World p_i330_1_, Entity p_i330_2_, String p_i330_3_)
    {
        super(p_i330_1_, p_i330_2_.field_611_ak, p_i330_2_.field_601_au.field_1697_b + (double)(p_i330_2_.field_643_aD / 2.0F), p_i330_2_.field_609_am, p_i330_2_.field_608_an, p_i330_2_.field_607_ao, p_i330_2_.field_606_ap);
        field_35133_ay = 0;
        field_35132_az = 0;
        field_35134_a = p_i330_2_;
        field_35132_az = 3;
        field_40105_ay = p_i330_3_;
        func_370_e_();
    }

    public void func_406_a(Tessellator tessellator, float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public void func_370_e_()
    {
        for(int i = 0; i < 16; i++)
        {
            double d = field_9312_bd.nextFloat() * 2.0F - 1.0F;
            double d1 = field_9312_bd.nextFloat() * 2.0F - 1.0F;
            double d2 = field_9312_bd.nextFloat() * 2.0F - 1.0F;
            if(d * d + d1 * d1 + d2 * d2 <= 1.0D)
            {
                double d3 = field_35134_a.field_611_ak + (d * (double)field_35134_a.field_644_aC) / 4D;
                double d4 = field_35134_a.field_601_au.field_1697_b + (double)(field_35134_a.field_643_aD / 2.0F) + (d1 * (double)field_35134_a.field_643_aD) / 4D;
                double d5 = field_35134_a.field_609_am + (d2 * (double)field_35134_a.field_644_aC) / 4D;
                field_615_ag.func_694_a(field_40105_ay, d3, d4, d5, d, d1 + 0.20000000000000001D, d2);
            }
        }

        field_35133_ay++;
        if(field_35133_ay >= field_35132_az)
        {
            func_395_F();
        }
    }

    public int func_404_c()
    {
        return 3;
    }
}
