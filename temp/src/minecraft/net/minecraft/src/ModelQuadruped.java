// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, MathHelper, Entity

public class ModelQuadruped extends ModelBase
{

    public ModelRenderer field_1266_d;
    public ModelRenderer field_1265_e;
    public ModelRenderer field_1264_f;
    public ModelRenderer field_1263_g;
    public ModelRenderer field_1262_h;
    public ModelRenderer field_1261_i;
    protected float field_40331_g;
    protected float field_40332_n;

    public ModelQuadruped(int p_i408_1_, float p_i408_2_)
    {
        field_40331_g = 8F;
        field_40332_n = 4F;
        field_1266_d = new ModelRenderer(this, 0, 0);
        field_1266_d.func_923_a(-4F, -4F, -8F, 8, 8, 8, p_i408_2_);
        field_1266_d.func_925_a(0.0F, 18 - p_i408_1_, -6F);
        field_1265_e = new ModelRenderer(this, 28, 8);
        field_1265_e.func_923_a(-5F, -10F, -7F, 10, 16, 8, p_i408_2_);
        field_1265_e.func_925_a(0.0F, 17 - p_i408_1_, 2.0F);
        field_1264_f = new ModelRenderer(this, 0, 16);
        field_1264_f.func_923_a(-2F, 0.0F, -2F, 4, p_i408_1_, 4, p_i408_2_);
        field_1264_f.func_925_a(-3F, 24 - p_i408_1_, 7F);
        field_1263_g = new ModelRenderer(this, 0, 16);
        field_1263_g.func_923_a(-2F, 0.0F, -2F, 4, p_i408_1_, 4, p_i408_2_);
        field_1263_g.func_925_a(3F, 24 - p_i408_1_, 7F);
        field_1262_h = new ModelRenderer(this, 0, 16);
        field_1262_h.func_923_a(-2F, 0.0F, -2F, 4, p_i408_1_, 4, p_i408_2_);
        field_1262_h.func_925_a(-3F, 24 - p_i408_1_, -5F);
        field_1261_i = new ModelRenderer(this, 0, 16);
        field_1261_i.func_923_a(-2F, 0.0F, -2F, 4, p_i408_1_, 4, p_i408_2_);
        field_1261_i.func_925_a(3F, 24 - p_i408_1_, -5F);
    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        func_863_a(p_864_2_, p_864_3_, p_864_4_, p_864_5_, p_864_6_, p_864_7_);
        if(field_40301_k)
        {
            float f = 2.0F;
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, field_40331_g * p_864_7_, field_40332_n * p_864_7_);
            field_1266_d.func_922_a(p_864_7_);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / f, 1.0F / f, 1.0F / f);
            GL11.glTranslatef(0.0F, 24F * p_864_7_, 0.0F);
            field_1265_e.func_922_a(p_864_7_);
            field_1264_f.func_922_a(p_864_7_);
            field_1263_g.func_922_a(p_864_7_);
            field_1262_h.func_922_a(p_864_7_);
            field_1261_i.func_922_a(p_864_7_);
            GL11.glPopMatrix();
        } else
        {
            field_1266_d.func_922_a(p_864_7_);
            field_1265_e.func_922_a(p_864_7_);
            field_1264_f.func_922_a(p_864_7_);
            field_1263_g.func_922_a(p_864_7_);
            field_1262_h.func_922_a(p_864_7_);
            field_1261_i.func_922_a(p_864_7_);
        }
    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        field_1266_d.field_1407_d = p_863_5_ / 57.29578F;
        field_1266_d.field_1406_e = p_863_4_ / 57.29578F;
        field_1265_e.field_1407_d = 1.570796F;
        field_1264_f.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F) * 1.4F * p_863_2_;
        field_1263_g.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F + 3.141593F) * 1.4F * p_863_2_;
        field_1262_h.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F + 3.141593F) * 1.4F * p_863_2_;
        field_1261_i.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F) * 1.4F * p_863_2_;
    }
}
