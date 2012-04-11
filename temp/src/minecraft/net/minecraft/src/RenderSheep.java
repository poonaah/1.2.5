// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, EntitySheep, ModelBase, EntityLiving, 
//            Entity

public class RenderSheep extends RenderLiving
{

    public RenderSheep(ModelBase p_i206_1_, ModelBase p_i206_2_, float p_i206_3_)
    {
        super(p_i206_1_, p_i206_3_);
        func_4013_a(p_i206_2_);
    }

    protected int func_176_a(EntitySheep p_176_1_, int p_176_2_, float p_176_3_)
    {
        if(p_176_2_ == 0 && !p_176_1_.func_21072_p())
        {
            func_151_a("/mob/sheep_fur.png");
            float f = 1.0F;
            int i = p_176_1_.func_21074_p_();
            GL11.glColor3f(f * EntitySheep.field_21075_a[i][0], f * EntitySheep.field_21075_a[i][1], f * EntitySheep.field_21075_a[i][2]);
            return 1;
        } else
        {
            return -1;
        }
    }

    public void func_40271_a(EntitySheep p_40271_1_, double p_40271_2_, double p_40271_4_, double p_40271_6_, 
            float p_40271_8_, float p_40271_9_)
    {
        super.func_171_a(p_40271_1_, p_40271_2_, p_40271_4_, p_40271_6_, p_40271_8_, p_40271_9_);
    }

    protected int func_166_a(EntityLiving p_166_1_, int p_166_2_, float p_166_3_)
    {
        return func_176_a((EntitySheep)p_166_1_, p_166_2_, p_166_3_);
    }

    public void func_171_a(EntityLiving p_171_1_, double p_171_2_, double p_171_4_, double p_171_6_, 
            float p_171_8_, float p_171_9_)
    {
        func_40271_a((EntitySheep)p_171_1_, p_171_2_, p_171_4_, p_171_6_, p_171_8_, p_171_9_);
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_40271_a((EntitySheep)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
