// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.Sys;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, StringTranslate, GuiSmallButton, TexturePackList, 
//            GuiTexturePackSlot, GuiButton, RenderEngine, FontRenderer

public class GuiTexturePacks extends GuiScreen
{

    protected GuiScreen field_6461_a;
    private int field_6454_o;
    private String field_6453_p;
    private GuiTexturePackSlot field_22128_k;

    public GuiTexturePacks(GuiScreen p_i304_1_)
    {
        field_6454_o = -1;
        field_6453_p = "";
        field_6461_a = p_i304_1_;
    }

    public void func_6448_a()
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        field_949_e.add(new GuiSmallButton(5, field_951_c / 2 - 154, field_950_d - 48, stringtranslate.func_20163_a("texturePack.openFolder")));
        field_949_e.add(new GuiSmallButton(6, field_951_c / 2 + 4, field_950_d - 48, stringtranslate.func_20163_a("gui.done")));
        field_945_b.field_6298_C.func_6532_a();
        field_6453_p = (new File(Minecraft.func_6240_b(), "texturepacks")).getAbsolutePath();
        field_22128_k = new GuiTexturePackSlot(this);
        field_22128_k.func_22240_a(field_949_e, 7, 8);
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(!p_572_1_.field_937_g)
        {
            return;
        }
        if(p_572_1_.field_938_f == 5)
        {
            boolean flag = false;
            try
            {
                Class class1 = Class.forName("java.awt.Desktop");
                Object obj = class1.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                class1.getMethod("browse", new Class[] {
                    java.net.URI.class
                }).invoke(obj, new Object[] {
                    (new File(Minecraft.func_6240_b(), "texturepacks")).toURI()
                });
            }
            catch(Throwable throwable)
            {
                throwable.printStackTrace();
                flag = true;
            }
            if(flag)
            {
                System.out.println("Opening via Sys class!");
                Sys.openURL((new StringBuilder()).append("file://").append(field_6453_p).toString());
            }
        } else
        if(p_572_1_.field_938_f == 6)
        {
            field_945_b.field_6315_n.func_1065_b();
            field_945_b.func_6272_a(field_6461_a);
        } else
        {
            field_22128_k.func_22241_a(p_572_1_);
        }
    }

    protected void func_565_a(int p_565_1_, int p_565_2_, int p_565_3_)
    {
        super.func_565_a(p_565_1_, p_565_2_, p_565_3_);
    }

    protected void func_573_b(int p_573_1_, int p_573_2_, int p_573_3_)
    {
        super.func_573_b(p_573_1_, p_573_2_, p_573_3_);
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        field_22128_k.func_22243_a(p_571_1_, p_571_2_, p_571_3_);
        if(field_6454_o <= 0)
        {
            field_945_b.field_6298_C.func_6532_a();
            field_6454_o += 20;
        }
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        func_548_a(field_6451_g, stringtranslate.func_20163_a("texturePack.title"), field_951_c / 2, 16, 0xffffff);
        func_548_a(field_6451_g, stringtranslate.func_20163_a("texturePack.folderInfo"), field_951_c / 2 - 77, field_950_d - 26, 0x808080);
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }

    public void func_570_g()
    {
        super.func_570_g();
        field_6454_o--;
    }

    static Minecraft func_22124_a(GuiTexturePacks p_22124_0_)
    {
        return p_22124_0_.field_945_b;
    }

    static Minecraft func_22126_b(GuiTexturePacks p_22126_0_)
    {
        return p_22126_0_.field_945_b;
    }

    static Minecraft func_22119_c(GuiTexturePacks p_22119_0_)
    {
        return p_22119_0_.field_945_b;
    }

    static Minecraft func_22122_d(GuiTexturePacks p_22122_0_)
    {
        return p_22122_0_.field_945_b;
    }

    static Minecraft func_22117_e(GuiTexturePacks p_22117_0_)
    {
        return p_22117_0_.field_945_b;
    }

    static Minecraft func_35307_f(GuiTexturePacks p_35307_0_)
    {
        return p_35307_0_.field_945_b;
    }

    static Minecraft func_35308_g(GuiTexturePacks p_35308_0_)
    {
        return p_35308_0_.field_945_b;
    }

    static Minecraft func_22118_f(GuiTexturePacks p_22118_0_)
    {
        return p_22118_0_.field_945_b;
    }

    static Minecraft func_22116_g(GuiTexturePacks p_22116_0_)
    {
        return p_22116_0_.field_945_b;
    }

    static Minecraft func_22121_h(GuiTexturePacks p_22121_0_)
    {
        return p_22121_0_.field_945_b;
    }

    static Minecraft func_22123_i(GuiTexturePacks p_22123_0_)
    {
        return p_22123_0_.field_945_b;
    }

    static FontRenderer func_22127_j(GuiTexturePacks p_22127_0_)
    {
        return p_22127_0_.field_6451_g;
    }

    static FontRenderer func_22120_k(GuiTexturePacks p_22120_0_)
    {
        return p_22120_0_.field_6451_g;
    }

    static FontRenderer func_22125_l(GuiTexturePacks p_22125_0_)
    {
        return p_22125_0_.field_6451_g;
    }
}
