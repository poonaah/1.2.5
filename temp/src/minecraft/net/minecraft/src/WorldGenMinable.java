// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            WorldGenerator, MathHelper, World, Block

public class WorldGenMinable extends WorldGenerator
{

    private int field_884_a;
    private int field_883_b;

    public WorldGenMinable(int p_i300_1_, int p_i300_2_)
    {
        field_884_a = p_i300_1_;
        field_883_b = p_i300_2_;
    }

    public boolean func_516_a(World p_516_1_, Random p_516_2_, int p_516_3_, int p_516_4_, int p_516_5_)
    {
        float f = p_516_2_.nextFloat() * 3.141593F;
        double d = (float)(p_516_3_ + 8) + (MathHelper.func_1106_a(f) * (float)field_883_b) / 8F;
        double d1 = (float)(p_516_3_ + 8) - (MathHelper.func_1106_a(f) * (float)field_883_b) / 8F;
        double d2 = (float)(p_516_5_ + 8) + (MathHelper.func_1114_b(f) * (float)field_883_b) / 8F;
        double d3 = (float)(p_516_5_ + 8) - (MathHelper.func_1114_b(f) * (float)field_883_b) / 8F;
        double d4 = (p_516_4_ + p_516_2_.nextInt(3)) - 2;
        double d5 = (p_516_4_ + p_516_2_.nextInt(3)) - 2;
        for(int i = 0; i <= field_883_b; i++)
        {
            double d6 = d + ((d1 - d) * (double)i) / (double)field_883_b;
            double d7 = d4 + ((d5 - d4) * (double)i) / (double)field_883_b;
            double d8 = d2 + ((d3 - d2) * (double)i) / (double)field_883_b;
            double d9 = (p_516_2_.nextDouble() * (double)field_883_b) / 16D;
            double d10 = (double)(MathHelper.func_1106_a(((float)i * 3.141593F) / (float)field_883_b) + 1.0F) * d9 + 1.0D;
            double d11 = (double)(MathHelper.func_1106_a(((float)i * 3.141593F) / (float)field_883_b) + 1.0F) * d9 + 1.0D;
            int j = MathHelper.func_1108_b(d6 - d10 / 2D);
            int k = MathHelper.func_1108_b(d7 - d11 / 2D);
            int l = MathHelper.func_1108_b(d8 - d10 / 2D);
            int i1 = MathHelper.func_1108_b(d6 + d10 / 2D);
            int j1 = MathHelper.func_1108_b(d7 + d11 / 2D);
            int k1 = MathHelper.func_1108_b(d8 + d10 / 2D);
            for(int l1 = j; l1 <= i1; l1++)
            {
                double d12 = (((double)l1 + 0.5D) - d6) / (d10 / 2D);
                if(d12 * d12 >= 1.0D)
                {
                    continue;
                }
                for(int i2 = k; i2 <= j1; i2++)
                {
                    double d13 = (((double)i2 + 0.5D) - d7) / (d11 / 2D);
                    if(d12 * d12 + d13 * d13 >= 1.0D)
                    {
                        continue;
                    }
                    for(int j2 = l; j2 <= k1; j2++)
                    {
                        double d14 = (((double)j2 + 0.5D) - d8) / (d10 / 2D);
                        if(d12 * d12 + d13 * d13 + d14 * d14 < 1.0D && p_516_1_.func_600_a(l1, i2, j2) == Block.field_338_u.field_376_bc)
                        {
                            p_516_1_.func_634_a(l1, i2, j2, field_884_a);
                        }
                    }

                }

            }

        }

        return true;
    }
}
