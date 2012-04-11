// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, World, WorldInfo, GuiButton, 
//            StatCollector, ISaveHandler, ISaveFormat, GuiMainMenu, 
//            EntityPlayerSP

public class GuiGameOver extends GuiScreen
{

    private int field_48154_a;

    public GuiGameOver()
    {
    }

    public void func_6448_a()
    {
        field_949_e.clear();
        if(field_945_b.field_6324_e.func_22144_v().func_40724_s())
        {
            field_949_e.add(new GuiButton(1, field_951_c / 2 - 100, field_950_d / 4 + 96, StatCollector.func_25200_a("deathScreen.deleteWorld")));
        } else
        {
            field_949_e.add(new GuiButton(1, field_951_c / 2 - 100, field_950_d / 4 + 72, StatCollector.func_25200_a("deathScreen.respawn")));
            field_949_e.add(new GuiButton(2, field_951_c / 2 - 100, field_950_d / 4 + 96, StatCollector.func_25200_a("deathScreen.titleScreen")));
            if(field_945_b.field_6320_i == null)
            {
                ((GuiButton)field_949_e.get(1)).field_937_g = false;
            }
        }
        for(Iterator iterator = field_949_e.iterator(); iterator.hasNext();)
        {
            GuiButton guibutton = (GuiButton)iterator.next();
            guibutton.field_937_g = false;
        }

    }

    protected void func_580_a(char c, int i)
    {
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        switch(p_572_1_.field_938_f)
        {
        default:
            break;

        case 1: // '\001'
            if(field_945_b.field_6324_e.func_22144_v().func_40724_s())
            {
                String s = field_945_b.field_6324_e.func_40479_y().func_40530_d();
                field_945_b.func_40002_b("Deleting world");
                ISaveFormat isaveformat = field_945_b.func_22004_c();
                isaveformat.func_22177_c();
                isaveformat.func_22172_c(s);
                field_945_b.func_6272_a(new GuiMainMenu());
            } else
            {
                field_945_b.field_6322_g.func_9367_r();
                field_945_b.func_6272_a(null);
            }
            break;

        case 2: // '\002'
            if(field_945_b.func_6260_j())
            {
                field_945_b.field_6324_e.func_660_k();
            }
            field_945_b.func_6261_a(null);
            field_945_b.func_6272_a(new GuiMainMenu());
            break;
        }
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        func_549_a(0, 0, field_951_c, field_950_d, 0x60500000, 0xa0803030);
        GL11.glPushMatrix();
        GL11.glScalef(2.0F, 2.0F, 2.0F);
        boolean flag = field_945_b.field_6324_e.func_22144_v().func_40724_s();
        String s = flag ? StatCollector.func_25200_a("deathScreen.title.hardcore") : StatCollector.func_25200_a("deathScreen.title");
        func_548_a(field_6451_g, s, field_951_c / 2 / 2, 30, 0xffffff);
        GL11.glPopMatrix();
        if(flag)
        {
            func_548_a(field_6451_g, StatCollector.func_25200_a("deathScreen.hardcoreInfo"), field_951_c / 2, 144, 0xffffff);
        }
        func_548_a(field_6451_g, (new StringBuilder()).append(StatCollector.func_25200_a("deathScreen.score")).append(": \247e").append(field_945_b.field_6322_g.func_6417_t()).toString(), field_951_c / 2, 100, 0xffffff);
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }

    public boolean func_6450_b()
    {
        return false;
    }

    public void func_570_g()
    {
        super.func_570_g();
        field_48154_a++;
        if(field_48154_a == 20)
        {
            for(Iterator iterator = field_949_e.iterator(); iterator.hasNext();)
            {
                GuiButton guibutton = (GuiButton)iterator.next();
                guibutton.field_937_g = true;
            }

        }
    }
}
