// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, Tessellator, RenderManager, EntityFishHook, 
//            EntityPlayer, MathHelper, Vec3D, GameSettings, 
//            Entity

public class RenderFish extends Render
{

    public RenderFish()
    {
    }

    public void func_4011_a(EntityFishHook p_4011_1_, double p_4011_2_, double p_4011_4_, double p_4011_6_, 
            float p_4011_8_, float p_4011_9_)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)p_4011_2_, (float)p_4011_4_, (float)p_4011_6_);
        GL11.glEnable(32826);
        GL11.glScalef(0.5F, 0.5F, 0.5F);
        int i = 1;
        byte byte0 = 2;
        func_151_a("/particles.png");
        Tessellator tessellator = Tessellator.field_1512_a;
        float f = (float)(i * 8 + 0) / 128F;
        float f1 = (float)(i * 8 + 8) / 128F;
        float f2 = (float)(byte0 * 8 + 0) / 128F;
        float f3 = (float)(byte0 * 8 + 8) / 128F;
        float f4 = 1.0F;
        float f5 = 0.5F;
        float f6 = 0.5F;
        GL11.glRotatef(180F - field_191_a.field_1225_i, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-field_191_a.field_1224_j, 1.0F, 0.0F, 0.0F);
        tessellator.func_977_b();
        tessellator.func_980_b(0.0F, 1.0F, 0.0F);
        tessellator.func_983_a(0.0F - f5, 0.0F - f6, 0.0D, f, f3);
        tessellator.func_983_a(f4 - f5, 0.0F - f6, 0.0D, f1, f3);
        tessellator.func_983_a(f4 - f5, 1.0F - f6, 0.0D, f1, f2);
        tessellator.func_983_a(0.0F - f5, 1.0F - f6, 0.0D, f, f2);
        tessellator.func_982_a();
        GL11.glDisable(32826);
        GL11.glPopMatrix();
        if(p_4011_1_.field_4097_b != null)
        {
            float f7 = ((p_4011_1_.field_4097_b.field_603_as + (p_4011_1_.field_4097_b.field_605_aq - p_4011_1_.field_4097_b.field_603_as) * p_4011_9_) * 3.141593F) / 180F;
            double d = MathHelper.func_1106_a(f7);
            double d2 = MathHelper.func_1114_b(f7);
            float f9 = p_4011_1_.field_4097_b.func_431_d(p_4011_9_);
            float f10 = MathHelper.func_1106_a(MathHelper.func_1113_c(f9) * 3.141593F);
            Vec3D vec3d = Vec3D.func_1248_b(-0.5D, 0.029999999999999999D, 0.80000000000000004D);
            vec3d.func_1258_a((-(p_4011_1_.field_4097_b.field_602_at + (p_4011_1_.field_4097_b.field_604_ar - p_4011_1_.field_4097_b.field_602_at) * p_4011_9_) * 3.141593F) / 180F);
            vec3d.func_1249_b((-(p_4011_1_.field_4097_b.field_603_as + (p_4011_1_.field_4097_b.field_605_aq - p_4011_1_.field_4097_b.field_603_as) * p_4011_9_) * 3.141593F) / 180F);
            vec3d.func_1249_b(f10 * 0.5F);
            vec3d.func_1258_a(-f10 * 0.7F);
            double d4 = p_4011_1_.field_4097_b.field_9285_at + (p_4011_1_.field_4097_b.field_611_ak - p_4011_1_.field_4097_b.field_9285_at) * (double)p_4011_9_ + vec3d.field_1776_a;
            double d5 = p_4011_1_.field_4097_b.field_9284_au + (p_4011_1_.field_4097_b.field_610_al - p_4011_1_.field_4097_b.field_9284_au) * (double)p_4011_9_ + vec3d.field_1775_b;
            double d6 = p_4011_1_.field_4097_b.field_9283_av + (p_4011_1_.field_4097_b.field_609_am - p_4011_1_.field_4097_b.field_9283_av) * (double)p_4011_9_ + vec3d.field_1779_c;
            if(field_191_a.field_1223_k.field_1560_x > 0)
            {
                float f8 = ((p_4011_1_.field_4097_b.field_734_o + (p_4011_1_.field_4097_b.field_735_n - p_4011_1_.field_4097_b.field_734_o) * p_4011_9_) * 3.141593F) / 180F;
                double d1 = MathHelper.func_1106_a(f8);
                double d3 = MathHelper.func_1114_b(f8);
                d4 = (p_4011_1_.field_4097_b.field_9285_at + (p_4011_1_.field_4097_b.field_611_ak - p_4011_1_.field_4097_b.field_9285_at) * (double)p_4011_9_) - d3 * 0.34999999999999998D - d1 * 0.84999999999999998D;
                d5 = (p_4011_1_.field_4097_b.field_9284_au + (p_4011_1_.field_4097_b.field_610_al - p_4011_1_.field_4097_b.field_9284_au) * (double)p_4011_9_) - 0.45000000000000001D;
                d6 = ((p_4011_1_.field_4097_b.field_9283_av + (p_4011_1_.field_4097_b.field_609_am - p_4011_1_.field_4097_b.field_9283_av) * (double)p_4011_9_) - d1 * 0.34999999999999998D) + d3 * 0.84999999999999998D;
            }
            double d7 = p_4011_1_.field_9285_at + (p_4011_1_.field_611_ak - p_4011_1_.field_9285_at) * (double)p_4011_9_;
            double d8 = p_4011_1_.field_9284_au + (p_4011_1_.field_610_al - p_4011_1_.field_9284_au) * (double)p_4011_9_ + 0.25D;
            double d9 = p_4011_1_.field_9283_av + (p_4011_1_.field_609_am - p_4011_1_.field_9283_av) * (double)p_4011_9_;
            double d10 = (float)(d4 - d7);
            double d11 = (float)(d5 - d8);
            double d12 = (float)(d6 - d9);
            GL11.glDisable(3553);
            GL11.glDisable(2896);
            tessellator.func_992_a(3);
            tessellator.func_990_b(0);
            int j = 16;
            for(int k = 0; k <= j; k++)
            {
                float f11 = (float)k / (float)j;
                tessellator.func_991_a(p_4011_2_ + d10 * (double)f11, p_4011_4_ + d11 * (double)(f11 * f11 + f11) * 0.5D + 0.25D, p_4011_6_ + d12 * (double)f11);
            }

            tessellator.func_982_a();
            GL11.glEnable(2896);
            GL11.glEnable(3553);
        }
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_4011_a((EntityFishHook)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
