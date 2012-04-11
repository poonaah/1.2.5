// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, RenderEngine, StringTranslate, GuiButton, 
//            GuiButtonLanguage, GuiOptions, GuiLanguage, GuiSelectWorld, 
//            GuiMultiplayer, GuiTexturePacks, Tessellator, MathHelper, 
//            FontRenderer

public class GuiMainMenu extends GuiScreen
{

    private static final Random field_6463_h = new Random();
    private float field_989_j;
    private String field_6462_l;
    private GuiButton field_25096_l;
    private int field_35357_f;
    private int field_35358_g;

    public GuiMainMenu()
    {
        field_989_j = 0.0F;
        field_35357_f = 0;
        field_6462_l = "missingno";
        try
        {
            ArrayList arraylist = new ArrayList();
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader((net.minecraft.src.GuiMainMenu.class).getResourceAsStream("/title/splashes.txt"), Charset.forName("UTF-8")));
            String s = "";
            do
            {
                String s1;
                if((s1 = bufferedreader.readLine()) == null)
                {
                    break;
                }
                s1 = s1.trim();
                if(s1.length() > 0)
                {
                    arraylist.add(s1);
                }
            } while(true);
            do
            {
                field_6462_l = (String)arraylist.get(field_6463_h.nextInt(arraylist.size()));
            } while(field_6462_l.hashCode() == 0x77f432f);
        }
        catch(Exception exception) { }
        field_989_j = field_6463_h.nextFloat();
    }

    public void func_570_g()
    {
        field_35357_f++;
    }

    public boolean func_6450_b()
    {
        return false;
    }

    protected void func_580_a(char c, int i)
    {
    }

    public void func_6448_a()
    {
        field_35358_g = field_945_b.field_6315_n.func_1074_a(new java.awt.image.BufferedImage(256, 256, 2));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        if(calendar.get(2) + 1 == 11 && calendar.get(5) == 9)
        {
            field_6462_l = "Happy birthday, ez!";
        } else
        if(calendar.get(2) + 1 == 6 && calendar.get(5) == 1)
        {
            field_6462_l = "Happy birthday, Notch!";
        } else
        if(calendar.get(2) + 1 == 12 && calendar.get(5) == 24)
        {
            field_6462_l = "Merry X-mas!";
        } else
        if(calendar.get(2) + 1 == 1 && calendar.get(5) == 1)
        {
            field_6462_l = "Happy new year!";
        }
        StringTranslate stringtranslate = StringTranslate.func_20162_a();
        int i = field_950_d / 4 + 48;
        field_949_e.add(new GuiButton(1, field_951_c / 2 - 100, i, stringtranslate.func_20163_a("menu.singleplayer")));
        field_949_e.add(field_25096_l = new GuiButton(2, field_951_c / 2 - 100, i + 24, stringtranslate.func_20163_a("menu.multiplayer")));
        field_949_e.add(new GuiButton(3, field_951_c / 2 - 100, i + 48, stringtranslate.func_20163_a("menu.mods")));
        if(field_945_b.field_6317_l)
        {
            field_949_e.add(new GuiButton(0, field_951_c / 2 - 100, i + 72, stringtranslate.func_20163_a("menu.options")));
        } else
        {
            field_949_e.add(new GuiButton(0, field_951_c / 2 - 100, i + 72 + 12, 98, 20, stringtranslate.func_20163_a("menu.options")));
            field_949_e.add(new GuiButton(4, field_951_c / 2 + 2, i + 72 + 12, 98, 20, stringtranslate.func_20163_a("menu.quit")));
        }
        field_949_e.add(new GuiButtonLanguage(5, field_951_c / 2 - 124, i + 72 + 12));
        if(field_945_b.field_6320_i == null)
        {
            field_25096_l.field_937_g = false;
        }
    }

    protected void func_572_a(GuiButton p_572_1_)
    {
        if(p_572_1_.field_938_f == 0)
        {
            field_945_b.func_6272_a(new GuiOptions(this, field_945_b.field_6304_y));
        }
        if(p_572_1_.field_938_f == 5)
        {
            field_945_b.func_6272_a(new GuiLanguage(this, field_945_b.field_6304_y));
        }
        if(p_572_1_.field_938_f == 1)
        {
            field_945_b.func_6272_a(new GuiSelectWorld(this));
        }
        if(p_572_1_.field_938_f == 2)
        {
            field_945_b.func_6272_a(new GuiMultiplayer(this));
        }
        if(p_572_1_.field_938_f == 3)
        {
            field_945_b.func_6272_a(new GuiTexturePacks(this));
        }
        if(p_572_1_.field_938_f == 4)
        {
            field_945_b.func_6244_d();
        }
    }

    private void func_35355_b(int p_35355_1_, int p_35355_2_, float p_35355_3_)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glMatrixMode(5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GLU.gluPerspective(120F, 1.0F, 0.05F, 10F);
        GL11.glMatrixMode(5888);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glRotatef(180F, 1.0F, 0.0F, 0.0F);
        GL11.glEnable(3042);
        GL11.glDisable(3008);
        GL11.glDisable(2884);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        int i = 8;
        for(int j = 0; j < i * i; j++)
        {
            GL11.glPushMatrix();
            float f = ((float)(j % i) / (float)i - 0.5F) / 64F;
            float f1 = ((float)(j / i) / (float)i - 0.5F) / 64F;
            float f2 = 0.0F;
            GL11.glTranslatef(f, f1, f2);
            GL11.glRotatef(MathHelper.func_1106_a(((float)field_35357_f + p_35355_3_) / 400F) * 25F + 20F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-((float)field_35357_f + p_35355_3_) * 0.1F, 0.0F, 1.0F, 0.0F);
            for(int k = 0; k < 6; k++)
            {
                GL11.glPushMatrix();
                if(k == 1)
                {
                    GL11.glRotatef(90F, 0.0F, 1.0F, 0.0F);
                }
                if(k == 2)
                {
                    GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
                }
                if(k == 3)
                {
                    GL11.glRotatef(-90F, 0.0F, 1.0F, 0.0F);
                }
                if(k == 4)
                {
                    GL11.glRotatef(90F, 1.0F, 0.0F, 0.0F);
                }
                if(k == 5)
                {
                    GL11.glRotatef(-90F, 1.0F, 0.0F, 0.0F);
                }
                GL11.glBindTexture(3553, field_945_b.field_6315_n.func_1070_a((new StringBuilder()).append("/title/bg/panorama").append(k).append(".png").toString()));
                tessellator.func_977_b();
                tessellator.func_6513_a(0xffffff, 255 / (j + 1));
                float f3 = 0.0F;
                tessellator.func_983_a(-1D, -1D, 1.0D, 0.0F + f3, 0.0F + f3);
                tessellator.func_983_a(1.0D, -1D, 1.0D, 1.0F - f3, 0.0F + f3);
                tessellator.func_983_a(1.0D, 1.0D, 1.0D, 1.0F - f3, 1.0F - f3);
                tessellator.func_983_a(-1D, 1.0D, 1.0D, 0.0F + f3, 1.0F - f3);
                tessellator.func_982_a();
                GL11.glPopMatrix();
            }

            GL11.glPopMatrix();
            GL11.glColorMask(true, true, true, false);
        }

        tessellator.func_984_b(0.0D, 0.0D, 0.0D);
        GL11.glColorMask(true, true, true, true);
        GL11.glMatrixMode(5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode(5888);
        GL11.glPopMatrix();
        GL11.glDepthMask(true);
        GL11.glEnable(2884);
        GL11.glEnable(3008);
        GL11.glEnable(2929);
    }

    private void func_35354_a(float p_35354_1_)
    {
        GL11.glBindTexture(3553, field_35358_g);
        GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, 256, 256);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glColorMask(true, true, true, false);
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        byte byte0 = 3;
        for(int i = 0; i < byte0; i++)
        {
            tessellator.func_986_a(1.0F, 1.0F, 1.0F, 1.0F / (float)(i + 1));
            int j = field_951_c;
            int k = field_950_d;
            float f = (float)(i - byte0 / 2) / 256F;
            tessellator.func_983_a(j, k, field_923_k, 0.0F + f, 0.0D);
            tessellator.func_983_a(j, 0.0D, field_923_k, 1.0F + f, 0.0D);
            tessellator.func_983_a(0.0D, 0.0D, field_923_k, 1.0F + f, 1.0D);
            tessellator.func_983_a(0.0D, k, field_923_k, 0.0F + f, 1.0D);
        }

        tessellator.func_982_a();
        GL11.glColorMask(true, true, true, true);
    }

    private void func_35356_c(int p_35356_1_, int p_35356_2_, float p_35356_3_)
    {
        GL11.glViewport(0, 0, 256, 256);
        func_35355_b(p_35356_1_, p_35356_2_, p_35356_3_);
        GL11.glDisable(3553);
        GL11.glEnable(3553);
        func_35354_a(p_35356_3_);
        func_35354_a(p_35356_3_);
        func_35354_a(p_35356_3_);
        func_35354_a(p_35356_3_);
        func_35354_a(p_35356_3_);
        func_35354_a(p_35356_3_);
        func_35354_a(p_35356_3_);
        func_35354_a(p_35356_3_);
        GL11.glViewport(0, 0, field_945_b.field_6326_c, field_945_b.field_6325_d);
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        float f = field_951_c <= field_950_d ? 120F / (float)field_950_d : 120F / (float)field_951_c;
        float f1 = ((float)field_950_d * f) / 256F;
        float f2 = ((float)field_951_c * f) / 256F;
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        tessellator.func_986_a(1.0F, 1.0F, 1.0F, 1.0F);
        int i = field_951_c;
        int j = field_950_d;
        tessellator.func_983_a(0.0D, j, field_923_k, 0.5F - f1, 0.5F + f2);
        tessellator.func_983_a(i, j, field_923_k, 0.5F - f1, 0.5F - f2);
        tessellator.func_983_a(i, 0.0D, field_923_k, 0.5F + f1, 0.5F - f2);
        tessellator.func_983_a(0.0D, 0.0D, field_923_k, 0.5F + f1, 0.5F + f2);
        tessellator.func_982_a();
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        func_35356_c(p_571_1_, p_571_2_, p_571_3_);
        Tessellator tessellator = Tessellator.field_1512_a;
        char c = '\u0112';
        int i = field_951_c / 2 - c / 2;
        byte byte0 = 30;
        func_549_a(0, 0, field_951_c, field_950_d, 0x80ffffff, 0xffffff);
        func_549_a(0, 0, field_951_c, field_950_d, 0, 0x80000000);
        GL11.glBindTexture(3553, field_945_b.field_6315_n.func_1070_a("/title/mclogo.png"));
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if((double)field_989_j < 0.0001D)
        {
            func_550_b(i + 0, byte0 + 0, 0, 0, 99, 44);
            func_550_b(i + 99, byte0 + 0, 129, 0, 27, 44);
            func_550_b(i + 99 + 26, byte0 + 0, 126, 0, 3, 44);
            func_550_b(i + 99 + 26 + 3, byte0 + 0, 99, 0, 26, 44);
            func_550_b(i + 155, byte0 + 0, 0, 45, 155, 44);
        } else
        {
            func_550_b(i + 0, byte0 + 0, 0, 0, 155, 44);
            func_550_b(i + 155, byte0 + 0, 0, 45, 155, 44);
        }
        tessellator.func_990_b(0xffffff);
        GL11.glPushMatrix();
        GL11.glTranslatef(field_951_c / 2 + 90, 70F, 0.0F);
        GL11.glRotatef(-20F, 0.0F, 0.0F, 1.0F);
        float f = 1.8F - MathHelper.func_1112_e(MathHelper.func_1106_a(((float)(System.currentTimeMillis() % 1000L) / 1000F) * 3.141593F * 2.0F) * 0.1F);
        f = (f * 100F) / (float)(field_6451_g.func_871_a(field_6462_l) + 32);
        GL11.glScalef(f, f, f);
        func_548_a(field_6451_g, field_6462_l, 0, -8, 0xffff00);
        GL11.glPopMatrix();
        func_547_b(field_6451_g, "Minecraft 1.2.5", 2, field_950_d - 10, 0xffffff);
        String s = "Copyright Mojang AB. Do not distribute!";
        func_547_b(field_6451_g, s, field_951_c - field_6451_g.func_871_a(s) - 2, field_950_d - 10, 0xffffff);
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }

}
