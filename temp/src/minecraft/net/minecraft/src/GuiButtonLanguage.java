// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            GuiButton, RenderEngine

public class GuiButtonLanguage extends GuiButton
{

    public GuiButtonLanguage(int p_i44_1_, int p_i44_2_, int p_i44_3_)
    {
        super(p_i44_1_, p_i44_2_, p_i44_3_, 20, 20, "");
    }

    public void func_561_a(Minecraft p_561_1_, int p_561_2_, int p_561_3_)
    {
        if(!field_936_h)
        {
            return;
        }
        GL11.glBindTexture(3553, p_561_1_.field_6315_n.func_1070_a("/gui/gui.png"));
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        boolean flag = p_561_2_ >= field_941_c && p_561_3_ >= field_940_d && p_561_2_ < field_941_c + field_52008_a && p_561_3_ < field_940_d + field_52007_b;
        int i = 106;
        if(flag)
        {
            i += field_52007_b;
        }
        func_550_b(field_941_c, field_940_d, 0, i, field_52008_a, field_52007_b);
    }
}
