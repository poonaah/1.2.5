// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class ClippingHelper
{

    public float field_1688_a[][];
    public float field_1687_b[];
    public float field_1690_c[];
    public float field_1689_d[];

    public ClippingHelper()
    {
        field_1688_a = new float[16][16];
        field_1687_b = new float[16];
        field_1690_c = new float[16];
        field_1689_d = new float[16];
    }

    public boolean func_1152_a(double p_1152_1_, double p_1152_3_, double p_1152_5_, double p_1152_7_, double p_1152_9_, double p_1152_11_)
    {
        for(int i = 0; i < 6; i++)
        {
            float f = (float)p_1152_1_;
            float f1 = (float)p_1152_3_;
            float f2 = (float)p_1152_5_;
            float f3 = (float)p_1152_7_;
            float f4 = (float)p_1152_9_;
            float f5 = (float)p_1152_11_;
            if(field_1688_a[i][0] * f + field_1688_a[i][1] * f1 + field_1688_a[i][2] * f2 + field_1688_a[i][3] <= 0.0F && field_1688_a[i][0] * f3 + field_1688_a[i][1] * f1 + field_1688_a[i][2] * f2 + field_1688_a[i][3] <= 0.0F && field_1688_a[i][0] * f + field_1688_a[i][1] * f4 + field_1688_a[i][2] * f2 + field_1688_a[i][3] <= 0.0F && field_1688_a[i][0] * f3 + field_1688_a[i][1] * f4 + field_1688_a[i][2] * f2 + field_1688_a[i][3] <= 0.0F && field_1688_a[i][0] * f + field_1688_a[i][1] * f1 + field_1688_a[i][2] * f5 + field_1688_a[i][3] <= 0.0F && field_1688_a[i][0] * f3 + field_1688_a[i][1] * f1 + field_1688_a[i][2] * f5 + field_1688_a[i][3] <= 0.0F && field_1688_a[i][0] * f + field_1688_a[i][1] * f4 + field_1688_a[i][2] * f5 + field_1688_a[i][3] <= 0.0F && field_1688_a[i][0] * f3 + field_1688_a[i][1] * f4 + field_1688_a[i][2] * f5 + field_1688_a[i][3] <= 0.0F)
            {
                return false;
            }
        }

        return true;
    }

    public boolean isBoxInFrustumFully(double d, double d1, double d2, double d3, double d4, double d5)
    {
        for(int i = 0; i < 6; i++)
        {
            float f = (float)d;
            float f1 = (float)d1;
            float f2 = (float)d2;
            float f3 = (float)d3;
            float f4 = (float)d4;
            float f5 = (float)d5;
            if(i < 4)
            {
                if(field_1688_a[i][0] * f + field_1688_a[i][1] * f1 + field_1688_a[i][2] * f2 + field_1688_a[i][3] <= 0.0F || field_1688_a[i][0] * f3 + field_1688_a[i][1] * f1 + field_1688_a[i][2] * f2 + field_1688_a[i][3] <= 0.0F || field_1688_a[i][0] * f + field_1688_a[i][1] * f4 + field_1688_a[i][2] * f2 + field_1688_a[i][3] <= 0.0F || field_1688_a[i][0] * f3 + field_1688_a[i][1] * f4 + field_1688_a[i][2] * f2 + field_1688_a[i][3] <= 0.0F || field_1688_a[i][0] * f + field_1688_a[i][1] * f1 + field_1688_a[i][2] * f5 + field_1688_a[i][3] <= 0.0F || field_1688_a[i][0] * f3 + field_1688_a[i][1] * f1 + field_1688_a[i][2] * f5 + field_1688_a[i][3] <= 0.0F || field_1688_a[i][0] * f + field_1688_a[i][1] * f4 + field_1688_a[i][2] * f5 + field_1688_a[i][3] <= 0.0F || field_1688_a[i][0] * f3 + field_1688_a[i][1] * f4 + field_1688_a[i][2] * f5 + field_1688_a[i][3] <= 0.0F)
                {
                    return false;
                }
                continue;
            }
            if(field_1688_a[i][0] * f + field_1688_a[i][1] * f1 + field_1688_a[i][2] * f2 + field_1688_a[i][3] <= 0.0F && field_1688_a[i][0] * f3 + field_1688_a[i][1] * f1 + field_1688_a[i][2] * f2 + field_1688_a[i][3] <= 0.0F && field_1688_a[i][0] * f + field_1688_a[i][1] * f4 + field_1688_a[i][2] * f2 + field_1688_a[i][3] <= 0.0F && field_1688_a[i][0] * f3 + field_1688_a[i][1] * f4 + field_1688_a[i][2] * f2 + field_1688_a[i][3] <= 0.0F && field_1688_a[i][0] * f + field_1688_a[i][1] * f1 + field_1688_a[i][2] * f5 + field_1688_a[i][3] <= 0.0F && field_1688_a[i][0] * f3 + field_1688_a[i][1] * f1 + field_1688_a[i][2] * f5 + field_1688_a[i][3] <= 0.0F && field_1688_a[i][0] * f + field_1688_a[i][1] * f4 + field_1688_a[i][2] * f5 + field_1688_a[i][3] <= 0.0F && field_1688_a[i][0] * f3 + field_1688_a[i][1] * f4 + field_1688_a[i][2] * f5 + field_1688_a[i][3] <= 0.0F)
            {
                return false;
            }
        }

        return true;
    }
}
