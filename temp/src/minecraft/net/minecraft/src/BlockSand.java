// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Block, Material, World, EntityFallingSand, 
//            BlockFire

public class BlockSand extends Block
{

    public static boolean field_466_a = false;

    public BlockSand(int p_i702_1_, int p_i702_2_)
    {
        super(p_i702_1_, p_i702_2_, Material.field_1325_m);
    }

    public void func_235_e(World p_235_1_, int p_235_2_, int p_235_3_, int p_235_4_)
    {
        p_235_1_.func_22136_c(p_235_2_, p_235_3_, p_235_4_, field_376_bc, func_4025_d());
    }

    public void func_226_a(World p_226_1_, int p_226_2_, int p_226_3_, int p_226_4_, int p_226_5_)
    {
        p_226_1_.func_22136_c(p_226_2_, p_226_3_, p_226_4_, field_376_bc, func_4025_d());
    }

    public void func_208_a(World p_208_1_, int p_208_2_, int p_208_3_, int p_208_4_, Random p_208_5_)
    {
        func_315_h(p_208_1_, p_208_2_, p_208_3_, p_208_4_);
    }

    private void func_315_h(World p_315_1_, int p_315_2_, int p_315_3_, int p_315_4_)
    {
        int i = p_315_2_;
        int j = p_315_3_;
        int k = p_315_4_;
        if(func_316_a_(p_315_1_, i, j - 1, k) && j >= 0)
        {
            byte byte0 = 32;
            if(field_466_a || !p_315_1_.func_640_a(p_315_2_ - byte0, p_315_3_ - byte0, p_315_4_ - byte0, p_315_2_ + byte0, p_315_3_ + byte0, p_315_4_ + byte0))
            {
                p_315_1_.func_690_d(p_315_2_, p_315_3_, p_315_4_, 0);
                for(; func_316_a_(p_315_1_, p_315_2_, p_315_3_ - 1, p_315_4_) && p_315_3_ > 0; p_315_3_--) { }
                if(p_315_3_ > 0)
                {
                    p_315_1_.func_690_d(p_315_2_, p_315_3_, p_315_4_, field_376_bc);
                }
            } else
            if(!p_315_1_.field_1026_y)
            {
                EntityFallingSand entityfallingsand = new EntityFallingSand(p_315_1_, (float)p_315_2_ + 0.5F, (float)p_315_3_ + 0.5F, (float)p_315_4_ + 0.5F, field_376_bc);
                p_315_1_.func_674_a(entityfallingsand);
            }
        }
    }

    public int func_4025_d()
    {
        return 3;
    }

    public static boolean func_316_a_(World p_316_0_, int p_316_1_, int p_316_2_, int p_316_3_)
    {
        int i = p_316_0_.func_600_a(p_316_1_, p_316_2_, p_316_3_);
        if(i == 0)
        {
            return true;
        }
        if(i == Block.field_402_as.field_376_bc)
        {
            return true;
        }
        Material material = Block.field_345_n[i].field_356_bn;
        if(material == Material.field_1332_f)
        {
            return true;
        }
        return material == Material.field_1331_g;
    }

}
