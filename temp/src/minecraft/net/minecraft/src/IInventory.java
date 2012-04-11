// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ItemStack, EntityPlayer

public interface IInventory
{

    public abstract int func_469_c();

    public abstract ItemStack func_468_c(int i);

    public abstract ItemStack func_473_a(int i, int j);

    public abstract ItemStack func_48081_b(int i);

    public abstract void func_472_a(int i, ItemStack itemstack);

    public abstract String func_471_d();

    public abstract int func_470_e();

    public abstract void func_474_j_();

    public abstract boolean func_20070_a_(EntityPlayer entityplayer);

    public abstract void func_35142_x_();

    public abstract void func_35141_y_();
}
