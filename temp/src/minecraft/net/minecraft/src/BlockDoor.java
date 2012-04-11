// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, Item, 
//            IBlockAccess, AxisAlignedBB, EntityPlayer, Vec3D, 
//            MovingObjectPosition

public class BlockDoor extends Block
{

    protected BlockDoor(int p_i6_1_, Material p_i6_2_)
    {
        super(p_i6_1_, p_i6_2_);
        field_378_bb = 97;
        if(p_i6_2_ == Material.field_1333_e)
        {
            field_378_bb++;
        }
        float f = 0.5F;
        float f1 = 1.0F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
    }

    public int func_211_a(IBlockAccess p_211_1_, int p_211_2_, int p_211_3_, int p_211_4_, int p_211_5_)
    {
        if(p_211_5_ == 0 || p_211_5_ == 1)
        {
            return field_378_bb;
        }
        int i = func_48212_i(p_211_1_, p_211_2_, p_211_3_, p_211_4_);
        int j = field_378_bb;
        if((i & 8) != 0)
        {
            j -= 16;
        }
        int k = i & 3;
        boolean flag = (i & 4) != 0;
        if(!flag)
        {
            if(k == 0 && p_211_5_ == 5)
            {
                j = -j;
            } else
            if(k == 1 && p_211_5_ == 3)
            {
                j = -j;
            } else
            if(k == 2 && p_211_5_ == 4)
            {
                j = -j;
            } else
            if(k == 3 && p_211_5_ == 2)
            {
                j = -j;
            }
            if((i & 0x10) != 0)
            {
                j = -j;
            }
        } else
        if(k == 0 && p_211_5_ == 2)
        {
            j = -j;
        } else
        if(k == 1 && p_211_5_ == 5)
        {
            j = -j;
        } else
        if(k == 2 && p_211_5_ == 3)
        {
            j = -j;
        } else
        if(k == 3 && p_211_5_ == 4)
        {
            j = -j;
        }
        return j;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_48204_b(IBlockAccess p_48204_1_, int p_48204_2_, int p_48204_3_, int p_48204_4_)
    {
        int i = func_48212_i(p_48204_1_, p_48204_2_, p_48204_3_, p_48204_4_);
        return (i & 4) != 0;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_210_f()
    {
        return 7;
    }

    public AxisAlignedBB func_246_f(World p_246_1_, int p_246_2_, int p_246_3_, int p_246_4_)
    {
        func_238_a(p_246_1_, p_246_2_, p_246_3_, p_246_4_);
        return super.func_246_f(p_246_1_, p_246_2_, p_246_3_, p_246_4_);
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_)
    {
        func_238_a(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
        return super.func_221_d(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        func_313_b(func_48212_i(p_238_1_, p_238_2_, p_238_3_, p_238_4_));
    }

    public int func_48214_g(IBlockAccess p_48214_1_, int p_48214_2_, int p_48214_3_, int p_48214_4_)
    {
        return func_48212_i(p_48214_1_, p_48214_2_, p_48214_3_, p_48214_4_) & 3;
    }

    public boolean func_48213_h(IBlockAccess p_48213_1_, int p_48213_2_, int p_48213_3_, int p_48213_4_)
    {
        return (func_48212_i(p_48213_1_, p_48213_2_, p_48213_3_, p_48213_4_) & 4) != 0;
    }

    private void func_313_b(int p_313_1_)
    {
        float f = 0.1875F;
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
        int i = p_313_1_ & 3;
        boolean flag = (p_313_1_ & 4) != 0;
        boolean flag1 = (p_313_1_ & 0x10) != 0;
        if(i == 0)
        {
            if(!flag)
            {
                func_213_a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
            } else
            if(!flag1)
            {
                func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
            } else
            {
                func_213_a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
            }
        } else
        if(i == 1)
        {
            if(!flag)
            {
                func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
            } else
            if(!flag1)
            {
                func_213_a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            } else
            {
                func_213_a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
            }
        } else
        if(i == 2)
        {
            if(!flag)
            {
                func_213_a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            } else
            if(!flag1)
            {
                func_213_a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
            } else
            {
                func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
            }
        } else
        if(i == 3)
        {
            if(!flag)
            {
                func_213_a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
            } else
            if(!flag1)
            {
                func_213_a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
            } else
            {
                func_213_a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    public void func_233_b(World p_233_1_, int p_233_2_, int p_233_3_, int p_233_4_, EntityPlayer p_233_5_)
    {
        func_250_a(p_233_1_, p_233_2_, p_233_3_, p_233_4_, p_233_5_);
    }

    public boolean func_250_a(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_, EntityPlayer p_250_5_)
    {
        if(field_356_bn == Material.field_1333_e)
        {
            return true;
        }
        int i = func_48212_i(p_250_1_, p_250_2_, p_250_3_, p_250_4_);
        int j = i & 7;
        j ^= 4;
        if((i & 8) != 0)
        {
            p_250_1_.func_691_b(p_250_2_, p_250_3_ - 1, p_250_4_, j);
            p_250_1_.func_701_b(p_250_2_, p_250_3_ - 1, p_250_4_, p_250_2_, p_250_3_, p_250_4_);
        } else
        {
            p_250_1_.func_691_b(p_250_2_, p_250_3_, p_250_4_, j);
            p_250_1_.func_701_b(p_250_2_, p_250_3_, p_250_4_, p_250_2_, p_250_3_, p_250_4_);
        }
        p_250_1_.func_28107_a(p_250_5_, 1003, p_250_2_, p_250_3_, p_250_4_, 0);
        return true;
    }

    public void func_311_a(World p_311_1_, int p_311_2_, int p_311_3_, int p_311_4_, boolean p_311_5_)
    {
        int i = func_48212_i(p_311_1_, p_311_2_, p_311_3_, p_311_4_);
        boolean flag = (i & 4) != 0;
        if(flag == p_311_5_)
        {
            return;
        }
        int j = i & 7;
        j ^= 4;
        if((i & 8) != 0)
        {
            p_311_1_.func_691_b(p_311_2_, p_311_3_ - 1, p_311_4_, j);
            p_311_1_.func_701_b(p_311_2_, p_311_3_ - 1, p_311_4_, p_311_2_, p_311_3_, p_311_4_);
        } else
        {
            p_311_1_.func_691_b(p_311_2_, p_311_3_, p_311_4_, j);
            p_311_1_.func_701_b(p_311_2_, p_311_3_, p_311_4_, p_311_2_, p_311_3_, p_311_4_);
        }
        p_311_1_.func_28107_a(null, 1003, p_311_2_, p_311_3_, p_311_4_, 0);
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        int i = p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_);
        if((i & 8) != 0)
        {
            if(p_226_1_.func_600_a(p_226_2_, p_226_3_ - 1, p_226_4_) != field_376_bc)
            {
                p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
            }
            if(p_226_5_ > 0 && p_226_5_ != field_376_bc)
            {
                func_226_a(p_226_1_, p_226_2_, p_226_3_ - 1, p_226_4_, p_226_5_);
            }
        } else
        {
            boolean flag = false;
            if(p_226_1_.func_600_a(p_226_2_, p_226_3_ + 1, p_226_4_) != field_376_bc)
            {
                p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
                flag = true;
            }
            if(!p_226_1_.func_28100_h(p_226_2_, p_226_3_ - 1, p_226_4_))
            {
                p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
                flag = true;
                if(p_226_1_.func_600_a(p_226_2_, p_226_3_ + 1, p_226_4_) == field_376_bc)
                {
                    p_226_1_.func_690_d(p_226_2_, p_226_3_ + 1, p_226_4_, 0);
                }
            }
            if(flag)
            {
                if(!p_226_1_.field_1026_y)
                {
                    func_259_b_(p_226_1_, p_226_2_, p_226_3_, p_226_4_, i, 0);
                }
            } else
            {
                boolean flag1 = p_226_1_.func_625_o(p_226_2_, p_226_3_, p_226_4_) || p_226_1_.func_625_o(p_226_2_, p_226_3_ + 1, p_226_4_);
                if((flag1 || p_226_5_ > 0 && Block.field_345_n[p_226_5_].func_209_d() || p_226_5_ == 0) && p_226_5_ != field_376_bc)
                {
                    func_311_a(p_226_1_, p_226_2_, p_226_3_, p_226_4_, flag1);
                }
            }
        }
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        if((p_240_1_ & 8) != 0)
        {
            return 0;
        }
        if(field_356_bn == Material.field_1333_e)
        {
            return Item.field_252_az.field_291_aS;
        } else
        {
            return Item.field_265_at.field_291_aS;
        }
    }

    public MovingObjectPosition func_255_a(World p_255_1_, int p_255_2_, int p_255_3_, int p_255_4_, Vec3D p_255_5_, Vec3D p_255_6_)
    {
        func_238_a(p_255_1_, p_255_2_, p_255_3_, p_255_4_);
        return super.func_255_a(p_255_1_, p_255_2_, p_255_3_, p_255_4_, p_255_5_, p_255_6_);
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        if(p_243_3_ >= 255)
        {
            return false;
        } else
        {
            return p_243_1_.func_28100_h(p_243_2_, p_243_3_ - 1, p_243_4_) && super.func_243_a(p_243_1_, p_243_2_, p_243_3_, p_243_4_) && super.func_243_a(p_243_1_, p_243_2_, p_243_3_ + 1, p_243_4_);
        }
    }

    public int func_31029_h()
    {
        return 1;
    }

    public int func_48212_i(IBlockAccess p_48212_1_, int p_48212_2_, int p_48212_3_, int p_48212_4_)
    {
        int i = p_48212_1_.func_602_e(p_48212_2_, p_48212_3_, p_48212_4_);
        boolean flag = (i & 8) != 0;
        int j;
        int k;
        if(flag)
        {
            j = p_48212_1_.func_602_e(p_48212_2_, p_48212_3_ - 1, p_48212_4_);
            k = i;
        } else
        {
            j = i;
            k = p_48212_1_.func_602_e(p_48212_2_, p_48212_3_ + 1, p_48212_4_);
        }
        boolean flag1 = (k & 1) != 0;
        int l = j & 7 | (flag ? 8 : 0) | (flag1 ? 0x10 : 0);
        return l;
    }
}
