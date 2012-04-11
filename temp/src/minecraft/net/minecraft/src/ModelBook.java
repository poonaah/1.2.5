// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, MathHelper, Entity

public class ModelBook extends ModelBase
{

    public ModelRenderer field_40330_a;
    public ModelRenderer field_40328_b;
    public ModelRenderer field_40329_c;
    public ModelRenderer field_40326_d;
    public ModelRenderer field_40327_e;
    public ModelRenderer field_40324_f;
    public ModelRenderer field_40325_g;

    public ModelBook()
    {
        field_40330_a = (new ModelRenderer(this)).func_40602_a(0, 0).func_40604_a(-6F, -5F, 0.0F, 6, 10, 0);
        field_40328_b = (new ModelRenderer(this)).func_40602_a(16, 0).func_40604_a(0.0F, -5F, 0.0F, 6, 10, 0);
        field_40325_g = (new ModelRenderer(this)).func_40602_a(12, 0).func_40604_a(-1F, -5F, 0.0F, 2, 10, 0);
        field_40329_c = (new ModelRenderer(this)).func_40602_a(0, 10).func_40604_a(0.0F, -4F, -0.99F, 5, 8, 1);
        field_40326_d = (new ModelRenderer(this)).func_40602_a(12, 10).func_40604_a(0.0F, -4F, -0.01F, 5, 8, 1);
        field_40327_e = (new ModelRenderer(this)).func_40602_a(24, 10).func_40604_a(0.0F, -4F, 0.0F, 5, 8, 0);
        field_40324_f = (new ModelRenderer(this)).func_40602_a(24, 10).func_40604_a(0.0F, -4F, 0.0F, 5, 8, 0);
        field_40330_a.func_925_a(0.0F, 0.0F, -1F);
        field_40328_b.func_925_a(0.0F, 0.0F, 1.0F);
        field_40325_g.field_1406_e = 1.570796F;
    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        func_863_a(p_864_2_, p_864_3_, p_864_4_, p_864_5_, p_864_6_, p_864_7_);
        field_40330_a.func_922_a(p_864_7_);
        field_40328_b.func_922_a(p_864_7_);
        field_40325_g.func_922_a(p_864_7_);
        field_40329_c.func_922_a(p_864_7_);
        field_40326_d.func_922_a(p_864_7_);
        field_40327_e.func_922_a(p_864_7_);
        field_40324_f.func_922_a(p_864_7_);
    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        float f = (MathHelper.func_1106_a(p_863_1_ * 0.02F) * 0.1F + 1.25F) * p_863_4_;
        field_40330_a.field_1406_e = 3.141593F + f;
        field_40328_b.field_1406_e = -f;
        field_40329_c.field_1406_e = f;
        field_40326_d.field_1406_e = -f;
        field_40327_e.field_1406_e = f - f * 2.0F * p_863_2_;
        field_40324_f.field_1406_e = f - f * 2.0F * p_863_3_;
        field_40329_c.field_1410_a = MathHelper.func_1106_a(f);
        field_40326_d.field_1410_a = MathHelper.func_1106_a(f);
        field_40327_e.field_1410_a = MathHelper.func_1106_a(f);
        field_40324_f.field_1410_a = MathHelper.func_1106_a(f);
    }
}
