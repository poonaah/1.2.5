// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            TileEntity, Material, BiomeGenBase

public interface IBlockAccess
{

    public abstract int func_600_a(int i, int j, int k);

    public abstract TileEntity func_603_b(int i, int j, int k);

    public abstract int func_35451_b(int i, int j, int k, int l);

    public abstract float func_28099_a(int i, int j, int k, int l);

    public abstract float func_598_c(int i, int j, int k);

    public abstract int func_602_e(int i, int j, int k);

    public abstract Material func_599_f(int i, int j, int k);

    public abstract boolean func_601_g(int i, int j, int k);

    public abstract boolean func_28100_h(int i, int j, int k);

    public abstract boolean func_20084_d(int i, int j, int k);

    public abstract BiomeGenBase func_48454_a(int i, int j);

    public abstract int func_48453_b();

    public abstract boolean func_48452_a();
}
