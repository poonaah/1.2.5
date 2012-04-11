// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            NBTTagCompound

public abstract class WorldSavedData
{

    public final String field_28168_a;
    private boolean field_28167_b;

    public WorldSavedData(String p_i717_1_)
    {
        field_28168_a = p_i717_1_;
    }

    public abstract void func_28163_a(NBTTagCompound nbttagcompound);

    public abstract void func_28162_b(NBTTagCompound nbttagcompound);

    public void func_28164_a()
    {
        func_28165_a(true);
    }

    public void func_28165_a(boolean p_28165_1_)
    {
        field_28167_b = p_28165_1_;
    }

    public boolean func_28166_b()
    {
        return field_28167_b;
    }
}
