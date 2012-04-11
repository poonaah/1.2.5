// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.*;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            GuiScreen, World, EntityClientPlayerMP, Packet9Respawn, 
//            WorldInfo, NetClientHandler, Session, FontRenderer, 
//            Tessellator, RenderEngine, GuiButton

public class GuiWinGame extends GuiScreen
{

    private int field_41046_a;
    private List field_41044_b;
    private int field_41042_d;
    private float field_41043_e;

    public GuiWinGame()
    {
        field_41046_a = 0;
        field_41042_d = 0;
        field_41043_e = 0.5F;
    }

    public void func_570_g()
    {
        field_41046_a++;
        float f = (float)(field_41042_d + field_950_d + field_950_d + 24) / field_41043_e;
        if((float)field_41046_a > f)
        {
            func_41041_e();
        }
    }

    protected void func_580_a(char p_580_1_, int p_580_2_)
    {
        if(p_580_2_ == 1)
        {
            func_41041_e();
        }
    }

    private void func_41041_e()
    {
        if(field_945_b.field_6324_e.field_1026_y)
        {
            EntityClientPlayerMP entityclientplayermp = (EntityClientPlayerMP)field_945_b.field_6322_g;
            entityclientplayermp.field_797_bg.func_847_a(new Packet9Respawn(entityclientplayermp.field_4129_m, (byte)field_945_b.field_6324_e.field_1039_l, field_945_b.field_6324_e.func_22144_v().func_46133_t(), field_945_b.field_6324_e.func_48453_b(), 0));
        } else
        {
            field_945_b.func_6272_a(null);
            field_945_b.func_6239_p(field_945_b.field_6324_e.field_1026_y, 0, true);
        }
    }

    public boolean func_6450_b()
    {
        return true;
    }

    public void func_6448_a()
    {
        if(field_41044_b != null)
        {
            return;
        }
        field_41044_b = new ArrayList();
        try
        {
            String s = "";
            String s1 = "\247f\247k\247a\247b";
            char c = '\u0112';
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader((net.minecraft.src.GuiWinGame.class).getResourceAsStream("/title/win.txt"), Charset.forName("UTF-8")));
            Random random = new Random(0x7bf7d3L);
            while((s = bufferedreader.readLine()) != null) 
            {
                String s2;
                String s3;
                for(s = s.replaceAll("PLAYERNAME", field_945_b.field_6320_i.field_1666_b); s.indexOf(s1) >= 0; s = (new StringBuilder()).append(s2).append("\247f\247k").append("XXXXXXXX".substring(0, random.nextInt(4) + 3)).append(s3).toString())
                {
                    int i = s.indexOf(s1);
                    s2 = s.substring(0, i);
                    s3 = s.substring(i + s1.length());
                }

                field_41044_b.addAll(field_945_b.field_6314_o.func_50108_c(s, c));
                field_41044_b.add("");
            }
            for(int j = 0; j < 8; j++)
            {
                field_41044_b.add("");
            }

            bufferedreader = new BufferedReader(new InputStreamReader((net.minecraft.src.GuiWinGame.class).getResourceAsStream("/title/credits.txt"), Charset.forName("UTF-8")));
            while((s = bufferedreader.readLine()) != null) 
            {
                s = s.replaceAll("PLAYERNAME", field_945_b.field_6320_i.field_1666_b);
                s = s.replaceAll("\t", "    ");
                field_41044_b.addAll(field_945_b.field_6314_o.func_50108_c(s, c));
                field_41044_b.add("");
            }
            field_41042_d = field_41044_b.size() * 12;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    protected void func_572_a(GuiButton guibutton)
    {
    }

    private void func_41040_b(int p_41040_1_, int p_41040_2_, float p_41040_3_)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glBindTexture(3553, field_945_b.field_6315_n.func_1070_a("%blur%/gui/background.png"));
        tessellator.func_977_b();
        tessellator.func_986_a(1.0F, 1.0F, 1.0F, 1.0F);
        int i = field_951_c;
        float f = 0.0F - ((float)field_41046_a + p_41040_3_) * 0.5F * field_41043_e;
        float f1 = (float)field_950_d - ((float)field_41046_a + p_41040_3_) * 0.5F * field_41043_e;
        float f2 = 0.015625F;
        float f3 = (((float)field_41046_a + p_41040_3_) - 0.0F) * 0.02F;
        float f4 = (float)(field_41042_d + field_950_d + field_950_d + 24) / field_41043_e;
        float f5 = (f4 - 20F - ((float)field_41046_a + p_41040_3_)) * 0.005F;
        if(f5 < f3)
        {
            f3 = f5;
        }
        if(f3 > 1.0F)
        {
            f3 = 1.0F;
        }
        f3 *= f3;
        f3 = (f3 * 96F) / 255F;
        tessellator.func_987_a(f3, f3, f3);
        tessellator.func_983_a(0.0D, field_950_d, field_923_k, 0.0D, f * f2);
        tessellator.func_983_a(i, field_950_d, field_923_k, (float)i * f2, f * f2);
        tessellator.func_983_a(i, 0.0D, field_923_k, (float)i * f2, f1 * f2);
        tessellator.func_983_a(0.0D, 0.0D, field_923_k, 0.0D, f1 * f2);
        tessellator.func_982_a();
    }

    public void func_571_a(int p_571_1_, int p_571_2_, float p_571_3_)
    {
        func_41040_b(p_571_1_, p_571_2_, p_571_3_);
        Tessellator tessellator = Tessellator.field_1512_a;
        char c = '\u0112';
        int i = field_951_c / 2 - c / 2;
        int j = field_950_d + 50;
        float f = -((float)field_41046_a + p_571_3_) * field_41043_e;
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, f, 0.0F);
        GL11.glBindTexture(3553, field_945_b.field_6315_n.func_1070_a("/title/mclogo.png"));
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        func_550_b(i, j, 0, 0, 155, 44);
        func_550_b(i + 155, j, 0, 45, 155, 44);
        tessellator.func_990_b(0xffffff);
        int k = j + 200;
        for(int l = 0; l < field_41044_b.size(); l++)
        {
            if(l == field_41044_b.size() - 1)
            {
                float f1 = ((float)k + f) - (float)(field_950_d / 2 - 6);
                if(f1 < 0.0F)
                {
                    GL11.glTranslatef(0.0F, -f1, 0.0F);
                }
            }
            if((float)k + f + 12F + 8F > 0.0F && (float)k + f < (float)field_950_d)
            {
                String s = (String)field_41044_b.get(l);
                if(s.startsWith("[C]"))
                {
                    field_6451_g.func_50103_a(s.substring(3), i + (c - field_6451_g.func_871_a(s.substring(3))) / 2, k, 0xffffff);
                } else
                {
                    field_6451_g.field_41064_c.setSeed((long)l * 0xfca99533L + (long)(field_41046_a / 4));
                    field_6451_g.func_50101_a(s, i + 1, k + 1, 0xffffff, true);
                    field_6451_g.field_41064_c.setSeed((long)l * 0xfca99533L + (long)(field_41046_a / 4));
                    field_6451_g.func_50101_a(s, i, k, 0xffffff, false);
                }
            }
            k += 12;
        }

        GL11.glPopMatrix();
        GL11.glBindTexture(3553, field_945_b.field_6315_n.func_1070_a("%blur%/misc/vignette.png"));
        GL11.glEnable(3042);
        GL11.glBlendFunc(0, 769);
        tessellator.func_977_b();
        tessellator.func_986_a(1.0F, 1.0F, 1.0F, 1.0F);
        int i1 = field_951_c;
        int j1 = field_950_d;
        tessellator.func_983_a(0.0D, j1, field_923_k, 0.0D, 1.0D);
        tessellator.func_983_a(i1, j1, field_923_k, 1.0D, 1.0D);
        tessellator.func_983_a(i1, 0.0D, field_923_k, 1.0D, 0.0D);
        tessellator.func_983_a(0.0D, 0.0D, field_923_k, 0.0D, 0.0D);
        tessellator.func_982_a();
        GL11.glDisable(3042);
        super.func_571_a(p_571_1_, p_571_2_, p_571_3_);
    }
}
