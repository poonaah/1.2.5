// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            ModelBase, ModelRenderer, MathHelper, Entity

public class ModelBiped extends ModelBase
{

    public ModelRenderer field_1286_a;
    public ModelRenderer field_1285_b;
    public ModelRenderer field_1284_c;
    public ModelRenderer field_1283_d;
    public ModelRenderer field_1282_e;
    public ModelRenderer field_1281_f;
    public ModelRenderer field_1280_g;
    public ModelRenderer field_20098_h;
    public ModelRenderer field_20097_i;
    public int field_1279_h;
    public int field_1278_i;
    public boolean field_1277_j;
    public boolean field_40333_u;

    public ModelBiped()
    {
        this(0.0F);
    }

    public ModelBiped(float p_i678_1_)
    {
        this(p_i678_1_, 0.0F);
    }

    public ModelBiped(float p_i679_1_, float p_i679_2_)
    {
        field_1279_h = 0;
        field_1278_i = 0;
        field_1277_j = false;
        field_40333_u = false;
        field_20097_i = new ModelRenderer(this, 0, 0);
        field_20097_i.func_923_a(-5F, 0.0F, -1F, 10, 16, 1, p_i679_1_);
        field_20098_h = new ModelRenderer(this, 24, 0);
        field_20098_h.func_923_a(-3F, -6F, -1F, 6, 6, 1, p_i679_1_);
        field_1286_a = new ModelRenderer(this, 0, 0);
        field_1286_a.func_923_a(-4F, -8F, -4F, 8, 8, 8, p_i679_1_);
        field_1286_a.func_925_a(0.0F, 0.0F + p_i679_2_, 0.0F);
        field_1285_b = new ModelRenderer(this, 32, 0);
        field_1285_b.func_923_a(-4F, -8F, -4F, 8, 8, 8, p_i679_1_ + 0.5F);
        field_1285_b.func_925_a(0.0F, 0.0F + p_i679_2_, 0.0F);
        field_1284_c = new ModelRenderer(this, 16, 16);
        field_1284_c.func_923_a(-4F, 0.0F, -2F, 8, 12, 4, p_i679_1_);
        field_1284_c.func_925_a(0.0F, 0.0F + p_i679_2_, 0.0F);
        field_1283_d = new ModelRenderer(this, 40, 16);
        field_1283_d.func_923_a(-3F, -2F, -2F, 4, 12, 4, p_i679_1_);
        field_1283_d.func_925_a(-5F, 2.0F + p_i679_2_, 0.0F);
        field_1282_e = new ModelRenderer(this, 40, 16);
        field_1282_e.field_1404_g = true;
        field_1282_e.func_923_a(-1F, -2F, -2F, 4, 12, 4, p_i679_1_);
        field_1282_e.func_925_a(5F, 2.0F + p_i679_2_, 0.0F);
        field_1281_f = new ModelRenderer(this, 0, 16);
        field_1281_f.func_923_a(-2F, 0.0F, -2F, 4, 12, 4, p_i679_1_);
        field_1281_f.func_925_a(-2F, 12F + p_i679_2_, 0.0F);
        field_1280_g = new ModelRenderer(this, 0, 16);
        field_1280_g.field_1404_g = true;
        field_1280_g.func_923_a(-2F, 0.0F, -2F, 4, 12, 4, p_i679_1_);
        field_1280_g.func_925_a(2.0F, 12F + p_i679_2_, 0.0F);
    }

    public void func_864_b(Entity p_864_1_, float p_864_2_, float p_864_3_, float p_864_4_, float p_864_5_, float p_864_6_, float p_864_7_)
    {
        func_863_a(p_864_2_, p_864_3_, p_864_4_, p_864_5_, p_864_6_, p_864_7_);
        field_1286_a.func_922_a(p_864_7_);
        field_1284_c.func_922_a(p_864_7_);
        field_1283_d.func_922_a(p_864_7_);
        field_1282_e.func_922_a(p_864_7_);
        field_1281_f.func_922_a(p_864_7_);
        field_1280_g.func_922_a(p_864_7_);
        field_1285_b.func_922_a(p_864_7_);
    }

    public void func_863_a(float p_863_1_, float p_863_2_, float p_863_3_, float p_863_4_, float p_863_5_, float p_863_6_)
    {
        field_1286_a.field_1406_e = p_863_4_ / 57.29578F;
        field_1286_a.field_1407_d = p_863_5_ / 57.29578F;
        field_1285_b.field_1406_e = field_1286_a.field_1406_e;
        field_1285_b.field_1407_d = field_1286_a.field_1407_d;
        field_1283_d.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F + 3.141593F) * 2.0F * p_863_2_ * 0.5F;
        field_1282_e.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F) * 2.0F * p_863_2_ * 0.5F;
        field_1283_d.field_1405_f = 0.0F;
        field_1282_e.field_1405_f = 0.0F;
        field_1281_f.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F) * 1.4F * p_863_2_;
        field_1280_g.field_1407_d = MathHelper.func_1114_b(p_863_1_ * 0.6662F + 3.141593F) * 1.4F * p_863_2_;
        field_1281_f.field_1406_e = 0.0F;
        field_1280_g.field_1406_e = 0.0F;
        if(field_1243_l)
        {
            field_1283_d.field_1407_d += -0.6283185F;
            field_1282_e.field_1407_d += -0.6283185F;
            field_1281_f.field_1407_d = -1.256637F;
            field_1280_g.field_1407_d = -1.256637F;
            field_1281_f.field_1406_e = 0.3141593F;
            field_1280_g.field_1406_e = -0.3141593F;
        }
        if(field_1279_h != 0)
        {
            field_1282_e.field_1407_d = field_1282_e.field_1407_d * 0.5F - 0.3141593F * (float)field_1279_h;
        }
        if(field_1278_i != 0)
        {
            field_1283_d.field_1407_d = field_1283_d.field_1407_d * 0.5F - 0.3141593F * (float)field_1278_i;
        }
        field_1283_d.field_1406_e = 0.0F;
        field_1282_e.field_1406_e = 0.0F;
        if(field_1244_k > -9990F)
        {
            float f = field_1244_k;
            field_1284_c.field_1406_e = MathHelper.func_1106_a(MathHelper.func_1113_c(f) * 3.141593F * 2.0F) * 0.2F;
            field_1283_d.field_1408_c = MathHelper.func_1106_a(field_1284_c.field_1406_e) * 5F;
            field_1283_d.field_1410_a = -MathHelper.func_1114_b(field_1284_c.field_1406_e) * 5F;
            field_1282_e.field_1408_c = -MathHelper.func_1106_a(field_1284_c.field_1406_e) * 5F;
            field_1282_e.field_1410_a = MathHelper.func_1114_b(field_1284_c.field_1406_e) * 5F;
            field_1283_d.field_1406_e += field_1284_c.field_1406_e;
            field_1282_e.field_1406_e += field_1284_c.field_1406_e;
            field_1282_e.field_1407_d += field_1284_c.field_1406_e;
            f = 1.0F - field_1244_k;
            f *= f;
            f *= f;
            f = 1.0F - f;
            float f2 = MathHelper.func_1106_a(f * 3.141593F);
            float f4 = MathHelper.func_1106_a(field_1244_k * 3.141593F) * -(field_1286_a.field_1407_d - 0.7F) * 0.75F;
            field_1283_d.field_1407_d -= (double)f2 * 1.2D + (double)f4;
            field_1283_d.field_1406_e += field_1284_c.field_1406_e * 2.0F;
            field_1283_d.field_1405_f = MathHelper.func_1106_a(field_1244_k * 3.141593F) * -0.4F;
        }
        if(field_1277_j)
        {
            field_1284_c.field_1407_d = 0.5F;
            field_1283_d.field_1407_d += 0.4F;
            field_1282_e.field_1407_d += 0.4F;
            field_1281_f.field_1408_c = 4F;
            field_1280_g.field_1408_c = 4F;
            field_1281_f.field_1409_b = 9F;
            field_1280_g.field_1409_b = 9F;
            field_1286_a.field_1409_b = 1.0F;
        } else
        {
            field_1284_c.field_1407_d = 0.0F;
            field_1281_f.field_1408_c = 0.0F;
            field_1280_g.field_1408_c = 0.0F;
            field_1281_f.field_1409_b = 12F;
            field_1280_g.field_1409_b = 12F;
            field_1286_a.field_1409_b = 0.0F;
        }
        field_1283_d.field_1405_f += MathHelper.func_1114_b(p_863_3_ * 0.09F) * 0.05F + 0.05F;
        field_1282_e.field_1405_f -= MathHelper.func_1114_b(p_863_3_ * 0.09F) * 0.05F + 0.05F;
        field_1283_d.field_1407_d += MathHelper.func_1106_a(p_863_3_ * 0.067F) * 0.05F;
        field_1282_e.field_1407_d -= MathHelper.func_1106_a(p_863_3_ * 0.067F) * 0.05F;
        if(field_40333_u)
        {
            float f1 = 0.0F;
            float f3 = 0.0F;
            field_1283_d.field_1405_f = 0.0F;
            field_1282_e.field_1405_f = 0.0F;
            field_1283_d.field_1406_e = -(0.1F - f1 * 0.6F) + field_1286_a.field_1406_e;
            field_1282_e.field_1406_e = (0.1F - f1 * 0.6F) + field_1286_a.field_1406_e + 0.4F;
            field_1283_d.field_1407_d = -1.570796F + field_1286_a.field_1407_d;
            field_1282_e.field_1407_d = -1.570796F + field_1286_a.field_1407_d;
            field_1283_d.field_1407_d -= f1 * 1.2F - f3 * 0.4F;
            field_1282_e.field_1407_d -= f1 * 1.2F - f3 * 0.4F;
            field_1283_d.field_1405_f += MathHelper.func_1114_b(p_863_3_ * 0.09F) * 0.05F + 0.05F;
            field_1282_e.field_1405_f -= MathHelper.func_1114_b(p_863_3_ * 0.09F) * 0.05F + 0.05F;
            field_1283_d.field_1407_d += MathHelper.func_1106_a(p_863_3_ * 0.067F) * 0.05F;
            field_1282_e.field_1407_d -= MathHelper.func_1106_a(p_863_3_ * 0.067F) * 0.05F;
        }
    }

    public void func_20095_a(float p_20095_1_)
    {
        field_20098_h.field_1406_e = field_1286_a.field_1406_e;
        field_20098_h.field_1407_d = field_1286_a.field_1407_d;
        field_20098_h.field_1410_a = 0.0F;
        field_20098_h.field_1409_b = 0.0F;
        field_20098_h.func_922_a(p_20095_1_);
    }

    public void func_20096_b(float p_20096_1_)
    {
        field_20097_i.func_922_a(p_20096_1_);
    }
}
