// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class ScreenShotHelper
{

    private static DateFormat field_4287_a = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
    private static ByteBuffer field_4286_b;
    private static byte field_4289_c[];
    private static int field_4288_d[];

    public static String func_4148_a(File p_4148_0_, int p_4148_1_, int p_4148_2_)
    {
        return func_35879_a(p_4148_0_, null, p_4148_1_, p_4148_2_);
    }

    public static String func_35879_a(File p_35879_0_, String p_35879_1_, int p_35879_2_, int p_35879_3_)
    {
        try
        {
            File file = new File(p_35879_0_, "screenshots");
            file.mkdir();
            if(field_4286_b == null || field_4286_b.capacity() < p_35879_2_ * p_35879_3_)
            {
                field_4286_b = BufferUtils.createByteBuffer(p_35879_2_ * p_35879_3_ * 3);
            }
            if(field_4288_d == null || field_4288_d.length < p_35879_2_ * p_35879_3_ * 3)
            {
                field_4289_c = new byte[p_35879_2_ * p_35879_3_ * 3];
                field_4288_d = new int[p_35879_2_ * p_35879_3_];
            }
            GL11.glPixelStorei(3333, 1);
            GL11.glPixelStorei(3317, 1);
            field_4286_b.clear();
            GL11.glReadPixels(0, 0, p_35879_2_, p_35879_3_, 6407, 5121, field_4286_b);
            field_4286_b.clear();
            String s = (new StringBuilder()).append("").append(field_4287_a.format(new Date())).toString();
            File file1;
            if(p_35879_1_ == null)
            {
                for(int i = 1; (file1 = new File(file, (new StringBuilder()).append(s).append(i != 1 ? (new StringBuilder()).append("_").append(i).toString() : "").append(".png").toString())).exists(); i++) { }
            } else
            {
                file1 = new File(file, p_35879_1_);
            }
            field_4286_b.get(field_4289_c);
            for(int j = 0; j < p_35879_2_; j++)
            {
                for(int k = 0; k < p_35879_3_; k++)
                {
                    int l = j + (p_35879_3_ - k - 1) * p_35879_2_;
                    int i1 = field_4289_c[l * 3 + 0] & 0xff;
                    int j1 = field_4289_c[l * 3 + 1] & 0xff;
                    int k1 = field_4289_c[l * 3 + 2] & 0xff;
                    int l1 = 0xff000000 | i1 << 16 | j1 << 8 | k1;
                    field_4288_d[j + k * p_35879_2_] = l1;
                }

            }

            BufferedImage bufferedimage = new BufferedImage(p_35879_2_, p_35879_3_, 1);
            bufferedimage.setRGB(0, 0, p_35879_2_, p_35879_3_, field_4288_d, 0, p_35879_2_);
            ImageIO.write(bufferedimage, "png", file1);
            return (new StringBuilder()).append("Saved screenshot as ").append(file1.getName()).toString();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            return (new StringBuilder()).append("Failed to save: ").append(exception).toString();
        }
    }

}
