// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public class ChunkCoordinates
    implements Comparable
{

    public int field_22395_a;
    public int field_22394_b;
    public int field_22396_c;

    public ChunkCoordinates()
    {
    }

    public ChunkCoordinates(int p_i624_1_, int p_i624_2_, int p_i624_3_)
    {
        field_22395_a = p_i624_1_;
        field_22394_b = p_i624_2_;
        field_22396_c = p_i624_3_;
    }

    public ChunkCoordinates(ChunkCoordinates p_i625_1_)
    {
        field_22395_a = p_i625_1_.field_22395_a;
        field_22394_b = p_i625_1_.field_22394_b;
        field_22396_c = p_i625_1_.field_22396_c;
    }

    public boolean equals(Object p_equals_1_)
    {
        if(!(p_equals_1_ instanceof ChunkCoordinates))
        {
            return false;
        } else
        {
            ChunkCoordinates chunkcoordinates = (ChunkCoordinates)p_equals_1_;
            return field_22395_a == chunkcoordinates.field_22395_a && field_22394_b == chunkcoordinates.field_22394_b && field_22396_c == chunkcoordinates.field_22396_c;
        }
    }

    public int hashCode()
    {
        return field_22395_a + field_22396_c << 8 + field_22394_b << 16;
    }

    public int func_22393_a(ChunkCoordinates p_22393_1_)
    {
        if(field_22394_b == p_22393_1_.field_22394_b)
        {
            if(field_22396_c == p_22393_1_.field_22396_c)
            {
                return field_22395_a - p_22393_1_.field_22395_a;
            } else
            {
                return field_22396_c - p_22393_1_.field_22396_c;
            }
        } else
        {
            return field_22394_b - p_22393_1_.field_22394_b;
        }
    }

    public void func_48656_a(int p_48656_1_, int p_48656_2_, int p_48656_3_)
    {
        field_22395_a = p_48656_1_;
        field_22394_b = p_48656_2_;
        field_22396_c = p_48656_3_;
    }

    public double func_27439_a(int p_27439_1_, int p_27439_2_, int p_27439_3_)
    {
        int i = field_22395_a - p_27439_1_;
        int j = field_22394_b - p_27439_2_;
        int k = field_22396_c - p_27439_3_;
        return Math.sqrt(i * i + j * j + k * k);
    }

    public float func_48655_c(int p_48655_1_, int p_48655_2_, int p_48655_3_)
    {
        int i = field_22395_a - p_48655_1_;
        int j = field_22394_b - p_48655_2_;
        int k = field_22396_c - p_48655_3_;
        return (float)(i * i + j * j + k * k);
    }

    public int compareTo(Object p_compareTo_1_)
    {
        return func_22393_a((ChunkCoordinates)p_compareTo_1_);
    }
}
