// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, StringTranslate, GameSettings, GuiSmallButton, 
//            GuiButton, KeyBinding

public class GuiControls extends GuiScreen
{

    private GuiScreen field_957_h;
    protected String field_954_a;
    private GameSettings field_956_i;
    private int field_955_j;

    public GuiControls(GuiScreen p_i507_1_, GameSettings p_i507_2_)
    {
        field_954_a = "Controls";
        field_955_j = -1;
        field_957_h = p_i507_1_;
        field_956_i = p_i507_2_;
    }

    private int func_20080_j()
    {
        return field_951_c / 2 - 155;
    }

    public void func_6448_a()
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        int i = func_20080_j();
        for(int j = 0; j < field_956_i.field_1564_t.length; j++)
        {
            field_949_e.add(new GuiSmallButton(j, i + (j % 2) * 160, field_950_d / 6 + 24 * (j >> 1), 70, 20, field_956_i.func_1047_d(j)));
        }

        field_949_e.add(new GuiButton(200, field_951_c / 2 - 100, field_950_d / 6 + 168, stringtranslate.func_20163_a("gui.done")));
        field_954_a = stringtranslate.func_20163_a("controls.title");
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        for(int i = 0; i < field_956_i.field_1564_t.length; i++)
        {
            ((GuiButton)field_949_e.get(i)).field_939_e = field_956_i.func_1047_d(i);
        }

        if(p_572_1_.field_938_f == 200)
        {
            field_945_b.func_6272_a(field_957_h);
        } else
        {
            field_955_j = p_572_1_.field_938_f;
            p_572_1_.field_939_e = (new StringBuilder()).append("> ").append(field_956_i.func_1047_d(p_572_1_.field_938_f)).append(" <").toString();
        }
    }

    protected void func_565_a(int p_565_1_, int p_565_2_, int p_565_3_)
    {
        if(field_955_j >= 0)
        {
            field_956_i.func_1042_a(field_955_j, -100 + p_565_3_);
            ((GuiButton)field_949_e.get(field_955_j)).field_939_e = field_956_i.func_1047_d(field_955_j);
            field_955_j = -1;
            KeyBinding.func_35961_b();
        } else
        {
            super.func_565_a(p_565_1_, p_565_2_, p_565_3_);
        }
    }

    protected void func_580_a(char p_580_1_, int p_580_2_)
    {
        if(field_955_j >= 0)
        {
            field_956_i.func_1042_a(field_955_j, p_580_2_);
            ((GuiButton)field_949_e.get(field_955_j)).field_939_e = field_956_i.func_1047_d(field_955_j);
            field_955_j = -1;
            KeyBinding.func_35961_b();
        } else
        {
            super.func_580_a(p_580_1_, p_580_2_);
        }
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        func_578_i();
        func_548_a(field_6451_g, field_954_a, field_951_c / 2, 20, 0xffffff);
        int i = func_20080_j();
        for(int j = 0; j < field_956_i.field_1564_t.length; j++)
        {
            boolean flag = false;
            int k = 0;
            do
            {
                if(k >= field_956_i.field_1564_t.length)
                {
                    break;
                }
                if(k != j && field_956_i.field_1564_t[j].field_1370_b == field_956_i.field_1564_t[k].field_1370_b)
                {
                    flag = true;
                    break;
                }
                k++;
            } while(true);
            k = j;
            if(field_955_j == j)
            {
                ((GuiButton)field_949_e.get(k)).field_939_e = "\247f> \247e??? \247f<";
            } else
            if(flag)
            {
                ((GuiButton)field_949_e.get(k)).field_939_e = (new StringBuilder()).append("\247c").append(field_956_i.func_1047_d(k)).toString();
            } else
            {
                ((GuiButton)field_949_e.get(k)).field_939_e = field_956_i.func_1047_d(k);
            }
            func_547_b(field_6451_g, field_956_i.func_20102_a(j), i + (j % 2) * 160 + 70 + 6, field_950_d / 6 + 24 * (j >> 1) + 7, -1);
        }

        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }
}
