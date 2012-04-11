// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Gui, RenderEngine

public class GuiButton extends Gui
{

    protected int field_52008_a;
    protected int field_52007_b;
    public int field_941_c;
    public int field_940_d;
    public String field_939_e;
    public int field_938_f;
    public boolean field_937_g;
    public boolean field_936_h;

    public GuiButton(int p_i771_1_, int p_i771_2_, int p_i771_3_, String p_i771_4_)
    {
        this(p_i771_1_, p_i771_2_, p_i771_3_, 200, 20, p_i771_4_);
    }

    public GuiButton(int p_i772_1_, int p_i772_2_, int p_i772_3_, int p_i772_4_, int p_i772_5_, String p_i772_6_)
    {
        field_52008_a = 200;
        field_52007_b = 20;
        field_937_g = true;
        field_936_h = true;
        field_938_f = p_i772_1_;
        field_941_c = p_i772_2_;
        field_940_d = p_i772_3_;
        field_52008_a = p_i772_4_;
        field_52007_b = p_i772_5_;
        field_939_e = p_i772_6_;
    }

    protected int func_558_a(boolean p_558_1_)
    {
        byte byte0 = 1;
        if(!field_937_g)
        {
            byte0 = 0;
        } else
        if(p_558_1_)
        {
            byte0 = 2;
        }
        return byte0;
    }

    public void func_561_a(Minecraft p_561_1_, int p_561_2_, int p_561_3_)
    {
        if(!field_936_h)
        {
            return;
        }
        FontRenderer fontrenderer = p_561_1_.field_6314_o;
        GL11.glBindTexture(3553, p_561_1_.field_6315_n.func_1070_a("/gui/gui.png"));
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        boolean flag = p_561_2_ >= field_941_c && p_561_3_ >= field_940_d && p_561_2_ < field_941_c + field_52008_a && p_561_3_ < field_940_d + field_52007_b;
        int i = func_558_a(flag);
        func_550_b(field_941_c, field_940_d, 0, 46 + i * 20, field_52008_a / 2, field_52007_b);
        func_550_b(field_941_c + field_52008_a / 2, field_940_d, 200 - field_52008_a / 2, 46 + i * 20, field_52008_a / 2, field_52007_b);
        func_560_b(p_561_1_, p_561_2_, p_561_3_);
        int j = 0xe0e0e0;
        if(!field_937_g)
        {
            j = 0xffa0a0a0;
        } else
        if(flag)
        {
            j = 0xffffa0;
        }
        func_548_a(fontrenderer, field_939_e, field_941_c + field_52008_a / 2, field_940_d + (field_52007_b - 8) / 2, j);
    }

    protected void func_560_b(Minecraft minecraft, int i, int j)
    {
    }

    public void func_559_a(int i, int j)
    {
    }

    public boolean func_562_c(Minecraft p_562_1_, int p_562_2_, int p_562_3_)
    {
        return field_937_g && field_936_h && p_562_2_ >= field_941_c && p_562_3_ >= field_940_d && p_562_2_ < field_941_c + field_52008_a && p_562_3_ < field_940_d + field_52007_b;
    }
}
