// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, ChunkPosition, 
//            Item, IBlockAccess, Direction, AxisAlignedBB

public class BlockRedstoneWire extends Block
{

    private boolean field_453_a;
    private Set field_21031_b;

    public BlockRedstoneWire(int p_i123_1_, int p_i123_2_)
    {
        super(p_i123_1_, p_i123_2_, Material.field_1324_n);
        field_453_a = true;
        field_21031_b = new HashSet();
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        return field_378_bb;
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
        return 5;
    }

    public int func_207_d(IBlockAccess p_207_1_, int p_207_2_, int p_207_3_, int p_207_4_)
    {
        return 0x800000;
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        return p_243_1_.func_28100_h(p_243_2_, p_243_3_ - 1, p_243_4_) || p_243_1_.func_600_a(p_243_2_, p_243_3_ - 1, p_243_4_) == Block.field_4049_be.field_376_bc;
    }

    private void func_280_h(World p_280_1_, int p_280_2_, int p_280_3_, int p_280_4_)
    {
        func_21030_a(p_280_1_, p_280_2_, p_280_3_, p_280_4_, p_280_2_, p_280_3_, p_280_4_);
        ArrayList arraylist = new ArrayList(field_21031_b);
        field_21031_b.clear();
        for(int i = 0; i < arraylist.size(); i++)
        {
            ChunkPosition chunkposition = (ChunkPosition)arraylist.get(i);
            p_280_1_.func_611_g(chunkposition.field_1111_a, chunkposition.field_1110_b, chunkposition.field_1112_c, field_376_bc);
        }

    }

    private void func_21030_a(World p_21030_1_, int p_21030_2_, int p_21030_3_, int p_21030_4_, int p_21030_5_, int p_21030_6_, int p_21030_7_)
    {
        int i = p_21030_1_.func_602_e(p_21030_2_, p_21030_3_, p_21030_4_);
        int j = 0;
        field_453_a = false;
        boolean flag = p_21030_1_.func_625_o(p_21030_2_, p_21030_3_, p_21030_4_);
        field_453_a = true;
        if(flag)
        {
            j = 15;
        } else
        {
            for(int k = 0; k < 4; k++)
            {
                int i1 = p_21030_2_;
                int k1 = p_21030_4_;
                if(k == 0)
                {
                    i1--;
                }
                if(k == 1)
                {
                    i1++;
                }
                if(k == 2)
                {
                    k1--;
                }
                if(k == 3)
                {
                    k1++;
                }
                if(i1 != p_21030_5_ || p_21030_3_ != p_21030_6_ || k1 != p_21030_7_)
                {
                    j = func_281_g(p_21030_1_, i1, p_21030_3_, k1, j);
                }
                if(p_21030_1_.func_28100_h(i1, p_21030_3_, k1) && !p_21030_1_.func_28100_h(p_21030_2_, p_21030_3_ + 1, p_21030_4_))
                {
                    if(i1 != p_21030_5_ || p_21030_3_ + 1 != p_21030_6_ || k1 != p_21030_7_)
                    {
                        j = func_281_g(p_21030_1_, i1, p_21030_3_ + 1, k1, j);
                    }
                    continue;
                }
                if(!p_21030_1_.func_28100_h(i1, p_21030_3_, k1) && (i1 != p_21030_5_ || p_21030_3_ - 1 != p_21030_6_ || k1 != p_21030_7_))
                {
                    j = func_281_g(p_21030_1_, i1, p_21030_3_ - 1, k1, j);
                }
            }

            if(j > 0)
            {
                j--;
            } else
            {
                j = 0;
            }
        }
        if(i != j)
        {
            p_21030_1_.field_1043_h = true;
            p_21030_1_.func_691_b(p_21030_2_, p_21030_3_, p_21030_4_, j);
            p_21030_1_.func_701_b(p_21030_2_, p_21030_3_, p_21030_4_, p_21030_2_, p_21030_3_, p_21030_4_);
            p_21030_1_.field_1043_h = false;
            for(int l = 0; l < 4; l++)
            {
                int j1 = p_21030_2_;
                int l1 = p_21030_4_;
                int i2 = p_21030_3_ - 1;
                if(l == 0)
                {
                    j1--;
                }
                if(l == 1)
                {
                    j1++;
                }
                if(l == 2)
                {
                    l1--;
                }
                if(l == 3)
                {
                    l1++;
                }
                if(p_21030_1_.func_28100_h(j1, p_21030_3_, l1))
                {
                    i2 += 2;
                }
                int j2 = 0;
                j2 = func_281_g(p_21030_1_, j1, p_21030_3_, l1, -1);
                j = p_21030_1_.func_602_e(p_21030_2_, p_21030_3_, p_21030_4_);
                if(j > 0)
                {
                    j--;
                }
                if(j2 >= 0 && j2 != j)
                {
                    func_21030_a(p_21030_1_, j1, p_21030_3_, l1, p_21030_2_, p_21030_3_, p_21030_4_);
                }
                j2 = func_281_g(p_21030_1_, j1, i2, l1, -1);
                j = p_21030_1_.func_602_e(p_21030_2_, p_21030_3_, p_21030_4_);
                if(j > 0)
                {
                    j--;
                }
                if(j2 >= 0 && j2 != j)
                {
                    func_21030_a(p_21030_1_, j1, i2, l1, p_21030_2_, p_21030_3_, p_21030_4_);
                }
            }

            if(i < j || j == 0)
            {
                field_21031_b.add(new ChunkPosition(p_21030_2_, p_21030_3_, p_21030_4_));
                field_21031_b.add(new ChunkPosition(p_21030_2_ - 1, p_21030_3_, p_21030_4_));
                field_21031_b.add(new ChunkPosition(p_21030_2_ + 1, p_21030_3_, p_21030_4_));
                field_21031_b.add(new ChunkPosition(p_21030_2_, p_21030_3_ - 1, p_21030_4_));
                field_21031_b.add(new ChunkPosition(p_21030_2_, p_21030_3_ + 1, p_21030_4_));
                field_21031_b.add(new ChunkPosition(p_21030_2_, p_21030_3_, p_21030_4_ - 1));
                field_21031_b.add(new ChunkPosition(p_21030_2_, p_21030_3_, p_21030_4_ + 1));
            }
        }
    }

    private void func_282_i(World p_282_1_, int p_282_2_, int p_282_3_, int p_282_4_)
    {
        if(p_282_1_.func_600_a(p_282_2_, p_282_3_, p_282_4_) != field_376_bc)
        {
            return;
        } else
        {
            p_282_1_.func_611_g(p_282_2_, p_282_3_, p_282_4_, field_376_bc);
            p_282_1_.func_611_g(p_282_2_ - 1, p_282_3_, p_282_4_, field_376_bc);
            p_282_1_.func_611_g(p_282_2_ + 1, p_282_3_, p_282_4_, field_376_bc);
            p_282_1_.func_611_g(p_282_2_, p_282_3_, p_282_4_ - 1, field_376_bc);
            p_282_1_.func_611_g(p_282_2_, p_282_3_, p_282_4_ + 1, field_376_bc);
            p_282_1_.func_611_g(p_282_2_, p_282_3_ - 1, p_282_4_, field_376_bc);
            p_282_1_.func_611_g(p_282_2_, p_282_3_ + 1, p_282_4_, field_376_bc);
            return;
        }
    }

    public void func_235_e(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_)
    {
        super.func_235_e(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
        if(p_235_1_.field_1026_y)
        {
            return;
        }
        func_280_h(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
        p_235_1_.func_611_g(p_235_2_, p_235_3_ + 1, p_235_4_, field_376_bc);
        p_235_1_.func_611_g(p_235_2_, p_235_3_ - 1, p_235_4_, field_376_bc);
        func_282_i(p_235_1_, p_235_2_ - 1, p_235_3_, p_235_4_);
        func_282_i(p_235_1_, p_235_2_ + 1, p_235_3_, p_235_4_);
        func_282_i(p_235_1_, p_235_2_, p_235_3_, p_235_4_ - 1);
        func_282_i(p_235_1_, p_235_2_, p_235_3_, p_235_4_ + 1);
        if(p_235_1_.func_28100_h(p_235_2_ - 1, p_235_3_, p_235_4_))
        {
            func_282_i(p_235_1_, p_235_2_ - 1, p_235_3_ + 1, p_235_4_);
        } else
        {
            func_282_i(p_235_1_, p_235_2_ - 1, p_235_3_ - 1, p_235_4_);
        }
        if(p_235_1_.func_28100_h(p_235_2_ + 1, p_235_3_, p_235_4_))
        {
            func_282_i(p_235_1_, p_235_2_ + 1, p_235_3_ + 1, p_235_4_);
        } else
        {
            func_282_i(p_235_1_, p_235_2_ + 1, p_235_3_ - 1, p_235_4_);
        }
        if(p_235_1_.func_28100_h(p_235_2_, p_235_3_, p_235_4_ - 1))
        {
            func_282_i(p_235_1_, p_235_2_, p_235_3_ + 1, p_235_4_ - 1);
        } else
        {
            func_282_i(p_235_1_, p_235_2_, p_235_3_ - 1, p_235_4_ - 1);
        }
        if(p_235_1_.func_28100_h(p_235_2_, p_235_3_, p_235_4_ + 1))
        {
            func_282_i(p_235_1_, p_235_2_, p_235_3_ + 1, p_235_4_ + 1);
        } else
        {
            func_282_i(p_235_1_, p_235_2_, p_235_3_ - 1, p_235_4_ + 1);
        }
    }

    public void func_214_b(World p_214_1_, int p_214_2_, int p_214_3_, int p_214_4_)
    {
        super.func_214_b(p_214_1_, p_214_2_, p_214_3_, p_214_4_);
        if(p_214_1_.field_1026_y)
        {
            return;
        }
        p_214_1_.func_611_g(p_214_2_, p_214_3_ + 1, p_214_4_, field_376_bc);
        p_214_1_.func_611_g(p_214_2_, p_214_3_ - 1, p_214_4_, field_376_bc);
        p_214_1_.func_611_g(p_214_2_ + 1, p_214_3_, p_214_4_, field_376_bc);
        p_214_1_.func_611_g(p_214_2_ - 1, p_214_3_, p_214_4_, field_376_bc);
        p_214_1_.func_611_g(p_214_2_, p_214_3_, p_214_4_ + 1, field_376_bc);
        p_214_1_.func_611_g(p_214_2_, p_214_3_, p_214_4_ - 1, field_376_bc);
        func_280_h(p_214_1_, p_214_2_, p_214_3_, p_214_4_);
        func_282_i(p_214_1_, p_214_2_ - 1, p_214_3_, p_214_4_);
        func_282_i(p_214_1_, p_214_2_ + 1, p_214_3_, p_214_4_);
        func_282_i(p_214_1_, p_214_2_, p_214_3_, p_214_4_ - 1);
        func_282_i(p_214_1_, p_214_2_, p_214_3_, p_214_4_ + 1);
        if(p_214_1_.func_28100_h(p_214_2_ - 1, p_214_3_, p_214_4_))
        {
            func_282_i(p_214_1_, p_214_2_ - 1, p_214_3_ + 1, p_214_4_);
        } else
        {
            func_282_i(p_214_1_, p_214_2_ - 1, p_214_3_ - 1, p_214_4_);
        }
        if(p_214_1_.func_28100_h(p_214_2_ + 1, p_214_3_, p_214_4_))
        {
            func_282_i(p_214_1_, p_214_2_ + 1, p_214_3_ + 1, p_214_4_);
        } else
        {
            func_282_i(p_214_1_, p_214_2_ + 1, p_214_3_ - 1, p_214_4_);
        }
        if(p_214_1_.func_28100_h(p_214_2_, p_214_3_, p_214_4_ - 1))
        {
            func_282_i(p_214_1_, p_214_2_, p_214_3_ + 1, p_214_4_ - 1);
        } else
        {
            func_282_i(p_214_1_, p_214_2_, p_214_3_ - 1, p_214_4_ - 1);
        }
        if(p_214_1_.func_28100_h(p_214_2_, p_214_3_, p_214_4_ + 1))
        {
            func_282_i(p_214_1_, p_214_2_, p_214_3_ + 1, p_214_4_ + 1);
        } else
        {
            func_282_i(p_214_1_, p_214_2_, p_214_3_ - 1, p_214_4_ + 1);
        }
    }

    private int func_281_g(World p_281_1_, int p_281_2_, int p_281_3_, int p_281_4_, int p_281_5_)
    {
        if(p_281_1_.func_600_a(p_281_2_, p_281_3_, p_281_4_) != field_376_bc)
        {
            return p_281_5_;
        }
        int i = p_281_1_.func_602_e(p_281_2_, p_281_3_, p_281_4_);
        if(i > p_281_5_)
        {
            return i;
        } else
        {
            return p_281_5_;
        }
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        if(p_226_1_.field_1026_y)
        {
            return;
        }
        int i = p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_);
        boolean flag = func_243_a(p_226_1_, p_226_2_, p_226_3_, p_226_4_);
        if(!flag)
        {
            func_259_b_(p_226_1_, p_226_2_, p_226_3_, p_226_4_, i, 0);
            p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
        } else
        {
            func_280_h(p_226_1_, p_226_2_, p_226_3_, p_226_4_);
        }
        super.func_226_a(p_226_1_, p_226_2_, p_226_3_, p_226_4_, p_226_5_);
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return Item.field_309_aA.field_291_aS;
    }

    public boolean func_228_c(World p_228_1_, int p_228_2_, int p_228_3_, int p_228_4_, int p_228_5_)
    {
        if(!field_453_a)
        {
            return false;
        } else
        {
            return func_231_b(p_228_1_, p_228_2_, p_228_3_, p_228_4_, p_228_5_);
        }
    }

    public boolean func_231_b(IBlockAccess p_231_1_, int p_231_2_, int p_231_3_, int p_231_4_, int p_231_5_)
    {
        if(!field_453_a)
        {
            return false;
        }
        if(p_231_1_.func_602_e(p_231_2_, p_231_3_, p_231_4_) == 0)
        {
            return false;
        }
        if(p_231_5_ == 1)
        {
            return true;
        }
        boolean flag = func_41053_d(p_231_1_, p_231_2_ - 1, p_231_3_, p_231_4_, 1) || !p_231_1_.func_28100_h(p_231_2_ - 1, p_231_3_, p_231_4_) && func_41053_d(p_231_1_, p_231_2_ - 1, p_231_3_ - 1, p_231_4_, -1);
        boolean flag1 = func_41053_d(p_231_1_, p_231_2_ + 1, p_231_3_, p_231_4_, 3) || !p_231_1_.func_28100_h(p_231_2_ + 1, p_231_3_, p_231_4_) && func_41053_d(p_231_1_, p_231_2_ + 1, p_231_3_ - 1, p_231_4_, -1);
        boolean flag2 = func_41053_d(p_231_1_, p_231_2_, p_231_3_, p_231_4_ - 1, 2) || !p_231_1_.func_28100_h(p_231_2_, p_231_3_, p_231_4_ - 1) && func_41053_d(p_231_1_, p_231_2_, p_231_3_ - 1, p_231_4_ - 1, -1);
        boolean flag3 = func_41053_d(p_231_1_, p_231_2_, p_231_3_, p_231_4_ + 1, 0) || !p_231_1_.func_28100_h(p_231_2_, p_231_3_, p_231_4_ + 1) && func_41053_d(p_231_1_, p_231_2_, p_231_3_ - 1, p_231_4_ + 1, -1);
        if(!p_231_1_.func_28100_h(p_231_2_, p_231_3_ + 1, p_231_4_))
        {
            if(p_231_1_.func_28100_h(p_231_2_ - 1, p_231_3_, p_231_4_) && func_41053_d(p_231_1_, p_231_2_ - 1, p_231_3_ + 1, p_231_4_, -1))
            {
                flag = true;
            }
            if(p_231_1_.func_28100_h(p_231_2_ + 1, p_231_3_, p_231_4_) && func_41053_d(p_231_1_, p_231_2_ + 1, p_231_3_ + 1, p_231_4_, -1))
            {
                flag1 = true;
            }
            if(p_231_1_.func_28100_h(p_231_2_, p_231_3_, p_231_4_ - 1) && func_41053_d(p_231_1_, p_231_2_, p_231_3_ + 1, p_231_4_ - 1, -1))
            {
                flag2 = true;
            }
            if(p_231_1_.func_28100_h(p_231_2_, p_231_3_, p_231_4_ + 1) && func_41053_d(p_231_1_, p_231_2_, p_231_3_ + 1, p_231_4_ + 1, -1))
            {
                flag3 = true;
            }
        }
        if(!flag2 && !flag1 && !flag && !flag3 && p_231_5_ >= 2 && p_231_5_ <= 5)
        {
            return true;
        }
        if(p_231_5_ == 2 && flag2 && !flag && !flag1)
        {
            return true;
        }
        if(p_231_5_ == 3 && flag3 && !flag && !flag1)
        {
            return true;
        }
        if(p_231_5_ == 4 && flag && !flag2 && !flag3)
        {
            return true;
        }
        return p_231_5_ == 5 && flag1 && !flag2 && !flag3;
    }

    public boolean func_209_d()
    {
        return field_453_a;
    }

    public void func_247_b(World p_247_1_, int p_247_2_, int p_247_3_, int p_247_4_, Random p_247_5_)
    {
        int i = p_247_1_.func_602_e(p_247_2_, p_247_3_, p_247_4_);
        if(i > 0)
        {
            double d = (double)p_247_2_ + 0.5D + ((double)p_247_5_.nextFloat() - 0.5D) * 0.20000000000000001D;
            double d1 = (float)p_247_3_ + 0.0625F;
            double d2 = (double)p_247_4_ + 0.5D + ((double)p_247_5_.nextFloat() - 0.5D) * 0.20000000000000001D;
            float f = (float)i / 15F;
            float f1 = f * 0.6F + 0.4F;
            if(i == 0)
            {
                f1 = 0.0F;
            }
            float f2 = f * f * 0.7F - 0.5F;
            float f3 = f * f * 0.6F - 0.7F;
            if(f2 < 0.0F)
            {
                f2 = 0.0F;
            }
            if(f3 < 0.0F)
            {
                f3 = 0.0F;
            }
            p_247_1_.func_694_a("reddust", d, d1, d2, f1, f2, f3);
        }
    }

    public static boolean func_279_b(IBlockAccess p_279_0_, int p_279_1_, int p_279_2_, int p_279_3_, int p_279_4_)
    {
        int i = p_279_0_.func_600_a(p_279_1_, p_279_2_, p_279_3_);
        if(i == Block.field_394_aw.field_376_bc)
        {
            return true;
        }
        if(i == 0)
        {
            return false;
        }
        if(i == Block.field_22021_bh.field_376_bc || i == Block.field_22020_bi.field_376_bc)
        {
            int j = p_279_0_.func_602_e(p_279_1_, p_279_2_, p_279_3_);
            return p_279_4_ == (j & 3) || p_279_4_ == Direction.field_22279_b[j & 3];
        }
        return Block.field_345_n[i].func_209_d() && p_279_4_ != -1;
    }

    public static boolean func_41053_d(IBlockAccess p_41053_0_, int p_41053_1_, int p_41053_2_, int p_41053_3_, int p_41053_4_)
    {
        if(func_279_b(p_41053_0_, p_41053_1_, p_41053_2_, p_41053_3_, p_41053_4_))
        {
            return true;
        }
        int i = p_41053_0_.func_600_a(p_41053_1_, p_41053_2_, p_41053_3_);
        if(i == Block.field_22020_bi.field_376_bc)
        {
            int j = p_41053_0_.func_602_e(p_41053_1_, p_41053_2_, p_41053_3_);
            return p_41053_4_ == (j & 3);
        } else
        {
            return false;
        }
    }
}
