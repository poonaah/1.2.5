// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            TexturePackBase, RenderEngine

public class TexturePackDefault extends TexturePackBase
{

    private int field_6491_e;
    private BufferedImage field_6490_f;

    public TexturePackDefault()
    {
        field_6491_e = -1;
        field_6487_a = "Default";
        field_6486_b = "The default look of Minecraft";
        try
        {
            field_6490_f = ImageIO.read((net.minecraft.src.TexturePackDefault.class).getResource("/pack.png"));
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    public void func_6484_b(Minecraft p_6484_1_)
    {
        if(field_6490_f != null)
        {
            p_6484_1_.field_6315_n.func_1078_a(field_6491_e);
        }
    }

    public void func_6483_c(Minecraft p_6483_1_)
    {
        if(field_6490_f != null && field_6491_e < 0)
        {
            field_6491_e = p_6483_1_.field_6315_n.func_1074_a(field_6490_f);
        }
        if(field_6490_f != null)
        {
            p_6483_1_.field_6315_n.func_1076_b(field_6491_e);
        } else
        {
            GL11.glBindTexture(3553, p_6483_1_.field_6315_n.func_1070_a("/gui/unknown_pack.png"));
        }
    }
}
