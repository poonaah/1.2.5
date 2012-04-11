// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.File;
import java.util.List;

// Referenced classes of package net.minecraft.src:
//            WorldInfo, WorldProvider, IChunkLoader

public interface ISaveHandler
{

    public abstract WorldInfo func_22151_c();

    public abstract void func_22150_b();

    public abstract IChunkLoader func_22149_a(WorldProvider worldprovider);

    public abstract void func_22148_a(WorldInfo worldinfo, List list);

    public abstract void func_22152_a(WorldInfo worldinfo);

    public abstract File func_28113_a(String s);

    public abstract String func_40530_d();
}
