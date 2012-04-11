// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, Tessellator, EntityLightningBolt, Entity

public class RenderLightningBolt extends Render
{

    public RenderLightningBolt()
    {
    }

    public void func_27002_a(EntityLightningBolt p_27002_1_, double p_27002_2_, double p_27002_4_, double p_27002_6_, 
            float p_27002_8_, float p_27002_9_)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glDisable(3553);
        GL11.glDisable(2896);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 1);
        double ad[] = new double[8];
        double ad1[] = new double[8];
        double d = 0.0D;
        double d1 = 0.0D;
        Random random = new Random(p_27002_1_.field_27029_a);
        for(int j = 7; j >= 0; j--)
        {
            ad[j] = d;
            ad1[j] = d1;
            d += random.nextInt(11) - 5;
            d1 += random.nextInt(11) - 5;
        }

        for(int i = 0; i < 4; i++)
        {
            Random random1 = new Random(p_27002_1_.field_27029_a);
            for(int k = 0; k < 3; k++)
            {
                int l = 7;
                int i1 = 0;
                if(k > 0)
                {
                    l = 7 - k;
                }
                if(k > 0)
                {
                    i1 = l - 2;
                }
                double d2 = ad[l] - d;
                double d3 = ad1[l] - d1;
                for(int j1 = l; j1 >= i1; j1--)
                {
                    double d4 = d2;
                    double d5 = d3;
                    if(k == 0)
                    {
                        d2 += random1.nextInt(11) - 5;
                        d3 += random1.nextInt(11) - 5;
                    } else
                    {
                        d2 += random1.nextInt(31) - 15;
                        d3 += random1.nextInt(31) - 15;
                    }
                    tessellator.func_992_a(5);
                    float f = 0.5F;
                    tessellator.func_986_a(0.9F * f, 0.9F * f, 1.0F * f, 0.3F);
                    double d6 = 0.10000000000000001D + (double)i * 0.20000000000000001D;
                    if(k == 0)
                    {
                        d6 *= (double)j1 * 0.10000000000000001D + 1.0D;
                    }
                    double d7 = 0.10000000000000001D + (double)i * 0.20000000000000001D;
                    if(k == 0)
                    {
                        d7 *= (double)(j1 - 1) * 0.10000000000000001D + 1.0D;
                    }
                    for(int k1 = 0; k1 < 5; k1++)
                    {
                        double d8 = (p_27002_2_ + 0.5D) - d6;
                        double d9 = (p_27002_6_ + 0.5D) - d6;
                        if(k1 == 1 || k1 == 2)
                        {
                            d8 += d6 * 2D;
                        }
                        if(k1 == 2 || k1 == 3)
                        {
                            d9 += d6 * 2D;
                        }
                        double d10 = (p_27002_2_ + 0.5D) - d7;
                        double d11 = (p_27002_6_ + 0.5D) - d7;
                        if(k1 == 1 || k1 == 2)
                        {
                            d10 += d7 * 2D;
                        }
                        if(k1 == 2 || k1 == 3)
                        {
                            d11 += d7 * 2D;
                        }
                        tessellator.func_991_a(d10 + d2, p_27002_4_ + (double)(j1 * 16), d11 + d3);
                        tessellator.func_991_a(d8 + d4, p_27002_4_ + (double)((j1 + 1) * 16), d9 + d5);
                    }

                    tessellator.func_982_a();
                }

            }

        }

        GL11.glDisable(3042);
        GL11.glEnable(2896);
        GL11.glEnable(3553);
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_27002_a((EntityLightningBolt)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
