// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.InputStream;
import java.net.URL;

// Referenced classes of package net.minecraft.src:
//            CodecMus

class MusInputStream extends InputStream
{

    private int field_1516_c;
    private InputStream field_1515_d;
    byte field_1514_a[];
    final CodecMus field_1513_b; /* synthetic field */

    public MusInputStream(CodecMus p_i46_1_, URL p_i46_2_, InputStream p_i46_3_)
    {
        field_1513_b = p_i46_1_;
        super();
        field_1514_a = new byte[1];
        field_1515_d = p_i46_3_;
        String s = p_i46_2_.getPath();
        s = s.substring(s.lastIndexOf("/") + 1);
        field_1516_c = s.hashCode();
    }

    public int read()
    {
        int i = read(field_1514_a, 0, 1);
        if(i < 0)
        {
            return i;
        } else
        {
            return field_1514_a[0];
        }
    }

    public int read(byte p_read_1_[], int p_read_2_, int p_read_3_)
    {
        p_read_3_ = field_1515_d.read(p_read_1_, p_read_2_, p_read_3_);
        for(int i = 0; i < p_read_3_; i++)
        {
            byte byte0 = p_read_1_[p_read_2_ + i] ^= field_1516_c >> 8;
            field_1516_c = field_1516_c * 0x1dba038f + 0x14ee3 * byte0;
        }

        return p_read_3_;
    }
}
