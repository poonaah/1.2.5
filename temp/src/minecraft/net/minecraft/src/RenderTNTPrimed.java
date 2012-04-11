// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, RenderBlocks, EntityTNTPrimed, Block, 
//            Entity

public class RenderTNTPrimed extends Render
{

    private RenderBlocks field_196_d;

    public RenderTNTPrimed()
    {
        field_196_d = new RenderBlocks();
        field_9246_c = 0.5F;
    }

    public void func_153_a(EntityTNTPrimed p_153_1_, double p_153_2_, double p_153_4_, double p_153_6_, 
            float p_153_8_, float p_153_9_)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)p_153_2_, (float)p_153_4_, (float)p_153_6_);
        if(((float)p_153_1_.field_689_a - p_153_9_) + 1.0F < 10F)
        {
            float f = 1.0F - (((float)p_153_1_.field_689_a - p_153_9_) + 1.0F) / 10F;
            if(f < 0.0F)
            {
                f = 0.0F;
            }
            if(f > 1.0F)
            {
                f = 1.0F;
            }
            f *= f;
            f *= f;
            float f2 = 1.0F + f * 0.3F;
            GL11.glScalef(f2, f2, f2);
        }
        float f1 = (1.0F - (((float)p_153_1_.field_689_a - p_153_9_) + 1.0F) / 100F) * 0.8F;
        func_151_a("/terrain.png");
        field_196_d.func_1227_a(Block.field_408_an, 0, p_153_1_.func_382_a(p_153_9_));
        if((p_153_1_.field_689_a / 5) % 2 == 0)
        {
            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 772);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, f1);
            field_196_d.func_1227_a(Block.field_408_an, 0, 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(3042);
            GL11.glEnable(2896);
            GL11.glEnable(3553);
        }
        GL11.glPopMatrix();
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_153_a((EntityTNTPrimed)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
