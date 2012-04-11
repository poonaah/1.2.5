// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, IBlockAccess, BiomeGenBase, 
//            World, Vec3D, AxisAlignedBB, Entity

public abstract class BlockFluid extends Block
{

    protected BlockFluid(int p_i112_1_, Material p_i112_2_)
    {
        super(p_i112_1_, (p_i112_2_ != Material.field_1331_g ? 12 : 14) * 16 + 13, p_i112_2_);
        float f = 0.0F;
        float f1 = 0.0F;
        func_213_a(0.0F + f1, 0.0F + f, 0.0F + f1, 1.0F + f1, 1.0F + f, 1.0F + f1);
        func_253_b(true);
    }

    public boolean func_48204_b(IBlockAccess p_48204_1_, int p_48204_2_, int p_48204_3_, int p_48204_4_)
    {
        return field_356_bn != Material.field_1331_g;
    }

    public int func_35274_i()
    {
        return 0xffffff;
    }

    public int func_207_d(IBlockAccess p_207_1_, int p_207_2_, int p_207_3_, int p_207_4_)
    {
        if(field_356_bn == Material.field_1332_f)
        {
            int i = 0;
            int j = 0;
            int k = 0;
            for(int l = -1; l <= 1; l++)
            {
                for(int i1 = -1; i1 <= 1; i1++)
                {
                    int j1 = p_207_1_.func_48454_a(p_207_2_ + i1, p_207_4_ + l).field_40256_A;
                    i += (j1 & 0xff0000) >> 16;
                    j += (j1 & 0xff00) >> 8;
                    k += j1 & 0xff;
                }

            }

            return (i / 9 & 0xff) << 16 | (j / 9 & 0xff) << 8 | k / 9 & 0xff;
        } else
        {
            return 0xffffff;
        }
    }

    public static float func_288_b(int p_288_0_)
    {
        if(p_288_0_ >= 8)
        {
            p_288_0_ = 0;
        }
        float f = (float)(p_288_0_ + 1) / 9F;
        return f;
    }

    public int func_218_a(int p_218_1_)
    {
        if(p_218_1_ == 0 || p_218_1_ == 1)
        {
            return field_378_bb;
        } else
        {
            return field_378_bb + 1;
        }
    }

    protected int func_290_h(World p_290_1_, int p_290_2_, int p_290_3_, int p_290_4_)
    {
        if(p_290_1_.func_599_f(p_290_2_, p_290_3_, p_290_4_) != field_356_bn)
        {
            return -1;
        } else
        {
            return p_290_1_.func_602_e(p_290_2_, p_290_3_, p_290_4_);
        }
    }

    protected int func_289_b(IBlockAccess p_289_1_, int p_289_2_, int p_289_3_, int p_289_4_)
    {
        if(p_289_1_.func_599_f(p_289_2_, p_289_3_, p_289_4_) != field_356_bn)
        {
            return -1;
        }
        int i = p_289_1_.func_602_e(p_289_2_, p_289_3_, p_289_4_);
        if(i >= 8)
        {
            i = 0;
        }
        return i;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_224_a(int p_224_1_, boolean p_224_2_)
    {
        return p_224_2_ && p_224_1_ == 0;
    }

    public boolean func_28029_d(IBlockAccess p_28029_1_, int p_28029_2_, int p_28029_3_, int p_28029_4_, int p_28029_5_)
    {
        Material material = p_28029_1_.func_599_f(p_28029_2_, p_28029_3_, p_28029_4_);
        if(material == field_356_bn)
        {
            return false;
        }
        if(p_28029_5_ == 1)
        {
            return true;
        }
        if(material == Material.field_1320_r)
        {
            return false;
        } else
        {
            return super.func_28029_d(p_28029_1_, p_28029_2_, p_28029_3_, p_28029_4_, p_28029_5_);
        }
    }

    public boolean func_260_c(IBlockAccess p_260_1_, int p_260_2_, int p_260_3_, int p_260_4_, int p_260_5_)
    {
        Material material = p_260_1_.func_599_f(p_260_2_, p_260_3_, p_260_4_);
        if(material == field_356_bn)
        {
            return false;
        }
        if(p_260_5_ == 1)
        {
            return true;
        }
        if(material == Material.field_1320_r)
        {
            return false;
        } else
        {
            return super.func_260_c(p_260_1_, p_260_2_, p_260_3_, p_260_4_, p_260_5_);
        }
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int i)
    {
        return null;
    }

    public int func_210_f()
    {
        return 4;
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return 0;
    }

    public int func_229_a(Random p_229_1_)
    {
        return 0;
    }

    private Vec3D func_291_e(IBlockAccess p_291_1_, int p_291_2_, int p_291_3_, int p_291_4_)
    {
        Vec3D vec3d = Vec3D.func_1248_b(0.0D, 0.0D, 0.0D);
        int i = func_289_b(p_291_1_, p_291_2_, p_291_3_, p_291_4_);
        for(int j = 0; j < 4; j++)
        {
            int k = p_291_2_;
            int l = p_291_3_;
            int i1 = p_291_4_;
            if(j == 0)
            {
                k--;
            }
            if(j == 1)
            {
                i1--;
            }
            if(j == 2)
            {
                k++;
            }
            if(j == 3)
            {
                i1++;
            }
            int j1 = func_289_b(p_291_1_, k, l, i1);
            if(j1 < 0)
            {
                if(p_291_1_.func_599_f(k, l, i1).func_880_c())
                {
                    continue;
                }
                j1 = func_289_b(p_291_1_, k, l - 1, i1);
                if(j1 >= 0)
                {
                    int k1 = j1 - (i - 8);
                    vec3d = vec3d.func_1257_c((k - p_291_2_) * k1, (l - p_291_3_) * k1, (i1 - p_291_4_) * k1);
                }
                continue;
            }
            if(j1 >= 0)
            {
                int l1 = j1 - i;
                vec3d = vec3d.func_1257_c((k - p_291_2_) * l1, (l - p_291_3_) * l1, (i1 - p_291_4_) * l1);
            }
        }

        if(p_291_1_.func_602_e(p_291_2_, p_291_3_, p_291_4_) >= 8)
        {
            boolean flag = false;
            if(flag || func_28029_d(p_291_1_, p_291_2_, p_291_3_, p_291_4_ - 1, 2))
            {
                flag = true;
            }
            if(flag || func_28029_d(p_291_1_, p_291_2_, p_291_3_, p_291_4_ + 1, 3))
            {
                flag = true;
            }
            if(flag || func_28029_d(p_291_1_, p_291_2_ - 1, p_291_3_, p_291_4_, 4))
            {
                flag = true;
            }
            if(flag || func_28029_d(p_291_1_, p_291_2_ + 1, p_291_3_, p_291_4_, 5))
            {
                flag = true;
            }
            if(flag || func_28029_d(p_291_1_, p_291_2_, p_291_3_ + 1, p_291_4_ - 1, 2))
            {
                flag = true;
            }
            if(flag || func_28029_d(p_291_1_, p_291_2_, p_291_3_ + 1, p_291_4_ + 1, 3))
            {
                flag = true;
            }
            if(flag || func_28029_d(p_291_1_, p_291_2_ - 1, p_291_3_ + 1, p_291_4_, 4))
            {
                flag = true;
            }
            if(flag || func_28029_d(p_291_1_, p_291_2_ + 1, p_291_3_ + 1, p_291_4_, 5))
            {
                flag = true;
            }
            if(flag)
            {
                vec3d = vec3d.func_1252_b().func_1257_c(0.0D, -6D, 0.0D);
            }
        }
        vec3d = vec3d.func_1252_b();
        return vec3d;
    }

    public void func_257_a(World p_257_1_, int p_257_2_, int p_257_3_, int p_257_4_, Entity p_257_5_, Vec3D p_257_6_)
    {
        Vec3D vec3d = func_291_e(p_257_1_, p_257_2_, p_257_3_, p_257_4_);
        p_257_6_.field_1776_a += vec3d.field_1776_a;
        p_257_6_.field_1775_b += vec3d.field_1775_b;
        p_257_6_.field_1779_c += vec3d.field_1779_c;
    }

    public int func_4025_d()
    {
        if(field_356_bn == Material.field_1332_f)
        {
            return 5;
        }
        return field_356_bn != Material.field_1331_g ? 0 : 30;
    }

    public int func_35275_c(IBlockAccess p_35275_1_, int p_35275_2_, int p_35275_3_, int p_35275_4_)
    {
        int i = p_35275_1_.func_35451_b(p_35275_2_, p_35275_3_, p_35275_4_, 0);
        int j = p_35275_1_.func_35451_b(p_35275_2_, p_35275_3_ + 1, p_35275_4_, 0);
        int k = i & 0xff;
        int l = j & 0xff;
        int i1 = i >> 16 & 0xff;
        int j1 = j >> 16 & 0xff;
        return (k <= l ? l : k) | (i1 <= j1 ? j1 : i1) << 16;
    }

    public float func_241_c(IBlockAccess p_241_1_, int p_241_2_, int p_241_3_, int p_241_4_)
    {
        float f = p_241_1_.func_598_c(p_241_2_, p_241_3_, p_241_4_);
        float f1 = p_241_1_.func_598_c(p_241_2_, p_241_3_ + 1, p_241_4_);
        return f <= f1 ? f1 : f;
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        super.func_208_a(p_208_1_, p_208_2_, p_208_3_, p_208_4_, p_208_5_);
    }

    public int func_234_g()
    {
        return field_356_bn != Material.field_1332_f ? 0 : 1;
    }

    public void func_247_b(World p_247_1_, int p_247_2_, int p_247_3_, int p_247_4_, Random p_247_5_)
    {
        if(field_356_bn == Material.field_1332_f)
        {
            if(p_247_5_.nextInt(10) == 0)
            {
                int i = p_247_1_.func_602_e(p_247_2_, p_247_3_, p_247_4_);
                if(i <= 0 || i >= 8)
                {
                    p_247_1_.func_694_a("suspended", (float)p_247_2_ + p_247_5_.nextFloat(), (float)p_247_3_ + p_247_5_.nextFloat(), (float)p_247_4_ + p_247_5_.nextFloat(), 0.0D, 0.0D, 0.0D);
                }
            }
            for(int j = 0; j < 0; j++)
            {
                int l = p_247_5_.nextInt(4);
                int i1 = p_247_2_;
                int j1 = p_247_4_;
                if(l == 0)
                {
                    i1--;
                }
                if(l == 1)
                {
                    i1++;
                }
                if(l == 2)
                {
                    j1--;
                }
                if(l == 3)
                {
                    j1++;
                }
                if(p_247_1_.func_599_f(i1, p_247_3_, j1) != Material.field_1337_a || !p_247_1_.func_599_f(i1, p_247_3_ - 1, j1).func_880_c() && !p_247_1_.func_599_f(i1, p_247_3_ - 1, j1).func_879_d())
                {
                    continue;
                }
                float f = 0.0625F;
                double d6 = (float)p_247_2_ + p_247_5_.nextFloat();
                double d7 = (float)p_247_3_ + p_247_5_.nextFloat();
                double d8 = (float)p_247_4_ + p_247_5_.nextFloat();
                if(l == 0)
                {
                    d6 = (float)p_247_2_ - f;
                }
                if(l == 1)
                {
                    d6 = (float)(p_247_2_ + 1) + f;
                }
                if(l == 2)
                {
                    d8 = (float)p_247_4_ - f;
                }
                if(l == 3)
                {
                    d8 = (float)(p_247_4_ + 1) + f;
                }
                double d9 = 0.0D;
                double d10 = 0.0D;
                if(l == 0)
                {
                    d9 = -f;
                }
                if(l == 1)
                {
                    d9 = f;
                }
                if(l == 2)
                {
                    d10 = -f;
                }
                if(l == 3)
                {
                    d10 = f;
                }
                p_247_1_.func_694_a("splash", d6, d7, d8, d9, 0.0D, d10);
            }

        }
        if(field_356_bn == Material.field_1332_f && p_247_5_.nextInt(64) == 0)
        {
            int k = p_247_1_.func_602_e(p_247_2_, p_247_3_, p_247_4_);
            if(k > 0 && k < 8)
            {
                p_247_1_.func_684_a((float)p_247_2_ + 0.5F, (float)p_247_3_ + 0.5F, (float)p_247_4_ + 0.5F, "liquid.water", p_247_5_.nextFloat() * 0.25F + 0.75F, p_247_5_.nextFloat() * 1.0F + 0.5F);
            }
        }
        if(field_356_bn == Material.field_1331_g && p_247_1_.func_599_f(p_247_2_, p_247_3_ + 1, p_247_4_) == Material.field_1337_a && !p_247_1_.func_601_g(p_247_2_, p_247_3_ + 1, p_247_4_))
        {
            if(p_247_5_.nextInt(100) == 0)
            {
                double d = (float)p_247_2_ + p_247_5_.nextFloat();
                double d2 = (double)p_247_3_ + field_362_bj;
                double d4 = (float)p_247_4_ + p_247_5_.nextFloat();
                p_247_1_.func_694_a("lava", d, d2, d4, 0.0D, 0.0D, 0.0D);
                p_247_1_.func_684_a(d, d2, d4, "liquid.lavapop", 0.2F + p_247_5_.nextFloat() * 0.2F, 0.9F + p_247_5_.nextFloat() * 0.15F);
            }
            if(p_247_5_.nextInt(200) == 0)
            {
                p_247_1_.func_684_a(p_247_2_, p_247_3_, p_247_4_, "liquid.lava", 0.2F + p_247_5_.nextFloat() * 0.2F, 0.9F + p_247_5_.nextFloat() * 0.15F);
            }
        }
        if(p_247_5_.nextInt(10) == 0 && p_247_1_.func_28100_h(p_247_2_, p_247_3_ - 1, p_247_4_) && !p_247_1_.func_599_f(p_247_2_, p_247_3_ - 2, p_247_4_).func_880_c())
        {
            double d1 = (float)p_247_2_ + p_247_5_.nextFloat();
            double d3 = (double)p_247_3_ - 1.05D;
            double d5 = (float)p_247_4_ + p_247_5_.nextFloat();
            if(field_356_bn == Material.field_1332_f)
            {
                p_247_1_.func_694_a("dripWater", d1, d3, d5, 0.0D, 0.0D, 0.0D);
            } else
            {
                p_247_1_.func_694_a("dripLava", d1, d3, d5, 0.0D, 0.0D, 0.0D);
            }
        }
    }

    public static double func_293_a(IBlockAccess p_293_0_, int p_293_1_, int p_293_2_, int p_293_3_, Material p_293_4_)
    {
        Vec3D vec3d = null;
        if(p_293_4_ == Material.field_1332_f)
        {
            vec3d = ((BlockFluid)Block.field_401_B).func_291_e(p_293_0_, p_293_1_, p_293_2_, p_293_3_);
        }
        if(p_293_4_ == Material.field_1331_g)
        {
            vec3d = ((BlockFluid)Block.field_397_D).func_291_e(p_293_0_, p_293_1_, p_293_2_, p_293_3_);
        }
        if(vec3d.field_1776_a == 0.0D && vec3d.field_1779_c == 0.0D)
        {
            return -1000D;
        } else
        {
            return Math.atan2(vec3d.field_1779_c, vec3d.field_1776_a) - 1.5707963267948966D;
        }
    }

    public void func_235_e(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_)
    {
        func_287_j(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        func_287_j(p_226_1_, p_226_2_, p_226_3_, p_226_4_);
    }

    private void func_287_j(World p_287_1_, int p_287_2_, int p_287_3_, int p_287_4_)
    {
        if(p_287_1_.func_600_a(p_287_2_, p_287_3_, p_287_4_) != field_376_bc)
        {
            return;
        }
        if(field_356_bn == Material.field_1331_g)
        {
            boolean flag = false;
            if(flag || p_287_1_.func_599_f(p_287_2_, p_287_3_, p_287_4_ - 1) == Material.field_1332_f)
            {
                flag = true;
            }
            if(flag || p_287_1_.func_599_f(p_287_2_, p_287_3_, p_287_4_ + 1) == Material.field_1332_f)
            {
                flag = true;
            }
            if(flag || p_287_1_.func_599_f(p_287_2_ - 1, p_287_3_, p_287_4_) == Material.field_1332_f)
            {
                flag = true;
            }
            if(flag || p_287_1_.func_599_f(p_287_2_ + 1, p_287_3_, p_287_4_) == Material.field_1332_f)
            {
                flag = true;
            }
            if(flag || p_287_1_.func_599_f(p_287_2_, p_287_3_ + 1, p_287_4_) == Material.field_1332_f)
            {
                flag = true;
            }
            if(flag)
            {
                int i = p_287_1_.func_602_e(p_287_2_, p_287_3_, p_287_4_);
                if(i == 0)
                {
                    p_287_1_.func_690_d(p_287_2_, p_287_3_, p_287_4_, Block.field_405_aq.field_376_bc);
                } else
                if(i <= 4)
                {
                    p_287_1_.func_690_d(p_287_2_, p_287_3_, p_287_4_, Block.field_335_x.field_376_bc);
                }
                func_292_i(p_287_1_, p_287_2_, p_287_3_, p_287_4_);
            }
        }
    }

    protected void func_292_i(World p_292_1_, int p_292_2_, int p_292_3_, int p_292_4_)
    {
        p_292_1_.func_684_a((float)p_292_2_ + 0.5F, (float)p_292_3_ + 0.5F, (float)p_292_4_ + 0.5F, "random.fizz", 0.5F, 2.6F + (p_292_1_.field_1037_n.nextFloat() - p_292_1_.field_1037_n.nextFloat()) * 0.8F);
        for(int i = 0; i < 8; i++)
        {
            p_292_1_.func_694_a("largesmoke", (double)p_292_2_ + Math.random(), (double)p_292_3_ + 1.2D, (double)p_292_4_ + Math.random(), 0.0D, 0.0D, 0.0D);
        }

    }
}
