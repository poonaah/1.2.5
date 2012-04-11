// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, StringTranslate, GuiSmallButton, GuiButton, 
//            GuiMainMenu

public class GuiMemoryErrorScreen extends GuiScreen
{

    public GuiMemoryErrorScreen()
    {
    }

    public void func_570_g()
    {
    }

    public void func_6448_a()
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        field_949_e.clear();
        field_949_e.add(new GuiSmallButton(0, field_951_c / 2 - 155, field_950_d / 4 + 120 + 12, stringtranslate.func_20163_a("gui.toMenu")));
        field_949_e.add(new GuiSmallButton(1, (field_951_c / 2 - 155) + 160, field_950_d / 4 + 120 + 12, stringtranslate.func_20163_a("menu.quit")));
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(p_572_1_.field_938_f == 0)
        {
            field_945_b.func_6272_a(new GuiMainMenu());
        } else
        if(p_572_1_.field_938_f == 1)
        {
            field_945_b.func_6244_d();
        }
    }

    protected void func_580_a(char c, int i)
    {
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        func_578_i();
        func_548_a(field_6451_g, "Out of memory!", field_951_c / 2, (field_950_d / 4 - 60) + 20, 0xffffff);
        func_547_b(field_6451_g, "Minecraft has run out of memory.", field_951_c / 2 - 140, (field_950_d / 4 - 60) + 60 + 0, 0xa0a0a0);
        func_547_b(field_6451_g, "This could be caused by a bug in the game or by the", field_951_c / 2 - 140, (field_950_d / 4 - 60) + 60 + 18, 0xa0a0a0);
        func_547_b(field_6451_g, "Java Virtual Machine not being allocated enough", field_951_c / 2 - 140, (field_950_d / 4 - 60) + 60 + 27, 0xa0a0a0);
        func_547_b(field_6451_g, "memory. If you are playing in a web browser, try", field_951_c / 2 - 140, (field_950_d / 4 - 60) + 60 + 36, 0xa0a0a0);
        func_547_b(field_6451_g, "downloading the game and playing it offline.", field_951_c / 2 - 140, (field_950_d / 4 - 60) + 60 + 45, 0xa0a0a0);
        func_547_b(field_6451_g, "To prevent level corruption, the current game has quit.", field_951_c / 2 - 140, (field_950_d / 4 - 60) + 60 + 63, 0xa0a0a0);
        func_547_b(field_6451_g, "We've tried to free up enough memory to let you go back to", field_951_c / 2 - 140, (field_950_d / 4 - 60) + 60 + 81, 0xa0a0a0);
        func_547_b(field_6451_g, "the main menu and back to playing, but this may not have worked.", field_951_c / 2 - 140, (field_950_d / 4 - 60) + 60 + 90, 0xa0a0a0);
        func_547_b(field_6451_g, "Please restart the game if you see this message again.", field_951_c / 2 - 140, (field_950_d / 4 - 60) + 60 + 99, 0xa0a0a0);
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }
}
