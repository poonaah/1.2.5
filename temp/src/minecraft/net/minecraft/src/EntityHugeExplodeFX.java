// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            EntityFX, World, Tessellator

public class EntityHugeExplodeFX extends EntityFX
{

    private int field_35139_a;
    private int field_35138_ay;

    public EntityHugeExplodeFX(World p_i188_1_, double p_i188_2_, double p_i188_4_, double p_i188_6_, 
            double p_i188_8_, double p_i188_10_, double p_i188_12_)
    {
        super(p_i188_1_, p_i188_2_, p_i188_4_, p_i188_6_, 0.0D, 0.0D, 0.0D);
        field_35139_a = 0;
        field_35138_ay = 0;
        field_35138_ay = 8;
    }

    public void func_406_a(Tessellator tessellator, float f, float f1, float f2, float f3, float f4, float f5)
    {
    }

    public void func_370_e_()
    {
        for(int i = 0; i < 6; i++)
        {
            double d = field_611_ak + (field_9312_bd.nextDouble() - field_9312_bd.nextDouble()) * 4D;
            double d1 = field_610_al + (field_9312_bd.nextDouble() - field_9312_bd.nextDouble()) * 4D;
            double d2 = field_609_am + (field_9312_bd.nextDouble() - field_9312_bd.nextDouble()) * 4D;
            field_615_ag.func_694_a("largeexplode", d, d1, d2, (float)field_35139_a / (float)field_35138_ay, 0.0D, 0.0D);
        }

        field_35139_a++;
        if(field_35139_a == field_35138_ay)
        {
            func_395_F();
        }
    }

    public int func_404_c()
    {
        return 1;
    }
}
