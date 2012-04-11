// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

public abstract class StructurePieceBlockSelector
{

    protected int field_35710_a;
    protected int field_35709_b;

    protected StructurePieceBlockSelector()
    {
    }

    public abstract void func_35706_a(Random random, int i, int j, int k, boolean flag);

    public int func_35707_a()
    {
        return field_35710_a;
    }

    public int func_35708_b()
    {
        return field_35709_b;
    }
}
