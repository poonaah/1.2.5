// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            AxisAlignedBB

public interface ICamera
{

    public abstract boolean func_342_a(AxisAlignedBB axisalignedbb);

    public abstract boolean isBoundingBoxInFrustumFully(AxisAlignedBB axisalignedbb);

    public abstract void func_343_a(double d, double d1, double d2);
}
