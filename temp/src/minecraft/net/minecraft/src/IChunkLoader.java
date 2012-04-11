// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.IOException;

// Referenced classes of package net.minecraft.src:
//            World, Chunk

public interface IChunkLoader
{

    public abstract Chunk func_813_a(World world, int i, int j)
        throws IOException;

    public abstract void func_812_a(World world, Chunk chunk)
        throws IOException;

    public abstract void func_815_b(World world, Chunk chunk)
        throws IOException;

    public abstract void func_814_a();

    public abstract void func_811_b();
}
