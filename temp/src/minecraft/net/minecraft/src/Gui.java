// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Tessellator, FontRenderer

public class Gui
{

    protected float field_923_k;

    public Gui()
    {
        field_923_k = 0.0F;
    }

    protected void func_27100_a(int p_27100_1_, int p_27100_2_, int p_27100_3_, int p_27100_4_)
    {
        if(p_27100_2_ < p_27100_1_)
        {
            int i = p_27100_1_;
            p_27100_1_ = p_27100_2_;
            p_27100_2_ = i;
        }
        func_551_a(p_27100_1_, p_27100_3_, p_27100_2_ + 1, p_27100_3_ + 1, p_27100_4_);
    }

    protected void func_27099_b(int p_27099_1_, int p_27099_2_, int p_27099_3_, int p_27099_4_)
    {
        if(p_27099_3_ < p_27099_2_)
        {
            int i = p_27099_2_;
            p_27099_2_ = p_27099_3_;
            p_27099_3_ = i;
        }
        func_551_a(p_27099_1_, p_27099_2_ + 1, p_27099_1_ + 1, p_27099_3_, p_27099_4_);
    }

    public static void func_551_a(int p_551_1_, int p_551_2_, int p_551_3_, int p_551_4_, int p_551_5_)
    {
        if(p_551_1_ < p_551_3_)
        {
            int i = p_551_1_;
            p_551_1_ = p_551_3_;
            p_551_3_ = i;
        }
        if(p_551_2_ < p_551_4_)
        {
            int j = p_551_2_;
            p_551_2_ = p_551_4_;
            p_551_4_ = j;
        }
        float f = (float)(p_551_5_ >> 24 & 0xff) / 255F;
        float f1 = (float)(p_551_5_ >> 16 & 0xff) / 255F;
        float f2 = (float)(p_551_5_ >> 8 & 0xff) / 255F;
        float f3 = (float)(p_551_5_ & 0xff) / 255F;
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(f1, f2, f3, f);
        tessellator.func_977_b();
        tessellator.func_991_a(p_551_1_, p_551_4_, 0.0D);
        tessellator.func_991_a(p_551_3_, p_551_4_, 0.0D);
        tessellator.func_991_a(p_551_3_, p_551_2_, 0.0D);
        tessellator.func_991_a(p_551_1_, p_551_2_, 0.0D);
        tessellator.func_982_a();
        GL11.glEnable(3553);
        GL11.glDisable(3042);
    }

    protected void func_549_a(int p_549_1_, int p_549_2_, int p_549_3_, int p_549_4_, int p_549_5_, int p_549_6_)
    {
        float f = (float)(p_549_5_ >> 24 & 0xff) / 255F;
        float f1 = (float)(p_549_5_ >> 16 & 0xff) / 255F;
        float f2 = (float)(p_549_5_ >> 8 & 0xff) / 255F;
        float f3 = (float)(p_549_5_ & 0xff) / 255F;
        float f4 = (float)(p_549_6_ >> 24 & 0xff) / 255F;
        float f5 = (float)(p_549_6_ >> 16 & 0xff) / 255F;
        float f6 = (float)(p_549_6_ >> 8 & 0xff) / 255F;
        float f7 = (float)(p_549_6_ & 0xff) / 255F;
        GL11.glDisable(3553);
        GL11.glEnable(3042);
        GL11.glDisable(3008);
        GL11.glBlendFunc(770, 771);
        GL11.glShadeModel(7425);
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        tessellator.func_986_a(f1, f2, f3, f);
        tessellator.func_991_a(p_549_3_, p_549_2_, field_923_k);
        tessellator.func_991_a(p_549_1_, p_549_2_, field_923_k);
        tessellator.func_986_a(f5, f6, f7, f4);
        tessellator.func_991_a(p_549_1_, p_549_4_, field_923_k);
        tessellator.func_991_a(p_549_3_, p_549_4_, field_923_k);
        tessellator.func_982_a();
        GL11.glShadeModel(7424);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glEnable(3553);
    }

    public void func_548_a(FontRenderer p_548_1_, String p_548_2_, int p_548_3_, int p_548_4_, int p_548_5_)
    {
        p_548_1_.func_50103_a(p_548_2_, p_548_3_ - p_548_1_.func_871_a(p_548_2_) / 2, p_548_4_, p_548_5_);
    }

    public void func_547_b(FontRenderer p_547_1_, String p_547_2_, int p_547_3_, int p_547_4_, int p_547_5_)
    {
        p_547_1_.func_50103_a(p_547_2_, p_547_3_, p_547_4_, p_547_5_);
    }

    public void func_550_b(int p_550_1_, int p_550_2_, int p_550_3_, int p_550_4_, int p_550_5_, int p_550_6_)
    {
        float f = 0.00390625F;
        float f1 = 0.00390625F;
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        tessellator.func_983_a(p_550_1_ + 0, p_550_2_ + p_550_6_, field_923_k, (float)(p_550_3_ + 0) * f, (float)(p_550_4_ + p_550_6_) * f1);
        tessellator.func_983_a(p_550_1_ + p_550_5_, p_550_2_ + p_550_6_, field_923_k, (float)(p_550_3_ + p_550_5_) * f, (float)(p_550_4_ + p_550_6_) * f1);
        tessellator.func_983_a(p_550_1_ + p_550_5_, p_550_2_ + 0, field_923_k, (float)(p_550_3_ + p_550_5_) * f, (float)(p_550_4_ + 0) * f1);
        tessellator.func_983_a(p_550_1_ + 0, p_550_2_ + 0, field_923_k, (float)(p_550_3_ + 0) * f, (float)(p_550_4_ + 0) * f1);
        tessellator.func_982_a();
    }
}
