// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, ModelDragon, EntityDragon, MathHelper, 
//            ModelBase, EntityEnderCrystal, Tessellator, RenderHelper, 
//            OpenGlHelper, EntityLiving, Entity

public class RenderDragon extends RenderLiving
{

    public static EntityDragon field_41038_a;
    private static int field_40284_d = 0;
    protected ModelDragon field_40285_c;

    public RenderDragon()
    {
        super(new ModelDragon(0.0F), 0.5F);
        field_40285_c = (ModelDragon)field_20920_e;
        func_4013_a(field_20920_e);
    }

    protected void func_40282_a(EntityDragon p_40282_1_, float p_40282_2_, float p_40282_3_, float p_40282_4_)
    {
        float f = (float)p_40282_1_.func_40160_a(7, p_40282_4_)[0];
        float f1 = (float)(p_40282_1_.func_40160_a(5, p_40282_4_)[1] - p_40282_1_.func_40160_a(10, p_40282_4_)[1]);
        GL11.glRotatef(-f, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(f1 * 10F, 1.0F, 0.0F, 0.0F);
        GL11.glTranslatef(0.0F, 0.0F, 1.0F);
        if(p_40282_1_.field_712_J > 0)
        {
            float f2 = ((((float)p_40282_1_.field_712_J + p_40282_4_) - 1.0F) / 20F) * 1.6F;
            f2 = MathHelper.func_1113_c(f2);
            if(f2 > 1.0F)
            {
                f2 = 1.0F;
            }
            GL11.glRotatef(f2 * func_172_a(p_40282_1_), 0.0F, 0.0F, 1.0F);
        }
    }

    protected void func_40280_a(EntityDragon p_40280_1_, float p_40280_2_, float p_40280_3_, float p_40280_4_, float p_40280_5_, float p_40280_6_, float p_40280_7_)
    {
        if(p_40280_1_.field_40178_aA > 0)
        {
            float f = (float)p_40280_1_.field_40178_aA / 200F;
            GL11.glDepthFunc(515);
            GL11.glEnable(3008);
            GL11.glAlphaFunc(516, f);
            func_140_a(p_40280_1_.field_20047_bv, "/mob/enderdragon/shuffle.png");
            field_20920_e.func_864_b(p_40280_1_, p_40280_2_, p_40280_3_, p_40280_4_, p_40280_5_, p_40280_6_, p_40280_7_);
            GL11.glAlphaFunc(516, 0.1F);
            GL11.glDepthFunc(514);
        }
        func_140_a(p_40280_1_.field_20047_bv, p_40280_1_.func_6376_z());
        field_20920_e.func_864_b(p_40280_1_, p_40280_2_, p_40280_3_, p_40280_4_, p_40280_5_, p_40280_6_, p_40280_7_);
        if(p_40280_1_.field_715_G > 0)
        {
            GL11.glDepthFunc(514);
            GL11.glDisable(3553);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glColor4f(1.0F, 0.0F, 0.0F, 0.5F);
            field_20920_e.func_864_b(p_40280_1_, p_40280_2_, p_40280_3_, p_40280_4_, p_40280_5_, p_40280_6_, p_40280_7_);
            GL11.glEnable(3553);
            GL11.glDisable(3042);
            GL11.glDepthFunc(515);
        }
    }

    public void func_40281_a(EntityDragon p_40281_1_, double p_40281_2_, double p_40281_4_, double p_40281_6_, 
            float p_40281_8_, float p_40281_9_)
    {
        field_41038_a = p_40281_1_;
        if(field_40284_d != 4)
        {
            field_20920_e = new ModelDragon(0.0F);
            field_40284_d = 4;
        }
        super.func_171_a(p_40281_1_, p_40281_2_, p_40281_4_, p_40281_6_, p_40281_8_, p_40281_9_);
        if(p_40281_1_.field_41013_bH != null)
        {
            float f = (float)p_40281_1_.field_41013_bH.field_41032_a + p_40281_9_;
            float f1 = MathHelper.func_1106_a(f * 0.2F) / 2.0F + 0.5F;
            f1 = (f1 * f1 + f1) * 0.2F;
            float f2 = (float)(p_40281_1_.field_41013_bH.field_611_ak - p_40281_1_.field_611_ak - (p_40281_1_.field_9285_at - p_40281_1_.field_611_ak) * (double)(1.0F - p_40281_9_));
            float f3 = (float)(((double)f1 + p_40281_1_.field_41013_bH.field_610_al) - 1.0D - p_40281_1_.field_610_al - (p_40281_1_.field_9284_au - p_40281_1_.field_610_al) * (double)(1.0F - p_40281_9_));
            float f4 = (float)(p_40281_1_.field_41013_bH.field_609_am - p_40281_1_.field_609_am - (p_40281_1_.field_9283_av - p_40281_1_.field_609_am) * (double)(1.0F - p_40281_9_));
            float f5 = MathHelper.func_1113_c(f2 * f2 + f4 * f4);
            float f6 = MathHelper.func_1113_c(f2 * f2 + f3 * f3 + f4 * f4);
            GL11.glPushMatrix();
            GL11.glTranslatef((float)p_40281_2_, (float)p_40281_4_ + 2.0F, (float)p_40281_6_);
            GL11.glRotatef(((float)(-Math.atan2(f4, f2)) * 180F) / 3.141593F - 90F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(((float)(-Math.atan2(f5, f3)) * 180F) / 3.141593F - 90F, 1.0F, 0.0F, 0.0F);
            Tessellator tessellator = Tessellator.field_1512_a;
            RenderHelper.func_1159_a();
            GL11.glDisable(2884);
            func_151_a("/mob/enderdragon/beam.png");
            GL11.glShadeModel(7425);
            float f7 = 0.0F - ((float)p_40281_1_.field_9311_be + p_40281_9_) * 0.01F;
            float f8 = MathHelper.func_1113_c(f2 * f2 + f3 * f3 + f4 * f4) / 32F - ((float)p_40281_1_.field_9311_be + p_40281_9_) * 0.01F;
            tessellator.func_992_a(5);
            int i = 8;
            for(int j = 0; j <= i; j++)
            {
                float f9 = MathHelper.func_1106_a(((float)(j % i) * 3.141593F * 2.0F) / (float)i) * 0.75F;
                float f10 = MathHelper.func_1114_b(((float)(j % i) * 3.141593F * 2.0F) / (float)i) * 0.75F;
                float f11 = ((float)(j % i) * 1.0F) / (float)i;
                tessellator.func_990_b(0);
                tessellator.func_983_a(f9 * 0.2F, f10 * 0.2F, 0.0D, f11, f8);
                tessellator.func_990_b(0xffffff);
                tessellator.func_983_a(f9, f10, f6, f11, f7);
            }

            tessellator.func_982_a();
            GL11.glEnable(2884);
            GL11.glShadeModel(7424);
            RenderHelper.func_1158_b();
            GL11.glPopMatrix();
        }
    }

    protected void func_40279_a(EntityDragon p_40279_1_, float p_40279_2_)
    {
        super.func_6331_b(p_40279_1_, p_40279_2_);
        Tessellator tessellator = Tessellator.field_1512_a;
        if(p_40279_1_.field_40178_aA > 0)
        {
            RenderHelper.func_1159_a();
            float f = ((float)p_40279_1_.field_40178_aA + p_40279_2_) / 200F;
            float f1 = 0.0F;
            if(f > 0.8F)
            {
                f1 = (f - 0.8F) / 0.2F;
            }
            Random random = new Random(432L);
            GL11.glDisable(3553);
            GL11.glShadeModel(7425);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 1);
            GL11.glDisable(3008);
            GL11.glEnable(2884);
            GL11.glDepthMask(false);
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, -1F, -2F);
            for(int i = 0; (float)i < ((f + f * f) / 2.0F) * 60F; i++)
            {
                GL11.glRotatef(random.nextFloat() * 360F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(random.nextFloat() * 360F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(random.nextFloat() * 360F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(random.nextFloat() * 360F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(random.nextFloat() * 360F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(random.nextFloat() * 360F + f * 90F, 0.0F, 0.0F, 1.0F);
                tessellator.func_992_a(6);
                float f2 = random.nextFloat() * 20F + 5F + f1 * 10F;
                float f3 = random.nextFloat() * 2.0F + 1.0F + f1 * 2.0F;
                tessellator.func_6513_a(0xffffff, (int)(255F * (1.0F - f1)));
                tessellator.func_991_a(0.0D, 0.0D, 0.0D);
                tessellator.func_6513_a(0xff00ff, 0);
                tessellator.func_991_a(-0.86599999999999999D * (double)f3, f2, -0.5F * f3);
                tessellator.func_991_a(0.86599999999999999D * (double)f3, f2, -0.5F * f3);
                tessellator.func_991_a(0.0D, f2, 1.0F * f3);
                tessellator.func_991_a(-0.86599999999999999D * (double)f3, f2, -0.5F * f3);
                tessellator.func_982_a();
            }

            GL11.glPopMatrix();
            GL11.glDepthMask(true);
            GL11.glDisable(2884);
            GL11.glDisable(3042);
            GL11.glShadeModel(7424);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glEnable(3553);
            GL11.glEnable(3008);
            RenderHelper.func_1158_b();
        }
    }

    protected int func_40283_a(EntityDragon p_40283_1_, int p_40283_2_, float p_40283_3_)
    {
        if(p_40283_2_ == 1)
        {
            GL11.glDepthFunc(515);
        }
        if(p_40283_2_ != 0)
        {
            return -1;
        } else
        {
            func_151_a("/mob/enderdragon/ender_eyes.png");
            float f = 1.0F;
            GL11.glEnable(3042);
            GL11.glDisable(3008);
            GL11.glBlendFunc(1, 1);
            GL11.glDisable(2896);
            GL11.glDepthFunc(514);
            int i = 61680;
            int j = i % 0x10000;
            int k = i / 0x10000;
            OpenGlHelper.func_40454_a(OpenGlHelper.field_40455_b, (float)j / 1.0F, (float)k / 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glEnable(2896);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, f);
            return 1;
        }
    }

    protected int func_166_a(EntityLiving p_166_1_, int p_166_2_, float p_166_3_)
    {
        return func_40283_a((EntityDragon)p_166_1_, p_166_2_, p_166_3_);
    }

    protected void func_6331_b(EntityLiving p_6331_1_, float p_6331_2_)
    {
        func_40279_a((EntityDragon)p_6331_1_, p_6331_2_);
    }

    protected void func_21004_a(EntityLiving p_21004_1_, float p_21004_2_, float p_21004_3_, float p_21004_4_)
    {
        func_40282_a((EntityDragon)p_21004_1_, p_21004_2_, p_21004_3_, p_21004_4_);
    }

    protected void func_40270_a(EntityLiving p_40270_1_, float p_40270_2_, float p_40270_3_, float p_40270_4_, float p_40270_5_, float p_40270_6_, float p_40270_7_)
    {
        func_40280_a((EntityDragon)p_40270_1_, p_40270_2_, p_40270_3_, p_40270_4_, p_40270_5_, p_40270_6_, p_40270_7_);
    }

    public void func_171_a(EntityLiving p_171_1_, double p_171_2_, double p_171_4_, double p_171_6_, 
            float p_171_8_, float p_171_9_)
    {
        func_40281_a((EntityDragon)p_171_1_, p_171_2_, p_171_4_, p_171_6_, p_171_8_, p_171_9_);
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_40281_a((EntityDragon)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }

}
