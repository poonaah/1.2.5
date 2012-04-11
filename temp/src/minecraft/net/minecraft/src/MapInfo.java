// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            EntityPlayer, MapData

public class MapInfo
{

    public final EntityPlayer field_28120_a;
    public int field_28119_b[];
    public int field_28124_c[];
    private int field_28122_e;
    private int field_28121_f;
    final MapData field_28123_d; /* synthetic field */

    public MapInfo(MapData p_i475_1_, EntityPlayer p_i475_2_)
    {
        field_28123_d = p_i475_1_;
        super();
        field_28119_b = new int[128];
        field_28124_c = new int[128];
        field_28122_e = 0;
        field_28121_f = 0;
        field_28120_a = p_i475_2_;
        for(int i = 0; i < field_28119_b.length; i++)
        {
            field_28119_b[i] = 0;
            field_28124_c[i] = 127;
        }

    }
}
