// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            IProgressUpdate, MinecraftError, ScaledResolution, Tessellator, 
//            RenderEngine, FontRenderer

public class LoadingScreenRenderer
    implements IProgressUpdate
{

    private String field_1004_a;
    private Minecraft field_1003_b;
    private String field_1007_c;
    private long field_1006_d;
    private boolean field_1005_e;

    public LoadingScreenRenderer(Minecraft p_i385_1_)
    {
        field_1004_a = "";
        field_1007_c = "";
        field_1006_d = System.currentTimeMillis();
        field_1005_e = false;
        field_1003_b = p_i385_1_;
    }

    public void func_596_a(String p_596_1_)
    {
        field_1005_e = false;
        func_597_c(p_596_1_);
    }

    public void func_594_b(String p_594_1_)
    {
        field_1005_e = true;
        func_597_c(field_1007_c);
    }

    public void func_597_c(String p_597_1_)
    {
        if(!field_1003_b.field_6293_H)
        {
            if(field_1005_e)
            {
                return;
            } else
            {
                throw new MinecraftError();
            }
        } else
        {
            field_1007_c = p_597_1_;
            ScaledResolution scaledresolution = new ScaledResolution(field_1003_b.field_6304_y, field_1003_b.field_6326_c, field_1003_b.field_6325_d);
            GL11.glClear(256);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glOrtho(0.0D, scaledresolution.field_25121_a, scaledresolution.field_25120_b, 0.0D, 100D, 300D);
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            GL11.glTranslatef(0.0F, 0.0F, -200F);
            return;
        }
    }

    public void func_595_d(String p_595_1_)
    {
        if(!field_1003_b.field_6293_H)
        {
            if(field_1005_e)
            {
                return;
            } else
            {
                throw new MinecraftError();
            }
        } else
        {
            field_1006_d = 0L;
            field_1004_a = p_595_1_;
            func_593_a(-1);
            field_1006_d = 0L;
            return;
        }
    }

    public void func_593_a(int p_593_1_)
    {
        if(!field_1003_b.field_6293_H)
        {
            if(field_1005_e)
            {
                return;
            } else
            {
                throw new MinecraftError();
            }
        }
        long l = System.currentTimeMillis();
        if(l - field_1006_d < 100L)
        {
            return;
        }
        field_1006_d = l;
        ScaledResolution scaledresolution = new ScaledResolution(field_1003_b.field_6304_y, field_1003_b.field_6326_c, field_1003_b.field_6325_d);
        int i = scaledresolution.func_903_a();
        int j = scaledresolution.func_902_b();
        GL11.glClear(256);
        GL11.glMatrixMode(5889);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, scaledresolution.field_25121_a, scaledresolution.field_25120_b, 0.0D, 100D, 300D);
        GL11.glMatrixMode(5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0F, 0.0F, -200F);
        GL11.glClear(16640);
        Tessellator tessellator = Tessellator.field_1512_a;
        int k = field_1003_b.field_6315_n.func_1070_a("/gui/background.png");
        GL11.glBindTexture(3553, k);
        float f = 32F;
        tessellator.func_977_b();
        tessellator.func_990_b(0x404040);
        tessellator.func_983_a(0.0D, j, 0.0D, 0.0D, (float)j / f);
        tessellator.func_983_a(i, j, 0.0D, (float)i / f, (float)j / f);
        tessellator.func_983_a(i, 0.0D, 0.0D, (float)i / f, 0.0D);
        tessellator.func_983_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
        tessellator.func_982_a();
        if(p_593_1_ >= 0)
        {
            byte byte0 = 100;
            byte byte1 = 2;
            int i1 = i / 2 - byte0 / 2;
            int j1 = j / 2 + 16;
            GL11.glDisable(3553);
            tessellator.func_977_b();
            tessellator.func_990_b(0x808080);
            tessellator.func_991_a(i1, j1, 0.0D);
            tessellator.func_991_a(i1, j1 + byte1, 0.0D);
            tessellator.func_991_a(i1 + byte0, j1 + byte1, 0.0D);
            tessellator.func_991_a(i1 + byte0, j1, 0.0D);
            tessellator.func_990_b(0x80ff80);
            tessellator.func_991_a(i1, j1, 0.0D);
            tessellator.func_991_a(i1, j1 + byte1, 0.0D);
            tessellator.func_991_a(i1 + p_593_1_, j1 + byte1, 0.0D);
            tessellator.func_991_a(i1 + p_593_1_, j1, 0.0D);
            tessellator.func_982_a();
            GL11.glEnable(3553);
        }
        field_1003_b.field_6314_o.func_50103_a(field_1007_c, (i - field_1003_b.field_6314_o.func_871_a(field_1007_c)) / 2, j / 2 - 4 - 16, 0xffffff);
        field_1003_b.field_6314_o.func_50103_a(field_1004_a, (i - field_1003_b.field_6314_o.func_871_a(field_1004_a)) / 2, (j / 2 - 4) + 8, 0xffffff);
        Display.update();
        try
        {
            Thread.yield();
        }
        catch(Exception exception) { }
    }
}
