// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, StringTranslate, GuiSmallButton, GuiSlotLanguage, 
//            GuiButton, GameSettings, TexturePackList

public class GuiLanguage extends GuiScreen
{

    protected GuiScreen field_44009_a;
    private int field_44007_b;
    private GuiSlotLanguage field_44008_c;
    private final GameSettings field_44006_d;
    private GuiSmallButton field_46029_e;

    public GuiLanguage(GuiScreen p_i92_1_, GameSettings p_i92_2_)
    {
        field_44007_b = -1;
        field_44009_a = p_i92_1_;
        field_44006_d = p_i92_2_;
    }

    public void func_6448_a()
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        field_949_e.add(field_46029_e = new GuiSmallButton(6, field_951_c / 2 - 75, field_950_d - 38, stringtranslate.func_20163_a("gui.done")));
        field_44008_c = new GuiSlotLanguage(this);
        field_44008_c.func_22240_a(field_949_e, 7, 8);
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(!p_572_1_.field_937_g)
        {
            return;
        }
        switch(p_572_1_.field_938_f)
        {
        case 6: // '\006'
            field_44006_d.func_1041_b();
            field_945_b.func_6272_a(field_44009_a);
            break;

        default:
            field_44008_c.func_22241_a(p_572_1_);
            break;

        case 5: // '\005'
            break;
        }
    }

    protected void func_565_a(int p_565_1_, int p_565_2_, int p_565_3_)
    {
        super.func_565_a(p_565_1_, p_565_2_, p_565_3_);
    }

    protected void func_573_b(int p_573_1_, int p_573_2_, int p_573_3_)
    {
        super.func_573_b(p_573_1_, p_573_2_, p_573_3_);
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        field_44008_c.func_22243_a(p_571_1_, p_571_2_, p_571_3_);
        if(field_44007_b <= 0)
        {
            field_945_b.field_6298_C.func_6532_a();
            field_44007_b += 20;
        }
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        func_548_a(field_6451_g, stringtranslate.func_20163_a("options.language"), field_951_c / 2, 16, 0xffffff);
        func_548_a(field_6451_g, (new StringBuilder()).append("(").append(stringtranslate.func_20163_a("options.languageWarning")).append(")").toString(), field_951_c / 2, field_950_d - 56, 0x808080);
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }

    public void func_570_g()
    {
        super.func_570_g();
        field_44007_b--;
    }

    static GameSettings func_44005_a(GuiLanguage p_44005_0_)
    {
        return p_44005_0_.field_44006_d;
    }

    static GuiSmallButton func_46028_b(GuiLanguage p_46028_0_)
    {
        return p_46028_0_.field_46029_e;
    }
}
