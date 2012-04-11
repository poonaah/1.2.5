// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, EntityArrow, Tessellator, MathHelper, 
//            Entity

public class RenderArrow extends Render
{

    public RenderArrow()
    {
    }

    public void func_154_a(EntityArrow p_154_1_, double p_154_2_, double p_154_4_, double p_154_6_, 
            float p_154_8_, float p_154_9_)
    {
        func_151_a("/item/arrows.png");
        GL11.glPushMatrix();
        GL11.glTranslatef((float)p_154_2_, (float)p_154_4_, (float)p_154_6_);
        GL11.glRotatef((p_154_1_.field_603_as + (p_154_1_.field_605_aq - p_154_1_.field_603_as) * p_154_9_) - 90F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(p_154_1_.field_602_at + (p_154_1_.field_604_ar - p_154_1_.field_602_at) * p_154_9_, 0.0F, 0.0F, 1.0F);
        Tessellator tessellator = Tessellator.field_1512_a;
        int i = 0;
        float f = 0.0F;
        float f1 = 0.5F;
        float f2 = (float)(0 + i * 10) / 32F;
        float f3 = (float)(5 + i * 10) / 32F;
        float f4 = 0.0F;
        float f5 = 0.15625F;
        float f6 = (float)(5 + i * 10) / 32F;
        float f7 = (float)(10 + i * 10) / 32F;
        float f8 = 0.05625F;
        GL11.glEnable(32826);
        float f9 = (float)p_154_1_.field_688_a - p_154_9_;
        if(f9 > 0.0F)
        {
            float f10 = -MathHelper.func_1106_a(f9 * 3F) * f9;
            GL11.glRotatef(f10, 0.0F, 0.0F, 1.0F);
        }
        GL11.glRotatef(45F, 1.0F, 0.0F, 0.0F);
        GL11.glScalef(f8, f8, f8);
        GL11.glTranslatef(-4F, 0.0F, 0.0F);
        GL11.glNormal3f(f8, 0.0F, 0.0F);
        tessellator.func_977_b();
        tessellator.func_983_a(-7D, -2D, -2D, f4, f6);
        tessellator.func_983_a(-7D, -2D, 2D, f5, f6);
        tessellator.func_983_a(-7D, 2D, 2D, f5, f7);
        tessellator.func_983_a(-7D, 2D, -2D, f4, f7);
        tessellator.func_982_a();
        GL11.glNormal3f(-f8, 0.0F, 0.0F);
        tessellator.func_977_b();
        tessellator.func_983_a(-7D, 2D, -2D, f4, f6);
        tessellator.func_983_a(-7D, 2D, 2D, f5, f6);
        tessellator.func_983_a(-7D, -2D, 2D, f5, f7);
        tessellator.func_983_a(-7D, -2D, -2D, f4, f7);
        tessellator.func_982_a();
        for(int j = 0; j < 4; j++)
        {
            GL11.glRotatef(90F, 1.0F, 0.0F, 0.0F);
            GL11.glNormal3f(0.0F, 0.0F, f8);
            tessellator.func_977_b();
            tessellator.func_983_a(-8D, -2D, 0.0D, f, f2);
            tessellator.func_983_a(8D, -2D, 0.0D, f1, f2);
            tessellator.func_983_a(8D, 2D, 0.0D, f1, f3);
            tessellator.func_983_a(-8D, 2D, 0.0D, f, f3);
            tessellator.func_982_a();
        }

        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_154_a((EntityArrow)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
