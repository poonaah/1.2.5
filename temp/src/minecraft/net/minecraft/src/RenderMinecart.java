// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, ModelMinecart, EntityMinecart, Vec3D, 
//            MathHelper, RenderBlocks, Block, ModelBase, 
//            Entity

public class RenderMinecart extends Render
{

    protected ModelBase field_20925_a;

    public RenderMinecart()
    {
        field_9246_c = 0.5F;
        field_20925_a = new ModelMinecart();
    }

    public void func_152_a(EntityMinecart p_152_1_, double p_152_2_, double p_152_4_, double p_152_6_, 
            float p_152_8_, float p_152_9_)
    {
        GL11.glPushMatrix();
        long l = (long)p_152_1_.field_620_ab * 0x1d66f537L;
        l = l * l * 0x105cb26d1L + l * 0x181c9L;
        float f = (((float)(l >> 16 & 7L) + 0.5F) / 8F - 0.5F) * 0.004F;
        float f1 = (((float)(l >> 20 & 7L) + 0.5F) / 8F - 0.5F) * 0.004F;
        float f2 = (((float)(l >> 24 & 7L) + 0.5F) / 8F - 0.5F) * 0.004F;
        GL11.glTranslatef(f, f1, f2);
        double d = p_152_1_.field_638_aI + (p_152_1_.field_611_ak - p_152_1_.field_638_aI) * (double)p_152_9_;
        double d1 = p_152_1_.field_637_aJ + (p_152_1_.field_610_al - p_152_1_.field_637_aJ) * (double)p_152_9_;
        double d2 = p_152_1_.field_636_aK + (p_152_1_.field_609_am - p_152_1_.field_636_aK) * (double)p_152_9_;
        double d3 = 0.30000001192092896D;
        Vec3D vec3d = p_152_1_.func_514_g(d, d1, d2);
        float f3 = p_152_1_.field_602_at + (p_152_1_.field_604_ar - p_152_1_.field_602_at) * p_152_9_;
        if(vec3d != null)
        {
            Vec3D vec3d1 = p_152_1_.func_515_a(d, d1, d2, d3);
            Vec3D vec3d2 = p_152_1_.func_515_a(d, d1, d2, -d3);
            if(vec3d1 == null)
            {
                vec3d1 = vec3d;
            }
            if(vec3d2 == null)
            {
                vec3d2 = vec3d;
            }
            p_152_2_ += vec3d.field_1776_a - d;
            p_152_4_ += (vec3d1.field_1775_b + vec3d2.field_1775_b) / 2D - d1;
            p_152_6_ += vec3d.field_1779_c - d2;
            Vec3D vec3d3 = vec3d2.func_1257_c(-vec3d1.field_1776_a, -vec3d1.field_1775_b, -vec3d1.field_1779_c);
            if(vec3d3.func_1253_c() != 0.0D)
            {
                vec3d3 = vec3d3.func_1252_b();
                p_152_8_ = (float)((Math.atan2(vec3d3.field_1779_c, vec3d3.field_1776_a) * 180D) / 3.1415926535897931D);
                f3 = (float)(Math.atan(vec3d3.field_1775_b) * 73D);
            }
        }
        GL11.glTranslatef((float)p_152_2_, (float)p_152_4_, (float)p_152_6_);
        GL11.glRotatef(180F - p_152_8_, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-f3, 0.0F, 0.0F, 1.0F);
        float f4 = (float)p_152_1_.func_41023_l() - p_152_9_;
        float f5 = (float)p_152_1_.func_41025_i() - p_152_9_;
        if(f5 < 0.0F)
        {
            f5 = 0.0F;
        }
        if(f4 > 0.0F)
        {
            GL11.glRotatef(((MathHelper.func_1106_a(f4) * f4 * f5) / 10F) * (float)p_152_1_.func_41030_m(), 1.0F, 0.0F, 0.0F);
        }
        if(p_152_1_.field_20913_d != 0)
        {
            func_151_a("/terrain.png");
            float f6 = 0.75F;
            GL11.glScalef(f6, f6, f6);
            if(p_152_1_.field_20913_d == 1)
            {
                GL11.glTranslatef(-0.5F, 0.0F, 0.5F);
                GL11.glRotatef(90F, 0.0F, 1.0F, 0.0F);
                (new RenderBlocks()).func_1227_a(Block.field_396_av, 0, p_152_1_.func_382_a(p_152_9_));
                GL11.glRotatef(-90F, 0.0F, 1.0F, 0.0F);
                GL11.glTranslatef(0.5F, 0.0F, -0.5F);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            } else
            if(p_152_1_.field_20913_d == 2)
            {
                GL11.glTranslatef(0.0F, 0.3125F, 0.0F);
                GL11.glRotatef(90F, 0.0F, 1.0F, 0.0F);
                (new RenderBlocks()).func_1227_a(Block.field_445_aC, 0, p_152_1_.func_382_a(p_152_9_));
                GL11.glRotatef(-90F, 0.0F, 1.0F, 0.0F);
                GL11.glTranslatef(0.0F, -0.3125F, 0.0F);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            }
            GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
        }
        func_151_a("/item/cart.png");
        GL11.glScalef(-1F, -1F, 1.0F);
        field_20925_a.func_864_b(p_152_1_, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_152_a((EntityMinecart)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
