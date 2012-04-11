// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.ByteArrayOutputStream;

// Referenced classes of package net.minecraft.src:
//            RegionFile

class RegionFileChunkBuffer extends ByteArrayOutputStream
{

    private int field_22283_b;
    private int field_22285_c;
    final RegionFile field_22284_a; /* synthetic field */

    public RegionFileChunkBuffer(RegionFile p_i724_1_, int p_i724_2_, int p_i724_3_)
    {
        field_22284_a = p_i724_1_;
        super(8096);
        field_22283_b = p_i724_2_;
        field_22285_c = p_i724_3_;
    }

    public void close()
    {
        field_22284_a.func_22203_a(field_22283_b, field_22285_c, buf, count);
    }
}
