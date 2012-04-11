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

public class GuiDetailSettingsOF extends GuiScreen
{

    private GuiScreen prevScreen;
    protected String title;
    private GameSettings settings;
    private static EnumOptions enumOptions[];
    private int lastMouseX;
    private int lastMouseY;
    private long mouseStillTime;

    public GuiDetailSettingsOF(GuiScreen guiscreen, GameSettings gamesettings)
    {
        lastMouseX = 0;
        lastMouseY = 0;
        mouseStillTime = 0L;
        title = "Detail Settings";
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
        if(s.equals("Clouds"))
        {
            return (new String[] {
                "Clouds", "  Default - as set by setting Graphics", "  Fast - lower quality, faster", "  Fancy - higher quality, slower", "  OFF - no clouds, fastest", "Fast clouds are rendered 2D.", "Fancy clouds are rendered 3D."
            });
        }
        if(s.equals("Cloud Height"))
        {
            return (new String[] {
                "Cloud Height", "  OFF - default height", "  100% - above world height limit"
            });
        }
        if(s.equals("Trees"))
        {
            return (new String[] {
                "Trees", "  Default - as set by setting Graphics", "  Fast - lower quality, faster", "  Fancy - higher quality, slower", "Fast trees have opaque leaves.", "Fancy trees have transparent leaves."
            });
        }
        if(s.equals("Grass"))
        {
            return (new String[] {
                "Grass", "  Default - as set by setting Graphics", "  Fast - lower quality, faster", "  Fancy - higher quality, slower", "Fast grass uses default side texture.", "Fancy grass uses biome side texture."
            });
        }
        if(s.equals("Water"))
        {
            return (new String[] {
                "Water", "  Default - as set by setting Graphics", "  Fast  - lower quality, faster", "  Fancy - higher quality, slower", "Fast water (1 pass) has some visual artifacts", "Fancy water (2 pass) has no visual artifacts"
            });
        }
        if(s.equals("Rain & Snow"))
        {
            return (new String[] {
                "Rain & Snow", "  Default - as set by setting Graphics", "  Fast  - light rain/snow, faster", "  Fancy - heavy rain/snow, slower", "  OFF - no rain/snow, fastest", "When rain is OFF the splashes and rain sounds", "are still active."
            });
        }
        if(s.equals("Sky"))
        {
            return (new String[] {
                "Sky", "  ON - sky is visible, slower", "  OFF  - sky is not visible, faster", "When sky is OFF the moon and sun are still visible."
            });
        }
        if(s.equals("Stars"))
        {
            return (new String[] {
                "Stars", "  ON - stars are visible, slower", "  OFF  - stars are not visible, faster"
            });
        }
        if(s.equals("Depth Fog"))
        {
            return (new String[] {
                "Depth Fog", "  ON - fog moves closer at bedrock levels (default)", "  OFF - same fog at all levels"
            });
        }
        if(s.equals("Show Capes"))
        {
            return (new String[] {
                "Show Capes", "  ON - show player capes (default)", "  OFF - do not show player capes"
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
            EnumOptions.CLOUDS, EnumOptions.CLOUD_HEIGHT, EnumOptions.TREES, EnumOptions.GRASS, EnumOptions.WATER, EnumOptions.RAIN, EnumOptions.SKY, EnumOptions.STARS, EnumOptions.SUN_MOON, EnumOptions.SHOW_CAPES, 
            EnumOptions.DEPTH_FOG
        });
    }
}
