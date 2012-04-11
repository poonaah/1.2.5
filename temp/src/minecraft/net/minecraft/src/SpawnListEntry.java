// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            WeightedRandomChoice

public class SpawnListEntry extends WeightedRandomChoice
{

    public Class field_25212_a;
    public int field_35591_b;
    public int field_35592_c;

    public SpawnListEntry(Class p_i241_1_, int p_i241_2_, int p_i241_3_, int p_i241_4_)
    {
        super(p_i241_2_);
        field_25212_a = p_i241_1_;
        field_35591_b = p_i241_3_;
        field_35592_c = p_i241_4_;
    }
}
