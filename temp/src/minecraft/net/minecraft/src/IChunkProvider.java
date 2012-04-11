// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            Chunk, IProgressUpdate, EnumCreatureType, World, 
//            ChunkPosition

public interface IChunkProvider
{

    public abstract boolean func_537_a(int i, int j);

    public abstract Chunk func_533_b(int i, int j);

    public abstract Chunk func_538_d(int i, int j);

    public abstract void func_534_a(IChunkProvider ichunkprovider, int i, int j);

    public abstract boolean func_535_a(boolean flag, IProgressUpdate iprogressupdate);

    public abstract boolean func_532_a();

    public abstract boolean func_536_b();

    public abstract String func_21109_c();

    public abstract List func_40377_a(EnumCreatureType enumcreaturetype, int i, int j, int k);

    public abstract ChunkPosition func_40376_a(World world, String s, int i, int j, int k);
}
