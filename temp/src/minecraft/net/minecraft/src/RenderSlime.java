// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, EntitySlime, ModelBase, EntityLiving

public class RenderSlime extends RenderLiving
{

    private ModelBase field_205_f;

    public RenderSlime(ModelBase p_i386_1_, ModelBase p_i386_2_, float p_i386_3_)
    {
        super(p_i386_1_, p_i386_3_);
        field_205_f = p_i386_2_;
    }

    protected int func_40287_a(EntitySlime p_40287_1_, int p_40287_2_, float p_40287_3_)
    {
        if(p_40287_2_ == 0)
        {
            func_4013_a(field_205_f);
            GL11.glEnable(2977);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            return 1;
        }
        if(p_40287_2_ == 1)
        {
            GL11.glDisable(3042);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        }
        return -1;
    }

    protected void func_178_a(EntitySlime p_178_1_, float p_178_2_)
    {
        int i = p_178_1_.func_25027_v();
        float f = (p_178_1_.field_767_b + (p_178_1_.field_768_a - p_178_1_.field_767_b) * p_178_2_) / ((float)i * 0.5F + 1.0F);
        float f1 = 1.0F / (f + 1.0F);
        float f2 = i;
        GL11.glScalef(f1 * f2, (1.0F / f1) * f2, f1 * f2);
    }

    protected void func_6330_a(EntityLiving p_6330_1_, float p_6330_2_)
    {
        func_178_a((EntitySlime)p_6330_1_, p_6330_2_);
    }

    protected int func_166_a(EntityLiving p_166_1_, int p_166_2_, float p_166_3_)
    {
        return func_40287_a((EntitySlime)p_166_1_, p_166_2_, p_166_3_);
    }
}
