// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, Entity

public class ModelEnderCrystal extends ModelBase
{

    private ModelRenderer field_41057_g;
    private ModelRenderer field_41058_h;
    private ModelRenderer field_41059_i;

    public ModelEnderCrystal(float p_i223_1_)
    {
        field_41058_h = new ModelRenderer(this, "glass");
        field_41058_h.func_40602_a(0, 0).func_40604_a(-4F, -4F, -4F, 8, 8, 8);
        field_41057_g = new ModelRenderer(this, "cube");
        field_41057_g.func_40602_a(32, 0).func_40604_a(-4F, -4F, -4F, 8, 8, 8);
        field_41059_i = new ModelRenderer(this, "base");
        field_41059_i.func_40602_a(0, 16).func_40604_a(-6F, 0.0F, -6F, 12, 4, 12);
    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        GL11.glPushMatrix();
        GL11.glScalef(2.0F, 2.0F, 2.0F);
        GL11.glTranslatef(0.0F, -0.5F, 0.0F);
        field_41059_i.func_922_a(p_864_7_);
        GL11.glRotatef(p_864_3_, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(0.0F, 0.8F + p_864_4_, 0.0F);
        GL11.glRotatef(60F, 0.7071F, 0.0F, 0.7071F);
        field_41058_h.func_922_a(p_864_7_);
        float f = 0.875F;
        GL11.glScalef(f, f, f);
        GL11.glRotatef(60F, 0.7071F, 0.0F, 0.7071F);
        GL11.glRotatef(p_864_3_, 0.0F, 1.0F, 0.0F);
        field_41058_h.func_922_a(p_864_7_);
        GL11.glScalef(f, f, f);
        GL11.glRotatef(60F, 0.7071F, 0.0F, 0.7071F);
        GL11.glRotatef(p_864_3_, 0.0F, 1.0F, 0.0F);
        field_41057_g.func_922_a(p_864_7_);
        GL11.glPopMatrix();
    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        super.func_863_a(p_863_1_, p_863_2_, p_863_3_, p_863_4_, p_863_5_, p_863_6_);
    }
}
