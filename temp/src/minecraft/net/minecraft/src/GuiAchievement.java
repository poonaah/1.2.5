// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Gui, RenderItem, StatCollector, Achievement, 
//            ScaledResolution, RenderEngine, FontRenderer, RenderHelper

public class GuiAchievement extends Gui
{

    private Minecraft field_25082_a;
    private int field_25081_b;
    private int field_25086_c;
    private String field_25085_d;
    private String field_25084_e;
    private Achievement field_27105_f;
    private long field_25083_f;
    private RenderItem field_27104_h;
    private boolean field_27103_i;

    public GuiAchievement(Minecraft p_i538_1_)
    {
        field_25082_a = p_i538_1_;
        field_27104_h = new RenderItem();
    }

    public void func_27102_a(Achievement p_27102_1_)
    {
        field_25085_d = StatCollector.func_25200_a("achievement.get");
        field_25084_e = StatCollector.func_25200_a(p_27102_1_.func_44020_i());
        field_25083_f = System.currentTimeMillis();
        field_27105_f = p_27102_1_;
        field_27103_i = false;
    }

    public void func_27101_b(Achievement p_27101_1_)
    {
        field_25085_d = StatCollector.func_25200_a(p_27101_1_.func_44020_i());
        field_25084_e = p_27101_1_.func_27090_e();
        field_25083_f = System.currentTimeMillis() - 2500L;
        field_27105_f = p_27101_1_;
        field_27103_i = true;
    }

    private void func_25079_b()
    {
        GL11.glViewport(0, 0, field_25082_a.field_6326_c, field_25082_a.field_6325_d);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        field_25081_b = field_25082_a.field_6326_c;
        field_25086_c = field_25082_a.field_6325_d;
        ScaledResolution scaledresolution = new ScaledResolution(field_25082_a.field_6304_y, field_25082_a.field_6326_c, field_25082_a.field_6325_d);
        field_25081_b = scaledresolution.func_903_a();
        field_25086_c = scaledresolution.func_902_b();
        GL11.glClear(256);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, field_25081_b, field_25086_c, 0.0D, 1000D, 3000D);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0F, 0.0F, -2000F);
    }

    public void func_25080_a()
    {
        if(field_27105_f == null || field_25083_f == 0L)
        {
            return;
        }
        double d = (double)(System.currentTimeMillis() - field_25083_f) / 3000D;
        if(!field_27103_i && (d < 0.0D || d > 1.0D))
        {
            field_25083_f = 0L;
            return;
        }
        func_25079_b();
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        double d1 = d * 2D;
        if(d1 > 1.0D)
        {
            d1 = 2D - d1;
        }
        d1 *= 4D;
        d1 = 1.0D - d1;
        if(d1 < 0.0D)
        {
            d1 = 0.0D;
        }
        d1 *= d1;
        d1 *= d1;
        int i = field_25081_b - 160;
        int j = 0 - (int)(d1 * 36D);
        int k = field_25082_a.field_6315_n.func_1070_a("/achievement/bg.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(3553);
        GL11.glBindTexture(3553, k);
        GL11.glDisable(2896);
        func_550_b(i, j, 96, 202, 160, 32);
        if(field_27103_i)
        {
            field_25082_a.field_6314_o.func_27278_a(field_25084_e, i + 30, j + 7, 120, -1);
        } else
        {
            field_25082_a.field_6314_o.func_873_b(field_25085_d, i + 30, j + 7, -256);
            field_25082_a.field_6314_o.func_873_b(field_25084_e, i + 30, j + 18, -1);
        }
        RenderHelper.func_41089_c();
        GL11.glDisable(2896);
        GL11.glEnable(32826);
        GL11.glEnable(2903);
        GL11.glEnable(2896);
        field_27104_h.func_161_a(field_25082_a.field_6314_o, field_25082_a.field_6315_n, field_27105_f.field_27097_d, i + 8, j + 8);
        GL11.glDisable(2896);
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
    }
}
