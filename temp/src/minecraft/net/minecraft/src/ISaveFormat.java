// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            ISaveHandler, WorldInfo, IProgressUpdate

public interface ISaveFormat
{

    public abstract String func_22178_a();

    public abstract ISaveHandler func_22174_a(String s, boolean flag);

    public abstract List func_22176_b();

    public abstract void func_22177_c();

    public abstract WorldInfo func_22173_b(String s);

    public abstract void func_22172_c(String s);

    public abstract void func_22170_a(String s, String s1);

    public abstract boolean func_22175_a(String s);

    public abstract boolean func_22171_a(String s, IProgressUpdate iprogressupdate);
}
