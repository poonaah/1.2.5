// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, StatCollector, GuiTextField, StringTranslate, 
//            GuiButton, ChatAllowedCharacters, MathHelper, WorldType, 
//            ISaveFormat, PlayerControllerCreative, PlayerControllerSP, WorldSettings

public class GuiCreateWorld extends GuiScreen
{

    private GuiScreen field_22131_a;
    private GuiTextField field_22134_h;
    private GuiTextField field_22133_i;
    private String field_22132_k;
    private String field_35364_f;
    private boolean field_35365_g;
    private boolean field_40232_h;
    private boolean field_22130_l;
    private boolean field_35368_i;
    private GuiButton field_35366_j;
    private GuiButton field_35367_k;
    private GuiButton field_35372_s;
    private GuiButton field_35371_t;
    private String field_35370_u;
    private String field_35369_v;
    private String field_41048_x;
    private String field_41047_y;
    private int field_46030_z;

    public GuiCreateWorld(GuiScreen p_i680_1_)
    {
        field_35364_f = "survival";
        field_35365_g = true;
        field_40232_h = false;
        field_46030_z = 0;
        field_22131_a = p_i680_1_;
        field_41048_x = "";
        field_41047_y = StatCollector.func_25200_a("selectWorld.newWorld");
    }

    public void func_570_g()
    {
        field_22134_h.func_22070_b();
        field_22133_i.func_22070_b();
    }

    public void func_6448_a()
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        Keyboard.enableRepeatEvents(true);
        field_949_e.clear();
        field_949_e.add(new GuiButton(0, field_951_c / 2 - 155, field_950_d - 28, 150, 20, stringtranslate.func_20163_a("selectWorld.create")));
        field_949_e.add(new GuiButton(1, field_951_c / 2 + 5, field_950_d - 28, 150, 20, stringtranslate.func_20163_a("gui.cancel")));
        field_949_e.add(field_35366_j = new GuiButton(2, field_951_c / 2 - 75, 100, 150, 20, stringtranslate.func_20163_a("selectWorld.gameMode")));
        field_949_e.add(field_35367_k = new GuiButton(3, field_951_c / 2 - 75, 172, 150, 20, stringtranslate.func_20163_a("selectWorld.moreWorldOptions")));
        field_949_e.add(field_35372_s = new GuiButton(4, field_951_c / 2 - 155, 100, 150, 20, stringtranslate.func_20163_a("selectWorld.mapFeatures")));
        field_35372_s.field_936_h = false;
        field_949_e.add(field_35371_t = new GuiButton(5, field_951_c / 2 + 5, 100, 150, 20, stringtranslate.func_20163_a("selectWorld.mapType")));
        field_35371_t.field_936_h = false;
        field_22134_h = new GuiTextField(field_6451_g, field_951_c / 2 - 100, 60, 200, 20);
        field_22134_h.func_50033_b(true);
        field_22134_h.func_22068_a(field_41047_y);
        field_22133_i = new GuiTextField(field_6451_g, field_951_c / 2 - 100, 60, 200, 20);
        field_22133_i.func_22068_a(field_41048_x);
        func_22129_j();
        func_35363_g();
    }

    private void func_22129_j()
    {
        field_22132_k = field_22134_h.func_22071_a().trim();
        char ac[] = ChatAllowedCharacters.field_22286_b;
        int i = ac.length;
        for(int j = 0; j < i; j++)
        {
            char c = ac[j];
            field_22132_k = field_22132_k.replace(c, '_');
        }

        if(MathHelper.func_22282_a(field_22132_k))
        {
            field_22132_k = "World";
        }
        field_22132_k = func_25097_a(field_945_b.func_22004_c(), field_22132_k);
    }

    private void func_35363_g()
    {
        StringTranslate stringtranslate;
        stringtranslate = StringTranslate.func_20162_a();
        field_35366_j.field_939_e = (new StringBuilder()).append(stringtranslate.func_20163_a("selectWorld.gameMode")).append(" ").append(stringtranslate.func_20163_a((new StringBuilder()).append("selectWorld.gameMode.").append(field_35364_f).toString())).toString();
        field_35370_u = stringtranslate.func_20163_a((new StringBuilder()).append("selectWorld.gameMode.").append(field_35364_f).append(".line1").toString());
        field_35369_v = stringtranslate.func_20163_a((new StringBuilder()).append("selectWorld.gameMode.").append(field_35364_f).append(".line2").toString());
        field_35372_s.field_939_e = (new StringBuilder()).append(stringtranslate.func_20163_a("selectWorld.mapFeatures")).append(" ").toString();
        if(!field_35365_g) goto _L2; else goto _L1
_L1:
        new StringBuilder();
        field_35372_s;
        JVM INSTR dup_x1 ;
        field_939_e;
        append();
        stringtranslate.func_20163_a("options.on");
        append();
        toString();
        field_939_e;
          goto _L3
_L2:
        new StringBuilder();
        field_35372_s;
        JVM INSTR dup_x1 ;
        field_939_e;
        append();
        stringtranslate.func_20163_a("options.off");
        append();
        toString();
        field_939_e;
_L3:
        field_35371_t.field_939_e = (new StringBuilder()).append(stringtranslate.func_20163_a("selectWorld.mapType")).append(" ").append(stringtranslate.func_20163_a(WorldType.field_48637_a[field_46030_z].func_46136_a())).toString();
        return;
    }

    public static String func_25097_a(ISaveFormat p_25097_0_, String p_25097_1_)
    {
        for(p_25097_1_ = p_25097_1_.replaceAll("[\\./\"]|COM", "_"); p_25097_0_.func_22173_b(p_25097_1_) != null; p_25097_1_ = (new StringBuilder()).append(p_25097_1_).append("-").toString()) { }
        return p_25097_1_;
    }

    public void func_6449_h()
    {
        Keyboard.enableRepeatEvents(false);
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(!p_572_1_.field_937_g)
        {
            return;
        }
        if(p_572_1_.field_938_f == 1)
        {
            field_945_b.func_6272_a(field_22131_a);
        } else
        if(p_572_1_.field_938_f == 0)
        {
            field_945_b.func_6272_a(null);
            if(field_22130_l)
            {
                return;
            }
            field_22130_l = true;
            long l = (new Random()).nextLong();
            String s = field_22133_i.func_22071_a();
            if(!MathHelper.func_22282_a(s))
            {
                try
                {
                    long l1 = Long.parseLong(s);
                    if(l1 != 0L)
                    {
                        l = l1;
                    }
                }
                catch(NumberFormatException numberformatexception)
                {
                    l = s.hashCode();
                }
            }
            int i = 0;
            if(field_35364_f.equals("creative"))
            {
                i = 1;
                field_945_b.field_6327_b = new PlayerControllerCreative(field_945_b);
            } else
            {
                field_945_b.field_6327_b = new PlayerControllerSP(field_945_b);
            }
            field_945_b.func_6247_b(field_22132_k, field_22134_h.func_22071_a(), new WorldSettings(l, i, field_35365_g, field_40232_h, WorldType.field_48637_a[field_46030_z]));
            field_945_b.func_6272_a(null);
        } else
        if(p_572_1_.field_938_f == 3)
        {
            field_35368_i = !field_35368_i;
            field_35366_j.field_936_h = !field_35368_i;
            field_35372_s.field_936_h = field_35368_i;
            field_35371_t.field_936_h = field_35368_i;
            if(field_35368_i)
            {
                StringTranslate stringtranslate = StringTranslate.func_20162_a();
                field_35367_k.field_939_e = stringtranslate.func_20163_a("gui.done");
            } else
            {
                StringTranslate stringtranslate1 = StringTranslate.func_20162_a();
                field_35367_k.field_939_e = stringtranslate1.func_20163_a("selectWorld.moreWorldOptions");
            }
        } else
        if(p_572_1_.field_938_f == 2)
        {
            if(field_35364_f.equals("survival"))
            {
                field_40232_h = false;
                field_35364_f = "hardcore";
                field_40232_h = true;
                func_35363_g();
            } else
            if(field_35364_f.equals("hardcore"))
            {
                field_40232_h = false;
                field_35364_f = "creative";
                func_35363_g();
                field_40232_h = false;
            } else
            {
                field_35364_f = "survival";
                func_35363_g();
                field_40232_h = false;
            }
            func_35363_g();
        } else
        if(p_572_1_.field_938_f == 4)
        {
            field_35365_g = !field_35365_g;
            func_35363_g();
        } else
        if(p_572_1_.field_938_f == 5)
        {
            field_46030_z++;
            if(field_46030_z >= WorldType.field_48637_a.length)
            {
                field_46030_z = 0;
            }
            do
            {
                if(WorldType.field_48637_a[field_46030_z] != null && WorldType.field_48637_a[field_46030_z].func_48627_d())
                {
                    break;
                }
                field_46030_z++;
                if(field_46030_z >= WorldType.field_48637_a.length)
                {
                    field_46030_z = 0;
                }
            } while(true);
            func_35363_g();
        }
    }

    protected void func_580_a(char p_580_1_, int p_580_2_)
    {
        if(field_22134_h.func_50025_j() && !field_35368_i)
        {
            field_22134_h.func_50037_a(p_580_1_, p_580_2_);
            field_41047_y = field_22134_h.func_22071_a();
        } else
        if(field_22133_i.func_50025_j() && field_35368_i)
        {
            field_22133_i.func_50037_a(p_580_1_, p_580_2_);
            field_41048_x = field_22133_i.func_22071_a();
        }
        if(p_580_1_ == '\r')
        {
            func_572_a((GuiButton)field_949_e.get(0));
        }
        ((GuiButton)field_949_e.get(0)).field_937_g = field_22134_h.func_22071_a().length() > 0;
        func_22129_j();
    }

    protected void func_565_a(int p_565_1_, int p_565_2_, int p_565_3_)
    {
        super.func_565_a(p_565_1_, p_565_2_, p_565_3_);
        if(!field_35368_i)
        {
            field_22134_h.func_22069_a(p_565_1_, p_565_2_, p_565_3_);
        } else
        {
            field_22133_i.func_22069_a(p_565_1_, p_565_2_, p_565_3_);
        }
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        func_578_i();
        func_548_a(field_6451_g, stringtranslate.func_20163_a("selectWorld.create"), field_951_c / 2, 20, 0xffffff);
        if(!field_35368_i)
        {
            func_547_b(field_6451_g, stringtranslate.func_20163_a("selectWorld.enterName"), field_951_c / 2 - 100, 47, 0xa0a0a0);
            func_547_b(field_6451_g, (new StringBuilder()).append(stringtranslate.func_20163_a("selectWorld.resultFolder")).append(" ").append(field_22132_k).toString(), field_951_c / 2 - 100, 85, 0xa0a0a0);
            field_22134_h.func_22067_c();
            func_547_b(field_6451_g, field_35370_u, field_951_c / 2 - 100, 122, 0xa0a0a0);
            func_547_b(field_6451_g, field_35369_v, field_951_c / 2 - 100, 134, 0xa0a0a0);
        } else
        {
            func_547_b(field_6451_g, stringtranslate.func_20163_a("selectWorld.enterSeed"), field_951_c / 2 - 100, 47, 0xa0a0a0);
            func_547_b(field_6451_g, stringtranslate.func_20163_a("selectWorld.seedInfo"), field_951_c / 2 - 100, 85, 0xa0a0a0);
            func_547_b(field_6451_g, stringtranslate.func_20163_a("selectWorld.mapFeatures.info"), field_951_c / 2 - 150, 122, 0xa0a0a0);
            field_22133_i.func_22067_c();
        }
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }
}
