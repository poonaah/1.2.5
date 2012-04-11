// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, GuiTextField, StringTranslate, GuiButton, 
//            ISaveFormat, WorldInfo

public class GuiRenameWorld extends GuiScreen
{

    private GuiScreen field_22112_a;
    private GuiTextField field_22114_h;
    private final String field_22113_i;

    public GuiRenameWorld(GuiScreen p_i756_1_, String p_i756_2_)
    {
        field_22112_a = p_i756_1_;
        field_22113_i = p_i756_2_;
    }

    public void func_570_g()
    {
        field_22114_h.func_22070_b();
    }

    public void func_6448_a()
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        Keyboard.enableRepeatEvents(true);
        field_949_e.clear();
        field_949_e.add(new GuiButton(0, field_951_c / 2 - 100, field_950_d / 4 + 96 + 12, stringtranslate.func_20163_a("selectWorld.renameButton")));
        field_949_e.add(new GuiButton(1, field_951_c / 2 - 100, field_950_d / 4 + 120 + 12, stringtranslate.func_20163_a("gui.cancel")));
        ISaveFormat isaveformat = field_945_b.func_22004_c();
        WorldInfo worldinfo = isaveformat.func_22173_b(field_22113_i);
        String s = worldinfo.func_22302_j();
        field_22114_h = new GuiTextField(field_6451_g, field_951_c / 2 - 100, 60, 200, 20);
        field_22114_h.func_50033_b(true);
        field_22114_h.func_22068_a(s);
    }

    public void func_6449_h()
    {
        Keyboard.enableRepeatEvents(false);
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(!p_572_1_.field_937_g)
        {
            return;
        }
        if(p_572_1_.field_938_f == 1)
        {
            field_945_b.func_6272_a(field_22112_a);
        } else
        if(p_572_1_.field_938_f == 0)
        {
            ISaveFormat isaveformat = field_945_b.func_22004_c();
            isaveformat.func_22170_a(field_22113_i, field_22114_h.func_22071_a().trim());
            field_945_b.func_6272_a(field_22112_a);
        }
    }

    protected void func_580_a(char p_580_1_, int p_580_2_)
    {
        field_22114_h.func_50037_a(p_580_1_, p_580_2_);
        ((GuiButton)field_949_e.get(0)).field_937_g = field_22114_h.func_22071_a().trim().length() > 0;
        if(p_580_1_ == '\r')
        {
            func_572_a((GuiButton)field_949_e.get(0));
        }
    }

    protected void func_565_a(int p_565_1_, int p_565_2_, int p_565_3_)
    {
        super.func_565_a(p_565_1_, p_565_2_, p_565_3_);
        field_22114_h.func_22069_a(p_565_1_, p_565_2_, p_565_3_);
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        func_578_i();
        func_548_a(field_6451_g, stringtranslate.func_20163_a("selectWorld.renameTitle"), field_951_c / 2, (field_950_d / 4 - 60) + 20, 0xffffff);
        func_547_b(field_6451_g, stringtranslate.func_20163_a("selectWorld.enterName"), field_951_c / 2 - 100, 47, 0xa0a0a0);
        field_22114_h.func_22067_c();
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }
}
