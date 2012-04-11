// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.io.PrintStream;
import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            RenderLiving, ModelMagmaCube, EntityMagmaCube, EntityLiving, 
//            Entity

public class RenderMagmaCube extends RenderLiving
{

    private int field_40276_c;

    public RenderMagmaCube()
    {
        super(new ModelMagmaCube(), 0.25F);
        field_40276_c = ((ModelMagmaCube)field_20920_e).func_40343_a();
    }

    public void func_40275_a(EntityMagmaCube p_40275_1_, double p_40275_2_, double p_40275_4_, double p_40275_6_, 
            float p_40275_8_, float p_40275_9_)
    {
        int i = ((ModelMagmaCube)field_20920_e).func_40343_a();
        if(i != field_40276_c)
        {
            field_40276_c = i;
            field_20920_e = new ModelMagmaCube();
            System.out.println("new lava slime model");
        }
        super.func_171_a(p_40275_1_, p_40275_2_, p_40275_4_, p_40275_6_, p_40275_8_, p_40275_9_);
    }

    protected void func_40274_a(EntityMagmaCube p_40274_1_, float p_40274_2_)
    {
        int i = p_40274_1_.func_25027_v();
        float f = (p_40274_1_.field_767_b + (p_40274_1_.field_768_a - p_40274_1_.field_767_b) * p_40274_2_) / ((float)i * 0.5F + 1.0F);
        float f1 = 1.0F / (f + 1.0F);
        float f2 = i;
        GL11.glScalef(f1 * f2, (1.0F / f1) * f2, f1 * f2);
    }

    protected void func_6330_a(EntityLiving p_6330_1_, float p_6330_2_)
    {
        func_40274_a((EntityMagmaCube)p_6330_1_, p_6330_2_);
    }

    public void func_171_a(EntityLiving p_171_1_, double p_171_2_, double p_171_4_, double p_171_6_, 
            float p_171_8_, float p_171_9_)
    {
        func_40275_a((EntityMagmaCube)p_171_1_, p_171_2_, p_171_4_, p_171_6_, p_171_8_, p_171_9_);
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_40275_a((EntityMagmaCube)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
