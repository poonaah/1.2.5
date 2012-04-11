// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, IBlockAccess, 
//            AxisAlignedBB, EntityPlayer

public class BlockButton extends Block
{

    protected BlockButton(int p_i414_1_, int p_i414_2_)
    {
        super(p_i414_1_, p_i414_2_, Material.field_1324_n);
        func_253_b(true);
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int i)
    {
        return null;
    }

    public int func_4025_d()
    {
        return 20;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public boolean func_28030_e(World p_28030_1_, int p_28030_2_, int p_28030_3_, int p_28030_4_, int p_28030_5_)
    {
        if(p_28030_5_ == 2 && p_28030_1_.func_28100_h(p_28030_2_, p_28030_3_, p_28030_4_ + 1))
        {
            return true;
        }
        if(p_28030_5_ == 3 && p_28030_1_.func_28100_h(p_28030_2_, p_28030_3_, p_28030_4_ - 1))
        {
            return true;
        }
        if(p_28030_5_ == 4 && p_28030_1_.func_28100_h(p_28030_2_ + 1, p_28030_3_, p_28030_4_))
        {
            return true;
        }
        return p_28030_5_ == 5 && p_28030_1_.func_28100_h(p_28030_2_ - 1, p_28030_3_, p_28030_4_);
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        if(p_243_1_.func_28100_h(p_243_2_ - 1, p_243_3_, p_243_4_))
        {
            return true;
        }
        if(p_243_1_.func_28100_h(p_243_2_ + 1, p_243_3_, p_243_4_))
        {
            return true;
        }
        if(p_243_1_.func_28100_h(p_243_2_, p_243_3_, p_243_4_ - 1))
        {
            return true;
        }
        return p_243_1_.func_28100_h(p_243_2_, p_243_3_, p_243_4_ + 1);
    }

    public void func_258_d(World p_258_1_, int p_258_2_, int p_258_3_, int p_258_4_, int p_258_5_)
    {
        int i = p_258_1_.func_602_e(p_258_2_, p_258_3_, p_258_4_);
        int j = i & 8;
        i &= 7;
        if(p_258_5_ == 2 && p_258_1_.func_28100_h(p_258_2_, p_258_3_, p_258_4_ + 1))
        {
            i = 4;
        } else
        if(p_258_5_ == 3 && p_258_1_.func_28100_h(p_258_2_, p_258_3_, p_258_4_ - 1))
        {
            i = 3;
        } else
        if(p_258_5_ == 4 && p_258_1_.func_28100_h(p_258_2_ + 1, p_258_3_, p_258_4_))
        {
            i = 2;
        } else
        if(p_258_5_ == 5 && p_258_1_.func_28100_h(p_258_2_ - 1, p_258_3_, p_258_4_))
        {
            i = 1;
        } else
        {
            i = func_22036_h(p_258_1_, p_258_2_, p_258_3_, p_258_4_);
        }
        p_258_1_.func_691_b(p_258_2_, p_258_3_, p_258_4_, i + j);
    }

    private int func_22036_h(World p_22036_1_, int p_22036_2_, int p_22036_3_, int p_22036_4_)
    {
        if(p_22036_1_.func_28100_h(p_22036_2_ - 1, p_22036_3_, p_22036_4_))
        {
            return 1;
        }
        if(p_22036_1_.func_28100_h(p_22036_2_ + 1, p_22036_3_, p_22036_4_))
        {
            return 2;
        }
        if(p_22036_1_.func_28100_h(p_22036_2_, p_22036_3_, p_22036_4_ - 1))
        {
            return 3;
        }
        return !p_22036_1_.func_28100_h(p_22036_2_, p_22036_3_, p_22036_4_ + 1) ? 1 : 4;
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        if(func_305_h(p_226_1_, p_226_2_, p_226_3_, p_226_4_))
        {
            int i = p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_) & 7;
            boolean flag = false;
            if(!p_226_1_.func_28100_h(p_226_2_ - 1, p_226_3_, p_226_4_) && i == 1)
            {
                flag = true;
            }
            if(!p_226_1_.func_28100_h(p_226_2_ + 1, p_226_3_, p_226_4_) && i == 2)
            {
                flag = true;
            }
            if(!p_226_1_.func_28100_h(p_226_2_, p_226_3_, p_226_4_ - 1) && i == 3)
            {
                flag = true;
            }
            if(!p_226_1_.func_28100_h(p_226_2_, p_226_3_, p_226_4_ + 1) && i == 4)
            {
                flag = true;
            }
            if(flag)
            {
                func_259_b_(p_226_1_, p_226_2_, p_226_3_, p_226_4_, p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_), 0);
                p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
            }
        }
    }

    private boolean func_305_h(World p_305_1_, int p_305_2_, int p_305_3_, int p_305_4_)
    {
        if(!func_243_a(p_305_1_, p_305_2_, p_305_3_, p_305_4_))
        {
            func_259_b_(p_305_1_, p_305_2_, p_305_3_, p_305_4_, p_305_1_.func_602_e(p_305_2_, p_305_3_, p_305_4_), 0);
            p_305_1_.func_690_d(p_305_2_, p_305_3_, p_305_4_, 0);
            return false;
        } else
        {
            return true;
        }
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        int i = p_238_1_.func_602_e(p_238_2_, p_238_3_, p_238_4_);
        int j = i & 7;
        boolean flag = (i & 8) > 0;
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.1875F;
        float f3 = 0.125F;
        if(flag)
        {
            f3 = 0.0625F;
        }
        if(j == 1)
        {
            func_213_a(0.0F, f, 0.5F - f2, f3, f1, 0.5F + f2);
        } else
        if(j == 2)
        {
            func_213_a(1.0F - f3, f, 0.5F - f2, 1.0F, f1, 0.5F + f2);
        } else
        if(j == 3)
        {
            func_213_a(0.5F - f2, f, 0.0F, 0.5F + f2, f1, f3);
        } else
        if(j == 4)
        {
            func_213_a(0.5F - f2, f, 1.0F - f3, 0.5F + f2, f1, 1.0F);
        }
    }

    public void func_233_b(World p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_, EntityPlayer p_233_5_)
    {
        func_250_a(p_233_1_, p_233_2_, p_233_3_, p_233_4_, p_233_5_);
    }

    public boolean func_250_a(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_, EntityPlayer p_250_5_)
    {
        int i = p_250_1_.func_602_e(p_250_2_, p_250_3_, p_250_4_);
        int j = i & 7;
        int k = 8 - (i & 8);
        if(k == 0)
        {
            return true;
        }
        p_250_1_.func_691_b(p_250_2_, p_250_3_, p_250_4_, j + k);
        p_250_1_.func_701_b(p_250_2_, p_250_3_, p_250_4_, p_250_2_, p_250_3_, p_250_4_);
        p_250_1_.func_684_a((double)p_250_2_ + 0.5D, (double)p_250_3_ + 0.5D, (double)p_250_4_ + 0.5D, "random.click", 0.3F, 0.6F);
        p_250_1_.func_611_g(p_250_2_, p_250_3_, p_250_4_, field_376_bc);
        if(j == 1)
        {
            p_250_1_.func_611_g(p_250_2_ - 1, p_250_3_, p_250_4_, field_376_bc);
        } else
        if(j == 2)
        {
            p_250_1_.func_611_g(p_250_2_ + 1, p_250_3_, p_250_4_, field_376_bc);
        } else
        if(j == 3)
        {
            p_250_1_.func_611_g(p_250_2_, p_250_3_, p_250_4_ - 1, field_376_bc);
        } else
        if(j == 4)
        {
            p_250_1_.func_611_g(p_250_2_, p_250_3_, p_250_4_ + 1, field_376_bc);
        } else
        {
            p_250_1_.func_611_g(p_250_2_, p_250_3_ - 1, p_250_4_, field_376_bc);
        }
        p_250_1_.func_22136_c(p_250_2_, p_250_3_, p_250_4_, field_376_bc, func_4025_d());
        return true;
    }

    public void func_214_b(World p_214_1_, int p_214_2_, int p_214_3_, int p_214_4_)
    {
        int i = p_214_1_.func_602_e(p_214_2_, p_214_3_, p_214_4_);
        if((i & 8) > 0)
        {
            p_214_1_.func_611_g(p_214_2_, p_214_3_, p_214_4_, field_376_bc);
            int j = i & 7;
            if(j == 1)
            {
                p_214_1_.func_611_g(p_214_2_ - 1, p_214_3_, p_214_4_, field_376_bc);
            } else
            if(j == 2)
            {
                p_214_1_.func_611_g(p_214_2_ + 1, p_214_3_, p_214_4_, field_376_bc);
            } else
            if(j == 3)
            {
                p_214_1_.func_611_g(p_214_2_, p_214_3_, p_214_4_ - 1, field_376_bc);
            } else
            if(j == 4)
            {
                p_214_1_.func_611_g(p_214_2_, p_214_3_, p_214_4_ + 1, field_376_bc);
            } else
            {
                p_214_1_.func_611_g(p_214_2_, p_214_3_ - 1, p_214_4_, field_376_bc);
            }
        }
        super.func_214_b(p_214_1_, p_214_2_, p_214_3_, p_214_4_);
    }

    public boolean func_231_b(IBlockAccess p_231_1_, int p_231_2_, int p_231_3_, int p_231_4_, int p_231_5_)
    {
        return (p_231_1_.func_602_e(p_231_2_, p_231_3_, p_231_4_) & 8) > 0;
    }

    public boolean func_228_c(World p_228_1_, int p_228_2_, int p_228_3_, int p_228_4_, int p_228_5_)
    {
        int i = p_228_1_.func_602_e(p_228_2_, p_228_3_, p_228_4_);
        if((i & 8) == 0)
        {
            return false;
        }
        int j = i & 7;
        if(j == 5 && p_228_5_ == 1)
        {
            return true;
        }
        if(j == 4 && p_228_5_ == 2)
        {
            return true;
        }
        if(j == 3 && p_228_5_ == 3)
        {
            return true;
        }
        if(j == 2 && p_228_5_ == 4)
        {
            return true;
        }
        return j == 1 && p_228_5_ == 5;
    }

    public boolean func_209_d()
    {
        return true;
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        if(p_208_1_.field_1026_y)
        {
            return;
        }
        int i = p_208_1_.func_602_e(p_208_2_, p_208_3_, p_208_4_);
        if((i & 8) == 0)
        {
            return;
        }
        p_208_1_.func_691_b(p_208_2_, p_208_3_, p_208_4_, i & 7);
        p_208_1_.func_611_g(p_208_2_, p_208_3_, p_208_4_, field_376_bc);
        int j = i & 7;
        if(j == 1)
        {
            p_208_1_.func_611_g(p_208_2_ - 1, p_208_3_, p_208_4_, field_376_bc);
        } else
        if(j == 2)
        {
            p_208_1_.func_611_g(p_208_2_ + 1, p_208_3_, p_208_4_, field_376_bc);
        } else
        if(j == 3)
        {
            p_208_1_.func_611_g(p_208_2_, p_208_3_, p_208_4_ - 1, field_376_bc);
        } else
        if(j == 4)
        {
            p_208_1_.func_611_g(p_208_2_, p_208_3_, p_208_4_ + 1, field_376_bc);
        } else
        {
            p_208_1_.func_611_g(p_208_2_, p_208_3_ - 1, p_208_4_, field_376_bc);
        }
        p_208_1_.func_684_a((double)p_208_2_ + 0.5D, (double)p_208_3_ + 0.5D, (double)p_208_4_ + 0.5D, "random.click", 0.3F, 0.5F);
        p_208_1_.func_701_b(p_208_2_, p_208_3_, p_208_4_, p_208_2_, p_208_3_, p_208_4_);
    }

    public void func_237_e()
    {
        float f = 0.1875F;
        float f1 = 0.125F;
        float f2 = 0.125F;
        func_213_a(0.5F - f, 0.5F - f1, 0.5F - f2, 0.5F + f, 0.5F + f1, 0.5F + f2);
    }
}
