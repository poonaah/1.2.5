// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, StringTranslate, EnumOptions, GuiSmallButton, 
//            GameSettings, World, WorldInfo, StatCollector, 
//            GuiSlider, GuiButton, GuiVideoSettings, GuiControls, 
//            GuiLanguage

public class GuiOptions extends GuiScreen
{

    private GuiScreen field_996_h;
    protected String field_994_a;
    private GameSettings field_995_i;
    private static EnumOptions field_22135_k[];

    public GuiOptions(GuiScreen p_i260_1_, GameSettings p_i260_2_)
    {
        field_994_a = "Options";
        field_996_h = p_i260_1_;
        field_995_i = p_i260_2_;
    }

    public void func_6448_a()
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        field_994_a = stringtranslate.func_20163_a("options.title");
        int i = 0;
        EnumOptions aenumoptions[] = field_22135_k;
        int j = aenumoptions.length;
        for(int k = 0; k < j; k++)
        {
            EnumOptions enumoptions = aenumoptions[k];
            if(!enumoptions.func_20136_a())
            {
                GuiSmallButton guismallbutton = new GuiSmallButton(enumoptions.func_20135_c(), (field_951_c / 2 - 155) + (i % 2) * 160, field_950_d / 6 + 24 * (i >> 1), enumoptions, field_995_i.func_1043_a(enumoptions));
                if(enumoptions == EnumOptions.DIFFICULTY && field_945_b.field_6324_e != null && field_945_b.field_6324_e.func_22144_v().func_40724_s())
                {
                    guismallbutton.field_937_g = false;
                    guismallbutton.field_939_e = (new StringBuilder()).append(StatCollector.func_25200_a("options.difficulty")).append(": ").append(StatCollector.func_25200_a("options.difficulty.hardcore")).toString();
                }
                field_949_e.add(guismallbutton);
            } else
            {
                field_949_e.add(new GuiSlider(enumoptions.func_20135_c(), (field_951_c / 2 - 155) + (i % 2) * 160, field_950_d / 6 + 24 * (i >> 1), enumoptions, field_995_i.func_1043_a(enumoptions), field_995_i.func_20104_a(enumoptions)));
            }
            i++;
        }

        field_949_e.add(new GuiButton(101, field_951_c / 2 - 100, (field_950_d / 6 + 96) - 6, stringtranslate.func_20163_a("options.video")));
        field_949_e.add(new GuiButton(100, field_951_c / 2 - 100, (field_950_d / 6 + 120) - 6, stringtranslate.func_20163_a("options.controls")));
        field_949_e.add(new GuiButton(102, field_951_c / 2 - 100, (field_950_d / 6 + 144) - 6, stringtranslate.func_20163_a("options.language")));
        field_949_e.add(new GuiButton(200, field_951_c / 2 - 100, field_950_d / 6 + 168, stringtranslate.func_20163_a("gui.done")));
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(!p_572_1_.field_937_g)
        {
            return;
        }
        if(p_572_1_.field_938_f < 100 && (p_572_1_ instanceof GuiSmallButton))
        {
            field_995_i.func_1045_b(((GuiSmallButton)p_572_1_).func_20078_a(), 1);
            p_572_1_.field_939_e = field_995_i.func_1043_a(EnumOptions.func_20137_a(p_572_1_.field_938_f));
        }
        if(p_572_1_.field_938_f == 101)
        {
            field_945_b.field_6304_y.func_1041_b();
            field_945_b.func_6272_a(new GuiVideoSettings(this, field_995_i));
        }
        if(p_572_1_.field_938_f == 100)
        {
            field_945_b.field_6304_y.func_1041_b();
            field_945_b.func_6272_a(new GuiControls(this, field_995_i));
        }
        if(p_572_1_.field_938_f == 102)
        {
            field_945_b.field_6304_y.func_1041_b();
            field_945_b.func_6272_a(new GuiLanguage(this, field_995_i));
        }
        if(p_572_1_.field_938_f == 200)
        {
            field_945_b.field_6304_y.func_1041_b();
            field_945_b.func_6272_a(field_996_h);
        }
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        func_578_i();
        func_548_a(field_6451_g, field_994_a, field_951_c / 2, 20, 0xffffff);
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }

    static 
    {
        field_22135_k = (new EnumOptions[] {
            EnumOptions.MUSIC, EnumOptions.SOUND, EnumOptions.INVERT_MOUSE, EnumOptions.SENSITIVITY, EnumOptions.FOV, EnumOptions.DIFFICULTY
        });
    }
}
