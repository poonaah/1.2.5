// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockDirectional, Material, World, Block, 
//            EntitySnowman, EntityIronGolem, EntityLiving, MathHelper

public class BlockPumpkin extends BlockDirectional
{

    private boolean field_4072_a;

    protected BlockPumpkin(int p_i671_1_, int p_i671_2_, boolean p_i671_3_)
    {
        super(p_i671_1_, Material.field_4261_w);
        field_378_bb = p_i671_2_;
        func_253_b(true);
        field_4072_a = p_i671_3_;
    }

    public int func_232_a(int p_232_1_, int p_232_2_)
    {
        if(p_232_1_ == 1)
        {
            return field_378_bb;
        }
        if(p_232_1_ == 0)
        {
            return field_378_bb;
        }
        int i = field_378_bb + 1 + 16;
        if(field_4072_a)
        {
            i++;
        }
        if(p_232_2_ == 2 && p_232_1_ == 2)
        {
            return i;
        }
        if(p_232_2_ == 3 && p_232_1_ == 5)
        {
            return i;
        }
        if(p_232_2_ == 0 && p_232_1_ == 3)
        {
            return i;
        }
        if(p_232_2_ == 1 && p_232_1_ == 4)
        {
            return i;
        } else
        {
            return field_378_bb + 16;
        }
    }

    public int func_218_a(int p_218_1_)
    {
        if(p_218_1_ == 1)
        {
            return field_378_bb;
        }
        if(p_218_1_ == 0)
        {
            return field_378_bb;
        }
        if(p_218_1_ == 3)
        {
            return field_378_bb + 1 + 16;
        } else
        {
            return field_378_bb + 16;
        }
    }

    public void func_235_e(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_)
    {
        super.func_235_e(p_235_1_, p_235_2_, p_235_3_, p_235_4_);
        if(p_235_1_.func_600_a(p_235_2_, p_235_3_ - 1, p_235_4_) == Block.field_426_aV.field_376_bc && p_235_1_.func_600_a(p_235_2_, p_235_3_ - 2, p_235_4_) == Block.field_426_aV.field_376_bc)
        {
            if(!p_235_1_.field_1026_y)
            {
                p_235_1_.func_634_a(p_235_2_, p_235_3_, p_235_4_, 0);
                p_235_1_.func_634_a(p_235_2_, p_235_3_ - 1, p_235_4_, 0);
                p_235_1_.func_634_a(p_235_2_, p_235_3_ - 2, p_235_4_, 0);
                EntitySnowman entitysnowman = new EntitySnowman(p_235_1_);
                entitysnowman.func_365_c((double)p_235_2_ + 0.5D, (double)p_235_3_ - 1.95D, (double)p_235_4_ + 0.5D, 0.0F, 0.0F);
                p_235_1_.func_674_a(entitysnowman);
                p_235_1_.func_617_e(p_235_2_, p_235_3_, p_235_4_, 0);
                p_235_1_.func_617_e(p_235_2_, p_235_3_ - 1, p_235_4_, 0);
                p_235_1_.func_617_e(p_235_2_, p_235_3_ - 2, p_235_4_, 0);
            }
            for(int i = 0; i < 120; i++)
            {
                p_235_1_.func_694_a("snowshovel", (double)p_235_2_ + p_235_1_.field_1037_n.nextDouble(), (double)(p_235_3_ - 2) + p_235_1_.field_1037_n.nextDouble() * 2.5D, (double)p_235_4_ + p_235_1_.field_1037_n.nextDouble(), 0.0D, 0.0D, 0.0D);
            }

        } else
        if(p_235_1_.func_600_a(p_235_2_, p_235_3_ - 1, p_235_4_) == Block.field_412_aj.field_376_bc && p_235_1_.func_600_a(p_235_2_, p_235_3_ - 2, p_235_4_) == Block.field_412_aj.field_376_bc)
        {
            boolean flag = p_235_1_.func_600_a(p_235_2_ - 1, p_235_3_ - 1, p_235_4_) == Block.field_412_aj.field_376_bc && p_235_1_.func_600_a(p_235_2_ + 1, p_235_3_ - 1, p_235_4_) == Block.field_412_aj.field_376_bc;
            boolean flag1 = p_235_1_.func_600_a(p_235_2_, p_235_3_ - 1, p_235_4_ - 1) == Block.field_412_aj.field_376_bc && p_235_1_.func_600_a(p_235_2_, p_235_3_ - 1, p_235_4_ + 1) == Block.field_412_aj.field_376_bc;
            if(flag || flag1)
            {
                p_235_1_.func_634_a(p_235_2_, p_235_3_, p_235_4_, 0);
                p_235_1_.func_634_a(p_235_2_, p_235_3_ - 1, p_235_4_, 0);
                p_235_1_.func_634_a(p_235_2_, p_235_3_ - 2, p_235_4_, 0);
                if(flag)
                {
                    p_235_1_.func_634_a(p_235_2_ - 1, p_235_3_ - 1, p_235_4_, 0);
                    p_235_1_.func_634_a(p_235_2_ + 1, p_235_3_ - 1, p_235_4_, 0);
                } else
                {
                    p_235_1_.func_634_a(p_235_2_, p_235_3_ - 1, p_235_4_ - 1, 0);
                    p_235_1_.func_634_a(p_235_2_, p_235_3_ - 1, p_235_4_ + 1, 0);
                }
                EntityIronGolem entityirongolem = new EntityIronGolem(p_235_1_);
                entityirongolem.func_48115_b(true);
                entityirongolem.func_365_c((double)p_235_2_ + 0.5D, (double)p_235_3_ - 1.95D, (double)p_235_4_ + 0.5D, 0.0F, 0.0F);
                p_235_1_.func_674_a(entityirongolem);
                for(int j = 0; j < 120; j++)
                {
                    p_235_1_.func_694_a("snowballpoof", (double)p_235_2_ + p_235_1_.field_1037_n.nextDouble(), (double)(p_235_3_ - 2) + p_235_1_.field_1037_n.nextDouble() * 3.8999999999999999D, (double)p_235_4_ + p_235_1_.field_1037_n.nextDouble(), 0.0D, 0.0D, 0.0D);
                }

                p_235_1_.func_617_e(p_235_2_, p_235_3_, p_235_4_, 0);
                p_235_1_.func_617_e(p_235_2_, p_235_3_ - 1, p_235_4_, 0);
                p_235_1_.func_617_e(p_235_2_, p_235_3_ - 2, p_235_4_, 0);
                if(flag)
                {
                    p_235_1_.func_617_e(p_235_2_ - 1, p_235_3_ - 1, p_235_4_, 0);
                    p_235_1_.func_617_e(p_235_2_ + 1, p_235_3_ - 1, p_235_4_, 0);
                } else
                {
                    p_235_1_.func_617_e(p_235_2_, p_235_3_ - 1, p_235_4_ - 1, 0);
                    p_235_1_.func_617_e(p_235_2_, p_235_3_ - 1, p_235_4_ + 1, 0);
                }
            }
        }
    }

    public boolean func_243_a(World p_243_1_, int p_243_2_, int p_243_3_, int p_243_4_)
    {
        int i = p_243_1_.func_600_a(p_243_2_, p_243_3_, p_243_4_);
        return (i == 0 || Block.field_345_n[i].field_356_bn.func_27283_g()) && p_243_1_.func_28100_h(p_243_2_, p_243_3_ - 1, p_243_4_);
    }

    public void func_4026_a(World p_4026_1_, int p_4026_2_, int p_4026_3_, int p_4026_4_, EntityLiving p_4026_5_)
    {
        int i = MathHelper.func_1108_b((double)((p_4026_5_.field_605_aq * 4F) / 360F) + 2.5D) & 3;
        p_4026_1_.func_691_b(p_4026_2_, p_4026_3_, p_4026_4_, i);
    }
}
