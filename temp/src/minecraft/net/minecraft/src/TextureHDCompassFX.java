// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            TextureFX, TextureHDFX, Item, TexturePackBase, 
//            World, ChunkCoordinates, EntityPlayerSP, WorldProvider

public class TextureHDCompassFX extends TextureFX
    implements TextureHDFX
{

    private Minecraft mc;
    private int tileWidth;
    private TexturePackBase texturePackBase;
    private byte baseImageData[];
    private int compassIconImageData[];
    private double showAngle;
    private double angleDiff;

    public TextureHDCompassFX(Minecraft minecraft)
    {
        super(Item.field_4025_aO.func_27009_a(0));
        tileWidth = 0;
        texturePackBase = null;
        mc = minecraft;
        tileWidth = 16;
        setup();
    }

    public void setTileWidth(int i)
    {
        tileWidth = i;
        setup();
    }

    public void setTexturePackBase(TexturePackBase texturepackbase)
    {
        texturePackBase = texturepackbase;
    }

    private void setup()
    {
        field_1127_a = new byte[tileWidth * tileWidth * 4];
        compassIconImageData = new int[tileWidth * tileWidth];
        field_1128_f = 1;
        try
        {
            BufferedImage bufferedimage = ImageIO.read((net.minecraft.client.Minecraft.class).getResource("/gui/items.png"));
            if(texturePackBase != null)
            {
                bufferedimage = ImageIO.read(texturePackBase.func_6481_a("/gui/items.png"));
            }
            tileWidth = bufferedimage.getWidth() / 16;
            field_1127_a = new byte[tileWidth * tileWidth * 4];
            compassIconImageData = new int[tileWidth * tileWidth];
            int i = (field_1126_b % 16) * tileWidth;
            int j = (field_1126_b / 16) * tileWidth;
            bufferedimage.getRGB(i, j, tileWidth, tileWidth, compassIconImageData, 0, tileWidth);
            baseImageData = new byte[field_1127_a.length];
            int k = tileWidth * tileWidth;
            for(int l = 0; l < k; l++)
            {
                int i1 = compassIconImageData[l] >> 24 & 0xff;
                int j1 = compassIconImageData[l] >> 16 & 0xff;
                int k1 = compassIconImageData[l] >> 8 & 0xff;
                int l1 = compassIconImageData[l] >> 0 & 0xff;
                if(field_1131_c)
                {
                    int i2 = (j1 * 30 + k1 * 59 + l1 * 11) / 100;
                    int j2 = (j1 * 30 + k1 * 70) / 100;
                    int k2 = (j1 * 30 + l1 * 70) / 100;
                    j1 = i2;
                    k1 = j2;
                    l1 = k2;
                }
                baseImageData[l * 4 + 0] = (byte)j1;
                baseImageData[l * 4 + 1] = (byte)k1;
                baseImageData[l * 4 + 2] = (byte)l1;
                baseImageData[l * 4 + 3] = (byte)i1;
            }

        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    public void func_783_a()
    {
        int i = tileWidth * tileWidth;
        double d = (double)(tileWidth / 2) + 0.5D;
        double d1 = (double)(tileWidth / 2) - 0.5D;
        double d2 = 0.29999999999999999D * (double)(tileWidth / 16);
        System.arraycopy(baseImageData, 0, field_1127_a, 0, field_1127_a.length);
        double d3 = 0.0D;
        if(mc.field_6324_e != null && mc.field_6322_g != null)
        {
            ChunkCoordinates chunkcoordinates = mc.field_6324_e.func_22137_s();
            double d5 = (double)chunkcoordinates.field_22395_a - mc.field_6322_g.field_611_ak;
            double d7 = (double)chunkcoordinates.field_22396_c - mc.field_6322_g.field_609_am;
            d3 = ((double)(mc.field_6322_g.field_605_aq - 90F) * 3.1415926535897931D) / 180D - Math.atan2(d7, d5);
            if(!mc.field_6324_e.field_4209_q.func_48217_e())
            {
                d3 = Math.random() * 3.1415927410125732D * 2D;
            }
        }
        double d4;
        for(d4 = d3 - showAngle; d4 < -3.1415926535897931D; d4 += 6.2831853071795862D) { }
        for(; d4 >= 3.1415926535897931D; d4 -= 6.2831853071795862D) { }
        if(d4 < -1D)
        {
            d4 = -1D;
        }
        if(d4 > 1.0D)
        {
            d4 = 1.0D;
        }
        angleDiff += d4 * 0.10000000000000001D;
        angleDiff *= 0.80000000000000004D;
        showAngle += angleDiff;
        double d6 = Math.sin(showAngle);
        double d8 = Math.cos(showAngle);
        for(int j = -4; j <= 4; j++)
        {
            int l = (int)(d + d8 * (double)j * d2);
            int j1 = (int)(d1 - d6 * (double)j * d2 * 0.5D);
            int l1 = j1 * tileWidth + l;
            int j2 = 100;
            int l2 = 100;
            int j3 = 100;
            char c = '\377';
            if(field_1131_c)
            {
                int l3 = (j2 * 30 + l2 * 59 + j3 * 11) / 100;
                int l4 = (j2 * 30 + l2 * 70) / 100;
                int j5 = (j2 * 30 + j3 * 70) / 100;
                j2 = l3;
                l2 = l4;
                j3 = j5;
            }
            int i4 = l1 * 4;
            field_1127_a[i4 + 0] = (byte)j2;
            field_1127_a[i4 + 1] = (byte)l2;
            field_1127_a[i4 + 2] = (byte)j3;
            field_1127_a[i4 + 3] = (byte)c;
        }

        for(int k = -8; k <= 16; k++)
        {
            int i1 = (int)(d + d6 * (double)k * d2);
            int k1 = (int)(d1 + d8 * (double)k * d2 * 0.5D);
            int i2 = k1 * tileWidth + i1;
            int k2 = k >= 0 ? 255 : 100;
            int i3 = k >= 0 ? 20 : 100;
            int k3 = k >= 0 ? 20 : 100;
            char c1 = '\377';
            if(field_1131_c)
            {
                int j4 = (k2 * 30 + i3 * 59 + k3 * 11) / 100;
                int i5 = (k2 * 30 + i3 * 70) / 100;
                int k5 = (k2 * 30 + k3 * 70) / 100;
                k2 = j4;
                i3 = i5;
                k3 = k5;
            }
            int k4 = i2 * 4;
            field_1127_a[k4 + 0] = (byte)k2;
            field_1127_a[k4 + 1] = (byte)i3;
            field_1127_a[k4 + 2] = (byte)k3;
            field_1127_a[k4 + 3] = (byte)c1;
        }

    }
}
