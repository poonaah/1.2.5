// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            Vec3D, MathHelper

public class ChunkPosition
{

    public final int field_1111_a;
    public final int field_1110_b;
    public final int field_1112_c;

    public ChunkPosition(int p_i552_1_, int p_i552_2_, int p_i552_3_)
    {
        field_1111_a = p_i552_1_;
        field_1110_b = p_i552_2_;
        field_1112_c = p_i552_3_;
    }

    public ChunkPosition(Vec3D p_i553_1_)
    {
        this(MathHelper.func_1108_b(p_i553_1_.field_1776_a), MathHelper.func_1108_b(p_i553_1_.field_1775_b), MathHelper.func_1108_b(p_i553_1_.field_1779_c));
    }

    public boolean equals(Object p_equals_1_)
    {
        if(p_equals_1_ instanceof ChunkPosition)
        {
            ChunkPosition chunkposition = (ChunkPosition)p_equals_1_;
            return chunkposition.field_1111_a == field_1111_a && chunkposition.field_1110_b == field_1110_b && chunkposition.field_1112_c == field_1112_c;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return field_1111_a * 0x88f9fa + field_1110_b * 0xef88b + field_1112_c;
    }
}
