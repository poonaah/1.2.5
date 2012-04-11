// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, IBlockAccess, 
//            AxisAlignedBB, EntityPlayer

public class BlockLever extends Block
{

    protected BlockLever(int p_i201_1_, int p_i201_2_)
    {
        super(p_i201_1_, p_i201_2_, Material.field_1324_n);
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int i)
    {
        return null;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_210_f()
    {
        return 12;
    }

    public boolean func_28030_e(World p_28030_1_, int p_28030_2_, int p_28030_3_, int p_28030_4_, int p_28030_5_)
    {
        if(p_28030_5_ == 1 && p_28030_1_.func_28100_h(p_28030_2_, p_28030_3_ - 1, p_28030_4_))
        {
            return true;
        }
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
        if(p_243_1_.func_28100_h(p_243_2_, p_243_3_, p_243_4_ + 1))
        {
            return true;
        }
        return p_243_1_.func_28100_h(p_243_2_, p_243_3_ - 1, p_243_4_);
    }

    public void func_258_d(World p_258_1_, int p_258_2_, int p_258_3_, int p_258_4_, int p_258_5_)
    {
        int i = p_258_1_.func_602_e(p_258_2_, p_258_3_, p_258_4_);
        int j = i & 8;
        i &= 7;
        i = -1;
        if(p_258_5_ == 1 && p_258_1_.func_28100_h(p_258_2_, p_258_3_ - 1, p_258_4_))
        {
            i = 5 + p_258_1_.field_1037_n.nextInt(2);
        }
        if(p_258_5_ == 2 && p_258_1_.func_28100_h(p_258_2_, p_258_3_, p_258_4_ + 1))
        {
            i = 4;
        }
        if(p_258_5_ == 3 && p_258_1_.func_28100_h(p_258_2_, p_258_3_, p_258_4_ - 1))
        {
            i = 3;
        }
        if(p_258_5_ == 4 && p_258_1_.func_28100_h(p_258_2_ + 1, p_258_3_, p_258_4_))
        {
            i = 2;
        }
        if(p_258_5_ == 5 && p_258_1_.func_28100_h(p_258_2_ - 1, p_258_3_, p_258_4_))
        {
            i = 1;
        }
        if(i == -1)
        {
            func_259_b_(p_258_1_, p_258_2_, p_258_3_, p_258_4_, p_258_1_.func_602_e(p_258_2_, p_258_3_, p_258_4_), 0);
            p_258_1_.func_690_d(p_258_2_, p_258_3_, p_258_4_, 0);
            return;
        } else
        {
            p_258_1_.func_691_b(p_258_2_, p_258_3_, p_258_4_, i + j);
            return;
        }
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        if(func_267_h(p_226_1_, p_226_2_, p_226_3_, p_226_4_))
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
            if(!p_226_1_.func_28100_h(p_226_2_, p_226_3_ - 1, p_226_4_) && i == 5)
            {
                flag = true;
            }
            if(!p_226_1_.func_28100_h(p_226_2_, p_226_3_ - 1, p_226_4_) && i == 6)
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

    private boolean func_267_h(World p_267_1_, int p_267_2_, int p_267_3_, int p_267_4_)
    {
        if(!func_243_a(p_267_1_, p_267_2_, p_267_3_, p_267_4_))
        {
            func_259_b_(p_267_1_, p_267_2_, p_267_3_, p_267_4_, p_267_1_.func_602_e(p_267_2_, p_267_3_, p_267_4_), 0);
            p_267_1_.func_690_d(p_267_2_, p_267_3_, p_267_4_, 0);
            return false;
        } else
        {
            return true;
        }
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        int i = p_238_1_.func_602_e(p_238_2_, p_238_3_, p_238_4_) & 7;
        float f = 0.1875F;
        if(i == 1)
        {
            func_213_a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
        } else
        if(i == 2)
        {
            func_213_a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
        } else
        if(i == 3)
        {
            func_213_a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
        } else
        if(i == 4)
        {
            func_213_a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
        } else
        {
            float f1 = 0.25F;
            func_213_a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, 0.6F, 0.5F + f1);
        }
    }

    public void func_233_b(World p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_, EntityPlayer p_233_5_)
    {
        func_250_a(p_233_1_, p_233_2_, p_233_3_, p_233_4_, p_233_5_);
    }

    public boolean func_250_a(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_, EntityPlayer p_250_5_)
    {
        if(p_250_1_.field_1026_y)
        {
            return true;
        }
        int i = p_250_1_.func_602_e(p_250_2_, p_250_3_, p_250_4_);
        int j = i & 7;
        int k = 8 - (i & 8);
        p_250_1_.func_691_b(p_250_2_, p_250_3_, p_250_4_, j + k);
        p_250_1_.func_701_b(p_250_2_, p_250_3_, p_250_4_, p_250_2_, p_250_3_, p_250_4_);
        p_250_1_.func_684_a((double)p_250_2_ + 0.5D, (double)p_250_3_ + 0.5D, (double)p_250_4_ + 0.5D, "random.click", 0.3F, k <= 0 ? 0.5F : 0.6F);
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
        if(j == 6 && p_228_5_ == 1)
        {
            return true;
        }
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
}
