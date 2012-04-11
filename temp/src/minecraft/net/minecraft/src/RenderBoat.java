// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, ModelBoat, EntityBoat, MathHelper, 
//            ModelBase, Entity

public class RenderBoat extends Render
{

    protected ModelBase field_198_d;

    public RenderBoat()
    {
        field_9246_c = 0.5F;
        field_198_d = new ModelBoat();
    }

    public void func_157_a(EntityBoat p_157_1_, double p_157_2_, double p_157_4_, double p_157_6_, 
            float p_157_8_, float p_157_9_)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)p_157_2_, (float)p_157_4_, (float)p_157_6_);
        GL11.glRotatef(180F - p_157_8_, 0.0F, 1.0F, 0.0F);
        float f = (float)p_157_1_.func_41018_h() - p_157_9_;
        float f1 = (float)p_157_1_.func_41020_g() - p_157_9_;
        if(f1 < 0.0F)
        {
            f1 = 0.0F;
        }
        if(f > 0.0F)
        {
            GL11.glRotatef(((MathHelper.func_1106_a(f) * f * f1) / 10F) * (float)p_157_1_.func_41016_i(), 1.0F, 0.0F, 0.0F);
        }
        func_151_a("/terrain.png");
        float f2 = 0.75F;
        GL11.glScalef(f2, f2, f2);
        GL11.glScalef(1.0F / f2, 1.0F / f2, 1.0F / f2);
        func_151_a("/item/boat.png");
        GL11.glScalef(-1F, -1F, 1.0F);
        field_198_d.func_864_b(p_157_1_, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_157_a((EntityBoat)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
