// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, EntityGiantZombie, ModelBase, EntityLiving

public class RenderGiantZombie extends RenderLiving
{

    private float field_204_f;

    public RenderGiantZombie(ModelBase p_i213_1_, float p_i213_2_, float p_i213_3_)
    {
        super(p_i213_1_, p_i213_2_ * p_i213_3_);
        field_204_f = p_i213_3_;
    }

    protected void func_175_a(EntityGiantZombie p_175_1_, float p_175_2_)
    {
        GL11.glScalef(field_204_f, field_204_f, field_204_f);
    }

    protected void func_6330_a(EntityLiving p_6330_1_, float p_6330_2_)
    {
        func_175_a((EntityGiantZombie)p_6330_1_, p_6330_2_);
    }
}
