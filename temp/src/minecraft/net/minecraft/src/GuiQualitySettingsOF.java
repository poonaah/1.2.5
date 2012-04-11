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

public class GuiQualitySettingsOF extends GuiScreen
{

    private GuiScreen prevScreen;
    protected String title;
    private GameSettings settings;
    private static EnumOptions enumOptions[];
    private int lastMouseX;
    private int lastMouseY;
    private long mouseStillTime;

    public GuiQualitySettingsOF(GuiScreen guiscreen, GameSettings gamesettings)
    {
        lastMouseX = 0;
        lastMouseY = 0;
        mouseStillTime = 0L;
        title = "Quality Settings";
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
        if(s.equals("Mipmap Level"))
        {
            return (new String[] {
                "Visual effect which makes distant objects look better", "by smoothing the texture details", "  OFF - no smoothing", "  1 - minimum smoothing", "  4 - maximum smoothing", "This option usually does not affect the performance."
            });
        }
        if(s.equals("Mipmap Type"))
        {
            return (new String[] {
                "Visual effect which makes distant objects look better", "by smoothing the texture details", "  Nearest - rough smoothing", "  Linear - fine smoothing", "This option usually does not affect the performance."
            });
        }
        if(s.equals("Clear Water"))
        {
            return (new String[] {
                "Clear Water", "  ON - clear, transparent water", "  OFF - default water"
            });
        }
        if(s.equals("Better Grass"))
        {
            return (new String[] {
                "Better Grass", "  OFF - default side grass texture, fastest", "  Fast - full side grass texture, slower", "  Fancy - dynamic side grass texture, slowest"
            });
        }
        if(s.equals("Better Snow"))
        {
            return (new String[] {
                "Better Snow", "  OFF - default snow, faster", "  ON - better snow, slower", "Shows snow under transparent blocks (fence, tall grass)", "when bordering with snow blocks"
            });
        }
        if(s.equals("Random Mobs"))
        {
            return (new String[] {
                "Random Mobs", "  OFF - no random mobs, faster", "  ON - random mobs, slower", "Random mobs uses random textures for the game creatures.", "It needs a texture pack which has multiple mob textures."
            });
        }
        if(s.equals("Swamp Colors"))
        {
            return (new String[] {
                "Swamp Colors", "  ON - use swamp colors (default), slower", "  OFF - do not use swamp colors, faster", "The swamp colors affect grass, leaves, vines and water."
            });
        }
        if(s.equals("Smooth Biomes"))
        {
            return (new String[] {
                "Smooth Biomes", "  ON - smoothing of biome borders (default), slower", "  OFF - no smoothing of biome borders, faster", "The smoothing of biome borders is done by sampling and", "averaging the color of all surounding blocks.", "Affected are grass, leaves, vines and water."
            });
        }
        if(s.equals("Custom Fonts"))
        {
            return (new String[] {
                "Custom Fonts", "  ON - uses custom fonts (default), slower", "  OFF - uses default font, faster", "The custom fonts are supplied by the current", "texture pack"
            });
        }
        if(s.equals("Custom Colors"))
        {
            return (new String[] {
                "Custom Colors", "  ON - uses custom colors (default), slower", "  OFF - uses default colors, faster", "The custom colors are supplied by the current", "texture pack"
            });
        }
        if(s.equals("Show Capes"))
        {
            return (new String[] {
                "Show Capes", "  ON - show player capes (default)", "  OFF - do not show player capes"
            });
        }
        if(s.equals("Connected Textures"))
        {
            return (new String[] {
                "Connected Textures", "  OFF - no connected textures (default)", "  Fast - fast connected textures", "  Fancy - fancy connected textures", "Connected textures joins the textures of glass,", "sandstone and bookshelves when placed next to", "each other. The connected textures are supplied", "by the current texture pack"
            });
        }
        if(s.equals("Far View"))
        {
            return (new String[] {
                "Far View", " OFF - (default) standard view distance", " ON - 3x view distance", "Far View is very resource demanding!", "3x view distance => 9x chunks to be loaded => FPS / 9", "Standard view distances: 32, 64, 128, 256", "Far view distances: 96, 192, 384, 512"
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
            EnumOptions.MIPMAP_LEVEL, EnumOptions.MIPMAP_TYPE, EnumOptions.CLEAR_WATER, EnumOptions.RANDOM_MOBS, EnumOptions.BETTER_GRASS, EnumOptions.BETTER_SNOW, EnumOptions.CUSTOM_FONTS, EnumOptions.CUSTOM_COLORS, EnumOptions.SWAMP_COLORS, EnumOptions.SMOOTH_BIOMES, 
            EnumOptions.CONNECTED_TEXTURES
        });
    }
}
