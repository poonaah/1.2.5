// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, ModelEnderCrystal, EntityEnderCrystal, MathHelper, 
//            ModelBase, Entity

public class RenderEnderCrystal extends Render
{

    private int field_41037_a;
    private ModelBase field_41036_b;

    public RenderEnderCrystal()
    {
        field_41037_a = -1;
        field_9246_c = 0.5F;
    }

    public void func_41035_a(EntityEnderCrystal p_41035_1_, double p_41035_2_, double p_41035_4_, double p_41035_6_, 
            float p_41035_8_, float p_41035_9_)
    {
        if(field_41037_a != 1)
        {
            field_41036_b = new ModelEnderCrystal(0.0F);
            field_41037_a = 1;
        }
        float f = (float)p_41035_1_.field_41032_a + p_41035_9_;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)p_41035_2_, (float)p_41035_4_, (float)p_41035_6_);
        func_151_a("/mob/enderdragon/crystal.png");
        float f1 = MathHelper.func_1106_a(f * 0.2F) / 2.0F + 0.5F;
        f1 = f1 * f1 + f1;
        field_41036_b.func_864_b(p_41035_1_, 0.0F, f * 3F, f1 * 0.2F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }

    public void func_147_a(Entity p_147_1_, double p_147_2_, double p_147_4_, double p_147_6_, 
            float p_147_8_, float p_147_9_)
    {
        func_41035_a((EntityEnderCrystal)p_147_1_, p_147_2_, p_147_4_, p_147_6_, p_147_8_, p_147_9_);
    }
}
