// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Random;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, EntityPainting, EnumArt, Tessellator, 
//            MathHelper, RenderManager, World, OpenGlHelper, 
//            Entity

public class RenderPainting extends Render
{

    private Random field_199_d;

    public RenderPainting()
    {
        field_199_d = new Random();
    }

    public void func_158_a(EntityPainting p_158_1_, double p_158_2_, double p_158_4_, double p_158_6_, 
            float p_158_8_, float p_158_9_)
    {
        field_199_d.setSeed(187L);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)p_158_2_, (float)p_158_4_, (float)p_158_6_);
        GL11.glRotatef(p_158_8_, 0.0F, 1.0F, 0.0F);
        GL11.glEnable(32826);
        func_151_a("/art/kz.png");
        EnumArt enumart = p_158_1_.field_690_b;
        float f = 0.0625F;
        GL11.glScalef(f, f, f);
        func_159_a(p_158_1_, enumart.field_1623_z, enumart.field_1636_A, enumart.field_1634_B, enumart.field_1632_C);
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }

    private void func_159_a(EntityPainting p_159_1_, int p_159_2_, int p_159_3_, int p_159_4_, int p_159_5_)
    {
        float f = (float)(-p_159_2_) / 2.0F;
        float f1 = (float)(-p_159_3_) / 2.0F;
        float f2 = -0.5F;
        float f3 = 0.5F;
        for(int i = 0; i < p_159_2_ / 16; i++)
        {
            for(int j = 0; j < p_159_3_ / 16; j++)
            {
                float f4 = f + (float)((i + 1) * 16);
                float f5 = f + (float)(i * 16);
                float f6 = f1 + (float)((j + 1) * 16);
                float f7 = f1 + (float)(j * 16);
                func_160_a(p_159_1_, (f4 + f5) / 2.0F, (f6 + f7) / 2.0F);
                float f8 = (float)((p_159_4_ + p_159_2_) - i * 16) / 256F;
                float f9 = (float)((p_159_4_ + p_159_2_) - (i + 1) * 16) / 256F;
                float f10 = (float)((p_159_5_ + p_159_3_) - j * 16) / 256F;
                float f11 = (float)((p_159_5_ + p_159_3_) - (j + 1) * 16) / 256F;
                float f12 = 0.75F;
                float f13 = 0.8125F;
                float f14 = 0.0F;
                float f15 = 0.0625F;
                float f16 = 0.75F;
                float f17 = 0.8125F;
                float f18 = 0.001953125F;
                float f19 = 0.001953125F;
                float f20 = 0.7519531F;
                float f21 = 0.7519531F;
                float f22 = 0.0F;
                float f23 = 0.0625F;
                Tessellator tessellator = Tessellator.field_1512_a;
                tessellator.func_977_b();
                tessellator.func_980_b(0.0F, 0.0F, -1F);
                tessellator.func_983_a(f4, f7, f2, f9, f10);
                tessellator.func_983_a(f5, f7, f2, f8, f10);
                tessellator.func_983_a(f5, f6, f2, f8, f11);
                tessellator.func_983_a(f4, f6, f2, f9, f11);
                tessellator.func_980_b(0.0F, 0.0F, 1.0F);
                tessellator.func_983_a(f4, f6, f3, f12, f14);
                tessellator.func_983_a(f5, f6, f3, f13, f14);
                tessellator.func_983_a(f5, f7, f3, f13, f15);
                tessellator.func_983_a(f4, f7, f3, f12, f15);
                tessellator.func_980_b(0.0F, 1.0F, 0.0F);
                tessellator.func_983_a(f4, f6, f2, f16, f18);
                tessellator.func_983_a(f5, f6, f2, f17, f18);
                tessellator.func_983_a(f5, f6, f3, f17, f19);
                tessellator.func_983_a(f4, f6, f3, f16, f19);
                tessellator.func_980_b(0.0F, -1F, 0.0F);
                tessellator.func_983_a(f4, f7, f3, f16, f18);
                tessellator.func_983_a(f5, f7, f3, f17, f18);
                tessellator.func_983_a(f5, f7, f2, f17, f19);
                tessellator.func_983_a(f4, f7, f2, f16, f19);
                tessellator.func_980_b(-1F, 0.0F, 0.0F);
                tessellator.func_983_a(f4, f6, f3, f21, f22);
                tessellator.func_983_a(f4, f7, f3, f21, f23);
                tessellator.func_983_a(f4, f7, f2, f20, f23);
                tessellator.func_983_a(f4, f6, f2, f20, f22);
                tessellator.func_980_b(1.0F, 0.0F, 0.0F);
                tessellator.func_983_a(f5, f6, f2, f21, f22);
                tessellator.func_983_a(f5, f7, f2, f21, f23);
                tessellator.func_983_a(f5, f7, f3, f20, f23);
                tessellator.func_983_a(f5, f6, f3, f20, f22);
                tessellator.func_982_a();
            }

        }

    }

    private void func_160_a(EntityPainting p_160_1_, float p_160_2_, float p_160_3_)
    {
        int i = MathHelper.func_1108_b(p_160_1_.field_611_ak);
        int j = MathHelper.func_1108_b(p_160_1_.field_610_al + (double)(p_160_3_ / 16F));
        int k = MathHelper.func_1108_b(p_160_1_.field_609_am);
        if(p_160_1_.field_691_a == 0)
        {
            i = MathHelper.func_1108_b(p_160_1_.field_611_ak + (double)(p_160_2_ / 16F));
        }
        if(p_160_1_.field_691_a == 1)
        {
            k = MathHelper.func_1108_b(p_160_1_.field_609_am - (double)(p_160_2_ / 16F));
        }
        if(p_160_1_.field_691_a == 2)
        {
            i = MathHelper.func_1108_b(p_160_1_.field_611_ak - (double)(p_160_2_ / 16F));
        }
        if(p_160_1_.field_691_a == 3)
        {
            k = MathHelper.func_1108_b(p_160_1_.field_609_am + (double)(p_160_2_ / 16F));
        }
        int l = field_191_a.field_1227_g.func_35451_b(i, j, k, 0);
        int i1 = l % 0x10000;
        int j1 = l / 0x10000;
        OpenGlHelper.func_40454_a(OpenGlHelper.field_40455_b, i1, j1);
        GL11.glColor3f(1.0F, 1.0F, 1.0F);
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_158_a((EntityPainting)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
