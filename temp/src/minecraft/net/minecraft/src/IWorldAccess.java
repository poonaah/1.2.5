// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Entity, TileEntity, EntityPlayer

public interface IWorldAccess
{

    public abstract void func_934_a(int i, int j, int k);

    public abstract void func_48180_b(int i, int j, int k);

    public abstract void func_937_b(int i, int j, int k, int l, int i1, int j1);

    public abstract void func_940_a(String s, double d, double d1, double d2, 
            float f, float f1);

    public abstract void func_939_a(String s, double d, double d1, double d2, 
            double d3, double d4, double d5);

    public abstract void func_941_a(Entity entity);

    public abstract void func_938_b(Entity entity);

    public abstract void func_933_a(String s, int i, int j, int k);

    public abstract void func_935_a(int i, int j, int k, TileEntity tileentity);

    public abstract void func_28136_a(EntityPlayer entityplayer, int i, int j, int k, int l, int i1);
}
