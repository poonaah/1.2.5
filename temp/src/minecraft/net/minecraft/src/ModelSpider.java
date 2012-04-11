// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, MathHelper, Entity

public class ModelSpider extends ModelBase
{

    public ModelRenderer field_1255_a;
    public ModelRenderer field_1254_b;
    public ModelRenderer field_1253_c;
    public ModelRenderer field_1252_d;
    public ModelRenderer field_1251_e;
    public ModelRenderer field_1250_f;
    public ModelRenderer field_1249_g;
    public ModelRenderer field_1248_h;
    public ModelRenderer field_1247_i;
    public ModelRenderer field_1246_j;
    public ModelRenderer field_1245_m;

    public ModelSpider()
    {
        float f = 0.0F;
        int i = 15;
        field_1255_a = new ModelRenderer(this, 32, 4);
        field_1255_a.func_923_a(-4F, -4F, -8F, 8, 8, 8, f);
        field_1255_a.func_925_a(0.0F, i, -3F);
        field_1254_b = new ModelRenderer(this, 0, 0);
        field_1254_b.func_923_a(-3F, -3F, -3F, 6, 6, 6, f);
        field_1254_b.func_925_a(0.0F, i, 0.0F);
        field_1253_c = new ModelRenderer(this, 0, 12);
        field_1253_c.func_923_a(-5F, -4F, -6F, 10, 8, 12, f);
        field_1253_c.func_925_a(0.0F, i, 9F);
        field_1252_d = new ModelRenderer(this, 18, 0);
        field_1252_d.func_923_a(-15F, -1F, -1F, 16, 2, 2, f);
        field_1252_d.func_925_a(-4F, i, 2.0F);
        field_1251_e = new ModelRenderer(this, 18, 0);
        field_1251_e.func_923_a(-1F, -1F, -1F, 16, 2, 2, f);
        field_1251_e.func_925_a(4F, i, 2.0F);
        field_1250_f = new ModelRenderer(this, 18, 0);
        field_1250_f.func_923_a(-15F, -1F, -1F, 16, 2, 2, f);
        field_1250_f.func_925_a(-4F, i, 1.0F);
        field_1249_g = new ModelRenderer(this, 18, 0);
        field_1249_g.func_923_a(-1F, -1F, -1F, 16, 2, 2, f);
        field_1249_g.func_925_a(4F, i, 1.0F);
        field_1248_h = new ModelRenderer(this, 18, 0);
        field_1248_h.func_923_a(-15F, -1F, -1F, 16, 2, 2, f);
        field_1248_h.func_925_a(-4F, i, 0.0F);
        field_1247_i = new ModelRenderer(this, 18, 0);
        field_1247_i.func_923_a(-1F, -1F, -1F, 16, 2, 2, f);
        field_1247_i.func_925_a(4F, i, 0.0F);
        field_1246_j = new ModelRenderer(this, 18, 0);
        field_1246_j.func_923_a(-15F, -1F, -1F, 16, 2, 2, f);
        field_1246_j.func_925_a(-4F, i, -1F);
        field_1245_m = new ModelRenderer(this, 18, 0);
        field_1245_m.func_923_a(-1F, -1F, -1F, 16, 2, 2, f);
        field_1245_m.func_925_a(4F, i, -1F);
    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        func_863_a(p_864_2_, p_864_3_, p_864_4_, p_864_5_, p_864_6_, p_864_7_);
        field_1255_a.func_922_a(p_864_7_);
        field_1254_b.func_922_a(p_864_7_);
        field_1253_c.func_922_a(p_864_7_);
        field_1252_d.func_922_a(p_864_7_);
        field_1251_e.func_922_a(p_864_7_);
        field_1250_f.func_922_a(p_864_7_);
        field_1249_g.func_922_a(p_864_7_);
        field_1248_h.func_922_a(p_864_7_);
        field_1247_i.func_922_a(p_864_7_);
        field_1246_j.func_922_a(p_864_7_);
        field_1245_m.func_922_a(p_864_7_);
    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        field_1255_a.field_1406_e = p_863_4_ / 57.29578F;
        field_1255_a.field_1407_d = p_863_5_ / 57.29578F;
        float f = 0.7853982F;
        field_1252_d.field_1405_f = -f;
        field_1251_e.field_1405_f = f;
        field_1250_f.field_1405_f = -f * 0.74F;
        field_1249_g.field_1405_f = f * 0.74F;
        field_1248_h.field_1405_f = -f * 0.74F;
        field_1247_i.field_1405_f = f * 0.74F;
        field_1246_j.field_1405_f = -f;
        field_1245_m.field_1405_f = f;
        float f1 = -0F;
        float f2 = 0.3926991F;
        field_1252_d.field_1406_e = f2 * 2.0F + f1;
        field_1251_e.field_1406_e = -f2 * 2.0F - f1;
        field_1250_f.field_1406_e = f2 * 1.0F + f1;
        field_1249_g.field_1406_e = -f2 * 1.0F - f1;
        field_1248_h.field_1406_e = -f2 * 1.0F + f1;
        field_1247_i.field_1406_e = f2 * 1.0F - f1;
        field_1246_j.field_1406_e = -f2 * 2.0F + f1;
        field_1245_m.field_1406_e = f2 * 2.0F - f1;
        float f3 = -(MathHelper.func_1114_b(p_863_1_ * 0.6662F * 2.0F + 0.0F) * 0.4F) * p_863_2_;
        float f4 = -(MathHelper.func_1114_b(p_863_1_ * 0.6662F * 2.0F + 3.141593F) * 0.4F) * p_863_2_;
        float f5 = -(MathHelper.func_1114_b(p_863_1_ * 0.6662F * 2.0F + 1.570796F) * 0.4F) * p_863_2_;
        float f6 = -(MathHelper.func_1114_b(p_863_1_ * 0.6662F * 2.0F + 4.712389F) * 0.4F) * p_863_2_;
        float f7 = Math.abs(MathHelper.func_1106_a(p_863_1_ * 0.6662F + 0.0F) * 0.4F) * p_863_2_;
        float f8 = Math.abs(MathHelper.func_1106_a(p_863_1_ * 0.6662F + 3.141593F) * 0.4F) * p_863_2_;
        float f9 = Math.abs(MathHelper.func_1106_a(p_863_1_ * 0.6662F + 1.570796F) * 0.4F) * p_863_2_;
        float f10 = Math.abs(MathHelper.func_1106_a(p_863_1_ * 0.6662F + 4.712389F) * 0.4F) * p_863_2_;
        field_1252_d.field_1406_e += f3;
        field_1251_e.field_1406_e += -f3;
        field_1250_f.field_1406_e += f4;
        field_1249_g.field_1406_e += -f4;
        field_1248_h.field_1406_e += f5;
        field_1247_i.field_1406_e += -f5;
        field_1246_j.field_1406_e += f6;
        field_1245_m.field_1406_e += -f6;
        field_1252_d.field_1405_f += f7;
        field_1251_e.field_1405_f += -f7;
        field_1250_f.field_1405_f += f8;
        field_1249_g.field_1405_f += -f8;
        field_1248_h.field_1405_f += f9;
        field_1247_i.field_1405_f += -f9;
        field_1246_j.field_1405_f += f10;
        field_1245_m.field_1405_f += -f10;
    }
}
