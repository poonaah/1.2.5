// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, Entity

public class RenderEntity extends Render
{

    public RenderEntity()
    {
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        GL11.glPushMatrix();
        func_146_a(p_147_1_.field_601_au, p_147_2_ - p_147_1_.field_638_aI, p_147_4_ - p_147_1_.field_637_aJ, p_147_6_ - p_147_1_.field_636_aK);
        GL11.glPopMatrix();
    }
}
