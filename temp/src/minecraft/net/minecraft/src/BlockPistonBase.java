// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, Facing, EntityPlayer, 
//            World, TileEntityPiston, BlockPistonMoving, IBlockAccess, 
//            MathHelper, BlockContainer, BlockPistonExtension, EntityLiving, 
//            AxisAlignedBB

public class BlockPistonBase extends Block
{

    private boolean field_31049_a;
    private static boolean field_31048_b;

    public BlockPistonBase(int p_i760_1_, int p_i760_2_, boolean p_i760_3_)
    {
        super(p_i760_1_, p_i760_2_, Material.field_31067_B);
        field_31049_a = p_i760_3_;
        func_4024_a(field_9251_h);
        func_222_c(0.5F);
    }

    public int func_31040_i()
    {
        return !field_31049_a ? 107 : 106;
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        int i = func_31044_d(p_232_2_);
        if(i > 5)
        {
            return field_378_bb;
        }
        if(p_232_1_ == i)
        {
            if(func_31046_e(p_232_2_) || field_370_bf > 0.0D || field_368_bg > 0.0D || field_366_bh > 0.0D || field_364_bi < 1.0D || field_362_bj < 1.0D || field_360_bk < 1.0D)
            {
                return 110;
            } else
            {
                return field_378_bb;
            }
        }
        return p_232_1_ != Facing.field_31057_a[i] ? 108 : 109;
    }

    public int func_210_f()
    {
        return 16;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_250_a(World p_250_1_, int p_250_2_, int p_250_3_, int i, EntityPlayer entityplayer)
    {
        return false;
    }

    public void func_4026_a(World p_4026_1_, int p_4026_2_, int p_4026_3_, int p_4026_4_, EntityLiving p_4026_5_)
    {
        int i = func_31039_c(p_4026_1_, p_4026_2_, p_4026_3_, p_4026_4_, (EntityPlayer)p_4026_5_);
        p_4026_1_.func_691_b(p_4026_2_, p_4026_3_, p_4026_4_, i);
        if(!p_4026_1_.field_1026_y && !field_31048_b)
        {
            func_31043_h(p_4026_1_, p_4026_2_, p_4026_3_, p_4026_4_);
        }
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        if(!p_226_1_.field_1026_y && !field_31048_b)
        {
            func_31043_h(p_226_1_, p_226_2_, p_226_3_, p_226_4_);
        }
    }

    public void func_235_e(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_)
    {
        if(!p_235_1_.field_1026_y && p_235_1_.func_603_b(p_235_2_, p_235_3_, p_235_4_) == null && !field_31048_b)
        {
            func_31043_h(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
        }
    }

    private void func_31043_h(World p_31043_1_, int p_31043_2_, int p_31043_3_, int p_31043_4_)
    {
        int i = p_31043_1_.func_602_e(p_31043_2_, p_31043_3_, p_31043_4_);
        int j = func_31044_d(i);
        boolean flag = func_31041_f(p_31043_1_, p_31043_2_, p_31043_3_, p_31043_4_, j);
        if(i == 7)
        {
            return;
        }
        if(flag && !func_31046_e(i))
        {
            if(func_31045_h(p_31043_1_, p_31043_2_, p_31043_3_, p_31043_4_, j))
            {
                p_31043_1_.func_635_c(p_31043_2_, p_31043_3_, p_31043_4_, j | 8);
                p_31043_1_.func_21116_c(p_31043_2_, p_31043_3_, p_31043_4_, 0, j);
            }
        } else
        if(!flag && func_31046_e(i))
        {
            p_31043_1_.func_635_c(p_31043_2_, p_31043_3_, p_31043_4_, j);
            p_31043_1_.func_21116_c(p_31043_2_, p_31043_3_, p_31043_4_, 1, j);
        }
    }

    private boolean func_31041_f(World p_31041_1_, int p_31041_2_, int p_31041_3_, int p_31041_4_, int p_31041_5_)
    {
        if(p_31041_5_ != 0 && p_31041_1_.func_706_k(p_31041_2_, p_31041_3_ - 1, p_31041_4_, 0))
        {
            return true;
        }
        if(p_31041_5_ != 1 && p_31041_1_.func_706_k(p_31041_2_, p_31041_3_ + 1, p_31041_4_, 1))
        {
            return true;
        }
        if(p_31041_5_ != 2 && p_31041_1_.func_706_k(p_31041_2_, p_31041_3_, p_31041_4_ - 1, 2))
        {
            return true;
        }
        if(p_31041_5_ != 3 && p_31041_1_.func_706_k(p_31041_2_, p_31041_3_, p_31041_4_ + 1, 3))
        {
            return true;
        }
        if(p_31041_5_ != 5 && p_31041_1_.func_706_k(p_31041_2_ + 1, p_31041_3_, p_31041_4_, 5))
        {
            return true;
        }
        if(p_31041_5_ != 4 && p_31041_1_.func_706_k(p_31041_2_ - 1, p_31041_3_, p_31041_4_, 4))
        {
            return true;
        }
        if(p_31041_1_.func_706_k(p_31041_2_, p_31041_3_, p_31041_4_, 0))
        {
            return true;
        }
        if(p_31041_1_.func_706_k(p_31041_2_, p_31041_3_ + 2, p_31041_4_, 1))
        {
            return true;
        }
        if(p_31041_1_.func_706_k(p_31041_2_, p_31041_3_ + 1, p_31041_4_ - 1, 2))
        {
            return true;
        }
        if(p_31041_1_.func_706_k(p_31041_2_, p_31041_3_ + 1, p_31041_4_ + 1, 3))
        {
            return true;
        }
        if(p_31041_1_.func_706_k(p_31041_2_ - 1, p_31041_3_ + 1, p_31041_4_, 4))
        {
            return true;
        }
        return p_31041_1_.func_706_k(p_31041_2_ + 1, p_31041_3_ + 1, p_31041_4_, 5);
    }

    public void func_21024_a(World p_21024_1_, int p_21024_2_, int p_21024_3_, int p_21024_4_, int p_21024_5_, int p_21024_6_)
    {
        field_31048_b = true;
        int i = p_21024_6_;
        if(p_21024_5_ == 0)
        {
            if(func_31047_i(p_21024_1_, p_21024_2_, p_21024_3_, p_21024_4_, i))
            {
                p_21024_1_.func_691_b(p_21024_2_, p_21024_3_, p_21024_4_, i | 8);
                p_21024_1_.func_684_a((double)p_21024_2_ + 0.5D, (double)p_21024_3_ + 0.5D, (double)p_21024_4_ + 0.5D, "tile.piston.out", 0.5F, p_21024_1_.field_1037_n.nextFloat() * 0.25F + 0.6F);
            } else
            {
                p_21024_1_.func_635_c(p_21024_2_, p_21024_3_, p_21024_4_, i);
            }
        } else
        if(p_21024_5_ == 1)
        {
            TileEntity tileentity = p_21024_1_.func_603_b(p_21024_2_ + Facing.field_31056_b[i], p_21024_3_ + Facing.field_31059_c[i], p_21024_4_ + Facing.field_31058_d[i]);
            if(tileentity != null && (tileentity instanceof TileEntityPiston))
            {
                ((TileEntityPiston)tileentity).func_31011_l();
            }
            p_21024_1_.func_643_a(p_21024_2_, p_21024_3_, p_21024_4_, Block.field_9268_ac.field_376_bc, i);
            p_21024_1_.func_654_a(p_21024_2_, p_21024_3_, p_21024_4_, BlockPistonMoving.func_31036_a(field_376_bc, i, i, false, true));
            if(field_31049_a)
            {
                int j = p_21024_2_ + Facing.field_31056_b[i] * 2;
                int k = p_21024_3_ + Facing.field_31059_c[i] * 2;
                int l = p_21024_4_ + Facing.field_31058_d[i] * 2;
                int i1 = p_21024_1_.func_600_a(j, k, l);
                int j1 = p_21024_1_.func_602_e(j, k, l);
                boolean flag = false;
                if(i1 == Block.field_9268_ac.field_376_bc)
                {
                    TileEntity tileentity1 = p_21024_1_.func_603_b(j, k, l);
                    if(tileentity1 != null && (tileentity1 instanceof TileEntityPiston))
                    {
                        TileEntityPiston tileentitypiston = (TileEntityPiston)tileentity1;
                        if(tileentitypiston.func_31009_d() == i && tileentitypiston.func_31015_b())
                        {
                            tileentitypiston.func_31011_l();
                            i1 = tileentitypiston.func_31016_a();
                            j1 = tileentitypiston.func_479_f();
                            flag = true;
                        }
                    }
                }
                if(!flag && i1 > 0 && func_31042_a(i1, p_21024_1_, j, k, l, false) && (Block.field_345_n[i1].func_31029_h() == 0 || i1 == Block.field_9255_Z.field_376_bc || i1 == Block.field_9259_V.field_376_bc))
                {
                    p_21024_2_ += Facing.field_31056_b[i];
                    p_21024_3_ += Facing.field_31059_c[i];
                    p_21024_4_ += Facing.field_31058_d[i];
                    p_21024_1_.func_643_a(p_21024_2_, p_21024_3_, p_21024_4_, Block.field_9268_ac.field_376_bc, j1);
                    p_21024_1_.func_654_a(p_21024_2_, p_21024_3_, p_21024_4_, BlockPistonMoving.func_31036_a(i1, j1, i, false, false));
                    field_31048_b = false;
                    p_21024_1_.func_690_d(j, k, l, 0);
                    field_31048_b = true;
                } else
                if(!flag)
                {
                    field_31048_b = false;
                    p_21024_1_.func_690_d(p_21024_2_ + Facing.field_31056_b[i], p_21024_3_ + Facing.field_31059_c[i], p_21024_4_ + Facing.field_31058_d[i], 0);
                    field_31048_b = true;
                }
            } else
            {
                field_31048_b = false;
                p_21024_1_.func_690_d(p_21024_2_ + Facing.field_31056_b[i], p_21024_3_ + Facing.field_31059_c[i], p_21024_4_ + Facing.field_31058_d[i], 0);
                field_31048_b = true;
            }
            p_21024_1_.func_684_a((double)p_21024_2_ + 0.5D, (double)p_21024_3_ + 0.5D, (double)p_21024_4_ + 0.5D, "tile.piston.in", 0.5F, p_21024_1_.field_1037_n.nextFloat() * 0.15F + 0.6F);
        }
        field_31048_b = false;
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        int i = p_238_1_.func_602_e(p_238_2_, p_238_3_, p_238_4_);
        if(func_31046_e(i))
        {
            switch(func_31044_d(i))
            {
            case 0: // '\0'
                func_213_a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
                break;

            case 1: // '\001'
                func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
                break;

            case 2: // '\002'
                func_213_a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
                break;

            case 3: // '\003'
                func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
                break;

            case 4: // '\004'
                func_213_a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                break;

            case 5: // '\005'
                func_213_a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
                break;
            }
        } else
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
    }

    public void func_237_e()
    {
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public void func_230_a(World p_230_1_, int p_230_2_, int p_230_3_, int p_230_4_, AxisAlignedBB p_230_5_, ArrayList p_230_6_)
    {
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        super.func_230_a(p_230_1_, p_230_2_, p_230_3_, p_230_4_, p_230_5_, p_230_6_);
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int p_221_4_)
    {
        func_238_a(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
        return super.func_221_d(p_221_1_, p_221_2_, p_221_3_, p_221_4_);
    }

    public boolean func_242_c()
    {
        return false;
    }

    public static int func_31044_d(int p_31044_0_)
    {
        return p_31044_0_ & 7;
    }

    public static boolean func_31046_e(int p_31046_0_)
    {
        return (p_31046_0_ & 8) != 0;
    }

    private static int func_31039_c(World p_31039_0_, int p_31039_1_, int p_31039_2_, int p_31039_3_, EntityPlayer p_31039_4_)
    {
        if(MathHelper.func_1112_e((float)p_31039_4_.field_611_ak - (float)p_31039_1_) < 2.0F && MathHelper.func_1112_e((float)p_31039_4_.field_609_am - (float)p_31039_3_) < 2.0F)
        {
            double d = (p_31039_4_.field_610_al + 1.8200000000000001D) - (double)p_31039_4_.field_9292_aO;
            if(d - (double)p_31039_2_ > 2D)
            {
                return 1;
            }
            if((double)p_31039_2_ - d > 0.0D)
            {
                return 0;
            }
        }
        int i = MathHelper.func_1108_b((double)((p_31039_4_.field_605_aq * 4F) / 360F) + 0.5D) & 3;
        if(i == 0)
        {
            return 2;
        }
        if(i == 1)
        {
            return 5;
        }
        if(i == 2)
        {
            return 3;
        }
        return i != 3 ? 0 : 4;
    }

    private static boolean func_31042_a(int p_31042_0_, World p_31042_1_, int p_31042_2_, int p_31042_3_, int p_31042_4_, boolean p_31042_5_)
    {
        if(p_31042_0_ == Block.field_405_aq.field_376_bc)
        {
            return false;
        }
        if(p_31042_0_ == Block.field_9255_Z.field_376_bc || p_31042_0_ == Block.field_9259_V.field_376_bc)
        {
            if(func_31046_e(p_31042_1_.func_602_e(p_31042_2_, p_31042_3_, p_31042_4_)))
            {
                return false;
            }
        } else
        {
            if(Block.field_345_n[p_31042_0_].func_31031_m() == -1F)
            {
                return false;
            }
            if(Block.field_345_n[p_31042_0_].func_31029_h() == 2)
            {
                return false;
            }
            if(!p_31042_5_ && Block.field_345_n[p_31042_0_].func_31029_h() == 1)
            {
                return false;
            }
        }
        return !(Block.field_345_n[p_31042_0_] instanceof BlockContainer);
    }

    private static boolean func_31045_h(World p_31045_0_, int p_31045_1_, int p_31045_2_, int p_31045_3_, int p_31045_4_)
    {
        int i = p_31045_1_ + Facing.field_31056_b[p_31045_4_];
        int j = p_31045_2_ + Facing.field_31059_c[p_31045_4_];
        int k = p_31045_3_ + Facing.field_31058_d[p_31045_4_];
        int l = 0;
        do
        {
            if(l >= 13)
            {
                break;
            }
            if(j <= 0 || j >= 255)
            {
                return false;
            }
            int i1 = p_31045_0_.func_600_a(i, j, k);
            if(i1 == 0)
            {
                break;
            }
            if(!func_31042_a(i1, p_31045_0_, i, j, k, true))
            {
                return false;
            }
            if(Block.field_345_n[i1].func_31029_h() == 1)
            {
                break;
            }
            if(l == 12)
            {
                return false;
            }
            i += Facing.field_31056_b[p_31045_4_];
            j += Facing.field_31059_c[p_31045_4_];
            k += Facing.field_31058_d[p_31045_4_];
            l++;
        } while(true);
        return true;
    }

    private boolean func_31047_i(World p_31047_1_, int p_31047_2_, int p_31047_3_, int p_31047_4_, int p_31047_5_)
    {
        int i = p_31047_2_ + Facing.field_31056_b[p_31047_5_];
        int j = p_31047_3_ + Facing.field_31059_c[p_31047_5_];
        int k = p_31047_4_ + Facing.field_31058_d[p_31047_5_];
        int l = 0;
        do
        {
            if(l >= 13)
            {
                break;
            }
            if(j <= 0 || j >= 255)
            {
                return false;
            }
            int j1 = p_31047_1_.func_600_a(i, j, k);
            if(j1 == 0)
            {
                break;
            }
            if(!func_31042_a(j1, p_31047_1_, i, j, k, true))
            {
                return false;
            }
            if(Block.field_345_n[j1].func_31029_h() == 1)
            {
                Block.field_345_n[j1].func_259_b_(p_31047_1_, i, j, k, p_31047_1_.func_602_e(i, j, k), 0);
                p_31047_1_.func_690_d(i, j, k, 0);
                break;
            }
            if(l == 12)
            {
                return false;
            }
            i += Facing.field_31056_b[p_31047_5_];
            j += Facing.field_31059_c[p_31047_5_];
            k += Facing.field_31058_d[p_31047_5_];
            l++;
        } while(true);
        int l1;
        for(; i != p_31047_2_ || j != p_31047_3_ || k != p_31047_4_; k = l1)
        {
            int i1 = i - Facing.field_31056_b[p_31047_5_];
            int k1 = j - Facing.field_31059_c[p_31047_5_];
            l1 = k - Facing.field_31058_d[p_31047_5_];
            int i2 = p_31047_1_.func_600_a(i1, k1, l1);
            int j2 = p_31047_1_.func_602_e(i1, k1, l1);
            if(i2 == field_376_bc && i1 == p_31047_2_ && k1 == p_31047_3_ && l1 == p_31047_4_)
            {
                p_31047_1_.func_643_a(i, j, k, Block.field_9268_ac.field_376_bc, p_31047_5_ | (field_31049_a ? 8 : 0));
                p_31047_1_.func_654_a(i, j, k, BlockPistonMoving.func_31036_a(Block.field_9269_aa.field_376_bc, p_31047_5_ | (field_31049_a ? 8 : 0), p_31047_5_, true, false));
            } else
            {
                p_31047_1_.func_643_a(i, j, k, Block.field_9268_ac.field_376_bc, j2);
                p_31047_1_.func_654_a(i, j, k, BlockPistonMoving.func_31036_a(i2, j2, p_31047_5_, true, false));
            }
            i = i1;
            j = k1;
        }

        return true;
    }
}
