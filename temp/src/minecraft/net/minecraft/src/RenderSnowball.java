// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, Tessellator, EntityPotion, PotionHelper, 
//            RenderManager, Entity

public class RenderSnowball extends Render
{

    private int field_20003_a;

    public RenderSnowball(int p_i269_1_)
    {
        field_20003_a = p_i269_1_;
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)p_147_2_, (float)p_147_4_, (float)p_147_6_);
        GL11.glEnable(32826);
        GL11.glScalef(0.5F, 0.5F, 0.5F);
        func_151_a("/gui/items.png");
        Tessellator tessellator = Tessellator.field_1512_a;
        if(field_20003_a == 154)
        {
            int i = PotionHelper.func_40358_a(((EntityPotion)p_147_1_).func_40088_g(), false);
            float f = (float)(i >> 16 & 0xff) / 255F;
            float f1 = (float)(i >> 8 & 0xff) / 255F;
            float f2 = (float)(i & 0xff) / 255F;
            GL11.glColor3f(f, f1, f2);
            GL11.glPushMatrix();
            func_40265_a(tessellator, 141);
            GL11.glPopMatrix();
            GL11.glColor3f(1.0F, 1.0F, 1.0F);
        }
        func_40265_a(tessellator, field_20003_a);
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }

    private void func_40265_a(Tessellator p_40265_1_, int p_40265_2_)
    {
        float f = (float)((p_40265_2_ % 16) * 16 + 0) / 256F;
        float f1 = (float)((p_40265_2_ % 16) * 16 + 16) / 256F;
        float f2 = (float)((p_40265_2_ / 16) * 16 + 0) / 256F;
        float f3 = (float)((p_40265_2_ / 16) * 16 + 16) / 256F;
        float f4 = 1.0F;
        float f5 = 0.5F;
        float f6 = 0.25F;
        GL11.glRotatef(180F - field_191_a.field_1225_i, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-field_191_a.field_1224_j, 1.0F, 0.0F, 0.0F);
        p_40265_1_.func_977_b();
        p_40265_1_.func_980_b(0.0F, 1.0F, 0.0F);
        p_40265_1_.func_983_a(0.0F - f5, 0.0F - f6, 0.0D, f, f3);
        p_40265_1_.func_983_a(f4 - f5, 0.0F - f6, 0.0D, f1, f3);
        p_40265_1_.func_983_a(f4 - f5, f4 - f6, 0.0D, f1, f2);
        p_40265_1_.func_983_a(0.0F - f5, f4 - f6, 0.0D, f, f2);
        p_40265_1_.func_982_a();
    }
}
