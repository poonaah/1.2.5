// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, StringTranslate, EnumOptions, GuiSmallButton, 
//            GameSettings, GuiSlider, GuiButton, GuiDetailSettingsOF, 
//            GuiQualitySettingsOF, GuiAnimationSettingsOF, GuiPerformanceSettingsOF, GuiTexturePacks, 
//            GuiOtherSettingsOF, ScaledResolution, FontRenderer

public class GuiVideoSettings extends GuiScreen
{

    private GuiScreen field_22110_h;
    protected String field_22107_a;
    private GameSettings field_22109_i;
    private boolean field_40231_d;
    private static EnumOptions field_22108_k[];
    private int lastMouseX;
    private int lastMouseY;
    private long mouseStillTime;

    public GuiVideoSettings(GuiScreen p_i404_1_, GameSettings p_i404_2_)
    {
        lastMouseX = 0;
        lastMouseY = 0;
        mouseStillTime = 0L;
        field_22107_a = "Video Settings";
        field_40231_d = false;
        field_22110_h = p_i404_1_;
        field_22109_i = p_i404_2_;
    }

    public void func_6448_a()
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        field_22107_a = stringtranslate.func_20163_a("options.videoTitle");
        int i = 0;
        EnumOptions aenumoptions[] = field_22108_k;
        int j = aenumoptions.length;
        for(int k = 0; k < j; k++)
        {
            EnumOptions enumoptions = aenumoptions[k];
            int j1 = (field_951_c / 2 - 155) + (i % 2) * 160;
            int k1 = (field_950_d / 6 + 21 * (i / 2)) - 10;
            if(!enumoptions.func_20136_a())
            {
                field_949_e.add(new GuiSmallButton(enumoptions.func_20135_c(), j1, k1, enumoptions, field_22109_i.func_1043_a(enumoptions)));
            } else
            {
                field_949_e.add(new GuiSlider(enumoptions.func_20135_c(), j1, k1, enumoptions, field_22109_i.func_1043_a(enumoptions), field_22109_i.func_20104_a(enumoptions)));
            }
            i++;
        }

        int l = (field_950_d / 6 + 21 * (i / 2)) - 10;
        int i1 = 0;
        i1 = (field_951_c / 2 - 155) + 0;
        field_949_e.add(new GuiSmallButton(101, i1, l, "Details..."));
        i1 = (field_951_c / 2 - 155) + 160;
        field_949_e.add(new GuiSmallButton(102, i1, l, "Quality..."));
        l += 21;
        i1 = (field_951_c / 2 - 155) + 0;
        field_949_e.add(new GuiSmallButton(111, i1, l, "Animations..."));
        i1 = (field_951_c / 2 - 155) + 160;
        field_949_e.add(new GuiSmallButton(112, i1, l, "Performance..."));
        l += 21;
        i1 = (field_951_c / 2 - 155) + 0;
        field_949_e.add(new GuiSmallButton(121, i1, l, "Texture Packs..."));
        i1 = (field_951_c / 2 - 155) + 160;
        field_949_e.add(new GuiSmallButton(122, i1, l, "Other..."));
        field_949_e.add(new GuiButton(200, field_951_c / 2 - 100, field_950_d / 6 + 168 + 11, stringtranslate.func_20163_a("gui.done")));
        field_40231_d = false;
        String as[] = {
            "sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"
        };
        String as1[] = (String[])as;
        int l1 = as1.length;
        int i2 = 0;
        do
        {
            if(i2 >= l1)
            {
                break;
            }
            String s = as1[i2];
            String s1 = System.getProperty(s);
            if(s1 != null && s1.indexOf("64") >= 0)
            {
                field_40231_d = true;
                break;
            }
            i2++;
        } while(true);
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(!p_572_1_.field_937_g)
        {
            return;
        }
        int i = field_22109_i.field_25148_H;
        if(p_572_1_.field_938_f < 100 && (p_572_1_ instanceof GuiSmallButton))
        {
            field_22109_i.func_1045_b(((GuiSmallButton)p_572_1_).func_20078_a(), 1);
            p_572_1_.field_939_e = field_22109_i.func_1043_a(EnumOptions.func_20137_a(p_572_1_.field_938_f));
        }
        if(p_572_1_.field_938_f == 200)
        {
            field_945_b.field_6304_y.func_1041_b();
            field_945_b.func_6272_a(field_22110_h);
        }
        if(p_572_1_.field_938_f == 101)
        {
            field_945_b.field_6304_y.func_1041_b();
            GuiDetailSettingsOF guidetailsettingsof = new GuiDetailSettingsOF(this, field_22109_i);
            field_945_b.func_6272_a(guidetailsettingsof);
        }
        if(p_572_1_.field_938_f == 102)
        {
            field_945_b.field_6304_y.func_1041_b();
            GuiQualitySettingsOF guiqualitysettingsof = new GuiQualitySettingsOF(this, field_22109_i);
            field_945_b.func_6272_a(guiqualitysettingsof);
        }
        if(p_572_1_.field_938_f == 111)
        {
            field_945_b.field_6304_y.func_1041_b();
            GuiAnimationSettingsOF guianimationsettingsof = new GuiAnimationSettingsOF(this, field_22109_i);
            field_945_b.func_6272_a(guianimationsettingsof);
        }
        if(p_572_1_.field_938_f == 112)
        {
            field_945_b.field_6304_y.func_1041_b();
            GuiPerformanceSettingsOF guiperformancesettingsof = new GuiPerformanceSettingsOF(this, field_22109_i);
            field_945_b.func_6272_a(guiperformancesettingsof);
        }
        if(p_572_1_.field_938_f == 121)
        {
            field_945_b.field_6304_y.func_1041_b();
            GuiTexturePacks guitexturepacks = new GuiTexturePacks(this);
            field_945_b.func_6272_a(guitexturepacks);
        }
        if(p_572_1_.field_938_f == 122)
        {
            field_945_b.field_6304_y.func_1041_b();
            GuiOtherSettingsOF guiothersettingsof = new GuiOtherSettingsOF(this, field_22109_i);
            field_945_b.func_6272_a(guiothersettingsof);
        }
        if(p_572_1_.field_938_f == EnumOptions.AO_LEVEL.ordinal())
        {
            return;
        }
        if(field_22109_i.field_25148_H != i)
        {
            ScaledResolution scaledresolution = new ScaledResolution(field_945_b.field_6304_y, field_945_b.field_6326_c, field_945_b.field_6325_d);
            int j = scaledresolution.func_903_a();
            int k = scaledresolution.func_902_b();
            func_6447_a(field_945_b, j, k);
        }
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        func_578_i();
        func_548_a(field_6451_g, field_22107_a, field_951_c / 2, 20, 0xffffff);
        if(!field_40231_d)
        {
            if(field_22109_i.field_1580_e != 0);
        }
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
        if(Math.abs(p_571_1_ - lastMouseX) > 5 || Math.abs(p_571_2_ - lastMouseY) > 5)
        {
            lastMouseX = p_571_1_;
            lastMouseY = p_571_2_;
            mouseStillTime = System.currentTimeMillis();
            return;
        }
        int i = 700;
        if(System.currentTimeMillis() < mouseStillTime + (long)i)
        {
            return;
        }
        int j = field_951_c / 2 - 150;
        int k = field_950_d / 6 - 5;
        if(p_571_2_ <= k + 98)
        {
            k += 105;
        }
        int l = j + 150 + 150;
        int i1 = k + 84 + 10;
        GuiButton guibutton = getSelectedButton(p_571_1_, p_571_2_);
        if(guibutton != null)
        {
            String s = getButtonName(guibutton.field_939_e);
            String as[] = getTooltipLines(s);
            if(as == null)
            {
                return;
            }
            func_549_a(j, k, l, i1, 0xe0000000, 0xe0000000);
            for(int j1 = 0; j1 < as.length; j1++)
            {
                String s1 = as[j1];
                field_6451_g.func_50103_a(s1, j + 5, k + 5 + j1 * 11, 0xdddddd);
            }

        }
    }

    private String[] getTooltipLines(String s)
    {
        if(s.equals("Graphics"))
        {
            return (new String[] {
                "Visual quality", "  Fast  - lower quality, faster", "  Fancy - higher quality, slower", "Changes the appearance of clouds, leaves, water,", "shadows and grass sides."
            });
        }
        if(s.equals("Render Distance"))
        {
            return (new String[] {
                "Visible distance", "  Tiny - 32m (fastest)", "  Short - 64m (faster)", "  Normal - 128m", "  Far - 256m (slower)", "  Extreme - 512m (slowest!)", "The Extreme view distance is very resource demanding!"
            });
        }
        if(s.equals("Smooth Lighting"))
        {
            return (new String[] {
                "Smooth lighting", "  OFF - no smooth lighting (faster)", "  1% - light smooth lighting (slower)", "  100% - dark smooth lighting (slower)"
            });
        }
        if(s.equals("Performance"))
        {
            return (new String[] {
                "FPS Limit", "  Max FPS - no limit (fastest)", "  Balanced - limit 120 FPS (slower)", "  Power saver - limit 40 FPS (slowest)", "  VSync - limit to monitor framerate (60, 30, 20)", "Balanced and Power saver decrease the FPS even if", "the limit value is not reached."
            });
        }
        if(s.equals("3D Anaglyph"))
        {
            return (new String[] {
                "3D mode used with red-cyan 3D glasses."
            });
        }
        if(s.equals("View Bobbing"))
        {
            return (new String[] {
                "More realistic movement.", "When using mipmaps set it to OFF for best results."
            });
        }
        if(s.equals("GUI Scale"))
        {
            return (new String[] {
                "GUI Scale", "Smaller GUI might be faster"
            });
        }
        if(s.equals("Advanced OpenGL"))
        {
            return (new String[] {
                "Detect and render only visible geometry", "  OFF - all geometry is rendered (slower)", "  Fast - only visible geometry is rendered (fastest)", "  Fancy - conservative, avoids visual artifacts (faster)", "The option is available only if it is supported by the ", "graphic card."
            });
        }
        if(s.equals("Fog"))
        {
            return (new String[] {
                "Fog type", "  Fast - faster fog", "  Fancy - slower fog, looks better", "  OFF - no fog, fastest", "The fancy fog is available only if it is supported by the ", "graphic card."
            });
        }
        if(s.equals("Fog Start"))
        {
            return (new String[] {
                "Fog start", "  0.2 - the fog starts near the player", "  0.8 - the fog starts far from the player", "This option usually does not affect the performance."
            });
        }
        if(s.equals("Brightness"))
        {
            return (new String[] {
                "Increases the brightness of darker objects", "  OFF - standard brightness", "  100% - maximum brightness for darker objects", "This options does not change the brightness of ", "fully black objects"
            });
        }
        if(s.equals("Clouds"))
        {
            return (new String[] {
                "Rendering of clouds", "  ON - standard clouds (slower)", "  OFF - no clouds (faster)"
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
        field_22108_k = (new EnumOptions[] {
            EnumOptions.GRAPHICS, EnumOptions.RENDER_DISTANCE_FINE, EnumOptions.AO_LEVEL, EnumOptions.FRAMERATE_LIMIT, EnumOptions.ANAGLYPH, EnumOptions.VIEW_BOBBING, EnumOptions.GUI_SCALE, EnumOptions.ADVANCED_OPENGL, EnumOptions.GAMMA, EnumOptions.RENDER_CLOUDS, 
            EnumOptions.FOG_FANCY, EnumOptions.FOG_START
        });
    }
}
