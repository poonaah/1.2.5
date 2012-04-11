// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.Minecraft;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, StringTranslate, GuiWorldSlot, ISaveFormat, 
//            SaveFormatComparator, MathHelper, GuiButton, GuiYesNo, 
//            GuiCreateWorld, GuiRenameWorld, PlayerControllerSP, PlayerControllerCreative

public class GuiSelectWorld extends GuiScreen
{

    private final DateFormat field_22102_i = new SimpleDateFormat();
    protected GuiScreen field_958_a;
    protected String field_960_h;
    private boolean field_959_i;
    private int field_22101_l;
    private List field_22100_m;
    private GuiWorldSlot field_22099_n;
    private String field_22098_o;
    private String field_22097_p;
    private String field_35316_k[];
    private boolean field_22096_q;
    private GuiButton field_22095_r;
    private GuiButton field_22104_s;
    private GuiButton field_22103_t;

    public GuiSelectWorld(GuiScreen p_i469_1_)
    {
        field_960_h = "Select world";
        field_959_i = false;
        field_35316_k = new String[2];
        field_958_a = p_i469_1_;
    }

    public void func_6448_a()
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        field_960_h = stringtranslate.func_20163_a("selectWorld.title");
        field_22098_o = stringtranslate.func_20163_a("selectWorld.world");
        field_22097_p = stringtranslate.func_20163_a("selectWorld.conversion");
        field_35316_k[0] = stringtranslate.func_20163_a("gameMode.survival");
        field_35316_k[1] = stringtranslate.func_20163_a("gameMode.creative");
        func_22084_k();
        field_22099_n = new GuiWorldSlot(this);
        field_22099_n.func_22240_a(field_949_e, 4, 5);
        func_585_j();
    }

    private void func_22084_k()
    {
        ISaveFormat isaveformat = field_945_b.func_22004_c();
        field_22100_m = isaveformat.func_22176_b();
        Collections.sort(field_22100_m);
        field_22101_l = -1;
    }

    protected String func_22091_c(int p_22091_1_)
    {
        return ((SaveFormatComparator)field_22100_m.get(p_22091_1_)).func_22164_a();
    }

    protected String func_22094_d(int p_22094_1_)
    {
        String s = ((SaveFormatComparator)field_22100_m.get(p_22094_1_)).func_22162_b();
        if(s == null || MathHelper.func_22282_a(s))
        {
            StringTranslate stringtranslate = StringTranslate.func_20162_a();
            s = (new StringBuilder()).append(stringtranslate.func_20163_a("selectWorld.world")).append(" ").append(p_22094_1_ + 1).toString();
        }
        return s;
    }

    public void func_585_j()
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        field_949_e.add(field_22104_s = new GuiButton(1, field_951_c / 2 - 154, field_950_d - 52, 150, 20, stringtranslate.func_20163_a("selectWorld.select")));
        field_949_e.add(field_22103_t = new GuiButton(6, field_951_c / 2 - 154, field_950_d - 28, 70, 20, stringtranslate.func_20163_a("selectWorld.rename")));
        field_949_e.add(field_22095_r = new GuiButton(2, field_951_c / 2 - 74, field_950_d - 28, 70, 20, stringtranslate.func_20163_a("selectWorld.delete")));
        field_949_e.add(new GuiButton(3, field_951_c / 2 + 4, field_950_d - 52, 150, 20, stringtranslate.func_20163_a("selectWorld.create")));
        field_949_e.add(new GuiButton(0, field_951_c / 2 + 4, field_950_d - 28, 150, 20, stringtranslate.func_20163_a("gui.cancel")));
        field_22104_s.field_937_g = false;
        field_22095_r.field_937_g = false;
        field_22103_t.field_937_g = false;
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(!p_572_1_.field_937_g)
        {
            return;
        }
        if(p_572_1_.field_938_f == 2)
        {
            String s = func_22094_d(field_22101_l);
            if(s != null)
            {
                field_22096_q = true;
                StringTranslate stringtranslate = StringTranslate.func_20162_a();
                String s1 = stringtranslate.func_20163_a("selectWorld.deleteQuestion");
                String s2 = (new StringBuilder()).append("'").append(s).append("' ").append(stringtranslate.func_20163_a("selectWorld.deleteWarning")).toString();
                String s3 = stringtranslate.func_20163_a("selectWorld.deleteButton");
                String s4 = stringtranslate.func_20163_a("gui.cancel");
                GuiYesNo guiyesno = new GuiYesNo(this, s1, s2, s3, s4, field_22101_l);
                field_945_b.func_6272_a(guiyesno);
            }
        } else
        if(p_572_1_.field_938_f == 1)
        {
            func_584_c(field_22101_l);
        } else
        if(p_572_1_.field_938_f == 3)
        {
            field_945_b.func_6272_a(new GuiCreateWorld(this));
        } else
        if(p_572_1_.field_938_f == 6)
        {
            field_945_b.func_6272_a(new GuiRenameWorld(this, func_22091_c(field_22101_l)));
        } else
        if(p_572_1_.field_938_f == 0)
        {
            field_945_b.func_6272_a(field_958_a);
        } else
        {
            field_22099_n.func_22241_a(p_572_1_);
        }
    }

    public void func_584_c(int p_584_1_)
    {
        field_945_b.func_6272_a(null);
        if(field_959_i)
        {
            return;
        }
        field_959_i = true;
        int i = ((SaveFormatComparator)field_22100_m.get(p_584_1_)).func_35719_f();
        if(i == 0)
        {
            field_945_b.field_6327_b = new PlayerControllerSP(field_945_b);
        } else
        {
            field_945_b.field_6327_b = new PlayerControllerCreative(field_945_b);
        }
        String s = func_22091_c(p_584_1_);
        if(s == null)
        {
            s = (new StringBuilder()).append("World").append(p_584_1_).toString();
        }
        field_945_b.func_6247_b(s, func_22094_d(p_584_1_), null);
        field_945_b.func_6272_a(null);
    }

    public void func_568_a(boolean p_568_1_, int p_568_2_)
    {
        if(field_22096_q)
        {
            field_22096_q = false;
            if(p_568_1_)
            {
                ISaveFormat isaveformat = field_945_b.func_22004_c();
                isaveformat.func_22177_c();
                isaveformat.func_22172_c(func_22091_c(p_568_2_));
                func_22084_k();
            }
            field_945_b.func_6272_a(this);
        }
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        field_22099_n.func_22243_a(p_571_1_, p_571_2_, p_571_3_);
        func_548_a(field_6451_g, field_960_h, field_951_c / 2, 20, 0xffffff);
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }

    static List func_22090_a(GuiSelectWorld p_22090_0_)
    {
        return p_22090_0_.field_22100_m;
    }

    static int func_22089_a(GuiSelectWorld p_22089_0_, int p_22089_1_)
    {
        return p_22089_0_.field_22101_l = p_22089_1_;
    }

    static int func_22086_b(GuiSelectWorld p_22086_0_)
    {
        return p_22086_0_.field_22101_l;
    }

    static GuiButton func_22083_c(GuiSelectWorld p_22083_0_)
    {
        return p_22083_0_.field_22104_s;
    }

    static GuiButton func_22085_d(GuiSelectWorld p_22085_0_)
    {
        return p_22085_0_.field_22095_r;
    }

    static GuiButton func_22092_e(GuiSelectWorld p_22092_0_)
    {
        return p_22092_0_.field_22103_t;
    }

    static String func_22087_f(GuiSelectWorld p_22087_0_)
    {
        return p_22087_0_.field_22098_o;
    }

    static DateFormat func_22093_g(GuiSelectWorld p_22093_0_)
    {
        return p_22093_0_.field_22102_i;
    }

    static String func_22088_h(GuiSelectWorld p_22088_0_)
    {
        return p_22088_0_.field_22097_p;
    }

    static String[] func_35315_i(GuiSelectWorld p_35315_0_)
    {
        return p_35315_0_.field_35316_k;
    }
}
