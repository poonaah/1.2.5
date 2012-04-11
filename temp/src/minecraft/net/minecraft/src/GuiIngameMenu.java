// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, GuiButton, StatCollector, GuiOptions, 
//            StatList, StatFileWriter, World, GuiMainMenu, 
//            GuiAchievements, GuiStats, MathHelper

public class GuiIngameMenu extends GuiScreen
{

    private int field_966_a;
    private int field_967_h;

    public GuiIngameMenu()
    {
        field_966_a = 0;
        field_967_h = 0;
    }

    public void func_6448_a()
    {
        field_966_a = 0;
        field_949_e.clear();
        byte byte0 = -16;
        field_949_e.add(new GuiButton(1, field_951_c / 2 - 100, field_950_d / 4 + 120 + byte0, StatCollector.func_25200_a("menu.returnToMenu")));
        if(field_945_b.func_6260_j())
        {
            ((GuiButton)field_949_e.get(0)).field_939_e = StatCollector.func_25200_a("menu.disconnect");
        }
        field_949_e.add(new GuiButton(4, field_951_c / 2 - 100, field_950_d / 4 + 24 + byte0, StatCollector.func_25200_a("menu.returnToGame")));
        field_949_e.add(new GuiButton(0, field_951_c / 2 - 100, field_950_d / 4 + 96 + byte0, StatCollector.func_25200_a("menu.options")));
        field_949_e.add(new GuiButton(5, field_951_c / 2 - 100, field_950_d / 4 + 48 + byte0, 98, 20, StatCollector.func_25200_a("gui.achievements")));
        field_949_e.add(new GuiButton(6, field_951_c / 2 + 2, field_950_d / 4 + 48 + byte0, 98, 20, StatCollector.func_25200_a("gui.stats")));
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        switch(p_572_1_.field_938_f)
        {
        case 2: // '\002'
        case 3: // '\003'
        default:
            break;

        case 0: // '\0'
            field_945_b.func_6272_a(new GuiOptions(this, field_945_b.field_6304_y));
            break;

        case 1: // '\001'
            field_945_b.field_25001_G.func_25100_a(StatList.field_25180_i, 1);
            if(field_945_b.func_6260_j())
            {
                field_945_b.field_6324_e.func_660_k();
            }
            field_945_b.func_6261_a(null);
            field_945_b.func_6272_a(new GuiMainMenu());
            break;

        case 4: // '\004'
            field_945_b.func_6272_a(null);
            field_945_b.func_6259_e();
            break;

        case 5: // '\005'
            field_945_b.func_6272_a(new GuiAchievements(field_945_b.field_25001_G));
            break;

        case 6: // '\006'
            field_945_b.func_6272_a(new GuiStats(this, field_945_b.field_25001_G));
            break;
        }
    }

    public void func_570_g()
    {
        super.func_570_g();
        field_967_h++;
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        func_578_i();
        boolean flag = !field_945_b.field_6324_e.func_650_a(field_966_a++);
        if(flag || field_967_h < 20)
        {
            float f = ((float)(field_967_h % 10) + p_571_3_) / 10F;
            f = MathHelper.func_1106_a(f * 3.141593F * 2.0F) * 0.2F + 0.8F;
            int i = (int)(255F * f);
            func_547_b(field_6451_g, "Saving level..", 8, field_950_d - 16, i << 16 | i << 8 | i);
        }
        func_548_a(field_6451_g, "Game menu", field_951_c / 2, 40, 0xffffff);
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }
}
