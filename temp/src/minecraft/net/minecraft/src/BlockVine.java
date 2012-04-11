// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, IBlockAccess, World, 
//            Direction, ColorizerFoliage, BiomeGenBase, EntityPlayer, 
//            ItemStack, Item, ItemShears, StatList, 
//            AxisAlignedBB

public class BlockVine extends Block
{

    public BlockVine(int p_i66_1_)
    {
        super(p_i66_1_, 143, Material.field_35495_k);
        func_253_b(true);
    }

    public void func_237_e()
    {
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public int func_210_f()
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

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        int i = p_238_1_.func_602_e(p_238_2_, p_238_3_, p_238_4_);
        float f = 1.0F;
        float f1 = 1.0F;
        float f2 = 1.0F;
        float f3 = 0.0F;
        float f4 = 0.0F;
        float f5 = 0.0F;
        boolean flag = i > 0;
        if((i & 2) != 0)
        {
            f3 = Math.max(f3, 0.0625F);
            f = 0.0F;
            f1 = 0.0F;
            f4 = 1.0F;
            f2 = 0.0F;
            f5 = 1.0F;
            flag = true;
        }
        if((i & 8) != 0)
        {
            f = Math.min(f, 0.9375F);
            f3 = 1.0F;
            f1 = 0.0F;
            f4 = 1.0F;
            f2 = 0.0F;
            f5 = 1.0F;
            flag = true;
        }
        if((i & 4) != 0)
        {
            f5 = Math.max(f5, 0.0625F);
            f2 = 0.0F;
            f = 0.0F;
            f3 = 1.0F;
            f1 = 0.0F;
            f4 = 1.0F;
            flag = true;
        }
        if((i & 1) != 0)
        {
            f2 = Math.min(f2, 0.9375F);
            f5 = 1.0F;
            f = 0.0F;
            f3 = 1.0F;
            f1 = 0.0F;
            f4 = 1.0F;
            flag = true;
        }
        if(!flag && func_35302_d(p_238_1_.func_600_a(p_238_2_, p_238_3_ + 1, p_238_4_)))
        {
            f1 = Math.min(f1, 0.9375F);
            f4 = 1.0F;
            f = 0.0F;
            f3 = 1.0F;
            f2 = 0.0F;
            f5 = 1.0F;
        }
        func_213_a(f, f1, f2, f3, f4, f5);
    }

    public AxisAlignedBB func_221_d(World p_221_1_, int p_221_2_, int p_221_3_, int i)
    {
        return null;
    }

    public boolean func_28030_e(World p_28030_1_, int p_28030_2_, int p_28030_3_, int p_28030_4_, int p_28030_5_)
    {
        switch(p_28030_5_)
        {
        default:
            return false;

        case 1: // '\001'
            return func_35302_d(p_28030_1_.func_600_a(p_28030_2_, p_28030_3_ + 1, p_28030_4_));

        case 2: // '\002'
            return func_35302_d(p_28030_1_.func_600_a(p_28030_2_, p_28030_3_, p_28030_4_ + 1));

        case 3: // '\003'
            return func_35302_d(p_28030_1_.func_600_a(p_28030_2_, p_28030_3_, p_28030_4_ - 1));

        case 5: // '\005'
            return func_35302_d(p_28030_1_.func_600_a(p_28030_2_ - 1, p_28030_3_, p_28030_4_));

        case 4: // '\004'
            return func_35302_d(p_28030_1_.func_600_a(p_28030_2_ + 1, p_28030_3_, p_28030_4_));
        }
    }

    private boolean func_35302_d(int p_35302_1_)
    {
        if(p_35302_1_ == 0)
        {
            return false;
        }
        Block block = Block.field_345_n[p_35302_1_];
        return block.func_242_c() && block.field_356_bn.func_880_c();
    }

    private boolean func_35301_h(World p_35301_1_, int p_35301_2_, int p_35301_3_, int p_35301_4_)
    {
        int i = p_35301_1_.func_602_e(p_35301_2_, p_35301_3_, p_35301_4_);
        int j = i;
        if(j > 0)
        {
            for(int k = 0; k <= 3; k++)
            {
                int l = 1 << k;
                if((i & l) != 0 && !func_35302_d(p_35301_1_.func_600_a(p_35301_2_ + Direction.field_35871_a[k], p_35301_3_, p_35301_4_ + Direction.field_35870_b[k])) && (p_35301_1_.func_600_a(p_35301_2_, p_35301_3_ + 1, p_35301_4_) != field_376_bc || (p_35301_1_.func_602_e(p_35301_2_, p_35301_3_ + 1, p_35301_4_) & l) == 0))
                {
                    j &= ~l;
                }
            }

        }
        if(j == 0 && !func_35302_d(p_35301_1_.func_600_a(p_35301_2_, p_35301_3_ + 1, p_35301_4_)))
        {
            return false;
        }
        if(j != i)
        {
            p_35301_1_.func_691_b(p_35301_2_, p_35301_3_, p_35301_4_, j);
        }
        return true;
    }

    public int func_35274_i()
    {
        return ColorizerFoliage.func_31073_c();
    }

    public int func_31030_b(int p_31030_1_)
    {
        return ColorizerFoliage.func_31073_c();
    }

    public int func_207_d(IBlockAccess p_207_1_, int p_207_2_, int p_207_3_, int p_207_4_)
    {
        return p_207_1_.func_48454_a(p_207_2_, p_207_4_).func_48412_k();
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        if(!p_226_1_.field_1026_y && !func_35301_h(p_226_1_, p_226_2_, p_226_3_, p_226_4_))
        {
            func_259_b_(p_226_1_, p_226_2_, p_226_3_, p_226_4_, p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_), 0);
            p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
        }
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        if(!p_208_1_.field_1026_y && p_208_1_.field_1037_n.nextInt(4) == 0)
        {
            byte byte0 = 4;
            int i = 5;
            boolean flag = false;
            int j = p_208_2_ - byte0;
label0:
            do
            {
                if(j > p_208_2_ + byte0)
                {
                    break;
                }
label1:
                for(int k = p_208_4_ - byte0; k <= p_208_4_ + byte0; k++)
                {
                    int i1 = p_208_3_ - 1;
                    do
                    {
                        if(i1 > p_208_3_ + 1)
                        {
                            continue label1;
                        }
                        if(p_208_1_.func_600_a(j, i1, k) == field_376_bc && --i <= 0)
                        {
                            flag = true;
                            break label0;
                        }
                        i1++;
                    } while(true);
                }

                j++;
            } while(true);
            j = p_208_1_.func_602_e(p_208_2_, p_208_3_, p_208_4_);
            int l = p_208_1_.field_1037_n.nextInt(6);
            int j1 = Direction.field_35869_d[l];
            if(l == 1 && p_208_3_ < 255 && p_208_1_.func_20084_d(p_208_2_, p_208_3_ + 1, p_208_4_))
            {
                if(flag)
                {
                    return;
                }
                int k1 = p_208_1_.field_1037_n.nextInt(16) & j;
                if(k1 > 0)
                {
                    for(int j2 = 0; j2 <= 3; j2++)
                    {
                        if(!func_35302_d(p_208_1_.func_600_a(p_208_2_ + Direction.field_35871_a[j2], p_208_3_ + 1, p_208_4_ + Direction.field_35870_b[j2])))
                        {
                            k1 &= ~(1 << j2);
                        }
                    }

                    if(k1 > 0)
                    {
                        p_208_1_.func_688_b(p_208_2_, p_208_3_ + 1, p_208_4_, field_376_bc, k1);
                    }
                }
            } else
            if(l >= 2 && l <= 5 && (j & 1 << j1) == 0)
            {
                if(flag)
                {
                    return;
                }
                int l1 = p_208_1_.func_600_a(p_208_2_ + Direction.field_35871_a[j1], p_208_3_, p_208_4_ + Direction.field_35870_b[j1]);
                if(l1 == 0 || Block.field_345_n[l1] == null)
                {
                    int k2 = j1 + 1 & 3;
                    int j3 = j1 + 3 & 3;
                    if((j & 1 << k2) != 0 && func_35302_d(p_208_1_.func_600_a(p_208_2_ + Direction.field_35871_a[j1] + Direction.field_35871_a[k2], p_208_3_, p_208_4_ + Direction.field_35870_b[j1] + Direction.field_35870_b[k2])))
                    {
                        p_208_1_.func_688_b(p_208_2_ + Direction.field_35871_a[j1], p_208_3_, p_208_4_ + Direction.field_35870_b[j1], field_376_bc, 1 << k2);
                    } else
                    if((j & 1 << j3) != 0 && func_35302_d(p_208_1_.func_600_a(p_208_2_ + Direction.field_35871_a[j1] + Direction.field_35871_a[j3], p_208_3_, p_208_4_ + Direction.field_35870_b[j1] + Direction.field_35870_b[j3])))
                    {
                        p_208_1_.func_688_b(p_208_2_ + Direction.field_35871_a[j1], p_208_3_, p_208_4_ + Direction.field_35870_b[j1], field_376_bc, 1 << j3);
                    } else
                    if((j & 1 << k2) != 0 && p_208_1_.func_20084_d(p_208_2_ + Direction.field_35871_a[j1] + Direction.field_35871_a[k2], p_208_3_, p_208_4_ + Direction.field_35870_b[j1] + Direction.field_35870_b[k2]) && func_35302_d(p_208_1_.func_600_a(p_208_2_ + Direction.field_35871_a[k2], p_208_3_, p_208_4_ + Direction.field_35870_b[k2])))
                    {
                        p_208_1_.func_688_b(p_208_2_ + Direction.field_35871_a[j1] + Direction.field_35871_a[k2], p_208_3_, p_208_4_ + Direction.field_35870_b[j1] + Direction.field_35870_b[k2], field_376_bc, 1 << (j1 + 2 & 3));
                    } else
                    if((j & 1 << j3) != 0 && p_208_1_.func_20084_d(p_208_2_ + Direction.field_35871_a[j1] + Direction.field_35871_a[j3], p_208_3_, p_208_4_ + Direction.field_35870_b[j1] + Direction.field_35870_b[j3]) && func_35302_d(p_208_1_.func_600_a(p_208_2_ + Direction.field_35871_a[j3], p_208_3_, p_208_4_ + Direction.field_35870_b[j3])))
                    {
                        p_208_1_.func_688_b(p_208_2_ + Direction.field_35871_a[j1] + Direction.field_35871_a[j3], p_208_3_, p_208_4_ + Direction.field_35870_b[j1] + Direction.field_35870_b[j3], field_376_bc, 1 << (j1 + 2 & 3));
                    } else
                    if(func_35302_d(p_208_1_.func_600_a(p_208_2_ + Direction.field_35871_a[j1], p_208_3_ + 1, p_208_4_ + Direction.field_35870_b[j1])))
                    {
                        p_208_1_.func_688_b(p_208_2_ + Direction.field_35871_a[j1], p_208_3_, p_208_4_ + Direction.field_35870_b[j1], field_376_bc, 0);
                    }
                } else
                if(Block.field_345_n[l1].field_356_bn.func_28126_h() && Block.field_345_n[l1].func_242_c())
                {
                    p_208_1_.func_691_b(p_208_2_, p_208_3_, p_208_4_, j | 1 << j1);
                }
            } else
            if(p_208_3_ > 1)
            {
                int i2 = p_208_1_.func_600_a(p_208_2_, p_208_3_ - 1, p_208_4_);
                if(i2 == 0)
                {
                    int l2 = p_208_1_.field_1037_n.nextInt(16) & j;
                    if(l2 > 0)
                    {
                        p_208_1_.func_688_b(p_208_2_, p_208_3_ - 1, p_208_4_, field_376_bc, l2);
                    }
                } else
                if(i2 == field_376_bc)
                {
                    int i3 = p_208_1_.field_1037_n.nextInt(16) & j;
                    int k3 = p_208_1_.func_602_e(p_208_2_, p_208_3_ - 1, p_208_4_);
                    if(k3 != (k3 | i3))
                    {
                        p_208_1_.func_691_b(p_208_2_, p_208_3_ - 1, p_208_4_, k3 | i3);
                    }
                }
            }
        }
    }

    public void func_258_d(World p_258_1_, int p_258_2_, int p_258_3_, int p_258_4_, int p_258_5_)
    {
        byte byte0 = 0;
        switch(p_258_5_)
        {
        case 2: // '\002'
            byte0 = 1;
            break;

        case 3: // '\003'
            byte0 = 4;
            break;

        case 4: // '\004'
            byte0 = 8;
            break;

        case 5: // '\005'
            byte0 = 2;
            break;
        }
        if(byte0 != 0)
        {
            p_258_1_.func_691_b(p_258_2_, p_258_3_, p_258_4_, byte0);
        }
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return 0;
    }

    public int func_229_a(Random p_229_1_)
    {
        return 0;
    }

    public void func_220_a_(World p_220_1_, EntityPlayer p_220_2_, int p_220_3_, int p_220_4_, int p_220_5_, int p_220_6_)
    {
        if(!p_220_1_.field_1026_y && p_220_2_.func_6416_v() != null && p_220_2_.func_6416_v().field_1617_c == Item.field_31001_bc.field_291_aS)
        {
            p_220_2_.func_25058_a(StatList.field_25159_y[field_376_bc], 1);
            func_31027_a(p_220_1_, p_220_3_, p_220_4_, p_220_5_, new ItemStack(Block.field_35278_bv, 1, 0));
        } else
        {
            super.func_220_a_(p_220_1_, p_220_2_, p_220_3_, p_220_4_, p_220_5_, p_220_6_);
        }
    }
}
