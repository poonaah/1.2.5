// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.*;

// Referenced classes of package net.minecraft.src:
//            BlockDirectional, Material, World, WorldProvider, 
//            EntityPlayer, ChunkCoordinates, EnumStatus, Block, 
//            Direction, Item, IBlockAccess

public class BlockBed extends BlockDirectional
{

    public static final int field_22033_a[][] = {
        {
            0, 1
        }, {
            -1, 0
        }, {
            0, -1
        }, {
            1, 0
        }
    };

    public BlockBed(int p_i518_1_)
    {
        super(p_i518_1_, 134, Material.field_4264_k);
        func_22027_j();
    }

    public boolean func_250_a(World p_250_1_, int p_250_2_, int p_250_3_, int p_250_4_, EntityPlayer p_250_5_)
    {
        if(p_250_1_.field_1026_y)
        {
            return true;
        }
        int i = p_250_1_.func_602_e(p_250_2_, p_250_3_, p_250_4_);
        if(!func_22032_d(i))
        {
            int j = func_48216_a(i);
            p_250_2_ += field_22033_a[j][0];
            p_250_4_ += field_22033_a[j][1];
            if(p_250_1_.func_600_a(p_250_2_, p_250_3_, p_250_4_) != field_376_bc)
            {
                return true;
            }
            i = p_250_1_.func_602_e(p_250_2_, p_250_3_, p_250_4_);
        }
        if(!p_250_1_.field_4209_q.func_6477_d())
        {
            double d = (double)p_250_2_ + 0.5D;
            double d1 = (double)p_250_3_ + 0.5D;
            double d2 = (double)p_250_4_ + 0.5D;
            p_250_1_.func_690_d(p_250_2_, p_250_3_, p_250_4_, 0);
            int k = func_48216_a(i);
            p_250_2_ += field_22033_a[k][0];
            p_250_4_ += field_22033_a[k][1];
            if(p_250_1_.func_600_a(p_250_2_, p_250_3_, p_250_4_) == field_376_bc)
            {
                p_250_1_.func_690_d(p_250_2_, p_250_3_, p_250_4_, 0);
                d = (d + (double)p_250_2_ + 0.5D) / 2D;
                d1 = (d1 + (double)p_250_3_ + 0.5D) / 2D;
                d2 = (d2 + (double)p_250_4_ + 0.5D) / 2D;
            }
            p_250_1_.func_12244_a(null, (float)p_250_2_ + 0.5F, (float)p_250_3_ + 0.5F, (float)p_250_4_ + 0.5F, 5F, true);
            return true;
        }
        if(func_22029_f(i))
        {
            EntityPlayer entityplayer = null;
            Iterator iterator = p_250_1_.field_1040_k.iterator();
            do
            {
                if(!iterator.hasNext())
                {
                    break;
                }
                EntityPlayer entityplayer1 = (EntityPlayer)iterator.next();
                if(entityplayer1.func_22051_K())
                {
                    ChunkCoordinates chunkcoordinates = entityplayer1.field_21908_b;
                    if(chunkcoordinates.field_22395_a == p_250_2_ && chunkcoordinates.field_22394_b == p_250_3_ && chunkcoordinates.field_22396_c == p_250_4_)
                    {
                        entityplayer = entityplayer1;
                    }
                }
            } while(true);
            if(entityplayer == null)
            {
                func_22031_a(p_250_1_, p_250_2_, p_250_3_, p_250_4_, false);
            } else
            {
                p_250_5_.func_22055_b("tile.bed.occupied");
                return true;
            }
        }
        EnumStatus enumstatus = p_250_5_.func_22053_b(p_250_2_, p_250_3_, p_250_4_);
        if(enumstatus == EnumStatus.OK)
        {
            func_22031_a(p_250_1_, p_250_2_, p_250_3_, p_250_4_, true);
            return true;
        }
        if(enumstatus == EnumStatus.NOT_POSSIBLE_NOW)
        {
            p_250_5_.func_22055_b("tile.bed.noSleep");
        } else
        if(enumstatus == EnumStatus.NOT_SAFE)
        {
            p_250_5_.func_22055_b("tile.bed.notSafe");
        }
        return true;
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        if(p_232_1_ == 0)
        {
            return Block.field_334_y.field_378_bb;
        }
        int i = func_48216_a(p_232_2_);
        int j = Direction.field_22281_c[i][p_232_1_];
        if(func_22032_d(p_232_2_))
        {
            if(j == 2)
            {
                return field_378_bb + 2 + 16;
            }
            if(j == 5 || j == 4)
            {
                return field_378_bb + 1 + 16;
            } else
            {
                return field_378_bb + 1;
            }
        }
        if(j == 3)
        {
            return (field_378_bb - 1) + 16;
        }
        if(j == 5 || j == 4)
        {
            return field_378_bb + 16;
        } else
        {
            return field_378_bb;
        }
    }

    public int func_210_f()
    {
        return 14;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public void func_238_a(IBlockAccess p_238_1_, int p_238_2_, int p_238_3_, int p_238_4_)
    {
        func_22027_j();
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        int i = p_226_1_.func_602_e(p_226_2_, p_226_3_, p_226_4_);
        int j = func_48216_a(i);
        if(func_22032_d(i))
        {
            if(p_226_1_.func_600_a(p_226_2_ - field_22033_a[j][0], p_226_3_, p_226_4_ - field_22033_a[j][1]) != field_376_bc)
            {
                p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
            }
        } else
        if(p_226_1_.func_600_a(p_226_2_ + field_22033_a[j][0], p_226_3_, p_226_4_ + field_22033_a[j][1]) != field_376_bc)
        {
            p_226_1_.func_690_d(p_226_2_, p_226_3_, p_226_4_, 0);
            if(!p_226_1_.field_1026_y)
            {
                func_259_b_(p_226_1_, p_226_2_, p_226_3_, p_226_4_, i, 0);
            }
        }
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        if(func_22032_d(p_240_1_))
        {
            return 0;
        } else
        {
            return Item.field_22019_aY.field_291_aS;
        }
    }

    private void func_22027_j()
    {
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
    }

    public static boolean func_22032_d(int p_22032_0_)
    {
        return (p_22032_0_ & 8) != 0;
    }

    public static boolean func_22029_f(int p_22029_0_)
    {
        return (p_22029_0_ & 4) != 0;
    }

    public static void func_22031_a(World p_22031_0_, int p_22031_1_, int p_22031_2_, int p_22031_3_, boolean p_22031_4_)
    {
        int i = p_22031_0_.func_602_e(p_22031_1_, p_22031_2_, p_22031_3_);
        if(p_22031_4_)
        {
            i |= 4;
        } else
        {
            i &= -5;
        }
        p_22031_0_.func_691_b(p_22031_1_, p_22031_2_, p_22031_3_, i);
    }

    public static ChunkCoordinates func_22028_g(World p_22028_0_, int p_22028_1_, int p_22028_2_, int p_22028_3_, int p_22028_4_)
    {
        int i = p_22028_0_.func_602_e(p_22028_1_, p_22028_2_, p_22028_3_);
        int j = BlockDirectional.func_48216_a(i);
        for(int k = 0; k <= 1; k++)
        {
            int l = p_22028_1_ - field_22033_a[j][0] * k - 1;
            int i1 = p_22028_3_ - field_22033_a[j][1] * k - 1;
            int j1 = l + 2;
            int k1 = i1 + 2;
            for(int l1 = l; l1 <= j1; l1++)
            {
                for(int i2 = i1; i2 <= k1; i2++)
                {
                    if(!p_22028_0_.func_28100_h(l1, p_22028_2_ - 1, i2) || !p_22028_0_.func_20084_d(l1, p_22028_2_, i2) || !p_22028_0_.func_20084_d(l1, p_22028_2_ + 1, i2))
                    {
                        continue;
                    }
                    if(p_22028_4_ > 0)
                    {
                        p_22028_4_--;
                    } else
                    {
                        return new ChunkCoordinates(l1, p_22028_2_, i2);
                    }
                }

            }

        }

        return null;
    }

    public void func_216_a(World p_216_1_, int p_216_2_, int p_216_3_, int p_216_4_, int p_216_5_, float p_216_6_, int p_216_7_)
    {
        if(!func_22032_d(p_216_5_))
        {
            super.func_216_a(p_216_1_, p_216_2_, p_216_3_, p_216_4_, p_216_5_, p_216_6_, 0);
        }
    }

    public int func_31029_h()
    {
        return 1;
    }

}
