// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, World, Material, IBlockAccess, 
//            RailLogic, AxisAlignedBB, Vec3D, MovingObjectPosition

public class BlockRail extends Block
{

    private final boolean field_27045_a;

    public static final boolean func_27040_h(World p_27040_0_, int p_27040_1_, int p_27040_2_, int p_27040_3_)
    {
        int i = p_27040_0_.func_600_a(p_27040_1_, p_27040_2_, p_27040_3_);
        return i == Block.field_440_aH.field_376_bc || i == Block.field_9261_T.field_376_bc || i == Block.field_9260_U.field_376_bc;
    }

    public static final boolean func_27041_c(int p_27041_0_)
    {
        return p_27041_0_ == Block.field_440_aH.field_376_bc || p_27041_0_ == Block.field_9261_T.field_376_bc || p_27041_0_ == Block.field_9260_U.field_376_bc;
    }

    protected BlockRail(int p_i78_1_, int p_i78_2_, boolean p_i78_3_)
    {
        super(p_i78_1_, p_i78_2_, Material.field_1324_n);
        field_27045_a = p_i78_3_;
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    }

    public boolean func_27042_h()
    {
        return field_27045_a;
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int i)
    {
        return null;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public MovingObjectPosition func_255_a(World p_255_1_, int p_255_2_, int p_255_3_, int p_255_4_, Vec3D p_255_5_, Vec3D p_255_6_)
    {
        func_238_a(p_255_1_, p_255_2_, p_255_3_, p_255_4_);
        return super.func_255_a(p_255_1_, p_255_2_, p_255_3_, p_255_4_, p_255_5_, p_255_6_);
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        int i = p_238_1_.func_602_e(p_238_2_, p_238_3_, p_238_4_);
        if(i >= 2 && i <= 5)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
        } else
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
        }
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        if(field_27045_a)
        {
            if(field_376_bc == Block.field_9261_T.field_376_bc && (p_232_2_ & 8) == 0)
            {
                return field_378_bb - 16;
            }
        } else
        if(p_232_2_ >= 6)
        {
            return field_378_bb - 16;
        }
        return field_378_bb;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_210_f()
    {
        return 9;
    }

    public int func_229_a(Random p_229_1_)
    {
        return 1;
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        return p_243_1_.func_28100_h(p_243_2_, p_243_3_ - 1, p_243_4_);
    }

    public void func_235_e(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_)
    {
        if(!p_235_1_.field_1026_y)
        {
            func_4031_h(p_235_1_, p_235_2_, p_235_3_, p_235_4_, true);
            if(field_376_bc == Block.field_9261_T.field_376_bc)
            {
                func_226_a(p_235_1_, p_235_2_, p_235_3_, p_235_4_, field_376_bc);
            }
        }
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        if(p_226_1_.field_1026_y)
        {
            return;
        }
        int i = p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_);
        int j = i;
        if(field_27045_a)
        {
            j &= 7;
        }
        boolean flag = false;
        if(!p_226_1_.func_28100_h(p_226_2_, p_226_3_ - 1, p_226_4_))
        {
            flag = true;
        }
        if(j == 2 && !p_226_1_.func_28100_h(p_226_2_ + 1, p_226_3_, p_226_4_))
        {
            flag = true;
        }
        if(j == 3 && !p_226_1_.func_28100_h(p_226_2_ - 1, p_226_3_, p_226_4_))
        {
            flag = true;
        }
        if(j == 4 && !p_226_1_.func_28100_h(p_226_2_, p_226_3_, p_226_4_ - 1))
        {
            flag = true;
        }
        if(j == 5 && !p_226_1_.func_28100_h(p_226_2_, p_226_3_, p_226_4_ + 1))
        {
            flag = true;
        }
        if(flag)
        {
            func_259_b_(p_226_1_, p_226_2_, p_226_3_, p_226_4_, p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_), 0);
            p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
        } else
        if(field_376_bc == Block.field_9261_T.field_376_bc)
        {
            boolean flag1 = p_226_1_.func_625_o(p_226_2_, p_226_3_, p_226_4_);
            flag1 = flag1 || func_27044_a(p_226_1_, p_226_2_, p_226_3_, p_226_4_, i, true, 0) || func_27044_a(p_226_1_, p_226_2_, p_226_3_, p_226_4_, i, false, 0);
            boolean flag2 = false;
            if(flag1 && (i & 8) == 0)
            {
                p_226_1_.func_691_b(p_226_2_, p_226_3_, p_226_4_, j | 8);
                flag2 = true;
            } else
            if(!flag1 && (i & 8) != 0)
            {
                p_226_1_.func_691_b(p_226_2_, p_226_3_, p_226_4_, j);
                flag2 = true;
            }
            if(flag2)
            {
                p_226_1_.func_611_g(p_226_2_, p_226_3_ - 1, p_226_4_, field_376_bc);
                if(j == 2 || j == 3 || j == 4 || j == 5)
                {
                    p_226_1_.func_611_g(p_226_2_, p_226_3_ + 1, p_226_4_, field_376_bc);
                }
            }
        } else
        if(p_226_5_ > 0 && Block.field_345_n[p_226_5_].func_209_d() && !field_27045_a && RailLogic.func_791_a(new RailLogic(this, p_226_1_, p_226_2_, p_226_3_, p_226_4_)) == 3)
        {
            func_4031_h(p_226_1_, p_226_2_, p_226_3_, p_226_4_, false);
        }
    }

    private void func_4031_h(World p_4031_1_, int p_4031_2_, int p_4031_3_, int p_4031_4_, boolean p_4031_5_)
    {
        if(p_4031_1_.field_1026_y)
        {
            return;
        } else
        {
            (new RailLogic(this, p_4031_1_, p_4031_2_, p_4031_3_, p_4031_4_)).func_792_a(p_4031_1_.func_625_o(p_4031_2_, p_4031_3_, p_4031_4_), p_4031_5_);
            return;
        }
    }

    private boolean func_27044_a(World p_27044_1_, int p_27044_2_, int p_27044_3_, int p_27044_4_, int p_27044_5_, boolean p_27044_6_, int p_27044_7_)
    {
        if(p_27044_7_ >= 8)
        {
            return false;
        }
        int i = p_27044_5_ & 7;
        boolean flag = true;
        switch(i)
        {
        case 0: // '\0'
            if(p_27044_6_)
            {
                p_27044_4_++;
            } else
            {
                p_27044_4_--;
            }
            break;

        case 1: // '\001'
            if(p_27044_6_)
            {
                p_27044_2_--;
            } else
            {
                p_27044_2_++;
            }
            break;

        case 2: // '\002'
            if(p_27044_6_)
            {
                p_27044_2_--;
            } else
            {
                p_27044_2_++;
                p_27044_3_++;
                flag = false;
            }
            i = 1;
            break;

        case 3: // '\003'
            if(p_27044_6_)
            {
                p_27044_2_--;
                p_27044_3_++;
                flag = false;
            } else
            {
                p_27044_2_++;
            }
            i = 1;
            break;

        case 4: // '\004'
            if(p_27044_6_)
            {
                p_27044_4_++;
            } else
            {
                p_27044_4_--;
                p_27044_3_++;
                flag = false;
            }
            i = 0;
            break;

        case 5: // '\005'
            if(p_27044_6_)
            {
                p_27044_4_++;
                p_27044_3_++;
                flag = false;
            } else
            {
                p_27044_4_--;
            }
            i = 0;
            break;
        }
        if(func_27043_a(p_27044_1_, p_27044_2_, p_27044_3_, p_27044_4_, p_27044_6_, p_27044_7_, i))
        {
            return true;
        }
        return flag && func_27043_a(p_27044_1_, p_27044_2_, p_27044_3_ - 1, p_27044_4_, p_27044_6_, p_27044_7_, i);
    }

    private boolean func_27043_a(World p_27043_1_, int p_27043_2_, int p_27043_3_, int p_27043_4_, boolean p_27043_5_, int p_27043_6_, int p_27043_7_)
    {
        int i = p_27043_1_.func_600_a(p_27043_2_, p_27043_3_, p_27043_4_);
        if(i == Block.field_9261_T.field_376_bc)
        {
            int j = p_27043_1_.func_602_e(p_27043_2_, p_27043_3_, p_27043_4_);
            int k = j & 7;
            if(p_27043_7_ == 1 && (k == 0 || k == 4 || k == 5))
            {
                return false;
            }
            if(p_27043_7_ == 0 && (k == 1 || k == 2 || k == 3))
            {
                return false;
            }
            if((j & 8) != 0)
            {
                if(p_27043_1_.func_625_o(p_27043_2_, p_27043_3_, p_27043_4_))
                {
                    return true;
                } else
                {
                    return func_27044_a(p_27043_1_, p_27043_2_, p_27043_3_, p_27043_4_, j, p_27043_5_, p_27043_6_ + 1);
                }
            }
        }
        return false;
    }

    public int func_31029_h()
    {
        return 0;
    }

    static boolean func_27039_a(BlockRail p_27039_0_)
    {
        return p_27039_0_.field_27045_a;
    }
}
