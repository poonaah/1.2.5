// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Gui, GuiButton, SoundManager, GuiParticle, 
//            Tessellator, RenderEngine, FontRenderer

public class GuiScreen extends Gui
{

    protected Minecraft field_945_b;
    public int field_951_c;
    public int field_950_d;
    protected List field_949_e;
    public boolean field_948_f;
    protected FontRenderer field_6451_g;
    public GuiParticle field_25091_h;
    private GuiButton field_946_a;

    public GuiScreen()
    {
        field_949_e = new ArrayList();
        field_948_f = false;
        field_946_a = null;
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        for(int i = 0; i < field_949_e.size(); i++)
        {
            GuiButton guibutton = (GuiButton)field_949_e.get(i);
            guibutton.func_561_a(field_945_b, p_571_1_, p_571_2_);
        }

    }

    protected void func_580_a(char p_580_1_, int p_580_2_)
    {
        if(p_580_2_ == 1)
        {
            field_945_b.func_6272_a(null);
            field_945_b.func_6259_e();
        }
    }

    public static String func_574_c()
    {
        try
        {
            java.awt.datatransfer.Transferable transferable = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if(transferable != null && transferable.isDataFlavorSupported(java.awt.datatransfer.DataFlavor.stringFlavor))
            {
                return (String)transferable.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
            }
        }
        catch(Exception exception) { }
        return "";
    }

    public static void func_50050_a(String p_50050_0_)
    {
        try
        {
            java.awt.datatransfer.StringSelection stringselection = new java.awt.datatransfer.StringSelection(p_50050_0_);
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
        }
        catch(Exception exception) { }
    }

    protected void func_565_a(int p_565_1_, int p_565_2_, int p_565_3_)
    {
        if(p_565_3_ == 0)
        {
            for(int i = 0; i < field_949_e.size(); i++)
            {
                GuiButton guibutton = (GuiButton)field_949_e.get(i);
                if(guibutton.func_562_c(field_945_b, p_565_1_, p_565_2_))
                {
                    field_946_a = guibutton;
                    field_945_b.field_6301_A.func_337_a("random.click", 1.0F, 1.0F);
                    func_572_a(guibutton);
                }
            }

        }
    }

    protected void func_573_b(int p_573_1_, int p_573_2_, int p_573_3_)
    {
        if(field_946_a != null && p_573_3_ == 0)
        {
            field_946_a.func_559_a(p_573_1_, p_573_2_);
            field_946_a = null;
        }
    }

    protected void func_572_a(GuiButton guibutton)
    {
    }

    public void func_6447_a(Minecraft p_6447_1_, int p_6447_2_, int p_6447_3_)
    {
        field_25091_h = new GuiParticle(p_6447_1_);
        field_945_b = p_6447_1_;
        field_6451_g = p_6447_1_.field_6314_o;
        field_951_c = p_6447_2_;
        field_950_d = p_6447_3_;
        field_949_e.clear();
        func_6448_a();
    }

    public void func_6448_a()
    {
    }

    public void func_564_d()
    {
        for(; Mouse.next(); func_566_e()) { }
        for(; Keyboard.next(); func_569_f()) { }
    }

    public void func_566_e()
    {
        if(Mouse.getEventButtonState())
        {
            int i = (Mouse.getEventX() * field_951_c) / field_945_b.field_6326_c;
            int k = field_950_d - (Mouse.getEventY() * field_950_d) / field_945_b.field_6325_d - 1;
            func_565_a(i, k, Mouse.getEventButton());
        } else
        {
            int j = (Mouse.getEventX() * field_951_c) / field_945_b.field_6326_c;
            int l = field_950_d - (Mouse.getEventY() * field_950_d) / field_945_b.field_6325_d - 1;
            func_573_b(j, l, Mouse.getEventButton());
        }
    }

    public void func_569_f()
    {
        if(Keyboard.getEventKeyState())
        {
            if(Keyboard.getEventKey() == 87)
            {
                field_945_b.func_6270_h();
                return;
            }
            func_580_a(Keyboard.getEventCharacter(), Keyboard.getEventKey());
        }
    }

    public void func_570_g()
    {
    }

    public void func_6449_h()
    {
    }

    public void func_578_i()
    {
        func_567_a(0);
    }

    public void func_567_a(int p_567_1_)
    {
        if(field_945_b.field_6324_e != null)
        {
            func_549_a(0, 0, field_951_c, field_950_d, 0xc0101010, 0xd0101010);
        } else
        {
            func_579_b(p_567_1_);
        }
    }

    public void func_579_b(int p_579_1_)
    {
        GL11.glDisable(2896);
        GL11.glDisable(2912);
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glBindTexture(3553, field_945_b.field_6315_n.func_1070_a("/gui/background.png"));
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float f = 32F;
        tessellator.func_977_b();
        tessellator.func_990_b(0x404040);
        tessellator.func_983_a(0.0D, field_950_d, 0.0D, 0.0D, (float)field_950_d / f + (float)p_579_1_);
        tessellator.func_983_a(field_951_c, field_950_d, 0.0D, (float)field_951_c / f, (float)field_950_d / f + (float)p_579_1_);
        tessellator.func_983_a(field_951_c, 0.0D, 0.0D, (float)field_951_c / f, p_579_1_);
        tessellator.func_983_a(0.0D, 0.0D, 0.0D, 0.0D, p_579_1_);
        tessellator.func_982_a();
    }

    public boolean func_6450_b()
    {
        return true;
    }

    public void func_568_a(boolean flag, int i)
    {
    }

    public static boolean func_50051_l()
    {
        return Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157);
    }

    public static boolean func_50049_m()
    {
        return Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54);
    }
}
