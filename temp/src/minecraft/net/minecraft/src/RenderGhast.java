// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, ModelGhast, EntityGhast, EntityLiving

public class RenderGhast extends RenderLiving
{

    public RenderGhast()
    {
        super(new ModelGhast(), 0.5F);
    }

    protected void func_4014_a(EntityGhast p_4014_1_, float p_4014_2_)
    {
        EntityGhast entityghast = p_4014_1_;
        float f = ((float)entityghast.field_4125_e + (float)(entityghast.field_4124_f - entityghast.field_4125_e) * p_4014_2_) / 20F;
        if(f < 0.0F)
        {
            f = 0.0F;
        }
        f = 1.0F / (f * f * f * f * f * 2.0F + 1.0F);
        float f1 = (8F + f) / 2.0F;
        float f2 = (8F + 1.0F / f) / 2.0F;
        GL11.glScalef(f2, f1, f2);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    protected void func_6330_a(EntityLiving p_6330_1_, float p_6330_2_)
    {
        func_4014_a((EntityGhast)p_6330_1_, p_6330_2_);
    }
}
