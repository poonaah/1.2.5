// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            TexturePackBase, RenderEngine

public class TexturePackFolder extends TexturePackBase
{

    private int field_48191_e;
    private BufferedImage field_48189_f;
    private File field_48190_g;

    public TexturePackFolder(File p_i1013_1_)
    {
        field_48191_e = -1;
        field_6487_a = p_i1013_1_.getName();
        field_48190_g = p_i1013_1_;
    }

    private String func_48188_b(String p_48188_1_)
    {
        if(p_48188_1_ != null && p_48188_1_.length() > 34)
        {
            p_48188_1_ = p_48188_1_.substring(0, 34);
        }
        return p_48188_1_;
    }

    public void func_6485_a(Minecraft p_6485_1_)
        throws IOException
    {
label0:
        {
            InputStream inputstream = null;
            try
            {
                try
                {
                    try
                    {
                        inputstream = func_6481_a("pack.txt");
                        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
                        field_6486_b = func_48188_b(bufferedreader.readLine());
                        field_6489_c = func_48188_b(bufferedreader.readLine());
                        bufferedreader.close();
                        inputstream.close();
                    }
                    catch(Exception exception) { }
                    try
                    {
                        inputstream = func_6481_a("pack.png");
                        field_48189_f = ImageIO.read(inputstream);
                        inputstream.close();
                    }
                    catch(Exception exception1) { }
                }
                catch(Exception exception2)
                {
                    exception2.printStackTrace();
                    break label0;
                }
                break label0;
            }
            finally
            {
                try
                {
                    inputstream.close();
                }
                catch(Exception exception4) { }
            }
        }
    }

    public void func_6484_b(Minecraft p_6484_1_)
    {
        if(field_48189_f != null)
        {
            p_6484_1_.field_6315_n.func_1078_a(field_48191_e);
        }
        func_6480_b();
    }

    public void func_6483_c(Minecraft p_6483_1_)
    {
        if(field_48189_f != null && field_48191_e < 0)
        {
            field_48191_e = p_6483_1_.field_6315_n.func_1074_a(field_48189_f);
        }
        if(field_48189_f != null)
        {
            p_6483_1_.field_6315_n.func_1076_b(field_48191_e);
        } else
        {
            GL11.glBindTexture(3553, p_6483_1_.field_6315_n.func_1070_a("/gui/unknown_pack.png"));
        }
    }

    public void func_6482_a()
    {
    }

    public void func_6480_b()
    {
    }

    public InputStream func_6481_a(String p_6481_1_)
    {
        try
        {
            File file = new File(field_48190_g, p_6481_1_.substring(1));
            if(file.exists())
            {
                return new BufferedInputStream(new FileInputStream(file));
            }
        }
        catch(Exception exception) { }
        return (net.minecraft.src.TexturePackBase.class).getResourceAsStream(p_6481_1_);
    }
}
