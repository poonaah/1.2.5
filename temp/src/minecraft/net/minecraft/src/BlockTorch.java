// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, BlockStairs, 
//            AxisAlignedBB, Vec3D, MovingObjectPosition

public class BlockTorch extends Block
{

    protected BlockTorch(int p_i526_1_, int p_i526_2_)
    {
        super(p_i526_1_, p_i526_2_, Material.field_1324_n);
        func_253_b(true);
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
        return 2;
    }

    private boolean func_31032_h(World p_31032_1_, int p_31032_2_, int p_31032_3_, int p_31032_4_)
    {
        if(p_31032_1_.func_41082_b(p_31032_2_, p_31032_3_, p_31032_4_, true))
        {
            return true;
        }
        int i = p_31032_1_.func_600_a(p_31032_2_, p_31032_3_, p_31032_4_);
        if(i == Block.field_4057_ba.field_376_bc || i == Block.field_40207_bC.field_376_bc || i == Block.field_382_N.field_376_bc)
        {
            return true;
        }
        if(Block.field_345_n[i] != null && (Block.field_345_n[i] instanceof BlockStairs))
        {
            int j = p_31032_1_.func_602_e(p_31032_2_, p_31032_3_, p_31032_4_);
            if((4 & j) != 0)
            {
                return true;
            }
        }
        return false;
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        if(p_243_1_.func_41082_b(p_243_2_ - 1, p_243_3_, p_243_4_, true))
        {
            return true;
        }
        if(p_243_1_.func_41082_b(p_243_2_ + 1, p_243_3_, p_243_4_, true))
        {
            return true;
        }
        if(p_243_1_.func_41082_b(p_243_2_, p_243_3_, p_243_4_ - 1, true))
        {
            return true;
        }
        if(p_243_1_.func_41082_b(p_243_2_, p_243_3_, p_243_4_ + 1, true))
        {
            return true;
        }
        return func_31032_h(p_243_1_, p_243_2_, p_243_3_ - 1, p_243_4_);
    }

    public void func_258_d(World p_258_1_, int p_258_2_, int p_258_3_, int p_258_4_, int p_258_5_)
    {
        int i = p_258_1_.func_602_e(p_258_2_, p_258_3_, p_258_4_);
        if(p_258_5_ == 1 && func_31032_h(p_258_1_, p_258_2_, p_258_3_ - 1, p_258_4_))
        {
            i = 5;
        }
        if(p_258_5_ == 2 && p_258_1_.func_41082_b(p_258_2_, p_258_3_, p_258_4_ + 1, true))
        {
            i = 4;
        }
        if(p_258_5_ == 3 && p_258_1_.func_41082_b(p_258_2_, p_258_3_, p_258_4_ - 1, true))
        {
            i = 3;
        }
        if(p_258_5_ == 4 && p_258_1_.func_41082_b(p_258_2_ + 1, p_258_3_, p_258_4_, true))
        {
            i = 2;
        }
        if(p_258_5_ == 5 && p_258_1_.func_41082_b(p_258_2_ - 1, p_258_3_, p_258_4_, true))
        {
            i = 1;
        }
        p_258_1_.func_691_b(p_258_2_, p_258_3_, p_258_4_, i);
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        super.func_208_a(p_208_1_, p_208_2_, p_208_3_, p_208_4_, p_208_5_);
        if(p_208_1_.func_602_e(p_208_2_, p_208_3_, p_208_4_) == 0)
        {
            func_235_e(p_208_1_, p_208_2_, p_208_3_, p_208_4_);
        }
    }

    public void func_235_e(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_)
    {
        if(p_235_1_.func_41082_b(p_235_2_ - 1, p_235_3_, p_235_4_, true))
        {
            p_235_1_.func_691_b(p_235_2_, p_235_3_, p_235_4_, 1);
        } else
        if(p_235_1_.func_41082_b(p_235_2_ + 1, p_235_3_, p_235_4_, true))
        {
            p_235_1_.func_691_b(p_235_2_, p_235_3_, p_235_4_, 2);
        } else
        if(p_235_1_.func_41082_b(p_235_2_, p_235_3_, p_235_4_ - 1, true))
        {
            p_235_1_.func_691_b(p_235_2_, p_235_3_, p_235_4_, 3);
        } else
        if(p_235_1_.func_41082_b(p_235_2_, p_235_3_, p_235_4_ + 1, true))
        {
            p_235_1_.func_691_b(p_235_2_, p_235_3_, p_235_4_, 4);
        } else
        if(func_31032_h(p_235_1_, p_235_2_, p_235_3_ - 1, p_235_4_))
        {
            p_235_1_.func_691_b(p_235_2_, p_235_3_, p_235_4_, 5);
        }
        func_271_h(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        if(func_271_h(p_226_1_, p_226_2_, p_226_3_, p_226_4_))
        {
            int i = p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_);
            boolean flag = false;
            if(!p_226_1_.func_41082_b(p_226_2_ - 1, p_226_3_, p_226_4_, true) && i == 1)
            {
                flag = true;
            }
            if(!p_226_1_.func_41082_b(p_226_2_ + 1, p_226_3_, p_226_4_, true) && i == 2)
            {
                flag = true;
            }
            if(!p_226_1_.func_41082_b(p_226_2_, p_226_3_, p_226_4_ - 1, true) && i == 3)
            {
                flag = true;
            }
            if(!p_226_1_.func_41082_b(p_226_2_, p_226_3_, p_226_4_ + 1, true) && i == 4)
            {
                flag = true;
            }
            if(!func_31032_h(p_226_1_, p_226_2_, p_226_3_ - 1, p_226_4_) && i == 5)
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

    private boolean func_271_h(World p_271_1_, int p_271_2_, int p_271_3_, int p_271_4_)
    {
        if(!func_243_a(p_271_1_, p_271_2_, p_271_3_, p_271_4_))
        {
            if(p_271_1_.func_600_a(p_271_2_, p_271_3_, p_271_4_) == field_376_bc)
            {
                func_259_b_(p_271_1_, p_271_2_, p_271_3_, p_271_4_, p_271_1_.func_602_e(p_271_2_, p_271_3_, p_271_4_), 0);
                p_271_1_.func_690_d(p_271_2_, p_271_3_, p_271_4_, 0);
            }
            return false;
        } else
        {
            return true;
        }
    }

    public MovingObjectPosition func_255_a(World p_255_1_, int p_255_2_, int p_255_3_, int p_255_4_, Vec3D p_255_5_, Vec3D p_255_6_)
    {
        int i = p_255_1_.func_602_e(p_255_2_, p_255_3_, p_255_4_) & 7;
        float f = 0.15F;
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
            float f1 = 0.1F;
            func_213_a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, 0.6F, 0.5F + f1);
        }
        return super.func_255_a(p_255_1_, p_255_2_, p_255_3_, p_255_4_, p_255_5_, p_255_6_);
    }

    public void func_247_b(World p_247_1_, int p_247_2_, int p_247_3_, int p_247_4_, Random p_247_5_)
    {
        int i = p_247_1_.func_602_e(p_247_2_, p_247_3_, p_247_4_);
        double d = (float)p_247_2_ + 0.5F;
        double d1 = (float)p_247_3_ + 0.7F;
        double d2 = (float)p_247_4_ + 0.5F;
        double d3 = 0.2199999988079071D;
        double d4 = 0.27000001072883606D;
        if(i == 1)
        {
            p_247_1_.func_694_a("smoke", d - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
            p_247_1_.func_694_a("flame", d - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
        } else
        if(i == 2)
        {
            p_247_1_.func_694_a("smoke", d + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
            p_247_1_.func_694_a("flame", d + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
        } else
        if(i == 3)
        {
            p_247_1_.func_694_a("smoke", d, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
            p_247_1_.func_694_a("flame", d, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
        } else
        if(i == 4)
        {
            p_247_1_.func_694_a("smoke", d, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
            p_247_1_.func_694_a("flame", d, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
        } else
        {
            p_247_1_.func_694_a("smoke", d, d1, d2, 0.0D, 0.0D, 0.0D);
            p_247_1_.func_694_a("flame", d, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }
}
