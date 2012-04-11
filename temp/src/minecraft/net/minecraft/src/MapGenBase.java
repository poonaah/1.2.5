// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;

// Referenced classes of package net.minecraft.src:
//            World, IChunkProvider

public class MapGenBase
{

    protected int field_1306_a;
    protected Random field_1305_b;
    protected World field_35625_d;

    public MapGenBase()
    {
        field_1306_a = 8;
        field_1305_b = new Random();
    }

    public void func_867_a(IChunkProvider p_867_1_, World p_867_2_, int p_867_3_, int p_867_4_, byte p_867_5_[])
    {
        int i = field_1306_a;
        field_35625_d = p_867_2_;
        field_1305_b.setSeed(p_867_2_.func_22138_q());
        long l = field_1305_b.nextLong();
        long l1 = field_1305_b.nextLong();
        for(int j = p_867_3_ - i; j <= p_867_3_ + i; j++)
        {
            for(int k = p_867_4_ - i; k <= p_867_4_ + i; k++)
            {
                long l2 = (long)j * l;
                long l3 = (long)k * l1;
                field_1305_b.setSeed(l2 ^ l3 ^ p_867_2_.func_22138_q());
                func_868_a(p_867_2_, j, k, p_867_3_, p_867_4_, p_867_5_);
            }

        }

    }

    protected void func_868_a(World world, int i, int j, int k, int l, byte abyte0[])
    {
    }
}
