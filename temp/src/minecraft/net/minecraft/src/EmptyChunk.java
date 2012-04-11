// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            Chunk, World, EnumSkyBlock, Entity, 
//            TileEntity, AxisAlignedBB

public class EmptyChunk extends Chunk
{

    public EmptyChunk(World p_i8_1_, int p_i8_2_, int p_i8_3_)
    {
        super(p_i8_1_, p_i8_2_, p_i8_3_);
    }

    public boolean func_1017_a(int p_1017_1_, int p_1017_2_)
    {
        return p_1017_1_ == field_1531_j && p_1017_2_ == field_1530_k;
    }

    public int func_999_b(int p_999_1_, int p_999_2_)
    {
        return 0;
    }

    public void func_1018_b()
    {
    }

    public void func_1024_c()
    {
    }

    public void func_4143_d()
    {
    }

    public int func_1008_a(int p_1008_1_, int p_1008_2_, int p_1008_3_)
    {
        return 0;
    }

    public int func_48499_b(int p_48499_1_, int p_48499_2_, int p_48499_3_)
    {
        return 255;
    }

    public boolean func_1010_a(int p_1010_1_, int p_1010_2_, int p_1010_3_, int i, int j)
    {
        return true;
    }

    public boolean func_1022_a(int p_1022_1_, int p_1022_2_, int p_1022_3_, int i)
    {
        return true;
    }

    public int func_1021_b(int p_1021_1_, int p_1021_2_, int p_1021_3_)
    {
        return 0;
    }

    public boolean func_1009_b(int p_1009_1_, int p_1009_2_, int p_1009_3_, int i)
    {
        return false;
    }

    public int func_1025_a(EnumSkyBlock p_1025_1_, int p_1025_2_, int p_1025_3_, int i)
    {
        return 0;
    }

    public void func_1011_a(EnumSkyBlock enumskyblock, int i, int j, int k, int l)
    {
    }

    public int func_1019_c(int p_1019_1_, int p_1019_2_, int p_1019_3_, int i)
    {
        return 0;
    }

    public void func_1000_a(Entity entity)
    {
    }

    public void func_1015_b(Entity entity)
    {
    }

    public void func_1016_a(Entity entity, int i)
    {
    }

    public boolean func_1007_c(int p_1007_1_, int p_1007_2_, int p_1007_3_)
    {
        return false;
    }

    public TileEntity func_1002_d(int p_1002_1_, int p_1002_2_, int p_1002_3_)
    {
        return null;
    }

    public void func_1001_a(TileEntity tileentity)
    {
    }

    public void func_1005_a(int i, int j, int k, TileEntity tileentity)
    {
    }

    public void func_1023_e(int i, int j, int k)
    {
    }

    public void func_995_d()
    {
    }

    public void func_998_e()
    {
    }

    public void func_1006_f()
    {
    }

    public void func_994_a(Entity entity, AxisAlignedBB axisalignedbb, List list)
    {
    }

    public void func_1013_a(Class class1, AxisAlignedBB axisalignedbb, List list)
    {
    }

    public boolean func_1012_a(boolean p_1012_1_)
    {
        return false;
    }

    public Random func_997_a(long p_997_1_)
    {
        return new Random(field_1537_d.func_22138_q() + (long)(field_1531_j * field_1531_j * 0x4c1906) + (long)(field_1531_j * 0x5ac0db) + (long)(field_1530_k * field_1530_k) * 0x4307a7L + (long)(field_1530_k * 0x5f24f) ^ p_997_1_);
    }

    public boolean func_21167_h()
    {
        return true;
    }

    public boolean func_48492_c(int p_48492_1_, int p_48492_2_)
    {
        return true;
    }
}
