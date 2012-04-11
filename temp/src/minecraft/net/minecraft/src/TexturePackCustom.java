// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.zip.ZipFile;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            TexturePackBase, RenderEngine

public class TexturePackCustom extends TexturePackBase
{

    private ZipFile field_6496_e;
    private int field_6495_f;
    private BufferedImage field_6494_g;
    private File field_6493_h;

    public TexturePackCustom(File p_i167_1_)
    {
        field_6495_f = -1;
        field_6487_a = p_i167_1_.getName();
        field_6493_h = p_i167_1_;
    }

    private String func_6492_b(String p_6492_1_)
    {
        if(p_6492_1_ != null && p_6492_1_.length() > 34)
        {
            p_6492_1_ = p_6492_1_.substring(0, 34);
        }
        return p_6492_1_;
    }

    public void func_6485_a(Minecraft p_6485_1_)
        throws IOException
    {
        ZipFile zipfile = null;
        InputStream inputstream = null;
        try
        {
            zipfile = new ZipFile(field_6493_h);
            try
            {
                inputstream = zipfile.getInputStream(zipfile.getEntry("pack.txt"));
                BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
                field_6486_b = func_6492_b(bufferedreader.readLine());
                field_6489_c = func_6492_b(bufferedreader.readLine());
                bufferedreader.close();
                inputstream.close();
            }
            catch(Exception exception) { }
            try
            {
                inputstream = zipfile.getInputStream(zipfile.getEntry("pack.png"));
                field_6494_g = ImageIO.read(inputstream);
                inputstream.close();
            }
            catch(Exception exception1) { }
            zipfile.close();
        }
        catch(Exception exception2)
        {
            exception2.printStackTrace();
        }
        finally
        {
            try
            {
                inputstream.close();
            }
            catch(Exception exception4) { }
            try
            {
                zipfile.close();
            }
            catch(Exception exception5) { }
        }
    }

    public void func_6484_b(Minecraft p_6484_1_)
    {
        if(field_6494_g != null)
        {
            p_6484_1_.field_6315_n.func_1078_a(field_6495_f);
        }
        func_6480_b();
    }

    public void func_6483_c(Minecraft p_6483_1_)
    {
        if(field_6494_g != null && field_6495_f < 0)
        {
            field_6495_f = p_6483_1_.field_6315_n.func_1074_a(field_6494_g);
        }
        if(field_6494_g != null)
        {
            p_6483_1_.field_6315_n.func_1076_b(field_6495_f);
        } else
        {
            GL11.glBindTexture(3553, p_6483_1_.field_6315_n.func_1070_a("/gui/unknown_pack.png"));
        }
    }

    public void func_6482_a()
    {
        try
        {
            field_6496_e = new ZipFile(field_6493_h);
        }
        catch(Exception exception) { }
    }

    public void func_6480_b()
    {
        try
        {
            field_6496_e.close();
        }
        catch(Exception exception) { }
        field_6496_e = null;
    }

    public InputStream func_6481_a(String p_6481_1_)
    {
        try
        {
            java.util.zip.ZipEntry zipentry = field_6496_e.getEntry(p_6481_1_.substring(1));
            if(zipentry != null)
            {
                return field_6496_e.getInputStream(zipentry);
            }
        }
        catch(Exception exception) { }
        return (net.minecraft.src.TexturePackBase.class).getResourceAsStream(p_6481_1_);
    }
}
