// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, StatCollector, GuiSlotStatsGeneral, GuiSlotStatsItem, 
//            GuiSlotStatsBlock, StringTranslate, GuiButton, GuiSlot, 
//            RenderHelper, Item, RenderItem, RenderEngine, 
//            Tessellator, StatFileWriter, FontRenderer

public class GuiStats extends GuiScreen
{

    private static RenderItem field_27153_j = new RenderItem();
    protected GuiScreen field_27152_a;
    protected String field_27154_i;
    private GuiSlotStatsGeneral field_27151_l;
    private GuiSlotStatsItem field_27150_m;
    private GuiSlotStatsBlock field_27157_n;
    private StatFileWriter field_27156_o;
    private GuiSlot field_27155_p;

    public GuiStats(GuiScreen p_i280_1_, StatFileWriter p_i280_2_)
    {
        field_27154_i = "Select world";
        field_27155_p = null;
        field_27152_a = p_i280_1_;
        field_27156_o = p_i280_2_;
    }

    public void func_6448_a()
    {
        field_27154_i = StatCollector.func_25200_a("gui.stats");
        field_27151_l = new GuiSlotStatsGeneral(this);
        field_27151_l.func_22240_a(field_949_e, 1, 1);
        field_27150_m = new GuiSlotStatsItem(this);
        field_27150_m.func_22240_a(field_949_e, 1, 1);
        field_27157_n = new GuiSlotStatsBlock(this);
        field_27157_n.func_22240_a(field_949_e, 1, 1);
        field_27155_p = field_27151_l;
        func_27130_k();
    }

    public void func_27130_k()
    {
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        field_949_e.add(new GuiButton(0, field_951_c / 2 + 4, field_950_d - 28, 150, 20, stringtranslate.func_20163_a("gui.done")));
        field_949_e.add(new GuiButton(1, field_951_c / 2 - 154, field_950_d - 52, 100, 20, stringtranslate.func_20163_a("stat.generalButton")));
        GuiButton guibutton;
        field_949_e.add(guibutton = new GuiButton(2, field_951_c / 2 - 46, field_950_d - 52, 100, 20, stringtranslate.func_20163_a("stat.blocksButton")));
        GuiButton guibutton1;
        field_949_e.add(guibutton1 = new GuiButton(3, field_951_c / 2 + 62, field_950_d - 52, 100, 20, stringtranslate.func_20163_a("stat.itemsButton")));
        if(field_27157_n.func_22249_a() == 0)
        {
            guibutton.field_937_g = false;
        }
        if(field_27150_m.func_22249_a() == 0)
        {
            guibutton1.field_937_g = false;
        }
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(!p_572_1_.field_937_g)
        {
            return;
        }
        if(p_572_1_.field_938_f == 0)
        {
            field_945_b.func_6272_a(field_27152_a);
        } else
        if(p_572_1_.field_938_f == 1)
        {
            field_27155_p = field_27151_l;
        } else
        if(p_572_1_.field_938_f == 3)
        {
            field_27155_p = field_27150_m;
        } else
        if(p_572_1_.field_938_f == 2)
        {
            field_27155_p = field_27157_n;
        } else
        {
            field_27155_p.func_22241_a(p_572_1_);
        }
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        field_27155_p.func_22243_a(p_571_1_, p_571_2_, p_571_3_);
        func_548_a(field_6451_g, field_27154_i, field_951_c / 2, 20, 0xffffff);
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }

    private void func_27138_c(int p_27138_1_, int p_27138_2_, int p_27138_3_)
    {
        func_27147_a(p_27138_1_ + 1, p_27138_2_ + 1);
        GL11.glEnable(32826);
        RenderHelper.func_41089_c();
        field_27153_j.func_27003_a(field_6451_g, field_945_b.field_6315_n, p_27138_3_, 0, Item.field_233_c[p_27138_3_].func_27009_a(0), p_27138_1_ + 2, p_27138_2_ + 2);
        RenderHelper.func_1159_a();
        GL11.glDisable(32826);
    }

    private void func_27147_a(int p_27147_1_, int p_27147_2_)
    {
        func_27136_c(p_27147_1_, p_27147_2_, 0, 0);
    }

    private void func_27136_c(int p_27136_1_, int p_27136_2_, int p_27136_3_, int p_27136_4_)
    {
        int i = field_945_b.field_6315_n.func_1070_a("/gui/slot.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        field_945_b.field_6315_n.func_1076_b(i);
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        tessellator.func_983_a(p_27136_1_ + 0, p_27136_2_ + 18, field_923_k, (float)(p_27136_3_ + 0) * 0.0078125F, (float)(p_27136_4_ + 18) * 0.0078125F);
        tessellator.func_983_a(p_27136_1_ + 18, p_27136_2_ + 18, field_923_k, (float)(p_27136_3_ + 18) * 0.0078125F, (float)(p_27136_4_ + 18) * 0.0078125F);
        tessellator.func_983_a(p_27136_1_ + 18, p_27136_2_ + 0, field_923_k, (float)(p_27136_3_ + 18) * 0.0078125F, (float)(p_27136_4_ + 0) * 0.0078125F);
        tessellator.func_983_a(p_27136_1_ + 0, p_27136_2_ + 0, field_923_k, (float)(p_27136_3_ + 0) * 0.0078125F, (float)(p_27136_4_ + 0) * 0.0078125F);
        tessellator.func_982_a();
    }

    static Minecraft func_27141_a(GuiStats p_27141_0_)
    {
        return p_27141_0_.field_945_b;
    }

    static FontRenderer func_27145_b(GuiStats p_27145_0_)
    {
        return p_27145_0_.field_6451_g;
    }

    static StatFileWriter func_27142_c(GuiStats p_27142_0_)
    {
        return p_27142_0_.field_27156_o;
    }

    static FontRenderer func_27140_d(GuiStats p_27140_0_)
    {
        return p_27140_0_.field_6451_g;
    }

    static FontRenderer func_27146_e(GuiStats p_27146_0_)
    {
        return p_27146_0_.field_6451_g;
    }

    static Minecraft func_27143_f(GuiStats p_27143_0_)
    {
        return p_27143_0_.field_945_b;
    }

    static void func_27128_a(GuiStats p_27128_0_, int p_27128_1_, int p_27128_2_, int p_27128_3_, int p_27128_4_)
    {
        p_27128_0_.func_27136_c(p_27128_1_, p_27128_2_, p_27128_3_, p_27128_4_);
    }

    static Minecraft func_27149_g(GuiStats p_27149_0_)
    {
        return p_27149_0_.field_945_b;
    }

    static FontRenderer func_27133_h(GuiStats p_27133_0_)
    {
        return p_27133_0_.field_6451_g;
    }

    static FontRenderer func_27137_i(GuiStats p_27137_0_)
    {
        return p_27137_0_.field_6451_g;
    }

    static FontRenderer func_27132_j(GuiStats p_27132_0_)
    {
        return p_27132_0_.field_6451_g;
    }

    static FontRenderer func_27134_k(GuiStats p_27134_0_)
    {
        return p_27134_0_.field_6451_g;
    }

    static FontRenderer func_27139_l(GuiStats p_27139_0_)
    {
        return p_27139_0_.field_6451_g;
    }

    static void func_27129_a(GuiStats p_27129_0_, int p_27129_1_, int p_27129_2_, int p_27129_3_, int p_27129_4_, int p_27129_5_, int p_27129_6_)
    {
        p_27129_0_.func_549_a(p_27129_1_, p_27129_2_, p_27129_3_, p_27129_4_, p_27129_5_, p_27129_6_);
    }

    static FontRenderer func_27144_m(GuiStats p_27144_0_)
    {
        return p_27144_0_.field_6451_g;
    }

    static FontRenderer func_27127_n(GuiStats p_27127_0_)
    {
        return p_27127_0_.field_6451_g;
    }

    static void func_27135_b(GuiStats p_27135_0_, int p_27135_1_, int p_27135_2_, int p_27135_3_, int p_27135_4_, int p_27135_5_, int p_27135_6_)
    {
        p_27135_0_.func_549_a(p_27135_1_, p_27135_2_, p_27135_3_, p_27135_4_, p_27135_5_, p_27135_6_);
    }

    static FontRenderer func_27131_o(GuiStats p_27131_0_)
    {
        return p_27131_0_.field_6451_g;
    }

    static void func_27148_a(GuiStats p_27148_0_, int p_27148_1_, int p_27148_2_, int p_27148_3_)
    {
        p_27148_0_.func_27138_c(p_27148_1_, p_27148_2_, p_27148_3_);
    }

}
