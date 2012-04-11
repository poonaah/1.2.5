// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, ModelBase, EntityLiving, OpenGlHelper, 
//            MathHelper, RenderManager, Tessellator, FontRenderer, 
//            Entity

public class RenderLiving extends Render
{

    protected ModelBase field_20920_e;
    protected ModelBase field_6332_f;

    public RenderLiving(ModelBase p_i315_1_, float p_i315_2_)
    {
        field_20920_e = p_i315_1_;
        field_9246_c = p_i315_2_;
    }

    public void func_4013_a(ModelBase p_4013_1_)
    {
        field_6332_f = p_4013_1_;
    }

    private float func_48418_a(float p_48418_1_, float p_48418_2_, float p_48418_3_)
    {
        float f;
        for(f = p_48418_2_ - p_48418_1_; f < -180F; f += 360F) { }
        for(; f >= 180F; f -= 360F) { }
        return p_48418_1_ + p_48418_3_ * f;
    }

    public void func_171_a(EntityLiving p_171_1_, double p_171_2_, double p_171_4_, double p_171_6_, 
            float p_171_8_, float p_171_9_)
    {
        GL11.glPushMatrix();
        GL11.glDisable(2884);
        field_20920_e.field_1244_k = func_167_c(p_171_1_, p_171_9_);
        if(field_6332_f != null)
        {
            field_6332_f.field_1244_k = field_20920_e.field_1244_k;
        }
        field_20920_e.field_1243_l = p_171_1_.func_21063_V();
        if(field_6332_f != null)
        {
            field_6332_f.field_1243_l = field_20920_e.field_1243_l;
        }
        field_20920_e.field_40301_k = p_171_1_.func_40127_l();
        if(field_6332_f != null)
        {
            field_6332_f.field_40301_k = field_20920_e.field_40301_k;
        }
        try
        {
            float f = func_48418_a(p_171_1_.field_734_o, p_171_1_.field_735_n, p_171_9_);
            float f1 = func_48418_a(p_171_1_.field_46016_bg, p_171_1_.field_46015_bf, p_171_9_);
            float f2 = p_171_1_.field_602_at + (p_171_1_.field_604_ar - p_171_1_.field_602_at) * p_171_9_;
            func_22012_b(p_171_1_, p_171_2_, p_171_4_, p_171_6_);
            float f3 = func_170_d(p_171_1_, p_171_9_);
            func_21004_a(p_171_1_, f3, f, p_171_9_);
            float f4 = 0.0625F;
            GL11.glEnable(32826);
            GL11.glScalef(-1F, -1F, 1.0F);
            func_6330_a(p_171_1_, p_171_9_);
            GL11.glTranslatef(0.0F, -24F * f4 - 0.0078125F, 0.0F);
            float f5 = p_171_1_.field_705_Q + (p_171_1_.field_704_R - p_171_1_.field_705_Q) * p_171_9_;
            float f6 = p_171_1_.field_703_S - p_171_1_.field_704_R * (1.0F - p_171_9_);
            if(p_171_1_.func_40127_l())
            {
                f6 *= 3F;
            }
            if(f5 > 1.0F)
            {
                f5 = 1.0F;
            }
            GL11.glEnable(3008);
            field_20920_e.func_25103_a(p_171_1_, f6, f5, p_171_9_);
            func_40270_a(p_171_1_, f6, f5, f3, f1 - f, f2, f4);
            for(int i = 0; i < 4; i++)
            {
                int j = func_166_a(p_171_1_, i, p_171_9_);
                if(j <= 0)
                {
                    continue;
                }
                field_6332_f.func_25103_a(p_171_1_, f6, f5, p_171_9_);
                field_6332_f.func_864_b(p_171_1_, f6, f5, f3, f1 - f, f2, f4);
                if(j == 15)
                {
                    float f8 = (float)p_171_1_.field_9311_be + p_171_9_;
                    func_151_a("%blur%/misc/glint.png");
                    GL11.glEnable(3042);
                    float f10 = 0.5F;
                    GL11.glColor4f(f10, f10, f10, 1.0F);
                    GL11.glDepthFunc(514);
                    GL11.glDepthMask(false);
                    for(int i1 = 0; i1 < 2; i1++)
                    {
                        GL11.glDisable(2896);
                        float f13 = 0.76F;
                        GL11.glColor4f(0.5F * f13, 0.25F * f13, 0.8F * f13, 1.0F);
                        GL11.glBlendFunc(768, 1);
                        GL11.glMatrixMode(5890);
                        GL11.glLoadIdentity();
                        float f15 = f8 * (0.001F + (float)i1 * 0.003F) * 20F;
                        float f16 = 0.3333333F;
                        GL11.glScalef(f16, f16, f16);
                        GL11.glRotatef(30F - (float)i1 * 60F, 0.0F, 0.0F, 1.0F);
                        GL11.glTranslatef(0.0F, f15, 0.0F);
                        GL11.glMatrixMode(5888);
                        field_6332_f.func_864_b(p_171_1_, f6, f5, f3, f1 - f, f2, f4);
                    }

                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                    GL11.glMatrixMode(5890);
                    GL11.glDepthMask(true);
                    GL11.glLoadIdentity();
                    GL11.glMatrixMode(5888);
                    GL11.glEnable(2896);
                    GL11.glDisable(3042);
                    GL11.glDepthFunc(515);
                }
                GL11.glDisable(3042);
                GL11.glEnable(3008);
            }

            func_6331_b(p_171_1_, p_171_9_);
            float f7 = p_171_1_.func_382_a(p_171_9_);
            int k = func_173_a(p_171_1_, f7, p_171_9_);
            OpenGlHelper.func_40452_a(OpenGlHelper.field_40455_b);
            GL11.glDisable(3553);
            OpenGlHelper.func_40452_a(OpenGlHelper.field_40457_a);
            if((k >> 24 & 0xff) > 0 || p_171_1_.field_715_G > 0 || p_171_1_.field_712_J > 0)
            {
                GL11.glDisable(3553);
                GL11.glDisable(3008);
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
                GL11.glDepthFunc(514);
                if(p_171_1_.field_715_G > 0 || p_171_1_.field_712_J > 0)
                {
                    GL11.glColor4f(f7, 0.0F, 0.0F, 0.4F);
                    field_20920_e.func_864_b(p_171_1_, f6, f5, f3, f1 - f, f2, f4);
                    for(int l = 0; l < 4; l++)
                    {
                        if(func_27005_b(p_171_1_, l, p_171_9_) >= 0)
                        {
                            GL11.glColor4f(f7, 0.0F, 0.0F, 0.4F);
                            field_6332_f.func_864_b(p_171_1_, f6, f5, f3, f1 - f, f2, f4);
                        }
                    }

                }
                if((k >> 24 & 0xff) > 0)
                {
                    float f9 = (float)(k >> 16 & 0xff) / 255F;
                    float f11 = (float)(k >> 8 & 0xff) / 255F;
                    float f12 = (float)(k & 0xff) / 255F;
                    float f14 = (float)(k >> 24 & 0xff) / 255F;
                    GL11.glColor4f(f9, f11, f12, f14);
                    field_20920_e.func_864_b(p_171_1_, f6, f5, f3, f1 - f, f2, f4);
                    for(int j1 = 0; j1 < 4; j1++)
                    {
                        if(func_27005_b(p_171_1_, j1, p_171_9_) >= 0)
                        {
                            GL11.glColor4f(f9, f11, f12, f14);
                            field_6332_f.func_864_b(p_171_1_, f6, f5, f3, f1 - f, f2, f4);
                        }
                    }

                }
                GL11.glDepthFunc(515);
                GL11.glDisable(3042);
                GL11.glEnable(3008);
                GL11.glEnable(3553);
            }
            GL11.glDisable(32826);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        OpenGlHelper.func_40452_a(OpenGlHelper.field_40455_b);
        GL11.glEnable(3553);
        OpenGlHelper.func_40452_a(OpenGlHelper.field_40457_a);
        GL11.glEnable(2884);
        GL11.glPopMatrix();
        func_22014_a(p_171_1_, p_171_2_, p_171_4_, p_171_6_);
    }

    protected void func_40270_a(EntityLiving p_40270_1_, float p_40270_2_, float p_40270_3_, float p_40270_4_, float p_40270_5_, float p_40270_6_, float p_40270_7_)
    {
        func_140_a(p_40270_1_.field_20047_bv, p_40270_1_.func_6376_z());
        field_20920_e.func_864_b(p_40270_1_, p_40270_2_, p_40270_3_, p_40270_4_, p_40270_5_, p_40270_6_, p_40270_7_);
    }

    protected void func_22012_b(EntityLiving p_22012_1_, double p_22012_2_, double p_22012_4_, double p_22012_6_)
    {
        GL11.glTranslatef((float)p_22012_2_, (float)p_22012_4_, (float)p_22012_6_);
    }

    protected void func_21004_a(EntityLiving p_21004_1_, float p_21004_2_, float p_21004_3_, float p_21004_4_)
    {
        GL11.glRotatef(180F - p_21004_3_, 0.0F, 1.0F, 0.0F);
        if(p_21004_1_.field_712_J > 0)
        {
            float f = ((((float)p_21004_1_.field_712_J + p_21004_4_) - 1.0F) / 20F) * 1.6F;
            f = MathHelper.func_1113_c(f);
            if(f > 1.0F)
            {
                f = 1.0F;
            }
            GL11.glRotatef(f * func_172_a(p_21004_1_), 0.0F, 0.0F, 1.0F);
        }
    }

    protected float func_167_c(EntityLiving p_167_1_, float p_167_2_)
    {
        return p_167_1_.func_431_d(p_167_2_);
    }

    protected float func_170_d(EntityLiving p_170_1_, float p_170_2_)
    {
        return (float)p_170_1_.field_9311_be + p_170_2_;
    }

    protected void func_6331_b(EntityLiving entityliving, float f)
    {
    }

    protected int func_27005_b(EntityLiving p_27005_1_, int p_27005_2_, float p_27005_3_)
    {
        return func_166_a(p_27005_1_, p_27005_2_, p_27005_3_);
    }

    protected int func_166_a(EntityLiving p_166_1_, int p_166_2_, float p_166_3_)
    {
        return -1;
    }

    protected float func_172_a(EntityLiving p_172_1_)
    {
        return 90F;
    }

    protected int func_173_a(EntityLiving p_173_1_, float p_173_2_, float p_173_3_)
    {
        return 0;
    }

    protected void func_6330_a(EntityLiving entityliving, float f)
    {
    }

    protected void func_22014_a(EntityLiving p_22014_1_, double p_22014_2_, double p_22014_4_, double p_22014_6_)
    {
        if(!Minecraft.func_22007_w());
    }

    protected void func_22013_a(EntityLiving p_22013_1_, String p_22013_2_, double p_22013_3_, double p_22013_5_, double p_22013_7_, int p_22013_9_)
    {
        float f = p_22013_1_.func_379_d(field_191_a.field_22188_h);
        if(f > (float)p_22013_9_)
        {
            return;
        }
        FontRenderer fontrenderer = func_6329_a();
        float f1 = 1.6F;
        float f2 = 0.01666667F * f1;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)p_22013_3_ + 0.0F, (float)p_22013_5_ + 2.3F, (float)p_22013_7_);
        GL11.glNormal3f(0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-field_191_a.field_1225_i, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(field_191_a.field_1224_j, 1.0F, 0.0F, 0.0F);
        GL11.glScalef(-f2, -f2, f2);
        GL11.glDisable(2896);
        GL11.glDepthMask(false);
        GL11.glDisable(2929);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        Tessellator tessellator = Tessellator.field_1512_a;
        byte byte0 = 0;
        if(p_22013_2_.equals("deadmau5"))
        {
            byte0 = -10;
        }
        GL11.glDisable(3553);
        tessellator.func_977_b();
        int i = fontrenderer.func_871_a(p_22013_2_) / 2;
        tessellator.func_986_a(0.0F, 0.0F, 0.0F, 0.25F);
        tessellator.func_991_a(-i - 1, -1 + byte0, 0.0D);
        tessellator.func_991_a(-i - 1, 8 + byte0, 0.0D);
        tessellator.func_991_a(i + 1, 8 + byte0, 0.0D);
        tessellator.func_991_a(i + 1, -1 + byte0, 0.0D);
        tessellator.func_982_a();
        GL11.glEnable(3553);
        fontrenderer.func_873_b(p_22013_2_, -fontrenderer.func_871_a(p_22013_2_) / 2, byte0, 0x20ffffff);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
        fontrenderer.func_873_b(p_22013_2_, -fontrenderer.func_871_a(p_22013_2_) / 2, byte0, -1);
        GL11.glEnable(2896);
        GL11.glDisable(3042);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glPopMatrix();
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_171_a((EntityLiving)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
