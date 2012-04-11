// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, EntityOcelot, ModelBase, EntityLiving, 
//            Entity

public class RenderOcelot extends RenderLiving
{

    public RenderOcelot(ModelBase p_i1066_1_, float p_i1066_2_)
    {
        super(p_i1066_1_, p_i1066_2_);
    }

    public void func_48424_a(EntityOcelot p_48424_1_, double p_48424_2_, double p_48424_4_, double p_48424_6_, 
            float p_48424_8_, float p_48424_9_)
    {
        super.func_171_a(p_48424_1_, p_48424_2_, p_48424_4_, p_48424_6_, p_48424_8_, p_48424_9_);
    }

    protected void func_48423_a(EntityOcelot p_48423_1_, float p_48423_2_)
    {
        super.func_6330_a(p_48423_1_, p_48423_2_);
        if(p_48423_1_.func_48139_F_())
        {
            GL11.glScalef(0.8F, 0.8F, 0.8F);
        }
    }

    protected void func_6330_a(EntityLiving p_6330_1_, float p_6330_2_)
    {
        func_48423_a((EntityOcelot)p_6330_1_, p_6330_2_);
    }

    public void func_171_a(EntityLiving p_171_1_, double p_171_2_, double p_171_4_, double p_171_6_, 
            float p_171_8_, float p_171_9_)
    {
        func_48424_a((EntityOcelot)p_171_1_, p_171_2_, p_171_4_, p_171_6_, p_171_8_, p_171_9_);
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_48424_a((EntityOcelot)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
