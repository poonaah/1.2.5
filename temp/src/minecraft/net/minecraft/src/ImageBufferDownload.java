// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.Graphics;
import java.awt.image.*;

// Referenced classes of package net.minecraft.src:
//            ImageBuffer

public class ImageBufferDownload
    implements ImageBuffer
{

    private int field_1343_a[];
    private int field_1342_b;
    private int field_1344_c;

    public ImageBufferDownload()
    {
    }

    public BufferedImage func_883_a(BufferedImage p_883_1_)
    {
        if(p_883_1_ == null)
        {
            return null;
        }
        field_1342_b = 64;
        field_1344_c = 32;
        BufferedImage bufferedimage = new BufferedImage(field_1342_b, field_1344_c, 2);
        Graphics g = bufferedimage.getGraphics();
        g.drawImage(p_883_1_, 0, 0, null);
        g.dispose();
        field_1343_a = ((DataBufferInt)bufferedimage.getRaster().getDataBuffer()).getData();
        func_884_b(0, 0, 32, 16);
        func_885_a(32, 0, 64, 32);
        func_884_b(0, 16, 64, 32);
        boolean flag = false;
        for(int i = 32; i < 64; i++)
        {
            for(int k = 0; k < 16; k++)
            {
                int i1 = field_1343_a[i + k * 64];
                if((i1 >> 24 & 0xff) < 128)
                {
                    flag = true;
                }
            }

        }

        if(!flag)
        {
            for(int j = 32; j < 64; j++)
            {
                for(int l = 0; l < 16; l++)
                {
                    int j1 = field_1343_a[j + l * 64];
                    boolean flag1;
                    if((j1 >> 24 & 0xff) < 128)
                    {
                        flag1 = true;
                    }
                }

            }

        }
        return bufferedimage;
    }

    private void func_885_a(int p_885_1_, int p_885_2_, int p_885_3_, int p_885_4_)
    {
        if(func_886_c(p_885_1_, p_885_2_, p_885_3_, p_885_4_))
        {
            return;
        }
        for(int i = p_885_1_; i < p_885_3_; i++)
        {
            for(int j = p_885_2_; j < p_885_4_; j++)
            {
                field_1343_a[i + j * field_1342_b] &= 0xffffff;
            }

        }

    }

    private void func_884_b(int p_884_1_, int p_884_2_, int p_884_3_, int p_884_4_)
    {
        for(int i = p_884_1_; i < p_884_3_; i++)
        {
            for(int j = p_884_2_; j < p_884_4_; j++)
            {
                field_1343_a[i + j * field_1342_b] |= 0xff000000;
            }

        }

    }

    private boolean func_886_c(int p_886_1_, int p_886_2_, int p_886_3_, int p_886_4_)
    {
        for(int i = p_886_1_; i < p_886_3_; i++)
        {
            for(int j = p_886_2_; j < p_886_4_; j++)
            {
                int k = field_1343_a[i + j * field_1342_b];
                if((k >> 24 & 0xff) < 128)
                {
                    return true;
                }
            }

        }

        return false;
    }
}
