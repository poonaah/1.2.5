// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, Tessellator, RenderManager, EntityFireball, 
//            Entity

public class RenderFireball extends Render
{

    private float field_40269_a;

    public RenderFireball(float p_i774_1_)
    {
        field_40269_a = p_i774_1_;
    }

    public void func_4012_a(EntityFireball p_4012_1_, double p_4012_2_, double p_4012_4_, double p_4012_6_, 
            float p_4012_8_, float p_4012_9_)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)p_4012_2_, (float)p_4012_4_, (float)p_4012_6_);
        GL11.glEnable(32826);
        float f = field_40269_a;
        GL11.glScalef(f / 1.0F, f / 1.0F, f / 1.0F);
        byte byte0 = 46;
        func_151_a("/gui/items.png");
        Tessellator tessellator = Tessellator.field_1512_a;
        float f1 = (float)((byte0 % 16) * 16 + 0) / 256F;
        float f2 = (float)((byte0 % 16) * 16 + 16) / 256F;
        float f3 = (float)((byte0 / 16) * 16 + 0) / 256F;
        float f4 = (float)((byte0 / 16) * 16 + 16) / 256F;
        float f5 = 1.0F;
        float f6 = 0.5F;
        float f7 = 0.25F;
        GL11.glRotatef(180F - field_191_a.field_1225_i, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-field_191_a.field_1224_j, 1.0F, 0.0F, 0.0F);
        tessellator.func_977_b();
        tessellator.func_980_b(0.0F, 1.0F, 0.0F);
        tessellator.func_983_a(0.0F - f6, 0.0F - f7, 0.0D, f1, f4);
        tessellator.func_983_a(f5 - f6, 0.0F - f7, 0.0D, f2, f4);
        tessellator.func_983_a(f5 - f6, 1.0F - f7, 0.0D, f2, f3);
        tessellator.func_983_a(0.0F - f6, 1.0F - f7, 0.0D, f1, f3);
        tessellator.func_982_a();
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_4012_a((EntityFireball)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
