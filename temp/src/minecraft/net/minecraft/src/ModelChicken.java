// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, MathHelper, Entity

public class ModelChicken extends ModelBase
{

    public ModelRenderer field_1289_a;
    public ModelRenderer field_1288_b;
    public ModelRenderer field_1295_c;
    public ModelRenderer field_1294_d;
    public ModelRenderer field_1293_e;
    public ModelRenderer field_1292_f;
    public ModelRenderer field_1291_g;
    public ModelRenderer field_1290_h;

    public ModelChicken()
    {
        int i = 16;
        field_1289_a = new ModelRenderer(this, 0, 0);
        field_1289_a.func_923_a(-2F, -6F, -2F, 4, 6, 3, 0.0F);
        field_1289_a.func_925_a(0.0F, -1 + i, -4F);
        field_1291_g = new ModelRenderer(this, 14, 0);
        field_1291_g.func_923_a(-2F, -4F, -4F, 4, 2, 2, 0.0F);
        field_1291_g.func_925_a(0.0F, -1 + i, -4F);
        field_1290_h = new ModelRenderer(this, 14, 4);
        field_1290_h.func_923_a(-1F, -2F, -3F, 2, 2, 2, 0.0F);
        field_1290_h.func_925_a(0.0F, -1 + i, -4F);
        field_1288_b = new ModelRenderer(this, 0, 9);
        field_1288_b.func_923_a(-3F, -4F, -3F, 6, 8, 6, 0.0F);
        field_1288_b.func_925_a(0.0F, i, 0.0F);
        field_1295_c = new ModelRenderer(this, 26, 0);
        field_1295_c.func_40604_a(-1F, 0.0F, -3F, 3, 5, 3);
        field_1295_c.func_925_a(-2F, 3 + i, 1.0F);
        field_1294_d = new ModelRenderer(this, 26, 0);
        field_1294_d.func_40604_a(-1F, 0.0F, -3F, 3, 5, 3);
        field_1294_d.func_925_a(1.0F, 3 + i, 1.0F);
        field_1293_e = new ModelRenderer(this, 24, 13);
        field_1293_e.func_40604_a(0.0F, 0.0F, -3F, 1, 4, 6);
        field_1293_e.func_925_a(-4F, -3 + i, 0.0F);
        field_1292_f = new ModelRenderer(this, 24, 13);
        field_1292_f.func_40604_a(-1F, 0.0F, -3F, 1, 4, 6);
        field_1292_f.func_925_a(4F, -3 + i, 0.0F);
    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        func_863_a(p_864_2_, p_864_3_, p_864_4_, p_864_5_, p_864_6_, p_864_7_);
        if(field_40301_k)
        {
            float f = 2.0F;
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 5F * p_864_7_, 2.0F * p_864_7_);
            field_1289_a.func_922_a(p_864_7_);
            field_1291_g.func_922_a(p_864_7_);
            field_1290_h.func_922_a(p_864_7_);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / f, 1.0F / f, 1.0F / f);
            GL11.glTranslatef(0.0F, 24F * p_864_7_, 0.0F);
            field_1288_b.func_922_a(p_864_7_);
            field_1295_c.func_922_a(p_864_7_);
            field_1294_d.func_922_a(p_864_7_);
            field_1293_e.func_922_a(p_864_7_);
            field_1292_f.func_922_a(p_864_7_);
            GL11.glPopMatrix();
        } else
        {
            field_1289_a.func_922_a(p_864_7_);
            field_1291_g.func_922_a(p_864_7_);
            field_1290_h.func_922_a(p_864_7_);
            field_1288_b.func_922_a(p_864_7_);
            field_1295_c.func_922_a(p_864_7_);
            field_1294_d.func_922_a(p_864_7_);
            field_1293_e.func_922_a(p_864_7_);
            field_1292_f.func_922_a(p_864_7_);
        }
    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        field_1289_a.field_1407_d = -(p_863_5_ / 57.29578F);
        field_1289_a.field_1406_e = p_863_4_ / 57.29578F;
        field_1291_g.field_1407_d = field_1289_a.field_1407_d;
        field_1291_g.field_1406_e = field_1289_a.field_1406_e;
        field_1290_h.field_1407_d = field_1289_a.field_1407_d;
        field_1290_h.field_1406_e = field_1289_a.field_1406_e;
        field_1288_b.field_1407_d = 1.570796F;
        field_1295_c.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F) * 1.4F * p_863_2_;
        field_1294_d.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F + 3.141593F) * 1.4F * p_863_2_;
        field_1293_e.field_1405_f = p_863_3_;
        field_1292_f.field_1405_f = -p_863_3_;
    }
}
