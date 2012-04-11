// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Vec3D, EntityCreature, MathHelper, ChunkCoordinates

public class RandomPositionGenerator
{

    private static Vec3D field_48624_a = Vec3D.func_1260_a(0.0D, 0.0D, 0.0D);

    public RandomPositionGenerator()
    {
    }

    public static Vec3D func_48622_a(EntityCreature p_48622_0_, int p_48622_1_, int p_48622_2_)
    {
        return func_48621_c(p_48622_0_, p_48622_1_, p_48622_2_, null);
    }

    public static Vec3D func_48620_a(EntityCreature p_48620_0_, int p_48620_1_, int p_48620_2_, Vec3D p_48620_3_)
    {
        field_48624_a.field_1776_a = p_48620_3_.field_1776_a - p_48620_0_.field_611_ak;
        field_48624_a.field_1775_b = p_48620_3_.field_1775_b - p_48620_0_.field_610_al;
        field_48624_a.field_1779_c = p_48620_3_.field_1779_c - p_48620_0_.field_609_am;
        return func_48621_c(p_48620_0_, p_48620_1_, p_48620_2_, field_48624_a);
    }

    public static Vec3D func_48623_b(EntityCreature p_48623_0_, int p_48623_1_, int p_48623_2_, Vec3D p_48623_3_)
    {
        field_48624_a.field_1776_a = p_48623_0_.field_611_ak - p_48623_3_.field_1776_a;
        field_48624_a.field_1775_b = p_48623_0_.field_610_al - p_48623_3_.field_1775_b;
        field_48624_a.field_1779_c = p_48623_0_.field_609_am - p_48623_3_.field_1779_c;
        return func_48621_c(p_48623_0_, p_48623_1_, p_48623_2_, field_48624_a);
    }

    private static Vec3D func_48621_c(EntityCreature p_48621_0_, int p_48621_1_, int p_48621_2_, Vec3D p_48621_3_)
    {
        Random random = p_48621_0_.func_46004_aK();
        boolean flag = false;
        int i = 0;
        int j = 0;
        int k = 0;
        float f = -99999F;
        boolean flag1;
        if(p_48621_0_.func_48087_aX())
        {
            double d = p_48621_0_.func_48091_aU().func_27439_a(MathHelper.func_1108_b(p_48621_0_.field_611_ak), MathHelper.func_1108_b(p_48621_0_.field_610_al), MathHelper.func_1108_b(p_48621_0_.field_609_am)) + 4D;
            flag1 = d < (double)(p_48621_0_.func_48099_aV() + (float)p_48621_1_);
        } else
        {
            flag1 = false;
        }
        for(int l = 0; l < 10; l++)
        {
            int i1 = random.nextInt(2 * p_48621_1_) - p_48621_1_;
            int j1 = random.nextInt(2 * p_48621_2_) - p_48621_2_;
            int k1 = random.nextInt(2 * p_48621_1_) - p_48621_1_;
            if(p_48621_3_ != null && (double)i1 * p_48621_3_.field_1776_a + (double)k1 * p_48621_3_.field_1779_c < 0.0D)
            {
                continue;
            }
            i1 += MathHelper.func_1108_b(p_48621_0_.field_611_ak);
            j1 += MathHelper.func_1108_b(p_48621_0_.field_610_al);
            k1 += MathHelper.func_1108_b(p_48621_0_.field_609_am);
            if(flag1 && !p_48621_0_.func_48096_f(i1, j1, k1))
            {
                continue;
            }
            float f1 = p_48621_0_.func_439_a(i1, j1, k1);
            if(f1 > f)
            {
                f = f1;
                i = i1;
                j = j1;
                k = k1;
                flag = true;
            }
        }

        if(flag)
        {
            return Vec3D.func_1248_b(i, j, k);
        } else
        {
            return null;
        }
    }

}
