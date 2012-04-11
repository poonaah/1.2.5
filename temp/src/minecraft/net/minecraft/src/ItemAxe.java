// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemTool, Block, Material, EnumToolMaterial, 
//            ItemStack

public class ItemAxe extends ItemTool
{

    private static Block field_327_aX[];

    protected ItemAxe(int p_i487_1_, EnumToolMaterial p_i487_2_)
    {
        super(p_i487_1_, 3, p_i487_2_, field_327_aX);
    }

    public float func_204_a(ItemStack p_204_1_, Block p_204_2_)
    {
        if(p_204_2_ != null && p_204_2_.field_356_bn == Material.field_1335_c)
        {
            return field_324_aY;
        } else
        {
            return super.func_204_a(p_204_1_, p_204_2_);
        }
    }

    static 
    {
        field_327_aX = (new Block[] {
            Block.field_334_y, Block.field_407_ao, Block.field_385_K, Block.field_396_av, Block.field_411_ak, Block.field_410_al, Block.field_4055_bb, Block.field_4045_bg
        });
    }
}
