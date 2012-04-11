// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, StringTranslate, EnumOptions, GuiSmallButton, 
//            GameSettings, GuiSlider, GuiButton, ScaledResolution

public class GuiAnimationSettingsOF extends GuiScreen
{

    private GuiScreen prevScreen;
    protected String title;
    private GameSettings settings;
    private static EnumOptions enumOptions[];

    public GuiAnimationSettingsOF(GuiScreen guiscreen, GameSettings gamesettings)
    {
        title = "Animation Settings";
        prevScreen = guiscreen;
        settings = gamesettings;
    }

    public void func_6448_a()
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        int i = 0;
        EnumOptions aenumoptions[] = enumOptions;
        int j = aenumoptions.length;
        for(int k = 0; k < j; k++)
        {
            EnumOptions enumoptions = aenumoptions[k];
            int l = (field_951_c / 2 - 155) + (i % 2) * 160;
            int i1 = (field_950_d / 6 + 21 * (i / 2)) - 10;
            if(!enumoptions.func_20136_a())
            {
                field_949_e.add(new GuiSmallButton(enumoptions.func_20135_c(), l, i1, enumoptions, settings.func_1043_a(enumoptions)));
            } else
            {
                field_949_e.add(new GuiSlider(enumoptions.func_20135_c(), l, i1, enumoptions, settings.func_1043_a(enumoptions), settings.func_20104_a(enumoptions)));
            }
            i++;
        }

        field_949_e.add(new GuiButton(200, field_951_c / 2 - 100, field_950_d / 6 + 168 + 11, stringtranslate.func_20163_a("gui.done")));
    }

    protected void func_572_a(GuiButton guibutton)
    {
        if(!guibutton.field_937_g)
        {
            return;
        }
        if(guibutton.field_938_f < 100 && (guibutton instanceof GuiSmallButton))
        {
            settings.func_1045_b(((GuiSmallButton)guibutton).func_20078_a(), 1);
            guibutton.field_939_e = settings.func_1043_a(EnumOptions.func_20137_a(guibutton.field_938_f));
        }
        if(guibutton.field_938_f == 200)
        {
            field_945_b.field_6304_y.func_1041_b();
            field_945_b.func_6272_a(prevScreen);
        }
        if(guibutton.field_938_f != EnumOptions.CLOUD_HEIGHT.ordinal())
        {
            ScaledResolution scaledresolution = new ScaledResolution(field_945_b.field_6304_y, field_945_b.field_6326_c, field_945_b.field_6325_d);
            int i = scaledresolution.func_903_a();
            int j = scaledresolution.func_902_b();
            func_6447_a(field_945_b, i, j);
        }
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        func_548_a(field_6451_g, title, field_951_c / 2, 20, 0xffffff);
        super.func_571_a(i, j, f);
    }

    static 
    {
        enumOptions = (new EnumOptions[] {
            EnumOptions.ANIMATED_WATER, EnumOptions.ANIMATED_LAVA, EnumOptions.ANIMATED_FIRE, EnumOptions.ANIMATED_PORTAL, EnumOptions.ANIMATED_REDSTONE, EnumOptions.ANIMATED_EXPLOSION, EnumOptions.ANIMATED_FLAME, EnumOptions.ANIMATED_SMOKE, EnumOptions.VOID_PARTICLES, EnumOptions.WATER_PARTICLES, 
            EnumOptions.RAIN_SPLASH, EnumOptions.PORTAL_PARTICLES, EnumOptions.PARTICLES, EnumOptions.DRIPPING_WATER_LAVA, EnumOptions.ANIMATED_TERRAIN, EnumOptions.ANIMATED_ITEMS
        });
    }
}
