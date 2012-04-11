// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, GuiButton, GuiMainMenu

public class GuiConflictWarning extends GuiScreen
{

    private int field_965_a;

    public GuiConflictWarning()
    {
        field_965_a = 0;
    }

    public void func_570_g()
    {
        field_965_a++;
    }

    public void func_6448_a()
    {
        field_949_e.clear();
        field_949_e.add(new GuiButton(0, field_951_c / 2 - 100, field_950_d / 4 + 120 + 12, "Back to title screen"));
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(!p_572_1_.field_937_g)
        {
            return;
        }
        if(p_572_1_.field_938_f == 0)
        {
            field_945_b.func_6272_a(new GuiMainMenu());
        }
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        func_578_i();
        func_548_a(field_6451_g, "Level save conflict", field_951_c / 2, (field_950_d / 4 - 60) + 20, 0xffffff);
        func_547_b(field_6451_g, "Minecraft detected a conflict in the level save data.", field_951_c / 2 - 140, (field_950_d / 4 - 60) + 60 + 0, 0xa0a0a0);
        func_547_b(field_6451_g, "This could be caused by two copies of the game", field_951_c / 2 - 140, (field_950_d / 4 - 60) + 60 + 18, 0xa0a0a0);
        func_547_b(field_6451_g, "accessing the same level.", field_951_c / 2 - 140, (field_950_d / 4 - 60) + 60 + 27, 0xa0a0a0);
        func_547_b(field_6451_g, "To prevent level corruption, the current game has quit.", field_951_c / 2 - 140, (field_950_d / 4 - 60) + 60 + 45, 0xa0a0a0);
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }
}
