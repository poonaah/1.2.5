// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            BlockContainer, Material, TileEntityMobSpawner, TileEntity

public class BlockMobSpawner extends BlockContainer
{

    protected BlockMobSpawner(int p_i266_1_, int p_i266_2_)
    {
        super(p_i266_1_, p_i266_2_, Material.field_1334_d);
    }

    public TileEntity func_283_a_()
    {
        return new TileEntityMobSpawner();
    }

    public int func_240_a(int p_240_1_, Random p_240_2_, int p_240_3_)
    {
        return 0;
    }

    public int func_229_a(Random p_229_1_)
    {
        return 0;
    }

    public boolean func_217_b()
    {
        return false;
    }
}
