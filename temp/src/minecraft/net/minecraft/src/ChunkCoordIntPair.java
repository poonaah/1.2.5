// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ChunkPosition

public class ChunkCoordIntPair
{

    public final int field_189_a;
    public final int field_188_b;

    public ChunkCoordIntPair(int p_i590_1_, int p_i590_2_)
    {
        field_189_a = p_i590_1_;
        field_188_b = p_i590_2_;
    }

    public static long func_22011_a(int p_22011_0_, int p_22011_1_)
    {
        long l = p_22011_0_;
        long l1 = p_22011_1_;
        return l & 0xffffffffL | (l1 & 0xffffffffL) << 32;
    }

    public int hashCode()
    {
        long l = func_22011_a(field_189_a, field_188_b);
        int i = (int)l;
        int j = (int)(l >> 32);
        return i ^ j;
    }

    public boolean equals(Object p_equals_1_)
    {
        ChunkCoordIntPair chunkcoordintpair = (ChunkCoordIntPair)p_equals_1_;
        return chunkcoordintpair.field_189_a == field_189_a && chunkcoordintpair.field_188_b == field_188_b;
    }

    public int func_40735_a()
    {
        return (field_189_a << 4) + 8;
    }

    public int func_40736_b()
    {
        return (field_188_b << 4) + 8;
    }

    public ChunkPosition func_40737_a(int p_40737_1_)
    {
        return new ChunkPosition(func_40735_a(), p_40737_1_, func_40736_b());
    }

    public String toString()
    {
        return (new StringBuilder()).append("[").append(field_189_a).append(", ").append(field_188_b).append("]").toString();
    }
}
