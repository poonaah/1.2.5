// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, RenderBlocks, EntityXPOrb, Tessellator, 
//            OpenGlHelper, MathHelper, RenderManager, Entity

public class RenderXPOrb extends Render
{

    private RenderBlocks field_35439_b;
    public boolean field_35440_a;

    public RenderXPOrb()
    {
        field_35439_b = new RenderBlocks();
        field_35440_a = true;
        field_9246_c = 0.15F;
        field_194_c = 0.75F;
    }

    public void func_35438_a(EntityXPOrb p_35438_1_, double p_35438_2_, double p_35438_4_, double p_35438_6_, 
            float p_35438_8_, float p_35438_9_)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)p_35438_2_, (float)p_35438_4_, (float)p_35438_6_);
        int i = p_35438_1_.func_35120_i();
        func_151_a("/item/xporb.png");
        Tessellator tessellator = Tessellator.field_1512_a;
        float f = (float)((i % 4) * 16 + 0) / 64F;
        float f1 = (float)((i % 4) * 16 + 16) / 64F;
        float f2 = (float)((i / 4) * 16 + 0) / 64F;
        float f3 = (float)((i / 4) * 16 + 16) / 64F;
        float f4 = 1.0F;
        float f5 = 0.5F;
        float f6 = 0.25F;
        float f7 = p_35438_1_.func_35115_a(p_35438_9_);
        float f8 = f7 % 0x10000;
        int j = f7 / 0x10000;
        OpenGlHelper.func_40454_a(OpenGlHelper.field_40455_b, (float)f8 / 1.0F, (float)j / 1.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        f7 = 255F;
        f8 = ((float)p_35438_1_.field_35127_a + p_35438_9_) / 2.0F;
        j = (int)((MathHelper.func_1106_a(f8 + 0.0F) + 1.0F) * 0.5F * f7);
        int k = (int)f7;
        int l = (int)((MathHelper.func_1106_a(f8 + 4.18879F) + 1.0F) * 0.1F * f7);
        int i1 = j << 16 | k << 8 | l;
        GL11.glRotatef(180F - field_191_a.field_1225_i, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-field_191_a.field_1224_j, 1.0F, 0.0F, 0.0F);
        float f9 = 0.3F;
        GL11.glScalef(f9, f9, f9);
        tessellator.func_977_b();
        tessellator.func_6513_a(i1, 128);
        tessellator.func_980_b(0.0F, 1.0F, 0.0F);
        tessellator.func_983_a(0.0F - f5, 0.0F - f6, 0.0D, f, f3);
        tessellator.func_983_a(f4 - f5, 0.0F - f6, 0.0D, f1, f3);
        tessellator.func_983_a(f4 - f5, 1.0F - f6, 0.0D, f1, f2);
        tessellator.func_983_a(0.0F - f5, 1.0F - f6, 0.0D, f, f2);
        tessellator.func_982_a();
        GL11.glDisable(3042);
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_35438_a((EntityXPOrb)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
