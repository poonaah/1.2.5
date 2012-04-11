// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

// Referenced classes of package net.minecraft.src:
//            PanelCrashReport

class CanvasMojangLogo extends Canvas
{

    private BufferedImage field_1672_a;

    public CanvasMojangLogo()
    {
        try
        {
            field_1672_a = ImageIO.read((net.minecraft.src.PanelCrashReport.class).getResource("/gui/crash_logo.png"));
        }
        catch(IOException ioexception) { }
        byte byte0 = 100;
        setPreferredSize(new Dimension(byte0, byte0));
        setMinimumSize(new Dimension(byte0, byte0));
    }

    public void paint(Graphics p_paint_1_)
    {
        super.paint(p_paint_1_);
        p_paint_1_.drawImage(field_1672_a, getWidth() / 2 - field_1672_a.getWidth() / 2, 32, null);
    }
}
