// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, StringTranslate, EnumOptions, GuiSmallButton, 
//            GameSettings, GuiSlider, GuiButton, ScaledResolution, 
//            FontRenderer

public class GuiOtherSettingsOF extends GuiScreen
{

    private GuiScreen prevScreen;
    protected String title;
    private GameSettings settings;
    private static EnumOptions enumOptions[];
    private int lastMouseX;
    private int lastMouseY;
    private long mouseStillTime;

    public GuiOtherSettingsOF(GuiScreen guiscreen, GameSettings gamesettings)
    {
        lastMouseX = 0;
        lastMouseY = 0;
        mouseStillTime = 0L;
        title = "Other Settings";
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
        if(Math.abs(i - lastMouseX) > 5 || Math.abs(j - lastMouseY) > 5)
        {
            lastMouseX = i;
            lastMouseY = j;
            mouseStillTime = System.currentTimeMillis();
            return;
        }
        int k = 700;
        if(System.currentTimeMillis() < mouseStillTime + (long)k)
        {
            return;
        }
        int l = field_951_c / 2 - 150;
        int i1 = field_950_d / 6 - 5;
        if(j <= i1 + 98)
        {
            i1 += 105;
        }
        int j1 = l + 150 + 150;
        int k1 = i1 + 84 + 10;
        GuiButton guibutton = getSelectedButton(i, j);
        if(guibutton != null)
        {
            String s = getButtonName(guibutton.field_939_e);
            String as[] = getTooltipLines(s);
            if(as == null)
            {
                return;
            }
            func_549_a(l, i1, j1, k1, 0xe0000000, 0xe0000000);
            for(int l1 = 0; l1 < as.length; l1++)
            {
                String s1 = as[l1];
                field_6451_g.func_50103_a(s1, l + 5, i1 + 5 + l1 * 11, 0xdddddd);
            }

        }
    }

    private String[] getTooltipLines(String s)
    {
        if(s.equals("Autosave"))
        {
            return (new String[] {
                "Autosave interval", "Default autosave interval (2s) is NOT RECOMMENDED.", "Autosave causes the famous Lag Spike of Death."
            });
        }
        if(s.equals("Fast Debug Info"))
        {
            return (new String[] {
                "Fast Debug Info", " OFF - default debug info screen, slower", " ON - debug info screen without lagometer, faster", "Removes the lagometer from the debug screen (F3)."
            });
        }
        if(s.equals("Debug Profiler"))
        {
            return (new String[] {
                "Debug Profiler", "  ON - debug profiler is active, slower", "  OFF - debug profiler is not active, faster", "The debug profiler collects and shows debug information", "when the debug screen is open"
            });
        }
        if(s.equals("Time"))
        {
            return (new String[] {
                "Time", " Default - normal day/night cycles", " Day Only - day only", " Night Only - night only", "The time setting is only effective in CREATIVE mode."
            });
        }
        if(s.equals("Weather"))
        {
            return (new String[] {
                "Weather", "  ON - weather is active, slower", "  OFF - weather is not active, faster", "The weather controls rain, snow and thunderstorms."
            });
        }
        if(s.equals("Fullscreen"))
        {
            return (new String[] {
                "Fullscreen resolution", "  Default - use desktop screen resolution, slower", "  WxH - use custom screen resolution, may be faster", "The selected resolution is used in fullscreen mode (F11)."
            });
        } else
        {
            return null;
        }
    }

    private String getButtonName(String s)
    {
        int i = s.indexOf(':');
        if(i < 0)
        {
            return s;
        } else
        {
            return s.substring(0, i);
        }
    }

    private GuiButton getSelectedButton(int i, int j)
    {
        for(int k = 0; k < field_949_e.size(); k++)
        {
            GuiButton guibutton = (GuiButton)field_949_e.get(k);
            boolean flag = i >= guibutton.field_941_c && j >= guibutton.field_940_d && i < guibutton.field_941_c + guibutton.field_52008_a && j < guibutton.field_940_d + guibutton.field_52007_b;
            if(flag)
            {
                return guibutton;
            }
        }

        return null;
    }

    static 
    {
        enumOptions = (new EnumOptions[] {
            EnumOptions.FAST_DEBUG_INFO, EnumOptions.PROFILER, EnumOptions.WEATHER, EnumOptions.TIME, EnumOptions.FULLSCREEN_MODE, EnumOptions.AUTOSAVE_TICKS
        });
    }
}
